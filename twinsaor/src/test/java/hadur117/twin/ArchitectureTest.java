package hadur117.twin;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** TWIN-3: the core is pure, and TwinSaor stands apart from Hadur and Saor. */
class ArchitectureTest {

    static final JavaClasses CLASSES = new ClassFileImporter()
        .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
        .importPackages("hadur117.twin");

    @Test
    @Tag("TWIN-3")
    @DisplayName("the core depends on the JDK only")
    void coreIsPure() {
        classes().that().resideInAPackage("hadur117.twin.core..")
            .should().onlyDependOnClassesThat().resideInAnyPackage("hadur117.twin.core..", "java.lang..", "java.util..")
            .check(CLASSES);
    }

    @Test
    @Tag("TWIN-3")
    @DisplayName("nothing of Hadur's or Saor's is used")
    void isolated() {
        noClasses().should().dependOnClassesThat().resideInAnyPackage("hadur2..", "hadur117", "hadur117.core..", "hadur117.micro..")
            .check(CLASSES);
    }
}
