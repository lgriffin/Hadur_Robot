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

Nine bytes are left, so any change that adds behaviour has to pay for itself; the waves' code is
gone already, and the next candidates are the clamp of the turn index and the 0.1 power floor.

## 8. Uniqueness

Leigh's rule for Saor holds here: inspired by others, never a copy. Deise's gun is Saor's own
(the graded vote, the cold circle, the range power), not Mirage's. Its movement is a least-risk
ring, a family as old as melee itself; what is Deise's is what it weighs: opponents by their
energy, Saor's corners while crowded, and (measured, off for now) shots it saw fired instead of
virtual bullets. Arm CE's centre push is Mirage's term and is measured only to learn its worth.
