Sanaro 0.4, a NanoMelee robot (docs/sanaro.md). One class, 249 bytes, NanoMelee's limit.

- **Weaker fire at range.** The table's power steps by 480 / distance instead of 640 / distance. Shots drop to 0.1 past 480 px, run at the table's power from 240 to 480 px, and double inside 240 px. The step is one constant, so the code and its 249 bytes are unchanged.
- **Unchanged from 0.3:** the Hadur-taught power table, the fire gate, the flat lead, the anti-gravity movement, the radar flip and the creeping-nearest target.

Bench, on the live-shaped census against 0.3 in the same battles:
- pc-sanaro-n09: +0.10 ± 0.33 (430 battles).
- pc-sanaro-n10 (PR #602), on fresh seeds: +0.30 ± 0.22 (860 battles), with survival up from 24.0 to 27.5.
- About +0.23 pooled. That projects about 65.6, 2nd behind Quantum's 66.44.

MeleeRumble participants line (replaces 0.3's):
`hadur117.nano.Sanaro 0.4,https://github.com/lgriffin/Hadur_Robot/releases/download/sanaro-v0.4/hadur117.nano.Sanaro_0.4.jar`
