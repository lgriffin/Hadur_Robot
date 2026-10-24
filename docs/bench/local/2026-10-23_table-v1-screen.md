# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| aa | 3544 | 3544 | 89.78% | 851 | 31.4 |
| c | 3544 | 3544 | 89.78% | 784 | 30.2 |
| sasq | 3544 | 3544 | 85.51% | 933 | 33.0 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.truth=false. Rounds 35, field 800x600, 4 seed(s) an arm.
