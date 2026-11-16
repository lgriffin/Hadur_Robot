# Team fitted enemy aims (TMODE-50): gun reads, fits and cloud smoke, 2026-11-16

## Where the gap is (cloud mirror, 3.23 and OgiTeam)

Live 3.23: HadurTeam 83.37, OgiTeam 88.01; pairing by pairing on the 46 teams both meet, OgiTeam scores 3.98 APS
more, 2.94 of it on 16 teams. A cloud mirror of 3.23 (aa) and OgiTeam on those 16 teams, 2 seeds from 22200,
10 rounds (tools/team_mirror.py): gap +1.83 APS on them; their bullets +0.91, their survival +0.52, our survival
+0.16, bonuses +0.27, our bullets -0.05. We take more bullet damage than OgiTeam against every one of the 16.

## What their guns aim at (jar read, then tools/team_aimfit.py on the mirror's OgiTeam battles)

The fit asks, for every enemy shot, which aim at which tick before the shot lands within half a bot width of one
of the subject's members; a control turns every heading 0.25 rad.

| Team | Code | Fit | Explains (control) | Head-on / linear at the fire tick |
|---|---|---|---|---|
| ArmyOfShiz | head-on, spinning radar (Shiz) | head-on, 6 ticks back | 70% (4%) | 33% / 10% |
| HOFSwarm | linear lead at 13 px a tick times (1 - d/1200) | that, 5 ticks back | 51% (7%) | 16% / 12% |
| GrofGroup | nano lead atan2(v cos, 14 + sin) | linear at 15 px, 2 back | 60% (5%) | 12% / 25% |
| RadnorMedSchool | linear lead, gun turned after firing | linear, 2 back | 67% (5%) | 11% / 49% |
| TMNR | | head-on, 3 back | 54% (6%) | 46% / 10% |
| Polylunar | | linear, 2 back | 77% (36%) | 36% / 66% |
| NightmareTeam | virtual guns | linear, 2 back | 57% (17%) | 20% / 48% |
| the other nine of the 16 | guess factor, pattern, virtual guns | | 15-26% (9-12%) | |

The fits repeat on the HadurTeam battles (ArmyOfShiz head-on 6 back 70%, Polylunar 77%) and on the smoke's
other seeds (HOFSwarm 48%). Our dodge (TMODE-27) places every shot at the member's state on the fire tick, so
against these guns it steers round the wrong spot. TMODE-50 adds each fitted aim to the profile at its share.

## Cloud smoke (6 teams x 3 seeds from 22300, 10 rounds, fit paired with aa; team-fitted-smoke-fit.md)

| Team | Share fit / aa | Paired | Enemy hit rate on our members fit / aa |
|---|---|---|---|
| ArmyOfShiz | 86.8 / 83.7 | +3.0 +- 12.9 | 11.9% / 11.7% |
| GrofGroup | 90.2 / 86.9 | +3.3 +- 3.1 | 15.1% / 16.0% |
| RadnorMedSchool | 93.2 / 92.8 | +0.4 +- 5.9 | 16.9% / 18.5% |
| HOFSwarm | 88.5 / 83.0 | +5.5 +- 11.5 | 13.1% / 14.3% |
| TMNR | 88.2 / 86.0 | +2.2 +- 5.5 | 12.8% / 13.6% |
| Polylunar | 62.1 / 60.9 | +1.2 +- 19.3 | 39.8% / 41.1% |
| All | 84.8 / 82.2 | **+2.6 +- 2.1** | |

All six positive; about +0.34 APS spread over 46 pairings, as the gate counts. A smoke cannot pass a line (no A/A on the cloud at
this size); the PC card pc-team-fitted (BENCH-254) screens it.

## Read-across: 17 more teams (3.23 alone, 1 seed from 22400)

TroodonPack fits head-on 5 ticks back for 80% of its shots (control 4%, head-on at the fire tick 39%) and
FourProphetsAndADiscliple linear at 13 px a tick at the fire tick for 62% (5%; linear now 34%). The other 15
teams' best fits gain under 12 points over the fire-tick aims (ImWithStupid head-on 4 back 47% vs 35%, Impact
69% vs 64%) and are left out. Smoke of the two (3 seeds from 22300, paired with aa; team-fitted-smoke-fit2.md):
TroodonPack +3.1 +- 5.1, FourProphets +0.8 +- 4.7 (+1.9 +- 2.3 together); enemy hit rate on our members 12.4% ->
10.8% and 14.2% -> 13.4%. Both join the card, which screens eight teams.
