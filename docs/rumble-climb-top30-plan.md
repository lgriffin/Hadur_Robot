# Rumble climb, top 30: plan (R5, R7, R6)

Planning document written after Hadur 3.1 finished its first full pass of the RoboRumble 1v1
(512 pairings, 2026-09-30). It follows [the R4 to R6 plan](rumble-climb-r4-r6-plan.md): R3.5
and R4 are done (3.1 and 3.2 released), R5 is implemented on a held branch with no PR, R6 is
not started. This document re-reads the plan against 3.1's live data, keeps R5 and R6, and
adds R7. The requirements and tests already written for R5 stand.

**Status: final.** A Sonnet thread implements it stage by stage, one PR per stage, merged as
needed, with the usual rigour (EARS rows in `docs/requirements.md`, a tagged Cucumber scenario
per ID, unit and jqwik tests, ArchUnit unchanged, replay fixtures re-recorded when play
changes, deliberate `DuelIdentityTest` re-pins named in the PR, `hadur.climb.stage` bumped in
the root pom).

Goal (Leigh, 2026-09-30): **top 30 in the RoboRumble 1v1.** On 2026-09-30 at 11:45 UTC rank
30 was davidalves.Firebird 0.25 at 84.30 APS and rank 40 fromHell.CHCl3 1.4.2 at 83.11; 3.1
finished at 81.46 (rank 65 of 1,216). We need **+2.9 APS**, and about +3.5 to sit inside the
top 30 with a margin.

## 1. What 3.1's live data says

Three saved pages, archived under `data/rumble/pages/` with parsed tables beside them:

| Page | Captured | Content |
|---|---|---|
| `2026-09-30T1145Z_roborumble_rankings` | 11:45 UTC | all 1,216 ranks; Hadur 3.1 16th at 86.74 |
| `2026-09-30T1146Z_roborumble_botdetails_hadur2.Hadur_3.1` | 11:46 UTC | 3.1's first 53 pairings (11:23 to 11:42) |
| `2026-09-30T1443Z_roborumble_botdetails_hadur2.Hadur_3.1` | 14:43 UTC | 3.1 complete: 512 pairings (11:23 to 14:38) |

`docs/bench/live-details-3.1.md` is BENCH-5's report on the complete page.

### 1.1 The 16th place was real, and it was the first hour

The 53 pairings behind the 16th place average 86.74 APS, and the same 53 opponents still
average 86.74 in the complete page: nothing about them was lucky. What changed is the
pairings fought later. By UTC hour of the battle (all 512 are single battles, so the hour is
when the pairing was fought):

| Hour | Pairings | APS | Survival | Mean PBI |
|---|---|---|---|---|
| 11:00 (from 11:23) | 97 | 85.7 | 91.8 | +3.2 |
| 12:00 | 171 | 82.1 | 85.2 | +0.9 |
| 13:00 | 154 | 79.7 | 79.1 | -1.5 |
| 14:00 (to 14:38) | 90 | 78.6 | 76.1 | +0.1 |

PBI is LiteRumble's opponent-adjusted score (our APS against an opponent less what bots of
our strength get against it), so the slide is not an opponent mix: mean opponent APS is 49.5
in every hour. In 20-minute buckets the slide runs from 86.2 APS and 91.1% survival at 11:40
to 76.0 and 73.6% at 14:00, with a partial recovery to 81.5 in the last 20 minutes.

The first-hour rate puts 3.1 at rank 21; the complete pass puts it at 65. Had every pairing
been fought at the first hour's PBI, 3.1 would have 84.3 APS, exactly rank 30.

### 1.2 It is 3.0's collapse again, so R1 did not fix it

3.0 fell at 08:30 UTC on 2026-09-28 after 268 healthy pairings (L-01). 3.1 slides from about
12:00 after roughly 100. The onset differs; the degraded state is the same:

| | 3.0 before 08:30 | 3.0 after | 3.1 first hour | 3.1 from 13:20 |
|---|---|---|---|---|
| Pairings | 268 | 239 | 97 | 187 |
| APS | 85.5 | 77.2 | 85.7 | 78.2 |
| Survival | 91.6 | 72.5 | 91.8 | 75.9 |

By opponent band, 3.1's first hour against its last 80 minutes:

| Opponent APS | n | APS, first hour | Survival | n | APS, from 13:20 | Survival |
|---|---|---|---|---|---|---|
| 0-40 | 30 | 96.1 | 97.0 | 57 | 88.3 | 81.2 |
| 40-50 | 23 | 91.5 | 95.5 | 36 | 84.1 | 80.4 |
| 50-60 | 15 | 81.6 | 92.2 | 33 | 77.4 | 77.9 |
| 60-70 | 14 | 77.5 | 87.8 | 31 | 70.3 | 70.8 |
| 70-80 | 9 | 71.7 | 84.8 | 18 | 65.2 | 68.2 |
| 80-101 | 6 | 61.7 | 69.5 | 12 | 55.1 | 56.0 |

Every band loses 6 to 8 APS and 13 to 17 survival points. The plan's yardstick, survival
against opponents under 50 APS, is 96% in the first hour and 81% from 13:20; the R4 plan
called anything under 85% "the 08:30 effect again". The 25 worst-PBI rows of the complete
page are nearly all nano and micro bots (Samspin, Jammy, RedBull, VirginSteele,
SabreuseNano, Spike, Derp, NanoSatanMelee): bots that cost nothing to compute against and
that we beat 35/35 on every bench.

Head to head on the 213 opponents both versions fought, 3.1 is +0.6 APS over 3.0, within
noise; against opponents over 70 APS it is +1.4. R1 (tick-allowance learning, capped
round-end writes, warm-up tick) changed nothing measurable live. R2 and R3's effects are
visible only in the healthy hour, where PBI against bots over 60 APS is +6 to +17.

### 1.3 Where the bench has never looked

BENCH-4 varied the data directory, the CPU constant, background load and a cross-version
data directory, and never reproduced the drop (L-21). Every one of those passes, and every
bench run since S0, starts **a fresh JVM for each battle** (`Bench.runBattle` forks
`BattleRunner`, which opens one `RobocodeEngine`, runs one battle and exits), with the JVM's
default heap (a quarter of the machine), against at most 60 distinct opponents.

A RoboRumble client is the opposite on all three counts. `roborumble.RoboRumbleAtHome` runs
every battle of a session through one `RobocodeEngine` in one process; its start scripts cap
the heap (`-Xmx512M` in the shipped `roborumble.sh` and `.bat`); and a new participant's
priority battles run it against hundreds of distinct opponents in a row, each loaded through
its own robot class loader and then dropped. The signature we see live, healthy at first and
then degrading on a timescale of an hour or a few hundred Hadur battles, is what a
process-lifetime effect looks like: a growing heap, a class-loader or static leak, metaspace,
or collection pauses that only begin once the heap is full, which with a 30-turn
"has not performed any actions in a reasonable amount of time" disable kill a robot that
pauses for longer than the turn allowance 30 times running. It is also what a shared client
under load from other battles looks like, which the real client's data would show and the
bench cannot. Neither has been tested. Section 1.4 records the one measurement made for this
plan.

Nothing else in the data competes with this: the data directory was at quota within the
first dozen pairings on every client (a 3.0 profile is 8 to 17 KB, L-17), so it cannot
explain a change after the first hour; and PBI rules out the opponents.

### 1.4 A first measurement: one battle is small

Run for this plan: 3.2 against sample.Tracker, four consecutive 35-round battles, each in
the bench's usual fresh JVM but with the client's `-Xmx512M` and `-Xlog:gc*`. Each battle's
JVM did 28 to 34 young collections, the longest pause 3.6 ms, and the heap after the last
collection was 3 to 11 MB (14 to 37 MB committed). One Hadur battle is nothing like 512 MB,
so the cap cannot bite within a battle. If the heap is the cause, it is what accumulates
across battles in one process (RES-10 below), not what one battle needs; and if nothing
accumulates, the cause is on the client, not in the jar. BENCH-6's session is the test that
separates these; neither can be settled from a per-battle JVM.

## 2. The plan in one table

| Stage | What | Ships as | Expected | Gate |
|---|---|---|---|---|
| now | Enter 3.2 (RES-7 return fire, RES-8 health record) in the rumble as it is | 3.2 | 0 to +1 APS; RES-8 data from any client Leigh runs | 3.1's record is complete, so nothing is lost; read with BENCH-5 after 500 pairings (about 4 hours) |
| R5 | Rumble-safe memory, already implemented on the held branch: open the PR, rebase on master, merge | 3.3 | 0 to +1 APS; removes the data directory from the suspect list for good | the R4 plan's R5 gate, unchanged |
| R7 | The long session: reproduce the slide in one JVM over hundreds of opponents, find the cause, fix it | 3.4 | **+3 to +5 APS** (the whole gap) | BENCH-6 session of 300 battles holds survival above 95% against bots under 50 APS from first to last; then live survival above 90% over a full pass |
| R6 | Harder to hit (movement precision), only after R7 holds live | 3.5 | +0.3 to +0.8 APS, the margin inside the top 30 | the R4 plan's R6 gate, unchanged |

Order: R5 first because it is finished and its PR is a day's delay at most; R7 is the stage
that reaches the goal; R6 is margin. R5 and R7 can run in parallel if the Sonnet thread
prefers, since R7 starts with bench tooling and a download, not robot code.

## 3. Stages

### Now: enter 3.2

3.2 is released (v3.2, 2026-09-29) and differs from 3.1 only by RES-7 and RES-8. The R4 plan
held it back so 3.1's page could be read first; that page is complete. Leigh hosts the jar
(`/mnt/project-files/releases/v3.2/hadur2.Hadur_3.2.jar`) on Drive and replaces the 3.1
participant line; the 3.2 line goes into `docs/rumble-submission.md`. One version at a time.

What it tests: if RES-7 raises the degraded hours' APS without raising survival, the lost
rounds are spent in the guard (faulting ticks); if nothing changes, they are not. Either way
the client that runs 3.2 writes `health.hc`, which only matters on a client we can read:

**Ask of Leigh (optional, but the fastest route to the cause):** run a RoboRumble client
yourself for about three hours with 3.2 entered (Robocode 1.9.5.6's `roborumble.sh`, a fresh
install, default settings, the 1v1 game), then upload `robots/.data/hadur2/Hadur.data/`
(the whole directory, including `health.hc`), the client's console output, and the
`roborumble/temp` results it uploaded. RES-8 was built for this and no Claude session can
run the client. If the client's own battles show the slide, the cause is on the client and
R7 has its reproduction for free.

### R5: memory that cannot hurt (already implemented)

The branch `claude/project-thread-59oqoj` carries one commit, "R5: rumble-safe memory
(MEM-8, MEM-9, MEM-10, ADAPT-4)", on top of R4's pre-merge commits. It needs rebasing onto
master (the base is `efd1c6f`; master has the squash-merged R4c), `mvn -B verify`, the R5
gate from the R4 plan, and a PR. Nothing in the 3.1 data argues against it and MEM-10's
bounded I/O is one of the levers for R7 if the cause turns out to be on the data path.
Release as 3.3 once 3.2 has its 500 pairings, so each version is read on its own.

### R7: the long session

The stage that closes the gap. It has three parts; the second depends on what the first
finds.

**R7a, BENCH-6, reproduce it.** A session mode for the bench that runs the way a client
does:

1. One engine process for the whole session: a `SessionRunner` beside `BattleRunner` that
   opens one `RobocodeEngine`, runs the listed battles in order, and writes one result row
   per battle as it goes, so a session that dies still leaves its rows. The JVM runs with
   the client's heap cap (`-Xmx512M`, a session option) and GC logging (`-Xlog:gc*`), so
   the report has, per battle index: survival share, score share, rounds won, skipped
   turns, faults, whether the engine disabled the robot (the "has not performed any
   actions" line in the engine log), heap after the last collection, and the longest pause.
2. Opponents: a sample of the rumble, not the weak set. `data/rumble/parsed/2026-09-28T1929Z_robowiki_participants_jars.txt`
   has archive-mirror URLs for 1,028 participants; take 300 at random (fixed seed, listed in
   `hadur-bench/session-300.txt`), download them into `opponents/` (not committed), and
   run each once, 35 rounds, in list order, data directory kept throughout.
3. A control: the same 300-battle session with the robot replaced by a bot that cannot be
   the cause (sample.Tracker, or Hadur 2.2's jar from `/mnt/project-files/releases/v2.2/`),
   so that a slide the control shares is the engine's or the opponents' (a leaking
   opponent jar, say) and one only Hadur shows is ours.
4. Read: survival against opponents under 50 APS by blocks of 25 battles, the first block
   against the last, and heap after collection by block. Gate for "reproduced": the last
   100 battles' survival share against sub-50 bots is under 85% while the first 50 are over
   95%, or the engine disables Hadur at least once. A session of 300 battles at about 25
   seconds each is about two hours; run it with the Bash tool's own background mode (a
   plain `nohup` job dies with the tool call, see the R3 notes).

**R7b, the cause and the fix.** Decided by R7a, by bisecting the three differences between
the session and the old bench, each a one-line change to the session file:

| If the slide reproduces and goes away when | Then the cause is | And the fix is |
|---|---|---|
| the heap cap is lifted (`heap=none`) | our working set no longer fits beside the engine's and the opponent's after enough battles: a leak, or simply too much live data per battle | find what survives a battle (a heap histogram at battle 1 and battle 200: `jcmd GC.class_histogram`, run from the session), remove the static or registration that holds it, and cap the per-battle footprint (KD-tree and wave store sizes under RES-2; measured, not guessed) |
| each battle gets a fresh JVM (`fresh=true`) but the cap stays | something Hadur leaves in the process: a static in a JDK class, a logger, a `ThreadLocal`, a cached `ObjectStreamClass`, a lambda metafactory site | the same histogram, with `-verbose:class` to see whether robot class loaders are ever unloaded; fix the registration; a test that loads and drops the robot 50 times in one JVM and asserts the loader count stays flat |
| the data directory is wiped between battles | the data path after all: a store that gets slower or fails harder with hundreds of files or a full quota | R5's MEM-10 bounds it; if R5 is already merged the bisect says this did not happen |
| the control slides too | the engine, or a leaking opponent | nothing to fix in Hadur; a duress mode (RES-9 below) is the only lever, and it is worth shipping |
| nothing reproduces | the client itself (load, scheduling, another engine build) | Leigh's own client run above becomes the mandatory step; RES-9 ships regardless |

**R7c, RES-9, a duress mode, ships in every case.** Today a skipped turn sheds one
computation level for the round (TIME-2), and the deepest level still runs the KNN gun and
surf with halved k. Against a nano bot we die when we stop moving, not when we aim badly.
RES-9: after the engine has skipped three turns in a round, the core runs the rest of that
round at a level that allocates nothing and reads no tree: orbit at the DIST-1 distance with
the wall-smoothed random reversal the guard already has, head-on fire at power 1.0 whenever
the gun is cool, radar lock. It is the guard's RES-7 behaviour promoted to a policy the core
chooses, and `RoundStats` records how many ticks ran under it so the bench can see it. A
round in duress scores worse than a healthy one against a surfer and better than a dead
robot against anything.

**R7 requirements (to add at stage R7):**

| ID | Pattern | Requirement |
|---|---|---|
| BENCH-6 | Event | When a session file is given, the bench shall run its battles in order through one engine process with the file's heap cap, keeping the data directory, and shall report per battle its survival share, score share, skipped turns, faults, engine disables, heap after collection and longest pause. |
| BENCH-7 | Event | When a session file names a control robot, the bench shall run the same session with the control robot and report the two side by side by blocks of 25 battles. |
| RES-9 | Unwanted | If the engine has skipped three turns in a round, then the core shall run the rest of the round at a duress level that allocates no samples, reads no neighbour tree, orbits at the distance floor and fires head-on at power 1.0 whenever the gun is cool. |
| RES-10 | Ubiquitous | The robot shall leave no reference to its classes in the process after a battle, so that a session of 50 battles in one JVM unloads 50 robot class loaders. |

RES-10 is written now because it is testable now (a test that runs the adapter through 50
in-process engine battles against a sample bot with a small heap and asserts the loader
count with `-Xlog:class+unload` or a `WeakReference` to each loader clears after a `System.gc()`);
it is the one hypothesis that can be closed from the repo without the 300-bot session.

**Gate (R7):** BENCH-6 session of 300 battles against the sample, 3.4 jar, `-Xmx512M`:
survival share against sub-50 bots above 95% in the first block and in the last, no engine
disable, heap after collection flat across blocks within 20%; the control unchanged; the weak
set still 35/35 and the top 10 within noise of 3.2's release-gate bench. Live: a full pass
(500+ pairings) with every hour's survival against sub-50 bots above 90%, read with BENCH-5.
**Expected effect:** +3 to +5 APS, which is the whole way to the top 30 on 3.1's first hour
(85.7, rank 21). **Closes:** L-01, L-03 (as refuted or confirmed), #54 (tick budget) in part.

### R6: harder to hit (unchanged, still last)

As in [the R4 plan](rumble-climb-r4-r6-plan.md#r6-harder-to-hit-the-old-r4-deferred): MOVE-3
to MOVE-7, PHYS-1, WAVE-4, paired A/B against the then-current release on the top 10 plus
Shadow. Start it only after R7's live gate holds, because it is worth about a quarter of the
margin and nothing of the gap. In the healthy hour the only bots that beat 3.1 are the top
13 (PBI +6 to +17 against bots over 60 APS, so we already outperform our rank there); R6 is
for the margin inside the top 30, not for entry.

## 4. Reading the rumble now

- The rumble is faster than the R4 plan assumed: 3.1 got 512 pairings in 3 hours 15
  minutes, about 160 battles an hour for a new entry. A version's first read is an hour
  after entry, its full read the same afternoon. Save the BotDetails page twice: at about
  100 pairings and when the pass is complete, so each version has a healthy-hour reading
  and a complete one, like 3.1.
- Save the full Rankings page (no `limit`) on the same day; `data/tools/parse_rumble_page.py`
  parses both page kinds into `data/rumble/parsed/`.
- The health check for every version from now on: survival against sub-50 bots by hour.
  Above 90% in every hour with 20+ pairings is healthy; a fall across hours is the slide.
- One version at a time; the next version only after the current one's pass is complete.

## 5. What not to do

- Tune movement or the gun before R7's gate holds live. 3.1's healthy hour was already rank
  21; every point of tuning is lost twice over in the degraded hours.
- Read a 50-pairing rank as a result. 16th at 11:45 was the first hour's PBI, which every
  version has had so far.
- Add a bench condition that forks a JVM per battle and call it a client reproduction. The
  session is the condition.
- Ship R5, R7 and R6 in one version. Each gets its own pass so its live effect is its own.
