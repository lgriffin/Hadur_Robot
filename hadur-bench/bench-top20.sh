#!/bin/sh
# Run the bench's top-20 set (or another set) locally, with the host's own CPU and parallel
# count (issue #102).
#
#   ./bench-top20.sh
#   ./bench-top20.sh --seeds 10 --parallel 8
#   ./bench-top20.sh --baseline /path/hadur2.Hadur_3.7.jar --baseline-robot "hadur2.Hadur 3.7" --seeds 5
#
# Builds the robot jar (unless --skip-build), fetches the set's opponent jars (unless
# --skip-fetch), then runs hadur.bench.Bench with --set, --seeds, --rounds, --parallel and,
# when given, --robot-jar, --robot, --baseline/--baseline-robot and --cpu-constant. The main
# report goes to --report and one report per opponent goes under --per-opponent. The
# exec:java command is printed before it runs, and the script exits with the bench's own
# exit code.
#
# Options (all optional):
#   --set FILE             opponent set file, default top20.txt
#   --seeds N              battles per opponent, default 5
#   --seed-base B          engine seeds are B+1..B+N, fresh ones for a confirmation run (BENCH-72)
#   --rounds N              rounds per battle, default 35
#   --parallel N           battles at once, default a quarter of the logical cores, floored, min 1 (see docs/bench/local/2026-10-06_parallel-ladder.md)
#   --robot-jar FILE       the robot jar (bench default follows robot.release)
#   --robot NAME           the robot's name as Robocode lists it
#   --baseline FILE        a baseline jar for a paired A/B run (needs --baseline-robot)
#   --baseline-robot NAME  the baseline robot's name, distinct from --robot
#   --cpu-constant NANOS   pin robocode.cpu.constant in every worker home
#   --label NAME           used in the default --out, --report and --per-opponent, default top20
#   --out DIR              working directory, default work/<label>-<timestamp>
#   --report FILE          also write the report there, default ../docs/bench/local/<date>_<label>.md
#   --per-opponent DIR     one report per opponent, default ../docs/bench/local/<date>_<label>
#   --child-heap SIZE      cap each battle JVM's heap (-Xmx), default 2G, `none` for no cap; --child-cpus N sets the processors each is told it has
#   --force-memory         start even when the memory check says the run will not fit in free memory
#   --repeat K             fight each (jar, opponent, seed) K times and print the score-share SD (BENCH-53); writes repeat.tsv
#   --cold-warm            fight each seed cold, then warm on the shelf the cold battle left (BENCH-54); writes cold-warm.tsv
#   --retries N            run a failed battle again up to N times (BENCH-55), Bench default 1
#   --field WxH            the arena, e.g. 1000x1000, Bench default for the mode
#   --publish              after a finished run, add its analysis to the project site (or HADUR_BENCH_PUBLISH=1); never changes the exit code
#   --dry-run              print what would be built, fetched and run, and run nothing
#   --skip-build           skip `mvn package` at the repo root
#   --skip-fetch           skip fetching the set's opponent jars
#   --engine VERSION       run the battles on this Robocode release from Maven Central (e.g. 1.11.1)
set -u

HERE=$(cd "$(dirname "$0")" && pwd)
cd "$HERE" || exit 1

SET="top20.txt"
SEEDS=5
ROUNDS=35
PARALLEL=0
ROBOT_JAR=""
ROBOT=""
BASELINE=""
BASELINE_ROBOT=""
CPU_CONSTANT=""
LABEL="top20"
OUT=""
REPORT=""
PER_OPPONENT=""
SKIP_BUILD=0
SKIP_FETCH=0
REPEAT=""
COLD_WARM=0
RETRIES=""
FIELD=""
DRY_RUN=0
PUBLISH=0
if [ "${HADUR_BENCH_PUBLISH:-}" = "1" ]; then PUBLISH=1; fi
ENGINE=""
CHILD_HEAP=""
CHILD_CPUS=""
SEED_BASE=""
FORCE_MEMORY=0

while [ $# -gt 0 ]; do
    case "$1" in
        --set) SET="${2:?--set needs a file}"; shift 2 ;;
        --seeds) SEEDS="${2:?--seeds needs a number}"; shift 2 ;;
        --seed-base) SEED_BASE="${2:?--seed-base needs a number}"; shift 2 ;;
        --rounds) ROUNDS="${2:?--rounds needs a number}"; shift 2 ;;
        --parallel) PARALLEL="${2:?--parallel needs a number}"; shift 2 ;;
        --robot-jar) ROBOT_JAR="${2:?--robot-jar needs a file}"; shift 2 ;;
        --robot) ROBOT="${2:?--robot needs a name}"; shift 2 ;;
        --baseline) BASELINE="${2:?--baseline needs a jar}"; shift 2 ;;
        --baseline-robot) BASELINE_ROBOT="${2:?--baseline-robot needs a name}"; shift 2 ;;
        --cpu-constant) CPU_CONSTANT="${2:?--cpu-constant needs nanoseconds}"; shift 2 ;;
        --label) LABEL="${2:?--label needs a name}"; shift 2 ;;
        --out) OUT="${2:?--out needs a directory}"; shift 2 ;;
        --report) REPORT="${2:?--report needs a file}"; shift 2 ;;
        --per-opponent) PER_OPPONENT="${2:?--per-opponent needs a directory}"; shift 2 ;;
        --skip-build) SKIP_BUILD=1; shift ;;
        --skip-fetch) SKIP_FETCH=1; shift ;;
        --repeat) REPEAT="${2:?--repeat needs a number}"; shift 2 ;;
        --cold-warm) COLD_WARM=1; shift ;;
        --retries) RETRIES="${2:?--retries needs a number}"; shift 2 ;;
        --field) FIELD="${2:?--field needs WIDTHxHEIGHT}"; shift 2 ;;
        --dry-run) DRY_RUN=1; shift ;;
        --publish) PUBLISH=1; shift ;;
        --child-heap) CHILD_HEAP="${2:?--child-heap needs a size such as 2G, or none}"; shift 2 ;;
        --child-cpus) CHILD_CPUS="${2:?--child-cpus needs a number}"; shift 2 ;;
        --force-memory) FORCE_MEMORY=1; shift ;;
        --engine) ENGINE="${2:?--engine needs a Robocode version}"; shift 2 ;;
        -h|--help) sed -n '2,/^set -u$/p' "$0" | sed '$d' | sed 's/^# \{0,1\}//'; exit 0 ;;
        *) echo "unknown option: $1" >&2; exit 2 ;;
    esac
done

if [ -n "$BASELINE" ] && [ -z "$BASELINE_ROBOT" ]; then
    echo "--baseline needs --baseline-robot too" >&2
    exit 2
fi

if [ "$PARALLEL" -eq 0 ]; then
    CORES=$(nproc 2>/dev/null || sysctl -n hw.ncpu 2>/dev/null || echo 2)
    PARALLEL=$((CORES / 4))
    if [ "$PARALLEL" -lt 1 ]; then PARALLEL=1; fi
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
if [ -z "$PER_OPPONENT" ]; then PER_OPPONENT="../docs/bench/local/${DAY}_${LABEL}"; fi

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

ARGS="--set $SET --seeds $SEEDS --rounds $ROUNDS --parallel $PARALLEL --out $OUT --report $REPORT --per-opponent $PER_OPPONENT"
if [ -n "$ROBOT_JAR" ]; then ARGS="$ARGS --robot-jar $ROBOT_JAR"; fi
if [ -n "$ROBOT" ]; then ARGS="$ARGS --robot \"$ROBOT\""; fi
if [ -n "$BASELINE" ]; then ARGS="$ARGS --baseline $BASELINE --baseline-robot \"$BASELINE_ROBOT\""; fi
if [ -n "$CPU_CONSTANT" ]; then ARGS="$ARGS --cpu-constant $CPU_CONSTANT"; fi
if [ -n "$SEED_BASE" ]; then ARGS="$ARGS --seed-base $SEED_BASE"; fi
if [ -n "$REPEAT" ]; then ARGS="$ARGS --repeat $REPEAT"; fi
if [ "$COLD_WARM" -eq 1 ]; then ARGS="$ARGS --cold-warm true"; fi
if [ -n "$RETRIES" ]; then ARGS="$ARGS --retries $RETRIES"; fi
if [ -n "$FIELD" ]; then ARGS="$ARGS --field $FIELD"; fi
if [ -n "$CHILD_HEAP" ]; then ARGS="$ARGS --child-heap $CHILD_HEAP"; fi
if [ -n "$CHILD_CPUS" ]; then ARGS="$ARGS --child-cpus $CHILD_CPUS"; fi
if [ "$FORCE_MEMORY" -eq 1 ]; then ARGS="$ARGS --force-memory true"; fi

# The engine is the bench's own Maven dependency, so another release is a property away;
# the bench's classpath file is rebuilt with it on this compile (issue #109).
ENGINE_PROP=""
if [ -n "$ENGINE" ]; then ENGINE_PROP="-Drobocode.version=$ENGINE"; fi

echo "mvn -q $ENGINE_PROP compile exec:java -Dexec.args=\"$ARGS\""
step mvn -q $ENGINE_PROP compile exec:java -Dexec.args="$ARGS"
code=$?

if [ "$DRY_RUN" -eq 1 ]; then echo "dry run: nothing was built, fetched or run"; exit 0; fi
echo "report: $REPORT"
echo "per-opponent reports: $PER_OPPONENT"

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
