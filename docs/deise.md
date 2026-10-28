# Deise: a MiniMelee entry

Leigh, 2026-10-27: "Mini bot will be called Deise. Lets design it to be first." Before that, on
Mirage: "I'd like to analyse what Mirage does to see can Saor bridge the gap but I'm also
considering a new bot to win that group. Assume we had the byte code capacity how would we
bridge it?"

`hadur117.mini.Deise` is a third robot, separate from Hadur, Saor and TwinSaor: a melee bot for
the MiniMelee rumble (codesize under 1,500 bytes, ten robots on a 1000 x 1000 field, scored by
LiteRumble from the MeleeRumble battles). The requirements are DEISE-1 to DEISE-15 in
[requirements.md](requirements.md#deise-a-minimelee-entry-deise-1-to-deise-15-stages-e0-to-e3).
The Déise are the people of Waterford.

## 1. The field and the gap

MiniMelee on 2026-10-27 15:40 UTC (204 robots; pages in `data/rumble/pages/2026-10-27T1540Z_*`):

| Rank | Robot | APS | Survival | Size |
|---|---|---|---|---|
| 1 | kc.mini.Mirage 0.2 | 71.30 | 55.66 | mini, 1,479 bytes |
| 2 | hadur117.micro.Saor 0.2 | 68.79 | 35.36 | micro, 748 |
| 3 | kc.micro.Figment 1.0 | 68.73 | 37.41 | micro |
| 4 | wompi.Wallaby 5.1 | 68.28 | 36.91 | micro |
| 5 | rz.GlowBlowMelee 1.4 | 67.82 | 31.21 | mini |

Mirage leads Saor by 2.51 APS, and the survival column says where: 55.7% against 35.4%.

## 2. Mirage, read from its source

Mirage ships its source (`robot.include.source=true`, `kc/mini/Mirage.java`, Kev, 2024). Its gun
is the Figment family's Markov play-it-forward: per-opponent tables of up to 1,000 successors a
state, 200 playouts, a vote spread over the bins the target's width covers, an unseen state
weighed 0.1 and a playout off the field 0.01; a transition is learned only between scans one
tick apart. Power is min(energy / 5, target energy / 4, 3, 600 / distance).

Its movement is what Saor lacks: each tick it scores 100 headings at a reach of 0.4 of the
target's distance (30 to 150 px) and moves when it is within 60 px of its last point. The
risk of a point adds a pull out of the centre (stronger with more robots left), 80,000 / d² from
each opponent, |cos| of the angle to the line of each opponent likely aiming at it (its target,
or one it is the nearest robot to), and virtual head-on and linear bullets those opponents are
assumed to fire every tick. It dead-reckons the opponents it is not scanning.

## 3. Deise's design

Deise keeps Saor's gun, which is ours and measured, and builds its own movement:

- **Gun (DEISE-6 to DEISE-10).** Saor 0.2's graded vote (a row with any sample is played out; a
  thin row votes at most 5 + 12 a sample), learning **every robot it scans**, not just its
  target, with the turn of a gap of up to 8 ticks spread over the gap; a vote over the target's
  width; Saor's range power, capped at what kills the target.
- **Movement (DEISE-1 to DEISE-5).** A least-risk ring of 36 points. Opponents push by their
  energy, and Deise moves across, not along, the line of an opponent likely aiming at it. Two
  parts of its own: waves from **shots it saw fired** (an energy drop of 0.1 to 3), weighed by
  whether the shooter likely aims at Deise, instead of virtual bullets every tick; and Saor's
  corners while the field is crowded.

## 4. Stage E0: the design on the cloud box

A smoke on the cloud box (4 cores): one top field of nine, 3 battles of 35 rounds, the same
seeds, with Deise or Mirage in the seat. Field: Mirage (or Deise when Mirage sits), Saor 0.2,
Figment, Wallaby, Capulet, Shiz, Troodon, DoctorBob, Infinity.

| Seat | APS | Survival | Rounds won | Score share |
|---|---|---|---|---|
| Mirage 0.2 | 63.0 | 74.9 | 45 / 105 | 15.7% |
| Deise 0.1 as designed | 44.3 | 41.5 | 10 / 105 | 8.0% |
| without the corner pull (NC) | 51.2 | 52.8 | 13 / 105 | 10.1% |
| without wave dodging (NW) | 57.2 | 65.3 | 23 / 105 | 12.6% |

Both of Deise's own movement parts cost points as built: the corners by about 7, the seen-shot
waves by about 13. The gun is not the gap: in the rounds that ended as a duel with Mirage,
Deise won 7 of 9.

A second round took both out and tried the alternatives:

| Seat | APS | Survival | Rounds won | Score share |
|---|---|---|---|---|
| no corners, no waves (B) | 56.7 | 65.2 | 17 / 105 | 12.4% |
| out of the centre, no waves (BCE) | 58.2 | 67.3 | 25 / 105 | 13.0% |
| no corners, waves at 0.3 (BLW) | 53.4 | 57.6 | 19 / 105 | 11.0% |

The seen-shot waves cost points even at 0.3 of their weight, so they are off
(`Move.WAVES = 0`, DEISE-5) and arm W keeps them measured. With the waves off, the corners, no
pull and the centre push read within a smoke's noise (56.7 to 58.2 over three battles), so
Deise keeps Saor's corners and arm CE measures the centre push on the census. A smoke of three
battles separates 5 APS, not 1: the census below decides the rest.

A third round ran the default (Deise 0.1 as it now stands: corners, no waves) and two
candidates:

| Seat | APS | Survival | Rounds won | Score share |
|---|---|---|---|---|
| Deise 0.1 (D) | 54.9 | 62.0 | 15 / 105 | 11.7% |
| commits to a leg (CM) | 54.9 | 59.4 | 18 / 105 | 11.6% |
| plays unscanned opponents on (RK) | 58.4 | 67.5 | 23 / 105 | 13.1% |

D is NW's build and read 54.9 against NW's 57.2 on the same seeds, so a smoke's noise is about
±2.5 here. Deise without waves sits at 55 to 58 against Mirage's 63 in the same seat: about 5
short, inside the census's reach to rank the parts but well short of 1st. Where the rest is,
the census per opponent will show: Deise wins its duels with Mirage, so the gap is the crowd.

## 5. Stage E0's card: pc-deise-e01

The live-shaped MiniMelee census (DEISE-13): `saor_live.py` with Deise's options builds the
fields from `melee-census-317` (the whole MeleeRumble list in 46 fields of nine), and the read
counts only the pairings against the MiniMelee field (`minimelee-field.txt`, the 204 robots of
the 2026-10-27 rankings, from `tools/deise_fields.py`). A seated robot's place in its field
goes to Deise, as Deise will be in the live field. Arms are built by `tools/deise_arms.sh` from
`deise-arms/arms.txt`: a sed over one source file, the class renamed and its core package moved
so no two arms share a class.

| Arm | What |
|---|---|
| D | Deise 0.1: corners while crowded, no wave dodging |
| MIR | Mirage 0.2 seated: the bar |
| SAOR | Saor 0.2 seated: the control, 68.79 live |
| W | seen-shot waves back on |
| CE | out of the centre while crowded, not to the corners |
| CM | commits to a leg: a new point only when twice as safe, or within 50 px of the old |
| RK | plays unscanned opponents on by their last heading and speed |
| FL | every opponent pushes the same, whatever its energy |
| P200 | 200 playouts an aim, not 64 |
| G1 | learns only scans one tick apart |

46 fields x 6 seeds a seat, about 6 h on the PC. The read pairs every arm with SAOR field by
field and moves Mirage's 71.30 by the run's offset (SAOR's read minus its 68.79 live). E0 passes
when D or a one-change arm reads within 1.0 of MIR in the same run.

## 6. Stages

| Stage | What | Gate |
|---|---|---|
| E0 | The design measured, unfitted (card `pc-deise-e01`) | D or one arm within 1.0 of MIR |
| E1 | Stack the winners, then the next round of arms | the stack leads MIR by 0.5 or more, same run |
| E2 | Fit 1,499 bytes: flatten into one class as Saor is, with an equivalence test against the core (done early, for 0.2: 1,490 bytes) | DeiseJarIT at 1,499; the fitted build reads level with E1's |
| E3 | Release the fitted build on Leigh's go | live MiniMelee 1st |

Leigh asked for Deise live on 2026-10-27 to get real numbers before the census. 0.1
(`deise-v0.1`) went out unfitted at 2,303 bytes, which the MiniMelee table does not take, and
should never have been cut. 0.2 is the same robot fitted to 1,490 bytes (section 7), so stage E2's
fit came before E0's census.

## 7. The byte budget

Deise 0.1 was 2,303 bytes with the core shipped in the jar. 0.2 ships one class,
`hadur117.mini.Deise`, the core flattened by hand the way Saor is (docs/saor.md, "Why the shipped
class is flattened by hand"), through ProGuard's peephole pass: **1,490 bytes** of MiniMelee's
1,499 (1,490 since ids start at 1, so an unseen robot's death clears an empty slot). The build
fails above 1,499 or with more than one class (DEISE-12).

What the fit left out changes no order: the seen-shot waves weigh 0 (DEISE-5), so the shipped class
neither records nor weighs them, and the dead reckoning of arm RK is off. The bench adapter
`DeiseLab` keeps both, drives the core call by call, and is what the bench arms are built from.
`DeiseEquivalenceTest` runs both through three melees (five, three and seven enemies, with deaths
and target switches) and requires the same orders to the bit, on the compiled classes and on the
shipped jar (DEISE-16). To make that hold, the core and the adapter adopted the shipped class's
arithmetic where the two differed only in rounding: distances as the square root of the squared
sum, the ring's headings as `i * (2π / 36)`, and no special first scan. `DeiseLab` also dropped its
bullet-hit energy update, which only fed the waves.

Two costs of the fit are accepted. With no special first scan, a robot first seen in the opening
eight ticks of a battle puts one transition from state 0 into its table; state 0 (full speed
backwards and slowing) is all but unvisited, so the sample is nearly never read. And the shipped
class samples rows with `Math.random()` while `DeiseLab` uses its own `Random`, so the two match
to the bit only while each row holds one successor, as in the test's melees; the thin-row vote
(DEISE-8) is held by `GunTest` on the core.

Nine bytes are left, so any change that adds behaviour has to pay for itself (section 8).

## 8. Stage E1: paying for the waves (card pc-deise-e02)

E0's census (`pc-deise-e01`, PR #371, 46 fields x 6 seeds) read D, Deise 0.2, at 69.90, Mirage
seated at 72.08 and Saor 0.2 at 69.23 (live 68.79, so the run reads 0.44 high: D's 69.46
projected against 69.60 live). Against D: W (seen-shot waves) +0.48 ± 0.25, RK and P200 +0.28,
FL and G1 +0.16, CE +0.11, CM -0.28. Mirage survives 88.3% of the fields to Deise's 83.1%, wins
54% of rounds to 43% and does a tenth more damage: the gap is survival first.

The waves are the one clear win and the one that does not fit. Byte costs in the shipped class,
each measured alone on 0.2's 1,490 bytes (ProGuard, `codesize`):

| Change | Bytes |
|---|---|
| waves, cut down: head-on line only, every wave weight 1, no hit correction, slots as a ring of 64 | about +260 |
| waves as E0's W: both lines, weighed by aim, hits corrected | about +450 |
| dead reckoning (RK) | +94 |
| 200 playouts (P200) | +1 |
| drop the across term (DEISE-3) | -131 |
| drop the corners (DEISE-4) | -47 |
| drop the 10% hold on the destination (DEISE-1) | -46 |
| drop the kill cap on power (DEISE-10) | -39 |
| drop the off-field (31) and thin-row (21) vote weights (DEISE-8) | -52 |
| flat push (FL) | -9 |
| drop the field cap on power (DEISE-10) | -14 |

So the waves need about 250 bytes found elsewhere, and RK, at 94 bytes for a noise-sized
gain, is out. The across term is the biggest saving and the waves model the same thing (who is
shooting at Deise), so it goes first; the rest must come from parts E0 never measured alone.
`pc-deise-e02` (`deise-arms/arms.txt`) measures them on the cut-down waves, each a switch in
the core or `DeiseLab` that is on in 0.2 so the shipped class stays matched (DEISE-16):

| Arm | What |
|---|---|
| D, MIR, SAOR | as E0 |
| W | E0's W again, to confirm +0.48 |
| WH | the cut-down waves |
| WHP | WH without the across term |
| WHPC, WHPK, WHPT, WHPH | WHP without the corners, the kill cap, the vote weights, the hold |
| WHPF | WHP with a flat push and 200 playouts |
| FIT | WHP without the corners, kill cap and vote weights, flat push, 200 playouts: about 1,468 bytes |

12 seats, about 7 h on the PC. E1 passes when FIT reads at least D + 0.3 in the same run; it is
then flattened into the shipped class as 0.3, held to the core by DEISE-16 and measured at or under
1,499. If FIT fails, the one-change reads say which saving costs the most and the next stack swaps
it out. Closing the 2.2 to Mirage needs more than the waves: the survival gap is the next stage's.

### E1's result (PR #378)

| Arm | Census APS | vs D | Survival | Rounds won |
|---|---|---|---|---|
| D | 70.10 ± 0.16 | 0 | 83.3% | 42.8% |
| MIR | 72.01 ± 0.15 | +1.91 | 88.0% | 53.9% |
| W | 70.54 ± 0.16 | +0.44 | 82.6% | 43.9% |
| WH | 66.49 ± 0.21 | -3.61 | 68.7% | 17.9% |
| WHP | 66.84 | -3.26 | 70.4% | 19.8% |
| WHPC / WHPK | 66.87 / 66.98 | -3.2 | 70.4% | 20% |
| WHPT | 65.90 | -4.20 | 68.4% | 17.6% |
| WHPH | 67.27 | -2.83 | 71.6% | 22.5% |
| WHPF | 67.21 | -2.89 | 71.2% | 21.6% |
| FIT | 65.93 | -4.17 | 68.4% | 18.2% |

W holds (+0.44, against E0's +0.48), but the cut-down waves are fatal: one of their three cuts
(head-on only, weight 1 for every wave, no hit correction) costs Deise a sixth of its survival,
and every stack on WH inherits it. On top of WH, dropping the vote weights costs a further 0.9
(they stay), while dropping the across term (+0.35), the hold (+0.43) and the flat push with 200
playouts (+0.37) read positive. E1 fails; nothing is flattened.

### Stage E1b: which cut breaks the waves (card pc-deise-e03)

One cut at a time off W: WL (head-on only), WA (every wave weight 1), WB (no hit correction); and
the savings that read positive on WH, on W itself: WP (no across term), WN (no hold), WPN (both),
WF (flat push and 200 playouts). D, MIR and SAOR as before; 11 seats, about 6.5 h. A cut is safe
when its arm reads within 0.2 of W; the safe cuts and the savings then size the fitted build.
The weight-1 cut is the likely culprit: in a field of nine, most shots are aimed at someone
else, and at full weight Deise dodges them all.

### E1b's result (PR #388)

| Arm | Census APS | vs D | Survival |
|---|---|---|---|
| D | 69.86 ± 0.16 | 0 | |
| MIR | 72.19 ± 0.15 | +2.33 | |
| SAOR | 69.14 ± 0.21 | -0.72 | |
| W | 70.45 ± 0.17 | +0.59 | |
| WL (head-on only) | 67.63 | -2.23 | 73.9% |
| WA (every wave weight 1) | 69.43 | -0.43 | |
| WB (no hit correction) | 70.34 | +0.48 | |
| WP (no across term) | 70.50 | +0.64 | |
| WN (no hold) | 70.54 | +0.68 | |
| WPN (neither) | 70.69 | +0.83 | 83.8% |
| WF (flat push, 200 playouts) | 70.68 | +0.82 | |

W holds a third time (+0.59). The head-on-only cut is what broke E1's waves (-2.23, survival down
to 74%); the weight cut costs 0.43 and also stays out; the hit correction is within 0.11 of W and
goes. The across term and the hold read better gone, and the flat push with 200 playouts is as
good as either.

### Stage E2: the waves fitted (card pc-deise-e04)

The build E1b points to (W without the hit correction, the across term and the hold, with the
flat push and 200 playouts) measures 1,719 bytes flattened. Golf, every step measured with
ProGuard and `codesize`, saves about 140 bytes without changing what it does: the two wave lines as
one loop, the risk inlined into the ring, wall tests in one helper, angle constants folded, the
run and scan positions in locals, the wave's firing time from the scan gap, its head-on line from
the scan bearing, and the move set to the ring's reach (every candidate is that far away). Then
two cuts E1 measured as harmless on WH, the corners (WHPC +0.03 over WHP) and the kill cap (WHPK
+0.14), about 85 bytes, bring it to 1,494:

| Candidate | Bytes | What |
|---|---|---|
| FIT3 (0.3) | 1,494 | WPN, no hit correction, flat push, 200 playouts, no corners, no kill cap |
| FIT3F | 1,480 | FIT3 without the field cap on power (never measured alone) |

FIT3 ships as **Deise 0.3** (2026-10-28, for Leigh's live test that night): it is the shipped
`Deise.java`, and the core and `DeiseLab` are matched to it bit for bit (DEISE-16). New switches
off in 0.3: `Move.CORNERS`, `Move.ENERGY_PUSH`, `Move.ACROSS`, `Gun.KILL`, `DeiseLab.HITS` and
`DeiseLab.HOLD` (0); on: `Move.WAVES` 1 and `DeiseLab.PLAYOUTS` 200. To match the golfed class the
core keeps its waves as a ring of 64 that overwrites the oldest (it used to free spent waves and
drop a new one when all were live), adds each line's danger to the risk in turn, takes the head-on
line from the scan bearing, weighs a wave by the scan distance, and moves the ring's reach. The
equivalence harness's enemies now fire on fixed beats, so the waves are compared too (a 0.25 to
0.3 weight change in `DeiseLab` fails it at tick 18).

`pc-deise-e04` measures 0.3 on the bench beside its live pass: D (now 0.3), FIT3F (0.3 without the
field cap, a flat class, `deise-arms/e2/`, arm lines `=FILE` in `tools/deise_arms.sh`), MIR and
SAOR, 276 battles each, about 2.5 h. Every census step stops itself on 20 failed battles, 30
minutes without a battle, or 40 skipped turns a battle over the last 100. 0.2 read +0.73 over SAOR
in `pc-deise-e03` and the W family +1.3 to +1.5; **0.3 holds when it reads at least +1.1 over
SAOR**, and FIT3F replaces it if it reads 0.3 above D.

### 0.3's live first pass (2026-10-28)

MiniMelee 2nd, 69.81 ± 0.33 over 205 pairings (641 battles), 1.38 behind Mirage's 71.19; 0.2 read
69.68 ± 0.39, 1.52 behind. On the 204 opponents both versions met, 0.3 is +0.18, inside one
pass's noise of about ±0.4. Survival rose 3.4 points (42.4% to 45.8%), +1.7 against the 20
strongest opponents and +3.5 against the rest, so the waves keep Deise alive as E1b said they
would. The score gained less than the bench promised: E1b's nearest arms (WPN, WF) read +0.82
over 0.2. Either the bench overstates the gain or the fitted whole is worth less than its measured
parts; E1 measured each cut as harmless only on its own. `pc-deise-e04` tells the two apart: 0.2
read +0.73 over SAOR on the bench. If 0.3 reads about +0.9 over SAOR, bench and live agree and
the fitted class is worth less than its parts. If it reads +1.5 or more, the bench overstates
the gain. Survival remains the gap: Mirage 55.6%.
Pages: `data/rumble/pages/2026-10-28T2322Z_minimeleerumble_botdetails_hadur117.mini.Deise_0.3.mht`,
`2026-10-28T2323Z_minimeleerumble_rankings.mht`.

## 9. Uniqueness

Leigh's rule for Saor holds here: inspired by others, never a copy. Deise's gun is Saor's own
(the graded vote, the cold circle, the range power), not Mirage's. Its movement is a least-risk
ring, a family as old as melee itself; what is Deise's is what it weighs: opponents by their
energy, Saor's corners while crowded, and (measured, off for now) shots it saw fired instead of
virtual bullets. Arm CE's centre push is Mirage's term and is measured only to learn its worth.
