#!/usr/bin/env bash
# SURF-BANK-1 whole-field cloud test, one part (1-6) on one cloud box.
#   bash run-part.sh N            (from anywhere; resumes if rerun)
# Builds c (switch off), aa (A/A copy) and sb (bank on) from branch claude/project-thread-y0plb3 in its own
# worktree /home/user/sbwt, so the box's own bisect/ jars and queue are untouched. Runs part N of the field
# (plans/surfbank/field-N.txt), 3 arms x 2 seeds from 37900, live timing, no truth log, then copies the
# battle results to /mnt/project-files/coverage/shards/surf-field/partN/ for the owning thread to read.
set -euo pipefail
N="$1"
X="${2:-}"          # "b": the extra seeds 37902-3, into partNb
SB=37900; [[ "$X" == b ]] && SB=37902
SEEDS=2; ARMS=plans/surfbank/surfbank.arms
# "low c": the low-gap confirm, field-low.txt, c and sb only, 1 seed 37904
[[ "$X" == c ]] && { SB=37904; SEEDS=1; ARMS=plans/surfbank/surfbank2.arms; }
MAIN=/home/user/Hadur_Robot
WT=/home/user/sbwt
BR=claude/project-thread-y0plb3
WANT=power25
OUT=/mnt/project-files/coverage/shards/surf-field/part$N$X
mkdir -p "$OUT"
log() { echo "$(date -u +%FT%TZ) $*" | tee -a "$OUT/status.txt"; }
if [[ "$(cat "$WT/.sb-built" 2>/dev/null)" != "$WANT" ]]; then
    log "building"
    git -C "$MAIN" fetch -q origin "$BR"
    git -C "$MAIN" worktree remove --force "$WT" 2>/dev/null || rm -rf "$WT"
    git -C "$MAIN" worktree add --detach "$WT" FETCH_HEAD >/dev/null
    cd "$WT"
    mvn -q install -DskipTests -Drobocode.version=1.11.2 -pl hadur-robot,hadur-bench -am
    mkdir -p hadur-bench/bisect
    cp hadur-robot/target/hadur117.Hadur_3.22.jar hadur-bench/bisect/
    cd hadur-bench
    ./build-ablation.sh aa
    ./build-ablation.sh surfbank
    ls bisect/hadur117.Hadur_3.22.jar bisect/hadur117.Hadur_3.22aa.jar bisect/hadur117.Hadur_3.22sb.jar
    rm -rf opponents && ln -s "$MAIN/hadur-bench/opponents" opponents
    echo "$WANT" > "$WT/.sb-built"
    log "built $(git -C "$WT" rev-parse --short HEAD)"
fi
[[ -n "${BUILD_ONLY:-}" ]] && exit 0
cd "$WT/hadur-bench"
# Opponent jars: the shared copy first (1,193 of the 1,194, fetched once), then the archive; a robot whose jar
# is still missing (jd.Nullstride 2.3.3 is 404 on the archive) is dropped from this box's panel.
SHARED=/mnt/project-files/coverage/shards/surf-field/opponents
PANEL="work/field-$N-present.txt"
mkdir -p work
grep -v '^#' "plans/surfbank/field-$N.txt" | awk -F'|' '{gsub(/ /,"",$3); print $3}' | while read -r j; do
    [[ -f "opponents/$j" || ! -f "$SHARED/$j" ]] || cp "$SHARED/$j" opponents/
done
./fetch-opponents.sh --set "plans/surfbank/field-$N.txt" 2>&1 | tail -n 1 | tee -a "$OUT/status.txt" || true
grep -v '^#' "plans/surfbank/field-$N.txt" | while IFS= read -r line; do
    j=$(echo "$line" | awk -F'|' '{gsub(/ /,"",$3); print $3}')
    if [[ -f "opponents/$j" ]]; then echo "$line"; else log "dropped (no jar): $line"; fi
done > "$PANEL"
log "running part $N$X (seeds from $SB)"
mvn -q -Drobocode.version=1.11.2 exec:java -Dexec.args="--set $PANEL --seeds $SEEDS --seed-base $SB --out work/surf-field-$N$X --arms $ARMS --truth-log false --rounds 35 --parallel 2 --child-cpus 2 --cpu-constant live --job-order shuffled --failed-ok true" || rc=$?
[[ ${rc:-0} -ne 0 ]] && log "bench exit $rc"
cd "work/surf-field-$N$X"
mkdir -p "$OUT/battles"
cp -f arms.tsv conditions.json "$OUT/" 2>/dev/null || true
[[ -f report.md ]] && cp -f report.md "$OUT/"
for d in battles/*/; do
    b=$(basename "$d"); [[ -s "$d/result.csv" ]] || continue
    mkdir -p "$OUT/battles/$b"; cp -f "$d"/result.csv "$d"/rounds.tsv "$d"/arm-row.tsv "$OUT/battles/$b/" 2>/dev/null || true
done
log "done part $N: $(ls "$OUT/battles" | wc -l) battles copied"
exit ${rc:-0}
