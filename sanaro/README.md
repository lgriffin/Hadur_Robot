# Sanaro

`hadur117.nano.Sanaro` is Hadur's NanoMelee robot, built to outrank d414.nano.Quantum 1.0.0 (1st)
and sheldor.melee.nano.NaturalScience 1.2.1 (2nd): the DustBunny line's anti-gravity (straight
away: a spiral read best among nanos but costs 0.88 where NanoMelee is scored), Quantum's branch-free radar flip, the
line's hedged lead, and its own table of bullet power by both robots' energy. The design, the cloud
screen and the stages are in [docs/sanaro.md](../docs/sanaro.md); the requirements are SANARO-1 to
SANARO-12 in [docs/requirements.md](../docs/requirements.md).

0.1 is one class of 247 bytes (NanoMelee's limit is 249). Not yet released.

## Build

    mvn -pl sanaro verify

The shipped jar is `sanaro/target/hadur117.nano.Sanaro_<version>.jar` (one class, its properties and
source); `SanaroJarIT` prints its codesize. The power table is written into `Sanaro.java` by
`python3 sanaro/table.py`; `SanaroTableTest` holds it to the formula.

## Bench

From `hadur-bench`: `tools/sanaro_arms.sh` builds the arms in `sanaro-arms/arms.txt` for the
NanoMelee census (`nanomelee-census.txt`, `tools/sanaro_fields.py`), the duel suite or the
live-shaped census, and `tools/sanaro_read.py` reads them. The PC card is `plans/pc-sanaro-n01.queue`.
