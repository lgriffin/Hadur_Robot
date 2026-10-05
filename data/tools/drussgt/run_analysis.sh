#!/bin/bash
# run_analysis.sh WORK OUT
#
# Every analysis output of the bench session of 4 and 5 October 2026 (Hadur 3.5.1 and five
# probe builds against DrussGT 3.1.16), from the truth logs under WORK to text files in OUT.
# WORK holds the `--out` directories of the session's bench jobs:
#   base (3.5.1 as released), l0 + l0b (lead-aware power), l2 + l2b (the same, sampled aim),
#   g1 (random gun), c0 (all chaff), p0 (hold fire)
# The tables in data/bench come from `export_tables.py --session WORK`, the model's output
# from `model_runs.py`; neither is run here.
set -e
WORK=${1:?usage: run_analysis.sh WORK OUT}; OUT=${2:?usage: run_analysis.sh WORK OUT}
HERE=$(cd "$(dirname "$0")" && pwd)
mkdir -p "$OUT"
run() { echo "$1=$(echo "${@:2}" | sed "s#\([^ ]*\)#$WORK/\1/battles#g; s# #,#g")"; }
RELEASED=$(run released base);       LEAD=$(run lead-aware l0 l0b)
SAMPLED=$(run lead-aware-sampled l2 l2b); RANDOM_GUN=$(run random-gun g1)
CHAFF=$(run all-chaff c0);           HOLD=$(run hold-fire p0)
ALL="$RELEASED $LEAD $SAMPLED $RANDOM_GUN $CHAFF $HOLD"
for spec in $ALL; do
  name=${spec%%=*}
  python3 "$HERE/analyze.py" "$spec" > "$OUT/analyze-$name.txt"
  python3 "$HERE/econ.py" "$spec" > "$OUT/econ-$name.txt"
  python3 "$HERE/energy_trace.py" "$spec" > "$OUT/energy-$name.txt"
done
python3 "$HERE/shares.py" $ALL > "$OUT/shares.txt"
python3 "$HERE/shares.py" $LEAD $SAMPLED > "$OUT/shares-sampled-aim.txt"
python3 "$HERE/outcomes.py" $ALL > "$OUT/outcomes.txt"
python3 "$HERE/endings.py" $ALL > "$OUT/endings.txt"
python3 "$HERE/extras.py" $ALL > "$OUT/extras.txt"
python3 "$HERE/evidence_replay.py" "$RELEASED" > "$OUT/evidence-replay.txt"
echo "analysis written to $OUT"
