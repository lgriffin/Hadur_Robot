JayLexi 0.3, a MiniRumble 1v1 robot (docs/kitlab.md). Two classes, 1,496 bytes, under MiniRumble's 1,499.

- Per-opponent surf danger: a 47-bin row for each of the 669 MiniRumble robots, learned from JayLexi 0.2's own battles, picked by name hash. The field's row serves robots it has no record of.
- The gun aims at the field's first-shot bin for each of its 480 segments until that segment has a visit.
- Both tables are constant-pool strings, which Robocode's codesize does not count. The build runs the classes through ProGuard 7.8.2 (`jaylexi/proguard.pro`) to fit; javac alone gives 1,509 bytes.
- Movement, gun learning, power, orbit and wall stick as in 0.2. A replay test shows the shipped code gives the same orders, bit for bit, as the readable version kept with the tests, against the field's row and against a recorded robot's row.

Bench (cloud, fresh 48-bot MiniRumble sample `mini-wide2`, against 0.2's play on the same sample): +0.44 ± 0.16 APS (docs/bench/kitlab-priors.md, PR #511). Projects about 87.8 live against 0.2's 87.34.

RoboRumble participants line (replaces the 0.2 line; LiteRumble scores it in MiniRumble by its codesize):
`hadur117.mini.JayLexi 0.3,https://github.com/lgriffin/Hadur_Robot/releases/download/jaylexi-v0.3/hadur117.mini.JayLexi_0.3.jar`
