# hadur-bench

Headless Robocode battles for measuring Hadur (stage S0 of the Hadur 2 plan).

The bench runs the full Robocode 1.9.5.6 engine from Maven Central, with the security
manager on. Each battle runs in its own JVM with `-DRANDOMSEED=<battle number>`, so the
same command gives the same result every time.

## Running

```sh
mvn compile                                # build the robot (repo root)
cd hadur-bench
mvn compile exec:java -Dexec.args="--mode cold --rounds 35 --seeds 5"
```

| Option | Default | Meaning |
|---|---|---|
| `--mode cold\|warm` | cold | cold wipes Hadur's data directory before every battle; warm keeps it across consecutive battles and reports the learning curve |
| `--rounds N` | 35 | rounds per battle |
| `--seeds N` | 5 | battles per opponent (cold) |
| `--battles N` | 5 | consecutive battles per opponent (warm) |
| `--field WxH` | 800x600 | battlefield size |
| `--robot-classes DIR` | ../target/classes | the compiled robot |
| `--robot NAME` | hadur117.Hadur 1.20 | the robot's name as Robocode lists it |
| `--only TEXT` | | run only opponents whose name contains TEXT |
| `--out DIR` | work/&lt;mode&gt;-&lt;time&gt; | working directory (Robocode home, logs) |
| `--report FILE` | | also write the report there, e.g. `../docs/bench/…` |

The command exits non-zero if any battle fails.

## Opponents

`reference-set.txt` lists them. Sample bots ship with the engine. Other bots go in
`opponents/` as jars (not committed) and are listed with their jar name.

## Output

Each battle directory under `work/…/battles/` holds:

- `result.csv`: scores, survival, bullet damage for both robots, skipped turns, turn times.
- `hadur.log`: everything Hadur printed, as `round,turn,line`.
- `truth.log.gz`: one `T,round,turn,…` record per turn with both robots' true x, y,
  heading, velocity, energy and every live bullet as `owner:x:y:heading:power`
  (owner `H` is Hadur, `E` the enemy). The first line is `V,1`.
- `engine.log`: the engine's own output.

`report.md` in the working directory is the summary table.
