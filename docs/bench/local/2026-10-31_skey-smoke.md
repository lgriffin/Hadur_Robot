# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| c | 100 | 100 | 76.05% | 27 | 5.8 |
| kl | 100 | 100 | 76.87% | 30 | 6.0 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=3951939. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.truth=false. Rounds 35, field 800x600, 2 seed(s) an arm.
