# Saor 0.4: own parts under the parity gate (cloud screens, 2026-11-06 to 2026-11-07)

Plan: docs/plan-saor-first.md section 8. Every arm is a whole-file build of Saor 0.3 with one part
replaced by a design of Saor's own, javac-built over the 749-byte limit, and screened on the
MicroMelee census (18 fields of 9 robots, 6 seeds, 35 rounds, 108 battles an arm) on the cloud
box. The read is the paired difference over C (0.3 rebuilt) by field, ± a 95% interval.
**Gate:** the interval includes 0 and the mean is above -0.25. AA (0.3 rebuilt again) is the A/A
control. Nothing was uploaded or released.

Seed blocks: r1 4100, r2 4200, r3 4300, r1x 4500, r1z 4600. Reports: `docs/bench/local/saor-r1-census.md`,
`saor-r2-census.md`, `saor-r3-census.md`, `saor-r1x-census.md`, `saor-r1z-census.md`,
`saor-r1x-wfr.md`, `saor-r1z-wfr.md`.

## Result

| Part | Best own design | vs 0.3 | Gate |
|---|---|---|---|
| Gun vote | GV: each playout's vote spread over 2 + ticks / 8 bins a side (at most 8) | +0.40 ± 0.41 | **pass** |
| Target | TH: the robot we hit best for its distance, sticky by name | -0.29 ± 0.43 | miss (nearest) |
| Movement | WNF: corner-wall legs to random depths, run to their end, orbit from two left | -0.71, -0.27, -0.89 over three blocks: about **-0.62 ± 0.24** | fail |
| Gun chain | none: second-order, pattern match and wall-band chains all cost 1 to 4 | | fail |
| Power | none: hit-rate and distance-band rules cost 0.5 to 1.1 | | fail |

All own parts together (OWN: WNF + GV + TH) read -1.05 ± 0.39: GV and TH add nothing on top of
WNF. The decision of 2026-11-07 is to keep designing movement before moving on to the gun chain.

## Gun and target (stages 2 and 3)

| Arm | Design | vs 0.3 |
|---|---|---|
| G2 | second-order chain, rows keyed on the last two states | -1.05 ± 0.43 |
| GV | vote width 2 + ticks / 8 | **+0.40 ± 0.41** |
| G2V | G2 + GV | -1.45 ± 0.42 |
| GP | own predictor: replay what followed the latest earlier matches of the last 8 states (symbolic pattern match), GV width | -1.71 ± 0.45 |
| GW | chain rows keyed on state and the target's wall band (under 60, under 150, open) | -4.11 ± 0.43 |
| TH | target: distance × (shots + 2) / (hits + 1) | -0.29 ± 0.43 |
| PC | power: (1 + 4 × hit rate) × 200 / distance | -0.51 ± 0.45 |
| THPC | TH + PC | -0.83 ± 0.44 |
| PD | power: 3 inside 150, 450 / distance beyond, at most energy / 10 | -1.12 ± 0.49 |

AA read +0.36 and -0.20 on these blocks: the noise floor is about ±0.4 for a single block.

## Movement (stage 1): what was learned

The movement went from -3.0 to about -0.6 over about 45 designs. The steps that mattered:

1. **Roaming min-risk loses badly** (MR -3.03, MP -5.16): leaving the corner is expensive.
2. **Corner boxes are better but still lose** (CR -2.59, CC -3.57, CN -2.86, CF -2.66).
   Orbiting the target inside the box is far worse (CT -10.50).
3. **The loss was the end of the round.** Rounds won fell from 0.64 (0.3) to about 0.43 while
   survival fell only 3 to 8 points. Adding an orbit for the last robots (perpendicular to the target,
   edging to 300, reversing at walls and about every 25 ticks) recovered it: CD (last robot)
   -1.91, CE (from two left) -1.38, C3 (three left) -1.41, C5 -1.80, orbit at 450 (CG) -2.30.
4. **Diagnostics on wall legs** (WH, legs on the corner's two walls, -3.72):
   - forcing every leg to cross to the other wall and picking only the depth by risk: WA -3.66;
   - the same with one random depth and no risk: WR -2.50, so **the risk pick costs about 1.2** here;
   - WR with the depth tied to range: WT -1.58; WR with each leg run to its end: WN -1.58.
5. **Wall legs to random depths, run to the end, with the orbit** (WND -0.88, then WNF with the
   depth not tied to range -0.71, WNB 60-100% of the range-tied depth -0.68) is the best family.
   Fresh seeds: WNF -0.27 and -0.89, WNB -0.34 and -0.75.
6. **Variants of WNF that did not help** (each against WNF on the same seeds):
   - random top speed per leg (WNV -1.50) and random leg cuts (WNS -0.85);
   - the orbit reversing on the target's shots (WOE -0.77), or edging to 160 (WOC -0.94);
   - longer legs only (WNL -0.94, WNT -0.61);
   - depth to half the nearest robot's distance (WNN -1.27), or shrinking with robots alive (WNE -2.85);
   - depth to 150 (W15 -1.49, -1.72) or 260 (W26 -0.90, -0.96);
   - the orbit from three left (WN3 -0.60, -0.76);
   - cutting a leg when a robot within 350 fires (WFR -0.52, -0.78);
   - 16 candidates (C16 -2.40) and weighting robots that would target us (CEW -1.55) on the box designs.
7. **Legs across the line to the danger-weighted centre of the robots** (PX -2.11; angled out
   0.3, 0.55 and 0.8 rad: -1.36, -2.36, -6.28): a dead end.
8. **The orbit on 0.3 itself** (CO) reads -0.14 ± 0.37: it does not improve the corner oscillation's
   own duels, it only repairs designs that duel badly.

**Where WNF still loses** (C against WNF over the three blocks, 11,340 rounds each): duels end in a
win equally often (85.9% and 85.8%). WNF dies 13% more often in the crowd (4,778 deaths against
4,218), spread across many killers, mostly simple-gun nanos and micros (Ant, Quantum, NanoAndrew,
DustBunny, Wisdom, Troodon). The remaining gap is survival in the crowd, not the duel.

## Code kept

`hadur-bench/saor-arms/` keeps GV (pass), TH (nearest miss) and WNF (best movement). The failed arm
sources and the stage cards were removed with this result. WNF's source was tidied for the commit
with the same behaviour (the one-candidate risk loop it inherited is gone).

## JayLexi k-NN (same run, BENCH-204)

Our own k-NN surf on JayLexi 0.6 (mini-wide3 field, 4 seeds from 39000, 448 battles an arm),
docs/bench/local/2026-11-06_jaylexi-knn.md: KN -0.86 ± 0.48, KA -0.39 ± 0.42, A/A +0.05 ± 0.40.
Both fail; the arms, the card and its arms file are removed.

## Bench change

`Bench` suite runs now keep a field whose `out/<label>/report.md` already exists from a stopped
run (BENCH-95, `--resume`, on by default), so a restarted cloud box resumes a census from the
next field instead of from the start.
