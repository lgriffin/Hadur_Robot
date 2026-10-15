# Plan: from 7th to top 3 in the 1v1 rumble

2026-10-15. Hadur 3.13 is 7th at 89.50 APS. Third is DrussGT 3.1.16 at 92.53, so top 3 needs
**+3.04 APS**. Fourth (Saguaro 1.0, 91.73) needs +2.23, fifth (ScalarR, 91.23) +1.73 and sixth
(Diamond 1.8.22, 90.15) +0.65.

Inputs: the live BotDetails pages of the six robots above Hadur and Firestarter, fetched
2026-10-15 11:00 UTC (`data/rumble/pages/2026-10-15T1100Z_*`, parsed to `data/rumble/parsed/`),
Hadur 3.13's page of 05:56 UTC, and the census runs in `data/bench/` (Hadur 3.10nd, Tomcat,
Diamond, ScalarR and Nullstride as subjects, 35 rounds x 4 seeds against the whole field).
Tables come from `data/tools/peer_gap.py`.

## The finding

**The 3 APS is movement against ordinary robots.** Against the 921 opponents on neither shield
list, DrussGT scores +2.10 APS more than Hadur; the shield lists hold the other +0.94. On the
bench, against those opponents, Hadur deals as much bullet damage as Diamond, ScalarR and
Nullstride (63.5 a round against 62.1 to 64.1) but takes 12.8 a round where they take 9.5, 8.2
and 6.8. The excess is the same early and late in the battle, and it is there in rounds with no
skipped turns, so it is neither learning speed nor CPU. It is how Hadur moves.

## Where the 3.04 lives

Live APS that DrussGT gains over Hadur, by the opponent's rank and shield group (the cell's sum
of per-opponent differences over Hadur's 1,217 pairings; opponent counts in brackets):

| Group | 1-50 | 51-200 | 201-400 | 401-800 | 801+ | Total |
|---|---|---|---|---|---|---|
| On Hadur's list (200) | +0.01 (6) | +0.15 (56) | +0.15 (75) | +0.06 (55) | +0.02 (8) | **+0.38** |
| On Nullstride's list only (95) | +0.02 (2) | +0.04 (7) | +0.21 (28) | +0.27 (48) | +0.01 (10) | **+0.56** |
| On neither (921) | +0.19 (40) | +0.43 (87) | +0.47 (97) | +0.68 (297) | +0.33 (400) | **+2.10** |

The other robots above, as totals for the same three groups:

| Robot | APS | Listed | Nullstride only | Neither | Total |
|---|---|---|---|---|---|
| BeepBoop 2.0 | 94.98 | +0.65 | +0.77 | +4.01 | +5.43 |
| Nullstride 2.3.3 | 94.80 | +0.58 | +0.70 | +3.98 | +5.26 |
| DrussGT 3.1.16 | 92.53 | +0.38 | +0.56 | +2.10 | +3.04 |
| Saguaro 1.0 | 91.73 | +0.39 | +0.69 | +1.20 | +2.27 |
| ScalarR no-shield | 91.23 | -1.56 | +0.23 | +3.04 | +1.71 |
| Diamond 1.8.22 | 90.15 | -1.60 | +0.18 | +2.06 | +0.64 |

- Every robot above Hadur beats it on the "neither" group, by 1.2 to 4.0 APS. ScalarR and Diamond
  do not shield and lose 1.6 to Hadur's list, and still sit above it.
- BeepBoop does not shield either, yet scores 97.6 against Hadur's 200 listed robots, where
  Hadur's shield scores 93.6. A good enough surfer does not need the shield.
- The Nullstride-only group is where Hadur's shield failed the D5 sweep and its surf is weak
  too: 85.0 against DrussGT's 92.2.

## Movement, not the gun

The census runs, against the 914 opponents on neither list that all five subjects met
(score share %, bullet damage dealt / taken per round):

| Ranks | Opponents | Hadur 3.10nd | Tomcat 3.68 | Diamond 1.8.22 | ScalarR | Nullstride 2.3.3 |
|---|---|---|---|---|---|---|
| 1-50 | 36 | 59.5 / 30.2 / 31.1 | 57.6 / 37.0 / 33.1 | 66.6 / 35.8 / 28.1 | 70.8 / 37.7 / 27.4 | 77.0 / 32.6 / 21.1 |
| 51-200 | 86 | 74.3 / 42.1 / 26.0 | 74.3 / 44.0 / 26.5 | 80.0 / 44.6 / 22.2 | 81.2 / 49.2 / 21.4 | 85.4 / 46.9 / 16.7 |
| 201-400 | 98 | 81.0 / 54.3 / 23.5 | 82.2 / 55.2 / 22.8 | 86.4 / 54.7 / 17.6 | 87.5 / 58.9 / 16.3 | 90.5 / 58.3 / 12.5 |
| 401-800 | 297 | 89.8 / 62.2 / 14.3 | 91.0 / 61.9 / 13.4 | 92.8 / 60.4 / 10.1 | 94.2 / 61.0 / 7.9 | 95.1 / 61.1 / 6.6 |
| 801+ | 397 | 96.7 / 74.4 / 4.4 | 97.8 / 73.5 / 3.1 | 98.0 / 71.5 / 2.7 | 98.6 / 73.4 / 1.9 | 98.5 / 72.1 / 2.1 |
| All | 914 | 89.2 / 63.5 / 12.8 | 90.1 / 63.6 / 11.9 | 92.2 / 62.1 / 9.5 | 93.3 / 64.1 / 8.2 | 94.5 / 63.1 / 6.8 |

Off the shield list 3.13 runs 3.10nd's code plus the mirror fire fix, so these rows stand for
3.13. Matching the mean of Diamond and ScalarR here is worth +2.6 APS by the flat-mean
arithmetic.

- **Damage taken is the gap in every band.** Hadur takes 30% to 120% more than Diamond and
  ScalarR, and the ratio grows down the table: 14.3 against 7.9 from ranks 401-800.
- **The gun is level below rank 400** and 3 to 7 points of damage a round short above it.
- **It is steady, not learning.** Against the 694 unlisted opponents below rank 400, damage taken
  per round in rounds 0, 1-2, 3-9, 10-19 and 20-34: Hadur 18.1, 12.4, 10.2, 9.2, 8.9; Diamond
  12.5, 9.0, 6.9, 6.1, 5.7; ScalarR 11.4, 6.9, 5.2, 4.5, 4.2. Hadur's last 15 rounds are
  worse than ScalarR's rounds 1-2.
- **It is not skipped turns.** Hadur skips 1.07 turns a round on the bench (Diamond 0.03,
  ScalarR 0.49), and rounds with skips cost 3 to 9 more damage, but rounds with none still
  take 9.9 against Diamond's 7.3 and ScalarR's 5.3.
- **The head of the excess is close-range robots.** The 100 opponents with the largest excess
  over Diamond and ScalarR carry 47% of it. The top of that list is aggressive nanos and
  rammers that fire hard from close in: Bicephal, Impact, SabreuseNano, SledgeHammer,
  Sunderer, FollowFire, Machete, Sabreur, RammingC (Hadur takes 59 to 83 a round, ScalarR 14 to
  25). Two mirror robots also leak: MirrorL (29 against 0.4 to 1.6) and Jammy (27 against 1.5
  to 8.5). The remaining 53% is spread thinly over the field.

## The levers

| # | Lever | Room (live APS) | Expected | Evidence |
|---|---|---|---|---|
| 1 | Movement against the unlisted field | +2.10 to DrussGT, +2.6 to Diamond/ScalarR (bench) | **+1.0 to +1.5** | Damage taken 12.8 vs 8.2-9.5 a round |
| 2 | Shield v2: the nowave leak, then re-sweep Nullstride's other 95 | +0.94 to DrussGT, +1.28 to Nullstride | **+0.4 to +0.6** | plan-90 step 2 leak classes; 85.0 vs 92.2 on the 95 |
| 3 | Gun against ranks 1-400 | about +0.3 (bench dealt gap) | **+0.2 to +0.4** | Dealt 30 vs 36-38 (top 50), 42 vs 45-49 (51-200) |
| 4 | Skipped turns | about +0.15 | **+0.1** | 1.07 skips a round vs 0.03-0.49; issue #169 |

Together the expected column is **+1.7 to +2.6 APS**: 91.2 to 92.1, which is 4th or 5th. Top 3
needs lever 1 to reach DrussGT's level on the unlisted field (+2.1) with lever 2 on top, so
lever 1 decides it, and it is also the one lever no earlier stage has found. P1 (distance),
`aw` (never close in), RAM-4 and the flattener ablations were all level or worse, so lever 1
starts with diagnosis, not guesses.

## Stages and test order

All movement and gun switches are duel-only paths (1v1); melee and team code and fixtures stay
untouched. Each candidate ships as a switch that is off by default, as plan-90 did.

**Stage 0: find where the hits come from (cloud, no behaviour change).**

1. DrussGT 3.1.16 and BeepBoop 2.0 as census subjects on the 400-bot screen, 3 seeds. This gives
   the damage-taken reference per opponent from the robot we must pass, on our bench. Hadur's
   movement is a DrussGT-style design (docs/druss-route-plan.md), so any opponent where DrussGT
   takes far less is a fidelity question with a reference answer.
2. A hit forensics record (HF) for every bullet that hits Hadur, all opponents: which wave
   (first, second, unsurfed, no wave), the danger the surf predicted at the hit angle against
   the best reachable option, the guess factor the hit came from and whether head-on, linear or
   circular aim would have fired there, distance, wall distance, and skipped turns while the
   bullet flew. A tool ranks the hit classes by damage, by band.
3. A prediction fidelity check: at each wave break, the surf's predicted position against the
   engine's, and the share of hits that landed inside the window the surf judged safest.

Read-out: the hit classes that hold the excess, each with its APS by the flat-mean arithmetic.
Lever 1's candidates are chosen from it. Hypotheses it can confirm or reject: a defect in wave
timing or intersection (would show as a steady excess in every band, which is the shape seen),
danger views that never switch on against low hit rates, a poor escape from close-range
robots, and MIR-1 not engaging against MirrorL and Jammy.

**Stage 1: lever 1 switches.** Each candidate: cloud 400-screen, 3 seeds, paired against 3.13;
survivors go to the PC at 8 fresh seeds; the best combination gets a census at 4 seeds. Gate:
+0.3 APS on the whole field, no rank band worse than -0.05, nothing worse on the listed 200.
The earlier lesson holds: 3-seed cloud gains of about a point a robot often fail fresh PC seeds.

**Stage 2: shield v2 (lever 2).** Cloud, alongside Stage 1 because it touches only listed
robots: classify the remaining shield leaks with `shield_leaks.py` (nowave first), fix the
largest, then re-sweep Nullstride's 95 others in shield-all with the D5 rule. PC 8 seeds on
the new list, then the census.

**Stage 3: gun against ranks 1-400 (lever 3).** After Stage 1, since better movement changes
round length and energy. Screen against the 222 opponents ranked 1-400 on neither list.

**Stage 4: skipped turns (lever 4).** Only if Stages 1 and 3 add CPU; otherwise last.

Release when a stage passes its gate: 3.14 is expected to be Stage 1 plus Stage 2. The PC runs
one queue at a time; the cloud does screens and sweeps.

## Reproducing the tables

```
P=data/rumble/parsed/2026-10-15T1100Z_roborumble_botdetails_
python3 data/tools/peer_gap.py live \
  data/rumble/parsed/2026-10-15T0556Z_roborumble_botdetails_hadur2.Hadur_3.13.csv \
  ${P}jk.mega.DrussGT_3.1.16.csv ${P}kc.mega.BeepBoop_2.0.csv ${P}jd.Nullstride_2.3.3.csv \
  ${P}oog.mega.saguaro.Saguaro_1.0.csv ${P}aaa.r.ScalarR_0.005h.053-noshield.csv \
  ${P}voidious.Diamond_1.8.22.csv \
  --rankings data/rumble/parsed/2026-10-15T0556Z_roborumble_rankings.tsv
B=data/bench
python3 data/tools/peer_gap.py bench \
  "Hadur 3.10nd=$B/2026-10-09_hadur-census-312-g4-local_cold.tsv@hadur2.Hadur 3.10nd" \
  "Tomcat=$B/2026-10-10_hadur-census-312-m5-local_cold.tsv@lxx.Tomcat 3.68" \
  Diamond=$B/2026-10-12_hadur-plan90-census-diamond-local_cold.tsv \
  ScalarR=$B/2026-10-12_hadur-plan90-census-scalarr-local_cold.tsv \
  Nullstride=$B/2026-10-09_hadur-census-311-nullstride-local_cold.tsv
```

`parse_rumble_page.py` now also reads the plain `.html` a fetch saves.
