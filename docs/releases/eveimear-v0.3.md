Eveimear 0.3, a MicroRumble 1v1 robot (docs/kitlab.md). Two classes, 741 bytes by plain javac, under MicroRumble's 749.

- Per-robot fire power: each `MODES` char now holds 16 x wave speed + mode, so a picked robot gets its own bullet power, and the gun's waves and escape angle follow the speed (pc-eveimear-pw, PR #634: power 1 for 7 robots, power 3 for 6).
- More mode picks: 16 more robots get random orbit or stop-and-go from fresh-seed reads (pc-eveimear-st2, PR #622).
- Codesize diet (pc-eveimear-diet, PR #627, row set n): the same play in 27 fewer bytes, which paid for the power.
- Movement, anti-ram and the GuessFactor gun otherwise as in 0.2.

Bench (PC, fresh seeds, over 515 pairings): power picks +0.14 ± 0.10 APS, mode picks +0.08 ± 0.03, diet -0.02 ± 0.08 (play-neutral). 0.2 is 9th live at 83.39.

RoboRumble participants line (replaces the 0.2 line; LiteRumble scores it in MicroRumble by its codesize):
`hadur117.micro.Eveimear 0.3,https://github.com/lgriffin/Hadur_Robot/releases/download/eveimear-v0.3/hadur117.micro.Eveimear_0.3.jar`
