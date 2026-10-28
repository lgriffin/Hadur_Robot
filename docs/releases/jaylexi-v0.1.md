JayLexi 0.1, a MiniRumble 1v1 robot (docs/kitlab.md). Two classes, 1,496 bytes, under MiniRumble's 1,499 with 3 spare.

- A true wave surfer: precise prediction of back and forward to each enemy wave, the less dangerous way taken, danger as the logged guess factor over the distance to the enemy to the fourth; straight away from the enemy while no wave is in flight.
- A GuessFactor gun on waves every scan, segmented on velocity history, lateral speed, walls ahead and distance; power 3 close in, else 2.
- Orbit 1.15 rad off the wave, a 140 px wall stick, a radar lock that scans every tick.

Bench (cloud, 48-bot MiniRumble sample, paired against Komarious 1.88): 87.05 ± 0.45 APS, against a 5th-place bar of 87.40.

RoboRumble participants line (LiteRumble scores it in MiniRumble by its codesize):
`hadur117.mini.JayLexi 0.1,https://github.com/lgriffin/Hadur_Robot/releases/download/jaylexi-v0.1/hadur117.mini.JayLexi_0.1.jar`
