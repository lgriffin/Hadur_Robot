# 3.15 live (2026-10-23 09:34 UTC): 8th of 1,220 at 89.29, and why that is not the bench's +0.34

Pages saved by Leigh at 09:34 UTC, two and a quarter hours after the v3.15 release (07:18 UTC):
Hadur 3.15's BotDetails page, the 1v1 rankings and the team rankings, archived in
`data/rumble/pages/2026-10-23T0934Z_*` and parsed to `data/rumble/parsed/2026-10-23T0934Z_*`. Beside
them, fetched at 09:40 UTC: 3.13's retired BotDetails page (its final state) and the melee rankings
(`2026-10-23T0940Z_*`). All 1,219 pairings are in, 2,255 battles, 1.85 a pairing.

| Release | APS | Rank | Battles | Battles a pairing | Page |
|---|---|---|---|---|---|
| 3.15, first pass | **89.29** | **8th** | 2,255 | 1.85 | this read |
| 3.13, final | 89.44 | (retired) | 2,849 | 2.34 | fetched 2026-10-23 |
| 3.13, first pass | 89.50 | 7th | 1,968 | 1.62 | [live-3.13.md](live-3.13.md) |

| Rank | Robot | APS |
|---|---|---|
| 5 | ScalarR 0.005h.053-noshield | 91.24 |
| 6 | **cz.libors.Ogi v1** (new since 3.13's page) | 90.92 |
| 7 | Diamond 1.8.22 | 90.16 |
| **8** | **Hadur 3.15** | **89.29** |
| 9 | Firestarter 2.0f | 88.10 |
| 10 | Raven 3.56j8 | 87.74 |

## 1. 8th is the newcomer, and 3.15 is not measurably below 3.13

Ogi v1 entered above Diamond with about 2,000 battles. 3.13 at its final 89.44 would be 8th today.

3.13 did not keep its first-pass 89.50: as the pairings filled to 2.34 battles each it settled at
89.44 (-0.05 over the same 1,216 opponents). Against that final page, on the 1,219 opponents both
faced, 3.15 is **-0.15 ± 0.22 APS**. The interval includes zero, so the page shows no regression.
It also does not show the gain the release-candidate census measured, +0.34 ± 0.15 APS against
3.14 (PR #222): the shortfall of about 0.5 lies outside both intervals.

The field changed a little: `a.FreyaOS 1.0`, `cz.libors.Ogi v1` and `zzx.StormHead 1.0.1` are on
3.15's page and not 3.13's (3.15 scores 99.5, 40.1 and 94.6 against them); `cs.s2.Succubus 1.0` is
gone. Together they move the page by -0.01.

## 2. Where the shortfall is: 30 collapsed pairings

`live_passes.py`-style read of per-pairing swings of 10 points or more, 3.15 against 3.13's final
page, with earlier page pairs as the baseline (all over the 1,216-1,219 common opponents):

| Pages | Mean (pts) | Down 10+ | APS | Up 10+ | APS | Rest, mean (pts) |
|---|---|---|---|---|---|---|
| 3.13 final vs 3.13 first (same code) | -0.05 | 2 | -0.03 | 2 | +0.03 | -0.06 |
| 3.13 first vs 3.12 (+1.78 release) | +1.79 | 14 | -0.18 | 103 | +1.53 | +0.49 |
| 3.12 vs 3.11 (+0.16 release) | +0.16 | 18 | -0.24 | 17 | +0.24 | +0.15 |
| **3.15 vs 3.13 final** | **-0.15** | **30** | **-0.37** | **8** | **+0.08** | **+0.14** |

Against the three page pairs in the table, 3.15's pass has about twice the collapses and few gains to match them (3.10's 26 in [live-3.10.md](live-3.10.md) were counted by a stricter single-battle rule, so they are not comparable). Sixteen of the
thirty are in ranks 51-400, mostly against robots Hadur beats 95-100 (WeeksOnEnd 99.8 to 71.0,
Grrrrr 94.6 to 68.9, SMG, SquirmyToad, Fallen), each at one or two battles; five are in the top 50,
four each in the 88 large losses and the weak tail, one rammer. The list, in census format for a PC
check, is `hadur-bench/panel-collapses-315.txt`. They are spread over the whole pass (07:46 to
09:26 UTC), not one burst.

Outside the 38 pairings that swung 10 or more, the other 1,181 moved **+0.14 points**: the broad
effect of the two shipped switches is about +0.15 APS, roughly half the bench's +0.34.

## 3. By segment (docs/plan-top5.md section 3), 3.15 minus 3.13 final

| Segment | Bots | All pairings (pts) | APS | Without the 10+ swings (pts) | APS | Bench rc vs 3.14 (pts) |
|---|---|---|---|---|---|---|
| A rammers | 87 | -0.42 ± 0.68 | -0.030 | -0.22 ± 0.56 | -0.015 | +0.01 ± 0.37 |
| B weak tail, 401+ | 719 | +0.19 ± 0.18 | +0.111 | +0.20 ± 0.16 | +0.120 | +0.26 ± 0.14 |
| C large losses | 88 | +1.16 ± 1.26 | +0.084 | +1.33 ± 1.03 | +0.087 | +0.95 ± 0.84 |
| D ranks 51-400 | 294 | -1.09 ± 0.61 | -0.264 | -0.31 ± 0.45 | -0.069 | +0.55 ± 0.39 |
| E top 50 | 24 | -3.13 ± 3.02 | -0.062 | +0.09 ± 1.82 | +0.001 | -0.89 ± 2.28 |

B and C, where the bench put the gain, delivered it live. D is where the bench and the page disagree:
+0.55 on the bench, -1.09 live, of which -0.78 is the sixteen collapses and -0.31 ± 0.45 the rest.

Within D, without the collapses, the loss sits on the guns that hit Hadur most: against learning guns
hitting 7% or more (the profile tiers' T3, 94 bots) -0.79 ± 0.72; 4.5-7% (64) -0.55 ± 1.07; under
4.5% (99) +0.37 ± 0.72 (gun classes and hit rates from
`docs/bench/local/2026-10-18_census-classes.tsv`). Over the whole field without the collapses, guns
at 7%+ read -0.24 ± 0.42 (282 bots) and the rest +0.24 ± 0.18 (892). Every one of these intervals
includes zero; the pattern is a lead, not a finding.

## 4. Reading

- **The collapses are most likely the pass, not the code.** This pass ran at about 1,000 battles an
  hour (2,255 in 2 h 16 min), four times 3.13's first pass (1,968 in 8 h), because every rumble client
  prioritises a new entry. Hadur spends about 3 ms a tick; a loaded client skips its turns and the
  engine disables it after 30 in a row. 3.10's first pass showed the same signature (86.42 with 26
  collapses, then 87.33 on the second pass, [live-3.10.md](live-3.10.md)). On the bench, 3.15 (rc)
  skipped fewer turns than 3.14 (37.4 against 39.2 a battle, 99% of battles trusted) and beat the
  collapsed opponents. Unverified: no client log from this pass is available; if Leigh's client ran
  during it, `live_client.py`'s `startup.tsv` holds each battle's longest skipped-turn run (`max_skip_run`, RES-15; `health.tsv` has only the battle's total `skipped`).
- **The D shortfall is a real bench-against-live gap to understand.** One candidate: MOVE-24 keeps
  the flatteners off whatever the stored profile says, so ADAPT-2 (a T3 profile turns the flattener on
  from the first wave) no longer acts. The bench runs every battle cold and never measured that loss;
  live clients keep Hadur's data directory, and 3.15 reads 3.13's profiles. Consistent with the
  7%+ split above, untested.
- **What the bench did and did not measure.** The +0.34 was real on one quiet machine, and about half
  of it (B and C) shows live. A switch-sized gain of 0.1-0.3 APS is smaller than what one pass's
  client conditions do to Hadur (±0.4 here), so no first pass could have shown it. That should have
  been said before the release.

## 5. Next

1. Judge 3.15 at about 4 battles a pairing, when single-battle collapses have averaged out (3.10
   gained +0.9 on its second pass). Save the page then.
2. If Leigh's client ran during the pass, read its `startup.tsv` (`max_skip_run`) for the 30 collapsed opponents.
3. PC, about 15 minutes: 3.15 against 3.14 on `panel-collapses-315.txt`, 4 seeds, once cold and once
   warm (data kept), to rule a code cause in or out and to test the ADAPT-2 lead.
4. No more switch work until the D gap is explained.

## Team and melee

| Rumble | Entry | APS | Rank | Pairings | Battles | Previous |
|---|---|---|---|---|---|---|
| Team | `hadur2.HadurTeam 3.15` | 68.33 ± 0.85 | 9th | 45 of 46 | 113 | 3.13: 68.30, 9th |
| Melee | `hadur2.Hadur 3.15` | 66.71 | 15th | (early) | | 3.13: 65.58, 17th |

Team is level, as expected (MGUN-8 was a non-significant +1.5 ± 1.8 on its screen). Melee is up
+1.1 and two places on an early pass, in line with MGUN-7's census (+0.88 cloud, +1.15 PC).
