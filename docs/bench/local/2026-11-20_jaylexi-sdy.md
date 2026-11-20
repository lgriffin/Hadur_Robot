# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| SD2 | 336 | 336 | 84.98% | 3 | 0.2 |
| SD4 | 336 | 336 | 84.97% | 7 | 0.2 |
| SD5 | 336 | 336 | 85.04% | 4 | 0.2 |
| aa | 336 | 336 | 85.22% | 3 | 0.2 |
| c | 336 | 336 | 85.14% | 2 | 0.2 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=3437078. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M -Dhadur.bench.truth=false. Rounds 35, field 800x600, 3 seed(s) an arm.
