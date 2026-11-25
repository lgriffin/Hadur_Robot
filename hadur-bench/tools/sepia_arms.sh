#!/usr/bin/env bash
# Builds Sepia's lab arms (docs/sepia.md, "Arms") into work/sepia-arms/: one robot jar per arm, each
# a copy of the shipped source with Sepia's two build constants set, named hadur117.Sepia <release><label>
# so a multi-arm run (--arms) tells them apart. Run from hadur-bench after `mvn install` of hadur-core.
#
#   bash tools/sepia_arms.sh                 every arm below
#   bash tools/sepia_arms.sh sp,sj           only those labels
#
# The arms, label | gait | fire:
#   sp  JET  INK_ONLY   silent Sepia with its jet cycle and its ink (the cloud-ink-lab card's sp)
#   sj  JET  NONE       the same robot with the ink off: jet only (the card's sj)
#   ss  SURF INK_ONLY   silent Sepia on the ink surf with its ink
#   sn  SURF NONE       the ink surf with the ink off
#   sf  JET  FULL       the shipped build: ink or punch by STRIKE-1
# The jar carries the whole of hadur-core's classes beside Sepia's (the shipped jar keeps only those it
# reaches); the bench does not care. Prints one arms line per jar for an --arms file.
set -euo pipefail
here="$(cd "$(dirname "$0")/.." && pwd)"
repo="$(dirname "$here")"
only="${1:-}"
api=$(find "$HOME/.m2/repository/net/sf/robocode/robocode-api" -name 'robocode-api-*.jar' | head -1)
[ -n "$api" ] || { echo "sepia_arms: robocode-api jar not in ~/.m2; run mvn install first" >&2; exit 2; }
core=$(ls "$repo"/hadur-core/target/hadur-core-*.jar 2>/dev/null | grep -v -e sources -e javadoc -e tests | head -1)
[ -n "$core" ] || { echo "sepia_arms: build hadur-core first (mvn -pl hadur-core install -DskipTests)" >&2; exit 2; }
release=$(sed -n 's:.*<sepia.release>\([0-9.]*\)</sepia.release>.*:\1:p' "$repo/sepia/pom.xml" | head -1)
out="$here/work/sepia-arms"
mkdir -p "$out"
arms="sp JET INK_ONLY
sj JET NONE
ss SURF INK_ONLY
sn SURF NONE
sf JET FULL"
while read -r label gait fire; do
    if [ -n "$only" ] && [[ ",$only," != *",$label,"* ]]; then continue; fi
    tmp="$(mktemp -d)"
    cp -r "$repo/sepia/src/main/java" "$tmp/src"
    adapter="$tmp/src/hadur117/Sepia.java"
    sed -i -e "s/Gait.Kind GAIT = Gait.Kind.[A-Z_]*;/Gait.Kind GAIT = Gait.Kind.$gait;/" \
           -e "s/SepiaBrain.Fire FIRE = SepiaBrain.Fire.[A-Z_]*;/SepiaBrain.Fire FIRE = SepiaBrain.Fire.$fire;/" "$adapter"
    grep -q "Gait.Kind.$gait;" "$adapter" && grep -q "SepiaBrain.Fire.$fire;" "$adapter" \
        || { echo "sepia_arms: could not set $label's constants" >&2; exit 1; }
    mkdir -p "$tmp/classes"
    javac --release 11 -nowarn -cp "$core:$api" -d "$tmp/classes" $(find "$tmp/src" -name '*.java')
    (cd "$tmp/classes" && unzip -oq "$core" 'hadur117/core/*')
    version="$release$label"
    sed -e "s/\${sepia.release}/$version/" "$repo/sepia/src/main/resources/hadur117/Sepia.properties" \
        > "$tmp/classes/hadur117/Sepia.properties"
    jar="$out/hadur117.Sepia_${version}.jar"
    rm -f "$jar"
    (cd "$tmp/classes" && jar cf "$jar" .)
    rm -rf "$tmp"
    echo "$label | hadur117.Sepia $version | $jar"
done <<< "$arms"
