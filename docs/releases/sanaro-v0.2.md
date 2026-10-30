Sanaro 0.2, a NanoMelee robot (docs/sanaro.md). One class, 249 bytes, NanoMelee's limit.

- A fire gate: the gun fires only once it is within 18 / distance radians of the lead (SANARO-14), the gate Quantum 1.0.0 shows pays most of the gap to it, golfed to 14 bytes.
- Sanaro's own lead: lateral velocity over 16 at every range, in place of the line's v / (10 + 1.008^distance). It frees the 9 bytes the gate needs.
- Unchanged from 0.1: anti-gravity from where each robot is about to be, decayed 0.9 a scan, with a wall push, driven straight away; the radar that flips onto the target below gun heat 0.9; the creeping-nearest target; the table of bullet power by both robots' energy, scaled by 640 / distance.

Bench (pc-sanaro-n04, PR #445): +0.55 ± 0.32 over 0.1 on the live-shaped NanoMelee census, which carried 0.1's read to live 1:1 (bench 65.17, live 65.21). Projects about 65.8, 2nd behind Quantum's 66.44.

MeleeRumble participants line (replaces 0.1's):
`hadur117.nano.Sanaro 0.2,https://github.com/lgriffin/Hadur_Robot/releases/download/sanaro-v0.2/hadur117.nano.Sanaro_0.2.jar`
