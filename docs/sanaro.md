# Sanaro: a NanoMelee entry

Leigh, 2026-10-28: "We are going to build a nanobot ... that has to fit under the limits. Its
name will be sanaro. Build it, test it in the cloud against the top bots and give me a PC card."
The design is Leigh's doc "Nano Melee: Beating NaturalScience & Quantum"
(https://claude.ai/artifact/CFF7CDNc8tZZjd8abXnAta); this page records what was built from it,
what the cloud box measured and what the PC card measures next.

`hadur117.nano.Sanaro` is a fifth robot, separate from Hadur, Saor, TwinSaor and Deise: a melee
bot for the NanoMelee rumble (codesize at most 249 bytes, ten robots on a 1000 x 1000 field,
scored by LiteRumble from the MeleeRumble battles). The requirements are SANARO-1 to SANARO-12 in
[requirements.md](requirements.md#sanaro-a-nanomelee-entry-sanaro-1-to-sanaro-12-stages-n0-to-n5);
the design doc's N-1 to N-12 map onto them one for one.

## 1. The field

NanoMelee on 2026-10-28 07:43 UTC (89 robots;
`data/rumble/parsed/2026-10-28T0743Z_nanomeleerumble_rankings.tsv`):

| Rank | Robot | APS |
|---|---|---|
| 1 | d414.nano.Quantum 1.0.0 | 66.60 |
| 2 | sheldor.melee.nano.NaturalScience 1.2.1 | 64.88 |
| 3 | mld.DustBunny 3.8 | 64.84 |
| 4 | radnor.DoctorBob 1.42 | 63.94 |
| 5 | kawigi.nano.Lib 1.0 | 63.80 |

The design doc was written against Quantum 1.2.2; the rumble's entry is **Quantum 1.0.0**, and
it, not NaturalScience, is 1st. 1.0.0 differs from 1.2.2 in what matters here: bullet power
min(energy / 7, 2.5) at every range (1.2.2: 3.6 - (d / 8) / energy), a 0.9 decay and 120 px drive
(1.2.2: 0.83, 160), and a radar lock below gun heat 1.0. It keeps the 18 / d fire gate.

## 2. What Sanaro is

One class, 249 bytes by Robocode's codesize tool (`SanaroJarIT`, SANARO-1), no static
initialiser (SANARO-2). Per scan (SANARO-3 to SANARO-8):

- **Movement.** The anti-gravity of the DustBunny, Quantum and NaturalScience line: a field
  decayed by 0.9 a scan, a push of 1 / d away from where each robot is about to be, and a wall
  push 1 / x - 1 / (1000 - x) on each axis; drive ahead 120 less the turn, backwards past it.
  Sanaro's own part is the **spiral**: the body turns to the field's direction plus SPIRAL, so
  it slides round the robot shooting at it instead of fleeing it straight (doc findings F1-F3).
- **Target.** The creeping nearest: the threshold creeps out 25 px a scan and snaps to the
  target's distance.
- **Radar.** Quantum's branch-free flip, gun heat less LOCK (0.9) times the radar turn left:
  a sweep while the gun is hot, a lock once it is nearly cool. It is 4 bytes cheaper than
  NaturalScience's branch and pays for the spiral.
- **Gun.** The line's hedged lead, lateral velocity over 10 + 1.008 ^ d.
- **Power.** Sanaro's own table (`sanaro/table.py`, `SanaroTableTest`), not NaturalScience's:
  cell (own energy, enemy energy) at own * 128 + enemy holds, in fortieths, the lesser of
  0.1 + own / 16 (at most 2.5; 3.0 from 120 energy) and the least power that kills the enemy
  (worked out for one more than its truncated energy, so it kills whatever the int stands for).
  The shot is that times the integer 640 / d, as in NaturalScience: the table at 321-640 px,
  doubled or tripled closer, a 0.1 pot shot beyond. The string is 51,601 cells, so every index
  for own and enemy energy up to 400 is in it (NaturalScience's throws past 160 own energy,
  doc finding F8). Its constant costs 2 bytes of code however long it is. An enemy at 128
  energy or more reads the next row at its energy less 128 and draws that remainder's kill shot;
  a wider stride needs a string over the class file's 65,535-byte constant limit or 2 more bytes.
  Shots past 640 px ask for power 0, which the engine raises to its 0.1 minimum.

The table is written as octal escapes: a `"` escape is read before the lexer and would end
the string. ProGuard's peephole pass saves nothing on this class, so the jar is javac's class
with its properties and source.

## 3. Bytes

| Build | Bytes | Note |
|---|---|---|
| Sanaro 0.1 (spiral 0.6) | 249 | any spiral but 0 or 1 is an `ldc2_w`, 2 bytes more than `dconst_1` |
| spiral 1.0 or 0 | 247 | |
| fire gate (0.05 rad) | 262 | needs 13 found |
| flip on hit, table kept | 258-260 | needs 9-11 found |

## 4. The cloud screen (stage N1, 2026-10-28)

Cloud box, 4 cores. **NanoMelee census** (`tools/sanaro_fields.py`): 13 fields, each both
leaders, seven of the other 87 nanos and the arm; 3 seeds, 39 battles of 35 rounds an arm.
**Duel**: 10 battles of 35 rounds one on one with each leader. Read with `tools/sanaro_read.py`.
The base build of this screen was the first one, spiral 1.0 (S10); every arm is one change.

| Arm | APS | vs S0 | Survival | margin over Quantum | outsurvived Q | margin over NS | outsurvived NS | duel Q | duel NS |
|---|---|---|---|---|---|---|---|---|---|
| S0 no spiral | 63.75 ± 0.53 | | 16.2 | -2.48 ± 0.92 | 28% | +0.28 ± 0.95 | 44% | 0.3% | 43.2% |
| **S06 spiral 0.6** | **63.80 ± 0.56** | +0.29 ± 0.77 | **24.7** | **-1.98 ± 0.56** | 31% | **+2.05 ± 0.52** | **67%** | 0.9% | 98.0% |
| S08 spiral 0.8 | 63.36 ± 0.56 | -0.20 ± 0.77 | 21.4 | -2.15 ± 0.66 | 26% | +0.70 ± 0.73 | 49% | 0.0% | 96.3% |
| S10 spiral 1.0 | 62.36 ± 0.62 | -1.38 ± 0.81 | 13.8 | -3.83 ± 1.37 | 13% | -1.25 ± 0.85 | 33% | 7.7% | 20.7% |
| S12 spiral 1.2 | 60.90 ± 0.59 | -2.74 ± 0.79 | 12.1 | -5.09 ± 1.01 | 0% | -2.43 ± 0.95 | 8% | 69.8% | 2.0% |
| G fire gate | 62.09 ± 0.57 | -1.59 ± 0.78 | 17.2 | -4.26 ± 1.17 | 8% | -0.80 ± 1.18 | 38% | 5.7% | 67.0% |
| FL flip on hit | 63.27 ± 0.63 | -0.37 ± 0.82 | 20.2 | -2.71 ± 0.82 | 18% | +0.35 ± 0.89 | 49% | 3.7% | 94.6% |

APS counts NanoMelee pairings; the margins are the arm's APS less the leader's, battle by battle
in the same battles; intervals are 95%. FL here flips between 0 and 1.0.

Two more arms, also on the 1.0 base, tried the power band (BAND 1000: full table power out to
500 px, pot shots only past 1000):

| Arm | APS | vs S0 | Survival | margin over Quantum | outsurvived Q | margin over NS | outsurvived NS | duel Q | duel NS |
|---|---|---|---|---|---|---|---|---|---|
| B1000 (spiral 1.0) | 62.01 ± 0.54 | -1.70 ± 0.75 | 14.2 | -4.18 ± 1.03 | 3% | -0.96 ± 0.92 | 10% | 32.9% | 94.0% |
| S12B (spiral 1.2) | 60.90 ± 0.71 | -2.89 ± 0.89 | 10.8 | -5.79 ± 1.42 | 3% | -2.83 ± 1.16 | 3% | 77.4% | 85.6% |

The wider band wins duels (against Quantum 7.7% to 32.9% at spiral 1.0, 69.8% to 77.4% at 1.2;
against NaturalScience 20.7% to 94.0%) and costs a little in the crowd (-0.32 against S10), where
energy spent at range is energy not left for the end. That is a case for spending the band only
when few robots are left, which needs bytes (N3); the card measures B800 and B1000 on the 0.6 base.

What it says:

- **A small spiral pays, a large one costs.** 0.6 rad is the only arm that beats NaturalScience
  in the same battles by more than its interval (+2.05 ± 0.52, SANARO-10's shape on 39 battles)
  and outsurvives it in two battles of three; it has the best survival of any arm (24.7% of
  rounds won against S0's 16.2%). From 1.0 rad up the spiral loses: it drags Sanaro through the
  crowd. **Sanaro 0.1 ships with SPIRAL 0.6** (249 bytes). Its own APS edge over S0 is inside
  the noise (+0.29 ± 0.77); the margin over the leaders is the sharper read, as it pairs battles.
- **Quantum 1.0.0 is the real target and no arm beats it.** The best margin is -1.98 ± 0.56.
  Its power, min(energy / 7, 2.5) at any range, is the visible difference: Sanaro's 640 / d band
  fires 0.1 pot shots past 640 px, which the band arms below show costs the duels.
- **One on one is a coin thrown by geometry.** Ten battles a leader swing from 0% to 98% with
  the spiral angle: these nanos settle into one fixed orbit or corner per pairing. Against
  Quantum every arm but S12 loses almost every round; S06 wins 98% against NaturalScience.
  SANARO-12 (over 55% against both) is not met by any arm. In a duel at long range Sanaro's
  shots are 0.1 pot shots (one battle: 30 shots, 3.9 power in all, against Quantum's 50 at 2.5),
  and against NaturalScience it lost rounds it outshot because it rode into walls.
- **The fire gate costs here** (-1.59 against S0, -2.26 against S10 with which it shares the
  spiral) as well as 13 bytes: on this field, more shots beat better-aimed shots. Dropped.
- **The flip on hit is level** with S0 and not worth 9-11 bytes on this read.

## 5. The PC card: pc-sanaro-n01

`hadur-bench/plans/pc-sanaro-n01.queue`, Leigh starts it from master:
`.\queue.ps1 run pc-sanaro-n01`. About 3.5 h at 12 workers.

1. **NanoMelee census**, 10 seeds (130 battles an arm): S06 (0.1 as shipped), S0, the spiral at
   0.4, 0.5, 0.7, 0.8 and 1.0, the power band at 800 and 1000 px (B800, B1000; same bytes), and
   FL (flip between 0 and 0.6).
2. **Duel**, 20 battles against each leader, the same arms.
3. **Live-shaped census** (saor_live.py over melee-census-317, NanoMelee pairings counted, as
   LiteRumble scores NanoMelee from MeleeRumble battles): S06 and S0, and both leaders seated,
   6 seeds over the 43 fields that hold a nano. This is the census that transferred to live for
   Saor and Deise; the seated leaders give the bar.

Reports `docs/bench/local/sanaro-n01-census.md` and `sanaro-n01-live.md` on the results branch
`claude/pc-sanaro-n01-results`. **N2 passes** when an arm beats NaturalScience in the same census
battles by more than its interval, outsurvives both leaders in more than half of them, and reads
above NSC on the live census; it then ships as 0.2 if it fits 249 bytes.

## 6. Stages

| Stage | What | Gate |
|---|---|---|
| N0 | the bench: nano field, census and duel suites, arms, read; Sanaro 0.1 built and gated | 249 bytes, tests green |
| N1 | the cloud screen (section 4) | a spiral beats S0 or the leaders in the same battles |
| N2 | pc-sanaro-n01 | as section 5 |
| N3 | find bytes for what N2 picks (gate, flip or a power rule), by hand-written bytecode if javac will not fit | the shipped jar at most 249 |
| N4 | the Quantum gap: power and one-on-one | beats Quantum's margin in the same battles |
| N5 | release `hadur117.nano.Sanaro`, first rumble read after 500 battles | SANARO-10, SANARO-11 on the final jar |

## 7. Uniqueness

Leigh's rule for Saor holds here: inspired by others, never a copy. Sanaro shares the open
DustBunny line's anti-gravity and lead, which every bot at the top of NanoMelee shares, and
differs in behaviour where it counts: the spiral, the power table (its own formula, not
NaturalScience's 4,991-character table), the radar threshold, and no name lock or fire gate.
The seated leaders are references only and never ship.
