Sanaro 0.1, a NanoMelee robot (docs/sanaro.md). One class, 247 bytes, under NanoMelee's 249.

- Anti-gravity from where each robot is about to be, decayed 0.9 a scan, with a wall push, driven straight away from the field (no spiral).
- A radar that sweeps while the gun cools and flips onto the target once it is nearly ready (gun heat below 0.9).
- A hedged lead on the creeping-nearest target.
- Its own table of bullet power by both robots' energy: 0.1 + own energy / 16 (at most 2.5, 3.0 from 120 energy), never more than the least power that kills the target, scaled by 640 / distance.

Bench (pc-sanaro-n01): 65.17 on the live-shaped NanoMelee census, where the seated Quantum 1.0.0 read 66.58 (live 66.60) and NaturalScience 1.2.1 65.31 (live 64.88). This release tests that read live; pc-sanaro-n02 measures the power-curve arms beside it.

MeleeRumble participants line (LiteRumble scores it in NanoMelee, MicroMelee, MiniMelee and MeleeRumble):
`hadur117.nano.Sanaro 0.1,https://github.com/lgriffin/Hadur_Robot/releases/download/sanaro-v0.1/hadur117.nano.Sanaro_0.1.jar`
