#!/bin/sh
# Run the TeamRumble top-20 set (team-top20.txt) locally: HadurTeam (five hadur2.Hadur)
# against each team in turn at TeamRumble settings, 1200x1200, 10 rounds.
#
#   ./bench-team-top20.sh
#   ./bench-team-top20.sh --seeds 10 --skip-build
#   ./bench-team-top20.sh --parallel 4 --baseline baselines/hadur2.HadurTeam_3.7.jar --seeds 5
#
# Builds the jars (unless --skip-build), fetches the set's team jars (unless --skip-fetch),
# then runs hadur.bench.Bench with --team true. Team mode takes the same width and pairing
# options as the duel modes (issue #102), so they are passed to Bench directly:
#   - --parallel N fights N battles at once (the seeds of the opponents), each on its own worker
#     home. Unmeasured: five robots a side is about 10 robots per battle, so keep N well under
#     the 1v1 width.
#   - --child-cpus and --child-heap are passed straight to Bench (--child-cpus defaults to 2
#     inside Bench when --parallel is above 1).
#   - --cpu-constant is pinned in every home by Bench, which also names it and the host in the
#     report. Without it the script reads the constant from the host's Robocode config
#     (/c/robocode/config/robocode.properties), unless --no-cpu-pin.
#   - --baseline FILE fights the baseline team on the same seeds (RANDOMSEED is the seed number
#     in both, as in the T1 gate) and adds a paired table, per opponent, to the one report.
#   - One report file per opposing team goes under <report>_per-opponent/ (--no-per-opponent
#     skips them): per-seed table, baseline column and paired difference, then the team records.
#
# Options (all optional):
#   --set FILE             team set file, default team-top20.txt
#   --seeds N              battles per team, default 5
#   --rounds N             rounds per battle, default 10 (TeamRumble)
#   --parallel N           battles at once, default 1
#   --child-cpus N         processors each battle JVM is told it has (Bench default: 2 when --parallel > 1)
#   --child-heap SIZE      cap each battle JVM's heap, e.g. 512M
#   --only TEXT            only teams whose name contains TEXT
#   --robot-jar FILE       our team jar (bench default: ../hadur-robot/target/hadur2.HadurTeam_<release>.jar)
#   --robot NAME           our team's name as Robocode lists it, "hadur2.HadurTeam <release>"
#   --baseline FILE        a baseline team jar, e.g. baselines/hadur2.HadurTeam_3.7.jar
#   --baseline-robot NAME  its name as Robocode lists it; default from the file name
#   --cpu-constant NANOS   robocode.cpu.constant for every home
#   --no-cpu-pin           do not look up the constant in the host's Robocode config
#   --no-per-opponent      skip the per-opponent report files
#   --label NAME           used in the default --out and --report, default team-top20
#   --out DIR              working directory, default work/<label>-<timestamp>
#   --report FILE          the report, default ../docs/bench/local/<date>_<label>.md
#   --repeat K             fight each (jar, opponent, seed) K times and print the score-share SD (BENCH-53); writes repeat.tsv
#   --cold-warm            fight each seed cold, then warm on the shelf the cold battle left (BENCH-54); writes cold-warm.tsv
#   --retries N            run a failed battle again up to N times (BENCH-55), Bench default 1
#   --field WxH            the arena, e.g. 1000x1000, Bench default for the mode
#   --publish              after a finished run, add its analysis to the project site (or HADUR_BENCH_PUBLISH=1); never changes the exit code
#   --dry-run              print what would be built, fetched and run, and run nothing
#   --skip-build           skip `mvn package` at the repo root
#   --skip-fetch           skip fetching the set's team jars
set -u

HERE=$(cd "$(dirname "$0")" && pwd)
cd "$HERE" || exit 1

SET="team-top20.txt"
SEEDS=5
ROUNDS=10
PARALLEL=1
CHILD_CPUS=""
CHILD_HEAP=""
ONLY=""
ROBOT_JAR=""
ROBOT=""
BASELINE=""
BASELINE_ROBOT=""
CPU_CONSTANT=""
NO_CPU_PIN=0
PER_OPPONENT=1
LABEL="team-top20"
OUT=""
REPORT=""
SKIP_BUILD=0
SKIP_FETCH=0
REPEAT=""
COLD_WARM=0
RETRIES=""
FIELD=""
DRY_RUN=0
PUBLISH=0
if [ "${HADUR_BENCH_PUBLISH:-}" = "1" ]; then PUBLISH=1; fi

while [ $# -gt 0 ]; do
    case "$1" in
        --set) SET="${2:?--set needs a file}"; shift 2 ;;
        --seeds) SEEDS="${2:?--seeds needs a number}"; shift 2 ;;
        --rounds) ROUNDS="${2:?--rounds needs a number}"; shift 2 ;;
        --parallel) PARALLEL="${2:?--parallel needs a number}"; shift 2 ;;
        --child-cpus) CHILD_CPUS="${2:?--child-cpus needs a number}"; shift 2 ;;
        --child-heap) CHILD_HEAP="${2:?--child-heap needs a size such as 512M}"; shift 2 ;;
        --only) ONLY="${2:?--only needs text}"; shift 2 ;;
        --robot-jar) ROBOT_JAR="${2:?--robot-jar needs a file}"; shift 2 ;;
        --robot) ROBOT="${2:?--robot needs a name}"; shift 2 ;;
        --baseline) BASELINE="${2:?--baseline needs a jar}"; shift 2 ;;
        --baseline-robot) BASELINE_ROBOT="${2:?--baseline-robot needs a name}"; shift 2 ;;
        --cpu-constant) CPU_CONSTANT="${2:?--cpu-constant needs nanoseconds}"; shift 2 ;;
        --no-cpu-pin) NO_CPU_PIN=1; shift ;;
        --no-per-opponent) PER_OPPONENT=0; shift ;;
        --label) LABEL="${2:?--label needs a name}"; shift 2 ;;
        --out) OUT="${2:?--out needs a directory}"; shift 2 ;;
        --report) REPORT="${2:?--report needs a file}"; shift 2 ;;
        --skip-build) SKIP_BUILD=1; shift ;;
        --skip-fetch) SKIP_FETCH=1; shift ;;
        --repeat) REPEAT="${2:?--repeat needs a number}"; shift 2 ;;
        --cold-warm) COLD_WARM=1; shift ;;
        --retries) RETRIES="${2:?--retries needs a number}"; shift 2 ;;
        --field) FIELD="${2:?--field needs WIDTHxHEIGHT}"; shift 2 ;;
        --dry-run) DRY_RUN=1; shift ;;
        --publish) PUBLISH=1; shift ;;
        -h|--help) sed -n '2,/^set -u$/p' "$0" | sed '$d' | sed 's/^# \{0,1\}//'; exit 0 ;;
        *) echo "unknown option: $1" >&2; exit 2 ;;
    esac
done

if [ "$PARALLEL" -lt 1 ]; then
    echo "--parallel must be at least 1" >&2
    exit 2
fi

# A baseline needs a robot name that differs from ours; the default comes from the jar's file
# name (hadur2.HadurTeam_3.7.jar becomes "hadur2.HadurTeam 3.7"). Our own name is derived the
# same way when --robot-jar is given without --robot, because the bench would otherwise name
# it after the project's release and the engine would not find the jar's team.
if [ -n "$BASELINE" ] && [ -z "$BASELINE_ROBOT" ]; then
    BASELINE_ROBOT=$(basename "$BASELINE" .jar | sed 's/_/ /')
fi
if [ -n "$ROBOT_JAR" ] && [ -z "$ROBOT" ]; then
    ROBOT=$(basename "$ROBOT_JAR" .jar | sed 's/_/ /')
fi
if [ -n "$BASELINE" ] && [ ! -f "$BASELINE" ]; then
    echo "no baseline jar at $BASELINE" >&2
    exit 2
fi

# The CPU constant: given, else read from the host's Robocode config (the rumble clients' own).
if [ -z "$CPU_CONSTANT" ] && [ "$NO_CPU_PIN" -eq 0 ]; then
    for props in "/c/robocode/config/robocode.properties" "C:/robocode/config/robocode.properties" \
                 "${ROBOCODE_HOME:-/nonexistent}/config/robocode.properties"; do
        if [ -f "$props" ]; then
            found=$(tr -d '\r' < "$props" | sed -n 's/^[[:space:]]*robocode\.cpu\.constant[[:space:]]*=[[:space:]]*\([0-9][0-9]*\).*/\1/p' | head -n 1)
            if [ -n "$found" ]; then
                CPU_CONSTANT="$found"
                echo "using robocode.cpu.constant=$CPU_CONSTANT from $props"
                break
            fi
        fi
    done
fi

# --dry-run prints each build, fetch and run step instead of running it.
step() {
    if [ "$DRY_RUN" -eq 1 ]; then
        echo "dry run, would run: $*"
        return 0
    fi
    "$@"
}

STAMP=$(date +%Y%m%d-%H%M%S)
if [ -z "$OUT" ]; then OUT="work/$LABEL-$STAMP"; fi
DAY=$(date +%Y-%m-%d)
if [ -z "$REPORT" ]; then REPORT="../docs/bench/local/${DAY}_${LABEL}.md"; fi
mkdir -p "$(dirname "$REPORT")"

if [ "$SKIP_BUILD" -eq 0 ]; then
    echo "mvn -q package -DskipTests -Dmaven.javadoc.skip (repo root)"
    (cd .. && step mvn -q package -DskipTests -Dmaven.javadoc.skip)
    status=$?
    if [ "$status" -ne 0 ]; then exit "$status"; fi
fi

if [ "$SKIP_FETCH" -eq 0 ]; then
    echo "./fetch-opponents.sh --set $SET"
    step ./fetch-opponents.sh --set "$SET"
    status=$?
    if [ "$status" -ne 0 ]; then exit "$status"; fi
fi

ARGS="--team true --set $SET --seeds $SEEDS --rounds $ROUNDS --label $LABEL --out $OUT --report $REPORT"
if [ "$PARALLEL" -gt 1 ]; then ARGS="$ARGS --parallel $PARALLEL"; fi
if [ -n "$CHILD_CPUS" ]; then ARGS="$ARGS --child-cpus $CHILD_CPUS"; fi
if [ -n "$CHILD_HEAP" ]; then ARGS="$ARGS --child-heap $CHILD_HEAP"; fi
if [ -n "$CPU_CONSTANT" ]; then ARGS="$ARGS --cpu-constant $CPU_CONSTANT"; fi
if [ -n "$ONLY" ]; then ARGS="$ARGS --only \"$ONLY\""; fi
if [ -n "$REPEAT" ]; then ARGS="$ARGS --repeat $REPEAT"; fi
if [ "$COLD_WARM" -eq 1 ]; then ARGS="$ARGS --cold-warm true"; fi
if [ -n "$RETRIES" ]; then ARGS="$ARGS --retries $RETRIES"; fi
if [ -n "$FIELD" ]; then ARGS="$ARGS --field $FIELD"; fi
if [ -n "$ROBOT_JAR" ]; then ARGS="$ARGS --robot-jar $ROBOT_JAR"; fi
if [ -n "$ROBOT" ]; then ARGS="$ARGS --robot \"$ROBOT\""; fi
if [ -n "$BASELINE" ]; then ARGS="$ARGS --baseline $BASELINE --baseline-robot \"$BASELINE_ROBOT\""; fi
PER_OPPONENT_DIR="${REPORT%.md}_per-opponent"
if [ "$PER_OPPONENT" -eq 1 ]; then ARGS="$ARGS --per-opponent $PER_OPPONENT_DIR"; fi

echo "mvn -q compile exec:java -Dexec.args=\"$ARGS\""
step mvn -q compile exec:java -Dexec.args="$ARGS"
code=$?

if [ "$DRY_RUN" -eq 1 ]; then echo "dry run: nothing was built, fetched or run"; exit 0; fi
echo "report: $REPORT"
if [ "$PER_OPPONENT" -eq 1 ]; then echo "per-opponent reports: $PER_OPPONENT_DIR"; fi
echo "battle directories (engine.log, member-N.log, rounds.csv, team.csv): $OUT/battles"

# --publish (or HADUR_BENCH_PUBLISH=1): add this run's analysis to the project site (issue #102).
# A failure here never changes the run's exit code.
if [ "$PUBLISH" -eq 1 ] && [ "$DRY_RUN" -eq 0 ] && [ "$code" -eq 0 ]; then
    PUB_PY=$(command -v python3 || command -v python || true)
    if [ -n "$PUB_PY" ]; then
        "$PUB_PY" ../data/tools/publish_run.py run --work "$OUT" --set "$SET" --label "$LABEL" || echo "publish failed; the run is unaffected" >&2
    else
        echo "publish skipped: python not found" >&2
    fi
fi
exit "$code"
