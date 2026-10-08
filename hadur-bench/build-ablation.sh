#!/usr/bin/env bash
# Build Hadur with one or more behaviours switched off, for a paired A/B against the release
# it came from (the live-loser follow-up, docs/bench/local/2026-10-07_live-loser-bisect.md).
#
#   ./build-ablation.sh [--ref REF] ABLATION[,ABLATION...]
#   ./build-ablation.sh ram2            # bisect/hadur2.Hadur_3.8.5nr.jar, "hadur2.Hadur 3.8.5nr"
#   ./build-ablation.sh mir1            # ... 3.8.5nm
#   ./build-ablation.sh ram2,mir1       # ... 3.8.5nrnm
#   ./build-ablation.sh shield-all      # ... 3.8.5sa
#
# Ablations (each a one-line edit of the duel, checked to apply exactly once):
#   ram2  RAM-2 off: never escape a confirmed rammer; RAM-1's full-power rule stays (3.4's play)
#   mir1  MIR-1 off: never recognise a mirror bot, so no mirror drive or mirror aim
#   flat  the flattener views never switch on (MOVE-5's threshold out of reach, ADAPT-2's forcing off): is the
#         flattener what lets simple guns hit us (docs/bench/plan-3.11.md, part 2)?
#   shield-all  the D5 shield list matches every opponent, so each 1v1 round opens in shield
#         mode (SHIELD-6 still takes it back where the enemy's bullets would hold the score
#         share under 85%). Issue #140, M2: is Nullstride's mid-table score a shielding score?
#
# The build runs in a temporary git worktree of REF (default HEAD), so the checkout is not
# touched. The robot version is REF's version plus one suffix per ablation (nr, nm), so the
# jar installs beside the release in the same Robocode home. Tests are skipped: the pins and
# fixtures would rightly fail on an edited duel. Needs git, mvn, python3 and bash (Git Bash
# on Windows).
set -euo pipefail

ref=HEAD
if [[ "${1:-}" == "--ref" ]]; then ref="$2"; shift 2; fi
[[ $# -eq 1 ]] || { sed -n '2,24p' "$0"; exit 2; }

here="$(cd "$(dirname "$0")" && pwd)"
repo="$(git -C "$here" rev-parse --show-toplevel)"
work="$(mktemp -d)"
trap 'git -C "$repo" worktree remove --force "$work/src" >/dev/null 2>&1 || true; rm -rf "$work"' EXIT
git -C "$repo" worktree add --detach "$work/src" "$ref" >/dev/null
src="$work/src"
duel="$src/hadur-core/src/main/java/hadur2/core/duel/DuelController.java"
move="$src/hadur-core/src/main/java/hadur2/core/move/MoveController.java"
shields="$src/hadur-core/src/main/java/hadur2/core/shieldmode/ShieldList.java"

# Replace exactly one occurrence of $2 with $3 in file $1, or fail.
edit() {
    local n
    n="$(grep -cF -- "$2" "$1" || true)"
    [[ "$n" == 1 ]] || { echo "ablation does not apply: found '$2' $n times in $1" >&2; exit 1; }
    python3 -c 'import sys; p,a,b=sys.argv[1:]; s=open(p).read(); open(p,"w").write(s.replace(a,b,1))' "$1" "$2" "$3"
}

base="$(sed -n 's:.*<robot.release>\(.*\)</robot.release>.*:\1:p' "$src/hadur-robot/pom.xml")"
version="$base"
IFS=, read -ra list <<< "$1"
for a in "${list[@]}"; do
    case "$a" in
        ram2)
            # Since RAM-3 (3.9) the escape line ends with the trial arm's condition; before it
            # (3.5 to 3.8.5) the call ends the line.
            ram3="&& trialRound && trialArm == EscapeTrial.Arm.ESCAPE;"
            if grep -qF -- "$ram3" "$duel"; then
                edit "$duel" "$ram3" "&& false;"
            else
                edit "$duel" "ramEscaping = rammer.escape(e.distance(), enemyClosingSpeed, in.energy(), e.energy());" \
                    "ramEscaping = rammer.escape(e.distance(), enemyClosingSpeed, in.energy(), e.energy()) && false;"
            fi
            version="${version}nr" ;;
        mir1)
            edit "$duel" "java.util.Arrays.copyOf(xs, n), java.util.Arrays.copyOf(ys, n), ourEnergy, enemyEnergy);" \
                "java.util.Arrays.copyOf(xs, n), java.util.Arrays.copyOf(ys, n), ourEnergy, enemyEnergy) && false;"
            version="${version}nm" ;;
        flat)
            edit "$move" "public static final double FLATTENER_THRESHOLD = 4.5;" \
                "public static final double FLATTENER_THRESHOLD = 1000.0;"
            edit "$move" "if (flattenerFirst && view.logVisits) return true;" \
                "if (false && flattenerFirst && view.logVisits) return true;"
            version="${version}nf" ;;
        shield-all)
            edit "$shields" "return entries.contains(name) || entries.contains(withoutVersion(name));"                 "return true;"
            version="${version}sa" ;;
        *) echo "unknown ablation: $a (ram2, mir1, flat, shield-all)" >&2; exit 2 ;;
    esac
done

edit "$src/hadur-robot/pom.xml" "<robot.release>$base</robot.release>" "<robot.release>$version</robot.release>"
for f in Hadur.properties HadurRecorder.properties; do
    edit "$src/hadur-robot/src/main/resources/hadur2/$f" "robot.version=$base" "robot.version=$version"
done
team="$src/hadur-robot/src/team/HadurTeam.team"
[[ -f "$team" ]] && sed -i "s/$base/$version/g" "$team"

(cd "$src" && mvn -q -B package -DskipTests -Dmaven.javadoc.skip=true)
jar="$src/hadur-robot/target/hadur2.Hadur_${version}.jar"
python3 -c 'import sys,zipfile; print(zipfile.ZipFile(sys.argv[1]).read("hadur2/Hadur.properties").decode())' "$jar" | tr -d '\r' | grep -qx "robot.version=$version" \
    || { echo "built jar does not carry robot.version=$version" >&2; exit 1; }
mkdir -p "$here/bisect"
cp "$jar" "$here/bisect/"
echo "built bisect/hadur2.Hadur_${version}.jar  --robot \"hadur2.Hadur ${version}\""
