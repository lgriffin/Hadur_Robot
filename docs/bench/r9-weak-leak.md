# R9 bench: the weak-bot leak (3.4 → 3.5)

Issue [#80](https://github.com/lgriffin/Hadur_Robot/issues/80): 3.4 is 20th in the 1v1
RoboRumble, but its KNN PBI against the 716 robots ranked below 500 is −1.7, about 1.0 APS,
most of it lost to rammers and mirror movers. R9 adds RAM-2 (run from a confirmed rammer)
and MIR-1 (a planned path and aim against a mirror mover); see
[requirements.md](../requirements.md#r9-notes-the-weak-bot-leak-shipped-as-35).

All runs: cold (data wiped before every battle), 35 rounds, 800x600, Robocode 1.9.5.6, Java
21, 4 processes on 4 cores. 3.4 is the released jar. Shares are Hadur's share of the two
robots' total score. "Ticks within 100 px", the mean distance and the damage come from the
engine's truth log; RAM-2 ticks and MIR-1 shots from Hadur's round records (fields 35, 36).

## 1. Hypothesis 0: is the leak live-only? No

If the weak-tier losses were live-only stalls (skipped turns, a slow client), the bench
would not reproduce them. It does: 3.4 scores within a few points of its live result
against the same bots, and loses 203 of 3,850 rounds. Against rammers it spends most of
every round within 100 px, which is where they fire their power-3 shots. Skipped turns are
low (0.6 to 8 a battle except MirrorMicro's 29, over rounds of 1,300 ticks).

## 2. Weak set: 11 bots x 10 battles (`hadur-bench/weak-leak.txt`)

| Opponent | Kind | 3.4 live | 3.4 bench | 3.5 bench | Change | Rounds lost 3.4 / 3.5 | Ticks within 100 px per round 3.4 / 3.5 | Mean distance 3.4 / 3.5 | Damage dealt / taken per round, 3.4 → 3.5 | RAM-2 ticks / round | MIR-1 shots / round |
|---|---|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | rammer | 74.7% | 75.9% | 96.0% | +20.1 | 2 / 0 | 219.1 / 60.0 | 118 / 341 | 119/64 → 96/7 | 105.9 | 0.0 |
| bbo.RamboT 0.3 | rammer | 79.8% | 81.5% | 96.9% | +15.4 | 6 / 0 | 132.8 / 12.9 | 154 / 394 | 90/27 → 92/5 | 101.1 | 0.0 |
| PSW.Relentless 0.1 | rammer | 83.3% | 85.9% | 98.0% | +12.1 | 1 / 0 | 178.1 / 39.6 | 159 / 366 | 101/27 → 96/3 | 116.7 | 0.0 |
| mahrgell.mahrram 1.3 | rammer | 65.0% | 64.6% | 79.9% | +15.3 | 27 / 4 | 199.1 / 70.3 | 99 / 323 | 81/50 → 101/41 | 128.0 | 0.0 |
| sample.RamFire | rammer | 88.9% | 92.4% | 99.5% | +7.1 | 0 / 0 | 114.3 / 8.9 | 230 / 454 | 97/12 → 100/1 | 113.9 | 0.0 |
| stelo.MirrorNano 1.4 | mirror | 70.7% | 77.1% | 93.3% | +16.2 | 28 / 1 | 69.4 / 20.3 | 540 / 457 | 24/19 → 70/10 | 0.3 | 7.2 |
| stelo.MirrorMicro 1.1 | mirror | 73.2% | 68.9% | 84.2% | +15.3 | 65 / 20 | 3.6 / 9.9 | 641 / 491 | 32/26 → 63/20 | 0.4 | 6.6 |
| zyx.nano.RedBull 1.0 | nano | 77.1% | 75.9% | 87.3% | +11.4 | 18 / 1 | 143.8 / 76.7 | 136 / 302 | 81/27 → 87/17 | 101.1 | 0.0 |
| bwbaugh.nano.Tirunculus 0.0.0a | nano | 67.1% | 69.3% | 85.2% | +15.9 | 11 / 0 | 191.6 / 64.3 | 100 / 339 | 85/44 → 110/32 | 119.1 | 0.0 |
| demetrix.nano.SledgeHammer 0.22 | nano | 61.0% | 65.3% | 67.6% | +2.3 | 21 / 19 | 201.9 / 124.2 | 92 / 270 | 79/52 → 115/83 | 145.1 | 0.0 |
| mz.NanoDeath 2.56 | nano | 62.7% | 65.5% | 66.9% | +1.4 | 24 / 24 | 198.1 / 115.2 | 92 / 272 | 78/51 → 112/82 | 140.6 | 0.0 |
| **All 11** | | | **74.8%** | **86.8%** | **+12.0** | **203 / 69** of 3,850 | | | | | |

Hypotheses and outcomes:

- **RAM-2: running from a rammer keeps it out of point-blank range and wins the rounds
  3.4 lost.** Confirmed. Rammers +7.1 to +20.1 points, time within 100 px down from 114-219
  ticks a round to 9-70, rounds lost 36 → 4. Three nanos that fight at point-blank range
  are rammers by this definition too and gain as much (RedBull +11.4, Tirunculus +15.9).
- **MIR-1: against a mirror mover, a planned path makes the mirror image predictable.**
  Confirmed. MirrorNano +16.2, MirrorMicro +15.3, rounds lost 93 → 21; damage dealt per
  round up from 24-32 to 63-70.
- **Not fixed:** SledgeHammer (+2.3) and NanoDeath (+1.4). Running keeps them out of
  point-blank range but not out of their guns' (they take 82-83 damage a round from 270 px).

The first cut (no confirmation for RAM-2, a 30-scan run and the axis mirrors for MIR-1)
scored 87.9% here; 3.5's stricter detectors cost 1.1 points (a rammer now needs rams in
two rounds before the escape starts, and a mirror 120 scans), which is the price of
section 3.

## 3. Top-19 regression gate: 18 bots x 3 battles (`hadur-bench/top19.txt`)

jd.Nullstride 2.3.0 has no archive copy. "Candidate 4" is 3.5 except that one ram (not
two rounds of them) confirmed a rammer.

| Opponent | 3.4 | First cut (no confirmation) | Candidate 4 | Candidate 4 minus 3.4 | RAM-2 ticks / round (cand. 4) | MIR-1 shots / round (cand. 4) | Skipped turns 3.4 / cand. 4 |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 17.3% | 18.0% | 18.0% | +0.7 | 0.0 | 0.0 | 154 / 109 |
| jk.mega.DrussGT 3.1.16 | 30.0% | 27.9% | 31.4% | +1.4 | 0.0 | 0.0 | 220 / 123 |
| oog.mega.saguaro.Saguaro 1.0 | 75.4% | 67.4% | 73.3% | -2.1 | 0.0 | 0.0 | 94 / 19 |
| aaa.r.ScalarR 0.005h.053-noshield | 33.0% | 25.5% | 27.6% | -5.4 | 0.0 | 0.0 | 171 / 118 |
| voidious.Diamond 1.8.22 | 30.5% | 28.2% | 26.8% | -3.7 | 0.0 | 0.0 | 78 / 90 |
| cb.fire.Firestarter 2.0f | 34.5% | 34.9% | 40.7% | +6.2 | 0.0 | 0.0 | 178 / 90 |
| lxx.Tomcat 3.68 | 46.3% | 48.6% | 44.6% | -1.7 | 0.0 | 0.0 | 168 / 89 |
| rsalesc.mega.Knight 0.6.28 | 45.2% | 36.7% | 43.7% | -1.5 | 0.0 | 0.0 | 76 / 90 |
| dsekercioglu.mega.Raven 3.56j8 | 59.4% | 45.0% | 61.0% | +1.6 | 0.0 | 0.0 | 34 / 35 |
| xander.cat.XanderCat 12.9 | 55.5% | 40.4% | 45.7% | -9.8 | 85.2 | 0.0 | 54 / 31 |
| aw.Gilgalad 1.99.5c | 38.0% | 35.0% | 51.5% | +13.5 | 0.0 | 0.0 | 113 / 65 |
| pc.Wavelet 1.5 | 46.0% | 41.5% | 43.7% | -2.3 | 0.0 | 0.0 | 38 / 32 |
| kc.serpent.WaveSerpent 2.11 | 52.5% | 58.9% | 54.1% | +1.6 | 0.0 | 0.0 | 9 / 16 |
| gh.GresSuffurd 0.4.13 | 63.6% | 58.5% | 69.6% | +6.0 | 0.0 | 0.0 | 59 / 23 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 70.1% | 66.0% | 67.4% | -2.7 | 0.0 | 0.0 | 67 / 50 |
| cs.Nene 1.0.5 | 58.5% | 56.4% | 63.5% | +5.0 | 0.0 | 0.0 | 6 / 15 |
| jk.melee.Neuromancer 7.12 | 53.6% | 38.4% | 49.3% | -4.3 | 0.0 | 0.0 | 47 / 46 |
| voidious.Dookious 1.573c | 65.5% | 57.0% | 67.0% | +1.5 | 0.0 | 0.0 | 25 / 18 |
| **Mean of 18** | **48.6%** | **43.6%** | **48.8%** | **+0.2** | | | |

- **The first cut failed the gate** (mean 48.6% → 43.6%, Raven −14.4, Neuromancer −15.2,
  Knight −8.5): strong robots close in on a four-scan charge all the time, and both
  detectors switched on against them.
- **Candidate 4's** detectors stayed off against every top-19 robot but one: XanderCat,
  spawned 190 px away, drove straight through us at the start of one round (its −9.8). With
  nothing switched on, a battle is played exactly as 3.4 plays it, so the other 17 rows
  (mean +0.8, sd 4.8 across bots) are the bench's noise at 3 battles.
- **3.5** needs rams in two different rounds. Replayed over all 81 top-19 battles' truth
  logs (3.4, the first cut and candidate 4), no top-19 robot rammed in more than one round
  of a battle, while every rammer and close-range nano rammed in 13 to 35 of its 35 rounds.
  MIR-1's rule (120 scans under 30 px, both robots above 10 energy) is met by no top-19
  battle on the same logs (longest run 80) and by both mirror bots in every battle (shortest
  152). So against the top 19, 3.5 plays as 3.4 does.

## 4. Cost

- RAM-2's escape takes about 0.2 ms a tick (24 headings x 2 orientations x 20 ticks, with
  pruning), only while it runs; the first cut's 0.26 ms version tripled skipped turns
  against rammers, the pruned one does not (weak set 726 skipped turns with 3.4, 359 with
  3.5, over 110 battles).
- MIR-1's plan costs about 5 µs a tick; the detector's nine running errors are negligible.

## 5. Offline: why MIR-1 plans its path

On 3.4's MirrorNano and MirrorMicro truth logs, a virtual bullet of power 2 every 7 ticks,
against the real positions (including real bullet collisions):

| Aim | MirrorNano | MirrorMicro |
|---|---|---|
| Head-on | 30% | 18% |
| Linear | 27% | 11% |
| Reflection of a straight-line guess of our own path | 15% | 9% |
| Reflection of our real path 2 ticks late | 71% | 86% |
| Reflection of our real path 5 ticks late | 75% | 87% |
| Their real position (upper bound) | 95% | 94% |

The gun needs our own future path, which a surf decides a tick at a time; so MIR-1 decides
it 110 ticks ahead instead.

## Review follow-up (after 3.5)

Two fixes from the PR #81 review: the MIR-1 gun aims from the planned position rather than a
straight-line guess, and RAM-2 plays a rammer driving backward along its direction of travel.
Neither path switches on against the top 19, so only the weak set was re-benched (same 10 seeds).

| Opponent | 3.5 | follow-up |
|---|---|---|
| stelo.MirrorMicro 1.1 | 83.3% ± 13.8 | 91.7% ± 1.3 |
| zyx.nano.RedBull 1.0 | 87.4% | 93.7% |
| demetrix.nano.SledgeHammer 0.22 | 67.6% | 69.2% |
| mz.NanoDeath 2.56 | 67.0% | 68.0% |
| the other 7 | within ±0.5 | within ±0.5 |
| **Mean of 11** | **86.7%** | **88.3%** |
