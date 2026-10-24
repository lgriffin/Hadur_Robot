# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| aa | 512 | 512 | 79.01% | 0 | 23.3 |
| c | 512 | 512 | 78.77% | 0 | 23.2 |
| sasq | 512 | 512 | 89.24% | 0 | 22.1 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.truth=false. Rounds 35, field 800x600, 8 seed(s) an arm.
