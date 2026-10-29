# JayLexi 0.1 and Eveimear 0.1: the first live pass

Released 2026-10-28 20:55 UTC (tags `jaylexi-v0.1`, `eveimear-v0.1`). The pages were read on
2026-10-29 at 07:23 UTC, with every pairing filled. They are saved in `data/rumble/pages/` under
`2026-10-29T0723Z_*`. The reference bots' per-opponent rows come from the LiteRumble API
(`BotDetails?api=true`), read at 08:45 UTC.

| Bot | Rumble | Rank | APS | Pairings | Battles | 5th place | Cloud bench said |
|---|---|---|---|---|---|---|---|
| JayLexi 0.1 | MiniRumble | **6th of 671** | **86.95** ± 0.29 | 670 | 742 | WeeksOnEnd 1.10.4, 87.35 (+0.40) | 87.05 ± 0.45 |
| Eveimear 0.1 | MicroRumble | **9th of 516** | **83.36** ± 0.33 | 515 | 608 | HedgehogGF 1.5, 84.93 (+1.57) | 84.28 ± 0.46 |

- **JayLexi's bench was right.** It read 87.05 and the live score is 86.95. Against the same 668
  opponents it is 0.47 under Komarious 1.88 (4th, 87.45) and 0.33 under WeeksOnEnd.
- **Eveimear's bench was 0.9 high.** The bench put it 0.78 under Épéeist 3.7. Live, it is 1.66
  under Épéeist (84.99, 4th) and 1.63 under HedgehogGF on the same 513 opponents. The 48-bot
  sample flattered it, so 0.2 is read on a second sample as well (below).

## Where the points go

Each pairing is mostly one battle (601 of 669 for JayLexi, 429 of 514 for Eveimear), so single rows
are noisy (about ±7). The groups below are what to trust. They split the opponents by how well the
reference survives against them, and "share" is the group's part of the APS gap.

| Opponents (reference survival) | JayLexi n | JayLexi vs Komarious | share | Eveimear n | Eveimear vs Épéeist | share |
|---|---|---|---|---|---|---|
| Crushed (97% and up) | 460 | -0.27 | -0.18 | 323 | -0.66 | -0.42 |
| Easy (90 to 97%) | 93 | -0.90 | -0.13 | 63 | -1.92 | -0.24 |
| Even (75 to 90%) | 75 | -0.83 | -0.09 | 83 | -3.62 | -0.58 |
| Strong (under 75%) | 41 | -1.42 | -0.09 | 45 | -4.60 | -0.40 |

- **JayLexi** loses a little everywhere. A third of the gap comes from bots Komarious beats almost
  every round, where JayLexi's survival is lower: NanoDeath 80% against 97%, Sanguijuela 83%
  against 97%, DyslexicMonkey 89% against 99%. Those are close-range bots. JayLexi plays like
  Komarious, and the measurable differences are its power rule (3 inside 150 px, which spends
  energy at close range) and its gun, which has no segment for the wall behind the enemy. The
  learning guns (Jen -12, Aristocles -11, Raiko -9, Cotillion -9) are the rest.
- **Eveimear** loses most against even and strong opponents, and it does so on survival (5.7 and
  8.5 points under Épéeist). That points at its movement after the switch to random, more than at
  the gun the bench blamed. Épéeist's random mode reverses more often against fast bullets at close
  range, and Eveimear's never adapts. Épéeist also locks its radar, where Eveimear sweeps it, and
  that sweep cost JayLexi scans on the bench. Among single rows: uCatcher 42 (Épéeist 99, one
  battle, 11% survival), AngularMirrorC 65 (95), WaveShark 37 (60), EpeeistDC 33 (52).

## 0.2, on the cloud bench

Every arm runs on two 48-bot samples, the existing one and a second draw (seed 2), each paired
against its reference. The bench's verdict is the mean of the two.

- JayLexi:
  - (a) power by own energy only, with no power 3 at close range;
  - (b) danger over the nearer of the enemy and the wave;
  - (c) a reverse-wall segment in the gun, paid for by (a).
- Eveimear:
  - (a) a radar lock;
  - (b) random reversal scaled by the enemy's bullet speed over the distance;
  - (c) waves that integrate the enemy's motion instead of storing positions, which frees bytes
    for a wall segment.
