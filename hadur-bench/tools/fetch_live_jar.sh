#!/usr/bin/env bash
# Fetch the RELEASED Hadur jar that is live on the rumble into bisect/live/, checked by sha256 (BENCH-245).
# The live-match arm c (plans/livematch.arms) must be this jar, never a master build: master carries lines and
# fixes live has not seen (PR #819: a master build read 6.8 points above live 3.22 while BeepBoop matched live).
# When a new version goes live, move LIVE_V, LIVE_SHA, plans/livematch.arms and plans/live-1v1-*.tsv together.
set -euo pipefail
LIVE_V=3.22
LIVE_SHA=976498919049c66cbda72f4f8808ff030e753f4ac411e9332eb753900c7ce8ca
JAR=bisect/live/hadur117.Hadur_${LIVE_V}.jar
mkdir -p bisect/live
ok() { python3 -c "import hashlib,sys; sys.exit(hashlib.sha256(open(sys.argv[1],'rb').read()).hexdigest()!=sys.argv[2])" "$1" "$LIVE_SHA"; }
if [ -f "$JAR" ] && ! ok "$JAR"; then echo "cached $JAR fails sha256, fetching again"; rm -f "$JAR"; fi
if [ ! -f "$JAR" ]; then
  rm -f "$JAR.part"
  curl -fsSL -o "$JAR.part" "https://github.com/lgriffin/Hadur_Robot/releases/download/v${LIVE_V}/hadur117.Hadur_${LIVE_V}.jar"
  if ! ok "$JAR.part"; then rm -f "$JAR.part"; echo "downloaded jar fails sha256" >&2; exit 1; fi
  mv "$JAR.part" "$JAR"
fi
echo "live jar $JAR ok"
