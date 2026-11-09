# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| c | 64 | 64 | 79.49% | 7 | 6.6 |
| pf | 64 | 64 | 79.94% | 7 | 7.5 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=3355374. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G. Rounds 35, field 800x600, 2 seed(s) an arm.
