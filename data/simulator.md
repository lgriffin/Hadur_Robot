# Would a simulator help?

Written 2026-09-29, when the question was how to learn from the rumble without waiting days
for each release's rating to settle. Short answer: the bench already is the simulator, and
it is a good one while the rumble client behaves (L-02). What is missing is not a new
simulator but three pieces around the bench, two of which R4 already plans.

## What "simulator" could mean here

| Idea | What it would do | Already covered by | Verdict |
|---|---|---|---|
| Battle simulator | Play Hadur against opponents and measure share | `hadur-bench`: the real engine and the real opponent jars | Have it. Live APS before 08:30 matched it within noise (L-02). |
| Fast physics model | Replace Robocode with a faster headless model for tuning | Replay fixtures cover Hadur's own logic headless | Not worth it. Opponents are jars; a model of them is the thing we would be guessing. |
| Rating projector | Turn a bench sample into a population APS and a rank | BENCH-1 (R0): stratum-weighted APS over `rumble-sample.txt` | Finish BENCH-1, then add a rank lookup. Small. |
| Page replay | Read a saved BotDetails page and slice it by band, hour, before/after, live minus bench | BENCH-5 (R4) | R4 owns it. The fixture is in `rumble/pages/`. |
| Client-conditions simulator | Reproduce what a rumble client does to Hadur (shared data directory, CPU constant, load, engine, JVM) | BENCH-4 (R4) | R4 owns it. This is the one that could explain L-01. |

## Recommendations

1. **Build nothing new now.** Each idea worth having is small and sits next to code the climb
   thread is changing (`hadur-bench`), so it belongs in those stages rather than in a
   parallel tool that would drift.
2. **Add a "real client" condition to BENCH-4.** The rumble's own client (`roborumble.sh`
   in the Robocode install) with uploads turned off and the participants list pointed at a
   local copy (`rumble/parsed/*_participants_jars.txt`) runs Hadur the way the live rumble
   does: many opponents in a row, one data directory, the client's own settings. If any
   single condition reproduces L-01's lost rounds, it is this one. Needs a spike to confirm
   the client runs offline.
3. **Fill BENCH-1's strata from the archive.** `rumble-sample.txt` has only the top-30
   stratum, so BENCH-1 cannot yet estimate APS. The BotDetails CSV gives 507 opponents with
   their APS and the participants list gives their jars, which is enough to draw ranks
   31-150, 151-500 and 501+. With that, and a rank lookup against the latest rankings
   snapshot, a candidate build gets a predicted APS and rank before it is released.
4. **Keep saving pages.** Each release's BotDetails page after a few hundred pairings and a
   same-day rankings page are the only way to check a prediction. They go in
   `rumble/pages/` (see the README).

## Reproducing L-02

```python
import csv, statistics as st
live = {r["Name"]: r for r in csv.DictReader(open(
    "data/rumble/parsed/2026-09-28T1724Z_roborumble_botdetails_hadur2.Hadur_3.0.csv"))}
pairs = [(float(b["score_share"]), float(live[b["opponent"]]["APS"]),
          live[b["opponent"]]["Latest Battle"][11:16] < "08:30")
         for b in csv.DictReader(open("data/bench/duel-history.tsv"), delimiter="\t")
         if b["report"] == "roborumble-top50.md" and b["score_share"] and b["opponent"] in live]
print(len(pairs), st.correlation([p[0] for p in pairs], [p[1] for p in pairs]))
for before in (True, False):
    print(before, st.mean(l - s for s, l, t in pairs if t == before))
```

Output on 2026-09-29: 20 pairs, correlation 0.84; live minus bench -0.1 before 08:30 and
-5.9 after.
