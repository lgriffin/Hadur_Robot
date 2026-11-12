# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| FM | 336 | 336 | 85.72% | 7 | 0.3 |
| Fa | 336 | 336 | 85.64% | 8 | 0.3 |
| Fd | 336 | 336 | 85.47% | 10 | 0.4 |
| Fn | 336 | 336 | 84.86% | 12 | 0.3 |
| Fo | 336 | 336 | 85.26% | 8 | 0.3 |
| Fw | 336 | 336 | 85.12% | 13 | 0.4 |
| aa | 336 | 336 | 84.79% | 2 | 0.2 |
| c | 336 | 336 | 84.81% | 4 | 0.2 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=3943991. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M -Dhadur.bench.truth=false. Rounds 35, field 800x600, 3 seed(s) an arm.
