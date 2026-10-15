# Melee: the gap from 17th to the top 10 (Hadur 3.13)

Asked on 2026-10-15: what stands between Hadur and a top-10 MeleeRumble place. Inputs are the
LiteRumble pages for 3.13 after its first full melee pass (Leigh's save at 10:00 UTC, and
`/mnt/project-files/data/2026-10-15T0942Z_meleerumble_botdetails_hadur2.Hadur_3.13.html`), the
rankings and the BotDetails pages of ranks 1-18 fetched at 10:05 UTC (saved under
`/mnt/project-files/data/melee-peers-2026-10-15T1005Z/`), the melee top-20 bench rows of
2026-10-07 (`data/bench/2026-10-07_hadur-melee-top20-385-vs-37-local_cold.tsv`, Hadur 3.8.5,
whose melee code 3.13 still runs) and a cloud screen run for this read (section 4).

## 1. Where Hadur stands

| Rank | Robot | APS | Survival |
|---|---|---|---|
| 9 | ags.Glacier 0.2.11 | 68.92 | 44.82 |
| 10 | kc.mini.Mirage 0.2 | 68.31 | 52.88 |
| 11 | rsalesc.melee.Medina 0.4.5 | 68.09 | 50.02 |
| 16 | justin.Mallais 14.0 | 65.89 | 38.95 |
| **17** | **hadur2.Hadur 3.13** | **65.58 ± 0.25** | **41.19** |
| 18 | kc.micro.Figment 1.0 | 65.38 | 35.55 |

Tenth place needs **+2.73 APS**. Ranks 11-13 sit 0.2-0.4 below Mirage, so +2.5 to +3 APS is the
size of the job. That is far larger than the 1v1 climbs (+0.15 to +1.4 a release).

## 2. Where the points are lost (live, per opponent)

Hadur's APS against each opponent band, and the same for the robots around tenth place (each
column is that robot's own pairing with the same opponents, so the fields match):

| Opponent ranks | n | Hadur | Mirage (10) | Glacier (9) | Shadow (8) | Medina (11) | Mallais (16) |
|---|---|---|---|---|---|---|---|
| 1-10 | 10 | **46.0** | 45.9 | 46.9 | 48.2 | 47.0 | 44.0 |
| 11-30 | 19 | 50.1 | 54.1 | 53.7 | 55.0 | 53.5 | 50.8 |
| 31-60 | 30 | 53.3 | 57.0 | 56.8 | 58.1 | 56.0 | 53.9 |
| 61-100 | 40 | 55.6 | 60.2 | 59.9 | 61.0 | 59.1 | 57.0 |
| 101-200 | 100 | 61.6 | 65.1 | 65.6 | 65.9 | 64.5 | 62.2 |
| 201-300 | 100 | 68.2 | 71.1 | 72.0 | 72.1 | 70.9 | 68.9 |
| 301-415 | 115 | 77.7 | 78.7 | 79.8 | 79.9 | 79.3 | 77.1 |

Mirage's lead, as APS (band gap x band size / 414): ranks 11-30 +0.19, 31-60 +0.27, 61-100
+0.45, 101-200 **+0.84**, 201-300 **+0.69**, 301-415 +0.29; total +2.72.

- **Against the top 10 Hadur is already a top-10 robot** (46.0, level with Mirage).
- **The gap is the middle of the field, ranks 11-300**, worth 2.4 of the 2.7 APS. Unlike the
  1v1 ladder it is not the weakest tail: against ranks 301+ Hadur gives up only 0.3.
- It is spread evenly (3-5 points against every band), so it is a whole-field property of how
  Hadur plays a ten-robot battle, not a list of robots.
- Survival ("rounds first") is low against every band: 44% against ranks 301+ where Mirage has
  55%, Shadow 58%, Diamond 71%. Glacier (9th) wins no more rounds than Hadur (45-48%) and is
  still 3.3 APS ahead, so the points can come from score inside the rounds, not only from wins.

## 3. Why: Hadur's melee guns do the least damage of the top 20

A melee score is survival points (50 for each robot outlived), bullet damage, and bonuses (last
survivor, kills). The top-20 bench (five fields of Hadur and nine of ranks 1-22, 10 seeds, 35
rounds; 3.8.5, same melee code as 3.13) splits every robot's mean battle score:

| Robot | Score | Survival points | Bullet damage | Bonuses | Firsts per battle | Mean place |
|---|---|---|---|---|---|---|
| aaa.r.ScalarR | 14,936 | 10,333 | 3,471 | 1,131 | 10.2 | 1.2 |
| abc.Shadow | 12,760 | 9,355 | 2,843 | 563 | 4.5 | 3.3 |
| kc.mini.Mirage | 12,652 | 9,220 | 2,859 | 573 | 4.6 | 3.6 |
| voidious.Diamond | 12,288 | 8,225 | 3,313 | 750 | 6.1 | 3.0 |
| ags.Glacier | 11,297 | 8,142 | 2,841 | 313 | 1.9 | 4.8 |
| **hadur2.Hadur** | **10,738** | **8,696** | **1,771** | **271** | **1.8** | **5.2** |
| positive.Portia | 10,581 | 7,448 | 2,826 | 307 | 2.2 | 6.0 |
| justin.Mallais | 10,509 | 7,535 | 2,617 | 357 | 2.1 | 5.5 |
| wompi.Numbat | 9,095 | 6,888 | 1,972 | 236 | 1.6 | 6.8 |
| kc.micro.Figment | 6,873 | 4,245 | 2,403 | 226 | 0.5 | 9.8 |

(21 robots in all; the full table is reproducible from the TSV.)

- **Hadur's bullet damage is the lowest of all 21 robots**, 1,771 a battle, below even
  Figment (2,403, ranked 18th) and Numbat (1,972). The robots around tenth place do 2,600-2,900.
- **Its survival points are good**: 8,696, more than Glacier, Diamond-level, behind only the
  top four. Hadur's movement keeps it alive as well as a tenth-place robot's does.
- Against Mirage the score gap of 1,914 is 57% bullet damage, 27% survival and 16% bonuses;
  against Glacier it is all bullet damage (+1,070), with Hadur 554 points ahead on survival.
- The final duels are a smaller lever: Hadur reached the last two in 17% of rounds and won 29%
  of those (37% against Mirage, 48% against Shadow), though it is 7th on the 1v1 ladder. Lifting
  that to 50% would be worth roughly 1% of score; the damage gap is about 10%.

### Shots, power, hit rate and gun idle (new bench count)

The bench now writes `bullets.csv` (BENCH-90): every robot's shots, power, hits and damage per
round, with shots fired while five or more robots are alive counted apart (the crowd), and its
ticks alive and ticks with a cool gun it did not fire. `data/tools/melee_firepower.py` pools it.
From the passive screen's run (section 4; robocode 1.11.1, cloud, 15 battles a build, 3.13 is
the baseline build's row; the opponents pool both builds' battles):

| Robot | Shots per 100 ticks alive | Gun cool and unfired | Mean power | Hit rate | Crowd power | Crowd hit rate | Damage per round |
|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR | 6.6 | 16% | 1.43 | 18.9% | 2.52 | 27.1% | 114 |
| voidious.Diamond | 6.8 | 12% | 1.61 | 19.8% | 2.52 | 28.1% | 113 |
| kc.mini.Mirage | 6.9 | 11% | 1.41 | 21.5% | 1.74 | 27.4% | 88 |
| ags.Glacier | 5.5 | 18% | 2.38 | 20.0% | 2.76 | 23.3% | 87 |
| abc.Shadow | 6.3 | 18% | 1.57 | 22.8% | 1.89 | 28.6% | 87 |
| rsalesc.melee.Medina | 6.4 | 9% | 2.08 | 20.0% | 2.81 | 24.9% | 83 |
| justin.Mallais | 6.4 | 10% | 2.03 | 19.1% | 2.39 | 21.9% | 79 |
| wompi.Numbat | 6.8 | 13% | 1.32 | 22.9% | 1.48 | 25.9% | 61 |
| **hadur2.Hadur 3.13** | **5.9** | **21%** | **1.43** | **19.8%** | **1.62** | **23.5%** | **54** |

- Hadur does the least damage per round of all 21 robots, again, on this engine and build.
- **Its gun sits cool and unfired 21% of the ticks it is alive, the most of the 21.** Mirage,
  Diamond and Medina sit 9-12%. Hadur fires 5.9 shots per 100 ticks; Mirage, at the same mean
  power (so the same gun heat), fires 6.9.
- In the crowd it fires light (1.62) and hits 23.5%. The strong guns fire 2.5 there and still
  hit 27-29% with slower bullets, which reads as shooting nearer robots.
- Against Mirage (88 against 54 a round): about a third more shots, 12% more damage per hit and
  9% better accuracy.

## 4. Cloud screens

Reports: `docs/bench/local/2026-10-15_melee-top20-{mpow,mhold,mrate}-vs-313.md`; firepower tables: `data/bench/2026-10-15_melee-top20-*-vs-313_firepower.tsv`.

Five top-20 fields (A-E, Hadur and nine opponents each), 3 seeds, 35 rounds, 1000x1000,
robocode 1.11.1, CPU constant 4138771 pinned, two battles at a time on 4 cores (2-6 skipped
turns a battle). Each build fought paired with 3.13 on the same seeds. A field's interval is
wide (3 seeds), so only the pooled mean of the five fields and a field that resolves alone are
read. All three builds are bench ablations (`hadur-bench/build-ablation.sh`), none in the robot.

| Build | What changes | Hadur damage per round | Gun idle | APS paired diff by field (A, B, C, D, E) | Pooled |
|---|---|---|---|---|---|
| mpow | 3 or more opponents and 30+ energy: power 3 (or the kill) | 71 vs 56 (+27%) | | -1.6, +1.7, -0.1, -2.1, +2.6 | **+0.1** |
| mhold | Leigh's passive theory: 3 or more opponents, fire only to finish (16 energy or less) | 17 vs 54 | 55% | -5.7, -6.9, -8.5, **-5.7 ± 3.1**, -2.7 | **-5.9** |
| mrate | fire on scans up to 8 ticks old (was 5), no lead cap with 3+ opponents | 55 vs 57 | 17% vs 21% | +0.8, -0.6, -4.6, +1.8, -2.3 | **-1.0** |

- **Power alone is a wash** (mpow), as M6's power tables were on the old reference field: the
  extra damage is paid for in survival (field A survival 56% against 62%).
- **Going passive loses about 6 APS** (mhold), the largest effect measured. Survival falls as
  well as damage (A 54% against 58%, C 46% against 55%): a robot that stops shooting leaves the
  field healthy around it and keeps a full energy bar that draws fire. The endgame cannot repay
  it: Hadur reaches the last two in about 17% of rounds.
- **Firing on staler scans does not help** (mrate): it cut the idle gun from 21% to 17% and
  added 4% more shots, but the older scans hit less (18.9% against 20.1%), so damage stayed level
  and APS is level to slightly down.

## 5. What it means

- The 2.7 APS to tenth place is bullet damage in the crowd. Movement and survival are already at
  the level of ranks 8-12, and the endgame duel is worth about 1% of score.
- The cheap switches are spent: power (M6, mpow), fire holds (M6 gpost, gage, mrate), passivity
  (mhold, the old posture). Each trades damage against survival one for one.
- What is left is the **gun itself**: where it shoots and how well it hits. The strong guns
  fire heavy shots at near robots and hit them (27-29% at power 2.5); Hadur fires light shots at
  far ones and hits 23.5%. The field gun's kNN takes only K = 3 situations per opponent
  (`FieldGun.K`), the energy table fires 1.0 beyond 500 px, and Hadur's minimum-risk movement
  keeps it far from everyone, so many of its shots are long ones.
- A next stage would be a melee-gun stage, not a switch: measure fire distance and target choice
  (add them to `bullets.csv`), then try a wider kNN (K 3 to 10-20 with a kernel density as
  Diamond's melee gun does) and a target choice that prefers near robots in the crowd. All of it
  lives in `hadur2.core.melee`, which never runs in a 1v1, so Leigh's isolation rule holds.
- Expected size: closing half of the damage gap to Mirage (+17 damage a round, about +600 a
  battle on the bench) is worth roughly +1.5 APS if survival holds; that is the order of the
  climb needed, and it would need a PC census to confirm.
