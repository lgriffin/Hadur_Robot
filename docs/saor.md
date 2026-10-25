# Saor: a MicroMelee entry

`hadur117.micro.Saor` is a second robot, separate from Hadur: a melee micro bot for the
MicroMelee rumble (codesize under 750 bytes, ten robots on a 1000 x 1000 field). The design is
the spec doc "MicroMelee Rumble Entry: Figment, Wallaby, Capulet dissected and a hex-built
contender": Figment's corner oscillation and Markov-chain gun, with a circular cold start, a
nearest-sticky target, an end-game power cap and a short leg after a collision. The
requirements are SAOR-1 to SAOR-15 in [requirements.md](requirements.md#saor-a-micromelee-entry-saor-1-to-saor-15-stages-u0-to-u5).

Saor lives in its own module, `saor/`. Nothing in it is shared with Hadur, and Hadur's
modules do not depend on it, so Hadur's 1v1, melee and team play are unchanged.

## Architecture

| Piece | Where | What it is |
|---|---|---|
| The core | `saor/src/main/java/hadur117/micro/core/` | `Movement`, `Selection`, `Energy`, `Targeting`: pure statics on primitives, no Robocode types (SAOR-2). The reference design, unit- and property-tested. |
| The shipped class | `hadur117/micro/Saor.java` | The core flattened by hand into one `AdvancedRobot`, 749 bytes. This is the only class in the rumble jar. |
| The bench adapter | `hadur117/micro/SaorLab.java` | Calls the core, call by call, in the shipped class's order. Adds paint and a `SAOR round=… shots=… hits=… damage=…` line a round. Its own jar; never entered. |
| The equivalence test | `SaorEquivalenceTest`, `SaorJarIT` | Feeds Saor and SaorLab the same events through a fake peer and requires the same orders, in the same order, bit for bit (SAOR-15). Runs on the compiled classes and again on the two built jars. |

Each robot is loaded in its own class loader for the test (`harness/IsolatingLoader`), so
the static Markov tables and target state start fresh. `harness/MiniWorld` drives a small
deterministic world: circling enemies, deaths, collisions, a radar arc that decides which
enemies are scanned. `harness/Scenarios` holds four scripted battles:

- `lowLeft`: five enemies near the bottom-left corner, two deaths and two rams.
- `highRight`: a stationary enemy, a death, and a ram before the first scan.
- `learned 7`: a prefilled Markov row one sample short of warm.
- `learned 8`: the same row, now warm.

### Why the shipped class is flattened by hand

The first build fed the core and a thin adapter through ProGuard and let it inline the core.
That came out at 914 bytes: ProGuard keeps a store for every argument of an inlined method
and materialises every boolean the core returns. Writing the same arithmetic as one class
fixed that:

| Build | Codesize |
|---|---|
| Core + adapter, inlined by ProGuard | 914 |
| First flat class (javac) | 798 |
| Flat class with shared locals (javac) | 776 |
| The same through ProGuard's peephole pass | 761 |
| After golfing (below) | **749** |

The golfing is mirrored in the core, so the core still describes what ships:

- `axis ^= 1` with no initialiser.
- A collision sets the target to the rammer and its distance to -12.5, so the leg is 50 px
  until the rammer is next scanned. Setting the name as well stops a stuck no-target state.
- The cap is written `getOthers() / 3 + 1.9`: 1.9 below three opponents, as the spec has it,
  and 2.9 for three to five, where `log10(E) * 325 / d` is above 2.9 only when the target is
  very near.
- Figment's `power > 0` check before firing is dropped.
- 1024 angle bins, wrapped with `& 1023`.
- A successor is drawn with `(int) (Math.random() * n) % 126`.
- The tables are `char[512][579][127]`: 75 MB, the same as Figment's `int[256]…`.

ProGuard (7.8.2, `saor/proguard.pro`) still runs over the flat class for its peephole pass,
with `-dontobfuscate`, and puts the source and the properties into the jar.

### What the equivalence test does not compare

Four constants never change the orders in the scripted scenarios, so a wrong value there
would pass the test. They are reviewed by hand against the core:

- the 482.5 px wall margin
- the 0.7 gun-heat learning threshold
- the `% 126` row read
- the playout count

These seeded mutations of the shipped class all failed the test:

- `WARM` 7
- ram distance -10
- cap 2.0
- the axis flip
- the turn index
- `ticks = 0`
- no name hijack on a ram
- hash `& 255`

## Byte budget and the M4 margin

Saor is at 749 bytes, exactly the limit. The spec's stage M4 asks for 744 or less, to leave
room for a later fix. Two trades would buy it:

| Trade | Saves | Cost |
|---|---|---|
| Drop the held weight (a cold row's playout votes 100, not 5) | 6 | Cold aim weighs the same as learned aim. |
| Drop the ram leg (SAOR-9) | 14 | The 50 px leg after a collision. |

Neither is made. The PC census and gate field are the place to decide them.

## Stages

The spec's stages M0 to M5 are U0 to U5 here, because M is already Hadur's melee stage letter.

| Stage | Spec | Gate | State |
|---|---|---|---|
| U0 | M0 | Module, core, tests, traceability | Done |
| U1 | M1 | Survival at or above Capulet's 29.2% | Bench: PC census |
| U2 | M2 | 64 APS on the cold gun | Bench: PC census |
| U3 | M3 | 66 APS; out-survive Figment in half of 200 battles | Bench: PC census and gate field |
| U4 | M4 | Codesize at most 744 | 749: at the limit, the margin is not met (above) |
| U5 | M5 | Rumble entry | Not started: needs Leigh's go |

`hadur.saor.stage` in the root pom is U4, so the traceability test expects coverage for every
requirement up to U4.

## Bench sets and gates

All in `hadur-bench/`. `tools/saor_fields.py` makes them from the saved rankings
(`data/rumble/parsed/2026-10-25T1340Z_micromeleerumble_rankings.tsv`), with seed 117:

| File | What |
|---|---|
| `micromelee-field.txt` | All 156 robots on the MicroMelee rankings. The fetch list: `./fetch-opponents.sh --set micromelee-field.txt` pulls any missing jar from the robot archive. All 156 were found there. |
| `micromelee-census/f01.txt` … `f18.txt`, `micromelee-census.txt` | The census: the field shuffled into 18 fields of nine, each fought with Saor. The last field is topped up from the first. |
| `saor-gate9.txt` | The gate field: Figment, Wallaby, Capulet, then the robots ranked 6, 12, 25, 50, 90 and 130. |

The bench runs Saor like any robot: `--melee true --field 1000x1000 --rounds 35 --robot-jar
../saor/target/hadur117.micro.Saor_0.1.jar --robot "hadur117.micro.Saor 0.1"`. Put the
options in an args file (`plans/saor-*.args`), since the robot's name has a space in it.
`tools/saor_gates.py` reads the battles and reports the gates:

| Gate | Measure |
|---|---|
| U1 survival | Rounds won as a share of rounds. This is our reading of LiteRumble's melee Survival column, where Capulet stands at 29.2. |
| U2, SAOR-12 APS | Per battle, 100 S / (S + X) against each opponent X. This is averaged per opponent, then over opponents. U2 needs 64; SAOR-12 needs 66. |
| SAOR-13 | The share of battles with Figment in which Saor's survival score beat Figment's. |
| SAOR-14 | The share of battles with Wallaby in which Saor's bullet damage beat Wallaby's. |

A gate passes only on its full sample: 155 opponents for the APS gates and 200 battles for
the head-to-heads. A smaller run prints "short".

### PC card

`plans/pc-saor-u3.queue` builds Saor, fetches the field, then runs two benches:

- the census, 216 battles (about 15 min)
- the gate field, 200 battles (about 20 min)

It then writes `docs/bench/local/saor-gates.md` and opens a results PR. Run it from master:
`./queue.sh run pc-saor-u3` (or `.\queue.ps1 run pc-saor-u3`).

### Cloud smoke, 2026-10-25

Both runs used 4 cores and no fixed CPU constant. These are numbers from a smoke test, not
gate results.

- **Gate field, 2 seeds.** No skipped turns. Saor was 3rd of 10 by mean place. Its score
  share was 11.6%, against Figment's 12.6%, Capulet's 14.1% and Wallaby's 16.0%. It
  out-survived Figment in 1 of 2 battles and out-damaged Wallaby in neither.
- **Census field F01, 1 seed.** Saor won with a 19.4% score share and 18 of 35 rounds, at
  70.0 APS.

## Entering the rumble (U5, not done)

Saor enters MeleeRumble. The server files it as MicroMelee from its codesize. The participants
line is `hadur117.micro.Saor 0.1,<jar URL>`. The version has no underscore, and the country
flag is set as for Hadur (`hadur117/IRL`). The jar is `saor/target/hadur117.micro.Saor_0.1.jar`.
Nothing is entered without Leigh's go.
