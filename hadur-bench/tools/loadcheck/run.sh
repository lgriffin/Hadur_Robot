#!/bin/bash
# Load-check every melee census field on the bench's Robocode (docs/bench/melee-broken-1.11.2.md).
#   tools/loadcheck/run.sh [SUITE_DIR] [OUT_DIR]     default melee-census-317, work/loadcheck
# Needs the opponent jars (./fetch-opponents.sh --set ...) and `mvn install -DskipTests` at the root.
# Prints the robots that failed to load; each field's full log is OUT_DIR/<field>.log.
set -u
HERE=$(cd "$(dirname "$0")/../.." && pwd)
SUITE=${1:-melee-census-317}; OUT=${2:-$HERE/work/loadcheck}
mkdir -p "$OUT"; cd "$HERE"
mvn -q dependency:build-classpath -Dmdep.outputFile="$OUT/cp.txt" >/dev/null || exit 1
javac -cp "$(cat "$OUT/cp.txt")" -d "$OUT" tools/loadcheck/Check.java || exit 1
one() {
    F=$1; LOG=$OUT/$(basename "$F" .txt).log; H=$(mktemp -d); mkdir -p "$H/robots"; names=()
    while IFS='|' read -r n r j; do n=$(echo $n); j=$(echo $j); [[ -z "$j" || "$n" == \#* ]] && continue
        cp "opponents/$j" "$H/robots/"; names+=("$n"); done < "$F"
    (cd "$H" && timeout 900 java --add-opens=java.base/sun.net.www.protocol.jar=ALL-UNNAMED \
        --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED \
        --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.desktop/sun.awt=ALL-UNNAMED \
        -Djava.security.manager=allow -Djava.awt.headless=true -Xmx1G -XX:ActiveProcessorCount=2 \
        -cp "$OUT:$(cat "$OUT/cp.txt")" Check "$H" 3 "${names[@]}") > "$LOG" 2>&1
    rm -rf "$H"
}
export -f one; export OUT
ls "$SUITE"/f*.txt | xargs -P 2 -I{} bash -c 'one {}'
grep -h "^MISSING" "$OUT"/f*.log | sort -u
