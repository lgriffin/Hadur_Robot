Sanara 0.1, a NanoRumble robot (docs/sanara.md). One class, 249 bytes, written as bytecode by SanaraGen; the jar carries the readable source.

- Radar: the one-call lock.
- A perpendicular orbit at full speed, tilted toward 300 px, reversing on a wall. On an enemy energy drop it reverses with chance 0.6, except against the 142 bots on its orbit list, which the bench found hit a reversing orbit harder than a plain one.
- Symbolic pattern matching over the enemy's lateral velocity, the longest match of up to 30 ticks replayed as an angle, wrapping at the match period.
- Power 800 / distance, capped at 3 by the engine.

Bench: 78.41 ± 1.35 on the whole NanoRumble division (299 bots, four seeds), paired against PatternAdept 1.0 (live 77.69, 5th). Published techniques used: symbolic pattern matching and the one-call radar lock (RoboWiki), and reacting to an enemy shot from its energy drop.

RoboRumble participants line (LiteRumble scores it in NanoRumble, MicroRumble, MiniRumble and RoboRumble):
`hadur117.nano.Sanara 0.1,https://github.com/lgriffin/Hadur_Robot/releases/download/sanara-v0.1/hadur117.nano.Sanara_0.1.jar`
