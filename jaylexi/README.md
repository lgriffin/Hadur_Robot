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

0.4 (prepared 2026-11-02, tag `jaylexi-v0.4` on Leigh's go) gives the top 120 MiniRumble bots
(by the 2026-11-02 rankings) the field's surf row instead of their own. Live, 0.3's own rows cost
it 6 to 8 APS against each learning gun at the top. Only the data string changes, so it is still
1,494 bytes and plays as 0.3 against the rest. Bench (pc-jaylexi-rows, PR #588): +0.72 ± 0.15
over 0.3 on mini-wide2 (paired estimate 88.65), and +3.05 on the top 60
(docs/bench/live-kitlab-0.3.md).

0.5 (prepared 2026-11-04, tag `jaylexi-v0.5` on Leigh's go) is 1,487 bytes. A codesize diet (PR #626)
writes the same play in fewer bytes, and an `ORB` string spends them on a per-robot orbit angle:
1.35 for 13 robots and 0.95 for 9, 1.15 for the rest (pc-jaylexi-orb, PR #644: +0.06 ± 0.04 APS on
fresh seeds). Notes in docs/releases/jaylexi-v0.5.md.

0.6 (banked 2026-11-04, prepared for release 2026-11-05, tag `jaylexi-v0.6` on Leigh's go) adds aim jitter against bullet catchers (JAYLEXI-19): BulletCatcher's
orbit char carries 2 pi more, which switches on up to 0.125 rad of random gun turn; every other robot plays as
0.5. +57.3 ± 3.3 points against BulletCatcher on 20 fresh seeds, +0.086 APS
([docs/bench/local/2026-11-04_jaylexi-jit.md](../docs/bench/local/2026-11-04_jaylexi-jit.md)). It is 1,507 bytes
with javac, so the jar is built through ProGuard again (`jaylexi/proguard.pro`) to 1,494 bytes.

0.7 (built 2026-11-12, not released) adds a walls segment to the surf (JAYLEXI-20): the surf stats are
also kept by how much of our orbit ahead is still in the field, as the enemy sees it. +0.53, +0.29, +0.31 and +0.48 over 0.6
on four fresh cloud seed sets, and the fitted build read +0.55 ± 0.49
([docs/bench/jaylexi-own-movement.md](../docs/bench/jaylexi-own-movement.md)). 1,495 bytes through ProGuard.

## Standing

| Version | Date (UTC) | Rumble | Rank | APS | Pairings | Battles | Next up | Gap |
|---|---|---|---|---|---|---|---|---|
| 0.4 | 2026-11-03 17:35 (first pass, API) | **MiniRumble** | **4th of 670** | **88.21 ± 0.29** | 669 | 773 | 3rd sheldor.mini.Foilist 1.3.1, 88.46; 1st FoilistMC 1.0, 89.00 | +0.25 / +0.79 |
| 0.3 | 2026-11-02 14:40 (first pass, API) | **MiniRumble** | **4th of 671** | **87.93 ± 0.28** | 669 | 855 | 1st sheldor.mini.FoilistMC 1.0, 89.02 | +1.09 |
| 0.2 | 2026-10-30 21:50 (API) | **MiniRumble** | **5th of 671** | **87.34** | 670 | 2,040 | 1st sheldor.mini.FoilistMC 1.0, 89.01 | +1.67 |
| 0.2 | 2026-10-30 19:50 (settled) | **MiniRumble** | **5th of 671** | **87.34** | 670 | 1,965 | 4th voidious.mini.Komarious 1.88, 87.44 | +0.10 |
| 0.2 | 2026-10-29 20:10 (first pass, API) | **MiniRumble** | **5th of 671** | **87.43 ± 0.29** | 670 | 788 | 1st sheldor.mini.FoilistMC 1.0, 88.99 | +1.57 |
| 0.1 | 2026-10-29 07:23 | **MiniRumble** | **6th of 671** | **86.95 ± 0.29** | 670 | 742 | simonton.mini.WeeksOnEnd 1.10.4, 87.35 | +0.40 |

**JayLexi 0.3 is 4th in MiniRumble** on its first pass (87.93 ± 0.28, 2026-11-02), past
Komarious and WeeksOnEnd, 0.56 behind Foilist for 3rd and 1.09 behind FoilistMC for 1st. On the 664
opponents the pages share it is +0.62 over 0.2 (the bench said +0.44). The tables won ranks 121 and
down (+0.89 of APS) and cost the top 30 (−0.27; −6 to −8 APS a bot against the learning guns), which
are now half the gap to 1st. The plan for 1st starts with giving the top bots the neutral surf row,
which costs no bytes: [docs/bench/live-kitlab-0.3.md](../docs/bench/live-kitlab-0.3.md).

**JayLexi 0.2 was 5th in MiniRumble.** It settled at 87.34 on 1,965 battles (2026-10-30), 0.10
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
source, ProGuard-optimised from 0.6); `JayLexiJarIT` prints its codesize, holds 3 bytes spare, and
replays the jar itself against the readable reference.

## Bench

From `hadur-bench`: `kitlab/run.sh mini <jar> "<name version>" <label>` fights the 48-bot MiniRumble
sample (`kitlab/mini-field.txt`, drawn by `tools/kitlab_fields.py`), and
`python3 tools/kitlab_read.py kitlab/mini-field.txt work/kitlab-<label> --ref work/kitlab-ref-komarious --ref-aps 87.54`
reads it as a predicted APS, paired against Komarious 1.88 on the same set.
