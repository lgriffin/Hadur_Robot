package hadurling.core.memory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadurling.core.port.MemoryProfileStore;
import java.util.List;
import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.Combinators;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
import net.jqwik.api.Tag;

/**
 * Fault injection: the robot can be killed at any moment, so kill it at every moment. A save
 * is two writes (the copy, then the profile). The property arms the in-memory store to cut
 * either write at any byte, then starts a fresh library on the same store, as the next battle
 * would, and demands a profile that is either the old one or the new one. Never a mixture,
 * never garbage, never an exception.
 */
class ProfileLibraryProperties {

    @Provide
    Arbitrary<Profile> profiles() {
        Arbitrary<List<float[]>> seed = Arbitraries.floats().between(-1f, 1f).list().ofSize(3)
            .map(l -> new float[] {l.get(0), l.get(1), l.get(2)}).list().ofMaxSize(20);
        return Combinators.combine(Arbitraries.integers().between(0, 500), Arbitraries.integers().between(0, 500), seed)
            .as((rounds, shots, s) -> new Profile("a.Foe", rounds, shots, shots / 4, shots, shots / 2, s));
    }

    @Property
    @Tag("HL-20")
    void aSaveKilledAnywhereLeavesTheOldOrTheNewProfile(@ForAll("profiles") Profile before,
            @ForAll("profiles") Profile after, @ForAll("whichWrite") int nth,
            @ForAll("cutAt") double fraction) {
        MemoryProfileStore store = new MemoryProfileStore(1_000_000);
        assertTrue(new ProfileLibrary(store).save(before));

        int newSize = ProfileCodec.encode(after).length;
        store.crashOnWrite(nth, (int) (fraction * newSize));
        new ProfileLibrary(store).save(after); // may be cut short: it reports false and does not throw

        Profile loaded = new ProfileLibrary(store).load("a.Foe");
        assertTrue(loaded.equals(before) || loaded.equals(after),
            "loaded " + loaded + " after a save killed in write " + nth + " at " + fraction);
    }

    @Property
    @Tag("HL-20")
    void aSaveKilledBeforeAnyProfileExistedLeavesAStrangerOrTheNewProfile(
            @ForAll("profiles") Profile after, @ForAll("whichWrite") int nth, @ForAll("cutAt") double fraction) {
        MemoryProfileStore store = new MemoryProfileStore(1_000_000);
        store.crashOnWrite(nth, (int) (fraction * ProfileCodec.encode(after).length));
        new ProfileLibrary(store).save(after);
        Profile loaded = new ProfileLibrary(store).load("a.Foe");
        assertTrue(loaded.equals(after) || loaded.equals(Profile.stranger("a.Foe")), "loaded " + loaded);
    }

    /** Write 1 is the temporary copy, write 2 the profile itself. */
    @Provide
    Arbitrary<Integer> whichWrite() {
        return Arbitraries.of(1, 2);
    }

    @Provide
    Arbitrary<Double> cutAt() {
        return Arbitraries.doubles().between(0, 1);
    }

    // ---- Lab 13: the indexed library must forget exactly what the plain one forgot ----------

    /** What lab 10's {@code makeRoom} did, kept as the obviously-right model: list everything, every time. */
    private static boolean naiveSave(MemoryProfileStore store, Profile profile) {
        try {
            byte[] bytes = ProfileCodec.encode(profile);
            String own = ProfileLibrary.fileFor(profile.key());
            java.util.List<String> names = store.names();
            long others = 0;
            for (String name : names) {
                if (!name.equals(own) && !name.equals(own + ProfileLibrary.TMP_SUFFIX)) others += store.size(name);
            }
            while (others + 2L * bytes.length > store.quota()) {
                String oldest = null;
                for (String name : names) {
                    if (name.equals(own) || name.equals(own + ProfileLibrary.TMP_SUFFIX)) continue;
                    if (oldest == null || store.lastModified(name) < store.lastModified(oldest)) oldest = name;
                }
                if (oldest == null) throw new IllegalStateException("does not fit");
                others -= store.size(oldest);
                store.delete(oldest);
                names.remove(oldest);
            }
            store.write(own + ProfileLibrary.TMP_SUFFIX, bytes);
            store.write(own, bytes);
            store.delete(own + ProfileLibrary.TMP_SUFFIX);
            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }

    @Provide
    Arbitrary<List<Profile>> saves() {
        Arbitrary<Profile> profile = Combinators.combine(Arbitraries.integers().between(0, 11), Arbitraries.integers().between(0, 25))
            .as((who, seeds) -> new Profile("bot.Number" + who, 1, 0, 0, 0, 0,
                java.util.Collections.nCopies(seeds, new float[] {0.1f, 0.2f, 0.3f})));
        return profile.list().ofMinSize(1).ofMaxSize(40);
    }

    @Property
    @Tag("HL-41")
    void theIndexedLibraryForgetsWhatThePlainOneForgot(@ForAll("saves") List<Profile> saves,
            @ForAll("quotas") int quota) {
        MemoryProfileStore plain = new MemoryProfileStore(quota);
        MemoryProfileStore indexed = new MemoryProfileStore(quota);
        ProfileLibrary library = new ProfileLibrary(indexed);
        for (Profile p : saves) {
            boolean a = naiveSave(plain, p);
            boolean b = library.save(p);
            assertEquals(a, b, "save of " + p + " differed");
            assertEquals(plain.names(), indexed.names(), "after saving " + p);
        }
    }

    @Provide
    Arbitrary<Integer> quotas() {
        return Arbitraries.integers().between(300, 4000);
    }
}
