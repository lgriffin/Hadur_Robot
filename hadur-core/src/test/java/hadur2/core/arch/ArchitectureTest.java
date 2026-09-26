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
    @DisplayName("gun and movement are independent of each other")
    void gunAndMoveIndependent() {
        slices().matching("hadur2.core.(gun|move)..").should().notDependOnEachOther().check(core);
    }
}
