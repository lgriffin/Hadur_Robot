JayLexi 0.5, a MiniRumble 1v1 robot (docs/kitlab.md). Two classes, 1,487 bytes by plain javac, under MiniRumble's 1,499.

- Per-robot orbit angle: a constant-pool string `ORB` gives each recorded robot its orbit off the wave's bearing, in hundredths of a radian, read through the aim row's index. 1.15 as before for most robots, 1.35 for 13 and 0.95 for 9 where pc-jaylexi-orb found it pays (PR #644).
- Codesize diet (pc-jaylexi-diet, PR #626, row set n): the same play written in 24 fewer bytes, which paid for the orbit table.
- Movement, gun, power, surf rows and wall stick otherwise as in 0.4. The replay tests show the shipped code gives the same orders, bit for bit, as the readable version kept with the tests, against the field's row, a recorded robot's row and a robot with its own orbit.

Bench (PC, fresh seeds): orbit picks +0.06 ± 0.04 APS over 0.4's play across 669 pairings (22 robots, 16 of them up; FoilistMC +6.6 points); diet n +0.11 ± 0.16 (play-neutral). 0.4 is 4th live at 88.21.

RoboRumble participants line (replaces the 0.4 line; LiteRumble scores it in MiniRumble by its codesize):
`hadur117.mini.JayLexi 0.5,https://github.com/lgriffin/Hadur_Robot/releases/download/jaylexi-v0.5/hadur117.mini.JayLexi_0.5.jar`
