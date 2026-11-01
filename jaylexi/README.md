# JayLexi

`hadur117.mini.JayLexi` is Hadur's MiniRumble (1v1, under 1500 bytes) robot, from Leigh's design
plan "JayLexi & Eveimear — MiniRumble and MicroRumble 1v1 Design Plan" and its kitlab drafts. It is
a true wave surfer that weighs back and forward with precise prediction, over a GuessFactor
gun segmented on velocity history, lateral speed, walls ahead and distance. The design, the bench
and the results are in [docs/kitlab.md](../docs/kitlab.md); the requirements are JAYLEXI-1 to
JAYLEXI-11 in [docs/requirements.md](../docs/requirements.md).

0.1 is 1,496 bytes of 1,499 (two classes; 3 spare, as plan K6 asks). Released 2026-10-28 (tag `jaylexi-v0.1`).

0.2 (released 2026-10-29, tag `jaylexi-v0.2`) also surfs the second nearest wave at a quarter weight, about +0.3 APS
on the bench. That costs 41 bytes in readable code, so the shipped source is the same play written
tighter, 1,485 bytes. The readable version is kept with the tests (`hadur117.mini.ref.JayLexi`), and
`JayLexiReplayTest` (JAYLEXI-11) checks the two give the same orders bit for bit. Change the readable
one first, bench it, then write the shipped one to match.

0.3 (prepared 2026-11-01, tag `jaylexi-v0.3` on Leigh's go) adds two tables learned from JayLexi's own
battles, held in constant-pool strings, which Robocode's codesize does not count: the field's
first-shot bin for each of the gun's 480 segments, and a 47-bin surf danger row for each of the 669
MiniRumble robots, picked by name hash. Bench: +0.44 ± 0.16 APS over 0.2 on a fresh 112-bot sample (6 seeds)
(docs/bench/kitlab-priors.md). Written straight it is 1,509 bytes, so the shipped source is
trimmed to 1,494 bytes with plain javac: waves take themselves off the event list, fire power by
distance is a lookup string, the bin clamp's offset folds into the double, and the busiest
double takes a one-byte local slot.

## Standing

| Version | Date (UTC) | Rumble | Rank | APS | Pairings | Battles | Next up | Gap |
|---|---|---|---|---|---|---|---|---|
| 0.2 | 2026-10-30 21:50 (API) | **MiniRumble** | **5th of 671** | **87.34** | 670 | 2,040 | 1st sheldor.mini.FoilistMC 1.0, 89.01 | +1.67 |
| 0.2 | 2026-10-30 19:50 (settled) | **MiniRumble** | **5th of 671** | **87.34** | 670 | 1,965 | 4th voidious.mini.Komarious 1.88, 87.44 | +0.10 |
| 0.2 | 2026-10-29 20:10 (first pass, API) | **MiniRumble** | **5th of 671** | **87.43 ± 0.29** | 670 | 788 | 1st sheldor.mini.FoilistMC 1.0, 88.99 | +1.57 |
| 0.1 | 2026-10-29 07:23 | **MiniRumble** | **6th of 671** | **86.95 ± 0.29** | 670 | 742 | simonton.mini.WeeksOnEnd 1.10.4, 87.35 | +0.40 |

**JayLexi 0.2 is 5th in MiniRumble.** It settled at 87.34 on 1,965 battles (2026-10-30), 0.10
behind Komarious and level with WeeksOnEnd; 1st is FoilistMC on 89.01, 1.67 ahead. At its first
pass (788 battles) it read 87.43, level with Komarious and past WeeksOnEnd. On the 668 opponents the pages share it is +0.47 over 0.1 (the bench said about +0.3).
It is 1.57 behind FoilistMC for 1st. Seven tenths of that gap is the weak field, the 477 bots
FoilistMC beats almost every round: about half from rounds JayLexi loses to them (99.08% survival
against 99.68%) and half from damage taken in rounds it wins, worst against nanobots (2.34 short
each). Even and strong opponents cost only 0.09. So 0.3 aims at simple-gun dodging and lost rounds
to rammers. The full read is in [docs/bench/live-kitlab-0.2.md](../docs/bench/live-kitlab-0.2.md);
the pages are saved in `data/rumble/pages/` under 2026-10-29T2010Z* (they caught it 5 battles early, at 87.42), and the final API rows in `data/rumble/parsed/2026-10-29T2020Z_*.json`.

0.1 was 6th on its first pass (86.95, 0.40 behind 5th); its read is in
[docs/bench/live-kitlab-0.1.md](../docs/bench/live-kitlab-0.1.md).

## Build

    mvn -pl jaylexi verify

The shipped jar is `jaylexi/target/hadur117.mini.JayLexi_<version>.jar` (its classes, properties and
source); `JayLexiJarIT` prints its codesize, holds 3 bytes spare, and replays the jar itself
against the readable reference.

## Bench

From `hadur-bench`: `kitlab/run.sh mini <jar> "<name version>" <label>` fights the 48-bot MiniRumble
sample (`kitlab/mini-field.txt`, drawn by `tools/kitlab_fields.py`), and
`python3 tools/kitlab_read.py kitlab/mini-field.txt work/kitlab-<label> --ref work/kitlab-ref-komarious --ref-aps 87.54`
reads it as a predicted APS, paired against Komarious 1.88 on the same set.
