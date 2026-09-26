# Bench: hadur117.Hadur 1.20 (cold)

35 rounds x 5 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 4 cores. robocode.cpu.constant=3038666.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Skipped turns | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|
| sample.SpinBot | sanity | 99.2% ± 1.2 | 99.4% ± 1.6 | 98.9% ± 1.2 | 174 / 175 | 3 | 0.72 / 34.0 |
| sample.Tracker | sanity | 99.5% ± 0.0 | 100.0% ± 0.0 | 99.1% ± 0.0 | 175 / 175 | 0 | 0.48 / 17.1 |
| sample.Crazy | sanity | 99.8% ± 0.2 | 100.0% ± 0.0 | 99.7% ± 0.4 | 175 / 175 | 5 | 0.60 / 40.0 |
| sample.Walls | sanity | 99.6% ± 1.0 | 99.4% ± 1.6 | 99.7% ± 0.8 | 174 / 175 | 4 | 0.47 / 11.6 |
| sample.RamFire | sanity | 97.2% ± 1.9 | 99.4% ± 1.6 | 96.6% ± 1.9 | 174 / 175 | 1 | 0.56 / 12.3 |
| abc.Shadow 3.83c | headline | 40.8% ± 8.3 | 46.9% ± 11.9 | 36.5% ± 5.2 | 82 / 175 | 31 | 1.34 / 42.6 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from Hadur's console output.

## Notes (S0)

- **Shadow 3.83c is the headline.** 1.20 wins 82 of 175 rounds (47%), which matches "roughly 50%", but it takes only 40.8% ± 8.3 of the score and 36.5% of the bullet damage. Shadow wins on damage even in rounds it loses, so score share is the number to move, as the artifact predicted.
- The sample bots are sanity checks only: 1.20 wins 872 of 875 rounds against them.
- **The zero-skipped-turns gate fails on 1.20:** 44 skipped turns across 30 battles, 31 of them against Shadow (about 1 every 6 rounds), with turns spiking to 43 ms. The S6 tick budget is real work.
- Battles are seeded, and a seeded battle reproduces exactly while no turn is skipped. A skipped turn changes the robot's behaviour, so repeat runs with skips drift slightly.
