# Repeatability and cold versus warm, Hadur 3.8.5 against the 1v1 top 20

Date: 2026-10-07. Runs `repeat-385` (06:29 to 06:46 UTC) and `coldwarm-385` (06:46 to 07:01 UTC)
from the overnight queue. No core robot change; bench data only.

## Conditions

Robocode 1.11.1, 35 rounds, 800x600, `top20.txt` (20 opponents), CPU constant pinned at 1488498,
`--parallel 12 --child-cpus 2`, child heap capped at 2G, retries 1 (0 failed, 0 retried in both
runs). Host AMD Threadripper PRO 9965WX, 48 logical cores. The owner's RoboRumble clients were
running, as always. Host sample, repeat run: CPU mean 28.6%, max 55.6%, up to 1 other JVM seen
(987 samples). Cold-warm run: CPU mean 29.3%, max 56.2%, up to 1 other JVM (869 samples).
Trust is only fair. Repeat: 21.6 skipped turns and 21.1 duress ticks per battle, duress in 14 of
180 battles. Cold-warm: cold half 23.1 skips and 37.2 duress per battle (duress in 9 of 80),
warm half 30.5 skips and 4.7 duress per battle (duress in 1 of 80). The report counts 50 of 80
cold battles as trusted.

## Repeatability: same jar, opponent and seed, three times

Design: 3 seeds x 20 opponents x 3 repeats = 180 battles of one jar (3.8.5), run back to back in
one session. Data: `data/bench/2026-10-07_hadur-repeat-385-local_cold.tsv` (repeat column
r1..r3). Tool: `repeatability.py --run-col repeat --build 3.8.5`.

| Measure | This run (3.8.5, top 20, 3 seeds) | Charter figure (3.7, leak set, 16 seeds, two sessions) |
|---|---:|---:|
| Per-battle SD of score share | 5.21 points | 3.21 points |
| Cells identical in every run | 0 of 60 | 29 of 512 pairs |
| ICC overall | 0.82 | 0.90 |
| ICC within opponent | 0.01 | -0.05 |

Reading: a seed still does not make a battle repeatable. The within-opponent ICC is again about
zero, so the seed explains none of the spread inside an opponent, which agrees with the charter's
principle 1. The SD is larger here (5.2 against 3.2). The sets differ (top 20 against a 32-robot
leak set), so this is not evidence that the robot changed. The top 20 contain no robot that Hadur
beats or loses to every round, which is where exact repeats come from. Per-opponent SDs run from
1.95 (Diamond) and 2.22 (DrussGT) to 7.56 (XanderCat), 7.80 (Dookious) and 9.04 (Wavelet); the
pooled figure is 5.21. With three seeds a per-opponent SD is itself loose, so plan seeds from the
pooled figure and the 100-seed `top20big` run, not from one opponent's number.

Planning consequence: two builds differ by a battle-pair SD of about 5.2 x sqrt 2 = 7.4 points,
so 100 seeds over 20 opponents (2000 pairs) gives a per-battle half-width of about 0.3 points. The
opponent-clustered interval, 2.5 to 3.3 times wider as measured earlier, is about 0.8 to 1.0.

## Cold versus warm

Design: 4 seeds x 20 opponents, each seed fought cold (data wiped), then warm on the shelf the
cold battle left (BENCH-54). 80 complete pairs. Data:
`2026-10-07_hadur-coldwarm-385-local_cold.tsv` and `_warm.tsv` (with `_rounds` files), build
label 3.8.5 in both.

| Measure | Value |
|---|---:|
| Cold score share | 53.4% |
| Warm score share | 51.8% |
| Warm minus cold, per battle | -1.62 ± 1.71 points (n=80) |
| Warm minus cold, opponent-clustered | -1.62 ± 1.82 points (20 opponents) |
| SD of the paired difference | 7.71 points |

Neither interval excludes zero, per battle [-3.33, +0.09] or clustered [-3.44, +0.20], so warm
is not resolved from cold. The point estimate is slightly negative, not the gain a stored profile
should give. The SD of a difference of 7.71 is close to what the repeat run predicts for two
independent battles (5.21 x sqrt 2 = 7.37), so the warm battle carries no more information about
the cold one than a fresh repeat would.

Per opponent the paired means run from -7.3 (Nene), -6.8 (Saguaro), -6.6 (Dookious), -5.9
(WaveSerpent) and -5.7 (GresSuffurd) to +3.7 (Gilgalad) and +4.5 (Phoenix), on four pairs each,
which is inside the noise for four battles at an SD of 5 to 8. None is read as a gain or a loss.

Confounds: duress is concentrated in the cold half (37.2 against 4.7 ticks per battle), which
would push cold down, the opposite of what is seen, so it does not explain the sign. Warm
battles skipped more turns (30.5 against 23.1). A battle's first-round shelf is a single
previous battle of the same seed, so the test is of self-learning from one prior fight, not of a
long-run profile.

Conclusion: the cold-versus-warm result does not change the earlier reading. Starting warm gives
no measurable gain on this set at 4 seeds; a difference of under about 3 points cannot be
excluded in either direction.

## Files

- `data/bench/2026-10-07_hadur-repeat-385-local_cold.tsv` (180 rows)
- `data/bench/2026-10-07_hadur-coldwarm-385-local_cold.tsv`, `_cold_rounds.tsv`, `_warm.tsv`,
  `_warm_rounds.tsv` (80 battle rows and 2800 round rows each)
- five rows in `data/catalog.tsv`
- run reports `2026-10-07_repeat-385.md` and `2026-10-07_coldwarm-385.md` and their per-opponent
  folders, already in `docs/bench/local/`.
