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
| `--robot-jar FILE` | ../hadur-robot/target/hadur2.Hadur_2.1.jar | the robot jar |
| `--robot-classes DIR` | | jar a compiled class tree instead, e.g. an older Hadur |
| `--robot NAME` | hadur2.Hadur 2.1 | the robot's name as Robocode lists it |
| `--record DIR` | | capture replay fixtures instead (see below) |
| `--set FILE` | reference-set.txt | the opponent list, e.g. `roborumble-top10.txt` |
| `--melee true` | | put Hadur and every opponent in the set in one battle, `--seeds` times, and report finishing places |
| `--only TEXT` | | run only opponents whose name contains TEXT |
| `--out DIR` | work/&lt;mode&gt;-&lt;time&gt; | working directory (Robocode home, logs) |
| `--report FILE` | | also write the report there, e.g. `../docs/bench/…` |

The command exits non-zero if any battle fails.

## Opponents

`reference-set.txt` lists them. `roborumble-top10.txt` lists the RoboRumble top 10 (run it with `--set roborumble-top10.txt`); it is kept apart so CI and the replay fixtures stay on the reference set. For melee,
`melee-samples.txt` holds nine sample bots, `melee-classic.txt` nine established MeleeRumble
bots and `melee-strong.txt` top-end bots that also play melee; run them with `--melee true
--field 1000x1000`, the MeleeRumble's setting. Sample bots ship with the engine. Other bots go in
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
