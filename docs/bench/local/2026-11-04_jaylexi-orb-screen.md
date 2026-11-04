# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| aa | 5340 | 5340 | 88.50% | 0 | 0.0 |
| c | 5340 | 5340 | 88.50% | 0 | 0.0 |
| far | 5340 | 5340 | 88.31% | 0 | 0.0 |
| near | 5340 | 5340 | 88.37% | 0 | 0.0 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=1484689. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M -Dhadur.bench.truth=false. Rounds 35, field 800x600, 10 seed(s) an arm.
