# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| aa | 96 | 96 | 80.72% | 3 | 13.8 |
| c | 96 | 96 | 80.71% | 3 | 14.4 |
| rel | 96 | 96 | 78.97% | 2 | 13.3 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=3272413 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.truth=false. Rounds 35, field 800x600, 6 seed(s) an arm.
