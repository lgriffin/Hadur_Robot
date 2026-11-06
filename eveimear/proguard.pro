# Eveimear's shipped jar: its classes through ProGuard's optimiser, with its properties and its
# source (docs/kitlab.md), as Deise's (deise/proguard.pro). 0.4's catcher jitter (EVEIMEAR-13) fits
# MicroRumble's 749 bytes only optimised (2026-11-04: ProGuard builds allowed when they replay identically). Paths are relative to eveimear/; the pom passes <eveimear.jar> and
# <robocode.api>.

-injars  target/classes(hadur117/micro/Eveimear.class,hadur117/micro/Eveimear.properties)
-injars  src/main/java(hadur117/micro/Eveimear.java)
-outjars <eveimear.jar>

-libraryjars <java.home>/jmods/java.base.jmod(!**.jar;!module-info.class)
-libraryjars <java.home>/jmods/java.desktop.jmod(!**.jar;!module-info.class)
-libraryjars <robocode.api>

# The engine finds the robot by name and calls its event handlers, and tests each wave.
-keep public class hadur117.micro.Eveimear {
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
