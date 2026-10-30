# Eveimear 0.1: the gap to 1st in MicroRumble (2026-10-30)

Live, from the LiteRumble API at 20:25 UTC (`data/rumble/parsed/2026-10-30T2025Z_microrumble_*`):
Eveimear 0.1 is 9th of 516 with 83.31 on 2,266 battles. 1st is kc.micro.WaveShark 0.5 on 85.60 (2.29
ahead), 5th HedgehogGF 1.5 on 84.96 (1.65 ahead).

## Where the 2.29 goes (live, 513 shared opponents)

Opponents are grouped by how well WaveShark survives against them.

| Opponents (WaveShark survival) | n | Eveimear − WaveShark | share of the gap | survival | Eveimear − Epeeist |
|---|---|---|---|---|---|
| Crushed (97% and up) | 315 | -1.88 | **-1.15** | -0.7 | -0.55 |
| Easy (90 to 97%) | 84 | -2.97 | -0.49 | -3.4 | -2.49 |
| Even (75 to 90%) | 62 | -4.78 | -0.58 | -5.6 | -3.55 |
| Strong (under 75%) | 52 | -0.43 | -0.04 | +2.1 | -4.62 |

Half the gap is the weak field, as for JayLexi. The nanos among the crushed bots cost 2.62 each.

## Cloud bench: what the gap is made of

`hadur-bench/kitlab/micro-gap-field.txt` (seed 30): 16 weak nanos, 24 other weak bots, 12 easy and 12
even. Eveimear 0.1, WaveShark 0.5 and Epeeist 3.7 each fought all 64 bots, 2 seeds of 35 rounds.
`python3 tools/kitlab_gap.py kitlab/micro-gap-field.txt work/kitlab-mgap-E01 work/kitlab-mgap-WS work/kitlab-mgap-EPE`.
Values are per round.

| Group | Share E / WS / Epeeist | Rounds won E / WS | Damage taken E / WS | Damage dealt E / WS |
|---|---|---|---|---|
| weak-nano | 82.19 / 90.85 / 87.27 | 93.6 / 98.9 | 24.2 / 12.7 | 62.6 / 58.9 |
| weak | 87.75 / 94.31 / 92.32 | 96.1 / 99.4 | 18.1 / 9.7 | 75.6 / 72.1 |
| easy | 72.14 / 78.51 / 75.45 | 87.7 / 94.1 | 36.5 / 33.0 | 57.1 / 54.4 |
| even | 66.30 / 70.94 / 69.62 | 78.5 / 82.6 | 36.6 / 28.1 | 47.6 / 43.1 |
| all 64 | 79.41 / 86.10 / 83.64 | 90.6 / 95.1 | 26.5 / 18.3 | 63.6 / 60.1 |

- **The gun is not the gap.** Eveimear deals more damage a round than WaveShark in every group (63.6
  against 60.1).
- **The movement is.** It takes 45% more damage (26.5 against 18.3), and nearly twice as much
  against the weak field. Its stop-and-go into random orbit is easy for the simple and learning guns
  that most weak bots carry. WaveShark surfs waves.
- So Eveimear's next step is a wave-surfing movement that fits in 749 bytes, not gun work. The
  ecj + ProGuard build (about 15 to 25 bytes saved on a mini) gives it room to try one.
