package hadur2.core.arch;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.fields;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;
import static com.tngtech.archunit.library.dependencies.SlicesRuleDefinition.slices;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * The hexagonal boundary, checked on the compiled core. The core is everything in
 * {@code hadur2.core}; the Robocode adapter lives in another module and is the only
 * place allowed to see the engine.
 */
public class ArchitectureTest {

    static final String CORE = "hadur2.core..";
    static JavaClasses core = importCore();

    static JavaClasses importCore() {
        return new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("hadur2.core");
    }

    @Test
    @Tag("CORE-1")
    @DisplayName("CORE-1: the core does not depend on robocode.*")
    void coreHasNoRobocode() {
        noClasses().that().resideInAPackage(CORE)
            .should().dependOnClassesThat().resideInAnyPackage("robocode..", "net.sf.robocode..")
            .check(core);
    }

    @Test
    @Tag("CORE-1")
    @DisplayName("CORE-1: the core only uses the JDK and itself")
    void coreOnlyUsesJdk() {
        noClasses().that().resideInAPackage(CORE)
            .should().dependOnClassesThat().resideOutsideOfPackages(
                "hadur2.core..", "java.lang..", "java.util..", "java.awt.geom..")
            .check(core);
    }

    @Test
    @Tag("RES-6")
    @DisplayName("RES-6: no unseeded randomness")
    public void noRandomness() {
        ArchRule rule = noClasses().that().resideInAPackage(CORE)
            .should().callMethod(Math.class, "random")
            .orShould().callMethod(StrictMath.class, "random")
            .orShould().dependOnClassesThat().haveFullyQualifiedName("java.util.Random")
            .orShould().dependOnClassesThat().haveFullyQualifiedName("java.security.SecureRandom")
            .orShould().dependOnClassesThat().haveFullyQualifiedName(
                "java.util.concurrent.ThreadLocalRandom")
            .orShould().dependOnClassesThat().haveFullyQualifiedName("java.util.SplittableRandom")
            .orShould().dependOnClassesThat().haveFullyQualifiedName("java.util.UUID");
        rule.check(core);
    }

    @Test
    @Tag("RES-6")
    @DisplayName("RES-6: no threads or concurrency")
    public void noThreads() {
        noClasses().that().resideInAPackage(CORE)
            .should().dependOnClassesThat().areAssignableTo(Thread.class)
            .orShould().dependOnClassesThat().resideInAPackage("java.util.concurrent..")
            .orShould().callMethod(Object.class, "wait")
            .orShould().callMethod(Object.class, "notify")
            .orShould().callMethod(Object.class, "notifyAll")
            .check(core);
    }

    @Test
    @Tag("RES-6")
    @DisplayName("RES-6: no reflection")
    public void noReflection() {
        noClasses().that().resideInAPackage(CORE)
            .should().dependOnClassesThat().resideInAPackage("java.lang.reflect..")
            .orShould().callMethod(Class.class, "forName", String.class)
            .check(core);
    }

    @Test
    @Tag("RES-6")
    @DisplayName("RES-6: no file or other I/O, and no clock")
    public void noIo() {
        noClasses().that().resideInAPackage(CORE)
            .should().dependOnClassesThat().resideInAnyPackage("java.io..", "java.nio..",
                "java.net..", "java.sql..", "java.time..")
            .orShould().callMethod(System.class, "currentTimeMillis")
            .orShould().callMethod(System.class, "nanoTime")
            .orShould().callMethod(System.class, "getProperty", String.class)
            .orShould().callMethod(System.class, "getenv", String.class)
            .orShould().accessField(System.class, "out")
            .orShould().accessField(System.class, "err")
            .check(core);
    }

    @Test
    @Tag("CORE-2")
    @DisplayName("CORE-2: no mutable static state, so two cores never share anything")
    public void noMutableStatics() {
        fields().that().areDeclaredInClassesThat().resideInAPackage(CORE)
            .and().areStatic()
            .should().beFinal()
            .check(core);
    }

    @Test
    @DisplayName("ports and the model do not depend on strategy packages")
    void layering() {
        noClasses().that().resideInAnyPackage("hadur2.core.model..", "hadur2.core.physics..",
                "hadur2.core.port..")
            .should().dependOnClassesThat().resideInAnyPackage("hadur2.core.gun..",
                "hadur2.core.move..", "hadur2.core.replay..")
            .check(core);
        noClasses().that().resideInAPackage("hadur2.core.physics..")
            .should().dependOnClassesThat().resideInAnyPackage("hadur2.core.knn..")
            .check(core);
    }

    @Test
    @DisplayName("the energy ledger is pure bookkeeping on the engine's rules")
    void ledgerIsLeaf() {
        // WAVE-1: the ledger explains energy with the engine's rules alone, so gun,
        // movement or the core's other state can't leak into which drops become waves.
        noClasses().that().resideInAPackage("hadur2.core.ledger..")
            .should().dependOnClassesThat().resideOutsideOfPackages("hadur2.core.ledger..",
                "hadur2.core.physics..", "java..")
            .check(core);
    }

    @Test
    @Tag("MEM-3")
    @DisplayName("MEM-3: opponent memory is a leaf that reaches storage only through the port")
    void memoryIsLeaf() {
        // The core observes and the memory records: memory never steers gun or movement
        // itself (the adapt package reads it for them), and it touches storage only through
        // ProfileStore, so it stays testable in memory.
        noClasses().that().resideInAPackage("hadur2.core.memory..")
            .should().dependOnClassesThat().resideOutsideOfPackages("hadur2.core.memory..",
                "hadur2.core.port..", "java..")
            .check(core);
        noClasses().that().resideInAnyPackage("hadur2.core.gun..", "hadur2.core.move..",
                "hadur2.core.knn..", "hadur2.core.ledger..", "hadur2.core.melee..",
                "hadur2.core.physics..", "hadur2.core.model..")
            .should().dependOnClassesThat().resideInAPackage("hadur2.core.memory..")
            .check(core);
    }

    @Test
    @Tag("DIAL-2")
    @DisplayName("DIAL-2: the opening book sees profiles, never ticks or rounds")
    void adaptSeesNoClock() {
        // The book and the seed trust can only condition on evidence: they depend on memory
        // and the model's seed weight, never on BotInput or BotEvent, where time lives.
        noClasses().that().resideInAPackage("hadur2.core.adapt..")
            .should().dependOnClassesThat().resideOutsideOfPackages("hadur2.core.adapt..",
                "hadur2.core.memory..", "hadur2.core.model..", "java..")
            .check(core);
        noClasses().that().resideInAPackage("hadur2.core.adapt..")
            .should().dependOnClassesThat().haveNameMatching("hadur2\\.core\\.model\\.Bot(Input|Event)(\\$.*)?")
            .check(core);
        // Gun and movement take the book's decisions through their own setters.
        noClasses().that().resideInAnyPackage("hadur2.core.gun..", "hadur2.core.move..",
                "hadur2.core.knn..", "hadur2.core.ledger..", "hadur2.core.melee..",
                "hadur2.core.physics..", "hadur2.core.model..", "hadur2.core.memory..")
            .should().dependOnClassesThat().resideInAPackage("hadur2.core.adapt..")
            .check(core);
    }

    @Test
    @DisplayName("gun and movement are independent of each other")
    void gunAndMoveIndependent() {
        slices().matching("hadur2.core.(gun|move)..").should().notDependOnEachOther().check(core);
    }

    @Test
    @Tag("GATE-1")
    @DisplayName("GATE-1: melee is a separate brain beside the duel's gun and movement")
    void meleeIsSeparateFromDuel() {
        // The melee brain runs instead of the duel subsystems, so it needs only the model and
        // the engine's physics; and the duel code must not reach into it.
        noClasses().that().resideInAPackage("hadur2.core.melee..")
            .should().dependOnClassesThat().resideOutsideOfPackages("hadur2.core.melee..",
                "hadur2.core.physics..", "hadur2.core.model..", "java..")
            .check(core);
        noClasses().that().resideInAnyPackage("hadur2.core.gun..", "hadur2.core.move..",
                "hadur2.core.knn..", "hadur2.core.ledger..", "hadur2.core.model..",
                "hadur2.core.physics..")
            .should().dependOnClassesThat().resideInAPackage("hadur2.core.melee..")
            .check(core);
    }

    @Test
    @Tag("GATE-1")
    @DisplayName("GATE-1: the posture gate is a leaf that only the orchestrator sees")
    void postureIsALeaf() {
        // The gate decides from counts and events alone, so it cannot lean on the duel's or
        // the melee's state; and neither brain can see which posture is on, so each runs the
        // same whether or not the other exists.
        noClasses().that().resideInAPackage("hadur2.core.posture..")
            .should().dependOnClassesThat().resideOutsideOfPackages("hadur2.core.posture..",
                "hadur2.core.model..", "hadur2.core.physics..", "java..")
            .check(core);
        noClasses().that().resideInAnyPackage("hadur2.core.gun..", "hadur2.core.move..",
                "hadur2.core.knn..", "hadur2.core.ledger..", "hadur2.core.melee..",
                "hadur2.core.physics..", "hadur2.core.model..", "hadur2.core.memory..",
                "hadur2.core.adapt..", "hadur2.core.policy..", "hadur2.core.shield..")
            .should().dependOnClassesThat().resideInAPackage("hadur2.core.posture..")
            .check(core);
    }

    @Test
    @Tag("DIAL-2")
    @DisplayName("DIAL-2: the S5 policies see evidence, never ticks or rounds, and steer only through the core")
    void policiesSeeNoClock() {
        // DistancePolicy, PowerPolicy and Endgame read estimates, energies and gun heats. They
        // cannot see BotInput or BotEvent, where time and the round number live.
        noClasses().that().resideInAPackage("hadur2.core.policy..")
            .should().dependOnClassesThat().resideOutsideOfPackages("hadur2.core.policy..",
                "hadur2.core.memory..", "hadur2.core.physics..", "java..")
            .check(core);
        // Gun and movement take the policies' decisions through their own setters.
        noClasses().that().resideInAnyPackage("hadur2.core.gun..", "hadur2.core.move..",
                "hadur2.core.knn..", "hadur2.core.ledger..", "hadur2.core.melee..",
                "hadur2.core.physics..", "hadur2.core.model..", "hadur2.core.memory..",
                "hadur2.core.adapt..")
            .should().dependOnClassesThat().resideInAPackage("hadur2.core.policy..")
            .check(core);
    }
}
