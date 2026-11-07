# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| aa | 120 | 120 | 67.47% | 58 | 16.1 |
| c | 120 | 120 | 66.90% | 53 | 16.9 |
| rp | 120 | 120 | 68.03% | 35 | 23.9 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=2875149. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx768M -Dhadur.bench.truth=false. Rounds 35, field 800x600, 3 seed(s) an arm.
