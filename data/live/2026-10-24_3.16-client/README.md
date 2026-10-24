# Live 3.16 client battles, Leigh's PC, 2026-10-24

Read-only collection, made at 19:30 local (18:30Z). Nothing was run, stopped or edited.

## What ran

Only rr01..rr04 ran 3.16. rr05 and rr06 have no 3.16 jar and have not written anything since 2026-10-11.
`hadur2.Hadur_3.16.jar` reached all four clients at 15:30:56Z, when the participants list updated.
Each client last wrote at about 17:35Z. No RoboRumble client JVM was running when I looked; the Java processes on the host belong to the pc-shield-s2 bench.

No `live_client.py watch` ran today. `data/live/` holds nothing newer than 2026-10-11, so there is no battles.tsv, health.tsv, startup.tsv or page*.tsv for 3.16.

The client's own results files are deleted after each upload. Only the last batch, which was not uploaded yet, survives in `roborumble/files/results1v1.txt`.

| client | opponents touched by 3.16 | first (UTC) | last (UTC) | rounds won, last battle per opponent | 3.16 battles in the pending batch | all battles in the pending batch |
|---|---|---|---|---|---|---|
| rr01 | 312 | 15:31:01 | 17:34:55 | 10422/10886 (95.7%) | 19 | 30 |
| rr02 | 349 | 15:31:08 | 17:35:06 | 11722/12215 (96.0%) | 3 | 9 |
| rr03 | 328 | 15:31:01 | 17:35:06 | 10968/11480 (95.5%) | 25 | 37 |
| rr04 | 306 | 15:31:10 | 17:34:51 | 10224/10710 (95.5%) | 7 | 20 |

Over the four clients 3.16 met 1056 distinct opponents, 196 of them on more than one client. That makes at least 1295 3.16 battles. 1048 of the 1056 are in the census-312 panel. The pending batches hold 57 complete 3.16 battles with scores, at a mean score share of 82.5%.

## Files

- `profiles-rrNN.tsv`: `live_client.py profiles` on each client's `robots/.data/hadur2/Hadur.data`. That folder is shared by every Hadur version since 2026-10-05, so its `battles`/`rounds` counts add up all versions.
- `profiles-since-316-rrNN.tsv`: the profiles changed after 15:30:56Z, i.e. the opponents 3.16 fought. Each profile is saved once per battle, so its `last_wins`/`last_rounds`/`last_damage_share` describe that opponent's latest 3.16 battle. Earlier 3.16 battles against the same opponent on that client cannot be separated out.
- `results-pending/results1v1-rrNN.txt`: the raw pending batch. `hadur316-rrNN.tsv` holds its 3.16 rows (score, firsts, score share).
- `results-pending/health-rrNN.hc`, `battles-rrNN.hc`: the raw last-battle records.
- `bench/census-*`: the pc-table-v1 census, run 2026-10-24 06:39 to 11:00 local: arms c, aa and t1, 2424 battles each, 2 seeds, census-312 panel. The files are arms.tsv (one row per battle), report.md, conditions.json and the gzipped rounds.tsv. Arm t1 is 3.16's behaviour.
- `bench/shield-s2-partial-c-aa.tsv`: the finished per-battle rows (`battles/*/arm-row.tsv`) for arms c and aa of tonight's running pc-shield-s2 screen (robot hadur2.Hadur 3.16, 4 seeds, 300 opponents). There are 891 rows as of 18:31Z, covering 112 opponents. It is partial and the queue is still running. `shield-s2-conditions.json` is its in-progress conditions file.

## Anything odd

The four last-battle health records, one per client, show no faults and no memory failures. Skipped turns were 31, 1, 16 and 11; the longest run of consecutive skips was 6, on rr03. Only the last battle's record survives on each client, so this is no health census.
