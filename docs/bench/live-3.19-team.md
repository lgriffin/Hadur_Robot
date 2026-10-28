# HadurTeam 3.19 live, first pass (2026-10-28 23:49 UTC)

LiteRumble pages archived as `data/rumble/pages/2026-10-28T2349Z_*` (TeamRumble rankings and the
`hadur117.HadurTeam 3.19` BotDetails page), parsed under `data/rumble/parsed/`. 3.19 is the first team
release under the `hadur117` package.

HadurTeam 3.19 is **4th of 48 at 79.41 ± 0.71** over 47 pairings and 120 battles, its best score so
far (3.17.1 read 79.39 ± 1.00 on 69 battles). PWIN 91.5%, survival 84.5%.

| Rank | Team | APS |
|---|---|---|
| 1 | cz.libors.OgiTeam v1 | 88.13 |
| 2 | cb.fire.FirestarterTeam 2.0 | 81.69 |
| 3 | mn.CombatTeam 3.25.0 | 81.57 |
| **4** | **hadur117.HadurTeam 3.19** | **79.41** |
| 5 | abc.ShadowTeam 3.83 | 79.25 |
| 6 | ustimaw.NightmareTeam 3.3 | 77.26 |
| 7 | rz.AlephTeam 0.34 | 76.98 |

## What changed

3.19's team play is 3.17.1's (MATEFIRE with the narrow lane, and HUNT) plus two per-opponent counters
from pc-team-counters (PR #370, shipped in PR #373): TroodonPack plays OWN and HEADON, GrofGroup plays
OWN and LINEAR. The bench put the pair at about +0.16 APS. Nothing else in team play changed.

## Against 3.17.1

| Comparison | 3.17.1-play APS | 3.19 | Change |
|---|---|---|---|
| 3.17.1 first pass, same 47 opponents (2026-10-25 22:16) | 79.39 ± 1.00 (69 battles) | 79.41 ± 0.71 | **+0.02** |
| 3.18.1, same team play, rankings page (2026-10-28 06:42) | 78.56 ± 0.97 (72 battles) | 79.41 | +0.85 |

The same play has read 79.39 and 78.56 in two passes, so one pass moves by about ±0.8. 3.19 sits at the top
of that range. The +0.16 the bench expected is well inside it, so this pass cannot confirm or deny the
counters as a whole.

Per opponent against the 3.17.1 page (most pairings are 1 to 4 battles, so each row is ± 5 to 8):

| Opponent | 3.17.1 | 3.19 | Change | Bench |
|---|---|---|---|---|
| myl.micro.TroodonPack (OWN, HEADON) | 78.6 | 83.6 | **+5.1** | +4.7 ± 3.8 |
| gh.nano.GrofGroup (OWN, LINEAR) | 75.6 | 77.3 | **+1.7** | +2.5 ± 3.0 |
| All other 45 | | | -0.6 in total (-0.01 APS) | 0 (unchanged play) |

- **Both counters read live what they benched**, on 2 battles each: TroodonPack +5.1 against +4.7, and
  GrofGroup +1.7 against +2.5. Together they are worth about +0.15 APS, as projected.
- The other 45 teams play exactly as before and net to zero. The biggest swings are noise of one to four
  battles: Valkiries +7.3, Firestarter +7.3, PhoenixTeam +6.0; Slartibartfass -11.6, Xmen -6.4, HOFSwarm -6.2.

## Where it loses

The 9 pairings under 60 are the 9 teams ranked 1st to 12th. They hold 443 of the 968 points HadurTeam
gives away (46%). The other 38 teams average 85.7.

| Opponent (rank) | APS | Survival | Battles |
|---|---|---|---|
| OgiTeam (1st) | **29.0** | 10% | 2 |
| NightmareTeam (6th) | 46.5 | 67% | 3 |
| FirestarterTeam (2nd) | 49.3 | 17% | 3 |
| AlephTeam (7th) | 49.7 | 23% | 3 |
| Polylunar (9th) | 54.8 | 75% | 4 |
| HOFSwarm (12th) | 56.0 | 45% | 2 |
| Xmen (8th) | 56.8 | 47% | 3 |
| CombatTeam (3rd) | 57.2 | 35% | 2 |
| ShadowTeam (5th) | 57.2 | 48% | 4 |

- **To 2nd (Firestarter 81.69) is +2.28 APS = +107 points over 47 pairings**; to 3rd (Combat 81.57) is
  +2.16 = +102 points. That is about +12 against each of the 9 teams above, or +2.8 against each of the 38 below.
- **Survival is the loss.** Against Ogi, Firestarter, Aleph and Combat we survive 10 to 35% of rounds.
  The other 38 we already beat at 85.7, surviving 90% or more of rounds against 33 of them.
- **Next on the bench:** pc-team-path (PR #400, on master). It tests Firestarter's path check (moves
  checked against our own bullets in flight), picked per team over all 46, and NEAR (250 px) on
  TroodonPack only. Leigh runs it after pc-melee-wide, pc-deise-e04 and pc-sanaro-n02.
