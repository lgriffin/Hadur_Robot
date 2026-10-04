# Lab 01: a first robot

Changed from lab 00:

- `Hadurling` now locks its radar on the enemy, orbits it at a right angle, aims the
  gun straight at it and fires power 1 when the gun is cool.
- A `static` round counter shows what survives from round to round (Robocode makes a new
  robot object every round, so only static fields do).
- Still one source file; it uses `robocode.util.Utils` for angle maths. Lab 02 replaces that
  with our own, tested code.

Lab 02 starts here.
