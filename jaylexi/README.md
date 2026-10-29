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

## Standing

| Version | Date (UTC) | Rumble | Rank | APS | Pairings | Battles | 5th place | Gap to 5th |
|---|---|---|---|---|---|---|---|---|
| 0.1 | 2026-10-29 07:23 | **MiniRumble** | **6th of 671** | **86.95 ± 0.29** | 670 | 742 | simonton.mini.WeeksOnEnd 1.10.4, 87.35 | +0.40 |

**JayLexi 0.1 is 6th in MiniRumble** on its first full pass, 0.40 behind WeeksOnEnd for 5th and 0.50
under Komarious (4th, 87.45). The cloud bench predicted 87.05, so it transfers. Against Komarious on
the 668 opponents the pages share it is 0.47 short. A third of that gap comes from close-range bots that
Komarious beats almost every round (JayLexi survives less: NanoDeath 80% against 97%), and the
rest from learning guns (Jen, Aristocles, Raiko, Cotillion). 0.2 is being built in the cloud
around power by energy, a nearer-distance danger and a reverse-wall gun segment. The full read, by opponent group, is in
[docs/bench/live-kitlab-0.1.md](../docs/bench/live-kitlab-0.1.md); the pages are saved in
`data/rumble/pages/` under 2026-10-29T0838Z* (saved 08:38 UTC).

## Build

    mvn -pl jaylexi verify

The shipped jar is `jaylexi/target/hadur117.mini.JayLexi_<version>.jar` (its classes, properties and
source); `JayLexiJarIT` prints its codesize and holds 3 bytes spare.

## Bench

From `hadur-bench`: `kitlab/run.sh mini <jar> "<name version>" <label>` fights the 48-bot MiniRumble
sample (`kitlab/mini-field.txt`, drawn by `tools/kitlab_fields.py`), and
`python3 tools/kitlab_read.py kitlab/mini-field.txt work/kitlab-<label> --ref work/kitlab-ref-komarious --ref-aps 87.54`
reads it as a predicted APS, paired against Komarious 1.88 on the same set.
