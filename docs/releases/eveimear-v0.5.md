Eveimear 0.5, a MicroRumble 1v1 robot (docs/kitlab.md). One class, 749 bytes (ProGuard build), MicroRumble's limit exactly.

- Cotillion 0.8's gun, radar, power and random-mode reversal, by Skilgannon (Julian Kent), whose source ships in its jar and is credited in Eveimear's: a multiple-choice symbolic pattern matcher, a radar locked at twice the bearing, power 100 / distance + min(2, enemy energy / 4), and random orbit that reverses at 0.6 sqrt(bullet speed / distance) - 0.04 a tick.
- Eveimear's own per-robot mode table kept: each MicroRumble robot's char sets when stop-and-go turns to random orbit, now read by the top 14 bits of the name's hash.
- Movement as in 0.4, which already moved as Cotillion does. 0.4's GuessFactor gun, power picks and catcher jitter are gone.

Bench (PC, pc-eveimear-port, PR #676: 112 MicroRumble robots x 12 fresh seeds, 1,344 battles an arm): +2.22 ± 0.76 points of score share over 0.4; Cotillion 0.8 +1.90 ± 0.70, the over-limit transplant +1.95 ± 0.63; A/A +0.05 ± 0.07. 0.3 is live.

RoboRumble participants line (replaces the 0.3 line; LiteRumble scores it in MicroRumble by its codesize):
`hadur117.micro.Eveimear 0.5,https://github.com/lgriffin/Hadur_Robot/releases/download/eveimear-v0.5/hadur117.micro.Eveimear_0.5.jar`
