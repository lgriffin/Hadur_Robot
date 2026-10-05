package hadur2.core.arch;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.tngtech.archunit.core.domain.JavaClasses;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * The architecture evolution's guardrails (A0): one owner per package, owners layered, and
 * every owner's sources pinned. Overlap is prevented by the build, not by agreement.
 *
 * <ul>
 * <li>STRAND-1: {@code ownership.txt} names exactly one owner for every package of the
 *     core: the kernel, a strand (duel, melee, team) or the conductor.</li>
 * <li>STRAND-2: kernel under strands under conductor. No strand's package depends on
 *     another strand's or on the conductor's, and no kernel package on either.</li>
 * <li>STRAND-3: each owner's sources are pinned by hash in {@code pins/<owner>.sha256}. A
 *     change re-pins only the owners its stage names, with
 *     {@code -Dhadur.pin=owner[,owner...]}; the pull request says which, and the build
 *     shows which pins moved.</li>
 * </ul>
 *
 * <p>{@link DuelIdentityTest} stays beside these: it pins the nine packages the evolution
 * may not edit at all.</p>
 */
public class StrandOwnershipTest {

    public static final List<String> OWNERS = List.of("kernel", "duel", "melee", "team", "conductor");
    static final List<String> STRANDS = List.of("duel", "melee", "team");
    static final String ROOT = "hadur2.core";

    static final JavaClasses core = ArchitectureTest.core;

    /** Package to owner, in the map's order. */
    public static Map<String, String> map() {
        Map<String, String> out = new LinkedHashMap<>();
        Path file = DuelIdentityTest.moduleDir().resolve("src/test/resources/ownership.txt");
        try {
            for (String line : Files.readAllLines(file, StandardCharsets.UTF_8)) {
                line = line.trim();
                if (line.isEmpty() || line.startsWith("#")) continue;
                String[] parts = line.split("\\|");
                String pkg = parts[0].trim();
                String owner = parts[1].trim();
                if (out.put(pkg, owner) != null) throw new IllegalStateException(pkg + " is listed twice");
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        return out;
    }

    /** Every package with a source file under {@code hadur2/core}, by name. */
    static Set<String> packagesInTree() {
        Path root = DuelIdentityTest.sourceRoot();
        Set<String> out = new TreeSet<>();
        try (Stream<Path> files = Files.walk(root.resolve("hadur2/core"))) {
            for (Path f : (Iterable<Path>) files::iterator) {
                if (!f.toString().endsWith(".java")) continue;
                out.add(root.relativize(f.getParent()).toString().replace('\\', '/').replace('/', '.'));
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        return out;
    }

    static List<String> packagesOf(String owner) {
        List<String> out = new ArrayList<>();
        map().forEach((p, o) -> { if (o.equals(owner)) out.add(p); });
        return out;
    }

    @Test
    @Tag("STRAND-1")
    @DisplayName("STRAND-1: every package of the core has exactly one owner")
    public void everyPackageHasOneOwner() {
        Map<String, String> map = map();
        Set<String> tree = packagesInTree();
        List<String> wrong = new ArrayList<>();
        for (String p : tree) if (!map.containsKey(p)) wrong.add("no owner: " + p);
        for (String p : map.keySet()) if (!tree.contains(p)) wrong.add("listed but gone: " + p);
        map.forEach((p, o) -> { if (!OWNERS.contains(o)) wrong.add("unknown owner " + o + " for " + p); });
        assertTrue(wrong.isEmpty(), String.join("; ", wrong));
    }

    @Test
    @Tag("STRAND-2")
    @DisplayName("STRAND-2: no strand depends on another strand or on the conductor")
    public void strandsStayApart() {
        for (String strand : STRANDS) {
            String[] mine = patterns(packagesOf(strand));
            if (mine.length == 0) continue;
            List<String> forbidden = new ArrayList<>(packagesOf("conductor"));
            for (String other : STRANDS) if (!other.equals(strand)) forbidden.addAll(packagesOf(other));
            String[] theirs = patterns(forbidden);
            if (theirs.length == 0) continue;
            noClasses().that().resideInAnyPackage(mine)
                .should().dependOnClassesThat().resideInAnyPackage(theirs)
                .because("the " + strand + " strand sees only the kernel and itself")
                .check(core);
        }
    }

    @Test
    @Tag("STRAND-2")
    @DisplayName("STRAND-2: the kernel depends on no strand and not on the conductor")
    public void kernelIsUnderneath() {
        List<String> above = new ArrayList<>(packagesOf("conductor"));
        for (String strand : STRANDS) above.addAll(packagesOf(strand));
        noClasses().that().resideInAnyPackage(patterns(packagesOf("kernel")))
            .should().dependOnClassesThat().resideInAnyPackage(patterns(above))
            .because("the kernel is what every strand shares, so it can know none of them")
            .check(core);
    }

    static Stream<String> owners() {
        return OWNERS.stream();
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("owners")
    @Tag("STRAND-3")
    @DisplayName("STRAND-3: each owner's sources match its pin")
    public void ownerSourcesMatchPin(String owner) throws IOException {
        Map<String, String> now = hashes(owner);
        Path pin = DuelIdentityTest.moduleDir().resolve("src/test/resources/pins/" + owner + ".sha256");
        String write = System.getProperty("hadur.pin", "");
        if (List.of(write.split(",")).contains(owner)) {
            StringBuilder b = new StringBuilder();
            now.forEach((file, hash) -> b.append(hash).append("  ").append(file).append('\n'));
            Files.writeString(pin, b, StandardCharsets.UTF_8);
        }
        Map<String, String> pinned = Files.exists(pin) ? DuelIdentityTest.read(pin) : Map.of();
        List<String> changed = new ArrayList<>();
        for (String file : pinned.keySet()) {
            if (!now.containsKey(file)) changed.add("removed " + file);
            else if (!now.get(file).equals(pinned.get(file))) changed.add("edited " + file);
        }
        for (String file : now.keySet()) {
            if (!pinned.containsKey(file)) changed.add("added " + file);
        }
        assertTrue(changed.isEmpty(), "The " + owner + " changed without a re-pin: " + changed);
        assertEquals(pinned.size(), now.size());
    }

    /** Every source file of {@code owner}'s packages, by path, with its hash. */
    static Map<String, String> hashes(String owner) throws IOException {
        Path root = DuelIdentityTest.sourceRoot();
        Map<String, String> out = new TreeMap<>();
        for (String pkg : packagesOf(owner)) {
            Path dir = root.resolve(pkg.replace('.', '/'));
            try (Stream<Path> files = Files.list(dir)) {
                for (Path f : (Iterable<Path>) files::iterator) {
                    if (!f.toString().endsWith(".java")) continue;
                    String rel = root.relativize(f).toString().replace('\\', '/');
                    out.put(rel, DuelIdentityTest.sha256(Files.readString(f, StandardCharsets.UTF_8)
                        .replace("\r\n", "\n")));
                }
            }
        }
        return out;
    }

    /** ArchUnit package patterns: the root package exactly, any other with its subpackages. */
    static String[] patterns(List<String> packages) {
        return packages.stream().map(p -> p.equals(ROOT) ? ROOT : p + "..").toArray(String[]::new);
    }
}
