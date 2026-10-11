# 3.12 P4, P5 and P6: findings

Date: 2026-10-11. Plans `p312b` (P4, the silent battles), `p312c` (P5, never close in) and `p312d` (P6, stored shield verdicts) of `docs/plan-3.12.md`, run one after another on the PC (`hadur-bench/plans/p312{b,c,d}.queue`). Bench tooling, data and documents only; no change to `hadur-core` or `hadur-robot`, nothing released. The candidates are built by `build-ablation.sh` from the v3.11 tag (one-line edits), so they are not in the repository source. Each is paired against the released Hadur 3.11 on the same opponents and seeds.

## What was run

All steps: 35 rounds, Robocode 1.11.1, parallel 12, child CPUs 2, heap 2G, CPU constant 1488498, RoboRumble workers stopped, one queue at a time.

| Plan | Step | Candidate (edit of v3.11) | Set and seeds | Time |
|---|---|---|---|---|
| p312b | `mfv` | `mf`: the fire hold skips a mirror aim | 38 volatile bots, 8 seeds (600-607) | 536 s |
| p312b | `s5v` | `s5`: SHIELD-1 needs 10 of the last 20 bullets and half | 38 volatile bots, 8 seeds | 534 s |
| p312b | `mfw` | `mf`, each seed cold then warm (BENCH-54) | 38 volatile bots, 4 seeds (610-613) | 575 s |
| p312b | `mf` | `mf` | 400-bot screen, 4 seeds (600-603) | 4,388 s |
| p312b | `mfs5` | `mfs5`: both edits | 400-bot screen, 4 seeds | 4,488 s |
| p312c | `aw` | `aw`: DIST-1 never steps in, END-1 keeps the distance, the surf corrects being too close at gain 1.65 | 400-bot screen, 4 seeds | 4,412 s |
| p312d | `wns` | `ns`: the stored shield verdict is ignored on load; cold then warm | 400-bot screen, 2 seeds (620-621) | 4,222 s |
| p312d | `wmfs5ns` | `mfs5ns`: `mfs5` plus the stored verdict ignored; cold then warm | 400-bot screen, 2 seeds | 4,189 s |

Files:

- Rows: `data/bench/2026-10-11_hadur-p312{b,c,d}-*-local_{cold,warm}.tsv`. Per-round rows are committed for the three volatile steps only; the screen steps' per-round files are not committed.
- Reports: `docs/bench/local/2026-10-11_p312{b,c,d}-*.md` (the per-opponent folders are not committed).
- Profile counts from the six rumble workers: `data/live/profiles-3.11-*.tsv` (decoded with `data/tools/live_client.py profiles`).

Reading: `data/tools/export_battles.py` (with `--warm` for the warm replays), then `data/tools/screen_paired.py` on each rows and rounds pair, both with the census row rules and with `--keep-all`. The census rules drop a battle with another Robocode JVM running (`otherJvms`) and its partner. That removed, of the pairs in each step: `mfv` 75 of 304, `s5v` 35 of 304, `mfw` 36 and 34 of 152 (cold, warm), `mf` 349, `mfs5` 448 and `aw` 413 of 1,600, `wns` 205 and 200 of 800, `wmfs5ns` 253 and 245 of 800. No row has a security denial or duress after round 0.

In the tables the cell is "APS it adds" (band mean times the band's share of the set) with its 95% interval. For the volatile set, which is not drawn in proportion to band size, the "All" figure is the mean change in score share, in points, over the 38 bots; it is not an APS.

## P4: the silent battles

### Volatile bots (38 bots in bands 4 to 6)

| Step | Census rules | Keep-all |
|---|---|---|
| `mfv`, 8 seeds, cold | +1.99 (+0.64 to +3.35), 31 bots kept | +1.70 (+0.45 to +2.96) |
| `s5v`, 8 seeds, cold | +1.35 (+0.31 to +2.39), 36 bots kept | +1.28 (+0.35 to +2.21) |
| `mfw`, 4 seeds, cold | +1.10 (-0.80 to +3.00), 30 bots kept | +1.57 (-0.19 to +3.32) |
| `mfw`, 4 seeds, warm | **+4.41 (+0.40 to +8.43), 31 bots kept** | **+5.72 (+1.33 to +10.11)** |

The bad battles are the plan's yardstick. Counting battles below 60% score share, and battles with any jittered shot (SHIELD-1 had latched), over all rows with nothing dropped:

| Step | 3.11 below 60% | Candidate below 60% | 3.11 latched | Candidate latched |
|---|---|---|---|---|
| `mfv` cold, 304 battles | 7 | 2 | 122 | 121 |
| `s5v` cold, 304 | 5 | 0 | 125 | 1 |
| `mfw` cold, 152 | 3 | 0 | 63 | 60 |
| `mfw` warm, 152 | 14 | 0 | 84 | 78 |

- `mf` leaves the latch alone (121 of 304 battles still latch) and removes the damage it did: the bad battles fall from 7, 3 and 14 to 2, 0 and 0, and in the warm replay, where 3.11 starts from the stored verdict, from 14 of 152 to none.
- `s5` stops the latch (1 of 304 battles against 125) and also clears the bad battles (5 to 0).
- Both lift the volatile bots by 1.3 to 2.0 points on average cold, and `mf` by 4.4 to 5.7 points warm, which is where a live client plays. Bands 5 and 6 carry most of it (`mfw` warm: band 5 +5.81, +0.18 to +11.43; band 6 +13.49, -1.82 to +28.80, nine bots).
- Spread over the field of about 1,215 bots, 38 bots at +1.7 to +2.0 points is roughly +0.05 APS (38 / 1,215 x 1.8): real, and small. This is arithmetic from the means, not a measured census.
- Not done here: a per-bot reading of the volatile steps.

### Screen (400 bots, 4 seeds)

| Candidate | Census rules | Keep-all |
|---|---|---|
| `mf` | +0.03 (-0.23 to +0.28), 326 of 400 bots kept | -0.09 (-0.31 to +0.13) |
| `mfs5` | +0.19 (-0.06 to +0.44), 306 kept | +0.14 (-0.06 to +0.35) |

By band (APS each band adds):

| Band (bots) | `mf` census | `mf` keep-all | `mfs5` census | `mfs5` keep-all |
|---|---|---|---|---|
| 1 (3) | -0.040 (-0.070 to -0.009) | same | +0.048 (1 bot kept) | +0.041 (+0.030 to +0.053) |
| 2 (13) | +0.026 (-0.034 to +0.086) | same | -0.034 (-0.082 to +0.014) | -0.035 (-0.079 to +0.009) |
| 3 (49) | -0.067 (-0.235 to +0.100) | -0.088 (-0.211 to +0.034) | -0.057 (-0.182 to +0.068) | -0.059 (-0.174 to +0.055) |
| 4 (66) | +0.114 (+0.006 to +0.221) | +0.058 (-0.032 to +0.149) | +0.029 (-0.106 to +0.163) | +0.058 (-0.036 to +0.151) |
| 5 (99) | -0.009 (-0.139 to +0.121) | -0.032 (-0.162 to +0.098) | +0.140 (-0.002 to +0.282) | +0.051 (-0.065 to +0.166) |
| 6 (170) | +0.003 (-0.069 to +0.075) | -0.015 (-0.081 to +0.051) | +0.064 (-0.025 to +0.154) | +0.087 (+0.017 to +0.156) |

- `mf` alone is level on the field, as a fix aimed at a few bots should be. Band 1's -0.040 is three bots (-5.3 points); its interval is a normal approximation on three values.
- `mfs5` is the nearest to the gate of anything in 3.12 so far (+0.19 / +0.14), but its interval includes 0 and band 3 is just past the -0.05 line (-0.057 / -0.059, interval across 0).

## P5: never close in

`aw`, 400-bot screen, 4 seeds:

| | Census rules | Keep-all |
|---|---|---|
| All | -0.22 (-0.49 to +0.06), 310 bots kept | -0.20 (-0.42 to +0.02) |
| Band 5 | **-0.154 (-0.282 to -0.026)** | **-0.195 (-0.300 to -0.091)** |
| Band 6 | -0.076 (-0.169 to +0.017) | -0.074 (-0.156 to +0.008) |
| Bands 1 to 4 | +0.004, -0.008, +0.023, -0.005 | +0.004, -0.008, +0.039, +0.036 |

The edit did what it was meant to: the mean distance (mean over battles, from the rows) rose from 414 px for 3.11 to 465 px for `aw`, and in band 6 from 399 to 466 px (band 4: 425 to 462; band 5: 398 to 449). So unlike P1 this does test distance. It costs score in the middle of the field: band 5 is below the -0.05 line in both readings with an interval that excludes 0, and band 6 is negative too. `aw` fails the gate, and the hunch ("never close in") is not supported on this evidence.

## P6: stored shield verdicts

Profile counts are in `docs/plan-3.12.md` (453 to 548 profiles per worker, 53 to 57% with a stored verdict). `wns` and `wmfs5ns`, 400-bot screen, 2 seeds, cold then warm on the profile the cold battle left:

| Candidate | Cold, census / keep-all | Warm, census / keep-all |
|---|---|---|
| `ns` | +0.06 (-0.29 to +0.40) / +0.06 (-0.21 to +0.34) | 0.00 (-0.39 to +0.39) / -0.05 (-0.40 to +0.30) |
| `mfs5ns` | 0.00 (-0.33 to +0.32) / -0.06 (-0.33 to +0.21) | +0.23 (-0.20 to +0.65) / +0.17 (-0.16 to +0.50) |

- `ns` cold is level, as it should be (nothing is stored before the cold battle). `ns` warm is level too: on this screen ignoring the stored verdict gains nothing, so the stored verdict costs 3.11 little across the screen. Warm, band 1 (three bots) is -0.054 (-0.074 to -0.033) under the census rules.
- `mfs5ns` cold is level overall, but band 4 is below the line with an interval that excludes 0 (-0.191, -0.344 to -0.038; keep-all -0.145, -0.282 to -0.008). Warm it is +0.23 / +0.17 with intervals across 0, and band 3 is -0.126 (-0.330 to +0.077) under the census rules.
- The warm total is no better than `mfs5` cold (+0.19 / +0.14, 4 seeds), so ignoring the stored verdict adds nothing on top of the two shield edits here.

## Reading against the gates

The screen gate is a gain of at least +0.15 APS with the 95% interval above 0 and no band below -0.05.

- No candidate meets it. `mfs5` is nearest and fails on the interval and on band 3; `mf` is level, `aw` is negative, `ns` and `mfs5ns` are level cold and not better warm.
- P4's own test (the bad battles) is met: `mf` and `s5` each remove the silent battles on the volatile bots, and `mf` warm lifts them by 4.4 to 5.7 points. Its worth is a fix for a defect, about +0.05 APS over the field, not a screen gain.
- `aw` is out. Ignoring the stored verdict (`ns`, `mfs5ns`) does not earn a place.
- The plan said `mf` "can ship on a level screen if the volatile steps show the silent battles gone"; that is what these rows show for `mf`. Whether to take it further or release it is the owner's call; nothing is released.

## Caveats

- Two to four seeds on 400 bots: a total's interval is about +-0.25 to +-0.4 APS, wider than the +0.15 gate, so a real +0.15 would not be seen and `mfs5` can neither pass nor be ruled out. The p312d steps have two seeds.
- `otherJvms` drops 22 to 32% of pairs on the screen steps. It is the harness artifact described in the M1 findings; the two readings agree on which candidates fail.
- The volatile steps are 38 bots chosen because 3.11 swings on them, so their means are not an APS and cannot be added to the screen's. The latch counts and bad-battle counts are over all rows with nothing dropped.
- Bench scores, not live. The volatile-bot gain is the part most likely to carry live, because it removes a fault.
