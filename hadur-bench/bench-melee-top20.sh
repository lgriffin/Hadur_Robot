#!/bin/sh
# Run the melee top-20 bench locally: five overlapping fields of Hadur and nine opponents
# (melee-top20.txt, melee-top20-a.txt .. melee-top20-e.txt), at the MeleeRumble's 1000x1000.
#
#   ./bench-melee-top20.sh
#   ./bench-melee-top20.sh --seeds 10 --rounds 35
#   ./bench-melee-top20.sh --fields-parallel 5          # the five fields as separate processes
#   ./bench-melee-top20.sh --fields A,C --fields-parallel 2
#   ./bench-melee-top20.sh --parallel 4 --baseline baselines/hadur2.Hadur_3.7.jar --seeds 10
#
# Builds the robot jar (unless --skip-build), fetches the opponent jars (unless --skip-fetch),
# then runs hadur.bench.Bench. By default that is one suite run (--suite melee-top20.txt): the
# fields one after another in one process, one combined report. With --fields-parallel N (N > 1)
# or --fields, each field is its own bench process, N at a time, with its own report. Either
# way, afterwards data/tools/melee_pairwise.py pools Hadur's pairwise share per opponent across
# the fields into a per-opponent table.
#
# Melee mode takes the same width and pairing options as the duel modes (issue #102):
#   - --parallel N fights N seeds of a field at once, each on its own worker home. Several
#     fields as separate processes multiply that: --fields-parallel F with --parallel N is
#     F x N battles of about ten robots each, so size them together.
#   - --child-cpus and --child-heap are passed straight to Bench (--child-cpus defaults to 2
#     inside Bench when --parallel is above 1).
#   - --cpu-constant is pinned in every home by Bench, which also names it and the host in the
#     report. Without it the script reads the constant from the host's Robocode config
#     (/c/robocode/config/robocode.properties), unless --no-cpu-pin.
#   - --baseline JAR --baseline-robot NAME fights the baseline on the same seeds and adds a
#     paired table (per field, and per opponent) to each field's report.
#   - Each field's reports also get one file per opponent under <report>_per-opponent/<field>/
#     (--no-per-opponent skips them). Pooling an opponent across the fields it stood in is
#     still data/tools/melee_pairwise.py's job, run at the end.
#
# Options (all optional):
#   --seeds N              battles per field, default 5
#   --rounds N             rounds per battle, default 35
#   --fields LIST          comma-separated fields to run, default A,B,C,D,E (implies separate processes)
#   --fields-parallel N    fields at once as separate processes, default 1 (the suite run)
#   --robot-jar FILE       the robot jar (bench default follows robot.release)
#   --robot NAME           the robot's name as Robocode lists it
#   --parallel N           seeds of a field at once, default 1 (Bench's own option)
#   --child-cpus N         processors each battle JVM is told it has (Bench default: 2 when --parallel > 1)
#   --child-heap SIZE      cap each battle JVM's heap, e.g. 512M
#   --cpu-constant NANOS   robocode.cpu.constant to pin in every home (default: read from the host's config)
#   --no-cpu-pin           do not look up the constant in the host's Robocode config
#   --baseline FILE        a baseline robot jar, fought on the same seeds, for the paired tables
#   --baseline-robot NAME  its name as Robocode lists it, "hadur2.Hadur 3.7"; default from the file name
#   --no-per-opponent      skip the per-opponent report files
#   --label NAME           used in the default --out and --report, default melee-top20
#   --out DIR              working directory, default work/<label>-<timestamp>
#   --report FILE          the combined report (suite run), default ../docs/bench/local/<date>_<label>.md;
#                          with separate processes a report per field, <date>_<label>_<field>.md
#   --repeat K             fight each (jar, opponent, seed) K times and print the score-share SD (BENCH-53); writes repeat.tsv
#   --cold-warm            fight each seed cold, then warm on the shelf the cold battle left (BENCH-54); writes cold-warm.tsv
#   --retries N            run a failed battle again up to N times (BENCH-55), Bench default 1
#   --field WxH            the arena, e.g. 1000x1000, Bench default for the mode
#   --publish              after a finished run, add its analysis to the project site (or HADUR_BENCH_PUBLISH=1); never changes the exit code
#   --dry-run              print what would be built, fetched and run, and run nothing
#   --skip-build           skip `mvn package` at the repo root
#   --skip-fetch           skip fetching the opponent jars
set -u

HERE=$(cd "$(dirname "$0")" && pwd)
cd "$HERE" || exit 1

SEEDS=5
ROUNDS=35
FIELDS=""
FIELDS_PARALLEL=1
ROBOT_JAR=""
ROBOT=""
PARALLEL=1
CHILD_CPUS=""
CHILD_HEAP=""
CPU_CONSTANT=""
NO_CPU_PIN=0
BASELINE=""
BASELINE_ROBOT=""
PER_OPPONENT=1
LABEL="melee-top20"
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
        --seeds) SEEDS="${2:?--seeds needs a number}"; shift 2 ;;
        --rounds) ROUNDS="${2:?--rounds needs a number}"; shift 2 ;;
        --fields) FIELDS="${2:?--fields needs a list such as A,B}"; shift 2 ;;
        --fields-parallel) FIELDS_PARALLEL="${2:?--fields-parallel needs a number}"; shift 2 ;;
        --robot-jar) ROBOT_JAR="${2:?--robot-jar needs a file}"; shift 2 ;;
        --robot) ROBOT="${2:?--robot needs a name}"; shift 2 ;;
        --parallel) PARALLEL="${2:?--parallel needs a number}"; shift 2 ;;
        --child-cpus) CHILD_CPUS="${2:?--child-cpus needs a number}"; shift 2 ;;
        --child-heap) CHILD_HEAP="${2:?--child-heap needs a size such as 512M}"; shift 2 ;;
        --cpu-constant) CPU_CONSTANT="${2:?--cpu-constant needs nanoseconds}"; shift 2 ;;
        --no-cpu-pin) NO_CPU_PIN=1; shift ;;
        --baseline) BASELINE="${2:?--baseline needs a jar}"; shift 2 ;;
        --baseline-robot) BASELINE_ROBOT="${2:?--baseline-robot needs a name}"; shift 2 ;;
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
if [ -n "$BASELINE" ]; then
    if [ ! -f "$BASELINE" ]; then echo "no baseline jar at $BASELINE" >&2; exit 2; fi
    if [ -z "$BASELINE_ROBOT" ]; then
        BASELINE_ROBOT=$(basename "$BASELINE" .jar | sed 's/_/ /')
    fi
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

SEPARATE=0
if [ "$FIELDS_PARALLEL" -gt 1 ] || [ -n "$FIELDS" ]; then SEPARATE=1; fi
if [ -z "$FIELDS" ]; then FIELDS="A,B,C,D,E"; fi
FIELD_LIST=$(echo "$FIELDS" | tr ',' ' ' | tr 'a-e' 'A-E')
for f in $FIELD_LIST; do
    case "$f" in A|B|C|D|E) ;; *) echo "unknown field: $f (A to E)" >&2; exit 2 ;; esac
done

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
REPORT_BASE="${REPORT%.md}"
mkdir -p "$(dirname "$REPORT")"

if [ "$SKIP_BUILD" -eq 0 ]; then
    echo "mvn -q package -DskipTests -Dmaven.javadoc.skip (repo root)"
    (cd .. && step mvn -q package -DskipTests -Dmaven.javadoc.skip)
    status=$?
    if [ "$status" -ne 0 ]; then exit "$status"; fi
fi

if [ "$SKIP_FETCH" -eq 0 ]; then
    echo "./fetch-opponents.sh --set melee-top20-set.txt"
    step ./fetch-opponents.sh --set melee-top20-set.txt
    status=$?
    if [ "$status" -ne 0 ]; then exit "$status"; fi
fi

ROBOT_ARGS=""
if [ -n "$ROBOT_JAR" ]; then ROBOT_ARGS="$ROBOT_ARGS --robot-jar $ROBOT_JAR"; fi
if [ -n "$ROBOT" ]; then ROBOT_ARGS="$ROBOT_ARGS --robot \"$ROBOT\""; fi

# Options every Bench run gets, whether the suite or a single field.
COMMON_ARGS="--seeds $SEEDS --rounds $ROUNDS"
if [ "$PARALLEL" -gt 1 ]; then COMMON_ARGS="$COMMON_ARGS --parallel $PARALLEL"; fi
if [ -n "$CHILD_CPUS" ]; then COMMON_ARGS="$COMMON_ARGS --child-cpus $CHILD_CPUS"; fi
if [ -n "$CHILD_HEAP" ]; then COMMON_ARGS="$COMMON_ARGS --child-heap $CHILD_HEAP"; fi
if [ -n "$CPU_CONSTANT" ]; then COMMON_ARGS="$COMMON_ARGS --cpu-constant $CPU_CONSTANT"; fi
if [ -n "$REPEAT" ]; then COMMON_ARGS="$COMMON_ARGS --repeat $REPEAT"; fi
if [ "$COLD_WARM" -eq 1 ]; then COMMON_ARGS="$COMMON_ARGS --cold-warm true"; fi
if [ -n "$RETRIES" ]; then COMMON_ARGS="$COMMON_ARGS --retries $RETRIES"; fi
if [ -n "$FIELD" ]; then COMMON_ARGS="$COMMON_ARGS --field $FIELD"; fi
if [ -n "$BASELINE" ]; then COMMON_ARGS="$COMMON_ARGS --baseline $BASELINE --baseline-robot \"$BASELINE_ROBOT\""; fi
if [ "$PER_OPPONENT" -eq 1 ]; then COMMON_ARGS="$COMMON_ARGS --per-opponent ${REPORT_BASE}_per-opponent"; fi

if [ "$SEPARATE" -eq 0 ]; then
    ARGS="--suite melee-top20.txt $COMMON_ARGS --out $OUT --report $REPORT$ROBOT_ARGS"
    echo "mvn -q compile exec:java -Dexec.args=\"$ARGS\""
    step mvn -q compile exec:java -Dexec.args="$ARGS"
    code=$?
    echo "report: $REPORT"
    if [ "$DRY_RUN" -eq 1 ]; then echo "dry run: nothing was built, fetched or run"; exit 0; fi
else
    # One compile up front; the field processes then only run exec:java, so none of them
    # recompiles the tree under another.
    echo "mvn -q compile"
    step mvn -q compile
    status=$?
    if [ "$status" -ne 0 ]; then exit "$status"; fi
    if [ "$DRY_RUN" -eq 0 ]; then mkdir -p "$OUT"; fi
    run_field() {
        f=$1
        lower=$(echo "$f" | tr 'A-E' 'a-e')
        FARGS="--set melee-top20-$lower.txt --melee true --field 1000x1000 --label $f $COMMON_ARGS --out $OUT/$f --report ${REPORT_BASE}_$f.md$ROBOT_ARGS"
        echo "field $f: mvn -q exec:java -Dexec.args=\"$FARGS\" (log $OUT/$f.log)"
        if [ "$DRY_RUN" -eq 1 ]; then return 0; fi
        mvn -q exec:java -Dexec.args="$FARGS" > "$OUT/$f.log" 2>&1
        echo $? > "$OUT/$f.status"
    }
    running=0
    for f in $FIELD_LIST; do
        run_field "$f" &
        running=$((running + 1))
        if [ "$running" -ge "$FIELDS_PARALLEL" ]; then wait; running=0; fi
    done
    wait
    if [ "$DRY_RUN" -eq 1 ]; then echo "dry run: nothing was built, fetched or run"; exit 0; fi
    code=0
    for f in $FIELD_LIST; do
        s=$(cat "$OUT/$f.status" 2>/dev/null || echo 1)
        echo "field $f exit $s, report ${REPORT_BASE}_$f.md"
        if [ "$s" -ne 0 ]; then code=1; fi
    done
fi

# Pool Hadur's pairwise share per opponent across the fields (non-fatal if no python).
PAIRWISE="${REPORT_BASE}_per-opponent.md"
PY=$(command -v python3 || command -v python || true)
if [ -n "$PY" ]; then
    "$PY" ../data/tools/melee_pairwise.py --work "$OUT" --set melee-top20-set.txt --out "$PAIRWISE" \
        && echo "per-opponent table: $PAIRWISE" \
        || echo "no per-opponent table (no finished battles, or python failed)" >&2
else
    echo "python not found; run data/tools/melee_pairwise.py --work $OUT --set melee-top20-set.txt yourself" >&2
fi

# --publish (or HADUR_BENCH_PUBLISH=1): add this run's analysis to the project site (issue #102).
# A failure here never changes the run's exit code.
if [ "$PUBLISH" -eq 1 ] && [ "$DRY_RUN" -eq 0 ] && [ "$code" -eq 0 ]; then
    PUB_PY=$(command -v python3 || command -v python || true)
    if [ -n "$PUB_PY" ]; then
        "$PUB_PY" ../data/tools/publish_run.py run --work "$OUT" --label "$LABEL" --report "$PAIRWISE" || echo "publish failed; the run is unaffected" >&2
    else
        echo "publish skipped: python not found" >&2
    fi
fi
exit "$code"
