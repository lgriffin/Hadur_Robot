# Eveimear

`hadur117.micro.Eveimear` is Hadur's MicroRumble (1v1, under 750 bytes) robot, from Leigh's design
plan "JayLexi & Eveimear — MiniRumble and MicroRumble 1v1 Design Plan" and its kitlab drafts. It
moves stop-and-go, one step per enemy shot sized to the bullet's flight, until the enemy's gun has
won back 40 + 23 energy per round by hitting it, then orbits at random for the rest of the battle; its gun is a GuessFactor
gun on Condition waves segmented on velocity history, lateral speed and distance. The design, the
bench and the results are in [docs/kitlab.md](../docs/kitlab.md); the requirements are EVEIMEAR-1 to
EVEIMEAR-12 in [docs/requirements.md](../docs/requirements.md).

0.1 is 722 bytes of 749 (two classes). Released 2026-10-28 (tag `eveimear-v0.1`). It shares the
`hadur117.micro` package with Saor but never a jar.

## Standing

| Version | Date (UTC) | Rumble | Rank | APS | Pairings | Battles | 5th place | Gap to 5th |
| 0.1 | 2026-10-30 21:50 (API) | **MicroRumble** | **9th of 516** | **83.28** | 515 | 2,362 | nz.jdc.micro.HedgehogGF 1.5, 84.96 | +1.68 |
|---|---|---|---|---|---|---|---|---|
| 0.1 | 2026-10-29 07:23 | **MicroRumble** | **9th of 516** | **83.36 ± 0.33** | 515 | 608 | nz.jdc.micro.HedgehogGF 1.5, 84.93 | +1.57 |

**Eveimear 0.1 is 9th in MicroRumble** on its first full pass, 1.57 behind HedgehogGF for 5th and
1.66 under Épéeist 3.7 on the 513 opponents the pages share. The cloud bench predicted 84.28, 0.9 too high,
so 0.2 is read on a second sample too. Most of the gap is against even and strong opponents,
and it is survival (5.7 to 8.5 points under Épéeist's). That points at the random movement after
the switch, and at the radar sweep, more than at the gun. 0.2 is being built in the cloud
around a radar lock, random reversal that adapts to the enemy's bullets, and a wall segment for
the gun. The full read, by opponent group, is in
[docs/bench/live-kitlab-0.1.md](../docs/bench/live-kitlab-0.1.md); the pages are saved in
`data/rumble/pages/` under 2026-10-29T0838Z* (saved 08:38 UTC).

## Build

    mvn -pl eveimear verify

The shipped jar is `eveimear/target/hadur117.micro.Eveimear_<version>.jar` (its classes, properties
and source); `EveimearJarIT` prints its codesize and holds 3 bytes spare.

## Bench

From `hadur-bench`: `kitlab/run.sh micro <jar> "<name version>" <label>` fights the 48-bot
MicroRumble sample (`kitlab/micro-field.txt`), and
`python3 tools/kitlab_read.py kitlab/micro-field.txt work/kitlab-<label> --ref work/kitlab-ref-epeeist --ref-aps 85.06`
reads it as a predicted APS, paired against Épéeist 3.7 on the same set.
