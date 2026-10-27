package hadur117.mini;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** DEISE-14: the core is pure, and Deise stands apart from Hadur, Saor and TwinSaor. */
class ArchitectureTest {

    static final JavaClasses CLASSES = new ClassFileImporter()
        .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
        .importPackages("hadur117.mini");

    @Test
    @Tag("DEISE-14")
    @DisplayName("the core depends on the JDK only")
    void coreIsPure() {
        classes().that().resideInAPackage("hadur117.mini.core..")
            .should().onlyDependOnClassesThat().resideInAnyPackage("hadur117.mini.core..", "java.lang..", "java.util..")
            .check(CLASSES);
    }

    @Test
    @Tag("DEISE-14")
    @DisplayName("nothing of Hadur's, Saor's or TwinSaor's is used")
    void isolated() {
        noClasses().should().dependOnClassesThat().resideInAnyPackage("hadur2..", "hadur117.micro..", "hadur117.twin..")
            .check(CLASSES);
    }
}
