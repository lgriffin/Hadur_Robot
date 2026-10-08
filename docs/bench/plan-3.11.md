# 3.11: what to attack, and the gate

2026-10-08, after [peergap-310](local/2026-10-08_peergap-310-findings.md) and
[live-3.10](live-3.10.md). No robot code is changed here: both candidates below were built, benched and left out.

## Where the score goes

Against the 45 BENCHSEES bots (`hadur-bench/gate-311.txt`), Hadur wins about 96% of rounds but takes
the score share only to 72% (rammers) and 82% (the rest), against 87% on the other PEERGAP bots. The
leak is bullet damage taken, not rounds (trusted rows of `data/bench/2026-10-08_hadur-peergap-310-local_cold.tsv`):

| Group | Battles | Share | Their hit rate | Mean distance | Their bullet damage | Their ram damage |
|---|---:|---:|---:|---:|---:|---:|
| 15 rammers | 50 | 72% | 0.46 | 181 | 2,070 | 378 |
| 30 others | 100 | 82% | 0.17 | 357 | 975 | 60 |
| 99 other PEERGAP | 330 | 87% | 0.06 | 408 | 536 | 9 |

Damage taken per round does not fall with the rounds (rounds 1-3 against 11-35: rammers 54 and 70,
others 34 and 30), so this is the way Hadur moves against them, not something it fails to learn.

## The rammer escape is right, its path is not

The escape (RAM-2/RAM-3) is the obvious suspect for rammers. Switched off (`build-ablation.sh ram2`,
3.10nr against 3.10, 15 rammers, 4 seeds, 35 rounds, Linux container,
`data/bench/2026-10-08_hadur-rammers-310nr-v310-cloud_cold.tsv`), it **loses 4.8 ± 2.3 points a bot**:
13 of 15 lose, Caligula -10.7, Machete -9.8; only SuperRamFire (+6.3) and GrubbmThree (+2.6) gain.

| Build | Share | Survival | Their hit rate | Distance | Their bullet damage | Their ram damage |
|---|---:|---:|---:|---:|---:|---:|
| 3.10 (escape) | 72.2 | 95.8 | 0.47 | 181 | 2,193 | 255 |
| 3.10nr (no escape) | 67.4 | 92.9 | 0.48 | 167 | 1,672 | 1,185 |

The escape trades ram damage (-930) for bullet damage (+520): the rammer keeps hitting 47% of its
shots while Hadur runs. The escape drives "the heading that keeps the pursuer furthest away over
the next 20 ticks", a near-straight line, which a head-on or linear gun at 180 px cannot miss.

## 3.11

1. **Escape that dodges (rammers, 15 bots, +0.10 APS at the peers' median).** Keep RAM-2's
   distance goal, but choose among headings that keep the pursuer out of ram range the one with
   the least danger from the enemy's waves (head-on and linear first), so the run is not a
   straight line. Measure: their hit rate during escape, from 0.47 down.
   **Result (RAM-4, 3.11 against 3.10, same 15 rammers, 4 seeds, cloud,
   `data/bench/2026-10-08_hadur-rammers-311a-v310-cloud_cold.tsv`): level, +0.14 ± 1.15 a bot;
   their hit rate 0.47 to 0.46, bullet damage 2,112 to 2,046.** With the escape off (3.10nr) the
   rammers also hit 0.48, so the escape's path is not where they hit Hadur: the hits come at
   ranges where no path dodges. RAM-4 is not shipped; its code is commit e2520468 on this branch's history.
2. **Movement against simple guns (30 bots, +0.18 APS).** They hit Hadur 17% of the time at
   357 px, three times the rate of the rest. Check what the surf does in the first waves against a
   head-on or linear shooter (the danger it gives to GF 0 and to the linear angle) before changing
   anything.
   **Result (flattener off, `build-ablation.sh flat`, 3.10nf against 3.10, the 30 bots, 3 seeds,
   cloud, `data/bench/2026-10-08_hadur-gungap-310nf-v310-cloud_cold.tsv`): +1.0 ± 0.75 a bot**,
   21 of 30 up; their hit rate 0.165 to 0.153, bullet damage 984 to 917. The flattener's visits
   dilute the hits that head-on, linear and pattern guns leave in one place. Whether the top 20
   (learning guns, where the flattener earns its keep) pays for it is benched next.
   **Top 20 (cloud, 3 seeds, `data/bench/2026-10-08_hadur-top20-310nf-v310-cloud_cold.tsv`):
   -1.8 ± 2.3 a bot, 13 of 20 down.** The gain on the 30 does not follow the enemy's hit rate
   (it is spread from 3% to 66%), so no hit-rate threshold separates the two groups. The mid-field
   sample (`leak-38.txt`) on Leigh's PC decides between off for everyone and a narrower rule.
   **Leigh's PC (PR #161, 8 fresh seeds on the 30, 5 on the top 20, 4 on the tail): the 30
   +0.31 [-0.60, +1.22], the top 20 -1.06 [-2.98, +0.87], the tail level.** The cloud's +1.0 did not
   hold on fresh seeds, so the flattener stays on and the mid-field step (`flat-311` step 4) is
   not needed.

**Outcome: no 3.11.** The next plan, census first, is [docs/plan-3.11-census.md](../plan-3.11-census.md). Neither change clears its own measure, so there is nothing to release.
3.10 stays live; its own clean pass (about +1.2 if the 87.7 reading holds) is the next mover.
3. **Gate:** `gate-311.txt` (45 bots), 8 seeds paired against 3.10: the pooled difference's
   interval above 0. The top 20 and the weak tail (`top20.txt`, `tail-39.txt`) stay level.

The 45 hold +0.29 APS of room at the peers' median. 3.11 realistically takes about half of it
(+0.15), so the larger part of the way to 10th is 3.10's own pass recovering (about +1.2 if the
clean-pass reading of 87.7 holds; inferred).

Also fixed here: `build-ablation.sh ram2` no longer applied after RAM-3 (3.9) changed the escape
line.
