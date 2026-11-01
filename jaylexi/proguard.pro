# JayLexi's shipped jar: its classes through ProGuard's optimiser, with its properties and its
# source (docs/kitlab.md), as Deise's (deise/proguard.pro). 0.3's opponent tables fit MiniRumble's
# 1,499 bytes only optimised. Paths are relative to jaylexi/; the pom passes <jaylexi.jar> and
# <robocode.api>.

-injars  target/classes(hadur117/mini/JayLexi.class,hadur117/mini/JayLexi$Wave.class,hadur117/mini/JayLexi.properties)
-injars  src/main/java(hadur117/mini/JayLexi.java)
-outjars <jaylexi.jar>

-libraryjars <java.home>/jmods/java.base.jmod(!**.jar;!module-info.class)
-libraryjars <java.home>/jmods/java.desktop.jmod(!**.jar;!module-info.class)
-libraryjars <robocode.api>

# The engine finds the robot by name and calls its event handlers, and tests each wave.
-keep public class hadur117.mini.JayLexi {
    public <init>();
    public void run();
    public void on*(***);
}
-keepclassmembers class * extends robocode.Condition {
    public boolean test();
}

-optimizationpasses 9
-allowaccessmodification
-dontobfuscate
-dontnote
-forceprocessing
