#!/bin/bash
# Load-check every melee census field on the bench's Robocode (docs/bench/melee-broken-1.11.2.md).
#   tools/loadcheck/run.sh [SUITE_DIR] [OUT_DIR]     default melee-census-317, work/loadcheck
# Needs the opponent jars (./fetch-opponents.sh --set ...) and `mvn install -DskipTests` at the root.
# Prints the robots that failed to load, and any field whose check did not finish; each field's
# full log is OUT_DIR/<field>.log. Exits 1 if a field could not be staged or did not finish.
set -u
HERE=$(cd "$(dirname "$0")/../.." && pwd)
SUITE=${1:-melee-census-317}; OUT=${2:-$HERE/work/loadcheck}
SUITE=$(cd "$SUITE" && pwd) || exit 2
mkdir -p "$OUT" && OUT=$(cd "$OUT" && pwd) || exit 2
cd "$HERE"
mvn -q dependency:build-classpath -Dmdep.outputFile="$OUT/cp.txt" >/dev/null || exit 1
javac -cp "$(cat "$OUT/cp.txt")" -d "$OUT" tools/loadcheck/Check.java || exit 1
one() {
    F=$1; LOG=$OUT/$(basename "$F" .txt).log; H=$(mktemp -d); mkdir -p "$H/robots"; names=()
    while IFS='|' read -r n r j; do n=$(echo $n); j=$(echo $j); [[ -z "$j" || "$n" == \#* ]] && continue
        if ! cp "opponents/$j" "$H/robots/"; then echo "INPUT ERROR: no jar opponents/$j" > "$LOG"; rm -rf "$H"; return 0; fi
        names+=("$n"); done < "$F"
    (cd "$H" && timeout 900 java --add-opens=java.base/sun.net.www.protocol.jar=ALL-UNNAMED \
        --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED \
        --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.desktop/sun.awt=ALL-UNNAMED \
        -Djava.security.manager=allow -Djava.awt.headless=true -Xmx1G -XX:ActiveProcessorCount=2 \
        -cp "$OUT:$(cat "$OUT/cp.txt")" Check "$H" 3 "${names[@]}") > "$LOG" 2>&1
    echo "EXIT $?" >> "$LOG"
    rm -rf "$H"
}
export -f one; export OUT
find "$SUITE" -maxdepth 1 -name 'f*.txt' -print0 | sort -z | xargs -0 -P 2 -n 1 bash -c 'one "$1"' _
grep -h "^MISSING\|^BATTLEERROR Can't load" "$OUT"/f*.log | sort -u
bad=0
for L in "$OUT"/f*.log; do
    if grep -q "^INPUT ERROR" "$L" || ! grep -q "^EXIT 0$" "$L" || ! grep -q "^RESULT" "$L"; then
        echo "INCOMPLETE $(basename "$L" .log): $(grep -h '^INPUT ERROR\|^EXIT' "$L" | tail -1)"; bad=1
    fi
done
exit $bad
