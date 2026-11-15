#!/usr/bin/env bash
# SURF-BANK-1 whole-field cloud test, one part (1-6) on one cloud box.
#   bash run-part.sh N            (from anywhere; resumes if rerun)
# Builds c (switch off), aa (A/A copy) and sb (bank on) from branch claude/project-thread-y0plb3 in its own
# worktree /home/user/sbwt, so the box's own bisect/ jars and queue are untouched. Runs part N of the field
# (plans/surfbank/field-N.txt), 3 arms x 2 seeds from 37900, live timing, no truth log, then copies the
# battle results to /mnt/project-files/coverage/shards/surf-field/partN/ for the owning thread to read.
set -euo pipefail
N="$1"
MAIN=/home/user/Hadur_Robot
WT=/home/user/sbwt
BR=claude/project-thread-y0plb3
WANT=power25
OUT=/mnt/project-files/coverage/shards/surf-field/part$N
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
./fetch-opponents.sh --set "plans/surfbank/field-$N.txt" 2>&1 | tail -1 | tee -a "$OUT/status.txt" || true
log "running part $N"
mvn -q -Drobocode.version=1.11.2 exec:java -Dexec.args="--set plans/surfbank/field-$N.txt --seeds 2 --seed-base 37900 --out work/surf-field-$N --arms plans/surfbank/surfbank.arms --truth-log false --rounds 35 --parallel 2 --child-cpus 2 --cpu-constant live --job-order shuffled --failed-ok true" || log "bench exit $?"
cd "work/surf-field-$N"
mkdir -p "$OUT/battles"
cp -f arms.tsv conditions.json "$OUT/" 2>/dev/null || true
[[ -f report.md ]] && cp -f report.md "$OUT/"
for d in battles/*/; do
    b=$(basename "$d"); [[ -s "$d/result.csv" ]] || continue
    mkdir -p "$OUT/battles/$b"; cp -f "$d"/result.csv "$d"/rounds.tsv "$d"/arm-row.tsv "$OUT/battles/$b/" 2>/dev/null || true
done
log "done part $N: $(ls "$OUT/battles" | wc -l) battles copied"
