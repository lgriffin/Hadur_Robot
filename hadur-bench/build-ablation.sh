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
#   nodur  RES-9 duress never switches on: skipped turns still shed levels (TIME-2) but the
#         round never drops to the orbit-and-head-on fallback. 3.11 M4 (docs/plan-3.11-census.md):
#         the census lost 0.62 APS in battles with start-up duress.
#   nolearn  TIME-3 never learns an allowance from a skipped turn, so a round-0 warm-up skip
#         does not set the shedding threshold for the rest of the battle.
#   fin   END-1 finishing keeps the controller's distance instead of closing to 150 px (END-2's
#         ram on a disabled enemy stays). 3.12 P1 (docs/plan-3.12.md): does closing in to finish
#         weak bots let their simple guns hit us?
#   fl5   DIST-1 never walks in closer than 500 px (the floor is 400). 3.12 P1: does the walk-in
#         against bots we out-hit cost more bullets than it wins?
#   mfire SHIELD-2's hold of the settled aim skips a MIR-1 mirror aim, which carries no jitter and
#         so was never fired once a shield verdict latched. 3.12 P4 (docs/plan-3.12.md): the
#         silent battles against mirror bots.
#   away  "never close in" (3.12 P5): DIST-1 never steps in (the target stays at the opening's,
#         650 px for a stranger), END-1 keeps that distance, and the surf corrects being too
#         close with the orbit's 1.65 gain instead of 0.6.
#   s50   SHIELD-1 needs 10 of the last 20 bullets intercepted, and half of them, not 4 and a
#         quarter. 3.12 P4: half of all census battles latch a shield verdict.
#
# The build runs in a temporary git worktree of REF (default HEAD), so the checkout is not
# touched. The robot version is REF's version plus one suffix per ablation (nr, nm), so the
# jar installs beside the release in the same Robocode home. Tests are skipped: the pins and
# fixtures would rightly fail on an edited duel. Needs git, mvn, python3 and bash (Git Bash
# on Windows).
set -euo pipefail

ref=HEAD
if [[ "${1:-}" == "--ref" ]]; then ref="$2"; shift 2; fi
[[ $# -eq 1 ]] || { sed -n '2,42p' "$0"; exit 2; }

here="$(cd "$(dirname "$0")" && pwd)"
repo="$(git -C "$here" rev-parse --show-toplevel)"
work="$(mktemp -d)"
trap 'git -C "$repo" worktree remove --force "$work/src" >/dev/null 2>&1 || true; rm -rf "$work"' EXIT
git -C "$repo" worktree add --detach "$work/src" "$ref" >/dev/null
src="$work/src"
duel="$src/hadur-core/src/main/java/hadur2/core/duel/DuelController.java"
move="$src/hadur-core/src/main/java/hadur2/core/move/MoveController.java"
shields="$src/hadur-core/src/main/java/hadur2/core/shieldmode/ShieldList.java"
budget="$src/hadur-core/src/main/java/hadur2/core/policy/TickBudget.java"
dist="$src/hadur-core/src/main/java/hadur2/core/policy/DistancePolicy.java"
detector="$src/hadur-core/src/main/java/hadur2/core/shield/ShieldDetector.java"
surf="$src/hadur-core/src/main/java/hadur2/core/move/SurfMover.java"

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
        nodur)
            edit "$budget" "return skipsThisRound >= DURESS_SKIPS && now - lastSkip < DURESS_QUIET_TICKS;" \
                "return false && skipsThisRound >= DURESS_SKIPS && now - lastSkip < DURESS_QUIET_TICKS;"
            version="${version}nd" ;;
        nolearn)
            edit "$budget" "if (learnedAllowanceNanos <= 0 && lastUsedNanos > 0" \
                "if (false && learnedAllowanceNanos <= 0 && lastUsedNanos > 0"
            version="${version}nl" ;;
        fin)
            edit "$dist" "return finishing ? FINISH : target;" "return target;"
            version="${version}ne" ;;
        fl5)
            edit "$dist" "target = Math.max(FLOOR, target - STEP);" "target = Math.max(Math.max(FLOOR, 500), target - STEP);"
            version="${version}f5" ;;
        mfire)
            edit "$duel" "boolean predictable = shieldDetector.shielded() && !aimCarriesJitter;" \
                "boolean predictable = shieldDetector.shielded() && !aimCarriesJitter && !aimIsMirror;"
            version="${version}mf" ;;
        away)
            edit "$dist" "if (gap >= GAP && certainLead(ours, theirs) && target > FLOOR) {" \
                "if (false && gap >= GAP && certainLead(ours, theirs) && target > FLOOR) {"
            edit "$dist" "return finishing ? FINISH : target;" "return target;"
            edit "$surf" "return DiaUtils.limit(-MAX_ATTACK_ANGLE, factor * 0.6, MAX_ATTACK_ANGLE);" \
                "return DiaUtils.limit(-MAX_ATTACK_ANGLE, factor * (factor < 0 ? 1.65 : 0.6), MAX_ATTACK_ANGLE);"
            version="${version}aw" ;;
        s50)
            edit "$detector" "public static final int MIN_INTERCEPTS = 4;" "public static final int MIN_INTERCEPTS = 10;"
            edit "$detector" "public static final double MIN_SHARE = 0.25;" "public static final double MIN_SHARE = 0.5;"
            version="${version}s5" ;;
        *) echo "unknown ablation: $a (ram2, mir1, flat, shield-all, nodur, nolearn, fin, fl5, mfire, s50, away)" >&2; exit 2 ;;
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
