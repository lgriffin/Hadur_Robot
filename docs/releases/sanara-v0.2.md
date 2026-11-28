Sanara 0.2, a NanoRumble robot (docs/sanara.md). One class, 248 bytes, written as bytecode by SanaraGen; the jar carries the readable source.

- New: the reversal chance on an enemy shot is set per opponent, from 0 (a plain orbit) to 1, by the opponent's place in a string constant (chance 1 - index / 58000; an opponent not listed reverses on every shot). 0.1 used 0.6 for every bot not on its orbit list. Reversing on every shot cuts the damage taken from linear-aiming mid-field bots two to three times.
- Radar: the one-call lock.
- A perpendicular orbit at full speed, tilted toward 300 px, reversing on a wall.
- Symbolic pattern matching over the enemy's lateral velocity, the longest match of up to 30 ticks replayed as an angle, wrapping at the match period.
- Power 800 / distance, capped at 3 by the engine.

Bench: 81.48 ± 1.04 on the whole NanoRumble division (299 bots, two fresh seeds), paired against PatternAdept 1.0; +3.04 ± 0.84 a bot against 0.1 (live 78.08). Published techniques used: symbolic pattern matching and the one-call radar lock (RoboWiki), and reacting to an enemy shot from its energy drop.

RoboRumble participants line (LiteRumble scores it in NanoRumble, MicroRumble, MiniRumble and RoboRumble):
`hadur117.nano.Sanara 0.2,https://github.com/lgriffin/Hadur_Robot/releases/download/sanara-v0.2/hadur117.nano.Sanara_0.2.jar`
