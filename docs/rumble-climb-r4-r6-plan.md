# Rumble climb, R4 to R6: plan

Planning document for the next stages of the RoboRumble 1v1 climb, written after the
top-50 bench (PR #63) and before any R4 code. It replaces the R4 and R5 sections of the
original climb plan (the "Hadur Rumble Climb" artifact) and adds R6. R0 to R3 are merged
(PRs #59 to #62) and are not changed here.

**Status: final; R3.5 and R4 done, R5 and R6 carried into [the top-30 plan](rumble-climb-top30-plan.md) (2026-09-30), which adds R7 after 3.1's live pass showed the same slide as 3.0.** A Sonnet thread implements it stage by stage, one PR per stage, merged
as needed, with the usual rigour (EARS rows in `docs/requirements.md`, a tagged Cucumber
scenario per ID, unit and jqwik tests, ArchUnit unchanged, replay fixtures re-recorded
when play changes, deliberate `DuelIdentityTest` re-pins named in the PR,
`hadur.climb.stage` bumped in the root pom).

Goal (Leigh, 2026-09-28): **top 40 in the RoboRumble 1v1**, grown slowly. Hadur 3.0 is 64th
at 81.57 APS; rank 40 (jk.mini.CunobelinDC 1.2) is 83.07 and rank 30 is 84.23. We need
about +1.5 APS, and +2.0 to be safely inside it.

## 1. What the data says

### 1.1 The rating fell off a cliff at about 08:30 UTC on 2026-09-28

Leigh's saved RatingDetails page for 3.0 (507 pairings, 03:38 to 14:10 UTC, mostly one
battle each; rows in `data/rumble/parsed/2026-09-28T1724Z_roborumble_botdetails_hadur2.Hadur_3.0.csv`) splits cleanly by the time each pairing was fought. The opponents on each side
of the split are equally strong (mean opponent APS 48 before, 49 after), yet:

| Fought | Pairings | Our APS | Our survival | Mean PBI |
|---|---|---|---|---|
| before 08:30 UTC | 268 | **85.5** | 92.6% | +5.6 |
| from 08:30 UTC | 239 | **77.2** | 71.2% | -6.4 |

By opponent strength (opponent APS band), the same split:

| Opponent APS | n before | APS before | Survival before | n after | APS after | Survival after |
|---|---|---|---|---|---|---|
| 0-40 | 72 | 96.2 | 96.7 | 84 | 86.0 | 76.6 |
| 40-50 | 55 | 89.9 | 94.1 | 48 | 79.4 | 73.2 |
| 50-60 | 55 | 85.2 | 93.6 | 35 | 76.7 | 75.1 |
| 60-70 | 48 | 79.3 | 90.6 | 38 | 70.8 | 70.1 |
| 70-80 | 22 | 71.8 | 82.6 | 18 | 64.1 | 65.9 |
| 80-101 | 16 | 60.6 | 68.2 | 16 | 54.9 | 56.1 |

Every band lost 6 to 10 APS and about a fifth of its rounds at the same moment. Hourly,
survival is 90 to 96% from 03:00 to 07:59, 81.6% in the 08:00 hour, then 70 to 75% every
hour after. 85.5 APS would be about rank 21. If the pairings fought after 08:30 had scored
what the same opponent bands scored before it, 3.0's APS would be about **+4.3 higher**
(85.9). That single effect is worth three times the gap to rank 40.

### 1.2 The bench cannot reproduce it

The worst-PBI rows are nano and mini bots that win 30 to 40% of rounds against us live
(RobotMarco.MarcoV, opponent APS 11: we survive 23 of 35 rounds). Benched locally
(2026-09-29, Robocode 1.9.5.6, 35 rounds, 12 of the worst rows):

| Run | Jar | Condition | Result |
|---|---|---|---|
| cold, 2 seeds, 12 bots | master (post-R3) | bench default (cpu constant 3.1 ms) | 24 of 24 battles 35/35, share 88 to 100% |
| cold, 2 seeds, 4 bots | released 3.0 jar | bench default | 8 of 8 battles 35/35 |
| cold, 2 seeds, 4 bots | released 3.0 jar | cpu constant forced to 1.0 ms (30 to 66 skipped turns a battle) | 8 of 8 battles 35/35 |
| warm, one shared data directory, 12 bots twice | released 3.0 jar | profiles kept across opponents, as a rumble client does | 23 of 24 battles 35/35, the other 33/35 |
| cold, 1 seed, 4 bots | released 3.0 jar | cpu constant 0.3 ms (55 to 68 skipped turns a battle) | 4 of 4 battles 35/35 |
| warm, the same shared directory, 20 new bots then the 12 again | released 3.0 jar | directory held at quota (161 KB, seeds evicted in 29 of 32 battles) | 32 of 32 battles 35/35, 0 memory failures |

So the lost rounds are not strategy: the same jar wins every round locally against the
same bots, on a slow CPU constant and with a full shared data directory. Something that
started on the rumble side around 08:30 (most likely a client with a different engine,
JVM or load, or a data-directory state the bench has not built yet, such as one left by
2.2) makes Hadur lose about one round in five against anyone.

### 1.3 The top-50 bench

Post-R3 master, cold, 35 rounds x 5 seeds, 48 of the top 50 (`docs/bench/roborumble-top50.md`,
PR #63): mean share 58.5%, beating 40 of 48. The losses are the very top: BeepBoop 17.2%,
ScalarR 22.6%, DrussGT 33.7%, Diamond 34.5%, Wavelet 39.5%, Firestarter 45.4%, Gilgalad
49.0%, Neuromancer 49.7%. Against those eight their hit rate on us is 8.4 to 10.4% (7 to 8%
against ranks 20 to 50) and ours on them 5.9 to 10.5%.

Two readings matter for planning:

- The top 13 are about 1% of the ~1,216 pairings. Lifting all eight losses by 10 points is
  worth about +0.07 APS. Movement tuned against them cannot reach top 40 on its own.
- R3's gun did not show up at the top: the ten bots of the old top-10 bench average 44.8% here
  against 45.1% for 3.0 (different host load, 4 benches in parallel, so indicative only).
  R3's formal gate was never run (see `docs/requirements.md`, R3 notes).

Where live and bench overlap (20 of the top 50 have a live 3.0 pairing), live runs about 5
points under the bench, in line with the lost rounds above.

### 1.4 Nothing since 3.0 has reached the rumble

R1 (client reliability), R2 (full share vs weak bots) and R3 (anti-surfer gun) are merged
but unreleased, and none of their bench gates was run. `hadur-bench/rumble-sample.txt`
still has only the top-30 stratum, so BENCH-1's APS estimate cannot be computed yet.
The rumble is the only place the 08:30 effect shows, so the plan ships early and reads
the live rating at every stage.

## 2. The plan in one table

| Stage | What | Ships as | Expected | Gate |
|---|---|---|---|---|
| R3.5 | Release R1..R3 as 3.1 so live data starts accruing on the new code | 3.1 | 0 to +4 APS (if R1 happens to fix the 08:30 effect) | `mvn -B verify`, 12-bot weak bench 35/35, no top-50 regression beyond noise |
| R4 | Find and stop the lost rounds: rumble-condition bench, live-rating tooling, a fallback that never stops fighting | 3.2 | +2 to +4 APS | the post-08:30 survival drop reproduced and fixed, or live survival back above 90% vs opponents under 50 APS |
| R5 | Memory that cannot hurt in the rumble: small stats-only profiles, per-release data, bounded I/O | 3.2 (with R4) or 3.3 | 0 to +1 APS, and removes a suspect | warm shared-directory bench over 60 opponents not below cold; directory under 180 KB; 0 memory failures |
| R6 | Harder to hit: the movement precision work (old R4), only after 3.2 settles | 3.4 | +0.3 to +0.8 APS | paired A/B vs 3.2 on the top 10 plus Shadow, 10 seeds: their hit rate down at least 0.8 points |

Order matters: R4 before R6 because R4 is worth an order of magnitude more APS; R5 goes with
R4 if R4 points at the data directory, otherwise straight after.

## 3. Stages

### R3.5: ship what is merged (release step, no new requirements)

Why: the 08:30 effect only exists live. R1 already changed the things most likely to
interact with a client (tick allowance learning, round-end writes, warm-up tick). Shipping
it now costs nothing and turns the next day of rumble battles into a test.

1. `robot.version=3.1` in `hadur-robot/src/main/resources/hadur2/Hadur.properties` and
   `HadurRecorder.properties`; the jar becomes `hadur2.Hadur_3.1.jar`. Update the
   `--robot-jar` / `--robot` defaults in `hadur-bench` and its README.
2. `mvn -B verify` from the repo root.
3. Bench: `hadur-bench/weak-pbi.txt` (the 12 bots of section 6; jars go in `opponents/`,
   not committed), cold, 35 rounds x 2 seeds.
   Gate: every battle 35/35. Top-10 set, cold, 35 x 5: no opponent more than 5 points under
   the top-50 bench's figure.
4. Tag `v3.1` via the release workflow (`release.yml`, workflow_dispatch; Actions works since
   the repo went public), write `docs/releases/v3.1.md`, and add the 3.1 entry to
   `docs/rumble-submission.md` (3.0 moves to "Previous entry").
5. Hand off to Leigh: upload the jar to Drive, replace the 3.0 line on both participants
   pages. Only one Hadur version is entered at a time.
6. After at least 300 pairings, Leigh saves the 3.1 BotDetails page (as for 3.0) into the
   project; it is archived under `data/rumble/pages/` and R4's tooling reads it (BENCH-5).

### R4: stop losing rounds we should win

Targets: the whole population, and above all opponents under 60 APS, where live survival is
71 to 77% after 08:30 against 94 to 97% before it and 100% on the bench.

**R4a, measure live conditions (tooling first).**

- **BENCH-5**, a `LiveDetails` reader in `hadur-bench` (Java, like the rest of the bench):
  takes a saved LiteRumble BotDetails `.mht` (MIME, HTML table: rank, name, APS, APS CI,
  NPP, survival, KNNPBI, battles, latest battle, opponent APS, opponent survival) and writes
  a markdown report: APS and survival by opponent-APS band, by UTC hour of the latest battle,
  a before/after split at a given time, and the pairings also in a given bench report with
  live minus bench. It reproduces section 1.1's tables from the 3.0 page, which is the test
  fixture (the page Leigh saved is committed as
  `data/rumble/pages/2026-09-28T1724Z_roborumble_botdetails_hadur2.Hadur_3.0.mht`; copy it into
  `hadur-bench/src/test/resources/` so the build never reads `data/`). Its parsed rows are
  `data/rumble/parsed/2026-09-28T1724Z_roborumble_botdetails_hadur2.Hadur_3.0.csv`; see
  `data/README.md` for where later pages go.
- Ask Leigh (one line in the stage's first reply, not blocking) whether LiteRumble shows
  who uploaded each battle, or the client version, for a pairing; if it does, the uploader of
  post-08:30 battles is the first lead.

**R4b, reproduce under rumble-client conditions.**

- **BENCH-4**, `--client FILE` for `hadur-bench`: a file of conditions, each applied to one
  bench pass. Conditions to support:
  - `data=shared`: never wipe `robots/.data` between opponents or battles (the rumble
    client's reality); `data=prefill:DIR` copies a directory into `robots/.data/hadur2/Hadur.data/`
    first. Prefill sets to build: 2.2-written profiles (run the 2.2 jar warm over 20
    opponents), 3.0-written profiles, and a mix, each at 195 KB.
  - `cpu=NANOS`: write `robocode.cpu.constant` before the pass (the bench already reads it
    back into the report).
  - `load=N`: run N busy-loop threads beside the battle, to mimic a client running other work
    or several battles at once.
  - `engine=VERSION`: run on another Robocode release fetched from Maven Central, at least
    1.9.3.0 (Hadur's declared `robocode.version`) and 1.9.4.x, beside the default 1.9.5.6.
  - `java=PATH`: a different JVM for the battle process (Java 11 and 17 at least; REL-1 keeps
    the jar Java 11 compatible).
- Run the 12-bot weak set (and the 20 more in section 6) through each condition with the 3.0
  release jar first, then 3.1. The condition that drops survival under 90% is the cause.
  Record every pass in `docs/bench/r4-client-conditions.md`, including the null results.

**R4c, fix, by what R4b found.** Decision tree:

- A data-directory state (shared, prefilled, cross-version): R5 is the fix; ship R4 and R5
  together as 3.2.
- A slow or loaded client: make the tick budget act before the engine skips rather than
  after (TIME-1 sheds at 70% of the allowance and TIME-3 learns only from the first skip):
  shed at 50% of the allowance for the first 100 ticks of each round, and measure the first
  scan's cost (profile load, seed replay) against the allowance, splitting it across ticks
  if it exceeds it.
- An engine or JVM difference: fix the incompatibility and add that engine or JVM to CI's
  `verify` as a smoke battle.
- Not reproduced after the whole matrix: ship RES-7 and the telemetry below as 3.2 anyway,
  and read the live rating with BENCH-5 after 300 pairings. Say so plainly in the PR.

In every branch, ship these two, because they cap the damage of any unknown fault:

- **RES-7**: today the guard's safe orders hold fire (RES-1), so a core that throws on every
  tick loses the round to anything. After three faulting ticks in a round, the guard shall
  also fire power 1.0 head-on at the last scan's bearing whenever the gun is cool, and keep
  orbiting. It holds no state beyond what the guard already keeps (last bearing, fault
  count), so it cannot fail with the core.
- **RES-8**: at battle end, the adapter shall write one small `health.hc` record (a few
  dozen bytes, overwritten each battle, inside the quota) with the battle's rounds, rounds
  survived, faults, skipped turns, memory failures and the learned tick allowance. It does
  not reach the rumble server, but it makes any client-side reproduction (including one
  Leigh can run) self-describing, and the bench reports it.

**R4 requirements (to add at stage R4):**

| ID | Pattern | Requirement |
|---|---|---|
| BENCH-4 | Event | When a client-conditions file is given, the bench shall run each listed condition (shared or prefilled data directory, CPU constant, background load, engine version, JVM) as its own pass and report survival and skipped turns per opponent and per condition. |
| BENCH-5 | Event | When a saved LiteRumble BotDetails page is given, the bench shall report APS and survival by opponent-APS band and by UTC hour, a before/after split at a given time, and live minus bench share for every opponent in a given bench report. |
| RES-7 | Unwanted | If the core has faulted on three ticks of a round, then the guard's safe orders shall also fire power 1.0 at the enemy's last scanned bearing whenever the gun is cool. |
| RES-8 | Event | When a battle ends, the adapter shall write a battle-health record of at most 64 bytes with rounds, rounds survived, faults, skipped turns, memory failures and the learned tick allowance. |

**Gate (R4):** either (a) a condition in `r4-client-conditions.md` reproduces survival under
90% against the weak set with 3.0, and with the fix every battle in that condition is 35/35;
or (b) no condition reproduces it and the stage says so. Plus, in both cases: `mvn -B verify`
green, weak set 35/35 at the default condition, top-10 set no worse than the top-50 bench
beyond its interval. After release, BENCH-5 on the 3.2 page (300+ pairings): survival at
least 90% against opponents under 50 APS in every hour with 20 or more pairings.

**Expected effect:** +2 to +4 APS if the cause is found or R1 already fixed it; that alone
covers top 40. **Closes:** #48 if the round-end write turns out to be involved.

### R5: memory that cannot hurt

Warm play has shown no gain over cold against Shadow in four stages (S3 to S6), most rumble
pairings are first meetings on a given client, and the quota holds about 14 profiles at the
~13 KB a 3.0 profile takes after one battle (measured: 12 weak bots, 8.5 to 16.8 KB each,
149 KB total). Seeds are nearly all of that. The data directory is also shared by every
Hadur version on a client (`robots/.data/hadur2/Hadur.data/`), so 2.2, 3.0 and 3.1 can read
and write the same files.

1. **MEM-8**: profiles are stats-only by default (tiers, hit-rate estimates, gun ratings,
   opening, recorded shares: the fields ADAPT-1/2 and the opening book use), target at most
   1 KB each, about 180 opponents in the quota. Seeds are kept only for opponents we have
   met at least twice and scored under 60% against, at most 5 such profiles, least recently
   fought evicted first.
2. **MEM-9**: files live in a subdirectory named for the release's profile-format version
   (`v<n>/`), so a different Hadur version on the same client never reads or overwrites them.
   On first run a release deletes other versions' subdirectories only if the quota is short,
   oldest first. Keep MEM-7's codec downgrade for the one case it still serves (a newer
   release reading an older subdirectory's stats once, to carry tiers forward).
3. **MEM-10**: per battle, the store does at most one read and two writes (the round-end
   stats checkpoint of TIME-4 and the battle-end save) of at most 2 KB each, except the
   seed profiles of item 1.
4. **ADAPT-4**: when a profile with a known gun tier and no seeds loads, the opening book
   applies from the first tick without replaying samples (today's path already mostly does;
   pin it with a test).

**R5 requirements (to add at stage R5):**

| ID | Pattern | Requirement |
|---|---|---|
| MEM-8 | Ubiquitous | The store shall keep seeds only for at most five opponents met at least twice with a recorded score share under 60%, and shall keep every other profile as statistics of at most 1 KB. |
| MEM-9 | Ubiquitous | The store shall keep its files under a subdirectory named for the profile-format version and shall not read or write another version's subdirectory except to carry tiers forward once. |
| MEM-10 | Ubiquitous | The adapter shall do at most one profile read and two profile writes per battle, each at most 2 KB, apart from MEM-8's seeded profiles. |
| ADAPT-4 | Event | When a profile with a known gun tier and no seeds loads, the core shall apply the opening book's choices from the first tick without replaying samples. |

**Gate (R5):** BENCH-4 `data=shared` over 60 distinct opponents (the weak set, the 20 more,
the top 30), then the weak set again: every weak battle 35/35; `robots/.data/hadur2` under
180 KB at the end; 0 memory failures; warm top-10 not below cold top-10 by more than 1
point. **Expected effect:** 0 to +1 APS directly; it also removes the most likely
data-directory causes of R4. **Closes:** the memory half of #49, #45 (hand-off) is unaffected.

### R6: harder to hit (the old R4, deferred)

Only after 3.2 has 1,000+ pairings and BENCH-5 shows the 08:30 effect gone. Targets: ranks 1
to 50, where their hit rate is 7 to 10.4% against us. Each item is a separate commit with its
own paired A/B.

- **MOVE-3**, bin-wise shadows. Today `SurfMover.waveDanger` multiplies the whole wave's
  danger by `1 - shadowedFraction(intersection)`, as if danger were uniform across our
  intersection. Instead, integrate the danger kernel over the unshadowed part of the
  intersection only (certain shadow counts 0, possible shadow counts half).
- **MOVE-4**, integrate, don't sample. `MoveController.getDangerScore` scores the kernel at
  the intersection's centre with the bandwidth as the scale. Score the kernel's mass inside
  the precise intersection's firing-angle interval, so a wide intersection close in is
  charged for every angle that hits.
- **MOVE-5**, the flattener earlier: the flattener views switch on at a padded hit rate of
  4.5% instead of 5.9% (`MoveController.initSurfViews`).
- **MOVE-6**, MOVE-2's baseline from the same battle phase (#55): compare the live window
  with the profile's rate from wave 100 on, not its whole-battle average.
- **MOVE-7**, the neighbour cache is discarded for every wave whose surf index changed, not
  only when wave 0 changes (#50 item 3).
- **PHYS-1**, the predictor stops a robot at a wall as the engine does (#50 item 8).
- **WAVE-4**, updating a movement wave's bullet power recomputes its wall distances (#50
  item 7).
- Check #50 item 4 (NaN danger on an exact feature match, `scanWeight` divides by
  `sqrt(0)`) and fix it first if still present.

**R6 requirements (to add at stage R6):**

| ID | Pattern | Requirement |
|---|---|---|
| MOVE-3 | Ubiquitous | Movement shall score a wave's danger only over the part of the intersection not in a certain bullet shadow, at half weight inside a possible shadow. |
| MOVE-4 | Ubiquitous | Movement shall score a wave's danger as the danger density integrated over the firing angles of the precise intersection. |
| MOVE-5 | State | While the enemy's normalised hit rate less its margin exceeds 4.5%, movement shall enable the flattener views. |
| MOVE-6 | State | While a profile baseline exists, MOVE-2 shall compare the live hit rate with the profile's rate over the same battle phase (from the 100th firing wave). |
| MOVE-7 | Event | When a wave in flight is removed or reordered, movement shall discard the neighbour cache of every wave whose surf index changed. |
| PHYS-1 | Ubiquitous | The movement predictor shall stop a predicted robot at a wall as the engine does. |
| WAVE-4 | Event | When a movement wave's bullet power is updated, its wall distances shall be recomputed. |

**Gate (R6):** paired A/B (BENCH-2) vs 3.2, cold, 10 seeds, top 10 plus Shadow: their hit
rate down at least 0.8 points on average; Shadow at least 57.4%; top-10 mean up with the
interval excluding 0; tick p95 unchanged; weak set still 35/35. **Expected effect:** +0.3 to
+0.8 APS. **Closes:** #55, #50 items 3, 4, 7, 8.

## 4. Releasing and reading the rumble

- One Hadur version entered at a time. Each release: version bump in both `.properties`
  files, `mvn -B verify`, REL-1's Java 11 check, the release workflow, a SHA-256 and release
  notes, the Drive link from Leigh, the entry recorded in `docs/rumble-submission.md`.
- Read a new version's rating with BENCH-5 after 300 pairings (a trend), and treat it as
  settled at 1,000+. Log APS, rank, survival, pairings and the hourly survival table in
  `docs/bench/rumble-<version>.md`.
- Any hour with 20+ pairings and survival under 85% against opponents under 50 APS is the
  08:30 effect again: stop tuning and go back to R4b with that time window.
- Update the strategy evolution Claude Doc at each stage, as for S0..S7 and R0..R3.

## 5. What not to do

- Tune movement or the gun against the top 10 while a fifth of all rounds are lost to
  something else. The top 13 are about 1% of the APS.
- Read a bench mean from 4 parallel processes against a solo one; paired seeds, same host.
- Treat the bench's 35/35 against weak bots as proof the rumble is fine. It was 35/35 while
  the rumble lost a round in five.
- Ship a profile format a previous release can misread (MEM-9 ends the sharing instead).

## 6. Reference: the weak set and the extra 20

Twelve worst-PBI weak rows from the 3.0 page (`weak-pbi.txt`), all on the archive mirror
(`https://robocode-archive.strangeautomata.com/robots/<jar>`):

```
RobotMarco.MarcoV 0.1 | weak | RobotMarco.MarcoV_0.1.jar
abud.ThirdRobo 1.0 | weak | abud.ThirdRobo_1.0.jar
bons.NanoStalker 1.2 | weak | bons.NanoStalker_1.2.jar
dittman.BlindSquirl Retired | weak | dittman.BlindSquirl_Retired.jar
hlavko.nano.Ringo 2.0 | weak | hlavko.nano.Ringo_2.0.jar
jep.nano.Hawkwing 0.4.1 | weak | jep.nano.Hawkwing_0.4.1.jar
kawigi.sbf.Barracuda 1.0 | weak | kawigi.sbf.Barracuda_1.0.jar
nexus.Two 0.2 | weak | nexus.Two_0.2.jar
pa.Improved 1.1 | weak | pa.Improved_1.1.jar
quietus.NarrowRadar 0.1 | weak | quietus.NarrowRadar_0.1.jar
racso.Crono 1.0 | weak | racso.Crono_1.0.jar
zzx.Gron 1.14 | weak | zzx.Gron_1.14.jar
```

Twenty more (next-worst PBI, opponent APS under 50), used to push a shared data directory
past quota:

```
caimano.Furia_Ceca 0.22 | weak | caimano.Furia_Ceca_0.22.jar
ahf.Acero 1.0 | weak | ahf.Acero_1.0.jar
bigpete.Stewie 1.0 | weak | bigpete.Stewie_1.0.jar
sgp.SleepingGoat 1.1 | weak | sgp.SleepingGoat_1.1.jar
Fenix.FenixTrack 1.0 | weak | Fenix.FenixTrack_1.0.jar
com.arsenic.NewTest 1.0 | weak | com.arsenic.NewTest_1.0.jar
tobe.mini.Charon 0.9 | weak | tobe.mini.Charon_0.9.jar
pa3k.Manta 1.20 | weak | pa3k.Manta_1.20.jar
TCMI.nano.Copper 0.2 | weak | TCMI.nano.Copper_0.2.jar
baal.nano.N 1.42 | weak | baal.nano.N_1.42.jar
kinsen.nano.Senticous 1.0 | weak | kinsen.nano.Senticous_1.0.jar
sul.BlueBot 1.0 | weak | sul.BlueBot_1.0.jar
lion.Kresnanano 1.0 | weak | lion.Kresnanano_1.0.jar
ntw.Sigsys 1.6 | weak | ntw.Sigsys_1.6.jar
ICS4U1.Patrick_White_Schrodinger 1.1 | weak | ICS4U1.Patrick_White_Schrodinger_1.1.jar
kawigi.sbf.FloodNano 1.2 | weak | kawigi.sbf.FloodNano_1.2.jar
stelo.FretNano 1.1 | weak | stelo.FretNano_1.1.jar
romz.robot.circular.WildRabbit 0.9.6 | weak | romz.robot.circular.WildRabbit_0.9.6.jar
zzx.Ignohis 8.0 | weak | zzx.Ignohis_8.0.jar
jep.Terrible 0.4.1 | weak | jep.Terrible_0.4.1.jar
```

Not tried yet, and so R4b's first candidates: another Robocode engine release (clients are
not all on 1.9.5.6), another JVM, a data directory prefilled by 2.2 (which shares
`robots/.data/hadur2/Hadur.data/` with 3.0 on the same client), and background CPU load.
The bench copy used for the shared-directory runs only skipped `wipeData()` when an
environment variable was set; BENCH-4 makes that a real option.
