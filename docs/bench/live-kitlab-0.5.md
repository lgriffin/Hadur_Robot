# Eveimear 0.5 and JayLexi 0.6: the first live pass

Both were released on 2026-11-05 (prep PR #677) and fought their first pass from the cloud client between 22:52 and
03:00 GMT (2,348 battles, every MiniRumble and MicroRumble pairing filled). The per-opponent rows come from the
LiteRumble API (`BotDetails?api=true`), read at 03:05 UTC on 2026-11-06 and saved in
`data/rumble/parsed/2026-11-06T0305Z_*.json`; the 0.4 and 0.2 rows are `2026-11-04T1605Z_*`. The group tables are
`python3 data/tools/kitlab_live_gap.py --rank RANKINGS.json BOT.json REF.json ...`.

## Standing

| Bot | Rumble | Rank | APS | Survival | Pairings | Battles |
|---|---|---|---|---|---|---|
| **hadur117.micro.Eveimear 0.5** | MicroRumble | **1st of 516** | **86.03 ± 0.34** | 93.47 | 515 | 565 |
| jk.micro.Cotillion 0.8 | | 2nd | 85.58 | 93.00 | 515 | 34,310 |
| kc.micro.WaveShark 0.5 | | 3rd | 85.54 | 92.23 | 515 | 17,789 |
| sheldor.mini.FoilistMC 1.0 | MiniRumble | 1st | 88.96 | 95.41 | 669 | 22,111 |
| jk.mini.CunobelinDC 1.2 | | 2nd | 88.72 | 94.80 | 669 | 44,563 |
| sheldor.mini.Foilist 1.3.1 | | 3rd | 88.45 | 95.05 | 669 | 22,287 |
| **hadur117.mini.JayLexi 0.6** | | **4th of 670** | **88.40 ± 0.29** | 94.70 | 669 | 743 |
| **hadur117.micro.Eveimear 0.5** | | **8th** | 84.18 | 91.23 | 669 | 746 |

- **Eveimear 0.5 is 1st in MicroRumble**, +2.50 over 0.2 on the 513 opponents both have (bench: +2.22 ± 0.76 over
  0.4) and +0.46 over Cotillion. The lead over Cotillion (0.45) is just outside the 0.34 interval of one pass; a second
  pass would settle it. It is also 8th in MiniRumble, ahead of Cotillion (10th).
- **JayLexi 0.6 is 4th**, +0.19 over 0.4 on the 666 shared opponents (the catcher jitter was +0.09 on the bench).
  0.05 behind Foilist (3rd), 0.32 behind CunobelinDC, 0.56 behind FoilistMC (0.54 on the shared opponents).
- Most pairings are one battle, so single rows are about ±7. Read groups, not rows.

## JayLexi: where the 0.54 to FoilistMC is

| Opponents (rank) | n | 0.6 − FoilistMC | share | survival | 0.6 − 0.4 |
|---|---|---|---|---|---|
| 1 to 30 | 28 | −5.28 | **−0.22** | −10.7 | +0.3 / +0.9 |
| 31 to 120 | 90 | −0.49 | −0.07 | −0.7 | +0.4 / +1.0 |
| 121 to 250 | 130 | −0.28 | −0.05 | −0.4 | +0.14 |
| 251 to 450 | 200 | −0.77 | **−0.23** | −0.15 | +0.15 |
| 451 and down | 220 | +0.11 | +0.04 | +0.05 | −0.05 |

- **The top 30 cost 0.22, all survival.** The learning guns hit our surfing (Komarious −18, CunobelinDC −14, Cotillion
  −13, Raiko, GFMicro, PumpkinPie). That is movement.
- **Ranks 251 to 450 cost 0.23 with survival level** (−0.15 points): we live as long as FoilistMC does there and
  score 0.77 less a robot. That is how fast and how much we hit: the gun.
- FoilistMC's source ships in its jar (RWPCL). Its gun is a multiple-choice pattern matcher over the enemy's lateral
  speed in thirds, replayed with lateral and advancing speed, matches weighted by recency × length, with a power
  table by distance and own energy. Eveimear closed its whole gap to Cotillion by putting the leader's gun on our body
  (PR #669), so the same test comes first here: **`cloud-jaylexi-foil`** (BENCH-201). FG, 0.6's movement with
  FoilistMC's gun and power, builds at 1,434 B, so a win needs no byte hunt. F (FoilistMC itself) against FG says how
  much of the top-30 half is movement, for the card after.

## Eveimear: what is left

| Opponents (rank) | n | 0.5 − 0.2 | 0.5 − Cotillion | share | 0.5 − WaveShark | share |
|---|---|---|---|---|---|---|
| 1 to 30 | 27 | +6.85 | +1.64 | +0.09 | +3.22 | +0.18 |
| 31 to 120 | 90 | +4.28 | +0.80 | +0.14 | +0.90 | +0.16 |
| 121 to 250 | 130 | +2.33 | +0.26 | +0.07 | +0.92 | +0.23 |
| 251 to 450 | 200 | +1.94 | +0.39 | +0.15 | **−0.41** | **−0.16** |
| 451 and down | 66 | +0.31 | +0.10 | +0.01 | +0.22 | +0.03 |

- 0.5 is ahead of Cotillion in every group. Against WaveShark it loses only ranks 251 to 450, and the worst rows
  there and against Cotillion are rammers, mirrors and nanos (M1Abrams, NanoLauLectrik, Ant, Flex, White, Blur,
  MirrorNano, Sparky), all survival: the movement mode's job.
- 0.5's per-robot mode table was learned on the 0.2 body, whose switch counted bonus energy against 40 + 23 a round;
  0.5 counts Cotillion's units (5 / bullet speed against 2 + round) and reads the same chars as multipliers. So the
  picks now mean other thresholds. **`cloud-eveimear-st5`** (BENCH-202) relearns them on 0.5 itself, as
  pc-eveimear-st did for 0.1: every cell 1, 9 or 0 over the whole field, a pick per robot that clears one standard
  error, and the packed 749 B build read against 0.5 on fresh seeds.

## Cloud cards

| Card | What | Battles | Pass |
|---|---|---|---|
| `cloud-jaylexi-foil` | c (0.6), aa, F (FoilistMC), FG (0.6 + FoilistMC gun, 1,434 B) on mini-wide3 x 4 seeds | 1,792 | FG low end over c above 0 and within noise of F; then a PC card (12 seeds, +0.3 gate) |
| `cloud-eveimear-st5` | 0.5 in modes 1 / 9 / 0 on all 515 micros x 2 seeds, then ST5 vs c, aa on micro-wide2 x 6 seeds | 5,106 | ST5 low end over c above 0; then a PC card |

Both run on the cloud box (3 workers) one after the other, JayLexi first. Nothing is uploaded or released.
