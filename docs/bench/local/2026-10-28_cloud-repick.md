# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| c | 42 | 42 | 83.90% | 7 | 2.1 |
| md | 42 | 42 | 82.16% | 6 | 2.4 |
| mdwp | 42 | 42 | 58.18% | 11 | 1.7 |
| mdws | 42 | 42 | 62.47% | 11 | 1.0 |
| sask | 42 | 42 | 80.83% | 5 | 2.3 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=4322185. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G. Rounds 35, field 800x600, 3 seed(s) an arm.
