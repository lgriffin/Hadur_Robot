#!/usr/bin/env bash
# Build an arm of JayLexi or Eveimear the way a fitted release would ship: ecj, then ProGuard's
# optimiser (docs/bench/kitlab-priors.md): build_arm_pg.sh SRC.java pkg.Class VERSION
# Writes kitlab/jars/<pkg.Class>_<VERSION>.jar and prints its codesize. Needs ecj 3.33.0 and
# ProGuard 7.8.2 in ~/.m2 (mvn dependency:get, or a build of deise/, which brings ProGuard).
set -euo pipefail
cd "$(dirname "$0")/.."
src=$1 fq=$2 ver=$3
# Git Bash on the PC: Java wants Windows paths in the ProGuard config and ; between jars.
win() { if command -v cygpath > /dev/null; then cygpath -m "$1"; else printf '%s' "$1"; fi; }
sep=:; command -v cygpath > /dev/null && sep=';'
pkg=${fq%.*} cls=${fq##*.}
m2=$HOME/.m2/repository
api=$(find "$m2/net/sf/robocode/robocode-api" -name 'robocode-api-*.jar' | head -1)
ecj=$m2/org/eclipse/jdt/ecj/3.33.0/ecj-3.33.0.jar
# ProGuard's classpath, pinned to the versions proguard-base 7.8.2's pom names. A find over ~/.m2
# picked up every log4j on the PC and mixed them (NoSuchMethodError ServiceLoaderUtil.safeStream).
pg=
for a in com/guardsquare/proguard-base/7.8.2 com/guardsquare/proguard-core/9.2.0 \
    org/jetbrains/kotlin/kotlin-stdlib/2.2.0 org/jetbrains/kotlin/kotlin-metadata-jvm/2.2.0 \
    com/google/code/gson/gson/2.11.0 org/apache/logging/log4j/log4j-api/2.24.2 \
    org/apache/logging/log4j/log4j-core/2.24.2; do
  v=${a##*/} n=${a%/*}; n=${n##*/} j=$m2/$a/$n-$v.jar
  [ -f "$j" ] || { echo "build_arm_pg.sh: missing $j (mvn dependency:get -Dartifact=com.guardsquare:proguard-base:7.8.2)" >&2; exit 1; }
  pg=$pg$(win "$j")$sep
done
out=$PWD/work/arm-build/$fq-$ver; rm -rf "$out"; mkdir -p "$out/classes/${pkg//.//}"
cp "$src" "$out/classes/${pkg//.//}/$cls.java"
java -jar "$(win "$ecj")" -8 -nowarn -g:none -cp "$(win "$api")" -d "$(win "$out/classes")" "$(win "$out/classes/${pkg//.//}/$cls.java")"
printf 'robot.classname=%s\nrobot.version=%s\nrobot.author.name=lgriffin\nrobocode.version=1.9.3.0\n' "$fq" "$ver" > "$out/classes/${pkg//.//}/$cls.properties"
jar="$PWD/kitlab/jars/${fq}_$ver.jar"; mkdir -p kitlab/jars
cat > "$out/pg.pro" <<PRO
-injars $(win "$out/classes")
-outjars $(win "$jar")
-libraryjars <java.home>/jmods/java.base.jmod(!**.jar;!module-info.class)
-libraryjars <java.home>/jmods/java.desktop.jmod(!**.jar;!module-info.class)
-libraryjars $(win "$api")
-keep public class $fq { public *; }
-keepclassmembers class * extends robocode.Condition { public boolean test(); }
-optimizationpasses 9
-allowaccessmodification
-dontobfuscate
-dontnote
-dontwarn
PRO
java -cp "$pg" proguard.ProGuard @"$(win "$out/pg.pro")" > "$out/pg.log" 2>&1 || { tail -20 "$out/pg.log"; exit 1; }
python3 tools/kitlab_codesize.py "$jar" | tail -1
