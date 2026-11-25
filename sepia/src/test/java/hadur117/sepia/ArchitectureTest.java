package hadur117.sepia;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** SEPIA-1: the brain is pure, and Sepia reads Hadur's kernel without touching Hadur's play. */
class ArchitectureTest {

    static final JavaClasses CLASSES = new ClassFileImporter()
        .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
        .importPackages("hadur117.sepia", "hadur117");

    @Test
    @Tag("SEPIA-1")
    @DisplayName("the brain never imports Robocode")
    void brainIsPure() {
        noClasses().that().resideInAPackage("hadur117.sepia..")
            .should().dependOnClassesThat().resideInAnyPackage("robocode..")
            .check(CLASSES);
    }

    @Test
    @Tag("SEPIA-1")
    @DisplayName("nothing of Hadur's conductor, strands' brains, guns, policies or mode table is used")
    void hadurUntouched() {
        noClasses().that().resideInAnyPackage("hadur117.sepia..")
            .should().dependOnClassesThat().resideInAnyPackage("hadur117.core", "hadur117.core.duel..",
                "hadur117.core.melee..", "hadur117.core.role..", "hadur117.core.gun..", "hadur117.core.policy..",
                "hadur117.core.shieldmode..", "hadur117.core.adapt..", "hadur117.core.memory..", "hadur117.core.replay..")
            .check(CLASSES);
    }

    @Test
    @Tag("SEPIA-1")
    @DisplayName("from Hadur's move package only the shadow geometry is used")
    void onlyShadowGeometryFromMove() {
        noClasses().that().resideInAnyPackage("hadur117.sepia..")
            .should().dependOnClassesThat(com.tngtech.archunit.base.DescribedPredicate.describe(
                "a class of hadur117.core.move other than BulletShadows and OurBullet",
                c -> c.getPackageName().equals("hadur117.core.move")
                    && !c.getSimpleName().startsWith("BulletShadows") && !c.getSimpleName().equals("OurBullet")))
            .check(CLASSES);
    }
}
