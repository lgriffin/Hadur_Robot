# 3.11 M4 first screen: findings

Date: 2026-10-09. Stage M4 of the 3.11 census plan, first screen (`hadur-bench/plans/m4-311.queue`). Bench tooling, data and documents only; no change to `hadur-core` or `hadur-robot`, nothing released. The candidates are built by `build-ablation.sh` from the v3.10 tag (one-line edits), so they are not in the repository's source.

## What was run

- Candidates, each paired against the released Hadur 3.10 on the same opponents and seeds: `nd` (RES-9 duress never switches on), `nl` (TIME-3 learns no allowance from a skipped turn), `ndnl` (both).
- Set: `hadur-bench/screen-311.txt`, 400 census bots drawn in proportion to band size (3, 13, 49, 66, 99, 170 in bands 1 to 6), so the mean over the set estimates an APS change. Seeds 301 and 302, 35 rounds, Robocode 1.11.1, parallel 12, child CPUs 2, heap 2G, CPU constant 1488498, RoboRumble workers stopped.
- Load check `p4`: Hadur 3.10 alone at parallel 4, seed 301, same set.
- Times: `nd` 34 min, `nl` 35 min, `ndnl` 34 min, `p4` 17 min; 5 steps done at 13:12, 2 h from start. That is about 47 battles a minute for a pair, twice the census's 24.
- Rows: `data/bench/2026-10-09_hadur-screen-311-{nd,nl,ndnl,p4}-local_cold.tsv` (1,600, 1,600, 1,600 and 400 rows). Reports: `2026-10-09_screen-311-{nd,nl,ndnl,p4}.md`. Per-round files exported but not committed.
- Analysis: `data/tools/screen_paired.py` (new). Per opponent, the mean over seeds of candidate share minus baseline share; band rows are means over opponents with a 95% normal interval; the APS column is the band mean times the band's share of the set.

## Row rules

The census rules (security denial, another Robocode JVM, duress after round 0 drop the battle, and its partner on the same opponent and seed) leave 309, 322 and 338 of 400 opponents. `otherJvms` fires on 131 to 192 of the 400 pairs here, against 6% of rows in the census, so the rule removes far more than before and I treat the flag as the harness artifact described in the M1 findings. Both readings are given; they agree on which candidates pass.

## Results

### Census rules applied

| Candidate | Opponents kept | APS gain (95%) | Bands below -0.05 APS |
|---|---|---|---|
| nd | 309 | +0.72 (+0.38 to +1.06) | band 2: -0.07 (-0.18 to +0.03) |
| nl | 322 | +0.10 (-0.25 to +0.45) | band 4: -0.11 (-0.31 to +0.09) |
| ndnl | 338 | +0.81 (+0.41 to +1.20) | none |

### Nothing dropped for `otherJvms` or late duress (sensitivity)

| Candidate | APS gain (95%) | Band 1 | Band 2 | Band 3 | Band 4 | Band 5 | Band 6 |
|---|---|---|---|---|---|---|---|
| nd | +0.54 (+0.25 to +0.84) | -0.02 | -0.05 | +0.05 | +0.24 | +0.16 | +0.16 |
| nl | +0.06 (-0.25 to +0.37) | -0.01 | +0.04 | -0.01 | -0.06 | +0.11 | -0.00 |
| ndnl | +0.75 (+0.39 to +1.11) | +0.00 | +0.03 | +0.19 | +0.25 | +0.16 | +0.12 |

Band cells are APS contributions. Their intervals are wide in bands 1 and 2 (3 and 13 bots) and cross zero in every cell that is negative.

### Duress in the 3.10 baseline rows and the load check

| Run | Hadur 3.10 battles with any duress |
|---|---|
| parallel 12, in the `nd` step | 36% |
| parallel 12, in the `nl` step | 32% |
| parallel 12, in the `ndnl` step | 32% |
| parallel 4 (`p4`) | 11% |
| census tail, parallel 12 (Tomcat as partner) | 63% |

`nd` and `ndnl` show 0% duress, as built. `nl` shows 33%, the same as its baseline, so the learned allowance is not what starts the duress.

### Round by round, census rows (`census_rounds.py`, tail and top rounds files)

The table is in the PR description. Battles with duress lose their extra damage in round 0: against none, ranks 201 to 400 take 58 against 24 damage and lose 48 against 8 rounds per 100 in round 0, and from round 1 on the two groups are level (22 against 20 taken, 6.7 against 6.1 lost). The same holds in every band from 2 to 6, so the cost is the start-up skips in round 0, not the battle or its host slot.

## Reading against G4

G4 asks, for a census run, for a gain of at least the G2 threshold (0.25 APS) with the 95% lower bound above 0, no band below -0.05 APS, and a rerun on fresh seeds that keeps half the gain. This is the screen, not the census.

- `ndnl` and `nd` clear the gain and lower-bound tests under both readings. `ndnl` has no negative band under the census rules; `nd` has bands 1 and 2 slightly negative with intervals across zero.
- `nl` does not clear: +0.10 and +0.06 with intervals across zero. Its half of `ndnl` adds nothing measurable (ndnl over nd: +0.09 under the census rules, +0.21 with nothing dropped, both inside the noise).
- This does not pick the next step. It points the full-census run at `nd` or `ndnl`.

## Caveats

- The gain is the removal of a start-up cost that the bench's own load inflates. Duress in 3.10's own rows is 32 to 36% at parallel 12 here, 63% in the census and 11% at parallel 4. How often duress happens on the live rumble hosts is not known, so the live gain is at most the figure above and may be a fraction of it.
- Two seeds per opponent; per-opponent differences are noisy and the band and total means are the reliable reading.
- The totals use the set's design weights, not the 1,215-bot field.
