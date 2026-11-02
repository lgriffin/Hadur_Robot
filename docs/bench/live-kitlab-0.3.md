# JayLexi 0.3 and Eveimear 0.2: the first live pass, and the march to 1st

Leigh saved the pages at 14:34 UTC on 2026-11-02; they are in `data/rumble/pages/` under
`2026-11-02T1434Z_*`. The per-opponent rows come from the LiteRumble API (`BotDetails?api=true`),
read at 14:40 UTC, and are saved in `data/rumble/parsed/2026-11-02T1440Z_*.json`. The 0.2 rows are
its first pass (`2026-10-29T2020Z_*`, 788 battles). `python3 data/tools/kitlab_live_gap.py` with the
JayLexi 0.3, FoilistMC, CunobelinDC, Foilist, JayLexi 0.2 and Komarious files prints the survival
groups; with `--rank data/rumble/parsed/2026-11-02T1440Z_minirumble_rankings.json` first, and the
JayLexi 0.3, JayLexi 0.2 and FoilistMC files, it prints the rank table below.

## Standing

| Bot | Rumble | Rank | APS | Survival | Pairings | Battles |
|---|---|---|---|---|---|---|
| sheldor.mini.FoilistMC 1.0 | MiniRumble | 1st | 89.02 | 95.4 | 670 | 22,123 |
| jk.mini.CunobelinDC 1.2 | | 2nd | 88.78 | | 670 | 44,639 |
| sheldor.mini.Foilist 1.3.1 | | 3rd | 88.49 | | 670 | 22,300 |
| **hadur117.mini.JayLexi 0.3** | | **4th of 671** | **87.93 ± 0.28** | 94.02 | 669 | 855 |
| voidious.mini.Komarious 1.88 | | 5th | 87.48 | | 670 | 41,884 |
| kc.micro.WaveShark 0.5 | MicroRumble | 1st | 85.58 | 92.28 | 515 | 17,789 |
| **hadur117.micro.Eveimear 0.2** | | **9th of 516** | **83.39 ± 0.31** | 90.72 | 515 | 737 |

- **JayLexi 0.3 is 4th, up from 5th**, past Komarious (87.48) and WeeksOnEnd. On the 664 opponents
  the pages share it is **+0.62 over 0.2** (88.30 against 87.68); the bench said +0.44 ± 0.16 and
  projected about 87.8 live.
- **The gap to 1st is 1.09** (0.94 on the shared opponents). To 2nd it is 0.85, to 3rd 0.56.
- **Eveimear 0.2 is 9th**, 83.39, +0.08 over 0.1 on the 515 shared opponents. The bench said
  +0.36, so the self-taught mode table is about flat live. 1st (WaveShark) is 2.19 ahead.
- Most pairings are one battle (510 of 669), so single rows are about ±7. Read groups, not rows.

## Where 0.3 gained, and where it lost

Grouped by the opponent's MiniRumble rank. "Share" is the group's part of the whole-field APS.

| Opponents (rank) | n | 0.3 − 0.2 | share | 0.3 − FoilistMC | share |
|---|---|---|---|---|---|
| 1 to 15 | 13 | **−7.80 ± 2.76** | −0.15 | −13.96 | −0.27 |
| 16 to 30 | 14 | **−5.93 ± 1.97** | −0.12 | −10.07 | −0.21 |
| 31 to 60 | 30 | −0.53 ± 1.21 | −0.02 | −0.62 | −0.03 |
| 61 to 120 | 60 | −0.49 ± 0.62 | −0.04 | −2.29 | −0.21 |
| 121 to 250 | 130 | +1.69 ± 0.48 | +0.33 | −0.22 | −0.04 |
| 251 to 450 | 200 | +1.41 ± 0.21 | +0.42 | −0.87 | −0.26 |
| 451 and down | 220 | +0.43 ± 0.10 | +0.14 | +0.01 | 0.00 |

- **The tables won the weak and middle field and cost us the top 30.** 0.3 is +0.89 over 0.2 on
  ranks 121 and down, and −0.27 on the top 30, about three standard errors per group. The worst:
  Komarious −25, EpeeistDC −21, AlphaDragon −15, CunobelinDC −13, Continuation −12, Basilisk −12,
  Pugilist −11, Cotillion −8. These are the learning guns and surfers. The likely cause (not yet
  tested) is that a fixed surf danger row from our harvest makes our movement predictable and a
  learning gun locks onto it, and that a surfer dodges the shared first-shot gun bin.
- **Against FoilistMC the top 30 are now half the gap** (0.48 of 0.94). The weak field (ranks 451
  and down) is level with FoilistMC; the 0.2 read's biggest group is closed.
- Ranks 61 to 120 and 251 to 450 still cost 0.21 and 0.26 against FoilistMC, mostly survival.

## The march to 1st

1st needs about +1.1. The first step is free in bytes; the later ones need bytes found.

1. **0.4 "tables off for the strong" (about +0.25, no bytes).** Give the top bots the neutral surf
   row, which is a change to the data string only. Arms sweep the cutoff (top 30, 60, 120) because
   ranks 61 to 120 also slipped (−0.49). A second arm also skips the shared gun first-shot bin for
   those bots, if it fits in the 2 bytes left (1,494 of 1,499, and the jar test wants 3 spare). Read on
   a strong field (the top 60 by name, several seeds) with 0.2 and 0.3 seated on the same set, then
   on mini-wide2 to show the weak field holds. The card is `hadur-bench/plans/pc-jaylexi-rows.queue` (arms J3, S30, S60, S120 and L60, the
   last keeping the top 60's own rows at peak 300; about 5,160 battles, 40 to 60 min), and Leigh runs it.
   Expected ~88.2, past Foilist only if the cutoff at 60 or 120 also pays.
2. **Find bytes for the k-NN surf against the strong.** FoilistMC's edge over the top 60 is
   movement (−10 to −14 APS a bot there). The k-NN surf arm (k3KE) was +0.25 to +0.52 but 1,598 B;
   the Deise slot trick (hot locals in slots 0 to 3, indexed loops) and more lookup strings are
   the next byte source. Gate it on the same name rows, so it only runs where it pays.
3. **Mid-field survival** (ranks 61 to 120, 251 to 450, −0.47 together): per-opponent rows for the
   gun as well as the surf, learned from JayLexi's own battles there, as PALL did for the surf.
4. **Eveimear** stays at 0.2; its live gain was about zero, so its next lever is the movement
   (it takes 45% more damage than WaveShark, docs/bench/eveimear-gap.md).

Each step releases on Leigh's word, and nothing is uploaded without his go.
