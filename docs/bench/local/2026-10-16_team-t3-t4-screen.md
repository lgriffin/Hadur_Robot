# Team stages T3 and T4: cloud screen (2026-10-16)

Screens of the first two stages proposed in `docs/bench/combatteam-3.25.md`. Every switch is
team-only. T3 changes `FieldGun.K`, which `FieldGun.k()` reads only while a teammate lives;
`MELEE_K` is unchanged. T4 changes `HadurCore`'s lane test and `TeamLink.laneClear`, both of
which exist only in a team battle. So 1v1 and melee play exactly as 3.13 does.

**Setup.** This was a cloud container (4 cores) with Bench team mode: 1200x1200, 10 rounds,
engine 1.11.1, `--cpu-constant 4863992`, two battles at once, cold. The opponents were the 20
teams of `team-top20.txt`, seeds 1-3, so each jar fought 60 battles. Each jar was built with
`build-ablation.sh` from master 3f10d0c. The baseline is the released `hadur2.HadurTeam_3.13.jar`.
The baseline was run once, and each candidate was paired with it at the same team and seed
(score share from each battle's `team.csv`). The interval is ±1.96 SE over the 20 team means.

| Candidate | What it does | Share | 3.13 | Paired (pp) | Skipped/battle | Teammate hits | Shots held for lane |
|---|---|---|---|---|---|---|---|
| k12 | T3: team gun takes 12 kNN situations, not 3 | 54.7% | 51.2% | **+3.50 ± 2.15** | 3.8 | 1,156 | 47,984 |
| k21 | T3: 21 situations (CombatTeam's depth) | 54.9% | 51.2% | **+3.71 ± 1.91** | 4.9 | 1,160 | 47,007 |
| l0 | T4: no fire lane | 51.7% | 51.2% | +0.46 ± 3.38 | 2.6 | 4,827 | 0 |
| l4 | T4: lane on teammates' last point only (WEAVE-7 off) | 51.8% | 51.2% | +0.62 ± 2.69 | 3.2 | 4,297 | 12,717 |
| 3.13 | baseline | | | | 3.2 | 1,181 | 50,587 |

k21 minus k12, paired directly: +0.21 ± 1.95.

**Read.**
- **T3 passes the screen.** Both depths gain about 3.5 points of score share. Both intervals
  are above zero, and 16 of 20 teams improve under k12 (17 under k21). Against the top 5, k21 gains
  CombatTeam +4.7, Firestarter +2.6, Shadow +0.4, Nightmare +6.0 and Aleph +0.1. k12 and k21
  are within noise of each other. k21 costs more skipped turns (4.9 against 3.2 a battle,
  worst battle 23), so the PC census decides between them.
- **T4 is level.** Dropping the lane frees about 50,000 held shots, but teammate hits rise
  fourfold (1,181 to 4,827). The extra friendly damage cancels the extra firepower, and
  CombatTeam only fires through because its members dodge each other's bullets. T4 is parked
  until T7 adds teammates' bullets to the team's risk; then `tlane4` with T7 is worth a
  second screen.

Next: the PC gate `hadur-bench/plans/team-depth.queue` (k12 and k21 against 3.13 on all 45
teams, 6 seeds, paired). T2's rule ships the better of the two if it is at least +1.0 with
its interval above zero.

## Per team (paired pp, mean of 3 seeds)

| Opponent team | k12 | k21 | l0 | l4 |
|---|---|---|---|---|
| Krabb.sliNk.SlartibartfassTeam 0.5 | +14.8 | +11.1 | +2.5 | +4.1 |
| abc.ShadowTeam 3.83 | +3.0 | +0.4 | +3.1 | -0.0 |
| ags.polylunar.Polylunar 1.6 | +5.9 | +2.7 | +13.1 | +10.7 |
| apvteam.MambaTeam 0.7.5 | +2.3 | +4.3 | +4.4 | +2.9 |
| bvh.team.Valkiries 1.0 | +5.3 | +7.1 | +1.8 | -4.7 |
| cb.fire.FirestarterTeam 2.0 | -0.9 | +2.6 | -2.9 | -1.8 |
| cx.mini.DemoniacNimrods 0.50 | -7.0 | +1.0 | -11.9 | -10.4 |
| davidalves.PhoenixTeam 0.54 | -1.6 | +6.1 | -2.1 | -5.7 |
| florent.XSeries.Xmen 0.9 | +7.5 | +10.0 | +11.9 | +6.7 |
| gh.mini.GrubbmGroup 0.4 | +1.8 | +3.6 | -1.6 | +1.9 |
| kawigi.micro.ArmyOfShiz 1.1 | -1.0 | -0.4 | -0.1 | +0.7 |
| kid.team.OmegaSquad .0.2 | +0.8 | +6.0 | -9.8 | -3.9 |
| mn.CombatTeam 3.25.0 | +7.1 | +4.7 | -1.9 | +4.8 |
| myl.micro.TroodonPack 1.10 | +2.5 | +2.1 | -1.2 | -1.7 |
| radnor.RadnorMedSchool 1.0 | +3.8 | +7.9 | +15.1 | +12.4 |
| rz.AlephTeam 0.34 | +6.7 | +0.1 | -3.9 | -0.8 |
| rz.GlowingHawks 0.2 | +12.4 | +7.6 | -1.7 | +2.1 |
| rz.HOFSwarm 1.1 | +2.1 | -0.8 | -7.5 | -6.1 |
| tmnr.TMNR 1.01 | +0.4 | -7.8 | -9.7 | -7.4 |
| ustimaw.NightmareTeam 3.3 | +3.9 | +6.0 | +11.5 | +8.6 |
