# hadur-bench

Headless Robocode battles for measuring Hadur (stage S0 of the Hadur 2 plan), and the
recorder that captures the core's replay fixtures (S1).

The bench runs the full Robocode 1.9.5.6 engine from Maven Central, with the security
manager on. Each battle runs in its own JVM with `-DRANDOMSEED=<battle number>`, so the
same command gives the same result every time.

## Running

```sh
mvn package -DskipTests                    # build the robot jar (repo root)
cd hadur-bench
mvn exec:java -Dexec.args="--mode cold --rounds 35 --seeds 5"
```

| Option | Default | Meaning |
|---|---|---|
| `--mode cold\|warm` | cold | cold wipes Hadur's data directory before every battle; warm keeps it across consecutive battles and reports the learning curve |
| `--rounds N` | 35 | rounds per battle |
| `--seeds N` | 5 | battles per opponent (cold) |
| `--battles N` | 5 | consecutive battles per opponent (warm) |
| `--field WxH` | 800x600 | battlefield size |
| `--robot-jar FILE` | ../hadur-robot/target/hadur2.Hadur_3.8.jar | the robot jar |
| `--robot-classes DIR` | | jar a compiled class tree instead, e.g. an older Hadur |
| `--robot NAME` | hadur2.Hadur 3.8 | the robot's name as Robocode lists it |
| `--record DIR` | | capture replay fixtures instead (see below) |
| `--fixture NAME` | | with `--record`, the fixture's file name instead of the opponent's (A0) |
| `--keep-data true` | | with `--melee`, fight on the data directory as it is instead of wiping it before each battle (A0's hand-off fixture on a store) |
| `--set FILE` | reference-set.txt | the opponent list, e.g. `roborumble-top10.txt` |
| `--melee true` | | put Hadur and every opponent in the set in one battle, `--seeds` times, and report finishing places |
| `--sentry-border N` | | with `--melee`, the set's `sentry` entries fight as Robocode sentries guarding a border N px deep |
| `--team true` | | (A5) fight each team in the set with our team jar (`--robot-jar`, default `hadur2.HadurTeam_<ver>.jar`; `--robot` `hadur2.HadurTeam <ver>`; `--member` `hadur2.Hadur`), `--seeds` battles each at TeamRumble settings (1200x1200, 10 rounds) |
| `--client FILE` | | (BENCH-4) run the set through each rumble-client condition the file lists (`label \| key=value ...` per line: `data`, `cpu`, `load`, `engine`, `java`), one bench pass per condition, and report survival share and skipped turns per opponent per condition |
| `--suite FILE` | | run every bench the file lists (`label \| options` per line) and write one report |
| `--only TEXT` | | run only opponents whose name contains TEXT |
| `--out DIR` | work/&lt;mode&gt;-&lt;time&gt; | working directory (Robocode home, logs) |
| `--report FILE` | | also write the report there, e.g. `../docs/bench/…` |

The command exits non-zero if any battle fails.

## Running locally (Windows or Linux)

Prerequisites: JDK 21 and Maven 3.9+ on the PATH (`java -version`, `mvn -version`).

```sh
mvn package -DskipTests        # repo root: builds hadur-robot/target/hadur2.Hadur_3.8.jar
cd hadur-bench
./fetch-opponents.sh           # Linux/macOS; downloads the jars the set files name
```

```powershell
mvn package -DskipTests
cd hadur-bench
.\fetch-opponents.ps1          # Windows PowerShell 5.1+ or pwsh
```

The jars are not committed. The script reads every set file here (suite files name no jars
and are skipped), downloads each missing jar into `opponents/` from
`https://robocode-archive.strangeautomata.com/robots/`, prints downloaded/present/failed
counts and exits non-zero if any download failed. Fetch one set with `--set top19.txt`
(`-Set top19.txt`), or use another target directory with `--dir DIR` (`-Dir DIR`).

A smoke bench (one set, few seeds). In PowerShell the whole `-Dexec.args` argument must be
quoted:

```powershell
mvn -q compile exec:java "-Dexec.args=--set top19.txt --rounds 10 --seeds 1 --robot-jar ../hadur-robot/target/hadur2.Hadur_3.8.jar"
```

```sh
mvn -q compile exec:java -Dexec.args="--set top19.txt --rounds 10 --seeds 1 --robot-jar ../hadur-robot/target/hadur2.Hadur_3.8.jar"
```

Pass `--robot-jar` explicitly (the default is `../hadur-robot/target/hadur2.Hadur_3.8.jar`,
which goes stale when the robot version changes). For the Remote Control session that
drives these runs, see issue #102.

## Opponents

`reference-set.txt` lists them. R9 added `weak-leak.txt` (the eleven weak bots of issue #80: rammers, mirror movers and close-range nanos) and `top19.txt` (the 1v1 top 19 above 3.4, the regression gate); see `docs/bench/r9-weak-leak.md`. `roborumble-top10.txt` lists the RoboRumble top 10 (run it with `--set roborumble-top10.txt`); it is kept apart so CI and the replay fixtures stay on the reference set. For melee,
`melee-samples.txt` holds nine sample bots, `melee-classic.txt` nine established MeleeRumble
bots and `melee-strong.txt` top-end bots that also play melee; run them with `--melee true
--field 1000x1000`, the MeleeRumble's setting.

The melee extension plan (M0–M6) adds its own sets:

| Set | What | Gate |
|---|---|---|
| `melee-challenge.txt` | sample and SuperSample bots, 100 rounds, one battle | M3: 100 firsts; M4: 100k total score |
| `melee-reference.txt` | nine MeleeRumble bots of ranks 30–100 | M3: survival 40; M4: APS 55; M6: APS 60 |
| `melee-sentry.txt` | two opponents and `samplesentry.BorderGuard`, border 100 | no sentry hits taken, none given |
| `melee-handoff.txt` | a field whose likely last opponents are Shadow, Diamond and Portia | M5: duel win rate within 5 points of `handoff-duel.txt`'s clean 1v1 |
| `melee-top10.txt` | the MeleeRumble top 10 (less jd.Nullstride) | none: the trend line |

`melee-gates.txt` is a suite: the duel reference bench, sentry safety, the challenge and the
reference field, in one command:

```sh
mvn -q compile exec:java -Dexec.args="--suite melee-gates.txt --report ../docs/bench/<name>.md"
```

A melee report gives Hadur's APS (for each battle and each other robot, Hadur's share of the
pair's score, averaged) and survival (for each round, the share of the other robots Hadur
outlived), both as the MeleeRumble computes them; the rounds that ended as a duel and who
won them; sentry hits both ways; and totals from Hadur's `M` records. Each melee battle's
directory holds `melee.csv` (final scores), `rounds.csv` (per round: place, the last
opponent, sentry hits, skipped turns) and `hadur.log`. Sample bots ship with the engine. Other bots go in
`opponents/` as jars (not committed) and are listed with their jar name.

## Output

Each battle directory under `work/…/battles/` holds:

- `result.csv`: scores, survival, bullet damage for both robots, skipped turns, turn times,
  what Hadur's own `R` and `FAULT` records said (hit rates, faults), and the wave
  fidelity counts below.
- `hadur.log`: everything Hadur printed, as `round,turn,line`.
- `truth.log.gz`: one `F,round,turn,E,power` record for each enemy bullet as it spawns, and
  one `T,round,turn,…` record per turn with both robots' true x, y,
  heading, velocity, energy and every live bullet as `owner:x:y:heading:power`
  (owner `H` is Hadur, `E` the enemy). The first line is `V,1`.
- `engine.log`: the engine's own output.

`report.md` in the working directory is the summary table.

The "Opponent memory" section (S3) counts the battles whose first scan loaded a stored
profile, memory failures (Hadur's `MEM` records) and seed evictions. After each opponent's
last battle the bench decodes the profile Hadur left in `robots/.data/hadur2/Hadur.data/`
and lists it under "Stored profiles": battles, rounds, size, both hit rates, virtual-gun
ratings, provisional tiers and the per-battle score share the profile recorded. In cold
mode that is the profile of the last battle only; warm mode keeps it across battles.

From S4 the same section shows, per battle, the tiers the profile named at the first scan
and the gun the opening book chose from them (Hadur's `B` and `P` records), the seed sizes
replayed at the start of the last battle, and the waves on which a seed lost weight because
the live data disagreed with the profile (RES-4, R field 22). "Stored profiles" adds their
normalised hit rate on Hadur with its margin, which is what the gun tier reads, and the
seed sizes.

From S5 the "Aggression" section shows, per opponent, the distance the controller opened at
in each battle (650 px for a stranger, else by gun tier), the mean scan distance, the
controller's target when the last round ended (DIST-1), the mean round length in ticks,
bullet damage dealt and taken per round, shots fired at full power (POW-1, POW-2), and
ticks spent finishing (END-1) and ramming (END-2). They come from R fields 23-27 and the
opening's `P,…,distance,…,<tier>:<px>` record.

From S6 the "Unhittable" section shows, per opponent, their hit rate, skipped turns, the
ticks that used more than 70% of the assumed 3 ms allowance (TIME-1), the highest
computation level any round reached (TIME-2), the enemy firing waves per round that one
of our bullets shadowed (MOVE-1), how many of the enemy bullets ours destroyed fell inside
a shadow Hadur had computed (a check on the geometry: it should be all of them), and the
movement flavour changes and last step (MOVE-2). They come from R fields 13 and 28-32.

The report's hit-rate and fault columns come from Hadur's `R` (round end) and `FAULT`
records, so every fault and degradation counter the core keeps reaches the report (RES-5).

The wave fidelity table (S2) scores the enemy waves Hadur inferred (its `EW` records)
against the bullets the enemy really fired (the engine's bullet ids). A wave matches a
real bullet in the same round within 3 ticks and 0.15 power. "Unseen" shots were fired
while either robot was disabled and matched no wave; they are left out of the real-shot
count. (A disabled robot is still scanned, so such a shot is often seen, and then counts.) "False waves" are inferred waves with no real bullet behind them;
"ledger phantoms" are drops 1.20 would have read as shots that the ledger explained away.

## Shield probe (BENCH-11)

```sh
mvn exec:java -Dexec.args="--shield-probe candidates.txt --seeds 20 --rounds 35"
```

`candidates.txt` is an ordinary opponent set (`name | role | jar | weight`, the format of
`--set`). The probe repacks the robot jar (`--robot-jar`, default the built
`hadur-robot/target/hadur2.Hadur_<version>.jar`) twice into `<out>/shield-probe/`: as
`<version>-on`, whose shield list (`hadur2.ShieldListData`, SHIELD-5) names every opponent of the set,
and as `<version>-off`, whose list names nobody. The two jars are the same bytes apart from that
class and the version string in `Hadur.properties`. It then runs the existing paired machinery
(`--baseline`, BENCH-2) with "on" as the candidate and "off" as the baseline: one battle each per
seed at the same `RANDOMSEED`. It needs a JDK (the list class is compiled on the fly), makes its
own baseline (so it refuses `--baseline`), and takes no `--melee`, `--team`, `--session`,
`--client`, `--record` or `--robot-classes`.

The report gets a "Shield probe" section after the paired table: per opponent the shares on and
off, the paired difference in points with its verdict (*wins* when the 95% interval lies above 0,
*loses* below, *open* otherwise), and what shield mode did in the "on" battles, read from the `SH`
and `SR` records in `hadur.log`: rounds that opened in shield mode, shield bullets fired, enemy
bullets they met, hits taken while it ran, rounds left early (and why), and battles in which the
SHIELD-6 budget switched it off. Then the weighted mean paired difference over the set (BENCH-1
weights) and, ready to paste into `ShieldListData.lines()`, the opponents that win.

Reading it: twenty seeds resolve a paired difference to about 2.7 points; one seed gives *open*
for everything. A "budget exit" in every battle with few rounds on means SHIELD-6 (hold 85% of
the score share) ended it early, which is the cost the probe is there to price in.

## Client conditions (BENCH-4)

```sh
mvn exec:java -Dexec.args="--client client-conditions-r4b.txt --set weak-pbi.txt --rounds 35 --seeds 1"
```

Runs the set once per condition the file lists, each its own bench pass: `data=shared`
never wipes the robot data directory between opponents or battles (a rumble client's
reality), `data=prefill:DIR` copies DIR into it first then behaves as `data=shared`;
`cpu=NANOS` forces `robocode.cpu.constant` for the pass (a condition naming no `cpu` resets
it, so an earlier condition's forced constant never leaks into a later one); `load=N` runs
N CPU-bound threads alongside the battles; `engine=VERSION` and `java=DIR` swap the engine
jars or the JVM a condition's battles run under (see `engines/README.md`), and are reported
as not run, not failed, when not available locally. The combined report gives survival
share and skipped turns per opponent per condition, e.g.
`docs/bench/r4-client-conditions.md`.

## Session bench (BENCH-6, BENCH-7)

```sh
mvn exec:java -Dexec.args="--session session-300.txt --report ../docs/bench/r7-session.md"
```

Every other pass forks a fresh JVM per battle and fights at most 60 opponents. A rumble
client does neither: it runs hundreds of battles through one `RobocodeEngine` under
`-Xmx512M`. `--session FILE` imitates that. The session file (`SessionFile`) is `key=value`
lines: `opponents=FILE` (a set, `name | rumble APS | jar`, fought once each in list order),
`heap=512M` or `heap=none`, `rounds=N`, `fresh=true` (a fresh JVM per battle, data kept),
`wipe=true` (the data directory emptied before each battle) and `control=ROBOT` with an
optional `control-jar=JAR` (BENCH-7: the same session again with a robot that cannot be the
cause, `sample.Tracker` by default). Opponents whose jar is missing are dropped with a
line; `--limit N` runs only the first N.

`SessionRunner` is the child. It writes one `session.csv` row per battle as it goes, so a
session that dies still leaves its rows (index, opponent, ok, live heap in MB after a full
collection at the battle's end, longest GC pause, live and unloaded classes, engine
disables, ticks in duress, seconds), a `result.csv` per battle in the usual format, and a GC
log. The report gives blocks of 25 battles: survival against opponents under 50 APS (the
health check), survival over all, score share, skipped turns, engine disables, duress ticks,
heap and live classes; then says whether the slide reproduced (the first 50 sub-50 battles (at least 120 must have run)
over 95% survival and the last 100 under 85%, or any engine disable). With a control the two
sessions are put side by side.

`data/tools/sample_session.py` draws `session-300-opponents.txt` from the archived
participants page (fixed seed). The jars are not committed: fetch them from the archive
mirror into `opponents/` (a `curl` loop over the jar column does it; 300 jars are about
15 MB). A 300-battle session is about two hours and a control about as long, so start it
with the shell tool's own background mode, not `nohup`.

## Replay fixtures

```sh
mvn exec:java -Dexec.args="--record ../hadur-core/src/test/resources/replay --seeds 1 --rounds 3"
```

Runs `hadur2.HadurRecorder` (the robot plus a transcript of every `BotInput` and the
`BotOrders` it issued) with Robocode's security off, and writes one gzipped transcript
per opponent. hadur-core's replay tests feed each transcript through a fresh core and
require the same orders, bit for bit (CORE-2). Re-record whenever a change is meant to
alter Hadur's behaviour; a replay that breaks without such a change is a regression.

A0 of the architecture evolution (`docs/architecture-evolution.md`) records on the melee path
too, and the recorder logs the store the battle started on, the adapter's memory calls and
the files the battle left, so the replay compares telemetry and store files as well as
orders (STRAND-4). The five fixtures A0 added were recorded on 3.5.1 like this (`W` a work
directory, `R` the fixture directory):

```sh
mvn exec:java -Dexec.args="--record R --set melee-samples.txt --melee true --field 1000x1000 --rounds 3 --seeds 1 --fixture melee-samples"
mvn exec:java -Dexec.args="--record R --set melee-sentry.txt --melee true --field 1000x1000 --rounds 3 --seeds 1 --sentry-border 100 --fixture melee-sentry"
mvn exec:java -Dexec.args="--record R --mode warm --battles 2 --only Shadow --rounds 3 --fixture warm-abc.Shadow_3.83c --out W"   # keep the -2 transcript
mvn exec:java -Dexec.args="--record R --set melee-handoff-fixture.txt --melee true --field 1000x1000 --rounds 3 --seeds 1 --keep-data true --fixture melee-handoff --out W"
mvn exec:java -Dexec.args="--record R --only Walls --rounds 3 --seeds 1 --client duress.txt --fixture duress-sample.Walls"   # duress.txt: "duress | cpu=150000"
```

D2 re-recorded `warm-abc.Shadow_3.83c` (SHIELD-3 latches on Shadow in the warm battle) with the same command as A0's, keeping the `-2` transcript, on 3.8:

```sh
mvn exec:java -Dexec.args="--record R --mode warm --battles 2 --only Shadow --rounds 3 --fixture warm-abc.Shadow_3.83c --out W"   # keep the -2 transcript
```

A5 records a team battle the same way: with `--team true`, `--record` builds a team of five
recorders from the recorder jar and saves one transcript per member as
`team-<opponent>-m<N>`. The two team fixtures are member 1 (the leader) and member 2:

```sh
mvn exec:java -Dexec.args="--record R --set team-reference.txt --team true --only MyFirst --rounds 3 --seeds 1 --out W"   # keep m1 and m2
```

T1 adds two things to a team report. `rounds.csv` gains a ninth column, `bulletsOnMates`, the
engine's own count of our bullets that hit one of our members (the report prints it beside the
members' `T` sums, whose last field is now the count of drives the teammate fence replaced), and
each battle directory gets `friendly.log`, one line per such hit with the bullet's power and flight.

`team-gates.txt` is A5's team gate suite: `team-reference.txt`'s eight teams, three battles
each, reported per opponent with the gate's counts (faults, skipped turns, LINK rejects,
shots with a teammate truly in the lane, the count of enemies below the truth, the members'
`T` sums and the data files left).

`arch-gates.txt` is the evolution's gate suite: the duel sets, the melee gates and the
hand-off gates in one pass, run on 3.5.1 at A0 as the baseline and on the candidate at A2.

## Engine check: the inactivity penalty (D2, END-4)

`hadur.bench.InactivityCheck` is not a battle against opponents. It compiles two tiny robots
that never hit each other into a scratch Robocode home and runs one-round battles through the
engine, to confirm that the robot with more energy survives the inactivity penalty (the
result on 1.9.5.6 is in docs/requirements.md's D2 notes). Run it with the bench's classpath
and `Bench.JVM_FLAGS`, for example from `hadur-bench` after `mvn package`:

```sh
java --add-opens=java.base/sun.net.www.protocol.jar=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED \
     --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED \
     --add-opens=java.desktop/sun.awt=ALL-UNNAMED -Djava.security.manager=allow -Djava.awt.headless=true \
     -cp "target/classes:$(cat target/classpath.txt)" hadur.bench.InactivityCheck /tmp/inactivity-home
```
