#!/bin/sh
# Download the opponent jars the bench set files name into opponents/ (issue #102).
#
#   ./fetch-opponents.sh                      all set files (*.txt) in this directory
#   ./fetch-opponents.sh --set top19.txt      one set file
#   ./fetch-opponents.sh --dir /tmp/opp       download somewhere else than opponents/
#
# A set line is `name | role | jar`; the jar is the third column, `-` for a sample bot the
# engine ships. Suite files (`label | options`) and session files have no third column
# ending in .jar, so they contribute nothing. Jars already present are left alone.
# Exit status is 1 if any download failed.
set -u

BASE_URL="${HADUR_OPPONENT_URL:-https://robocode-archive.strangeautomata.com/robots}"
HERE=$(cd "$(dirname "$0")" && pwd)
DIR="$HERE/opponents"
SET=""

while [ $# -gt 0 ]; do
    case "$1" in
        --set) SET="${2:?--set needs a file}"; shift 2 ;;
        --dir) DIR="${2:?--dir needs a directory}"; shift 2 ;;
        -h|--help) sed -n '2,10p' "$0" | sed 's/^# \{0,1\}//'; exit 0 ;;
        *) echo "unknown option: $1" >&2; exit 2 ;;
    esac
done

if [ -n "$SET" ]; then
    [ -f "$SET" ] || [ ! -f "$HERE/$SET" ] || SET="$HERE/$SET"
    [ -f "$SET" ] || { echo "no such set file: $SET" >&2; exit 2; }
    FILES="$SET"
else
    FILES=$(ls "$HERE"/*.txt)
fi

mkdir -p "$DIR" || exit 1
JARS=$(for f in $FILES; do cat "$f"; echo; done | tr -d '\r' | awk -F'|' '
    /^[ \t]*#/ { next }
    NF >= 3 { j = $3; gsub(/^[ \t]+|[ \t]+$/, "", j); if (j ~ /\.jar$/) print j }' | sort -u)

downloaded=0; present=0; failed=0
for jar in $JARS; do
    if [ -s "$DIR/$jar" ]; then
        present=$((present + 1))
        continue
    fi
    if curl -fsSL --retry 2 -o "$DIR/$jar.part" "$BASE_URL/$jar"; then
        mv "$DIR/$jar.part" "$DIR/$jar"
        downloaded=$((downloaded + 1))
        echo "downloaded $jar"
    else
        rm -f "$DIR/$jar.part"
        failed=$((failed + 1))
        echo "FAILED     $jar" >&2
    fi
done

echo "opponents: $downloaded downloaded, $present present, $failed failed (dir: $DIR)"
[ "$failed" -eq 0 ]
