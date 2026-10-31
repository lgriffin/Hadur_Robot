# Eveimear wave-surfing arms (MicroRumble, 2026-10-30/31)

Leigh's pick on 2026-10-30 at 23:10 GMT was "Both, Eveimear first". That meant giving Eveimear a wave-surfing movement inside the MicroRumble codesize limit, then doing the JayLexi shared k-NN redesign. [eveimear-gap.md](eveimear-gap.md) found that movement is the gap to WaveShark: Eveimear 0.1 takes 26.5 damage a round and WaveShark takes 18.3.

**Result:** a surfer beats 0.1 by +3.1 on the gap field at 1,013 B. Cut down to 743 B, it no longer beats 0.1. On the two division samples it is 0.6 to 0.7 points below 0.1. Eveimear 0.1 stays live.

## Method

- **Gap field:** all runs use `kitlab/micro-gap-field.txt` (64 bots, 2 seeds, 35 rounds) on the 4-core cloud box.
- **Score:** `share` is the mean score share over all 64 bots.
- **Size:** codesize is measured after ecj + ProGuard (see kitlab-0.3-arms.md, round 10). The limit is 749 B and the target is 746 B.
- **Arms:** the arms are in `hadur-bench/kitlab/arms/Eveimear-s*.java` and `Eveimear-g*.java`.

## Arms on the gap field

| arm | what | B | share | taken/rnd | dealt/rnd |
|---|---|---:|---:|---:|---:|
| 0.1 (E01) | stop-and-go, then random orbit; GF gun | 716 | 79.41 | 26.5 | 63.6 |
| WaveShark 0.5 | reference, 1st in MicroRumble | | 86.10 | 18.3 | 60.1 |
| s1 | surf: on / back / stop, wave list, projected positions | 1,137 | 71.73 | 38.6 | 66.1 |
| s2 | s1 without the stop option | 1,100 | 79.63 | 27.9 | 64.4 |
| s4 | s2 without surfing (plain orbit) | 1,085 | 66.14 | 40.2 | 60.7 |
| s6 | lean surfer (below) + GF gun | 1,013 | **82.55** | 24.0 | 63.2 |
| s6g | s6 without the gun's velocity-history segment | 948 | 80.36 | 25.1 | 61.6 |
| s7 | s6 surf + linear gun | 742 | 61.23 | 26.3 | 43.4 |
| s8 | s6 surf + string pattern-matching gun | 832 | 79.85 | 25.4 | 59.3 |
| s9 | s8 + 7 cuts bundled | 751 | 73.06 | 33.6 | 61.9 |
| s9n | s9 with one shared surf array | 738 | 66.96 | 39.5 | 61.7 |
| **s10** | s8 + the cheap cuts (below) | **743** | 80.02 | 22.9 | 57.4 |

Lessons from these arms:

- **The stop option was the harm in s1.** Surfing on or back is worth +13.5 over plain orbit (s2 vs s4).
- **s6, the lean surfer:**
  - There is no wave list. The oldest live enemy wave names itself `surfWave` in `test()`.
  - Bins are padded to 100 each side, so they need no clamps.
  - On/back is chosen by guess-factor arithmetic (`bin ± step`) instead of projecting positions.
  - Hits are split five ways by our lateral speed when the enemy fired. That split is worth about +6 (s9 vs s9n).
- **The learning gun is essential.** A linear gun loses 18 points. The GF gun costs about 270 B. A string pattern matcher on lateral speed costs about 90 B but deals 4 less a round.

## Single cuts on s8

Each cut was measured alone (`Eveimear-g*.java`). The bundle in s9 lost 6.8 points.

| cut | B saved | share vs s8 (79.85) |
|---|---:|---:|
| no time-to-arrival term in the surf step | 12 | -5.88 |
| no anti-ram term | 15 | -2.20 |
| no tight-wall reverse | 16 | -2.21 |
| wave bearing from this tick, not last | 10 | -1.58 |
| fixed fire power 2 (+1 when rammed) | 25 | -1.30 |
| no `drop <= 3` check on shots | 9 | -0.79 |
| fixed bullet damage 10 in onBulletHit | 7 | -0.38 |
| no `removeCustomEvent` | 9 | -0.34 |
| **unsmoothed hits (`hits[at]++`)** | 25 | **+1.43** |

s10 takes s8 and adds:

- the unsmoothed hits;
- no event removal;
- fixed damage and power;
- no 3-energy check;
- `copySign` for the wave direction;
- a Wave constructor that reads the statics.

That is 743 B and 80.02 on the gap field.

## Division samples (raw weighted APS, SE from seeds)

| sample | s10 | 0.1 | s10 - 0.1 |
|---|---:|---:|---:|
| micro (`kitlab/micro-field.txt`) | 79.87 ± 0.34 | 80.43 ± 0.35 (`work/kitlab-eveimear-a`) | -0.56 |
| micro2 (`kitlab/micro2-field.txt`) | 80.29 ± 0.60 | 81.03 ± 0.58 (fresh control) | -0.74 |

At 743 B the surfer moves better than 0.1: it takes 22.9 a round against 26.5. It also shoots worse: it deals 57.4 a round against 63.6. In 746 B the gun loses more than the movement gains.

## What would reopen it

- **Bytes for the GF gun.** About 100 to 180 B, which is s6 (82.55) or s6g (80.36) minus s10. The string-constant table work in the codesize thread might find some of it.
- **Better surf prediction.** The time-to-arrival term alone is worth 5.9. More exact prediction is the biggest movement lever left.
