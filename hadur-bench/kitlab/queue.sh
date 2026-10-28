#!/usr/bin/env bash
# Run kitlab benches one after another: queue.sh "FIELD JAR NAME_VER LABEL" ... (NAME_VER with _ for the space)
cd "$(dirname "$0")/.."
for job in "$@"; do
    set -- $job
    kitlab/run.sh "$1" "$2" "${3/_/ }" "$4"
done
