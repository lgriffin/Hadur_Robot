# Bench: hadur117.Hadur 1.20 (cold)

35 rounds x 5 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 4 cores. robocode.cpu.constant=3979679.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Skipped turns | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|
| sample.SpinBot | sanity | 99.3% ± 0.7 | 100.0% ± 0.0 | 98.8% ± 1.2 | 175 / 175 | 0 | 0.64 / 16.2 |
| sample.Tracker | sanity | 99.1% ± 1.0 | 100.0% ± 0.0 | 98.5% ± 1.7 | 175 / 175 | 2 | 0.58 / 14.5 |
| sample.Crazy | sanity | 99.9% ± 0.1 | 100.0% ± 0.0 | 99.8% ± 0.2 | 175 / 175 | 3 | 0.65 / 20.6 |
| sample.Walls | sanity | 99.9% ± 0.2 | 100.0% ± 0.0 | 99.8% ± 0.3 | 175 / 175 | 1 | 0.56 / 22.0 |
| sample.RamFire | sanity | 97.3% ± 1.2 | 100.0% ± 0.0 | 96.2% ± 1.6 | 175 / 175 | 2 | 0.59 / 12.2 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from Hadur's console output.

## Notes (S0)

- Only the Robocode sample bots are in this run; they are sanity checks, and 1.20 wins 874 of 875 rounds. Shadow and the tier reference bots are missing because this environment can't download them.
- **The zero-skipped-turns gate already fails on 1.20:** 8 skipped turns across 25 battles (8,750 rounds' worth of turns ≈ 1 per 1,100 rounds), with single-turn spikes up to 22 ms.
- Battles are seeded, and a seeded battle reproduces exactly when no turn is skipped. A skipped turn changes what the robot does, so two runs of the same seed can differ once skips happen. That is why this table differs slightly from an earlier run with the same seeds.
