# D0: DrussGT 3.1.16 bench probes (4-5 October 2026)

Hadur 3.5.1 as released and five probe builds against jk.mega.DrussGT 3.1.16, 35 rounds a battle, fixed seeds, cold (no saved data). Notes and analysis only: no robot or bench Java in the repository changed. The plan this feeds is `docs/druss-route-plan.md`.

## Headline

- Released 3.5.1 takes **37.53% ± 3.49** of the score (10 battles). Both guns hit below break-even; Hadur's shooting costs it 39.6 energy lead a round against DrussGT's 27.8.
- A probe with a lead-aware power rule (0.1 bullets while level or ahead) takes **50.69% ± 3.39**, paired **+13.16 ± 4.18**; outright round wins 188 against 86 of 350.
- Sampled aim on top of that: 51.43% ± 2.98, **+0.74 ± 3.96** over lead-aware, so unconfirmed.
- Random gun 34.17%, all chaff 29.94%, hold fire 24.55% (2 battles, no useful interval): none beats the lead-aware rule.
- In the rumble the lead-aware step is worth about 0.01 APS; the shield list on 357 pairings is worth 1.7 to 2.9 APS at 88-92% (82.27% mean now).

## Per-build figures

Reproduce with `python3 data/tools/drussgt/summary.py` (reads only the committed tables).

```
released: 10 battles, score share 37.53% ±3.49 (sd 4.87)
  rounds 350: won outright 86 (24.6%), double kill 13, lost 251 (71.7%); engine first places 99; 2907 ticks a round
  bullet damage a round 28.8 against 28.3; skipped turns 93 (9.1 per 100,000)
  hadur   237.1 shots a round, spent 88.1, refunded 19.2, damage 29.3, effect on own lead -39.6
          hit rate 7.47% ±0.18 | light 7.50% ±0.21 (72% of shots) | power 1.7 to 2.2 7.08% ±0.53 | destroyed by a bullet 12.3%
  drussgt 237.8 shots a round, spent 76.4, refunded 19.9, damage 28.8, effect on own lead -27.8
          hit rate 9.69% ±0.20 | light 9.91% ±0.23 (81% of shots) | power 1.7 to 2.2 7.05% ±0.68 | destroyed by a bullet 12.2%
  tick  200: mean lead  +0.1 | ahead in 140 rounds, won 40.0% | not ahead in 210, won 14.3%
  tick  400: mean lead  -4.1 | ahead in 147 rounds, won 47.6% | not ahead in 203, won  7.9%
  tick  600: mean lead  -8.6 | ahead in 114 rounds, won 62.3% | not ahead in 236, won  6.4%
  tick  800: mean lead -10.6 | ahead in  93 rounds, won 72.0% | not ahead in 257, won  7.4%
  tick 1000: mean lead -11.3 | ahead in  82 rounds, won 75.6% | not ahead in 268, won  9.0%

lead-aware: 10 battles, score share 50.69% ±3.39 (sd 4.73)
  rounds 350: won outright 188 (53.7%), double kill 4, lost 158 (45.1%); engine first places 192; 3296 ticks a round
  bullet damage a round 25.9 against 29.8; skipped turns 90 (7.8 per 100,000)
  hadur   277.8 shots a round, spent 77.5, refunded 16.9, damage 26.2, effect on own lead -34.3
          hit rate 7.80% ±0.17 | light 7.89% ±0.18 (90% of shots) | power 1.7 to 2.2 6.98% ±0.52 | destroyed by a bullet 12.3%
  drussgt 271.3 shots a round, spent 80.3, refunded 20.6, damage 30.3, effect on own lead -29.4
          hit rate 9.93% ±0.19 | light 10.18% ±0.20 (91% of shots) | power 1.7 to 2.2 7.03% ±0.60 | destroyed by a bullet 12.5%
  tick  200: mean lead  +1.6 | ahead in 136 rounds, won 79.4% | not ahead in 214, won 37.4%
  tick  400: mean lead  -0.5 | ahead in 175 rounds, won 89.1% | not ahead in 175, won 18.3%
  tick  600: mean lead  -2.6 | ahead in 197 rounds, won 88.3% | not ahead in 153, won  9.2%
  tick  800: mean lead  -2.9 | ahead in 200 rounds, won 86.5% | not ahead in 150, won 10.0%
  tick 1000: mean lead  -3.0 | ahead in 209 rounds, won 86.1% | not ahead in 141, won  5.7%

lead-aware-sampled: 10 battles, score share 51.43% ±2.98 (sd 4.16)
  rounds 350: won outright 191 (54.6%), double kill 4, lost 155 (44.3%); engine first places 195; 3234 ticks a round
  bullet damage a round 27.4 against 30.6; skipped turns 84 (7.4 per 100,000)
  hadur   268.8 shots a round, spent 77.0, refunded 18.0, damage 27.7, effect on own lead -31.3
          hit rate 9.06% ±0.18 | light 9.28% ±0.20 (90% of shots) | power 1.7 to 2.2 7.11% ±0.53 | destroyed by a bullet 11.2%
  drussgt 266.6 shots a round, spent 80.1, refunded 21.1, damage 31.1, effect on own lead -27.9
          hit rate 9.94% ±0.19 | light 10.16% ±0.20 (91% of shots) | power 1.7 to 2.2 7.52% ±0.61 | destroyed by a bullet 11.4%
  tick  200: mean lead  +0.2 | ahead in 164 rounds, won 76.2% | not ahead in 186, won 35.5%
  tick  400: mean lead  -1.9 | ahead in 172 rounds, won 91.3% | not ahead in 178, won 19.1%
  tick  600: mean lead  -3.0 | ahead in 188 rounds, won 90.4% | not ahead in 162, won 13.0%
  tick  800: mean lead  -3.3 | ahead in 199 rounds, won 88.9% | not ahead in 151, won  9.3%
  tick 1000: mean lead  -3.2 | ahead in 203 rounds, won 88.7% | not ahead in 147, won  7.5%

random-gun: 5 battles, score share 34.17% ±4.87 (sd 3.92)
  rounds 175: won outright 36 (20.6%), double kill 6, lost 133 (76.0%); engine first places 41; 2931 ticks a round
  bullet damage a round 28.2 against 30.7; skipped turns 57 (11.1 per 100,000)
  hadur   240.2 shots a round, spent 85.8, refunded 18.9, damage 28.4, effect on own lead -38.5
          hit rate 8.27% ±0.26 | light 8.58% ±0.31 (73% of shots) | power 1.7 to 2.2 6.86% ±0.77 | destroyed by a bullet 10.0%
  drussgt 240.9 shots a round, spent 76.7, refunded 21.8, damage 31.5, effect on own lead -23.5
          hit rate 10.49% ±0.29 | light 10.71% ±0.33 (81% of shots) | power 1.7 to 2.2 8.08% ±1.04 | destroyed by a bullet 9.9%
  tick  200: mean lead  -1.8 | ahead in  52 rounds, won 40.4% | not ahead in 123, won 12.2%
  tick  400: mean lead  -6.3 | ahead in  56 rounds, won 55.4% | not ahead in 119, won  4.2%
  tick  600: mean lead -11.5 | ahead in  40 rounds, won 70.0% | not ahead in 135, won  5.9%
  tick  800: mean lead -13.4 | ahead in  33 rounds, won 78.8% | not ahead in 142, won  7.0%
  tick 1000: mean lead -14.1 | ahead in  30 rounds, won 80.0% | not ahead in 145, won  8.3%

all-chaff: 3 battles, score share 29.94% ±6.26 (sd 2.52)
  rounds 105: won outright 29 (27.6%), double kill 1, lost 75 (71.4%); engine first places 29; 7309 ticks a round
  bullet damage a round 21.5 against 42.5; skipped turns 88 (11.5 per 100,000)
  hadur   646.1 shots a round, spent 70.3, refunded 16.0, damage 21.8, effect on own lead -32.4
          hit rate 7.70% ±0.20 | light 7.71% ±0.20 (100% of shots) | power 1.7 to 2.2 25.00% ±42.44 | destroyed by a bullet 12.4%
  drussgt 640.4 shots a round, spent 100.1, refunded 32.3, damage 43.2, effect on own lead -24.7
          hit rate 10.69% ±0.23 | light 10.68% ±0.23 (99% of shots) | power 1.7 to 2.2 10.58% ±5.91 | destroyed by a bullet 12.5%
  tick  200: mean lead  +1.7 | ahead in  54 rounds, won 33.3% | not ahead in  51, won 21.6%
  tick  400: mean lead  +1.9 | ahead in  60 rounds, won 31.7% | not ahead in  45, won 22.2%
  tick  600: mean lead  +1.0 | ahead in  53 rounds, won 32.1% | not ahead in  52, won 23.1%
  tick  800: mean lead  +0.3 | ahead in  46 rounds, won 37.0% | not ahead in  59, won 20.3%
  tick 1000: mean lead  -0.1 | ahead in  50 rounds, won 38.0% | not ahead in  55, won 18.2%

hold-fire: 2 battles, score share 24.55% ±58.67 (sd 6.53)
  rounds 70: won outright 41 (58.6%), double kill 0, lost 29 (41.4%); engine first places 41; 3808 ticks a round
  bullet damage a round 1.2 against 80.8; skipped turns 17 (6.4 per 100,000)
  hadur   5.9 shots a round, spent 2.2, refunded 0.8, damage 1.2, effect on own lead -0.2
          hit rate 2.92% ±1.63 | light 0.59% ±0.82 (82% of shots) | power 1.7 to 2.2 15.69% ±9.98 | destroyed by a bullet 4.1%
  drussgt 307.7 shots a round, spent 137.5, refunded 56.0, damage 81.4, effect on own lead -0.1
          hit rate 15.91% ±0.49 | light 16.95% ±0.63 (64% of shots) | power 1.7 to 2.2 10.93% ±1.35 | destroyed by a bullet 0.2%
  tick  200: mean lead +10.2 | ahead in  56 rounds, won 64.3% | not ahead in  14, won 35.7%
  tick  400: mean lead +10.4 | ahead in  52 rounds, won 67.3% | not ahead in  18, won 33.3%
  tick  600: mean lead +12.9 | ahead in  50 rounds, won 72.0% | not ahead in  20, won 25.0%
  tick  800: mean lead +10.5 | ahead in  52 rounds, won 75.0% | not ahead in  18, won 11.1%
  tick 1000: mean lead  +9.6 | ahead in  52 rounds, won 78.8% | not ahead in  18, won  0.0%

lead-aware minus released, paired on 10 seeds: +13.16 ±4.18
lead-aware-sampled minus released, paired on 10 seeds: +13.90 ±4.97
random-gun minus released, paired on 5 seeds: -5.30 ±9.81
all-chaff minus released, paired on 3 seeds: -10.69 ±6.47
hold-fire minus released, paired on 2 seeds: -15.77 ±56.44
lead-aware-sampled minus lead-aware, paired on 10 seeds: +0.74 ±3.96
```

## Files

- Tables: `data/bench/2026-10-05_hadur-3.5.1_drussgt-probes_cold{,_rounds,_bullets,_energy}.tsv`.
- Tools, energy model and bench patches: `data/tools/drussgt/` (see its README); tests `data/tools/test_drussgt.py`.
- Shield list as parsed, with Hadur 3.4 scores: `data/rumble/parsed/2026-10-05_drussgt-3.1.16_shield-targets_vs_hadur-3.4.tsv`; bench sets `hadur-bench/shield-list.txt`, `shield-panel.txt`.

## Caveats

- Only DrussGT was benched; the other top-ten surfers are untested (gate for D1).
- Small bench host: about 9 skipped turns per battle; analysis jobs shared the machine during some runs.
- `random-gun`, `all-chaff` and `hold-fire` have 5, 3 and 2 battles; read them as direction only.
- `harvest_bench.py --check` is stale on master and was not run or changed here.
