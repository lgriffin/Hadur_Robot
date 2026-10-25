# Saor's shipped jar: the micro adapter, through ProGuard's peephole optimiser, with its
# properties and its source (docs/saor.md). Paths are relative to saor/; the pom passes
# <saor.jar> and <robocode.api>. ProGuard saves about 15 bytes here; the core is not an
# input, as inlining it cost 165 (docs/saor.md, "The byte budget").

-injars  target/classes(hadur117/micro/Saor.class,hadur117/micro/Saor.properties)
-injars  src/main/java(hadur117/micro/Saor.java)
-outjars <saor.jar>

-libraryjars <java.home>/jmods/java.base.jmod(!**.jar;!module-info.class)
-libraryjars <java.home>/jmods/java.desktop.jmod(!**.jar;!module-info.class)
-libraryjars <robocode.api>

# The engine finds the robot by name and calls its event handlers.
-keep public class hadur117.micro.Saor {
    public <init>();
    public void run();
    public void on*(***);
}

-optimizationpasses 9
-allowaccessmodification
-dontobfuscate
-dontnote
