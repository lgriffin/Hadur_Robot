Eveimear 0.1, a MicroRumble 1v1 robot (docs/kitlab.md). Two classes, 722 bytes, under MicroRumble's 749.

- Stop-and-go: one step per enemy shot, sized to the bullet's flight, along a 160 px stick-smoothed orbit; once the enemy's hits have won back more than 40 + 23 per round, random orbit for good.
- Anti-ram: under 100 px it retreats, keeps moving every tick and fires power 3.
- A GuessFactor gun of 25 bins on Condition waves, segmented on velocity history, lateral speed and distance; power 2.

Bench (cloud, 48-bot MicroRumble sample, paired against Épéeist 3.7): 84.28 ± 0.46 APS, against a 5th-place bar of 85.03.

RoboRumble participants line (LiteRumble scores it in MicroRumble by its codesize):
`hadur117.micro.Eveimear 0.1,https://github.com/lgriffin/Hadur_Robot/releases/download/eveimear-v0.1/hadur117.micro.Eveimear_0.1.jar`
