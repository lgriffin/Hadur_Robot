#!/bin/sh
# Run one set at 0.5x, 1x and 2x of a robocode.cpu.constant (BENCH-58): the plumbing for asking
# how much a result moves with the engine's CPU budget. It only calls bench-top20.sh (or
# another bench script) once per multiplier, each with its own --cpu-constant and a label that
# says which, so the three reports and work directories sit side by side. It starts nothing
# itself; use --dry-run to see the three commands.
#
#   ./sweep-cpu-constant.sh --dry-run
#   ./sweep-cpu-constant.sh --constant 1488498 --set top20.txt --seeds 5
#   ./sweep-cpu-constant.sh --multipliers "0.5 1 2 4" --label tuned -- --parallel 8
#
# The first run builds and fetches (unless --skip-build / --skip-fetch are passed after "--");
# the later ones skip both. Everything after "--" goes to the bench script unchanged.
#
# Options (all optional):
#   --constant NANOS       the 1x constant; default the one in the host's Robocode config
#   --multipliers LIST     space-separated multipliers, default "0.5 1 2"
#   --set FILE             opponent set, default top20.txt
#   --seeds N              battles per opponent, default 5
#   --label NAME           base label; each run is <label>-cpu<multiplier>x, default sweep
#   --script FILE          the bench script to run, default ./bench-top20.sh
#   --dry-run              print the commands and the constants, run nothing
set -u

HERE=$(cd "$(dirname "$0")" && pwd)
cd "$HERE" || exit 1

CONSTANT=""
MULTIPLIERS="0.5 1 2"
SET="top20.txt"
SEEDS=5
LABEL="sweep"
SCRIPT="./bench-top20.sh"
DRY_RUN=0

while [ $# -gt 0 ]; do
    case "$1" in
        --constant) CONSTANT="${2:?--constant needs nanoseconds}"; shift 2 ;;
        --multipliers) MULTIPLIERS="${2:?--multipliers needs a list such as \"0.5 1 2\"}"; shift 2 ;;
        --set) SET="${2:?--set needs a file}"; shift 2 ;;
        --seeds) SEEDS="${2:?--seeds needs a number}"; shift 2 ;;
        --label) LABEL="${2:?--label needs a name}"; shift 2 ;;
        --script) SCRIPT="${2:?--script needs a file}"; shift 2 ;;
        --dry-run) DRY_RUN=1; shift ;;
        -h|--help) sed -n '2,/^set -u$/p' "$0" | sed '$d' | sed 's/^# \{0,1\}//'; exit 0 ;;
        --) shift; break ;;
        *) echo "unknown option: $1" >&2; exit 2 ;;
    esac
done

if [ -z "$CONSTANT" ]; then
    for props in "/c/robocode/config/robocode.properties" "C:/robocode/config/robocode.properties" \
                 "${ROBOCODE_HOME:-/nonexistent}/config/robocode.properties"; do
        if [ -f "$props" ]; then
            CONSTANT=$(tr -d '\r' < "$props" | sed -n 's/^[[:space:]]*robocode\.cpu\.constant[[:space:]]*=[[:space:]]*\([0-9][0-9]*\).*/\1/p' | head -n 1)
            if [ -n "$CONSTANT" ]; then
                echo "using robocode.cpu.constant=$CONSTANT from $props"
                break
            fi
        fi
    done
fi
if [ -z "$CONSTANT" ]; then
    echo "no robocode.cpu.constant found; pass --constant NANOS" >&2
    exit 2
fi

first=1
code=0
for m in $MULTIPLIERS; do
    nanos=$(awk -v c="$CONSTANT" -v m="$m" 'BEGIN { printf "%d", c * m + 0.5 }')
    if [ "$nanos" -lt 1 ]; then
        echo "multiplier $m gives a constant below 1 from $CONSTANT" >&2
        exit 2
    fi
    run_label="$LABEL-cpu${m}x"
    skips=""
    if [ "$first" -eq 0 ]; then skips="--skip-build --skip-fetch"; fi
    echo "$m x: robocode.cpu.constant=$nanos, label $run_label"
    if [ "$DRY_RUN" -eq 1 ]; then
        echo "dry run, would run: $SCRIPT --set $SET --seeds $SEEDS --cpu-constant $nanos --label $run_label $skips $*"
    else
        # $skips is two words and must split; the arguments after "--" keep their own quoting.
        # shellcheck disable=SC2086
        "$SCRIPT" --set "$SET" --seeds "$SEEDS" --cpu-constant "$nanos" --label "$run_label" $skips "$@"
        status=$?
        if [ "$status" -ne 0 ]; then code=$status; fi
    fi
    first=0
done
exit "$code"
