# Deise's shipped jar: the flat class, through ProGuard's peephole optimiser, with its
# properties and its source (docs/deise.md). Paths are relative to deise/; the pom passes
# <deise.jar> and <robocode.api>. The core is not an input: the class is flattened by hand.

-injars  target/classes(hadur117/mini/Deise.class,hadur117/mini/Deise.properties)
-injars  src/main/java(hadur117/mini/Deise.java)
-outjars <deise.jar>

-libraryjars <java.home>/jmods/java.base.jmod(!**.jar;!module-info.class)
-libraryjars <java.home>/jmods/java.desktop.jmod(!**.jar;!module-info.class)
-libraryjars <robocode.api>

# The engine finds the robot by name and calls its event handlers.
-keep public class hadur117.mini.Deise {
    public <init>();
    public void run();
    public void on*(***);
}

-optimizationpasses 9
-allowaccessmodification
-dontobfuscate
-dontnote
