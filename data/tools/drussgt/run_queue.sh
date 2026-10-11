#!/bin/bash
# run_queue.sh name:build:first:seeds ...
#
# Runs bench jobs against DrussGT one after another, each `seeds` cold battles of 35 rounds
# starting at seed `first`, with the probe build `build` from build_probe.sh. Needs
# bench-first-seed.patch applied to hadur-bench (for --first).
#   S  a directory holding work/hadur-bench (compiled, with target/classpath.txt and a
#      druss-only.txt set file naming the opponent's jar) and variants/ (default: here)
S=${S:-$PWD}
cd $S/work/hadur-bench
while pgrep -f "hadur.bench.Bench" > /dev/null; do sleep 5; done
for spec in "$@"; do
  IFS=: read name variant first seeds <<< "$spec"
  echo "== $name start $(date +%T)" >> $S/queue.log
  java -cp "target/classes:$(cat target/classpath.txt)" hadur.bench.Bench --mode cold --rounds 35 --first $first --seeds $seeds --set druss-only.txt --robot-jar $S/variants/$variant/hadur2.Hadur_3.5.1.jar --robot "hadur2.Hadur 3.5.1" --out work/$name --report $S/$name-report.md > $S/$name-run.log 2>&1 < /dev/null
  echo "== $name done $(date +%T)" >> $S/queue.log
done
