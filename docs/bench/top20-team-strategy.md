# Bench strategy: the TeamRumble top 20, one team at a time

The 1v1 note (`top20-strategy.md`) argues that a pooled mean hides a spread. The team
ladder is the same case with fewer data: the only team numbers on record are the A5 and T1
gates, eight teams at 3 seeds each, and they already spread from 20.9% (CombatTeam) to
93.7% (the sample team). This note plans one measured row per team for the 20 teams in
`hadur-bench/team-top20.txt`, so the owner can see where `hadur2.HadurTeam` should evolve.

**The set.** The TeamRumble top 20 of 2026-10-05
(`data/rumble/parsed/2026-10-05T1546Z_teamrumble_rankings.tsv`, 46 teams). Hadur's own
`hadur2.HadurTeam 3.7` is rank 32 (APS 39.43), so nothing was skipped; every team has an
archive jar and all 20 are in `hadur-bench/opponents/` (git-ignored), each self-contained
(member classes or a nested member jar). `cb.fire.FirestarterTeam 2.0` is a newer version
than the `cb.mega.FirestarterTeam 1.14` of `team-reference.txt`, so A5 and T1 have no
figure for it. Teams already measured at the same version: ranks 1, 3, 4, 11 and 20.

## How a run is made

From `hadur-bench/Bench.java` (`runTeam`): `--seeds` battles per team (default 3 in the bench,
5 in the script), `RANDOMSEED` set to the seed number, data wiped before each battle,
1200x1200 and 10 rounds. Since issue #102 team mode takes the duel path's width and pairing
options: `--parallel N` fights N battles at once on worker homes, `--cpu-constant`, `--child-cpus`
and `--child-heap` apply, `--baseline` fights the baseline team at the same (team, seed) and adds a
paired table, and `--per-opponent DIR` writes one report per team. The scripts pass them straight
through. The jar defaults to
`../hadur-robot/target/hadur2.HadurTeam_<robot.release>.jar` (3.8 today; built, 431661 bytes),
the members are `hadur2.Hadur`.

```powershell
# whole set, 5 battles each, 3.8 team jar (add -SkipBuild while another bench runs from this tree:
# mvn package at the root also rebuilds hadur-bench)
.\hadur-bench\bench-team-top20.ps1 -Seeds 5 -SkipBuild -Label 2026-10-06-team

# the same, with 3.7 fought at the same seeds and a paired table, four battles at once
.\hadur-bench\bench-team-top20.ps1 -Seeds 5 -SkipBuild -Parallel 4 -Baseline baselines\hadur2.HadurTeam_3.7.jar

# one team, more seeds, by hand
mvn -q compile exec:java "-Dexec.args=--team true --set team-top20.txt --only Combat --seeds 10 --cpu-constant 1488498 --out work/team-combat --report ../docs/bench/local/team-combat.md"
```

`bench-team-top20.sh` takes the same options in `--kebab-case`. The 3.7 team jar is copied to
`hadur-bench/baselines/hadur2.HadurTeam_3.7.jar` (also at `C:\robocode\robots`). Pass `--robot`
whenever `--robot-jar` is not the project's own release, or the bench names the team
`hadur2.HadurTeam 3.8` and the engine cannot find it; the scripts derive it from the jar name.

**Pairing.** The T1 gate paired by (team, seed), and `--baseline` does the same in one run: per team,
the candidate's and the baseline's battle at the same seed, then the paired score-share difference
with its 95% interval (the BENCH-2 convention), and an "All" row pooling every team's pairs. Seeds
where either battle failed drop out of that team's pairing. The baseline's own full report follows
the paired table.

**Seeds and time, both unmeasured.** No team figure on record gives the per-battle spread, so
the duel table of resolutions (`top20-strategy.md`, 35-round duels) does not carry over; ten
rounds is a much shorter battle. Start at 5 seeds (100 battles), then spend more on the teams
that read close to 50%. No timing of a team battle is on record either: time the first
`team battle i/N` line of the console and extrapolate before committing to a large run.

## Width

`--parallel N` (script `-Parallel`) fights N battles at once, each on its own worker home. The
width is **unmeasured** for teams. Reasoning: a team battle puts 10 robots in the engine against
the duel's 2, so the same robot count as 12 duels is two or three team battles, not 12. The width
ladder (`docs/bench/local/2026-10-06_parallel-ladder.md`) found that without `--child-cpus` even
12 wide skipped 26.3 turns a battle against 15.5, with every battle in duress; Bench now gives each
child `--child-cpus 2` when `--parallel` is above 1 (a duel figure; team children run ten robots
in one JVM, so 4 may suit better, try `--child-cpus 4`). The scripts' old `--shards` and
`JAVA_TOOL_OPTIONS` workarounds are gone. Use width 1 for any run whose numbers are to be trusted;
if time forces it, run a ladder first (1, 2, 3 wide over the same 4 teams) and compare skipped
turns per battle (now in the report) with the width-1 run before taking a width.

## Trust checks

Read these before any score.

1. **Every battle ok.** No `battle(s) failed` line, Faults 0, and `Count < truth` 0 (the T1
   gate held all three at zero on 3.8).
2. **Skipped turns per team near the T1 figures.** Five members a side is 10 robots, so a
   loaded host shows up here first. On 3.8 the T1 gate read 82 skipped turns over 24
   battles (3.4 a battle; Aleph 25 over 3, Phoenix 18 over 3, Combat 0, Mamba 1), against
   43 on 3.7. A rule of thumb, not a measurement: a team whose skipped turns per battle run
   at twice the T1 figure or more was probably loaded; rerun it alone.
3. **Duress ticks.** Hadur sheds work in duress (the 1v1 note: wave detection among it) so a
   duress round measures a different robot. The report prints a "Duress ticks" line (total over N
   battles, per battle, most in one) after the skipped-turns line when the members' `R` records carry
   field 33, as 3.8 does; a log from before it gets no line rather than a zero. The T records carry no
   duress field.
4. **CPU constant.** The report's host line names it (pinned or calibrated), the host and the parallel
   width. The scripts read the constant from `C:\robocode\config\robocode.properties` (1488498 on
   2026-10-05; the 1v1 ladder used an idle calibration of 1876154, so say which one a run used) and
   pass it as `--cpu-constant`, which pins it in every worker home.
5. **Other JVMs.** Six rumble clients normally run on this PC (four 1v1, one melee, one
   team, per the ladder note), and a team battle is the heaviest of them. Check
   `tasklist | findstr java` before and after, and do not overlap another bench.
6. **No stray shelf files** (`Stray shelf files` column 0) and the data files line names only
   the leader's `hadur2/Hadur.data/health.hc` and the opponent's own files.

## What to read per team

The report row gives, per team over its seeds: **score share** (our score over the sum of both
teams), **rounds won**, **survival** (rounds with a member of ours alive at the end), skipped
turns, faults, in-lane shots and the count check. The per-opponent files
(`<report>_per-opponent/<team slug>.md`) give each team its own seed-by-seed table (with the
baseline's share and the paired difference when `--baseline` ran) and its own T-record sums by
member. The main report pools these figures over the whole set; the battle directories
`<out>/battles/<team slug>-<seed>/` hold the raw logs (a baseline's end in `-baseline`):

- **Bullets on mates.** The ninth column of `rounds.csv` (`bulletsOnMates`), summed; `friendly.log`
  has one line per hit with power and flight. T1 on 3.8: 328 over the 8-team suite.
- **Drive-replaced counts.** The last field of each member's `T` record (drives the teammate
  fence replaced); the first five fields are teammate hits, teammate bullet hits, collisions,
  shots held for the lane and reports merged. T1 on 3.8: 11,762 drives fenced, 65 collisions.
  A team where drives fenced are high and score share is low is a team where the fence costs
  movement; one where bullets on mates stay high points at members sharing a target (T1's
  recorded follow-up).
- For a loss, survival tells whether it is lost early (0 survival) or by margin.

## Bands, by rank and by what is known

APS is the live TeamRumble average, not a score share against Hadur; the evidence column is
the only local measurement.

| Band | Ranks (APS) | Evidence on 3.8 (T1 gate, 3 seeds) | Reading |
|---|---|---|---|
| Out of reach so far | 1-4 (78.7 to 83.6) | Combat 20.9%, Shadow 24.4%, Aleph 28.6%, 0 to 3 of 30 rounds won | Loses nearly every round. Firestarter 2.0 unmeasured |
| Unmeasured top half | 5-10 (67.4 to 78.4) | none | Nobody has fought these locally; first pass decides the band |
| Contested | 11-15 (62.8 to 65.6) | Phoenix 54.9%, 13 of 30 rounds | The likely place for gains, by APS alone |
| Lower top 20 | 16-20 (59.5 to 62.2) | Mamba 51.8%, 22 of 30 rounds | Close to even where measured |

Hadur's team is far below these in APS (3.7: 39.43), and 3.8 is not yet on the ladder, so the
bands say where a team plan would move first, not where it will.

## The teams

Rank and APS are from the 2026-10-05 TeamRumble file. Members are read from each jar's
`.team` file. Style is unknown unless a repo doc says so: none of the repo's docs describe
any of these teams' tactics beyond what is quoted here. T1 figures: score share, 3.8 against
3.7, 3 seeds, `docs/bench/t1-team.md`. Every line ends with the result to fill in.

- **1. mn.CombatTeam 3.25.0 (83.64).** Five `mn.Combat`. Style unknown (its solo Combat is a
  `TeamRobot` already ranked 12th in melee, `docs/architecture-evolution-plan.md`). T1: 20.9%,
  0 of 30 rounds, against 8.6% on 3.7. Local 3.8 result: _pending_
- **2. cb.fire.FirestarterTeam 2.0 (83.25).** Five `cb.fire.Firestarter` 2.0. Style unknown.
  Not measured; the older `cb.mega.FirestarterTeam 1.14` read 27.7% on 3.8, 9.9% on 3.7,
  which is a different version. Local 3.8 result: _pending_
- **3. abc.ShadowTeam 3.83 (80.51).** Five `abc.Shadow`. Style unknown. T1: 24.4%, 2 of 30
  rounds, against 9.7%. Local 3.8 result: _pending_
- **4. rz.AlephTeam 0.34 (78.67).** Five `rz.Aleph`. Style unknown. T1: 28.6%, 3 of 30 rounds,
  against 11.0%; 25 skipped turns in 3 battles, the highest of the eight. Local 3.8 result: _pending_
- **5. ustimaw.NightmareTeam 3.3 (78.38).** Four `ustimaw.Nightmare` and one member named
  `NigitmareDroid` (jar spelling). Style unknown. Local 3.8 result: _pending_
- **6. florent.XSeries.Xmen 0.9 (72.57).** Five `florent.XSeries.X2` (nested member jar, 185 KB).
  Style unknown. Local 3.8 result: _pending_
- **7. ags.polylunar.Polylunar 1.6 (69.63).** Five different robots: Luna, Phobos, Io, Europa,
  Charon. Style unknown. Local 3.8 result: _pending_
- **8. rz.GlowingHawks 0.2 (69.47).** Five `rz.GHMember`; a 5 KB jar. Style unknown.
  Local 3.8 result: _pending_
- **9. kawigi.micro.ArmyOfShiz 1.1 (67.63).** Five `kawigi.micro.Shiz`; a 7 KB jar. Style
  unknown. Local 3.8 result: _pending_
- **10. rz.HOFSwarm 1.1 (67.44).** Five `rz.HOFMember`; a 4 KB jar. Style unknown.
  Local 3.8 result: _pending_
- **11. davidalves.PhoenixTeam 0.54 (65.60).** Five `davidalves.Phoenix`. Style unknown. T1:
  54.9%, 13 of 30 rounds, against 17.4% on 3.7, the biggest move of the eight. Local 3.8 result: _pending_
- **12. kid.team.OmegaSquad .0.2 (64.29).** The `.team` file lists four members (Niner,
  Darman, Fi, Atin), so five Hadurs fight four. Style unknown. Local 3.8 result: _pending_
- **13. cx.mini.DemoniacNimrods 0.50 (63.56).** Five `cx.mini.Nimrod`; a 10 KB jar. Style
  unknown. Local 3.8 result: _pending_
- **14. tmnr.TMNR 1.01 (63.37).** Five different robots: Donatello, Giovanni, Leonardo,
  Michelangelo, Raphael. Style unknown. Local 3.8 result: _pending_
- **15. myl.micro.TroodonPack 1.10 (62.78).** Two `Troodon` and three `TroodonDroid`. Style
  unknown. Local 3.8 result: _pending_
- **16. Krabb.sliNk.SlartibartfassTeam 0.5 (62.16).** Three `Slartibartfass` and two
  `Fatghost`. Style unknown. Local 3.8 result: _pending_
- **17. bvh.team.Valkiries 1.0 (61.17).** Five `bvh.team.Valkirie` 0.44t; a 6 KB jar. Style
  unknown. Local 3.8 result: _pending_
- **18. radnor.RadnorMedSchool 1.0 (61.15).** Five `radnor.DoctorBobTeam`; a 2 KB jar, one
  class. Style unknown. Local 3.8 result: _pending_
- **19. gh.mini.GrubbmGroup 0.4 (61.02).** One `GrubbmOgre` 0.4 and four `GrubbmGrunt` 0.5.
  Style unknown. Local 3.8 result: _pending_
- **20. apvteam.MambaTeam 0.7.5 (59.46).** Five `apvteam.Mamba`. Style unknown. T1: 51.8%,
  22 of 30 rounds, against 22.5%. Local 3.8 result: _pending_

## What is already measured (docs/bench/a5-team.md, t1-team.md)

- A5 (3.6, 3 seeds, 8 teams): 28.1% pooled, 61 of 240 rounds, 21 skipped turns, zero faults,
  LINK rejects and stray shelf files. It beat the sample team (75.5%) and `lxx.ConceptATeam`
  (74.4%) and lost heavily to every real team: members drove through each other (about 440
  teammate collisions a round) and had no shared target.
- T1 (3.8 against 3.7, same seeds): pooled 28.8% to 48.2%, collisions 101,322 to 65, friendly
  fire 1,015 to 328 (missed its 80% bar), every team up, Phoenix +37.5 and Mamba +29.3.
- Not measured anywhere: ranks 2 and 5 to 19, per-battle spread, battle time, anything on a
  loaded or sharded host.

## Follow-ups that need Java changes

Issue #102 closed the first four of the original list: parallel team battles on worker homes
(with `--child-cpus` and `--child-heap`), `--baseline` with a paired table per team, the CPU
constant and host line in the report, and `--per-opponent` for teams (T sums, bullets on mates,
drives fenced, skipped turns and duress per team). It was written without a battle run, so the
first real run is also the smoke test. What is left:

1. **Member count.** `OmegaSquad` has four members; the report should name each side's size.
