# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| c | 24 | 24 | 76.28% | 4 | 5.6 |
| s0 | 24 | 24 | 82.99% | 2 | 4.5 |
| s4 | 24 | 24 | 83.02% | 4 | 4.8 |
| sas0 | 24 | 24 | 77.02% | 1 | 4.4 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=3965538. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G. Rounds 35, field 800x600, 3 seed(s) an arm.
