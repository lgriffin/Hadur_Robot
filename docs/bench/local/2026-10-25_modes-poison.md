# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| aa | 444 | 444 | 88.17% | 29 | 20.1 |
| c | 444 | 444 | 87.71% | 22 | 19.0 |
| wp | 444 | 444 | 78.91% | 17 | 18.2 |
| ws | 444 | 444 | 88.44% | 13 | 16.8 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.truth=false. Rounds 35, field 800x600, 3 seed(s) an arm.
