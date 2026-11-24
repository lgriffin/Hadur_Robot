# Eveimear

`hadur117.micro.Eveimear` is a MicroRumble robot: a 1v1 duelist under the MicroRumble's 750-byte
codesize limit. **Eveimear 0.6 is 1st of 515 in the MicroRumble** (86.20 ± 0.17 APS, 2026-11-21).

The design and bench method are in [docs/kitlab.md](../docs/kitlab.md); the requirements are
EVEIMEAR-1 to EVEIMEAR-17 in [docs/requirements/eveimear.md](../docs/requirements/eveimear.md). It
shares the `hadur117.micro` package with Saor but never a jar.

## Credit

Since 0.5, Eveimear is **Cotillion 0.8 by Skilgannon (Julian Kent)**, `jk.micro.Cotillion`, whose
source ships in its jar: the stop-and-go and random-orbit movement, the multiple-choice symbolic
pattern-matching gun, the radar and the fire power are Cotillion's. Eveimear's own parts are the
per-robot mode table and, in 0.6, a tighter wall stick. The jar's description carries this credit.

## How it works

- **Movement.** Stop-and-go, one step per enemy shot, until the enemy has hit it a set number of
  times, then random orbit. The switch point is per robot: a 14-bit name-hash table (`MODES`),
  learned from Eveimear's own forced-mode battles, scales the hit threshold so each robot gets the
  mode that works against it. The drive closes
  off the enemy until a 120 px stick stays in the field.
- **Gun.** A multiple-choice symbolic pattern matcher.
- **Radar.** Locked on the enemy.
- **Size.** 749 bytes, the limit exactly, built through ProGuard. `EveimearJarIT` replays the jar
  against the javac classes with `Math.random` seeded.

0.1 to 0.4 were Eveimear's own GuessFactor gun on the same stop-and-go movement. Reading the
leaders' shipped source showed 0.4 already moved as Cotillion does, line for line, and that the
two-point gap to it was Cotillion's gun, radar, power and random-mode reversal; 0.5 therefore
adopted Cotillion's code and kept Eveimear's mode table.

## Standing

| Version | Read (UTC) | Rumble | Rank | APS | Pairings | Battles | Nearest rival |
|---|---|---|---|---|---|---|---|
| 0.6 | 2026-11-21 14:03 | **MicroRumble** | **1st of 515** | **86.20 ± 0.17** | 514 | 2,109 | jk.micro.Cotillion 0.8, 85.56 (2nd) |
| 0.5 | 2026-11-06 03:05 (first pass) | **MicroRumble** | **1st of 516** | **86.03 ± 0.34** | 515 | 565 | Cotillion 0.8, 85.58 (2nd) |
| 0.2 | 2026-11-02 14:40 (first pass) | MicroRumble | 9th of 516 | 83.39 ± 0.31 | 515 | 737 | nz.jdc.micro.HedgehogGF 1.5, 84.94 (5th) |
| 0.1 | 2026-10-30 21:50 | MicroRumble | 9th of 516 | 83.28 | 515 | 2,362 | HedgehogGF 1.5, 84.96 (5th) |

Eveimear 0.6 leads Cotillion by 0.64 and kc.micro.WaveShark 0.5 (85.52) by 0.68. Paired over the
514 opponents it shares with 0.5's first pass it is +0.19 ± 0.26, inside the +0.25 ± 0.15 the
bench predicted. 0.5 was also 8th in the MiniRumble, ahead of Cotillion. Live reads by opponent
group are in [docs/bench/live-kitlab-0.1.md](../docs/bench/live-kitlab-0.1.md),
[0.3](../docs/bench/live-kitlab-0.3.md) and [0.5](../docs/bench/live-kitlab-0.5.md); the saved
pages are in `data/rumble/pages/` and `data/rumble/parsed/`.

## Release history

Released versions are tagged `eveimear-v<version>`. Bench gains are over the previous version.

| Version | Released | Size | What changed | Bench |
|---|---|---|---|---|
| **0.6** | 2026-11-19 | 749 B | The drive closes off the enemy until a 120 px stick stays in the field, where Cotillion uses 160. | +0.37 ± 0.28 APS (112 robots × 12 seeds); +0.25 ± 0.15 on the whole field |
| **0.5** | 2026-11-05 | 749 B | Cotillion 0.8's code with Eveimear's per-robot mode table, re-indexed by the top 14 bits of the name hash. 0.4's aim jitter went with its gun. | +2.22 ± 0.76 points (112 robots × 12 seeds) |
| 0.4 | built, not released | 742 B | Random aim jitter against uCatcher, a bullet catcher; first build through ProGuard. | +52.0 ± 2.5 points against uCatcher, about +0.10 APS |
| **0.3** | 2026-11-04 | 741 B | Same play in fewer bytes; each `MODES` entry also carries the robot's wave speed, giving picked robots their own fire power; 16 more robots get mode picks. | +0.14 ± 0.10 and +0.08 ± 0.03 APS |
| **0.2** | 2026-11-01 | 746 B | The per-robot `MODES` table scaling the stop-and-go to random-orbit switch. | +0.36 ± 0.17 APS (112 robots × 6 seeds) |
| **0.1** | 2026-10-28 | 722 B | First release: stop-and-go into random orbit over a GuessFactor gun. | |

Release notes are in [docs/releases/](../docs/releases/) (`eveimear-v<version>.md`) and the 0.6
measurements in `docs/bench/local/2026-11-19_eveimear-*.md`.

## Build

    mvn -pl eveimear verify

The jar is `eveimear/target/hadur117.micro.Eveimear_<version>.jar` (classes, properties and source,
through ProGuard). `EveimearJarIT` prints its codesize and holds it within 749 bytes.

## Bench

From `hadur-bench`: `kitlab/run.sh micro <jar> "<name version>" <label>` fights a 48-robot
MicroRumble sample (`kitlab/micro-field.txt`), and
`python3 tools/kitlab_read.py kitlab/micro-field.txt work/kitlab-<label> --ref work/kitlab-ref-epeeist --ref-aps 85.06`
reads it as a predicted APS, paired against Épéeist 3.7 on the same set.
