# The melee gun stage (M7): wider kNN in free-for-all melee

Follow-up to the melee gap read ([melee-gap-3.13.md](melee-gap-3.13.md)), which found Hadur 3.13
17th in the MeleeRumble, 2.7 APS behind tenth, with the lowest bullet damage of the top-20 fields
and the gun cool and unfired on 21% of its ticks. Leigh (2026-10-15): build the melee gun
capabilities with total isolation from 1v1.

## 1. Why the gun sits idle

The `gwhy` ablation prints one line for every tick the gun is cool with energy to spare, saying
why no shot left (field A, one seed, six rounds, 883 such ticks):

| Code | Meaning | Ticks | Share |
|---|---|---|---|
| F | fired | 163 | 18% |
| A | the gun was still turning to last tick's aim (0.05° tolerance) | 418 | 47% |
| H | the brain held fire at a target (scan older than 5 ticks, or energy) | 155 | 18% |
| T | no target (no opponent scanned within 8 ticks, or only rammers) | 146 | 17% |
| N | no command yet (first tick) | 1 | 0% |

Half the idle ticks are a gun that never settles: the aim is the peak of the summed density of
every opponent's solutions, and with K = 3 situations an opponent the peak jumps between
opponents from tick to tick, so the gun chases it and the 0.05° check never passes.

## 2. Screens

Five top-20 fields (A-E, Hadur and nine of ranks 1-22 each), 3 seeds, 35 rounds, 1000x1000,
robocode 1.11.1, CPU constant 4138771 pinned, two battles at a time on 4 cores, each build
paired with 3.13 on the same seeds (`bench-melee-top20.sh --baseline`). The builds are bench
ablations of 3.13 (`hadur-bench/build-ablation.sh`).

| Build | What changes | Damage a round (vs 3.13) | Gun idle | Hit rate | APS paired diff by field (A-E) | Pooled |
|---|---|---|---|---|---|---|
| gtol + gstick (`gtgs`) | fire within 2° of the aim, and lock the target in the last three cooling ticks | 50.0 vs 50.3 | 18.1% vs 20.8% | 18.7% vs 19.4% | -2.3, -0.5, 0.0, +1.4, +1.5 | **+0.0** |
| gk | K 3 to 12 situations per opponent | 56.7 vs 54.7 | 19.5% vs 21.1% | 20.6% vs 20.4% | +0.2, +1.3, +1.0, +0.8, +2.2 | **+1.1** |
| gk, second run (`gk2`) | the same build, fresh battles | 55.5 vs 51.4 | 19.5% vs 20.9% | 20.4% vs 19.9% | +1.3, -1.7, +1.6, +0.4, +1.3 | **+0.6** |
| gwin (`gn`) | fire window: shoot at once along the gun's heading when it covers 70% of the peak's density | 52.3 vs 52.2 | 19.6% vs 20.5% | 19.6% vs 18.9% | +0.4, -1.6, -0.3, +0.8, -2.1 | **-0.6** |

- **Firing sooner does not pay** (gtgs, gwin). Both cut the idle gun by one to three points and
  added shots, but the extra shots were the poor ones, so damage stayed level.
- **A wider kNN does** (gk): the only gun change ahead on every field in its first run, and on
  four of five in a second run of fresh battles; over both runs +0.85 APS, ahead in 9 of 10 field
  runs, damage a round +4% and +8%. Twelve situations spread
  each opponent over the angles it is likely to reach, so the density peaks where several
  opponents' futures overlap, which is what a gun in a crowd is for; damage a round rose 4% and
  the crowd hit rate 24.6% to 25.2%. Diamond's and Neuromancer's melee guns also draw many
  situations an opponent.

Reports: `docs/bench/local/2026-10-15_melee-top20-{gtgs,gk,gk2,gn}-vs-313.md`, firepower tables in
`data/bench/2026-10-15_melee-top20-*-vs-313_firepower.tsv`.

## 3. What ships: MGUN-7

`FieldGun.MELEE_K` (12) beside `FieldGun.K` (3); `FieldGun.k()` gives 12 off a team and 3 on one.
Everything else in the gun is unchanged, and an opponent with fewer than twelve learned
situations gets the circular or linear solution, as one with fewer than three did.

Isolation:

- **1v1.** A duel's charter has no melee role (ROLE-6), so `FieldGun` is never built in a 1v1
  battle. Every 1v1 replay fixture and its telemetry passed unchanged, and `DuelIdentityTest`'s
  duel pin is untouched.
- **Team.** On a team (`FieldGun.onTeam`, MGUN-6's living-teammate test) the gun keeps K = 3, so
  HadurTeam plays as 3.13 does: both team fixtures passed unchanged.
- **Melee.** The two melee fixtures that reach the field gun with twelve situations
  (`melee-samples`, `melee-handoff`) were re-recorded with the `hadur-bench/README.md` commands,
  their telemetry snapshots rewritten, and the melee pin re-pinned. `melee-sentry` did not diverge.

## 4. Census of the live field (cloud, 2026-10-16)

Leigh's PC was unavailable, so the census ran on the cloud container (4 cores, two battles at a
time, CPU constant pinned): every opponent on 3.13's 2026-10-15 MeleeRumble BotDetails page, 413
of 414 (`jd.Nullstride 2.3.3` has no jar in the robot archive), shuffled into 46 fields: 45 of nine
and one of eight, F27, where Nullstride stood (`hadur-bench/melee-census-313.txt`), 2 seeds of 35 rounds each, the `gk` build paired with 3.13
on the same seeds: 184 battles.

| | 3.13 + MGUN-7 | 3.13 |
|---|---|---|
| Paired APS difference, mean of 46 fields | **+0.88 ± 0.19** (SE; 34 of 46 fields ahead) | |
| Damage a round | 124.4 | 115.4 (+8%) |
| Hit rate | 25.6% | 24.1% |
| Hit rate in the crowd (5+ alive) | 40.2% | 36.6% |
| Gun cool and unfired | 14.4% | 15.1% |

By the opponent's own melee rank (Hadur's pairwise share against it, paired difference averaged
per opponent):

| Ranks | Opponents | Paired difference |
|---|---|---|
| 1-10 | 9 | -0.89 ± 0.46 |
| 11-50 | 40 | +1.32 ± 0.40 |
| 51-100 | 50 | +0.74 ± 0.38 |
| 101-200 | 100 | +0.92 ± 0.28 |
| 201-300 | 100 | +0.86 ± 0.22 |
| 301-414 | 114 | +0.91 ± 0.20 |

- The gain is the same order as the two top-20 screens (+1.1, +0.6) and holds across the field,
  ranks 11-414 alike: the bands where 3.13 lost its 2.4 APS to tenth.
- Against the top 10 it is slightly down on 9 opponents, 18 battles each side, which is about two
  standard errors; the top-20 screens, whose fields held six of the top 10, were ahead. Watch it in
  the live pairings rather than act on it.
- Size: +0.88 of the 2.73 APS to tenth, about a third of the gap; the live pass decides the rank.
  Skipped turns were 1,875 over the 184 battles, both builds together (the cloud's usual rate).

Report: `docs/bench/local/2026-10-16_melee-census-gk-vs-313.md`, firepower table
`data/bench/2026-10-16_melee-census-gk-vs-313_firepower.tsv`.

## 5. Next

- A release with MGUN-7 (release.yml) and a live melee pass.
- The other idle causes remain: scans too old to fire on (H) and no fresh opponent (T), about a
  third of idle ticks. Both are radar questions (the sweep revisits a robot every 10-11 ticks).
