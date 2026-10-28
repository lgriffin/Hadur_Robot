# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| c | 60 | 60 | 89.07% | 5 | 2.2 |
| s0 | 60 | 60 | 90.47% | 3 | 1.4 |
| s4 | 60 | 60 | 90.67% | 1 | 1.6 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=4701722. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G. Rounds 35, field 800x600, 2 seed(s) an arm.
