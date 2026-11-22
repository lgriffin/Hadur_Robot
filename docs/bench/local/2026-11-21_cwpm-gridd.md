# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| aa | 8 | 8 | 80.62% | 2 | 8.5 |
| c | 8 | 8 | 80.22% | 4 | 8.6 |
| pm | 8 | 8 | 83.30% | 2 | 6.9 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=3272413 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M -Dhadur.bench.truth=false. Rounds 35, field 800x600, 8 seed(s) an arm.
