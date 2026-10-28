# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| aa | 24 | 24 | 72.40% | 3 | 2.0 |
| nr | 24 | 24 | 67.49% | 3 | 2.0 |
| sg | 24 | 24 | 72.19% | 3 | 3.0 |
| wp | 24 | 24 | 69.87% | 3 | 2.6 |
| ws | 24 | 24 | 70.72% | 4 | 1.5 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=3842619. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G. Rounds 35, field 800x600, 2 seed(s) an arm.
