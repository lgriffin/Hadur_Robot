#!/usr/bin/env bash
# Write the bench args for one robot on a kitlab field: args.sh FIELD JAR "NAME VER" LABEL [SEEDS] [PARALLEL]
# Writes work/kitlab-<LABEL>.args (results go to work/kitlab-<LABEL>); with no PARALLEL the bench
# sizes its workers to the host, as the PC cards want (docs/kitlab.md).
set -euo pipefail
cd "$(dirname "$0")/.."
field=$1 jar=$2 robot=$3 label=$4 seeds=${5:-2} par=${6:-}
mkdir -p work
printf '%s\n' --set "kitlab/$field-field.txt" --seeds "$seeds" --rounds 35 ${par:+--parallel "$par"} --unseeded true \
    --robot-jar "$jar" --robot "$robot" --truth-log false --child-heap 512M --out "work/kitlab-$label" > "work/kitlab-$label.args"
