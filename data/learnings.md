# Learnings ledger

Findings from the rumble and the bench that a later stage would otherwise have to rediscover.
Each has an id, a status and its evidence. Add new ones at the end of their section; when
later data disagrees, set the status to **refuted** and say why, rather than deleting.

Status: **confirmed** (measured, reproduced or explained), **open** (measured once, cause
unknown), **refuted**. "Share" is Hadur's fraction of the pair's total score, which is the
same quantity as a rumble pairing's APS.

## The live rumble

**L-01 · open.** 3.0's live rating collapsed at about 08:30 UTC on 2026-09-28. Before: 268
pairings, 85.5 APS, 92.6% survival. After: 239 pairings, 77.2 APS, 71.2% survival, against
opponents of the same mean strength. Every opponent-APS band lost 6 to 10 APS at once.
Without the drop 3.0 would sit near 85.9 APS, about rank 21.
Evidence: `rumble/parsed/2026-09-28T1724Z_roborumble_botdetails_hadur2.Hadur_3.0.csv`;
[plan section 1.1](../docs/rumble-climb-r4-r6-plan.md). Owner: R4.

**L-02 · confirmed.** The bench predicted the live rumble well until the collapse. On the 20
top-50 opponents that were both benched and fought live, live APS tracks the bench share
(correlation 0.84). For the 10 fought before 08:30, live minus bench averages -0.1 points;
for the 10 fought after, -5.9. Each live pairing is one battle (±7.8 APS), so these are
means of noisy rows. So the drop is not a bench blind spot about opponents, and a
bench share is a fair stand-in for a healthy live pairing.
Evidence: `bench/duel-history.tsv` (report `roborumble-top50.md`) joined on name with the
BotDetails CSV; see [simulator.md](simulator.md) for the join.

**L-03 · open.** The bench cannot reproduce the lost rounds. The worst live rows (nano and
mini bots that won 30 to 40% of rounds live) are 35/35 on the bench at cpu constant 3.1, 1.0
and 0.3 ms, and with a shared data directory held at quota. Not yet tried: other engine
versions, JVMs, a data directory written by 2.2, CPU load.
Evidence: [plan section 1.2](../docs/rumble-climb-r4-r6-plan.md). Owner: R4 (BENCH-4).

**L-04 · confirmed.** Negative PBI concentrates against weak opponents (opponent APS under
50): 259 of 507 pairings, mean PBI about -5, worth about -2.9 APS over the whole set.
The strong-opponent rows carry positive PBI.
Evidence: [rumble-3.0-details.md](../docs/bench/rumble-3.0-details.md).

**L-05 · confirmed.** On 2026-09-28 at 19:44 UTC, rank 40 needed 83.07 APS and rank 50
82.46; 3.0 had 81.57 (64th of about 1,216). The top-40 goal is +1.5 APS.
Evidence: `rumble/parsed/2026-09-28T1944Z_roborumble_rankings_top50.tsv`.

**L-06 · confirmed.** The live flag showed "Unknown" until `hadur2,IRL` was added to the
robowiki `RoboRumble/Country_Flags` page. Evidence: the BotDetails page header.

**L-22 · confirmed (extends L-01, refutes the hope in R3.5).** 3.1's first full rumble pass
(512 pairings, 2026-09-30 11:23 to 14:38 UTC) slides the way 3.0 collapsed: 85.7 APS / 91.8%
survival in the first hour, 82.1 / 85.2 in the second, 79.7 / 79.1 in the third, 78.6 / 76.1
in the last 40 minutes, at constant opponent strength (PBI falls from +3.2 to -1.5). The 16th
place at 11:45 was the first 53 pairings, which still average 86.74 in the complete page.
R1 did not fix it: head to head on 213 common opponents 3.1 is +0.6 over 3.0, noise.
Evidence: `rumble/parsed/2026-09-30T1443Z_roborumble_botdetails_hadur2.Hadur_3.1.csv`,
`docs/bench/live-details-3.1.md`, [top-30 plan section 1](../docs/rumble-climb-top30-plan.md).
Owner: R7.

**L-23 · confirmed.** The gap. On 2026-09-30 rank 30 needed 84.30 APS and rank 40 83.11; 3.1
finished at 81.46 (rank 65), 36 bots between it and rank 30. 3.1's first-hour rate (85.7)
is rank 21; its first-hour PBI applied to every pairing gives 84.3, rank 30 exactly. The
slide is the whole gap and R6-style tuning is only margin.
Evidence: `rumble/parsed/2026-09-30T1145Z_roborumble_rankings.tsv`.

**L-24 · open.** Every bench pass ever run, BENCH-4's conditions included, forks a fresh JVM
per battle with the default heap and meets at most 60 distinct opponents; a rumble client
runs a session's battles through one `RobocodeEngine` in one process under `-Xmx512M`
against hundreds of distinct opponents. That difference has never been benched and matches
the live signature (healthy first, degrading over an hour or a few hundred battles).
Evidence: `hadur-bench` `Bench.runBattle` and `BattleRunner`; the Robocode 1.9.5.6
`roborumble.sh`. Owner: R7 (BENCH-6).

**L-25 · confirmed.** The rumble ran 3.1's 512 priority pairings in 3 hours 15 minutes,
about 160 battles an hour, three times the R4 plan's gauge. A new version's complete read
is the same afternoon. Evidence: the battle times in L-22's table.

**L-29 · confirmed.** 3.4's first full pass (1,215 pairings, 1,628 battles, 09:04 to 16:04
UTC on 2026-10-01) put it 20th at 85.90 APS ± 0.20, survival 93.9%. Unlike 3.0 and 3.1 it
did not slide: mean APS dipped to 82 to 84 in hours +1 and +2, then held 86.2 to 86.7 for
four hours against a steady opponent mix (mean opponent APS 49 to 51 every hour).
Evidence: `rumble/parsed/2026-10-01T2020Z_roborumble_botdetails_hadur2.Hadur_3.4.csv`.

**L-30 · confirmed (extends L-02, L-04).** Against the 19 bots ranked above it (by their own
APS on that page) 3.4 averages 47.7% ± 1.7: 8 clear wins (Saguaro, Raven, XanderCat,
Tomcat, GresSuffurd, Nene, WhiteFang, Dookious), 8 clear losses (BeepBoop and Nullstride
near 17% with no survival; DrussGT, ScalarR, Diamond, Firestarter, Wavelet, Gilgalad at 31
to 42%), 3 within noise. Mean PBI is +5.2 against them and -1.6 / -1.0 against opponents
under 50 / 50 to 70 APS. Live tracks the bench closely at the top: r = 0.96 over 18 of
them, live minus bench +1.0 (SD 4.4), no gap beyond one battle's noise (bench 3.2 for the
old top 10, 3.0 otherwise). The top 19 cost only 0.82 of the 14.1 APS Hadur gives up; the
447 opponents at 50 to 70 APS cost 6.78. Passing 19th (86.41) needs about 620 points: 33
per top-19 pairing or about 1.4 per 50-to-70 pairing.
Evidence: `rumble/parsed/2026-10-01_hadur-3.4_vs_top19.tsv`; report artifact
https://claude.ai/artifact/R1RPjQhCyb8eohTN2eJgtY.

## The bench against the field

**L-07 · confirmed.** 3.0 beats 40 of 48 of the top 50 on the bench (mean share 58.5%). The
losses are the very top guns and movements: BeepBoop 17.2, ScalarR 22.6, DrussGT 33.7,
Diamond 34.5, Wavelet 39.5, Firestarter 45.4, Gilgalad 49.0, Neuromancer 49.7. Our hit rate
against them is 5.9 to 9.9% and theirs against us 8.4 to 10.4%.
Evidence: [roborumble-top50.md](../docs/bench/roborumble-top50.md).

**L-08 · confirmed.** Top-10 mean share went 29.9% (2.0) to 39.6% (2.1) to 45.1% (2.2).
2.0 to 2.1 is almost all Saguaro; 2.1 to 2.2 is broad, from a lower enemy hit rate
(about -1.5 points) with our hit rate flat.
Evidence: [roborumble-top10-2.2.md](../docs/bench/roborumble-top10-2.2.md).

**L-09 · confirmed.** Saguaro 1.0 bullet-shields every new opponent. The SHIELD-1/2 counter
(detect our bullets being shot down, jitter the aim) took it from 1.7% to about 70%. Our own
shield was prototyped and dropped: strong bots re-aim once intercepted, and each trial costs
round 0. Evidence: [bullet-shielding.md](../docs/bullet-shielding.md).

**L-10 · confirmed.** Some rumble jars do not run on the bench: zen.Mirage 0.9.5 loads without
its Kotlin runtime, and jd.Nullstride 2.3.0 is hosted where Claude sessions cannot reach.
Evidence: `rumble/parsed/2026-09-28_roborumble_top50_jars.tsv`.

## What moved the score and what did not (Shadow 3.83c, cold unless noted)

**L-11 · confirmed.** Keeping at least 400 px (DIST-1) is the floor; at 150 px sample bots'
head-on guns cost 0.4 to 2 points. S5 took Shadow to 46.3% cold with survival 52.6 to 62.4.
Evidence: `s5-2.1-*.md` in `bench/duel-history.tsv`.

**L-12 · confirmed.** Bullet shadows (S6) were the first stage outside the noise: Shadow
57.4% ± 5.0, their hit rate 7.9%. Go-to surfing lost its A/B to three-option surfing
(51.8% against 54.8%). Evidence: `s6-2.1-*.md` reports.

**L-13 · open.** Warm play (opponent memory) has never shown a measurable gain over cold
against Shadow (S3 47.1 vs 45.1, S4 45.0 vs 44.3, S6 54.6 vs 57.4). There is no warm
top-10 run. Issue #49.

**L-14 · confirmed.** Melee movement weights sit at a local optimum (10-seed sweep, no change
beat baseline); the virtual-bullet term is the one that matters (-3 APS without it). Removing
the posture's fire holds raised bullet damage about 15% with APS flat. The reference APS gate
of 60 was never met (52.7 to 54.6).
Evidence: [m6-gates.md](../docs/bench/m6-gates.md), `bench/melee-history.tsv`.

**L-15 · confirmed.** 3.0 in melee: 1st of 10 on the samples set (105/105), 2nd on classic
behind Aleph, 4th on strong behind Diamond, Shadow and ScalarR.
Evidence: `melee-3.0-*.md` in `bench/melee-field.tsv`.

## Platform and client facts

**L-16 · confirmed.** Robocode's data-directory quota refunds nothing on delete, but
reopening a file for write refunds its old length; empty a file before deleting it.
`File.renameTo` is forbidden by the security manager. Evidence: S3/S4 memory notes,
`FileProfileStore`.

**L-17 · confirmed.** The data directory `robots/.data/hadur2/Hadur.data` is shared by every
Hadur version on a rumble client, so a new release inherits the old one's files.
Evidence: [plan](../docs/rumble-climb-r4-r6-plan.md), R5.

**L-18 · confirmed.** Skipped turns cluster on a round's last turn (the checkpoint write) and
after Hadur wins a melee round, not in long duels. Invokedynamic string concatenation made
the first scan take 7 to 10 ms; the build compiles with `-XDstringConcat=inline`.
Evidence: s6 and m6 reports; issue #48.

**L-19 · confirmed.** Bench noise: single opponents move 3 to 14 points between 5x35 runs, so
per-bot changes under about 8 points are noise. Compare at 10 seeds or with the paired A/B
(BENCH-2). Running mvn during a bench inflates skipped turns.
Evidence: [roborumble-top10-2.2.md](../docs/bench/roborumble-top10-2.2.md).

**L-20 · confirmed.** BENCH-5 (`hadur.bench.LiveDetails`), run against the 3.0 BotDetails
fixture, reproduces the plan's L-01 numbers exactly from the raw `.mht`: 268 pairings at 85.5
APS / 91.6% survival before 08:30 UTC, 239 at 77.2 / 72.5% from it (the plan's 92.6%/71.2%
used a slightly different survival definition; the split and the APS match). Confirms the
tool reads the page correctly, so it is ready to read 3.1's page once it has 300+ pairings.
Evidence: `docs/bench/live-details-3.0.md`; `hadur-bench` `LiveDetailsTest`. Owner: R4.

**L-21 · confirmed (extends L-03).** BENCH-4's client-conditions bench (`--client`), run
against master (3.1) over the weak set: a shared never-wiped data directory, the CPU
constant forced to 1.0ms and to 0.3ms (up to 112 skipped turns a battle), and four
background-load threads all leave survival at 97 to 100%, same as the default bench,
against a live drop to 71-77%. Confirms L-03 with a tool instead of an ad hoc run and rules
out CPU pressure and a shared data directory alone as the cause. A further pass built a data
directory the way a real client that has hosted every Hadur version would (the 2.2 jar
warm over the weak set, 184 KB, then the 3.0 jar warm on top of it, same 184 KB, 12
profiles), then ran 3.2 prefilled from it: still 97-100% survival, only the usual one round
in 35 noise on two opponents. So a cross-version data directory is not the cause either.
Not tried: another engine release, another JVM (BENCH-4 supports both, `engine=`/`java=`,
but no second engine distribution or JDK is available in this environment); the actual
offline RoboRumble client (`roborumble.jar`, not one of the Maven-available Robocode
artifacts) as a BENCH-4 condition, suggested but not attempted this session.
Evidence: `docs/bench/r4-client-conditions.md`, `docs/bench/r4-prefill-condition.md`;
`hadur-bench/client-conditions-r4b.txt`. Owner: R4.

**L-26 · confirmed.** The session bench (BENCH-6/7, 300 battles in one engine process, 3.2
jar) shows skipped turns per battle climbing from 10 to 90 while the control robot stays at
0, with survival, heap, live classes and turn p95 flat. Every added skip sits one tick after
a round's end: it is the round-end profile save, whose cost grows with the number of files in
the data directory (`ProfileLibrary.save` walks the directory for `bytesUsed`, and above 90%
of quota reads and decodes every own-version profile in `evictSeeds`). Wiping the directory
before each battle holds skips flat over 150 battles; prefilling it with 1,000 stats-only
profiles costs 21 to 31 skipped turns per save on both 3.2 and 3.3, 2,000 costs 42 to 53.
Survival stays 100% because the stall is after the round is decided. Evidence:
`docs/bench/r7-session.md`. Owner: R7; fix planned as R8 (`docs/rumble-memory-scale-plan.md`).

**L-27 · confirmed.** Past about 700 stats-only profiles (275 bytes each, 200 KB quota) the
data directory is over quota and every profile save is skipped ("275 bytes do not fit"), so
on a rumble client that has met most of the field Hadur persists nothing between battles.
`hadur2.Hadur.data` is keyed by class name, not version, so a long-lived client reaches this
with any version. The live slide (a survival collapse) is not reproduced by any directory
size, so this explains lost memory and the skipped-turn growth, not the slide. Evidence:
`docs/bench/r7-session.md` section 3. Owner: R8.

**L-28 · open.** The 300-battle session disabled Hadur three times (battles 59, 166, 215:
"has not performed any actions in a reasonable amount of time"), each mid-round, each after a
silent gap of about 240 turns with no skipped-turn, FAULT or MEM line before it, costing that
round. The engine's rule needs 240 consecutive misses (240 ms on a 1 ms client, 690 ms here),
so these are the one thing in the session shaped like the live slide. Unexplained; the test is
the session at a client constant (`docs/skipped-turns-plan.md` section 5). Also seen: on Java
20+ the engine's `Thread.stop` throws `UnsupportedOperationException` (two opponents in
`session.log`). Evidence: the session logs under `/mnt/project-files/bench-session/`,
`docs/skipped-turns-plan.md`. Owner: R8.

**L-31 · confirmed (extends L-30).** The weak tier is where 3.4's next ranks are. Its KNN PBI
is +5.1 against the top 100 and −1.7 against the 716 opponents ranked below 500; that
deficit costs about 1.0 APS, twice the gap to rank 19. It sits in the 368 weak pairings where
Hadur loses a round or more (PBI −3.3, 1.4 rounds of 35 lost on average); where it wins every
round PBI is −0.1. The worst are simple bots, several rammers by name (vort.Chaser,
bbo.RamboT, PSW.Relentless, mahrgell.mahrram). Evidence:
`rumble/parsed/2026-10-01T2020Z_roborumble_botdetails_hadur2.Hadur_3.4.csv`,
`docs/top20-analysis.md`. Owner: none (no code work planned).

**L-32 · confirmed.** The weak-tier leak (L-31) is tactics, not live-only stalls: the bench
reproduces it. 3.4 cold on the bench scored 75.9% against vort.Chaser (74.7 live), 64.6%
against mahrgell.mahrram (65.0) and 77.1% against stelo.MirrorNano (70.7), losing 203 of 3,850
rounds against 11 weak bots. Against rammers it spent most of each round within 100 px, where
they fire power-3 shots: 3.4's RAM-1 needed ten scans inside 250 px, by which time the rammer
had arrived, and then only flipped the orbit's side. Several nanos (RedBull, Tirunculus,
SledgeHammer, NanoDeath) fight the same way. Evidence: `docs/bench/r9-weak-leak.md`. Owner: R9.

**L-33 · confirmed.** Against a mirror mover, the gun needs our own future path, not theirs.
Offline, on 3.4's truth logs, aiming at the reflection of where we really were at the bullet's
arrival (two to five ticks late) hit MirrorNano 71-75% and MirrorMicro 86-87%; head-on hit
30% and 18%, linear 27% and 11%, and aiming at the reflection of a straight-line guess of our
own path 15% and 9%, worse than head-on. 3.4's KNN gun hit them about 8%. MIR-1 makes the path
known by planning it 110 ticks ahead and following it exactly. Evidence:
`docs/bench/r9-weak-leak.md`. Owner: R9.

**L-34 · confirmed.** Running from a rammer beats fighting it at close range. With RAM-2 (the
heading that keeps a pursuit model furthest away over 20 ticks, once a rammer is confirmed)
and MIR-1, the 11-bot weak bench rose from 74.8% to 86.8% mean share and rounds lost from 203
to 69; rammers +7.1 to +20.1 points, mirrors +16.2 and +15.3. Two nanos that shoot well at mid
range (SledgeHammer +2.3, NanoDeath +1.4) gained little: running keeps them out of
point-blank range but not out of their guns'. Evidence: `docs/bench/r9-weak-leak.md`.
Owner: R9.

**L-35 · confirmed.** A rule meant for weak bots must be gated on behaviour strong bots never
show, and checked against the top tier before it ships. The first cut of RAM-2 (four closing
scans within 500 px) and MIR-1 (30 scans, three mirrors) fired against nearly every top-19
robot and cost 5 points of mean share there (Raven −14, Neuromancer −15). Replaying the
detectors over the engine's truth logs found the separating facts: no top-19 robot ever
charged to within 120 px with both robots above 20 energy in two rounds of a battle (they
close in only to finish a disabled Hadur; XanderCat once drove through us from a close
spawn), and no top-19 pair stayed at each other's centre reflection for more than 80 scans
with both above 10 energy (two crawling, nearly dead robots did for 335). Offline replay of
the truth logs is a cheap gate before a 3-hour bench. Evidence: `docs/bench/r9-weak-leak.md`.
Owner: R9.

**L-38 · confirmed (live, pass 92% complete).** The ram approach (R9, 3.5.1: RAM-2 runs from a
confirmed rammer, MIR-1 plans a path and aim against a mirror mover) gained more live than the
weak-set bench predicted. The rankings page saved 2026-10-05 05:51 UTC has 3.5.1 16th of
1,216 at 86.65 ± 0.23 APS after 1,119 of 1,215 pairings, against 3.4's complete 85.90 (20th):
+0.75 APS, where the 11-bot bench forecast +0.1 and +0.5 at best. Survival 93.92% → 94.36%,
PWIN 99.26 → 99.02. Leigh reports the MeleeRumble at 18th, up from 28th; R9 is a duel
change (one enemy), so that move is recorded but not attributed to it. The 21st read on
2026-10-03 (259 pairings) was noise, as the top-15 plan (PR #83) found. Lesson: a weak-tier
fix generalises past the benched bots when the behaviour it targets (charging, mirroring) is common among the bots below us. Evidence:
`data/rumble/pages/2026-10-05T0551Z_roborumble_rankings.mht`. Owner: R9.

**L-39 · confirmed (bench, 10 battles each).** Against DrussGT 3.1.16 the gap is bullet power, not aim. Both guns hit below break-even (Hadur 7.47%, DrussGT 9.69%) and Hadur's shooting costs 39.6 energy lead a round against 27.8. A lead-aware power rule (0.1 while level or ahead) took the score share from 37.53% ± 3.49 to 50.69% ± 3.39, paired +13.16 ± 4.18, outright wins 86 to 188 of 350. Evidence: `docs/bench/d0-drussgt-probes.md`. Owner: POW.

**L-40 · confirmed (bench).** Rounds are decided by the early energy lead: released 3.5.1 won 75.6% of rounds ahead at tick 1000 and 9.0% of rounds not ahead. Lead-aware shifted that to 86.1% and 5.7%. Evidence: same report.

**L-41 · open (5 and 3 battles).** Random gun (34.17%), all chaff (29.94%) and hold fire (24.55%) all score below the released build or the lead-aware rule; none is a fallback. Sampled aim added +0.74 ± 3.96 over lead-aware: not confirmed.

**L-42 · decision (2026-10-05).** APS is the objective and a shield list is agreed (D5). Hadur 3.4 averaged 82.27% over the 357 pairings on DrussGT's shield list: +1.68 APS at 88%, +2.27 at 90%, +2.86 at 92%. The list is built from the bench, not DrussGT's names alone. Evidence: `docs/druss-route-plan.md`, `data/rumble/parsed/2026-10-05_drussgt-3.1.16_shield-targets_vs_hadur-3.4.tsv`. Owner: SHIELD. IDs L-39 to L-42 may be renumbered if PR #83 merges first.

**L-43 · open (live, pass 99% complete).** 3.7 reads 85.67 ± 0.18 APS in the 1v1 (21st), 0.98
below 3.5.1's partial 86.65 and 0.43 below the range the A-stage benches predicted, with every
3.5.1 fixture replaying unchanged. Survival 94.36% → 93.06%. Melee is level (65.25 against
65.31) and the first TeamRumble pass reads 39.43 (32nd of 46), above the bench's 28% forecast.
Not yet attributed: the live slide seen on 3.1 or a cost below the benches' 0.5-point
resolution. Evidence: `docs/bench/live-3.7.md`. Owner: ladder plan.
