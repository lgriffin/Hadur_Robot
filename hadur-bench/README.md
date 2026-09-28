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
| `--robot-jar FILE` | ../hadur-robot/target/hadur2.Hadur_3.0.jar | the robot jar |
| `--robot-classes DIR` | | jar a compiled class tree instead, e.g. an older Hadur |
| `--robot NAME` | hadur2.Hadur 3.0 | the robot's name as Robocode lists it |
| `--record DIR` | | capture replay fixtures instead (see below) |
| `--set FILE` | reference-set.txt | the opponent list, e.g. `roborumble-top10.txt` |
| `--melee true` | | put Hadur and every opponent in the set in one battle, `--seeds` times, and report finishing places |
| `--sentry-border N` | | with `--melee`, the set's `sentry` entries fight as Robocode sentries guarding a border N px deep |
| `--suite FILE` | | run every bench the file lists (`label \| options` per line) and write one report |
| `--only TEXT` | | run only opponents whose name contains TEXT |
| `--out DIR` | work/&lt;mode&gt;-&lt;time&gt; | working directory (Robocode home, logs) |
| `--report FILE` | | also write the report there, e.g. `../docs/bench/…` |

The command exits non-zero if any battle fails.

## Opponents

`reference-set.txt` lists them. `roborumble-top10.txt` lists the RoboRumble top 10 (run it with `--set roborumble-top10.txt`); it is kept apart so CI and the replay fixtures stay on the reference set. For melee,
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

## Replay fixtures

```sh
mvn exec:java -Dexec.args="--record ../hadur-core/src/test/resources/replay --seeds 1 --rounds 3"
```

Runs `hadur2.HadurRecorder` (the robot plus a transcript of every `BotInput` and the
`BotOrders` it issued) with Robocode's security off, and writes one gzipped transcript
per opponent. hadur-core's replay tests feed each transcript through a fresh core and
require the same orders, bit for bit (CORE-2). Re-record whenever a change is meant to
alter Hadur's behaviour; a replay that breaks without such a change is a regression.
