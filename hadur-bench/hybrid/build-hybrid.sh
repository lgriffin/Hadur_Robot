#!/usr/bin/env bash
# Build the bench-only hybrid reference robots (README.md): Hadur's code from this checkout plus
# BeepBoop 2.0's source, taken from its rumble jar at build time (nothing of BeepBoop's is
# committed here).
#
#   hadur-bench/hybrid/build-hybrid.sh [--out DIR] [--beep-jar FILE]
#
# Writes DIR/hybrid.BeepMoveHadurGun_1.0.jar and DIR/hybrid.HadurMoveBeepGun_1.0.jar
# (default DIR: hadur-bench/bisect). These jars are measuring sticks: never release, upload
# or enter them in a rumble.
set -euo pipefail

HERE=$(cd "$(dirname "$0")" && pwd)
ROOT=$(cd "$HERE/../.." && pwd)
OUT="$ROOT/hadur-bench/bisect"
BEEP_JAR="$ROOT/hadur-bench/opponents/kc.mega.BeepBoop_2.0.jar"
VERSION=1.0

while [ $# -gt 0 ]; do
    case "$1" in
        --out) OUT="$2"; shift 2 ;;
        --beep-jar) BEEP_JAR="$2"; shift 2 ;;
        -h|--help) sed -n '2,10p' "$0" | sed 's/^# \{0,1\}//'; exit 0 ;;
        *) echo "unknown option: $1" >&2; exit 2 ;;
    esac
done

if [ ! -f "$BEEP_JAR" ]; then
    mkdir -p "$(dirname "$BEEP_JAR")"
    curl -fsSL -o "$BEEP_JAR" \
        https://robocode-archive.strangeautomata.com/robots/kc.mega.BeepBoop_2.0.jar
fi

API=$(find "$HOME/.m2/repository/net/sf/robocode/robocode.api" -name 'robocode.api-1.12.0.jar' | head -1)
[ -n "$API" ] || { echo "robocode.api 1.12.0 not in ~/.m2: run mvn package once" >&2; exit 1; }

WORK=$(mktemp -d)
trap 'rm -rf "$WORK"' EXIT
mkdir -p "$WORK/src" "$WORK/beep" "$WORK/classes"

# Hadur: core and robot shell, copied, with the bench-only seam patched in.
cp -r "$ROOT/hadur-core/src/main/java/." "$WORK/src/"
cp -r "$ROOT/hadur-robot/src/main/java/." "$WORK/src/"
rm -f "$WORK/src/hadur117/HadurRecorder.java"
cp "$HERE/patch/HybridHooks.java" "$WORK/src/hadur117/core/"
python3 "$HERE/patch/patch-core.py" "$WORK/src/hadur117/core/duel/DuelController.java"

# BeepBoop: its own source files, from its jar, unchanged; Rednaxela's KdTree (ags.utils), which
# BeepBoop ships compiled only, goes in as BeepBoop's class files.
(cd "$WORK/beep" && unzip -q "$BEEP_JAR" '*.java')
cp -r "$WORK/beep/." "$WORK/src/"
(cd "$WORK/classes" && unzip -q "$BEEP_JAR" 'ags/*')

cp -r "$HERE/src/." "$WORK/src/"

find "$WORK/src" -name '*.java' > "$WORK/sources.txt"
javac -nowarn --release 11 -encoding UTF-8 -cp "$API:$WORK/classes" -d "$WORK/classes" @"$WORK/sources.txt" 2>&1 \
    | grep -v '^Note:' || true
[ -f "$WORK/classes/hybrid/BeepMoveHadurGun.class" ] || { echo "compile failed" >&2; exit 1; }

mkdir -p "$OUT"
for NAME in BeepMoveHadurGun HadurMoveBeepGun HadurPlain; do
    case "$NAME" in
        BeepMoveHadurGun) DESC="Bench-only reference: BeepBoop 2.0 movement with Hadur's gun. Not for the rumble." ;;
        HadurMoveBeepGun) DESC="Bench-only reference: Hadur's movement with BeepBoop 2.0's gun. Not for the rumble." ;;
        HadurPlain) DESC="Bench-only control: Hadur built the hybrids' way, no BeepBoop code. Not for the rumble." ;;
    esac
    STAGE="$WORK/jar-$NAME"
    cp -r "$WORK/classes" "$STAGE"
    cat > "$STAGE/hybrid/$NAME.properties" <<EOF
#Robocode Robot Properties
robot.description=$DESC Movement and gun code credits: hadur-bench/hybrid/README.md (BeepBoop by Kevin Clark).
robot.author.name=lgriffin
robot.classname=hybrid.$NAME
robot.version=$VERSION
robot.webpage=https://github.com/lgriffin/Hadur_Robot
robocode.version=1.9.3.0
EOF
    cp "$HERE/README.md" "$STAGE/hybrid/README.md"
    JAR="$OUT/hybrid.${NAME}_${VERSION}.jar"
    rm -f "$JAR"
    (cd "$STAGE" && jar cf "$JAR" .)
    echo "built $JAR"
done
