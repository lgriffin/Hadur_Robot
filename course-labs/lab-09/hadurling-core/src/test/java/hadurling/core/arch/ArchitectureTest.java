package hadurling.core.arch;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * The hexagon, enforced by the build. These rules read the compiled core and fail if anyone,
 * on a tired Friday, imports something the design forbids. A rule nobody checks is a wish.
 */
class ArchitectureTest {

    private static final String CORE = "hadurling.core..";

    private static final JavaClasses core = new ClassFileImporter()
        .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
        .importPackages("hadurling.core");

    @Test

    @Tag("HL-1")
    @DisplayName("the core does not depend on robocode.*")
    void noRobocode() {
        noClasses().that().resideInAPackage(CORE)
            .should().dependOnClassesThat().resideInAnyPackage("robocode..", "net.sf.robocode..")
            .check(core);
    }

    @Test
    @DisplayName("no unseeded randomness: the same input must give the same orders")
    void noRandomness() {
        noClasses().that().resideInAPackage(CORE)
            .should().callMethod(Math.class, "random")
            .orShould().dependOnClassesThat().haveFullyQualifiedName("java.util.Random")
            .orShould().dependOnClassesThat().haveFullyQualifiedName("java.util.concurrent.ThreadLocalRandom")
            .check(core);
    }

    @Test
    @DisplayName("no threads: the core runs inside the engine's tick")
    void noThreads() {
        noClasses().that().resideInAPackage(CORE)
            .should().dependOnClassesThat().areAssignableTo(Thread.class)
            .orShould().dependOnClassesThat().resideInAPackage("java.util.concurrent..")
            .check(core);
    }

    @Test
    @DisplayName("no file or network I/O: the adapter does that")
    void noIo() {
        noClasses().that().resideInAPackage(CORE)
            .should().dependOnClassesThat().resideInAnyPackage("java.io..", "java.nio..", "java.net..")
            .check(core);
    }

    @Test
    @DisplayName("no clock: time comes in on the Input")
    void noClock() {
        noClasses().that().resideInAPackage(CORE)
            .should().callMethod(System.class, "currentTimeMillis")
            .orShould().callMethod(System.class, "nanoTime")
            .check(core);
    }

    @Test
    @DisplayName("the model and the physics do not depend on the gun or the movement")
    void layering() {
        noClasses().that().resideInAnyPackage("hadurling.core.model..", "hadurling.core.physics..")
            .should().dependOnClassesThat().resideInAnyPackage("hadurling.core.gun..", "hadurling.core.move..")
            .check(core);
    }

    @Test
    @DisplayName("the gun and the movement do not depend on each other")
    void gunAndMoveAreIndependent() {
        noClasses().that().resideInAPackage("hadurling.core.gun..")
            .should().dependOnClassesThat().resideInAPackage("hadurling.core.move..")
            .check(core);
        noClasses().that().resideInAPackage("hadurling.core.move..")
            .should().dependOnClassesThat().resideInAPackage("hadurling.core.gun..")
            .check(core);
    }

    @Test
    @DisplayName("knn is a leaf: it depends on nothing of Hadurling's")
    void knnIsALeaf() {
        classes().that().resideInAPackage("hadurling.core.knn..")
            .should().onlyDependOnClassesThat().resideInAnyPackage("hadurling.core.knn..", "java..")
            .check(core);
    }

    @Test
    @DisplayName("only the gun uses the tree, and the model and physics know nothing of it")
    void onlyTheGunUsesKnn() {
        noClasses().that().resideOutsideOfPackages("hadurling.core.knn..", "hadurling.core.gun..")
            .should().dependOnClassesThat().resideInAPackage("hadurling.core.knn..")
            .check(core);
    }

    @Test
    @DisplayName("the ledger depends only on the engine's rules and the values")
    void ledgerIsALeaf() {
        classes().that().resideInAPackage("hadurling.core.ledger..")
            .should().onlyDependOnClassesThat().resideInAnyPackage(
                "hadurling.core.ledger..", "hadurling.core.physics..", "hadurling.core.model..", "java..")
            .check(core);
    }

    @Test
    @DisplayName("only the core reads the ledger: no gun, movement, model or physics depends on it")
    void nothingBelowTheCoreUsesTheLedger() {
        noClasses().that().resideInAnyPackage("hadurling.core.gun..", "hadurling.core.move..",
                "hadurling.core.model..", "hadurling.core.physics..", "hadurling.core.knn..")
            .should().dependOnClassesThat().resideInAPackage("hadurling.core.ledger..")
            .check(core);
    }
}
