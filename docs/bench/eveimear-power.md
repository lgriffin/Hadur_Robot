# Eveimear per-opponent levers: cloud pre-screen (2026-11-03)

Leigh's card rule (2026-11-03) asks every PC card to be per-opponent tailoring with a pilot stop and a
written case. Before handing Eveimear a card, three zero-byte per-opponent arms were screened in the
cloud, so a bad idea costs 10 minutes here instead of a PC run. None showed a gain, so no Eveimear
card goes to the PC from this round.

Panel: `hadur-bench/kitlab/micro-mid-field.txt`, 80 robots, one from each even rank band of MicroRumble
ranks 61 to 515 (2026-11-02 rankings, seed 7, none in broken-1.11.2.txt), Robocode 1.11.2, 1 seed
(9901), 10 rounds. Read with `data/tools/multiarm.py`, each arm against the released 0.2 (c) and the
A/A arm pooled, per opponent, 95% over the 80. Bands: 1 ranks 61-120, 2 121-250, 3 251-450, 4 451-515.

| Arm | What (all 746 B) | vs 0.2 | Band 1 | Band 2 | Band 3 | Band 4 |
|---|---|---:|---:|---:|---:|---:|
| aa | power re-encode, power 2 everywhere (A/A) | −0.63 ± 0.85 | −1.81 | +0.24 | −1.05 | 0.00 |
| pm | power 3 against ranks 61-450 | **−3.86 ± 1.91** | −9.52 | −6.87 | −1.56 | +0.07 |
| r1 | random from the first hit against ranks 61-250 | −1.67 ± 1.67 | −1.88 | −5.02 | 0.00 | +0.06 |
| s3 | stop-and-go for good against ranks 251-515 | −0.98 ± 1.58 | −0.33 | +0.20 | −2.24 | +0.07 |

- **Power 3 loses clearly**, worst against the stronger bands. The cause is structural: the GF gun's
  waves move at 14 px a tick and its bins span asin(8/14), both power 2's. A power-3 bullet flies at
  11 px a tick, so every guess factor it aims with was learned for the wrong flight time. Any power
  change needs the wave speed and escape angle to follow it, which costs bytes Eveimear lacks.
- **The mode-band rules lose or tie.** 0.2's own per-robot modes beat a band override in both bands
  tried. The rank band isn't a good proxy for which movement mode beats a robot's gun.
- Ranks 451 and down are already about 99%: nothing there moves.

Tools kept: `hadur-bench/tools/eveimear_power.py` (power in the MODES char, v = 20 m + p, 0 bytes)
and the panel file. Eveimear stays at 0.2. Its next real lever is still movement (the surfer, which
needs bytes found), as in [eveimear-gap.md](eveimear-gap.md) and [eveimear-surf.md](eveimear-surf.md).
