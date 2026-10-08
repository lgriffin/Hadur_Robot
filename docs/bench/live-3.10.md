# 3.10 live (2026-10-08 12:38 UTC), and why the bench and the ladder disagree

Pages saved by Leigh at 12:38 UTC: Hadur 3.10's BotDetails page and the 1v1 rankings, archived
in `data/rumble/pages/2026-10-08T1238Z_*` and parsed to `data/rumble/parsed/2026-10-08T1238Z_*`.
The pass is complete: 1,215 of 1,215 pairings, 1,759 battles, the first at 10:02 UTC.

| Release | APS | Rank | Survival | Battles |
|---|---|---|---|---|
| 3.10 | **86.42** ± 0.20 | **20th** | 93.94 | 1,759 |
| 3.9 | 87.15 ± 0.19 | 13th | 95.04 | 1,885 |

Leigh asked three things after the drop: where the 0.73 went, why the bench on the PC and the
live ladder disagree, and a class for every opponent. The tools are `data/tools/live_passes.py`
(BENCH-80 to BENCH-82); the per-opponent table is [`opponents-3.10.tsv`](opponents-3.10.tsv).

## 1. Where the gap came from

3.10 is 3.9 plus 83 shield-list entries. An entry names one robot by its exact version, so
against the other 1,118 opponents 3.10 runs 3.9's code byte for byte. That makes the two passes
a natural experiment: off the list, any difference is the ladder, not the robot.

```
python3 data/tools/live_passes.py drift <3.10 page> <3.9 page> --shield-java hadur-robot/src/main/java/hadur2/ShieldListData.java
```

| Opponents | Pairings | 3.10 minus 3.9 per pairing | Survival | APS |
|---|---:|---:|---:|---:|
| On the shield list (code changed) | 97 | **+6.43** ± 2.05 | +2.6 | **+0.51** |
| Off the list (same code) | 1,118 | **-1.35** ± 0.34 | -1.4 | **-1.25** |
| All | 1,215 | -0.73 | -1.1 | -0.73 |

- **The change worked.** The list added +0.51 APS live (+7.07 a pairing on the 83 new entries).
  The gate projected +0.78, so it delivered about two thirds of the bench's estimate. Corrected
  for the pass offset below, it is closer to +0.6 (inferred).
- **The same code lost 1.25 APS between passes.** The interval excludes zero by four standard
  errors, so it is not battle noise: the 3.10 pass ran under worse conditions than the 3.9 pass.
  The page's own ± 0.20 cannot show this, because it treats every battle as independent, while a
  pass shares its clients, their load and their hours.
- **It is a tail of bad battles, not a uniform shift.** 185 untouched pairings fell more than 5
  points against 77 that rose; the falls cost 1.54 APS and the middle is level (-0.24).

### Collapses: the 3.9 pass was the clean one

A collapse is a single-battle pairing 12 or more points under the median of Hadur's other
passes against the same bot (`live_passes.py collapses`, BENCH-81), over the 1,204 opponents
present in all five full passes:

| Pass | Collapses | Single-battle pairings | Rate |
|---|---:|---:|---:|
| 3.4 | 22 | 859 | 2.6% |
| 3.8 | 15 | 845 | 1.8% |
| 3.8.5 | 14 | 834 | 1.7% |
| **3.9** | **0** | 684 | **0.0%** |
| 3.10 | 26 | 768 | 3.4% |

Zero in 684 is the outlier. At the other passes' rate (77 in 3,306, 2.3%) that count has a
chance of about one in ten million. The 3.10 collapses hit every kind of bot (a nano mirror bot at 22.7
against 96 in every other pass, Saguaro, Dookious, Komarious, Epeeist, pi.Dark) and are spread
over the whole pass, the way a struggling client would spread them, not the way a code change
would. So the 13th place was 3.9 on a clean pass, and the 20th is 3.10 on a rough one.

What makes a pass rough is inferred, not measured, but the PC already has the experiment.
`2026-10-06_hadur-leak38-step1` and its `-loaded` twin ran the same jars on the same 31 bots,
quiet and under extra load:

| Same jars, 248 battles | Score share | Skipped turns a battle | Battles 12+ under the quiet median |
|---|---:|---:|---:|
| Quiet | 88.22 | 12.0 | 1 |
| Loaded | 85.62 | 41.1 | 12 |

Load costs 2.6 points and multiplies collapses twelvefold, the same signature as the 3.10 pass.
Hadur is a heavy robot, so a client that is busy elsewhere costs it more than the light bots it
plays. Leigh's own client shards upload to this ladder, and the shield confirmation run on the
PC this morning recorded another Robocode JVM beside it (`2026-10-08_shield-confirm.md`, CAUTION).

### The leak-38 mystery resolves

Issue #151 was opened because on `leak-38.txt` live said 3.9 minus 3.8.5 was **+2.14** while the
PC bench said **-0.02**. On the same 31 unlisted bots:

| Live, same 31 bots | Per pairing |
|---|---:|
| 3.9 minus 3.8.5 | +2.08 ± 1.07 |
| 3.10 minus 3.9 (same code) | -1.34 ± 1.14 |
| **3.10 minus 3.8.5** | **+0.74 ± 1.72** |

Measured on a typical pass instead of the clean one, the live difference is what the bench said.

## 2. Why the bench and the ladder disagree

Two causes, one in the bench and one in the ladder.

### A bench defect: 11 opponents crippled on the PC

Every PC bench run since 2026-10-06 logged, for 11 opponents, a denial like this:

```
Preventing pez.frankie.Frankie 0.9.6.1 from access: ("java.io.FilePermission"
"D:\code\Hadur_Robot\hadur-bench\target\classes\META-INF\services\java.time.zone.ZoneRulesProvider"
"read"). You may only read files in your own root package directory.
```

When one of these robots first needs the time-zone rules (Frankie does when it zips its saved
pattern-matcher movie), the JDK looks up `META-INF/services` on every class-path entry. The
bench's battle JVM has `hadur-bench/target/classes`, a directory, on its class path, so the
lookup is a file read from the robot's thread. Robocode's security manager refuses it, logs it,
and punishes the robot by draining its energy (`HostingRobotProxy.punishSecurityViolation` calls
`drainEnergy()`). The robot stops playing. A RoboRumble client has jars only on its class path
and never shows it. In this Linux container the lookup is not triggered, and a 35-round battle
against Frankie scored 80.2%, against the PC bench's 98.9% and live 71.

| Opponent | Rank | PC bench battles | PC bench | Live (median of passes) | Peers' median |
|---|---:|---:|---:|---:|---:|
| ne.Chimera 1.2 | 562 | 304 | 97.9 | 81.5 | 88.0 |
| pez.frankie.Frankie 0.9.6.1 | 287 | 32 | 98.9 | 71.2 | 76.0 |
| pez.mini.VertiLeach 0.4.0 | 219 | 48 | 98.7 | 75.2 | 77.7 |
| cx.Princess 1.0 | 207 | 32 | 95.3 | 68.3 | 69.0 |
| apv.LauLectrik 1.2 | 363 | 32 | 99.3 | 77.5 | 78.0 |
| cbot.agile.Nibbler 0.2 | 298 | 16 | 98.5 | 75.7 | 75.3 |
| wiki.mini.Griffon 0.1 | 255 | 16 | 99.2 | 80.5 | 81.5 |
| bayen.nut.Squirrel 1.621 | 176 | 32 | 89.0 | 75.5 | 76.8 |
| Krabb.krabby.Krabby 1.18b (on the 3.10 list) | 362 | 64 | 88.8 | 80.8 | 84.7 |
| apv.TheBrainPi 0.5fix | 427 | 40 | 75.7 | 74.8 | 75.5 |
| xander.cat.XanderCat 12.9 (top-20 set) | 9 | 353 | 56.7 | 59.2 | 54.9 |

989 battle rows in 38 run files are affected, every battle against these 11. A paired A/B
difference against a crippled bot reads about zero whichever build is better, so the defect
mostly diluted gates toward "level" rather than inventing gains. Krabby's list entry was judged
on a crippled Krabby; live it rose from 74.8 to 80.8 with shield mode on, so the entry stands.

**Fixed in this change.** Every battle child now loads those providers in its own thread before
the engine starts (`JdkWarmup`, BENCH-83), and a battle whose errors carry such a denial is no
longer trusted, in the bench and in `analyse.py` (BENCH-84). `JdkWarmupTest` reproduces the
denied read in a child JVM without the warm-up and shows it gone with it. Because the trigger
depends on the host (it never fires here), the check that matters is a short run on the PC; see
the proposal.

### The ladder moves more than its ± says

With the 11 removed, the bench agrees with the live ladder well. Over the 335 unlisted
opponents the PC bench has run with 3.9 or 3.10 (identical code there):

| Bench (3.9/3.10 builds) against | Correlation | Live minus bench | Off by more than 10 |
|---|---:|---:|---:|
| The 3.9 pass | 0.94 | -0.52 ± 0.43 | 2% |
| The 3.10 pass | 0.92 | -1.66 ± 0.53 | 7% |

Against a clean pass the bench is within half a point. Against a rough one, live sits more than
a point lower, with three times as many big misses: the collapses. Earlier "bench misses" read
the same way: 3.8's -1.5 and 3.9's +2.3 were both measured against a single pass each.

On the shield list the bench is optimistic: it projected +11.73 a pairing on the 82 listed bots
it ran, live gave +7.56 (+8.9 with the pass offset removed). Shield mode depends on exact bullet
timing, so it plausibly suffers more on a loaded client (inferred).

### What LiteRumble does that the bench now mirrors, and what it does not

Read from the source (`jkflying/literumble`, `HandleQueuedResults.py`, `structures.py`, commit
c8adda6). The scoring was already reproduced in PR #152 (`literumble.py`, header exact to two
decimals). New here:

- **A pass is not a sample of independent battles.** Pairing APS is a running mean of the
  pairing's battles; the bot's ± sums each pairing's shrunk variance (prior 16, weight 3). It
  has no term for a pass-wide offset, which is the dominant error between two passes.
- **Battles keep coming after a full pass.** Once every pairing exists, priority battles go to
  bots weighted by their ± and, within a bot, to pairings whose next battle cuts variance most
  (the lowest battle counts first, tenfold weight where the interval straddles 50). The 768
  single-battle pairings of 3.10 will each get second battles, so a collapse is halved and the
  page should drift up as more clients run it (inferred, not yet seen).
- **Any of 1.10.3, 1.11.0 and 1.11.1 is accepted.** The bench runs 1.11.1 (BENCH-79).
- **Who ran the battles is recorded but not on the bot page.** `RumbleStats` lists every
  uploader with its total and last upload. A save of it before and after a pass says which
  clients ran that pass.

## 3. Every opponent, classed

```
python3 data/tools/live_passes.py classify --pages <3.4 3.8 3.8.5 3.9 3.10 pages> \
  --peers <Tomcat, Knight, Raven compare pages> --bench 'data/bench/2026-10-0[6-8]*_cold.tsv' \
  --sets hadur-bench/*.txt --shield-java hadur-robot/src/main/java/hadur2/ShieldListData.java \
  --rankings <3.10 rankings> --out docs/bench/opponents-3.10.tsv
```

One row per opponent ([`opponents-3.10.tsv`](opponents-3.10.tsv)): its rank and APS, Hadur's
score in each of the five passes, a pooled score (3.9 and 3.10 passes battle-weighted, the 3.10
pass alone for listed bots), the median over passes ("typical"), the three peers ranked 8th to
11th (Tomcat 3.68, Knight 0.6.28, Raven 3.56j8, from their compare pages), the bench's score
with the crippled battles dropped, the bench sets that hold it, and these classes:

- **Tier**, by pooled APS: sweep 95+, farm 85-95, mid 70-85, contest 50-70, loss under 50.
- **Tags**: ROUNDS (survival under 90), LEAK (survival 95+ but APS under 85), VOLATILE (passes
  span 20+ or a collapse), PEERGAP (peers' median 5+ above Hadur's typical score), BENCHSEES (the
  bench is 5+ under the peers too, so the bench can work on it), BENCHGAP (bench and live 10+
  apart).
- **Kind**: rammer (their ram damage averages 100+ a battle on the bench), mirror (by name), or
  the code-size class in the package name (nano, micro, mini, mega).

"Net room" is what the class would add if Hadur scored the peers' median against each bot,
signed so that single-battle noise cancels.

| Ranks | Bots | Hadur APS | Net room at peers' median |
|---|---:|---:|---:|
| 1-20 | 19 | 49.9 | -0.05 |
| 21-50 | 30 | 62.2 | +0.02 |
| 51-150 | 100 | 74.7 | **-0.37** |
| 151-400 | 250 | 80.4 | -0.03 |
| 401-700 | 300 | 87.0 | **+0.52** |
| 701+ | 516 | 95.5 | **+0.67** |
| All | 1,215 | | **+0.76** |

| Tag | Bots | Hadur APS | Net room |
|---|---:|---:|---:|
| ROUNDS | 216 | 68.9 | +0.40 |
| LEAK | 90 | 81.1 | +0.11 |
| VOLATILE | 72 | 78.6 | -0.26 |
| PEERGAP | 144 | 81.4 | +0.75 |
| of which BENCHSEES | 34 | 75.9 | +0.23 |
| BENCHGAP | 36 | 83.3 | -0.29 |
| none | 781 | 92.6 | +0.39 |

The shield list put Hadur ahead of the peers from 51 to 150 (-0.37); the room is all below 400
(+1.19), as the 3.9 notes found. PEERGAP is where it lives: 144 bots where Hadur's typical score
over five passes is 5+ under the peers, so one bad pass cannot put a bot there. VOLATILE bots
are the opposite, collapses that the other passes do not repeat, and carry no room (-0.26).

The bench-confirmed gaps (PEERGAP and BENCHSEES, 34 bots) are the work list for 3.11, because a
change can be gated on them, and on them the bench and live agree almost exactly (bench within
2 points of Hadur's typical live score on 25 of the 34). 12 are rammers by their bench ram
damage, most tagged LEAK: Hadur wins the rounds and gives away a fifth of the score (Sabreur,
SabreuseNano, Machete, FollowFire, Caligula, RammingC, Galaxy03, nanoPri, Sanguijuela, Fusion,
SuperRamFire, ButtHead). The rest are simple guns that hit Hadur more than they hit the peers
(Neutrino, NanoDeath, Bicephal, GrubbmThree, PinkPanther, Impact, SledgeHammer, MaxRisk). 42
more PEERGAP bots have bench rows that do not show the gap; after the fix those are the next
compliance check. 68 have never been benched.

## Proposal (no release)

1. **Merge the bench fix** (BENCH-83, BENCH-84), then on the PC, client shards off, run the 11
   crippled bots for 4 seeds with 3.10: the denials should be gone and the scores should fall
   from 89-99 to the live 70-80s. That is the check that the fix holds on Windows.
2. **Keep the client off while the bench runs, and the bench off while a new release's first
   pass runs.** The client's battles count on the ladder; a loaded PC costs Hadur there (inferred
   from the loaded-host run above).
3. **Read a release with `live_passes.py drift` against the previous page, never the rank
   alone**, and save `https://rumble.robowiki.net/RumbleStats` at release time and at each page
   save so a rough pass can be traced to its clients.
4. **Hold 3.11 until 3.10's page has second battles** in most pairings; the rank should recover
   part of the 1.25 if the offset is the pass, not the robot.
5. **Gate 3.11 on the BENCHSEES list** (movement and ram handling against simple guns and
   rammers), measured on the fixed bench.
