Eveimear 0.2, a MicroRumble 1v1 robot (docs/kitlab.md). Two classes, 746 bytes, under MicroRumble's 749.

- Per-opponent mode: a constant-pool string `MODES`, keyed by `name.hashCode() & 16383`, scales the damage threshold (40 + 23 per round) at which stop-and-go gives way to random orbit. It was learned from Eveimear's own battles with each mode forced: 415 robots keep the 0.1 switch, 24 hold stop-and-go for good, and 76 move at random from the first hit.
- Movement, anti-ram and the GuessFactor gun as in 0.1.

Bench (cloud, fresh 48-bot MicroRumble sample `micro-wide2`, against 0.1 on the same sample): +0.36 ± 0.17 APS, 83.57 against 83.20 (PR #527). Projects about 83.7 live against 0.1's 83.36.

RoboRumble participants line (replaces the 0.1 line; LiteRumble scores it in MicroRumble by its codesize):
`hadur117.micro.Eveimear 0.2,https://github.com/lgriffin/Hadur_Robot/releases/download/eveimear-v0.2/hadur117.micro.Eveimear_0.2.jar`
