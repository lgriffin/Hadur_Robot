package hadur117.micro;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.base.DescribedPredicate;
import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** The hexagon's walls, as rules on the compiled classes (SAOR-2). */
class ArchitectureTest {

    static final JavaClasses CLASSES = new ClassFileImporter()
        .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
        .importPackages("hadur117.micro");

    @Test
    @Tag("SAOR-2")
    @DisplayName("the core imports nothing from the engine")
    void coreIsFreeOfRobocode() {
        noClasses().that().resideInAPackage("hadur117.micro.core..")
            .should().dependOnClassesThat().resideInAPackage("robocode..")
            .check(CLASSES);
    }

    @Test
    @Tag("SAOR-2")
    @DisplayName("the core depends on the JDK's maths and geometry only")
    void coreDependsOnTheJdkOnly() {
        classes().that().resideInAPackage("hadur117.micro.core..")
            .should().onlyDependOnClassesThat().resideInAnyPackage("hadur117.micro.core..", "java.lang..", "java.awt.geom..", "java.util..")
            .check(CLASSES);
    }

    @Test
    @Tag("SAOR-2")
    @DisplayName("the core is pure statics: final classes, no instance state")
    void coreIsPureStatics() {
        classes().that().resideInAPackage("hadur117.micro.core..")
            .should().haveOnlyFinalFields()
            .andShould().haveModifier(com.tngtech.archunit.core.domain.JavaModifier.FINAL)
            .check(CLASSES);
    }

    @Test
    @Tag("SAOR-15")
    @DisplayName("the shipped class stands alone, so the jar holds one class")
    void shippedClassUsesNoOtherOfOurs() {
        noClasses().that().haveFullyQualifiedName("hadur117.micro.Saor")
            .should().dependOnClassesThat(JavaClass.Predicates.resideInAPackage("hadur117..")
                .and(DescribedPredicate.not(JavaClass.Predicates.belongToAnyOf(Saor.class))))
            .check(CLASSES);
    }

    @Test
    @Tag("SAOR-15")
    @DisplayName("the bench adapter goes through the core and never through the shipped class")
    void benchAdapterUsesTheCore() {
        noClasses().that().haveFullyQualifiedName("hadur117.micro.SaorLab")
            .should().dependOnClassesThat().haveFullyQualifiedName("hadur117.micro.Saor")
            .check(CLASSES);
    }
}
