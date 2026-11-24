# JayLexi

`hadur117.mini.JayLexi` is a MiniRumble robot: a 1v1 duelist under the MiniRumble's 1,500-byte
codesize limit. **JayLexi 1.3 is 1st of 670 in the MiniRumble** (89.26 ± 0.11 APS, 2026-11-23).

It is a true wave surfer over a segmented GuessFactor gun, with per-opponent tables packed into
strings. The design and bench method are in [docs/kitlab.md](../docs/kitlab.md), the measurements
behind each version in [docs/bench/jaylexi-tailoring.md](../docs/bench/jaylexi-tailoring.md), and
the requirements (JAYLEXI-1 to JAYLEXI-26) in [docs/requirements/jaylexi.md](../docs/requirements/jaylexi.md).

## How it works

- **Movement: true wave surfing.** Each enemy shot, seen as an energy drop, becomes a wave. JayLexi
  predicts its own path precisely for moving forward and back, scores the danger where each path
  meets the nearest wave (and the second nearest at a quarter weight), and takes the safer one. The
  surf statistics are segmented by how much of its orbit ahead is still inside the field, and learn
  from every wave whatever the range. The hit that ends a wave is logged on that wave even when the
  wave has already been retired, so nearly every hit reaches the statistics.
- **Gun: GuessFactor.** Segmented on velocity history, lateral speed, walls ahead and distance.
  It fires once the gun is within 1200 / distance degrees of its aim, so it fires sooner at robots
  that close in.
- **Tables in strings.** Robocode's codesize does not count constant-pool strings, so JayLexi
  carries data there: a first-shot gun bin for each of its 480 gun segments and a surf danger row
  for MiniRumble robots (learned from its own battles), fire power by distance, and a per-robot
  orbit angle for each 50 px of distance. A few robots get lines of their own: wider or closer
  orbits, power 1 at long range against the two robots that out-last it on energy, and random aim
  jitter against bullet catchers.
- **Size.** The shipped source is written tight and built through ProGuard (1,486 bytes in 1.3). A
  readable copy of the same play is kept with the tests (`hadur117.mini.ref.JayLexi`), and
  `JayLexiReplayTest` checks the two give the same orders bit for bit.

## Standing

| Version | Read (UTC) | Rumble | Rank | APS | Pairings | Battles | Nearest rival |
|---|---|---|---|---|---|---|---|
| 1.3 | 2026-11-23 07:00 | **MiniRumble** | **1st of 670** | **89.26 ± 0.11** | 669 | 3,287 | sheldor.mini.FoilistMC 1.0, 88.94 (2nd) |
| 0.6 | 2026-11-06 03:05 (first pass) | MiniRumble | 4th of 670 | 88.40 ± 0.29 | 669 | 743 | FoilistMC 1.0, 88.96 (1st) |
| 0.4 | 2026-11-03 17:35 (first pass) | MiniRumble | 4th of 670 | 88.21 ± 0.29 | 669 | 773 | FoilistMC 1.0, 89.00 (1st) |
| 0.3 | 2026-11-02 14:40 (first pass) | MiniRumble | 4th of 671 | 87.93 ± 0.28 | 669 | 855 | FoilistMC 1.0, 89.02 (1st) |
| 0.2 | 2026-10-30 21:50 | MiniRumble | 5th of 671 | 87.34 | 670 | 2,040 | FoilistMC 1.0, 89.01 (1st) |
| 0.1 | 2026-10-29 07:23 (first pass) | MiniRumble | 6th of 671 | 86.95 ± 0.29 | 670 | 742 | simonton.mini.WeeksOnEnd 1.10.4, 87.35 (5th) |

JayLexi 1.3 leads FoilistMC by 0.32 and jk.mini.CunobelinDC (88.70) by 0.56. On the 667 opponents
its page shares with 0.6 it is +0.86, in line with the +0.85 the bench predicted. It also scores
83.03 in the full RoboRumble over 1,209 pairings. Its weakest pairings are the strongest minis:
Foilist (39.3), WeeksOnEnd (44.3), Pugilist (47.2) and CunobelinDC (53.1).

Live reads for earlier versions, with where the points were lost, are in
[docs/bench/live-kitlab-0.1.md](../docs/bench/live-kitlab-0.1.md),
[0.2](../docs/bench/live-kitlab-0.2.md), [0.3](../docs/bench/live-kitlab-0.3.md) and
[0.5/0.6](../docs/bench/live-kitlab-0.5.md). The saved pages are in `data/rumble/pages/` and
`data/rumble/parsed/`.

## Release history

Released versions are tagged `jaylexi-v<version>`. Bench gains are in APS over the previous
version unless stated.

| Version | Released | Size | What changed | Bench |
|---|---|---|---|---|
| **1.3** | 2026-11-22 | 1,486 B | Everything built since 0.6 (0.7 to 1.2 below), plus a hit-logging fix: JayLexi retires a wave about the tick its bullet arrives, before the hit event, so 1.2's surf learned from only about one hit in four. 1.3 keeps the last retired wave and logs the hit on it; 98% of hits now reach the statistics. | +1.10 ± 0.11 over 1.2 (145 robots × 3 seeds) |
| 1.2 | built, not released | 1,451 B | Power 1 from 500 px against FoilistMC and CunobelinDC, which out-last it on energy at range; orbit 1.35 rad against Mark8, CannonfodderMicro and Charo. | +6.6 and +2.6 points against the two leaders |
| 1.1 | built, not released | 1,447 B | Fires within 1200 / distance degrees of the aim instead of a flat 3; closer orbit against Leopard; aim jitter against uCatcher. 43 bytes freed by rewriting 1.0 with identical play. | +0.35 ± 0.26 (12 seeds) |
| 1.0 | built, not released | 1,486 B | One distance band in the surf statistics instead of four, so they fill four times as fast. | +0.23 ± 0.20 (12 seeds) |
| 0.9 | built, not released | 1,495 B | The surf's danger prediction starts one tick further along the path. | +0.29 ± 0.23 (12 seeds) |
| 0.8 | built, not released | 1,495 B | Per-robot orbit per 50 px of distance; own orbits for RammingC, LightningBug and MirrorMicro, wider close-range orbits for Bruce and Lifestealer. | +3.1 to +5.4 points each, about +0.03 |
| 0.7 | built, not released | 1,495 B | Surf statistics segmented by how much of the orbit ahead is still in the field. | +0.29 to +0.53 on four seed sets |
| **0.6** | 2026-11-05 | 1,494 B | Random aim jitter (up to 0.125 rad) against BulletCatcher; the jar is built through ProGuard to fit. | +57.3 ± 3.3 points against BulletCatcher, about +0.09 |
| **0.5** | 2026-11-04 | 1,487 B | Same play in fewer bytes, spent on a per-robot orbit angle. | +0.06 ± 0.04 |
| **0.4** | 2026-11-02 | 1,494 B | The top 120 MiniRumble robots get the field's surf row instead of their own: their learning guns had punished the self-taught rows. | +0.72 ± 0.15; +3.05 on the top 60 |
| **0.3** | 2026-11-01 | 1,494 B | String tables learned from its own battles: a first-shot gun bin per segment and a 47-bin surf danger row for each of 669 MiniRumble robots. | +0.44 ± 0.16 (112 robots × 6 seeds) |
| **0.2** | 2026-10-29 | 1,485 B | Also surfs the second nearest wave at a quarter weight; shipped source written tighter, with a readable reference kept in the tests. | about +0.3 |
| **0.1** | 2026-10-28 | 1,496 B | First release: true wave surfing over a segmented GuessFactor gun. | |

Release notes for 0.1 to 0.6 are in [docs/releases/](../docs/releases/) (`jaylexi-v<version>.md`).

## Build

    mvn -pl jaylexi verify

The jar is `jaylexi/target/hadur117.mini.JayLexi_<version>.jar` (classes, properties and source,
through ProGuard). `JayLexiJarIT` prints its codesize, holds it under the limit, and replays the jar
against the readable reference.

## Bench

From `hadur-bench`: `kitlab/run.sh mini <jar> "<name version>" <label>` fights a 48-robot MiniRumble
sample (`kitlab/mini-field.txt`, drawn by `tools/kitlab_fields.py`), and
`python3 tools/kitlab_read.py kitlab/mini-field.txt work/kitlab-<label> --ref work/kitlab-ref-komarious --ref-aps 87.54`
reads it as a predicted APS, paired against Komarious 1.88 on the same set.
