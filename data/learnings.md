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
out CPU pressure and a shared data directory alone as the cause. Not tried: another engine
release, another JVM, a 2.2-prefilled data directory (BENCH-4 supports all three but no
second engine, JDK or prefill set is available in this environment).
Evidence: `docs/bench/r4-client-conditions.md`; `hadur-bench/client-conditions-r4b.txt`.
Owner: R4.
