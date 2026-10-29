JayLexi 0.2, a MiniRumble 1v1 robot (docs/kitlab.md). Two classes, 1,485 bytes, under MiniRumble's 1,499.

- Surfing now weighs the second nearest enemy wave too, at a quarter of its danger, when choosing back or forward.
- The code is rewritten tighter to fit; a replay test shows it gives the same orders, bit for bit, as the readable version kept with the tests (JAYLEXI-11).
- Gun, power, orbit 1.15 and wall stick as in 0.1.

Bench (cloud, two 48-bot MiniRumble samples, 8 seeds each, against 0.1 on the same samples): +0.11 and +0.48, about +0.3 APS.

RoboRumble participants line (LiteRumble scores it in MiniRumble by its codesize):
`hadur117.mini.JayLexi 0.2,https://github.com/lgriffin/Hadur_Robot/releases/download/jaylexi-v0.2/hadur117.mini.JayLexi_0.2.jar`
