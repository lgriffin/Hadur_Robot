# Sanaro

`hadur117.nano.Sanaro` is Hadur's NanoMelee robot, built to outrank d414.nano.Quantum 1.0.0 (1st)
and sheldor.melee.nano.NaturalScience 1.2.1 (2nd): the DustBunny line's anti-gravity (straight
away: a spiral read best among nanos but costs 0.88 where NanoMelee is scored), a radar flip with
its own threshold, the line's fire gate, a flat lead of its own and its own table of bullet power by
both robots' energy. The design, the cloud
screen and the stages are in [docs/sanaro.md](../docs/sanaro.md); the requirements are SANARO-1 to
SANARO-14 in [docs/requirements.md](../docs/requirements.md).

0.1 (247 bytes, released 2026-10-28, tag `sanaro-v0.1`) is live 2nd in NanoMelee at 65.21, behind
Quantum's 66.44. 0.2 is one class of 249 bytes (NanoMelee's limit): it adds the fire gate and
Sanaro's flat lead, +0.55 ± 0.32 over 0.1 on the live-shaped census (pc-sanaro-n04), so about 65.8.

0.2 (released 2026-10-30, tag `sanaro-v0.2`) is live 2nd in NanoMelee at 65.15 (89 pairings, API read
2026-10-30 21:50 UTC), 1.26 behind Quantum's 66.41. It is 11th in MicroMelee (64.14), 21st in MiniMelee
(63.56) and 79th in MeleeRumble (59.98).

## Build

    mvn -pl sanaro verify

The shipped jar is `sanaro/target/hadur117.nano.Sanaro_<version>.jar` (one class, its properties and
source); `SanaroJarIT` prints its codesize. The power table is written into `Sanaro.java` by
`python3 sanaro/table.py`; `SanaroTableTest` holds it to the formula. A table distilled from Hadur's own
shots instead (`hadur-bench/tools/distill.py power`, BENCH-156) goes into an arm's source, never here
until the census has measured it.

## Bench

From `hadur-bench`: `tools/sanaro_arms.sh` builds the arms in `sanaro-arms/arms.txt` for the
NanoMelee census (`nanomelee-census.txt`, `tools/sanaro_fields.py`), the duel suite or the
live-shaped census, and `tools/sanaro_read.py` reads them. The PC cards are `plans/pc-sanaro-n01.queue` to `plans/pc-sanaro-n04.queue`.
