# Sanaro

`hadur117.nano.Sanaro` is a NanoMelee robot: a melee robot under the NanoMelee's 250-byte
codesize limit. **Sanaro 0.3 is 2nd of 90 in the NanoMelee** (65.41 ± 0.29 APS, 2026-11-02),
1.03 behind d414.nano.Quantum 1.0.0.

The design, the bench screens and each stage are in [docs/sanaro.md](../docs/sanaro.md); the
requirements are SANARO-1 to SANARO-14 in [docs/requirements/sanaro.md](../docs/requirements/sanaro.md).

## How it works

Sanaro is one class of 249 bytes.

- **Movement: anti-gravity** in the style of the DustBunny line of nanobots, pushing straight away
  from where each robot is about to be. (A spiral read best among nanos in duels but cost 0.88 APS
  in the melee fields where NanoMelee is scored.)
- **Radar** that flips direction on its own threshold and locks as the gun cools.
- **Gun** with a flat lead of its own and a fire gate: it fires only when the gun is on the lead.
- **Bullet power from a table** indexed by both robots' energy, held in a string (Robocode's
  codesize does not count strings). Most cells follow a formula; in 0.3, 9,529 cells hold the
  power Hadur 3.20 used in the same situations, distilled from its shots in 43 live-shaped
  NanoMelee fields (every 2 × 2 block of the table where Hadur fired 20 or more shots).

## Standing

| Version | Read (UTC) | Rumble | Rank | APS | Pairings | Leader |
|---|---|---|---|---|---|---|
| 0.3 | 2026-11-02 16:00 | **NanoMelee** | **2nd of 90** | **65.41 ± 0.29** | | d414.nano.Quantum 1.0.0, 66.44 |
| 0.2 | 2026-10-30 21:50 | NanoMelee | 2nd | 65.15 | 89 | Quantum 1.0.0, 66.41 |
| 0.1 | 2026-10-28 | NanoMelee | 2nd | 65.21 | | Quantum 1.0.0, 66.44 |

LiteRumble scores the size rumbles from the same MeleeRumble battles, so Sanaro also appears in
the larger tables: 0.2 was 11th in MicroMelee (64.14), 21st in MiniMelee (63.56) and 79th in the
MeleeRumble (59.98).

## Release history

Released versions are tagged `sanaro-v<version>`. Bench gains are in APS over the previous
version, on a census shaped like the live NanoMelee fields.

| Version | Released | Size | What changed | Bench |
|---|---|---|---|---|
| 0.4 | built, not released | 249 B | Weaker fire at range: power falls to 0.1 past 480 px and halves from 240 px (480 / distance instead of 640 / distance). | about +0.23 pooled over 1,290 battles; survival 24% to 27.5% |
| **0.3** | 2026-11-01 | 249 B | Hadur-taught bullet power in 9,529 cells of the power table; the code is unchanged. | +0.67 ± 0.34; survival 19.0% to 22.9% |
| **0.2** | 2026-10-30 | 249 B | The fire gate and Sanaro's own flat lead. | +0.55 ± 0.32 |
| **0.1** | 2026-10-28 | 247 B | First release: anti-gravity, radar flip and the energy power table. | |

Release notes are in [docs/releases/](../docs/releases/) (`sanaro-v<version>.md`).

## Build

    mvn -pl sanaro verify

The jar is `sanaro/target/hadur117.nano.Sanaro_<version>.jar` (one class, its properties and
source); `SanaroJarIT` prints its codesize. The power table is written into `Sanaro.java` by
`python3 sanaro/table.py`, and `SanaroTableTest` holds it to the formula outside the cells Hadur
taught. A table distilled from Hadur's shots (`hadur-bench/tools/distill.py power`, BENCH-156)
goes into a bench arm first, never into the shipped robot until the census has measured it.

## Bench

From `hadur-bench`: `tools/sanaro_arms.sh` builds the arms listed in `sanaro-arms/arms.txt` for the
NanoMelee census (`nanomelee-census.txt`, drawn by `tools/sanaro_fields.py`), the duel suite or the
live-shaped census, and `tools/sanaro_read.py` reads the results. The bench plans are
`plans/pc-sanaro-*.queue`.
