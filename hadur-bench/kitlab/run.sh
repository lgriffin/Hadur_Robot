#!/usr/bin/env bash
# Bench one robot jar on a kitlab field (docs/kitlab.md): run.sh FIELD JAR "NAME VER" LABEL [SEEDS] [PARALLEL]
set -euo pipefail
cd "$(dirname "$0")/.."
field=$1 jar=$2 robot=$3 label=$4 seeds=${5:-2} par=${6:-3}
mkdir -p work
args=work/kitlab-$label.args
printf '%s\n' --set "kitlab/$field-field.txt" --seeds "$seeds" --rounds 35 --parallel "$par" --unseeded true \
    --robot-jar "$jar" --robot "$robot" --truth-log false --child-heap 512M --out "work/kitlab-$label" > "$args"
mvn -q exec:java -Dexec.args="@$args" > "work/kitlab-$label.log" 2>&1 || { rc=$?; echo "bench exit $rc (see work/kitlab-$label.log)" >&2; exit $rc; }
