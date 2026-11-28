# Sanara

`hadur117.nano.Sanara` is a NanoRumble robot: a one-on-one robot under the NanoRumble's 250-byte
codesize limit. Version 0.1 entered the NanoRumble on 28 November 2026 and placed 5th of 300 at
78.08 APS (PWIN 91.97%) after its first battles, close to its bench read of 78.4.

The design, the bench screens and how the class was fitted are in
[docs/sanara.md](../docs/sanara.md); the requirements are SANARA-1 to SANARA-3 in
[docs/requirements/sanara.md](../docs/requirements/sanara.md).

## How it works

Sanara is one class of 249 bytes. javac cannot write its play in fewer than about 300 bytes, so
`hadur117.nano.gen.SanaraGen` writes the class as bytecode during the build;
[Sanara.java](src/main/source/hadur117/nano/Sanara.java), shipped in the jar, is the readable form.

- **Radar:** the one-call lock.
- **Movement:** a perpendicular orbit at full speed, tilted toward 300 px. When the enemy's energy
  drops (it fired), Sanara reverses with chance 0.6, except against the bots on its orbit list,
  which the bench found hit a reversing orbit harder than a plain one. It also reverses on a wall.
- **Gun:** symbolic pattern matching over the enemy's lateral velocity, one character a tick. The
  longest recent match of up to 30 ticks is replayed as an angle: the lateral speeds that followed
  it, summed over the bullet's flight and divided by the distance, wrapping back to the match when
  the replay reaches the present.
- **Power:** 800 over the distance, which the engine caps at 3 inside 267 px.

## Credits

Published techniques used: symbolic pattern matching and the one-call radar lock, both described
on the RoboWiki, and reacting to an enemy shot from its energy drop. No other robot's code is used.

## Build

    mvn -pl sanara verify
