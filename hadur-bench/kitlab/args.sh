#!/usr/bin/env bash
# Write the bench args for one robot on a kitlab field: args.sh FIELD JAR "NAME VER" LABEL [SEEDS] [PARALLEL]
# FIELD is a name (kitlab/FIELD-field.txt) or, with a slash in it, a set file's path.
# Writes work/kitlab-<LABEL>.args (results go to work/kitlab-<LABEL>); with no PARALLEL it writes
# --parallel auto, so the bench takes the host profile's width, as the PC cards want (docs/kitlab.md).
set -euo pipefail
cd "$(dirname "$0")/.."
field=$1 jar=$2 robot=$3 label=$4 seeds=${5:-2} par=${6:-auto}
mkdir -p work
case "$field" in */*) set_file=$field ;; *) set_file=kitlab/$field-field.txt ;; esac
printf '%s\n' --set "$set_file" --seeds "$seeds" --rounds 35 --parallel "$par" --unseeded true \
    --robot-jar "$jar" --robot "$robot" --truth-log false --child-heap 512M --out "work/kitlab-$label" > "work/kitlab-$label.args"
