Sanaro 0.5, a NanoMelee robot (docs/sanaro.md). One class, 246 bytes, under NanoMelee's 249.

- **Target held by name.** Sanaro keeps its target until any robot dies or a round starts; until then only a robot nearer than the target's last range can take it over. This is the rule d414.nano.Quantum plays, credited here; the code is Sanaro's own. On the live-shaped census it was the one target rule that paid.
- **No power table.** To fit the held target, power is now 2 × (480 / distance) in integers: 3 inside 240 px, 2 out to 480 px, and the 0.1 minimum beyond. Those 0.1 shots stay on purpose: each one reheats the gun, which sets the radar sweeping again.
- **Unchanged:** the anti-gravity movement, the flat lead, the fire gate and the radar that locks as the gun cools.

Bench, on the live-shaped census against 0.4 in the same battles, 12 fresh seeds in two halves, each with an identical copy as its A/A arm:
- +0.46 ± 0.40 and +0.50 ± 0.40, about +0.47 pooled. A/A copies read +0.52 and +0.38.
- Seated in the same fields, Quantum 1.0.0 still reads about 0.2 to 0.3 ahead, so 0.5 projects close behind it.

MeleeRumble participants line (replaces 0.3's):
`hadur117.nano.Sanaro 0.5,https://github.com/lgriffin/Hadur_Robot/releases/download/sanaro-v0.5/hadur117.nano.Sanaro_0.5.jar`
