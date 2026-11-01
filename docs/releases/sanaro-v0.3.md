Sanaro 0.3, a NanoMelee robot (docs/sanaro.md). One class, 249 bytes, NanoMelee's limit.

- **Hadur-taught bullet power.** The table of power by both robots' energy now holds Hadur 3.20's own power in 9,529 of its cells. That is every 2 x 2 block (own energy × target energy) where Hadur fired 20 or more shots, recorded in the 43 live-shaped NanoMelee fields where Sanaro is scored (`tools/distill.py`, pc-sanaro-n07 arm HL). Every other cell keeps 0.2's formula. A string costs only its read, so the code and its 249 bytes are unchanged.
- **Unchanged from 0.2:** the fire gate, the flat lead, the anti-gravity movement, the radar flip, the creeping-nearest target, and the BAND / distance scaling of the table's power.

Bench (pc-sanaro-n07, PR #548), on the live-shaped census on fresh seeds:
- HL read +0.67 ± 0.34 over 0.2, and survival rose from 19.0 to 22.9.
- Hadur's table from the nano fields (n06's HS) held at +0.45 ± 0.33.
- 0.2's bench read was 65.33, against 65.18 live.
- 0.3 projects about 65.8, 2nd behind Quantum's 66.41.

MeleeRumble participants line (replaces 0.2's):
`hadur117.nano.Sanaro 0.3,https://github.com/lgriffin/Hadur_Robot/releases/download/sanaro-v0.3/hadur117.nano.Sanaro_0.3.jar`
