# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| aa | 3320 | 3320 | 86.28% | 0 | 0.0 |
| c | 3320 | 3320 | 86.28% | 0 | 0.0 |
| rn | 3320 | 3320 | 80.14% | 0 | 0.0 |
| sg | 3320 | 3320 | 78.91% | 0 | 0.0 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=1546857. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M -Dhadur.bench.truth=false. Rounds 35, field 800x600, 10 seed(s) an arm.
