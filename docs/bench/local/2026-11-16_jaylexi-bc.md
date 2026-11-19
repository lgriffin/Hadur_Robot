# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| bc1372 | 12 | 12 | 59.13% | 0 | 1.1 |
| bc2000 | 12 | 12 | 49.73% | 0 | 0.8 |
| bc2628 | 12 | 12 | 50.78% | 0 | 0.8 |
| c | 12 | 12 | 70.82% | 1 | 0.9 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=2992262. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v470, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M -Dhadur.bench.truth=false. Rounds 35, field 800x600, 12 seed(s) an arm.
