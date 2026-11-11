# Saor 0.4: own parts under the parity gate (cloud screens, 2026-11-06 to 2026-11-07)

Plan: docs/plan-saor-first.md section 8. Every arm is a whole-file build of Saor 0.3 with one part
replaced by a design of Saor's own, javac-built over the 749-byte limit, and screened on the
MicroMelee census (18 fields of 9 robots, 6 seeds, 35 rounds, 108 battles an arm) on the cloud
box. The read is the paired difference over C (0.3 rebuilt) by field, ± a 95% interval.
**Gate:** the interval includes 0 and the mean is above -0.25. AA (0.3 rebuilt again) is the A/A
control. Nothing was uploaded or released.

Seed blocks: r1 4100, r2 4200, r3 4300, r1x 4500, r1z 4600. Reports: `docs/bench/local/saor-r1-census.md`,
`saor-r2-census.md`, `saor-r3-census.md`, `saor-r1x-census.md`, `saor-r1z-census.md`,
`saor-r1x-wfr.md`, `saor-r1z-wfr.md`, and for section 9 `saor-r1x-wng.md`, `saor-r1z-wng.md`,
`saor-r1x-wnh.md`, `saor-r1z-wnh.md`, `saor-r1x-wgv.md`, `saor-r1z-wgv.md`,
`saor-r1x-wnz.md`, `saor-r1z-wnz.md`, and for section 10 `saor-<block>-wcd.md`, `-wtd.md`, `-wtb.md`,
`-wte.md`, `-wbg.md`, `-wto.md`, `-wtr.md` (which also carries WTN) `-wta.md` (r1-r5, r1x, r1z), and for section 11 `-was.md`, `-wag.md` (which carries WAD
and WDG), `-wat.md` and `-wau.md`; for section 13 the per-arm census reports `saor-<block>-census-<ARM>.md` (WD1 and OG1 over r1-r5, r1x, r1z; OG2 over r1-r5 and r1x, its r1z stopped; OG3 over r1-r4; OG4 over all seven; OG5 over r1-r5).

## Result

| Part | Best own design | vs 0.3 | Gate |
|---|---|---|---|
| Gun vote | GV: each playout's vote spread over 2 + ticks / 8 bins a side (at most 8) | +0.40 ± 0.41 | **pass** |
| Movement + gun vote | WAG: WTA with GV | -0.12, -0.03, -0.32, -0.13, +0.01, -0.04, -0.34 over seven blocks: about **-0.14 ± 0.16** | **pass** |
| Movement + vote + target + power | WAE: WAG with the target distance × (shots + 6) / (hits + 2) and power for the best expected energy gain from that robot's hit rate and range | -0.01, +0.06, -0.10, +0.41, -0.08, +0.05, -0.13 over seven blocks: about **+0.03 ± 0.16** | **pass** |
| Target | TH: the robot we hit best for its distance, sticky by name | -0.29 ± 0.43 | miss (nearest) |
| Movement | WTA: corner-wall legs whose depth is, every tick, half the range of the nearest robot whose own nearest robot is us | -0.28, -0.06, -0.29, -0.18, -0.16, -0.24, -0.29 over seven blocks: about **-0.21 ± 0.16** | mean inside the gate; interval just short of 0 |
| Gun chain | none: second-order, pattern match and wall-band chains all cost 1 to 4 | | fail |
| Power | alone: hit-rate and distance-band rules cost 0.5 to 1.1; with the target, expected-gain power (WAE) passes | | pass in WAE |

All own parts together (OWN: WNF + GV + TH) read -1.05 ± 0.39: GV and TH add nothing on top of
WNF, and WTB + GV (WBG) reads about -0.44 over five blocks against WTB's -0.32 (section 10). The
decisions of 2026-11-07 are to keep designing movement before moving on to the gun chain.

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

9. **Speed through the leg ends** (2026-11-07 to 11-08, blocks r1x and r1z, WNF read -0.27 and -0.89
   on the same seeds). Every change to how WNF moves along and between its legs lost:
   - a pause of 0 to 9 ticks at each leg end (WNP -1.75, -1.91): standing still is costly;
   - the next leg picked 30 or 70 before the leg end, so the robot never stops but arcs into it
     (WNG -0.88, -1.20; WNK -1.56, -1.56);
   - a stop at each leg's midpoint on the same line (WNH -1.57, -1.87);
   - top speed re-rolled between 8 and 3 about every 10 ticks (WNJ -2.50, -3.06);
   - leg depths drawn short (25-85) or long (150-225), half each (WNM -1.09, -1.13).
   WNF with the GV vote width (WGV -0.97, -0.87) is no better than WNF alone, as OWN showed.
   - random reversals back along the leg, 3% or 6% a tick (WNZ -1.76, -2.33; WNW -2.85, -2.86):
     every extra reversal costs, so mid-leg reversals are not what the crowd's simple guns miss.
   WNF's legs, run at full speed to their end with one reversal there, look like a local optimum of
   this family: the remaining gap needs a different idea, not a variant.

10. **Legs that follow the threat** (2026-11-09). WNF fixes each leg's depth when the leg starts;
    0.3 recomputes its depth every tick from the nearest robot's range. Own live signals, five
    seed blocks where marked (r1, r2, r3, r1x, r1z; WNF -0.71, n/a, n/a, -0.27, -0.89):
    - the crowd's mean scan distance, 25 + mean / 3 (WCR -1.42, -1.24 on r1x, r1z), plus a random
      0-80 per leg (WCD -1.85, -1.88): worse than WNF;
    - **the range of the robot that last hit us** (the nearest until one has), 25 + range / 3:
      WTH -0.40, -0.32, -0.70, -0.13, -0.58, about -0.43; better than WNF on every shared block;
    - depth range / 2, at most 260: **WTB -0.69, -0.06, -0.45, -0.06, -0.36, about -0.32 ± 0.19**,
      the best own movement; shallower (40 + range / 4: WTS -0.36, -0.51 on r1x, r1z) and deeper
      (range / 1.6, at most 320: WTD -0.36, -0.88) are worse;
    - the threat forgotten 100 ticks after its last hit (WTE -0.30, -0.57 on r1, r1z; WTB -0.69,
      -0.36) or the hardest hitter of the round (WTM -0.55, -0.72): no better;
    - WTB with the GV vote width (WBG -0.47, -0.38, -0.57, -0.20, -0.56, about -0.44): GV adds
      nothing on an own movement, as on WNF;
    - WTB without the duel orbit (WTO -0.43, -0.70, -0.45 on r1, r1z, r3; WTB -0.69, -0.36, -0.45):
      the same, so the orbit no longer earns its place once the legs follow the threat.
    - half the nearer of the target and the threat (WTN -0.38, -0.37, -0.41, -0.67, -0.42, about
      -0.45);
    - WTB with the threat cleared at each round start and its range set from its last seen position
      on the hit (WTR -0.50, -0.15, -0.78, -0.67, -0.33, about -0.49).
    - **the nearest robot whose own nearest robot is us** (the one most likely aiming at us), else
      the last hitter, else the nearest: WTA -0.28, -0.06, -0.29, -0.18, -0.16 on the five blocks
      (WTB -0.69, -0.06, -0.45, -0.06, -0.36), and on two fresh blocks with their own 0.3 control
      (r4 4700, r5 4800) -0.24 and -0.29. Over seven blocks about **-0.21 ± 0.16**: the mean is
      inside the gate's -0.25 bar, the interval ends just short of 0 (-0.37 to -0.05).
    Following who is shooting, or likely to shoot, at us is the signal that closed the gap, from
    WNF's -0.62 to WTA's -0.21. WTA replaces WTB as the kept movement.
11. **The own parts together** (2026-11-10, seven blocks r1, r2, r3, r4, r5, r1x, r1z; WTA -0.28,
    -0.06, -0.29, -0.24, -0.29, -0.18, -0.16):
    - **WAG = WTA + GV: -0.12, -0.03, -0.32, -0.13, +0.01, -0.04, -0.34, about -0.14 ± 0.16
      (-0.30 to +0.02): passes the gate.** GV, which added nothing on WNF or WTB, adds about 0.07
      on WTA;
    - deeper legs, range / 1.7 at most 320 (WAD -0.09, -0.12, -0.03 on r1, r1z, r4; WTA -0.28,
      -0.16, -0.24) read better alone, but with GV (WDG -0.39, -0.09, -0.68, +0.19, -0.56, -0.13,
      -0.53, about -0.31) worse than WAG; shallower legs, range / 2.4 (WAS -0.46, -0.67, -0.19),
      lose.
    - WAG with the TH target (WAT -0.38, -0.29, -0.38, +0.03, -0.24, +0.05, -0.28, about -0.21 ±
      0.16, interval -0.37 to -0.05): the mean is inside the bar but the interval misses 0; TH costs
      about 0.07 on WAG, the nearest miss again.
    - TH with a stronger pull toward the nearest until hit rates build, distance x (shots + 6) /
      (hits + 2) (WAU -0.25, -0.01, -0.49, -0.32, +0.04, +0.16, -0.33, about -0.17 ± 0.16, interval
      -0.33 to -0.01): within 0.03 of WAG, the interval misses 0 by 0.01.
    - WAU with the PC power, (1 + 4 x hit rate) x 200 / distance (WAP -0.41, -0.14, -0.60, -0.29,
      -0.57, -0.11, -0.30, about -0.35 ± 0.16): fails; it costs about 0.18 on WAU.
    - **WAU with power for the best expected energy gain (WAE -0.01, +0.06, -0.10, +0.41, -0.08,
      +0.05, -0.13, about +0.03 ± 0.16, interval -0.13 to +0.19): passes the gate**, about 0.17 better
      than WAG and 0.20 better than WAU on the same blocks. The rule takes a hit chance of
      k (20 - 3p) / d, with k from the target's hit rate, (hits + 1) / (shots + 4), scaled to a
      typical 400 px; the gain k (20 - 3p) 7p / d - p peaks at p = (20 - d / 7k) / 6, held to
      [0.1, 3] and a sixth of our energy. It fires harder at robots we hit and near, and softer far
      and at robots we miss. With WAE, movement, gun vote, target and power are all our own; the
      gun chain (the Markov state packing and the play-it-forward playout) is the last Figment part.
12. **The gun chain on WAE** (2026-11-10 evening, same seven blocks; WAE -0.01, +0.06, -0.10, +0.41,
    -0.08, +0.05, -0.13):
    - the chain's speed kept in 2 px/tick steps, 9 values instead of 17, so each row fills about twice
      as fast (WGC -0.11, +0.08, -0.29, +0.08, -0.00, +0.01, -0.12, about **-0.05 ± 0.16**, interval
      -0.21 to +0.11): inside the gate, about 0.08 below WAE. It is a change to Figment's state, not a
      new chain: the playout and the state's shape are still Figment's;
    - the state without the acceleration sign (WGN -0.84, -0.13, -0.96 on r1, r2, r3): fails, dropped
      after three blocks. The acceleration sign carries real information.
    - WGC with each row sampled toward its latest entries, index n - 1 - n x r1 x r2 (WGR -0.41,
      -0.01, -0.32, -0.37, -0.31, -0.25, -0.52, about -0.31 ± 0.16): fails, below WGC on all seven
      blocks. Uniform sampling of the whole row beats following recent habits.
    - WGC with a wall bit in the state, the target within 100 px of a wall (WGW -0.29, -0.02, -0.57,
      -0.16, -0.31, -0.27, -0.34, about -0.28 ± 0.16): fails, below WGC on all seven blocks. Like GW's
      wall bands, every extra split of the rows costs more in thinner rows than it gains; the one
      change that held was a coarser state (WGC). Coarser speed (4 px steps) and coarser turn (3 bins)
      are screened next.
    - **coarser turn, 3 bins (left, straight, right) on WGC: WGT +0.10, +0.26, -0.45, +0.09, +0.13,
      +0.22, +0.07, about +0.06 ± 0.16 (interval -0.10 to +0.22): passes the gate**, about 0.11 above
      WGC and the best arm of the rewrite so far. Coarser speed, 4 px steps (WG4 -0.09, +0.10, -0.32,
      +0.03, -0.38, +0.03, -0.48, about -0.16), loses: speed needs its 2 px resolution, turn does not
      need five bins. The chain's playout is still Figment's design; its state is now ours in shape.
    - the 3-bin turn with the speed back at 1 px/tick, 17 values (WT7 +0.19, +0.37, -0.20, +0.30,
      +0.06, +0.14, -0.21, about **+0.09 ± 0.16**): passes, level with WGT within the noise; with three
      turn bins the rows are thick enough for full speed. WGT firing only once the gun has been aimed
      at the current target, so each shot is charged to the robot aimed at (WGA -0.18, -0.00, +0.00,
      +0.22, -0.13, +0.16, +0.17, about +0.03): inside the gate, no better than WGT.
13. **Bytes** (javac, before ProGuard, as Robocode's codesize counts them): 0.3's control 738, WAG 1,302,
    WAE 1,441, WGT 1,438, WT7 1,434 against the 749 limit. The own movement adds about 360 bytes in
    onStatus (501 against 139: the nearest-whose-nearest-is-us search over every seen robot) and the
    own target and power about 190 in onScannedRobot. The own parts play at parity but are about
    twice the micro's size; the next step is fitting WT7's behaviour into 749 bytes, re-gating each
    cut.
    - First cut, WD1 (2026-11-11): no duel orbit, no last-hitter fallback (the target's range
      instead), and the nearest-whose-nearest-is-us test done once per scan instead of every tick
      over every pair. 1,146 bytes (onStatus 209). Reads -0.26, -0.04, +0.03, +0.16, -0.00, -0.17,
      -0.19, about -0.07 ± 0.16: still inside the gate, about 0.16 below WT7.
    - Where the rest goes: the Markov playout gun with its radar and firing is about 500 bytes, the
      own movement with its per-scan bookkeeping about 310, the own target and power about 100, the
      class set-up about 80. The playout alone leaves about 250 bytes for everything else, so WT7
      cannot reach 749 by trimming the own parts; it needs a gun of about 200 bytes, which would also
      replace the last Figment part.
    - Own compact gun OG1 (2026-11-11, 881 bytes): WD1 with the Markov playout replaced by one
      playout on the target's averaged speed and turn rate (each decayed by a quarter a scan),
      stopped at the walls. Reads -4.28, -3.77, -4.28, -3.87, -3.91, -3.77, -3.78, about **-3.95 ±
      0.17: fails by a wide margin**. A gun with no memory of how each robot moves gives back about
      four points; the learned state chain is what carries Saor's gun. The two byte cuts queued on
      OG1 were stopped unrun. Next: OG2, the own state chain kept but played forward once along each
      state's most recent successor (no sampling, no vote), 972 bytes, screened before any byte cuts.
    - OG2 (2026-11-11, 972 bytes): the own state chain played forward once, each step taking the
      state's most recent successor. Reads -6.07, -5.99, -6.03, -6.06, -6.02, -6.12 (r1z stopped),
      about **-6.05: worse than OG1**. One deterministic path through the chain follows a single
      recent pattern and misses; sampling many paths and pooling them is what carries the gun.
      Next: OG3 (1,020 bytes), 64 sampled playouts of the own chain, aimed at the mean end bearing
      with no angle bins and no vote.
    - OG3 (2026-11-11, 1,020 bytes): 64 sampled playouts of the own chain, aimed at the mean end
      bearing. Reads -1.14, -0.90, -1.62, -1.16 (r5, r1x, r1z stopped), about **-1.2: fails, but
      five points better than OG2**. Sampling is most of the gun; the mean blurs two likely lanes into
      the gap between them, which costs about a point against WD1's vote. Next: OG4 (1,063 bytes), the
      same 64 samples aimed at the fullest 0.05-radian cell, a plain histogram mode with no kernel
      and no weights.
    - OG4 (2026-11-11, 1,063 bytes): the same 64 samples aimed at the fullest 0.05-radian cell.
      Reads -0.95, -0.47, -0.90, -0.31, -0.67, -0.68, -0.76, about **-0.68 ± 0.16: fails**, but half
      a point better than OG3. Taking the mode of the samples instead of their mean recovers most of
      the gap; about 0.6 still separates it from WD1's weighted, smoothed vote. Its 83-byte saving over
      WD1 is small against the 400 bytes still to cut. Next: OG5 (1,082 bytes), OG4 with Saor's graded
      vote (a playout counts 5 + 12 a sample of its thinnest row, at most 100; SAOR-7).
    - OG5 (2026-11-11, 1,082 bytes): reads -0.73, -0.86, -0.66, -0.41, -0.47 (r1x, r1z stopped),
      about **-0.63: no better than OG4**. The graded vote alone does not close the gap.
    - **Where the own-gun line stands.** Each step back toward a full vote won points (OG2 -6.05,
      OG1 -3.95, OG3 -1.2, OG4 -0.68, OG5 -0.63, WD1 -0.07), but the bytes came back with them: OG5
      saves only 64 bytes on WD1. The remaining 0.6 points sit in the smoothed, weighted vote that
      WD1 already carries; an own gun that matched it would be about WD1's size again (a smoothed
      OG6 measured 1,117 bytes and was not run). OG5 itself is 333 bytes over 749; a gun at parity, near
      OG6's or WD1's size, would leave the bot about 370 to 400 bytes over, and those bytes are the own movement and target. Fitting an all-own Saor under 749
      therefore costs the own parts it was built to keep; the choice of how to proceed went to Leigh.

**Where WNF still loses** (C against WNF over the three blocks, 11,340 rounds each): duels end in a
win equally often (85.9% and 85.8%). WNF dies 13% more often in the crowd (4,778 deaths against
4,218), spread across many killers, mostly simple-gun nanos and micros (Ant, Quantum, NanoAndrew,
DustBunny, Wisdom, Troodon). The remaining gap is survival in the crowd, not the duel.

## Code kept

`hadur-bench/saor-arms/` keeps GV (pass), TH (nearest miss), WTA (best movement, which replaced
WNF and then WTB), WAG (WTA + GV, which passes) and WAE (WAG with the own target and power,
which passes) WGC (WAE with coarser chain speed, inside the gate) WGT (WGC with a 3-bin turn, which passes) and WT7 (WAE with a 3-bin turn, the best read). The failed arm sources and the stage cards were
removed with each result.

## JayLexi k-NN (same run, BENCH-204)

Our own k-NN surf on JayLexi 0.6 (mini-wide3 field, 4 seeds from 39000, 448 battles an arm),
docs/bench/local/2026-11-06_jaylexi-knn.md: KN -0.86 ± 0.48, KA -0.39 ± 0.42, A/A +0.05 ± 0.40.
Both fail; the arms, the card and its arms file are removed.

## Bench change

`Bench` suite runs now keep a field that finished with exit 0 under the same merged options and
robot jar (BENCH-219: `suite-done.txt`, written only after a clean finish and compared on restart),
so a restarted cloud box resumes a census from the next field instead of from the start; a failed,
interrupted or rebuilt field runs again, and `--resume false` on a line turns it off.
