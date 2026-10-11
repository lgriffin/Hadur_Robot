# 3.12 plan: the ranks 401+ gap

Status: P1 and P2 ready to run on the PC (`hadur-bench/plans/p312.queue`). Built on the 3.11
census (docs/plan-3.11-census.md) and the 3.11 live read (docs/bench/live-3.11.md).

## Where we stand

3.11 reads 87.56, 13th; 10th is Knight at 87.68 and ranks 8 to 13 sit inside 0.16 APS, under the
noise floor. To be 10th on more reads than not, 3.12 needs a real gain of about +0.3 APS, the
census's release line.

## Where the losses are

Live, 3.11's page against Tomcat's, Knight's and Raven's per-opponent scores (their compare pages
of 2026-10-07; none of the three has changed since), APS by band:

| Band (ranks) | vs Tomcat | vs Knight | vs Raven |
|---|---:|---:|---:|
| 1 (1-10) | +0.05 | +0.03 | +0.06 |
| 2 (11-50) | +0.02 | -0.03 | +0.14 |
| 3 (51-200) | **+0.47** | **+0.53** | **+0.74** |
| 4 (201-400) | +0.13 | +0.15 | +0.12 |
| 5 (401-700) | **-0.34** | **-0.37** | **-0.58** |
| 6 (701+) | **-0.49** | **-0.42** | **-0.65** |
| All | -0.16 | -0.12 | -0.18 |

Every peer shows the same shape: Hadur wins the mid-table and gives it back against the weak
817. Against the median of the three, the 401+ deficit is -1.01 APS, and it is diffuse:

| 401+ pairings, Hadur minus peer median | Bots | APS |
|---|---:|---:|
| 10 or more behind | 6 | -0.08 |
| 5 to 10 behind | 72 | -0.40 |
| 0 to 5 behind | 534 | -0.72 |
| ahead | 205 | +0.19 |

So the loss is not a few broken pairings: it is a point or so on most weak bots. The bench says
what the point is made of. Census-312 M5 (Tomcat and 3.10nd, which plays as 3.11, on the same
opponents and seeds), mean per 35-round battle:

| | Band 5: Tomcat | Hadur | Band 6: Tomcat | Hadur |
|---|---:|---:|---:|---:|
| Score share | 89.1% | 88.1% | 97.1% | 96.1% |
| Our score | 4,534 | 4,433 | 5,099 | 5,124 |
| Their score | 605 | 647 | 155 | 209 |
| Their bullet damage on us | 545 | 552 | **147** | **188** |
| Their survival points | 29 | **51** | 3 | 11 |
| Our bullet damage | 2,057 | **1,987** | 2,500 | 2,525 |
| Our ram damage | 2 | 13 | 1 | 7 |

- Ranks 701+: Hadur kills as fast as Tomcat but is hit 28% more. 71% of these opponents do more
  bullet damage to Hadur than to Tomcat. Bots this low mostly carry simple guns (head-on, linear,
  circular; inferred, not checked bot by bot), so this reads as movement and distance against them.
- Ranks 401-700: Hadur loses about 0.4 more rounds a battle (22 survival points at 50 a round)
  and deals 3% less damage. 33 of 1,200 battles drop below 70% share against Tomcat's 17.
- Hadur rams where Tomcat does not (7 to 13 ram damage a battle against 1 to 2), which means it
  spends time at contact range with bots that still have a gun.

## What 3.12 tests, and why these

Hadur fights weak bots closer than strong ones. DIST-1 walks the distance in from 650 to a
400 px floor whenever Hadur out-hits the enemy, which against the weak 817 is nearly always
(mean distance 390 px in both bands), and END-1 closes to 150 px to finish a low enemy ("at
150 px any gun hits", DistancePolicy). Both were set on S5's small sample. A simple gun's hit
rate rises steeply as distance falls, so both are candidates for the extra damage taken. This
is inferred from the table above, not measured: no bench run has varied them since S5.

| Step | Candidate | Edit (build-ablation.sh, from v3.11) | Question |
|---|---|---|---|
| P1 `ne` | 3.11ne | END-1 keeps the fighting distance | Does closing to finish cost more than it wins? |
| P1 `f5` | 3.11f5 | DIST-1 floor 500 instead of 400 | Does the walk-in cost more bullets than it wins? |
| P1 `nef5` | 3.11nef5 | both | Do they add? |
| P2 `vol` | 3.11nm | MIR-1 off, on the 38 volatile and mirror bots, 8 seeds | Are the all-or-nothing pairings (MirrorMicro, NaN, Mimic: 0.08 APS live) a mirror-handling fault? |

P2 doubles as the round-by-round record of the bad battles: 3.11's rounds file from it is what
the follow-up reads, whether or not MIR-1 off helps.

Not retested: the flattener (off lost 1.06 on the top 20, PR #161), duress (gone), RAM-2.

## Gates

- **P1 (screen, 400 bots, 2 seeds):** paired mean at least +0.15 APS with the 95% interval above
  0, and no band below -0.05 APS. The top bands must hold: a candidate that gives back band 3's
  lead fails even if the total passes.
- **P3 (full census, 1,212 bots, seeds 401-404):** the best P1 survivor against 3.11. The seeds
  are census-312's, so Tomcat's M5 rows compare directly: candidate minus Tomcat is the P3 gain
  plus M5's +0.08 (3.10nd plays as 3.11), and no new Tomcat run is needed. Release at +0.3 or
  more over Tomcat.
- **Live:** read after second battles, with `live_passes.py collapses` and the band table of
  live-3.11.md.

## Running P1 and P2 on the PC

1. Stop the RoboRumble workers; `jps -l` shows no Robocode JVM.
2. Pull master, then from `hadur-bench\`: `.\queue.ps1 run p312` (or `./queue.sh run p312`). The
   `prep` step downloads the 3.11 jar and builds the four candidates; the other steps depend only
   on `prep`. About 3.6 hours.
3. Commit each step's rows TSV, report and rounds file for `vol` (not the per-opponent folders)
   and post the branch in the thread.
