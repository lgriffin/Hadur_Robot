# Bench: hadur2.Hadur 3.9sa (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 2809 over 240 battles (11.7 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | mid-shield | 89.3% ± 5.7 | 96.4% ± 3.1 | 60.0% ± 10.4 | 270 / 280 | 13.4% ± 1.1 | 3.0% ± 2.5 | 89 | 0 | 0.70 / 18.5 |
| ak.Fermat 2.0 | mid-shield | 87.5% ± 6.6 | 96.1% ± 5.6 | 60.1% ± 5.7 | 269 / 280 | 10.1% ± 2.9 | 4.1% ± 5.8 | 98 | 0 | 1.24 / 19.0 |
| ary.SMG 1.01 | mid-shield | 86.0% ± 3.6 | 96.4% ± 2.5 | 50.2% ± 6.1 | 270 / 280 | 7.2% ± 1.2 | 2.2% ± 0.8 | 131 | 0 | 0.83 / 122.7 |
| ary.mini.Nimi 1.0 | mid-shield | 92.8% ± 1.9 | 98.9% ± 1.2 | 61.2% ± 6.4 | 277 / 280 | 7.8% ± 1.1 | 1.0% ± 0.3 | 100 | 0 | 0.54 / 129.4 |
| bayen.nut.Squirrel 1.621 | mid-shield | 92.7% ± 3.7 | 98.6% ± 2.6 | 74.6% ± 7.0 | 276 / 280 | 20.9% ± 7.8 | 1.8% ± 0.8 | 92 | 0 | 0.50 / 359.3 |
| brainfade.Fallen 0.63 | mid-shield | 90.4% ± 4.7 | 97.5% ± 2.7 | 48.9% ± 8.6 | 273 / 280 | 5.3% ± 0.7 | 1.2% ± 0.4 | 185 | 0 | 0.51 / 445.1 |
| can.Pookie 1.1 | mid-shield | 81.0% ± 1.9 | 95.0% ± 2.5 | 55.5% ± 4.9 | 266 / 280 | 13.7% ± 3.0 | 3.8% ± 1.1 | 87 | 0 | 0.89 / 293.2 |
| cf.mini.Chiva 1.0 | mid-shield | 85.0% ± 1.3 | 96.1% ± 2.5 | 76.6% ± 1.3 | 269 / 280 | 46.8% ± 4.5 | 9.6% ± 1.2 | 82 | 0 | 0.74 / 40.9 |
| cf.proto.Shiva 2.2 | mid-shield | 92.4% ± 1.7 | 98.9% ± 1.2 | 59.8% ± 4.5 | 277 / 280 | 7.1% ± 1.4 | 1.3% ± 0.4 | 98 | 0 | 0.53 / 202.1 |
| chase.pm.Pytko 1.0 | mid-shield | 67.8% ± 2.7 | 86.1% ± 3.9 | 48.4% ± 1.7 | 241 / 280 | 13.5% ± 1.3 | 7.0% ± 0.4 | 94 | 0 | 1.14 / 110.9 |
| css.Delitioner 0.11 | mid-shield | 70.6% ± 4.1 | 78.9% ± 5.7 | 61.6% ± 3.1 | 221 / 280 | 24.4% ± 2.3 | 7.6% ± 1.0 | 95 | 0 | 0.91 / 16.6 |
| dft.Cyanide 1.90 | mid-shield | 94.7% ± 2.6 | 98.9% ± 1.2 | 68.1% ± 7.9 | 277 / 280 | 9.4% ± 1.8 | 3.5% ± 0.3 | 77 | 0 | 0.53 / 14.5 |
| dz.Caedo 1.4 | mid-shield | 76.3% ± 5.4 | 86.8% ± 7.3 | 62.0% ± 2.8 | 243 / 280 | 20.6% ± 1.9 | 9.5% ± 5.8 | 94 | 0 | 0.80 / 98.5 |
| kawigi.mini.Fhqwhgads 1.1 | mid-shield | 91.4% ± 3.0 | 97.5% ± 2.0 | 66.2% ± 4.3 | 273 / 280 | 12.7% ± 1.7 | 4.4% ± 0.2 | 84 | 0 | 0.53 / 16.3 |
| kawigi.sbf.FloodMini 1.4 | mid-shield | 83.5% ± 7.2 | 92.1% ± 6.2 | 62.2% ± 5.9 | 258 / 280 | 15.0% ± 4.2 | 5.4% ± 1.2 | 88 | 0 | 0.76 / 16.9 |
| kid.Toa .0.5 | mid-shield | 92.6% ± 3.5 | 98.6% ± 2.6 | 77.2% ± 5.6 | 276 / 280 | 11.3% ± 1.0 | 1.4% ± 0.3 | 74 | 0 | 1.09 / 63.2 |
| kms.Golden 0.10 | mid-shield | 82.0% ± 6.4 | 92.9% ± 4.8 | 50.9% ± 3.2 | 260 / 280 | 12.7% ± 1.3 | 2.6% ± 0.8 | 87 | 0 | 0.74 / 16.6 |
| lucasslf.Dodger 1.0 | mid-shield | 88.4% ± 3.1 | 97.1% ± 1.8 | 41.9% ± 7.4 | 272 / 280 | 8.4% ± 2.1 | 2.7% ± 0.4 | 90 | 0 | 0.49 / 227.4 |
| mk.Alpha 0.2.1 | mid-shield | 97.8% ± 1.1 | 100.0% ± 0.0 | 83.0% ± 4.7 | 280 / 280 | 8.5% ± 1.1 | 0.5% ± 0.3 | 78 | 0 | 0.55 / 155.3 |
| mladjo.Grrrrr 0.9 | mid-shield | 87.5% ± 5.6 | 96.4% ± 3.1 | 52.4% ± 4.8 | 270 / 280 | 10.2% ± 2.4 | 1.9% ± 0.9 | 91 | 0 | 0.77 / 17.5 |
| nz.jdc.nano.NeophytePattern 1.1 | mid-shield | 77.7% ± 2.4 | 91.4% ± 3.4 | 66.7% ± 1.9 | 256 / 280 | 20.8% ± 1.2 | 11.3% ± 0.5 | 82 | 0 | 0.95 / 65.5 |
| pedersen.Hubris 2.4 | mid-shield | 76.1% ± 2.0 | 86.4% ± 3.3 | 66.3% ± 1.3 | 242 / 280 | 17.8% ± 0.6 | 7.9% ± 0.4 | 104 | 0 | 1.04 / 21.2 |
| ph.micro.Pikeman 0.4.5 | mid-shield | 94.7% ± 3.3 | 98.6% ± 1.8 | 57.7% ± 9.5 | 276 / 280 | 5.8% ± 1.2 | 0.6% ± 0.3 | 81 | 0 | 0.49 / 96.1 |
| suh.mega.WaveSurferPG 1.06 | mid-shield | 73.6% ± 4.5 | 83.6% ± 4.6 | 60.5% ± 4.3 | 234 / 280 | 18.5% ± 1.7 | 6.4% ± 1.3 | 101 | 0 | 0.90 / 22.5 |
| synapse.rsim.GeomancyBS 0.11 | mid-shield | 67.8% ± 3.3 | 80.4% ± 3.5 | 53.9% ± 3.3 | 225 / 280 | 16.5% ± 1.2 | 6.5% ± 0.8 | 117 | 0 | 1.00 / 16.8 |
| theo.avenge.Pequod 1.0 | mid-shield | 87.8% ± 2.2 | 98.6% ± 1.3 | 52.2% ± 4.0 | 276 / 280 | 10.2% ± 1.3 | 2.0% ± 0.5 | 88 | 0 | 1.04 / 23.1 |
| theo.real.Ahab 1.0 | mid-shield | 85.4% ± 3.4 | 97.1% ± 2.2 | 50.5% ± 7.9 | 272 / 280 | 7.7% ± 1.7 | 2.4% ± 0.6 | 82 | 0 | 1.42 / 22.9 |
| tm.Yuugao 1.0 | mid-shield | 78.1% ± 5.1 | 91.8% ± 4.7 | 56.0% ± 3.5 | 257 / 280 | 16.6% ± 2.6 | 4.2% ± 1.0 | 89 | 0 | 0.83 / 17.9 |
| trab.Crusader 0.1.7 | mid-shield | 79.6% ± 7.2 | 93.6% ± 6.4 | 39.6% ± 5.5 | 262 / 280 | 7.3% ± 1.0 | 2.9% ± 0.7 | 74 | 0 | 1.41 / 25.5 |
| wiki.mini.Sedan 1.0 | mid-shield | 95.1% ± 2.6 | 99.3% ± 1.1 | 69.8% ± 10.5 | 278 / 280 | 9.3% ± 0.8 | 2.7% ± 0.3 | 77 | 0 | 0.53 / 16.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 8 | 291 | 21.5% | 68.0% | 0.1% | 10.4% | 878 |
| ak.Fermat 2.0 | 8 | 434 | 15.8% | 77.1% | 0.0% | 7.1% | 845 |
| ary.SMG 1.01 | 8 | 406 | 15.4% | 77.2% | 0.6% | 6.9% | 1155 |
| ary.mini.Nimi 1.0 | 8 | 187 | 10.1% | 85.9% | 0.0% | 4.1% | 1180 |
| bayen.nut.Squirrel 1.621 | 8 | 223 | 11.2% | 84.4% | 0.4% | 3.9% | 1225 |
| brainfade.Fallen 0.63 | 8 | 242 | 18.1% | 74.5% | 0.0% | 7.5% | 938 |
| can.Pookie 1.1 | 8 | 677 | 12.9% | 81.8% | 0.7% | 4.6% | 763 |
| cf.mini.Chiva 1.0 | 8 | 859 | 8.0% | 83.1% | 4.9% | 4.0% | 481 |
| cf.proto.Shiva 2.2 | 8 | 197 | 9.5% | 86.8% | 0.1% | 3.6% | 990 |
| chase.pm.Pytko 1.0 | 8 | 1439 | 16.9% | 75.6% | 0.0% | 7.5% | 862 |
| css.Delitioner 0.11 | 8 | 1415 | 26.1% | 63.9% | 0.0% | 10.0% | 721 |
| dft.Cyanide 1.90 | 8 | 133 | 14.1% | 79.5% | 0.0% | 6.4% | 999 |
| dz.Caedo 1.4 | 8 | 1004 | 23.0% | 67.9% | 0.0% | 9.0% | 761 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 233 | 18.8% | 74.7% | 0.0% | 6.5% | 831 |
| kawigi.sbf.FloodMini 1.4 | 8 | 594 | 23.2% | 68.2% | 0.3% | 8.3% | 770 |
| kid.Toa .0.5 | 8 | 231 | 10.8% | 85.1% | 0.0% | 4.1% | 1242 |
| kms.Golden 0.10 | 8 | 551 | 22.7% | 67.8% | 0.8% | 8.7% | 767 |
| lucasslf.Dodger 1.0 | 8 | 296 | 16.9% | 76.6% | 0.0% | 6.5% | 1385 |
| mk.Alpha 0.2.1 | 8 | 55 | 0.0% | 100.0% | 0.0% | 0.0% | 1040 |
| mladjo.Grrrrr 0.9 | 8 | 359 | 17.4% | 75.5% | 0.0% | 7.1% | 925 |
| nz.jdc.nano.NeophytePattern 1.1 | 8 | 1282 | 11.7% | 83.1% | 0.0% | 5.2% | 537 |
| pedersen.Hubris 2.4 | 8 | 1217 | 19.5% | 72.3% | 0.0% | 8.1% | 682 |
| ph.micro.Pikeman 0.4.5 | 8 | 128 | 19.6% | 72.0% | 0.0% | 8.4% | 942 |
| suh.mega.WaveSurferPG 1.06 | 8 | 1086 | 26.5% | 62.5% | 1.3% | 9.7% | 1049 |
| synapse.rsim.GeomancyBS 0.11 | 8 | 1436 | 23.9% | 66.6% | 0.0% | 9.4% | 917 |
| theo.avenge.Pequod 1.0 | 8 | 349 | 7.2% | 90.4% | 0.0% | 2.4% | 946 |
| theo.real.Ahab 1.0 | 8 | 434 | 11.5% | 84.1% | 0.0% | 4.4% | 1097 |
| tm.Yuugao 1.0 | 8 | 821 | 17.5% | 74.7% | 0.0% | 7.8% | 833 |
| trab.Crusader 0.1.7 | 8 | 616 | 18.3% | 74.3% | 0.0% | 7.4% | 1134 |
| wiki.mini.Sedan 1.0 | 8 | 123 | 10.1% | 86.7% | 0.0% | 3.1% | 836 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 8 | 5 | 1192 | 0 | 0.32 | 0 | 0 | 0 |
| ak.Fermat 2.0 | 8 | 7 | 561 | 0 | 0.35 | 0 | 0 | 0 |
| ary.SMG 1.01 | 8 | 7 | 298 | 1 | 0.47 | 0 | 0 | 0 |
| ary.mini.Nimi 1.0 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| bayen.nut.Squirrel 1.621 | 8 | 7 | 298 | 0 | 0.33 | 0 | 0 | 8 |
| brainfade.Fallen 0.63 | 8 | 6 | 0 | 1 | 0.66 | 1 | 1 | 0 |
| can.Pookie 1.1 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| cf.mini.Chiva 1.0 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| cf.proto.Shiva 2.2 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| chase.pm.Pytko 1.0 | 8 | 6 | 0 | 0 | 0.34 | 2 | 2 | 0 |
| css.Delitioner 0.11 | 8 | 4 | 298 | 0 | 0.34 | 3 | 3 | 0 |
| dft.Cyanide 1.90 | 8 | 6 | 98 | 0 | 0.28 | 0 | 0 | 0 |
| dz.Caedo 1.4 | 8 | 6 | 555 | 0 | 0.34 | 1 | 1 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| kawigi.sbf.FloodMini 1.4 | 8 | 7 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| kid.Toa .0.5 | 8 | 7 | 0 | 0 | 0.26 | 1 | 1 | 0 |
| kms.Golden 0.10 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| lucasslf.Dodger 1.0 | 8 | 7 | 20 | 0 | 0.32 | 0 | 0 | 0 |
| mk.Alpha 0.2.1 | 8 | 8 | 0 | 0 | 0.28 | 0 | 0 | 0 |
| mladjo.Grrrrr 0.9 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| nz.jdc.nano.NeophytePattern 1.1 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| pedersen.Hubris 2.4 | 8 | 7 | 0 | 0 | 0.37 | 1 | 1 | 0 |
| ph.micro.Pikeman 0.4.5 | 8 | 7 | 298 | 0 | 0.29 | 0 | 0 | 0 |
| suh.mega.WaveSurferPG 1.06 | 8 | 7 | 0 | 0 | 0.36 | 1 | 1 | 0 |
| synapse.rsim.GeomancyBS 0.11 | 8 | 8 | 0 | 0 | 0.42 | 0 | 0 | 0 |
| theo.avenge.Pequod 1.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| theo.real.Ahab 1.0 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| tm.Yuugao 1.0 | 8 | 7 | 0 | 0 | 0.32 | 1 | 1 | 0 |
| trab.Crusader 0.1.7 | 8 | 7 | 0 | 0 | 0.26 | 1 | 1 | 0 |
| wiki.mini.Sedan 1.0 | 8 | 8 | 0 | 0 | 0.28 | 0 | 0 | 0 |

214 of 240 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 13288 | 2 | 13206 | 13206 (99.4%) | 82 (0.6%) | 0 (0.0%) | 50 | 21 | 27 |
| ak.Fermat 2.0 | 11933 | 9 | 11897 | 11895 (99.7%) | 38 (0.3%) | 2 (0.0%) | 225 | 38 | 42 |
| ary.SMG 1.01 | 20008 | 4 | 19989 | 19987 (99.9%) | 21 (0.1%) | 2 (0.0%) | 148 | 51 | 40 |
| ary.mini.Nimi 1.0 | 19413 | 2 | 19416 | 19413 (100.0%) | 0 (0.0%) | 3 (0.0%) | 261 | 22 | 54 |
| bayen.nut.Squirrel 1.621 | 22262 | 4 | 22248 | 22243 (99.9%) | 19 (0.1%) | 5 (0.0%) | 53 | 33 | 41 |
| brainfade.Fallen 0.63 | 13766 | 1 | 13766 | 13766 (100.0%) | 0 (0.0%) | 0 (0.0%) | 99 | 14 | 90 |
| can.Pookie 1.1 | 9749 | 3 | 9768 | 9749 (100.0%) | 0 (0.0%) | 19 (0.2%) | 222 | 64 | 26 |
| cf.mini.Chiva 1.0 | 5489 | 14 | 5498 | 5489 (100.0%) | 0 (0.0%) | 9 (0.2%) | 352 | 152 | 24 |
| cf.proto.Shiva 2.2 | 13984 | 2 | 13987 | 13984 (100.0%) | 0 (0.0%) | 3 (0.0%) | 205 | 25 | 43 |
| chase.pm.Pytko 1.0 | 13020 | 21 | 13020 | 13019 (100.0%) | 1 (0.0%) | 1 (0.0%) | 605 | 118 | 49 |
| css.Delitioner 0.11 | 10478 | 20 | 10459 | 10459 (99.8%) | 19 (0.2%) | 0 (0.0%) | 208 | 109 | 60 |
| dft.Cyanide 1.90 | 15585 | 709 | 15585 | 15584 (100.0%) | 1 (0.0%) | 1 (0.0%) | 39 | 22 | 30 |
| dz.Caedo 1.4 | 10701 | 331 | 10666 | 10666 (99.7%) | 35 (0.3%) | 0 (0.0%) | 78 | 105 | 37 |
| kawigi.mini.Fhqwhgads 1.1 | 12089 | 478 | 12089 | 12089 (100.0%) | 0 (0.0%) | 0 (0.0%) | 15 | 20 | 29 |
| kawigi.sbf.FloodMini 1.4 | 10697 | 386 | 10696 | 10696 (100.0%) | 1 (0.0%) | 0 (0.0%) | 77 | 50 | 35 |
| kid.Toa .0.5 | 14121 | 1 | 14855 | 14119 (100.0%) | 2 (0.0%) | 736 (5.0%) | 921 | 52 | 27 |
| kms.Golden 0.10 | 10621 | 6 | 10621 | 10621 (100.0%) | 0 (0.0%) | 0 (0.0%) | 157 | 32 | 59 |
| lucasslf.Dodger 1.0 | 26227 | 566 | 26225 | 26225 (100.0%) | 2 (0.0%) | 0 (0.0%) | 25 | 22 | 31 |
| mk.Alpha 0.2.1 | 17091 | 1 | 17092 | 17089 (100.0%) | 2 (0.0%) | 3 (0.0%) | 80 | 18 | 21 |
| mladjo.Grrrrr 0.9 | 14335 | 3 | 14335 | 14335 (100.0%) | 0 (0.0%) | 0 (0.0%) | 90 | 22 | 28 |
| nz.jdc.nano.NeophytePattern 1.1 | 7098 | 20 | 7117 | 7091 (99.9%) | 7 (0.1%) | 26 (0.4%) | 552 | 162 | 36 |
| pedersen.Hubris 2.4 | 9550 | 16 | 9558 | 9549 (100.0%) | 1 (0.0%) | 9 (0.1%) | 302 | 130 | 47 |
| ph.micro.Pikeman 0.4.5 | 14520 | 1 | 14501 | 14500 (99.9%) | 20 (0.1%) | 1 (0.0%) | 52 | 8 | 24 |
| suh.mega.WaveSurferPG 1.06 | 18684 | 205 | 19061 | 18682 (100.0%) | 2 (0.0%) | 379 (2.0%) | 574 | 136 | 70 |
| synapse.rsim.GeomancyBS 0.11 | 14627 | 16 | 14626 | 14626 (100.0%) | 1 (0.0%) | 0 (0.0%) | 542 | 184 | 62 |
| theo.avenge.Pequod 1.0 | 12737 | 1 | 12748 | 12736 (100.0%) | 1 (0.0%) | 12 (0.1%) | 124 | 38 | 35 |
| theo.real.Ahab 1.0 | 16635 | 2 | 16642 | 16634 (100.0%) | 1 (0.0%) | 8 (0.0%) | 203 | 59 | 31 |
| tm.Yuugao 1.0 | 11113 | 13 | 11113 | 11113 (100.0%) | 0 (0.0%) | 0 (0.0%) | 341 | 78 | 43 |
| trab.Crusader 0.1.7 | 19000 | 5 | 18999 | 18999 (100.0%) | 1 (0.0%) | 0 (0.0%) | 278 | 68 | 32 |
| wiki.mini.Sedan 1.0 | 11956 | 442 | 11958 | 11956 (100.0%) | 0 (0.0%) | 2 (0.0%) | 71 | 13 | 32 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 1935 | 12337 (637.6%) | 0 |
| ak.Fermat 2.0 | 3988 | 9477 (237.6%) | 1334 |
| ary.SMG 1.01 | 3886 | 17727 (456.2%) | 1290 |
| ary.mini.Nimi 1.0 | 4579 | 17616 (384.7%) | 917 |
| bayen.nut.Squirrel 1.621 | 2191 | 21409 (977.1%) | 281 |
| brainfade.Fallen 0.63 | 2215 | 13200 (595.9%) | 20 |
| can.Pookie 1.1 | 4670 | 6994 (149.8%) | 883 |
| cf.mini.Chiva 1.0 | 2823 | 2980 (105.6%) | 527 |
| cf.proto.Shiva 2.2 | 3886 | 12856 (330.8%) | 0 |
| chase.pm.Pytko 1.0 | 11866 | 3178 (26.8%) | 3972 |
| css.Delitioner 0.11 | 6840 | 4211 (61.6%) | 3253 |
| dft.Cyanide 1.90 | 2364 | 14871 (629.1%) | 203 |
| dz.Caedo 1.4 | 4257 | 7610 (178.8%) | 720 |
| kawigi.mini.Fhqwhgads 1.1 | 2027 | 11038 (544.5%) | 358 |
| kawigi.sbf.FloodMini 1.4 | 2805 | 9012 (321.3%) | 543 |
| kid.Toa .0.5 | 9754 | 13104 (134.3%) | 0 |
| kms.Golden 0.10 | 2500 | 9036 (361.4%) | 289 |
| lucasslf.Dodger 1.0 | 1789 | 25312 (1414.9%) | 0 |
| mk.Alpha 0.2.1 | 1994 | 16515 (828.2%) | 583 |
| mladjo.Grrrrr 0.9 | 2587 | 12795 (494.6%) | 0 |
| nz.jdc.nano.NeophytePattern 1.1 | 6343 | 635 (10.0%) | 3385 |
| pedersen.Hubris 2.4 | 7687 | 2829 (36.8%) | 3617 |
| ph.micro.Pikeman 0.4.5 | 1927 | 13722 (712.1%) | 25 |
| suh.mega.WaveSurferPG 1.06 | 6722 | 12294 (182.9%) | 4200 |
| synapse.rsim.GeomancyBS 0.11 | 11257 | 5332 (47.4%) | 9008 |
| theo.avenge.Pequod 1.0 | 3680 | 11404 (309.9%) | 334 |
| theo.real.Ahab 1.0 | 5012 | 14037 (280.1%) | 1728 |
| tm.Yuugao 1.0 | 5699 | 7617 (133.7%) | 1009 |
| trab.Crusader 0.1.7 | 5333 | 15467 (290.0%) | 879 |
| wiki.mini.Sedan 1.0 | 2322 | 11160 (480.6%) | 148 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 650 | 457 | 647 | 728 | 7.7 / 5.6 | 61 | 453 | 221 |
| ak.Fermat 2.0 | 650 | 459 | 650 | 695 | 14.3 / 9.6 | 462 | 761 | 261 |
| ary.SMG 1.01 | 650 | 395 | 641 | 1005 | 9.7 / 9.0 | 12 | 917 | 58 |
| ary.mini.Nimi 1.0 | 650 | 495 | 650 | 1030 | 7.3 / 4.6 | 37 | 957 | 3 |
| bayen.nut.Squirrel 1.621 | 650 | 433 | 588 | 1075 | 16.0 / 5.4 | 156 | 845 | 33 |
| brainfade.Fallen 0.63 | 650 | 370 | 650 | 789 | 4.7 / 5.2 | 2 | 189 | 0 |
| can.Pookie 1.1 | 650 | 432 | 534 | 613 | 21.0 / 15.8 | 544 | 2049 | 2 |
| cf.mini.Chiva 1.0 | 650 | 372 | 400 | 331 | 66.7 / 20.4 | 1977 | 2097 | 108 |
| cf.proto.Shiva 2.2 | 650 | 438 | 650 | 840 | 7.4 / 4.9 | 60 | 271 | 0 |
| chase.pm.Pytko 1.0 | 650 | 486 | 625 | 711 | 29.2 / 31.1 | 492 | 2632 | 4024 |
| css.Delitioner 0.11 | 650 | 340 | 494 | 571 | 41.4 / 25.8 | 1760 | 3878 | 24 |
| dft.Cyanide 1.90 | 650 | 480 | 650 | 849 | 6.1 / 3.0 | 1 | 715 | 2763 |
| dz.Caedo 1.4 | 650 | 278 | 619 | 612 | 32.3 / 19.5 | 1477 | 1347 | 988 |
| kawigi.mini.Fhqwhgads 1.1 | 650 | 349 | 650 | 681 | 9.5 / 5.0 | 56 | 940 | 987 |
| kawigi.sbf.FloodMini 1.4 | 650 | 333 | 619 | 620 | 18.3 / 11.6 | 690 | 1462 | 1240 |
| kid.Toa .0.5 | 650 | 427 | 525 | 1093 | 18.9 / 5.6 | 89 | 34 | 98 |
| kms.Golden 0.10 | 650 | 311 | 619 | 617 | 10.7 / 10.7 | 268 | 620 | 535 |
| lucasslf.Dodger 1.0 | 650 | 410 | 650 | 1235 | 4.8 / 6.5 | 2 | 488 | 1361 |
| mk.Alpha 0.2.1 | 650 | 543 | 619 | 890 | 7.3 / 1.6 | 52 | 417 | 0 |
| mladjo.Grrrrr 0.9 | 650 | 431 | 631 | 775 | 8.1 / 7.7 | 51 | 420 | 542 |
| nz.jdc.nano.NeophytePattern 1.1 | 650 | 337 | 525 | 387 | 61.0 / 30.5 | 4063 | 3615 | 1576 |
| pedersen.Hubris 2.4 | 650 | 403 | 563 | 532 | 49.5 / 25.1 | 2829 | 4062 | 116 |
| ph.micro.Pikeman 0.4.5 | 650 | 507 | 650 | 792 | 3.4 / 2.6 | 0 | 31 | 310 |
| suh.mega.WaveSurferPG 1.06 | 650 | 320 | 556 | 901 | 29.9 / 19.4 | 1176 | 1825 | 978 |
| synapse.rsim.GeomancyBS 0.11 | 650 | 357 | 584 | 767 | 32.0 / 27.3 | 490 | 3147 | 73 |
| theo.avenge.Pequod 1.0 | 650 | 485 | 650 | 796 | 9.9 / 9.0 | 17 | 624 | 60 |
| theo.real.Ahab 1.0 | 650 | 493 | 650 | 947 | 11.0 / 10.4 | 43 | 779 | 58 |
| tm.Yuugao 1.0 | 650 | 409 | 616 | 684 | 22.0 / 17.5 | 581 | 1281 | 65 |
| trab.Crusader 0.1.7 | 650 | 429 | 650 | 985 | 8.8 / 13.1 | 52 | 1476 | 31 |
| wiki.mini.Sedan 1.0 | 650 | 466 | 650 | 686 | 6.3 / 3.1 | 0 | 415 | 296 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 3.0% | 89 | 33 | 3 | 2.9 | 50 / 12337 (0%) | 0 | 0 |
| ak.Fermat 2.0 | 4.1% | 98 | 27 | 3 | 9.0 | 196 / 9477 (2%) | 0 | 0 |
| ary.SMG 1.01 | 2.2% | 131 | 100 | 3 | 8.2 | 195 / 17727 (1%) | 0 | 0 |
| ary.mini.Nimi 1.0 | 1.0% | 100 | 30 | 3 | 6.7 | 155 / 17616 (1%) | 0 | 0 |
| bayen.nut.Squirrel 1.621 | 1.8% | 92 | 42 | 3 | 2.7 | 58 / 21409 (0%) | 0 | 0 |
| brainfade.Fallen 0.63 | 1.2% | 185 | 34 | 3 | 1.5 | 23 / 13200 (0%) | 0 | 0 |
| can.Pookie 1.1 | 3.8% | 87 | 229 | 3 | 10.0 | 230 / 6994 (3%) | 0 | 0 |
| cf.mini.Chiva 1.0 | 9.6% | 82 | 37 | 2 | 8.8 | 217 / 2980 (7%) | 0 | 0 |
| cf.proto.Shiva 2.2 | 1.3% | 98 | 38 | 3 | 3.2 | 81 / 12856 (1%) | 0 | 0 |
| chase.pm.Pytko 1.0 | 7.0% | 94 | 72 | 3 | 36.3 | 758 / 3178 (24%) | 0 | 0 |
| css.Delitioner 0.11 | 7.6% | 95 | 232 | 3 | 22.6 | 502 / 4211 (12%) | 0 | 0 |
| dft.Cyanide 1.90 | 3.5% | 77 | 31 | 3 | 2.8 | 66 / 14871 (0%) | 0 | 0 |
| dz.Caedo 1.4 | 9.5% | 94 | 1523 | 3 | 10.6 | 233 / 7610 (3%) | 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 4.4% | 84 | 43 | 3 | 3.1 | 55 / 11038 (0%) | 0 | 0 |
| kawigi.sbf.FloodMini 1.4 | 5.4% | 88 | 81 | 3 | 5.7 | 139 / 9012 (2%) | 0 | 0 |
| kid.Toa .0.5 | 1.4% | 74 | 35 | 2 | 5.9 | 86 / 13104 (1%) | 0 | 0 |
| kms.Golden 0.10 | 2.6% | 87 | 38 | 3 | 5.6 | 159 / 9036 (2%) | 0 | 0 |
| lucasslf.Dodger 1.0 | 2.7% | 90 | 58 | 3 | 2.3 | 37 / 25312 (0%) | 0 | 0 |
| mk.Alpha 0.2.1 | 0.5% | 78 | 304 | 3 | 2.2 | 55 / 16515 (0%) | 0 | 0 |
| mladjo.Grrrrr 0.9 | 1.9% | 91 | 42 | 3 | 5.4 | 121 / 12795 (1%) | 0 | 0 |
| nz.jdc.nano.NeophytePattern 1.1 | 11.3% | 82 | 48 | 3 | 24.0 | 561 / 635 (88%) | 0 | 0 |
| pedersen.Hubris 2.4 | 7.9% | 104 | 5183 | 3 | 25.0 | 516 / 2829 (18%) | 0 | 0 |
| ph.micro.Pikeman 0.4.5 | 0.6% | 81 | 44 | 3 | 2.9 | 55 / 13722 (0%) | 0 | 0 |
| suh.mega.WaveSurferPG 1.06 | 6.4% | 101 | 137 | 3 | 23.5 | 558 / 12294 (5%) | 0 | 0 |
| synapse.rsim.GeomancyBS 0.11 | 6.5% | 117 | 290 | 3 | 35.5 | 933 / 5332 (17%) | 0 | 0 |
| theo.avenge.Pequod 1.0 | 2.0% | 88 | 44 | 3 | 4.6 | 122 / 11404 (1%) | 0 | 0 |
| theo.real.Ahab 1.0 | 2.4% | 82 | 43 | 3 | 9.1 | 254 / 14037 (2%) | 0 | 0 |
| tm.Yuugao 1.0 | 4.2% | 89 | 122 | 3 | 11.9 | 290 / 7617 (4%) | 0 | 0 |
| trab.Crusader 0.1.7 | 2.9% | 74 | 59 | 3 | 12.7 | 327 / 15467 (2%) | 0 | 0 |
| wiki.mini.Sedan 1.0 | 2.7% | 77 | 45 | 3 | 2.6 | 64 / 11160 (1%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ak.Fermat 2.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ary.SMG 1.01 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ary.mini.Nimi 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bayen.nut.Squirrel 1.621 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| brainfade.Fallen 0.63 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| can.Pookie 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cf.mini.Chiva 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cf.proto.Shiva 2.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| chase.pm.Pytko 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| css.Delitioner 0.11 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dft.Cyanide 1.90 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dz.Caedo 1.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.sbf.FloodMini 1.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kid.Toa .0.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kms.Golden 0.10 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lucasslf.Dodger 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mk.Alpha 0.2.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mladjo.Grrrrr 0.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nz.jdc.nano.NeophytePattern 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pedersen.Hubris 2.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ph.micro.Pikeman 0.4.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| suh.mega.WaveSurferPG 1.06 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| synapse.rsim.GeomancyBS 0.11 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.avenge.Pequod 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.real.Ahab 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tm.Yuugao 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| trab.Crusader 0.1.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wiki.mini.Sedan 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | KiraNL.ChupaLite | 1 | 35 | 296 | 1.5% | 14.9% ± 5.8 | 12.2% | 36.2% / 41.6% | 6.5% | 0 / 0 | T?/M? | 89% |
| ak.Fermat 2.0 | ak.Fermat | 1 | 35 | 268 | 1.3% | 9.5% ± 3.9 | 9.8% | 26.7% / 24.4% | 7.4% | 0 / 0 | T?/M? | 91% |
| ary.SMG 1.01 | ary.SMG | 1 | 35 | 262 | 1.7% | 11.1% ± 4.4 | 11.0% | 25.0% / 28.0% | 3.5% | 0 / 0 | T?/M? | 81% |
| ary.mini.Nimi 1.0 | ary.mini.Nimi | 1 | 35 | 284 | 0.8% | 6.2% ± 3.3 | 9.3% | 21.5% / 23.9% | 5.1% | 0 / 0 | T?/M? | 93% |
| bayen.nut.Squirrel 1.621 | bayen.nut.Squirrel | 1 | 35 | 308 | 0.4% | 15.7% ± 10.3 | 16.4% | 48.5% / 50.3% | 4.1% | 0 / 0 | T?/M? | 96% |
| brainfade.Fallen 0.63 | brainfade.Fallen | 1 | 35 | 298 | 2.1% | 13.3% ± 6.1 | 9.1% | 24.3% / 27.7% | 35.9% | 0 / 0 | T?/M? | 85% |
| can.Pookie 1.1 | can.Pookie | 1 | 35 | 272 | 4.6% | 6.8% ± 2.4 | 13.1% | 22.7% / 20.6% | 5.6% | 0 / 0 | T2/M? | 80% |
| cf.mini.Chiva 1.0 | cf.mini.Chiva | 1 | 35 | 284 | 9.8% | 10.8% ± 3.3 | 24.8% | 41.5% / 38.1% | 2.4% | 0 / 0 | T?/M? | 82% |
| cf.proto.Shiva 2.2 | cf.proto.Shiva | 1 | 35 | 288 | 1.2% | 9.2% ± 5.1 | 8.8% | 19.8% / 22.3% | 26.4% | 0 / 0 | T?/M? | 90% |
| chase.pm.Pytko 1.0 | chase.pm.Pytko | 1 | 35 | 288 | 6.5% | 9.4% ± 1.8 | 11.8% | 27.1% / 23.3% | 6.8% | 0 / 0 | T3/M0 | 66% |
| css.Delitioner 0.11 | css.Delitioner | 1 | 35 | 290 | 10.1% | 9.6% ± 1.9 | 15.2% | 25.3% / 25.8% | 2.5% | 0 / 0 | T3/M0 | 60% |
| dft.Cyanide 1.90 | dft.Cyanide | 1 | 35 | 278 | 4.4% | 10.9% ± 5.7 | 10.9% | 25.2% / 20.8% | 12.0% | 0 / 0 | T?/M? | 91% |
| dz.Caedo 1.4 | dz.Caedo | 1 | 35 | 264 | 10.9% | 9.7% ± 2.5 | 16.2% | 25.9% / 24.6% | 1.9% | 0 / 0 | T3/M? | 75% |
| kawigi.mini.Fhqwhgads 1.1 | kawigi.mini.Fhqwhgads | 1 | 35 | 316 | 5.5% | 10.7% ± 5.5 | 12.9% | 22.6% / 18.7% | 7.7% | 0 / 0 | T?/M? | 94% |
| kawigi.sbf.FloodMini 1.4 | kawigi.sbf.FloodMini | 1 | 35 | 312 | 6.2% | 13.0% ± 5.8 | 14.4% | 19.8% / 18.3% | 6.5% | 0 / 0 | T?/M? | 86% |
| kid.Toa .0.5 | kid.Toa | 1 | 35 | 262 | 0.9% | 7.5% ± 3.6 | 11.8% | 26.3% / 24.0% | 8.7% | 0 / 0 | T?/M0 | 96% |
| kms.Golden 0.10 | kms.Golden | 1 | 35 | 274 | 2.3% | 12.5% ± 5.5 | 11.5% | 19.5% / 21.3% | 14.6% | 0 / 0 | T?/M? | 83% |
| lucasslf.Dodger 1.0 | lucasslf.Dodger | 1 | 35 | 292 | 3.4% | 14.0% ± 5.5 | 11.7% | 22.8% / 19.8% | 6.0% | 0 / 0 | T?/M? | 86% |
| mk.Alpha 0.2.1 | mk.Alpha | 1 | 35 | 268 | 0.4% | 7.7% ± 5.5 | 10.3% | 31.2% / 24.5% | 1.0% | 0 / 0 | T?/M? | 97% |
| mladjo.Grrrrr 0.9 | mladjo.Grrrrr | 1 | 35 | 284 | 0.7% | 10.3% ± 6.8 | 10.3% | 25.8% / 23.6% | 9.6% | 0 / 0 | T?/M? | 95% |
| nz.jdc.nano.NeophytePattern 1.1 | nz.jdc.nano.NeophytePattern | 1 | 35 | 340 | 12.7% | 9.3% ± 2.0 | 17.9% | 26.3% / 24.6% | 15.0% | 0 / 0 | T3/M? | 74% |
| pedersen.Hubris 2.4 | pedersen.Hubris | 1 | 35 | 292 | 9.1% | 7.2% ± 1.7 | 16.1% | 28.1% / 25.8% | 3.9% | 0 / 0 | T3/M0 | 74% |
| ph.micro.Pikeman 0.4.5 | ph.micro.Pikeman | 1 | 35 | 300 | 0.9% | 8.2% ± 4.3 | 9.4% | 24.0% / 22.6% | 9.3% | 0 / 0 | T?/M? | 92% |
| suh.mega.WaveSurferPG 1.06 | suh.mega.WaveSurferPG | 1 | 35 | 318 | 7.4% | 7.8% ± 1.5 | 14.2% | 23.3% / 25.6% | 12.7% | 0 / 0 | T3/M1 | 65% |
| synapse.rsim.GeomancyBS 0.11 | synapse.rsim.GeomancyBS | 1 | 35 | 326 | 6.0% | 6.0% ± 1.4 | 11.2% | 23.2% / 24.2% | 3.2% | 0 / 0 | T2/M1 | 70% |
| theo.avenge.Pequod 1.0 | theo.avenge.Pequod | 1 | 35 | 304 | 1.3% | 11.0% ± 4.7 | 9.0% | 23.7% / 23.8% | 1.9% | 0 / 0 | T?/M? | 91% |
| theo.real.Ahab 1.0 | theo.real.Ahab | 1 | 35 | 288 | 2.4% | 11.1% ± 3.4 | 11.4% | 24.9% / 24.2% | 1.5% | 0 / 0 | T?/M? | 88% |
| tm.Yuugao 1.0 | tm.Yuugao | 1 | 35 | 268 | 3.2% | 12.1% ± 3.9 | 13.4% | 27.7% / 25.5% | 17.6% | 0 / 0 | T?/M? | 85% |
| trab.Crusader 0.1.7 | trab.Crusader | 1 | 35 | 288 | 2.7% | 11.4% ± 3.0 | 10.6% | 23.6% / 24.0% | 3.2% | 0 / 0 | T3/M? | 85% |
| wiki.mini.Sedan 1.0 | wiki.mini.Sedan | 1 | 35 | 292 | 3.8% | 4.2% ± 5.0 | 9.2% | 28.8% / 26.6% | 5.5% | 0 / 0 | T?/M? | 99% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.9sa vs hadur2.Hadur 3.9

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 89.3% ± 5.7 | 77.1% ± 2.7 | +12.2 ± 7.5 |
| ak.Fermat 2.0 | 87.5% ± 6.6 | 83.2% ± 2.9 | +4.3 ± 7.9 |
| ary.SMG 1.01 | 86.0% ± 3.6 | 69.9% ± 4.4 | +16.1 ± 5.6 |
| ary.mini.Nimi 1.0 | 92.8% ± 1.9 | 73.6% ± 1.9 | +19.2 ± 3.3 |
| bayen.nut.Squirrel 1.621 | 92.7% ± 3.7 | 84.9% ± 5.6 | +7.8 ± 8.0 |
| brainfade.Fallen 0.63 | 90.4% ± 4.7 | 69.8% ± 4.0 | +20.5 ± 6.1 |
| can.Pookie 1.1 | 81.0% ± 1.9 | 79.5% ± 3.3 | +1.6 ± 4.4 |
| cf.mini.Chiva 1.0 | 85.0% ± 1.3 | 81.5% ± 2.7 | +3.4 ± 3.0 |
| cf.proto.Shiva 2.2 | 92.4% ± 1.7 | 68.1% ± 4.6 | +24.4 ± 5.2 |
| chase.pm.Pytko 1.0 | 67.8% ± 2.7 | 70.3% ± 5.2 | -2.6 ± 6.8 |
| css.Delitioner 0.11 | 70.6% ± 4.1 | 81.0% ± 2.8 | -10.4 ± 5.3 |
| dft.Cyanide 1.90 | 94.7% ± 2.6 | 64.7% ± 5.0 | +30.0 ± 5.4 |
| dz.Caedo 1.4 | 76.3% ± 5.4 | 85.7% ± 2.9 | -9.4 ± 7.2 |
| kawigi.mini.Fhqwhgads 1.1 | 91.4% ± 3.0 | 81.8% ± 3.2 | +9.6 ± 5.6 |
| kawigi.sbf.FloodMini 1.4 | 83.5% ± 7.2 | 82.2% ± 2.7 | +1.3 ± 8.7 |
| kid.Toa .0.5 | 92.6% ± 3.5 | 82.8% ± 3.2 | +9.8 ± 4.1 |
| kms.Golden 0.10 | 82.0% ± 6.4 | 72.9% ± 1.6 | +9.1 ± 6.5 |
| lucasslf.Dodger 1.0 | 88.4% ± 3.1 | 79.8% ± 2.0 | +8.6 ± 3.6 |
| mk.Alpha 0.2.1 | 97.8% ± 1.1 | 89.2% ± 2.0 | +8.6 ± 2.1 |
| mladjo.Grrrrr 0.9 | 87.5% ± 5.6 | 72.6% ± 3.8 | +14.9 ± 6.1 |
| nz.jdc.nano.NeophytePattern 1.1 | 77.7% ± 2.4 | 83.6% ± 1.2 | -5.9 ± 2.5 |
| pedersen.Hubris 2.4 | 76.1% ± 2.0 | 83.2% ± 2.6 | -7.1 ± 2.4 |
| ph.micro.Pikeman 0.4.5 | 94.7% ± 3.3 | 77.7% ± 2.9 | +16.9 ± 4.4 |
| suh.mega.WaveSurferPG 1.06 | 73.6% ± 4.5 | 76.8% ± 4.6 | -3.2 ± 6.6 |
| synapse.rsim.GeomancyBS 0.11 | 67.8% ± 3.3 | 73.8% ± 3.1 | -6.0 ± 4.3 |
| theo.avenge.Pequod 1.0 | 87.8% ± 2.2 | 67.7% ± 6.0 | +20.1 ± 4.8 |
| theo.real.Ahab 1.0 | 85.4% ± 3.4 | 65.4% ± 3.2 | +20.0 ± 3.2 |
| tm.Yuugao 1.0 | 78.1% ± 5.1 | 78.2% ± 4.4 | -0.1 ± 7.0 |
| trab.Crusader 0.1.7 | 79.6% ± 7.2 | 68.5% ± 4.4 | +11.1 ± 8.5 |
| wiki.mini.Sedan 1.0 | 95.1% ± 2.6 | 78.3% ± 3.9 | +16.8 ± 2.8 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | +12.2 ± 7.5 | +6.4 ± 6.2 | +6.4 ± 6.2 | -5.7 ± 11.4 |
| ak.Fermat 2.0 | +4.3 ± 7.9 | +1.1 ± 7.0 | +1.1 ± 7.0 | -11.2 ± 6.5 |
| ary.SMG 1.01 | +16.1 ± 5.6 | +12.9 ± 6.0 | +12.9 ± 6.0 | -7.0 ± 7.2 |
| ary.mini.Nimi 1.0 | +19.2 ± 3.3 | +10.0 ± 3.6 | +10.0 ± 3.6 | +3.4 ± 6.5 |
| bayen.nut.Squirrel 1.621 | +7.8 ± 8.0 | +2.2 ± 5.4 | +2.1 ± 5.4 | +0.7 ± 15.5 |
| brainfade.Fallen 0.63 | +20.5 ± 6.1 | +15.7 ± 6.9 | +15.7 ± 6.9 | -9.1 ± 9.2 |
| can.Pookie 1.1 | +1.6 ± 4.4 | +0.7 ± 5.2 | +0.7 ± 5.2 | -9.4 ± 6.1 |
| cf.mini.Chiva 1.0 | +3.4 ± 3.0 | +2.5 ± 3.9 | +2.5 ± 3.9 | +7.4 ± 3.4 |
| cf.proto.Shiva 2.2 | +24.4 ± 5.2 | +14.3 ± 6.4 | +14.3 ± 6.4 | +9.1 ± 3.3 |
| chase.pm.Pytko 1.0 | -2.6 ± 6.8 | +1.4 ± 7.8 | +1.4 ± 7.8 | -7.7 ± 5.2 |
| css.Delitioner 0.11 | -10.4 ± 5.3 | -14.6 ± 7.0 | -14.6 ± 7.0 | -8.0 ± 4.0 |
| dft.Cyanide 1.90 | +30.0 ± 5.4 | +16.8 ± 5.3 | +16.8 ± 5.3 | +22.1 ± 9.2 |
| dz.Caedo 1.4 | -9.4 ± 7.2 | -3.9 ± 10.0 | -3.9 ± 10.0 | -18.9 ± 4.6 |
| kawigi.mini.Fhqwhgads 1.1 | +9.6 ± 5.6 | +2.5 ± 5.2 | +2.5 ± 5.2 | -1.2 ± 5.8 |
| kawigi.sbf.FloodMini 1.4 | +1.3 ± 8.7 | -3.9 ± 8.2 | -3.9 ± 8.2 | -4.2 ± 8.1 |
| kid.Toa .0.5 | +9.8 ± 4.1 | +6.5 ± 4.9 | +6.4 ± 4.9 | +3.4 ± 4.9 |
| kms.Golden 0.10 | +9.1 ± 6.5 | +5.0 ± 4.2 | +5.0 ± 4.2 | -7.2 ± 4.1 |
| lucasslf.Dodger 1.0 | +8.6 ± 3.6 | +3.2 ± 3.2 | +3.2 ± 3.2 | -23.4 ± 7.7 |
| mk.Alpha 0.2.1 | +8.6 ± 2.1 | +2.5 ± 2.0 | +2.5 ± 2.0 | +2.1 ± 4.6 |
| mladjo.Grrrrr 0.9 | +14.9 ± 6.1 | +7.5 ± 5.8 | +7.5 ± 5.8 | -4.3 ± 5.9 |
| nz.jdc.nano.NeophytePattern 1.1 | -5.9 ± 2.5 | -5.4 ± 3.2 | -5.4 ± 3.2 | -5.5 ± 2.5 |
| pedersen.Hubris 2.4 | -7.1 ± 2.4 | -8.6 ± 3.1 | -8.6 ± 3.1 | -6.1 ± 2.3 |
| ph.micro.Pikeman 0.4.5 | +16.9 ± 4.4 | +3.9 ± 4.2 | +3.9 ± 4.2 | -0.3 ± 11.0 |
| suh.mega.WaveSurferPG 1.06 | -3.2 ± 6.6 | -0.7 ± 7.8 | -0.7 ± 7.8 | -8.8 ± 6.5 |
| synapse.rsim.GeomancyBS 0.11 | -6.0 ± 4.3 | -7.1 ± 4.4 | -7.1 ± 4.4 | -6.6 ± 4.4 |
| theo.avenge.Pequod 1.0 | +20.1 ± 4.8 | +17.5 ± 6.0 | +17.5 ± 6.0 | -0.5 ± 6.5 |
| theo.real.Ahab 1.0 | +20.0 ± 3.2 | +18.2 ± 3.4 | +18.2 ± 3.4 | +0.0 ± 8.3 |
| tm.Yuugao 1.0 | -0.1 ± 7.0 | -0.4 ± 7.2 | -0.4 ± 7.2 | -8.8 ± 4.9 |
| trab.Crusader 0.1.7 | +11.1 ± 8.5 | +8.9 ± 8.6 | +8.9 ± 8.6 | -12.8 ± 5.7 |
| wiki.mini.Sedan 1.0 | +16.8 ± 2.8 | +5.7 ± 3.1 | +5.7 ± 3.1 | +9.1 ± 9.9 |
| All pairs | +8.1 ± 1.6 | +4.0 ± 1.3 | +4.0 ± 1.3 | -3.7 ± 1.5 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or, for a Hadur build, a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 8 | 3 | +12.2 ± 7.5 | +11.9 ± 11.6 |
| ak.Fermat 2.0 | 8 | 2 | +4.3 ± 7.9 | +3.5 ± 56.9 |
| ary.SMG 1.01 | 8 | 5 | +16.1 ± 5.6 | +15.0 ± 9.9 |
| ary.mini.Nimi 1.0 | 8 | 7 | +19.2 ± 3.3 | +19.7 ± 3.7 |
| bayen.nut.Squirrel 1.621 | 8 | 6 | +7.8 ± 8.0 | +10.2 ± 9.0 |
| brainfade.Fallen 0.63 | 8 | 5 | +20.5 ± 6.1 | +23.3 ± 9.7 |
| can.Pookie 1.1 | 8 | 8 | +1.6 ± 4.4 | +1.6 ± 4.4 |
| cf.mini.Chiva 1.0 | 8 | 7 | +3.4 ± 3.0 | +3.8 ± 3.4 |
| cf.proto.Shiva 2.2 | 8 | 6 | +24.4 ± 5.2 | +22.9 ± 6.7 |
| chase.pm.Pytko 1.0 | 8 | 3 | -2.6 ± 6.8 | +1.8 ± 19.7 |
| css.Delitioner 0.11 | 8 | 4 | -10.4 ± 5.3 | -7.6 ± 3.6 |
| dft.Cyanide 1.90 | 8 | 4 | +30.0 ± 5.4 | +27.3 ± 2.4 |
| dz.Caedo 1.4 | 8 | 6 | -9.4 ± 7.2 | -5.8 ± 6.8 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 7 | +9.6 ± 5.6 | +8.4 ± 5.7 |
| kawigi.sbf.FloodMini 1.4 | 8 | 6 | +1.3 ± 8.7 | +1.1 ± 8.3 |
| kid.Toa .0.5 | 8 | 7 | +9.8 ± 4.1 | +10.8 ± 4.0 |
| kms.Golden 0.10 | 8 | 6 | +9.1 ± 6.5 | +7.4 ± 8.3 |
| lucasslf.Dodger 1.0 | 8 | 5 | +8.6 ± 3.6 | +8.1 ± 4.8 |
| mk.Alpha 0.2.1 | 8 | 6 | +8.6 ± 2.1 | +8.0 ± 2.6 |
| mladjo.Grrrrr 0.9 | 8 | 7 | +14.9 ± 6.1 | +16.3 ± 6.1 |
| nz.jdc.nano.NeophytePattern 1.1 | 8 | 8 | -5.9 ± 2.5 | -5.9 ± 2.5 |
| pedersen.Hubris 2.4 | 8 | 7 | -7.1 ± 2.4 | -7.0 ± 2.9 |
| ph.micro.Pikeman 0.4.5 | 8 | 6 | +16.9 ± 4.4 | +19.0 ± 3.5 |
| suh.mega.WaveSurferPG 1.06 | 8 | 7 | -3.2 ± 6.6 | -1.7 ± 6.7 |
| synapse.rsim.GeomancyBS 0.11 | 8 | 7 | -6.0 ± 4.3 | -5.6 ± 5.1 |
| theo.avenge.Pequod 1.0 | 8 | 7 | +20.1 ± 4.8 | +20.8 ± 5.5 |
| theo.real.Ahab 1.0 | 8 | 7 | +20.0 ± 3.2 | +19.7 ± 3.7 |
| tm.Yuugao 1.0 | 8 | 6 | -0.1 ± 7.0 | +2.6 ± 8.1 |
| trab.Crusader 0.1.7 | 8 | 6 | +11.1 ± 8.5 | +11.6 ± 12.6 |
| wiki.mini.Sedan 1.0 | 8 | 8 | +16.8 ± 2.8 | +16.8 ± 2.8 |
| All pairs | 240 | 179 | +8.1 ± 1.6 | +8.5 ± 1.7 |

# Bench: hadur2.Hadur 3.9sa baseline (hadur2.Hadur 3.9) (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 2947 over 240 battles (12.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | mid-shield | 77.1% ± 2.7 | 90.0% ± 3.8 | 65.7% ± 1.9 | 252 / 280 | 17.5% ± 1.1 | 8.4% ± 0.7 | 175 | 0 | 1.11 / 24.4 |
| ak.Fermat 2.0 | mid-shield | 83.2% ± 2.9 | 95.0% ± 2.8 | 71.3% ± 3.2 | 266 / 280 | 16.9% ± 0.7 | 8.1% ± 5.0 | 90 | 0 | 1.15 / 17.7 |
| ary.SMG 1.01 | mid-shield | 69.9% ± 4.4 | 83.6% ± 5.7 | 57.2% ± 3.5 | 234 / 280 | 14.5% ± 1.5 | 11.4% ± 6.8 | 127 | 0 | 1.13 / 146.4 |
| ary.mini.Nimi 1.0 | mid-shield | 73.6% ± 1.9 | 88.9% ± 3.0 | 57.8% ± 1.2 | 249 / 280 | 12.2% ± 0.4 | 6.7% ± 0.4 | 109 | 0 | 0.98 / 152.5 |
| bayen.nut.Squirrel 1.621 | mid-shield | 84.9% ± 5.6 | 96.4% ± 3.8 | 73.9% ± 9.3 | 270 / 280 | 24.0% ± 10.1 | 6.7% ± 0.9 | 104 | 0 | 1.01 / 227.9 |
| brainfade.Fallen 0.63 | mid-shield | 69.8% ± 4.0 | 81.8% ± 6.6 | 57.9% ± 1.5 | 229 / 280 | 15.9% ± 1.4 | 7.3% ± 0.5 | 108 | 0 | 0.97 / 500.0 |
| can.Pookie 1.1 | mid-shield | 79.5% ± 3.3 | 94.3% ± 3.8 | 64.8% ± 3.2 | 264 / 280 | 17.5% ± 0.9 | 6.9% ± 0.7 | 90 | 0 | 0.90 / 237.7 |
| cf.mini.Chiva 1.0 | mid-shield | 81.5% ± 2.7 | 93.6% ± 2.8 | 69.3% ± 3.3 | 262 / 280 | 16.2% ± 1.4 | 6.2% ± 0.4 | 93 | 0 | 0.89 / 254.2 |
| cf.proto.Shiva 2.2 | mid-shield | 68.1% ± 4.6 | 84.6% ± 6.2 | 50.6% ± 3.4 | 237 / 280 | 11.3% ± 0.4 | 6.9% ± 0.4 | 113 | 0 | 0.99 / 104.5 |
| chase.pm.Pytko 1.0 | mid-shield | 70.3% ± 5.2 | 84.6% ± 5.4 | 56.0% ± 4.7 | 237 / 280 | 12.4% ± 0.7 | 6.9% ± 0.6 | 83 | 0 | 1.14 / 22.0 |
| css.Delitioner 0.11 | mid-shield | 81.0% ± 2.8 | 93.6% ± 4.0 | 69.6% ± 1.9 | 262 / 280 | 16.8% ± 0.4 | 10.2% ± 5.0 | 98 | 0 | 0.91 / 17.9 |
| dft.Cyanide 1.90 | mid-shield | 64.7% ± 5.0 | 82.1% ± 5.4 | 46.0% ± 5.3 | 230 / 280 | 10.4% ± 0.3 | 7.0% ± 0.5 | 77 | 0 | 1.03 / 13.2 |
| dz.Caedo 1.4 | mid-shield | 85.7% ± 2.9 | 90.7% ± 3.8 | 80.9% ± 2.9 | 254 / 280 | 20.2% ± 1.4 | 12.4% ± 0.4 | 96 | 0 | 0.93 / 16.6 |
| kawigi.mini.Fhqwhgads 1.1 | mid-shield | 81.8% ± 3.2 | 95.0% ± 3.6 | 67.4% ± 3.2 | 266 / 280 | 15.6% ± 0.7 | 5.0% ± 0.4 | 82 | 0 | 0.86 / 59.9 |
| kawigi.sbf.FloodMini 1.4 | mid-shield | 82.2% ± 2.7 | 96.1% ± 3.1 | 66.5% ± 3.3 | 269 / 280 | 14.1% ± 1.3 | 5.1% ± 0.4 | 99 | 0 | 0.86 / 30.2 |
| kid.Toa .0.5 | mid-shield | 82.8% ± 3.2 | 92.1% ± 4.8 | 73.9% ± 2.1 | 258 / 280 | 15.4% ± 0.4 | 6.1% ± 0.9 | 87 | 0 | 1.12 / 55.1 |
| kms.Golden 0.10 | mid-shield | 72.9% ± 1.6 | 87.9% ± 2.1 | 58.1% ± 1.6 | 246 / 280 | 14.3% ± 1.1 | 7.4% ± 1.0 | 87 | 0 | 0.92 / 14.8 |
| lucasslf.Dodger 1.0 | mid-shield | 79.8% ± 2.0 | 93.9% ± 2.4 | 65.3% ± 2.9 | 263 / 280 | 13.5% ± 0.5 | 6.8% ± 0.6 | 89 | 0 | 0.95 / 251.8 |
| mk.Alpha 0.2.1 | mid-shield | 89.2% ± 2.0 | 97.5% ± 2.0 | 80.9% ± 2.2 | 273 / 280 | 18.7% ± 0.5 | 5.3% ± 0.6 | 83 | 0 | 0.89 / 213.9 |
| mladjo.Grrrrr 0.9 | mid-shield | 72.6% ± 3.8 | 88.9% ± 4.8 | 56.7% ± 2.8 | 249 / 280 | 13.1% ± 1.1 | 7.3% ± 0.5 | 112 | 0 | 0.95 / 53.6 |
| nz.jdc.nano.NeophytePattern 1.1 | mid-shield | 83.6% ± 1.2 | 96.8% ± 2.4 | 72.2% ± 1.0 | 271 / 280 | 19.3% ± 0.8 | 9.0% ± 0.4 | 93 | 0 | 0.88 / 101.4 |
| pedersen.Hubris 2.4 | mid-shield | 83.2% ± 2.6 | 95.0% ± 3.1 | 72.4% ± 2.4 | 266 / 280 | 18.0% ± 0.8 | 7.8% ± 0.6 | 92 | 0 | 1.01 / 20.8 |
| ph.micro.Pikeman 0.4.5 | mid-shield | 77.7% ± 2.9 | 94.6% ± 3.2 | 58.0% ± 3.4 | 265 / 280 | 11.0% ± 0.5 | 5.7% ± 0.5 | 93 | 0 | 0.95 / 14.7 |
| suh.mega.WaveSurferPG 1.06 | mid-shield | 76.8% ± 4.6 | 84.3% ± 6.4 | 69.4% ± 3.8 | 236 / 280 | 16.9% ± 1.4 | 9.1% ± 0.6 | 117 | 0 | 0.98 / 27.1 |
| synapse.rsim.GeomancyBS 0.11 | mid-shield | 73.8% ± 3.1 | 87.5% ± 2.8 | 60.5% ± 4.0 | 245 / 280 | 12.2% ± 0.4 | 7.5% ± 0.4 | 98 | 0 | 1.03 / 15.6 |
| theo.avenge.Pequod 1.0 | mid-shield | 67.7% ± 6.0 | 81.1% ± 6.6 | 52.7% ± 5.3 | 227 / 280 | 10.5% ± 0.6 | 6.0% ± 0.5 | 86 | 0 | 1.44 / 20.3 |
| theo.real.Ahab 1.0 | mid-shield | 65.4% ± 3.2 | 78.9% ± 3.4 | 50.4% ± 3.3 | 221 / 280 | 10.6% ± 0.2 | 6.8% ± 0.3 | 96 | 0 | 1.61 / 18.1 |
| tm.Yuugao 1.0 | mid-shield | 78.2% ± 4.4 | 92.1% ± 5.1 | 64.8% ± 3.9 | 258 / 280 | 15.6% ± 0.9 | 7.2% ± 0.9 | 97 | 0 | 1.02 / 14.7 |
| trab.Crusader 0.1.7 | mid-shield | 68.5% ± 4.4 | 84.6% ± 5.3 | 52.4% ± 3.5 | 237 / 280 | 11.5% ± 0.4 | 7.4% ± 0.6 | 92 | 0 | 1.33 / 85.5 |
| wiki.mini.Sedan 1.0 | mid-shield | 78.3% ± 3.9 | 93.6% ± 3.8 | 60.7% ± 4.0 | 262 / 280 | 12.2% ± 0.8 | 5.1% ± 0.6 | 81 | 0 | 0.96 / 14.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 8 | 1201 | 14.6% | 78.7% | 0.0% | 6.7% | 617 |
| ak.Fermat 2.0 | 8 | 822 | 10.6% | 84.7% | 0.0% | 4.7% | 610 |
| ary.SMG 1.01 | 8 | 1505 | 19.1% | 72.5% | 0.0% | 8.4% | 833 |
| ary.mini.Nimi 1.0 | 8 | 1219 | 15.9% | 77.3% | 0.0% | 6.8% | 933 |
| bayen.nut.Squirrel 1.621 | 8 | 745 | 8.4% | 86.3% | 1.6% | 3.7% | 633 |
| brainfade.Fallen 0.63 | 8 | 1445 | 22.1% | 69.1% | 0.0% | 8.8% | 740 |
| can.Pookie 1.1 | 8 | 1005 | 9.9% | 85.8% | 0.3% | 4.0% | 612 |
| cf.mini.Chiva 1.0 | 8 | 894 | 12.6% | 82.5% | 0.3% | 4.6% | 659 |
| cf.proto.Shiva 2.2 | 8 | 1438 | 18.7% | 73.5% | 0.0% | 7.8% | 868 |
| chase.pm.Pytko 1.0 | 8 | 1392 | 19.3% | 72.4% | 0.0% | 8.3% | 789 |
| css.Delitioner 0.11 | 8 | 1005 | 11.2% | 83.8% | 0.1% | 4.9% | 662 |
| dft.Cyanide 1.90 | 8 | 1552 | 20.1% | 71.6% | 0.0% | 8.2% | 874 |
| dz.Caedo 1.4 | 8 | 855 | 19.0% | 74.5% | 0.0% | 6.5% | 625 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 825 | 10.6% | 84.6% | 0.0% | 4.8% | 587 |
| kawigi.sbf.FloodMini 1.4 | 8 | 797 | 8.6% | 87.4% | 0.0% | 4.0% | 627 |
| kid.Toa .0.5 | 8 | 865 | 15.9% | 78.1% | 0.0% | 6.0% | 1092 |
| kms.Golden 0.10 | 8 | 1292 | 16.5% | 75.9% | 0.5% | 7.1% | 689 |
| lucasslf.Dodger 1.0 | 8 | 951 | 11.2% | 84.0% | 0.0% | 4.9% | 836 |
| mk.Alpha 0.2.1 | 8 | 545 | 8.0% | 88.8% | 0.0% | 3.2% | 581 |
| mladjo.Grrrrr 0.9 | 8 | 1296 | 14.9% | 78.4% | 0.0% | 6.6% | 773 |
| nz.jdc.nano.NeophytePattern 1.1 | 8 | 892 | 6.3% | 90.9% | 0.0% | 2.8% | 528 |
| pedersen.Hubris 2.4 | 8 | 879 | 10.0% | 85.8% | 0.0% | 4.3% | 603 |
| ph.micro.Pikeman 0.4.5 | 8 | 962 | 9.8% | 86.2% | 0.0% | 4.0% | 782 |
| suh.mega.WaveSurferPG 1.06 | 8 | 1189 | 23.1% | 67.9% | 0.0% | 9.0% | 859 |
| synapse.rsim.GeomancyBS 0.11 | 8 | 1259 | 17.4% | 75.1% | 0.0% | 7.5% | 903 |
| theo.avenge.Pequod 1.0 | 8 | 1397 | 23.7% | 67.1% | 0.0% | 9.2% | 955 |
| theo.real.Ahab 1.0 | 8 | 1497 | 24.6% | 66.3% | 0.0% | 9.0% | 1003 |
| tm.Yuugao 1.0 | 8 | 1094 | 12.6% | 82.1% | 0.0% | 5.4% | 705 |
| trab.Crusader 0.1.7 | 8 | 1466 | 18.3% | 73.9% | 0.0% | 7.8% | 889 |
| wiki.mini.Sedan 1.0 | 8 | 942 | 11.9% | 82.6% | 0.0% | 5.4% | 649 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 8 | 5 | 1192 | 0 | 0.63 | 0 | 0 | 0 |
| ak.Fermat 2.0 | 8 | 2 | 1367 | 0 | 0.32 | 2 | 2 | 0 |
| ary.SMG 1.01 | 8 | 6 | 669 | 0 | 0.45 | 0 | 0 | 0 |
| ary.mini.Nimi 1.0 | 8 | 7 | 0 | 0 | 0.39 | 1 | 1 | 0 |
| bayen.nut.Squirrel 1.621 | 8 | 7 | 298 | 0 | 0.37 | 0 | 0 | 8 |
| brainfade.Fallen 0.63 | 8 | 7 | 298 | 0 | 0.39 | 1 | 1 | 0 |
| can.Pookie 1.1 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| cf.mini.Chiva 1.0 | 8 | 7 | 298 | 0 | 0.33 | 0 | 0 | 0 |
| cf.proto.Shiva 2.2 | 8 | 6 | 596 | 0 | 0.40 | 0 | 0 | 0 |
| chase.pm.Pytko 1.0 | 8 | 5 | 298 | 0 | 0.30 | 2 | 2 | 0 |
| css.Delitioner 0.11 | 8 | 7 | 582 | 0 | 0.35 | 0 | 0 | 0 |
| dft.Cyanide 1.90 | 8 | 5 | 0 | 0 | 0.28 | 3 | 3 | 0 |
| dz.Caedo 1.4 | 8 | 7 | 0 | 0 | 0.34 | 1 | 1 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 7 | 0 | 0 | 0.29 | 1 | 1 | 0 |
| kawigi.sbf.FloodMini 1.4 | 8 | 7 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| kid.Toa .0.5 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| kms.Golden 0.10 | 8 | 6 | 298 | 0 | 0.31 | 1 | 1 | 0 |
| lucasslf.Dodger 1.0 | 8 | 6 | 298 | 0 | 0.32 | 1 | 1 | 0 |
| mk.Alpha 0.2.1 | 8 | 6 | 298 | 0 | 0.30 | 1 | 1 | 0 |
| mladjo.Grrrrr 0.9 | 8 | 7 | 298 | 0 | 0.40 | 0 | 0 | 0 |
| nz.jdc.nano.NeophytePattern 1.1 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| pedersen.Hubris 2.4 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| ph.micro.Pikeman 0.4.5 | 8 | 7 | 0 | 0 | 0.33 | 1 | 1 | 0 |
| suh.mega.WaveSurferPG 1.06 | 8 | 7 | 0 | 0 | 0.42 | 1 | 1 | 0 |
| synapse.rsim.GeomancyBS 0.11 | 8 | 7 | 0 | 0 | 0.35 | 1 | 1 | 0 |
| theo.avenge.Pequod 1.0 | 8 | 7 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| theo.real.Ahab 1.0 | 8 | 7 | 0 | 0 | 0.34 | 1 | 1 | 0 |
| tm.Yuugao 1.0 | 8 | 7 | 0 | 0 | 0.35 | 1 | 1 | 0 |
| trab.Crusader 0.1.7 | 8 | 6 | 0 | 0 | 0.33 | 2 | 2 | 0 |
| wiki.mini.Sedan 1.0 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |

198 of 240 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 8726 | 16 | 8640 | 8638 (99.0%) | 88 (1.0%) | 2 (0.0%) | 316 | 126 | 162 |
| ak.Fermat 2.0 | 7983 | 18 | 7896 | 7889 (98.8%) | 94 (1.2%) | 7 (0.1%) | 312 | 114 | 29 |
| ary.SMG 1.01 | 13735 | 21 | 13688 | 13687 (99.7%) | 48 (0.3%) | 1 (0.0%) | 621 | 176 | 61 |
| ary.mini.Nimi 1.0 | 15018 | 8 | 15029 | 15017 (100.0%) | 1 (0.0%) | 12 (0.1%) | 900 | 159 | 63 |
| bayen.nut.Squirrel 1.621 | 9307 | 29 | 9291 | 9289 (99.8%) | 18 (0.2%) | 2 (0.0%) | 406 | 147 | 33 |
| brainfade.Fallen 0.63 | 10588 | 10 | 10567 | 10566 (99.8%) | 22 (0.2%) | 1 (0.0%) | 978 | 148 | 45 |
| can.Pookie 1.1 | 7539 | 6 | 7545 | 7539 (100.0%) | 0 (0.0%) | 6 (0.1%) | 251 | 112 | 17 |
| cf.mini.Chiva 1.0 | 8404 | 8 | 8398 | 8384 (99.8%) | 20 (0.2%) | 14 (0.2%) | 308 | 132 | 22 |
| cf.proto.Shiva 2.2 | 12368 | 6 | 12361 | 12326 (99.7%) | 42 (0.3%) | 35 (0.3%) | 741 | 126 | 41 |
| chase.pm.Pytko 1.0 | 11648 | 15 | 11631 | 11631 (99.9%) | 17 (0.1%) | 0 (0.0%) | 447 | 120 | 37 |
| css.Delitioner 0.11 | 9677 | 25 | 9640 | 9639 (99.6%) | 38 (0.4%) | 1 (0.0%) | 274 | 140 | 43 |
| dft.Cyanide 1.90 | 13953 | 581 | 13918 | 13917 (99.7%) | 36 (0.3%) | 1 (0.0%) | 771 | 108 | 32 |
| dz.Caedo 1.4 | 8300 | 19 | 8299 | 8299 (100.0%) | 1 (0.0%) | 0 (0.0%) | 88 | 168 | 36 |
| kawigi.mini.Fhqwhgads 1.1 | 7414 | 43 | 7414 | 7414 (100.0%) | 0 (0.0%) | 0 (0.0%) | 205 | 113 | 23 |
| kawigi.sbf.FloodMini 1.4 | 7609 | 52 | 7592 | 7592 (99.8%) | 17 (0.2%) | 0 (0.0%) | 209 | 78 | 32 |
| kid.Toa .0.5 | 8800 | 1 | 12212 | 8796 (100.0%) | 4 (0.0%) | 3416 (28.0%) | 1779 | 122 | 25 |
| kms.Golden 0.10 | 9918 | 19 | 9900 | 9898 (99.8%) | 20 (0.2%) | 2 (0.0%) | 423 | 142 | 41 |
| lucasslf.Dodger 1.0 | 14088 | 64 | 14066 | 14066 (99.8%) | 22 (0.2%) | 0 (0.0%) | 644 | 155 | 27 |
| mk.Alpha 0.2.1 | 7430 | 21 | 7410 | 7410 (99.7%) | 20 (0.3%) | 0 (0.0%) | 161 | 138 | 22 |
| mladjo.Grrrrr 0.9 | 11804 | 11 | 11783 | 11782 (99.8%) | 22 (0.2%) | 1 (0.0%) | 431 | 135 | 63 |
| nz.jdc.nano.NeophytePattern 1.1 | 6914 | 16 | 6932 | 6910 (99.9%) | 4 (0.1%) | 22 (0.3%) | 491 | 149 | 23 |
| pedersen.Hubris 2.4 | 7947 | 26 | 7947 | 7947 (100.0%) | 0 (0.0%) | 0 (0.0%) | 249 | 132 | 27 |
| ph.micro.Pikeman 0.4.5 | 11926 | 12 | 11927 | 11926 (100.0%) | 0 (0.0%) | 1 (0.0%) | 406 | 129 | 36 |
| suh.mega.WaveSurferPG 1.06 | 14881 | 54 | 14881 | 14880 (100.0%) | 1 (0.0%) | 1 (0.0%) | 892 | 211 | 62 |
| synapse.rsim.GeomancyBS 0.11 | 14603 | 22 | 14603 | 14601 (100.0%) | 2 (0.0%) | 2 (0.0%) | 633 | 217 | 45 |
| theo.avenge.Pequod 1.0 | 10897 | 6 | 10980 | 10895 (100.0%) | 2 (0.0%) | 85 (0.8%) | 975 | 92 | 45 |
| theo.real.Ahab 1.0 | 14431 | 7 | 14496 | 14430 (100.0%) | 1 (0.0%) | 66 (0.5%) | 1127 | 106 | 59 |
| tm.Yuugao 1.0 | 8949 | 9 | 8948 | 8947 (100.0%) | 2 (0.0%) | 1 (0.0%) | 423 | 110 | 82 |
| trab.Crusader 0.1.7 | 14280 | 16 | 14280 | 14280 (100.0%) | 0 (0.0%) | 0 (0.0%) | 721 | 187 | 44 |
| wiki.mini.Sedan 1.0 | 8635 | 54 | 8636 | 8635 (100.0%) | 0 (0.0%) | 1 (0.0%) | 231 | 104 | 25 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 8922 | 582 (6.5%) | 5059 |
| ak.Fermat 2.0 | 8650 | 555 (6.4%) | 1717 |
| ary.SMG 1.01 | 14158 | 1192 (8.4%) | 10421 |
| ary.mini.Nimi 1.0 | 16436 | 1440 (8.8%) | 13101 |
| bayen.nut.Squirrel 1.621 | 9553 | 869 (9.1%) | 6201 |
| brainfade.Fallen 0.63 | 11694 | 794 (6.8%) | 5720 |
| can.Pookie 1.1 | 8867 | 678 (7.6%) | 5091 |
| cf.mini.Chiva 1.0 | 9733 | 722 (7.4%) | 7238 |
| cf.proto.Shiva 2.2 | 15141 | 1179 (7.8%) | 11932 |
| chase.pm.Pytko 1.0 | 13002 | 867 (6.7%) | 7685 |
| css.Delitioner 0.11 | 9702 | 765 (7.9%) | 6559 |
| dft.Cyanide 1.90 | 15460 | 1386 (9.0%) | 11517 |
| dz.Caedo 1.4 | 8358 | 521 (6.2%) | 2963 |
| kawigi.mini.Fhqwhgads 1.1 | 8315 | 696 (8.4%) | 3714 |
| kawigi.sbf.FloodMini 1.4 | 9284 | 677 (7.3%) | 3502 |
| kid.Toa .0.5 | 20212 | 678 (3.4%) | 9778 |
| kms.Golden 0.10 | 10470 | 1082 (10.3%) | 9227 |
| lucasslf.Dodger 1.0 | 14007 | 1277 (9.1%) | 10894 |
| mk.Alpha 0.2.1 | 7800 | 898 (11.5%) | 6462 |
| mladjo.Grrrrr 0.9 | 12643 | 1115 (8.8%) | 11186 |
| nz.jdc.nano.NeophytePattern 1.1 | 6589 | 586 (8.9%) | 4532 |
| pedersen.Hubris 2.4 | 8409 | 590 (7.0%) | 5138 |
| ph.micro.Pikeman 0.4.5 | 12975 | 992 (7.6%) | 8955 |
| suh.mega.WaveSurferPG 1.06 | 14062 | 1316 (9.4%) | 11376 |
| synapse.rsim.GeomancyBS 0.11 | 15507 | 1356 (8.7%) | 15101 |
| theo.avenge.Pequod 1.0 | 17336 | 984 (5.7%) | 8601 |
| theo.real.Ahab 1.0 | 18695 | 1332 (7.1%) | 16173 |
| tm.Yuugao 1.0 | 10942 | 697 (6.4%) | 4847 |
| trab.Crusader 0.1.7 | 15446 | 1487 (9.6%) | 13107 |
| wiki.mini.Sedan 1.0 | 9933 | 856 (8.6%) | 5754 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 650 | 498 | 494 | 467 | 51.8 / 27.0 | 2837 | 3940 | 2758 |
| ak.Fermat 2.0 | 650 | 460 | 456 | 458 | 49.4 / 19.9 | 2313 | 5317 | 835 |
| ary.SMG 1.01 | 650 | 445 | 603 | 683 | 41.8 / 31.2 | 910 | 3872 | 109 |
| ary.mini.Nimi 1.0 | 650 | 506 | 588 | 784 | 36.9 / 26.9 | 717 | 4908 | 4 |
| bayen.nut.Squirrel 1.621 | 650 | 464 | 503 | 483 | 56.1 / 18.4 | 1578 | 4025 | 10 |
| brainfade.Fallen 0.63 | 650 | 448 | 450 | 589 | 39.2 / 28.5 | 2781 | 2988 | 60 |
| can.Pookie 1.1 | 650 | 427 | 453 | 462 | 45.2 / 24.6 | 1356 | 4625 | 33 |
| cf.mini.Chiva 1.0 | 650 | 495 | 481 | 509 | 47.6 / 21.1 | 1921 | 4106 | 223 |
| cf.proto.Shiva 2.2 | 650 | 494 | 644 | 718 | 31.1 / 30.2 | 409 | 3428 | 118 |
| chase.pm.Pytko 1.0 | 650 | 488 | 572 | 638 | 36.7 / 28.8 | 430 | 3692 | 3781 |
| css.Delitioner 0.11 | 650 | 400 | 613 | 512 | 55.0 / 24.1 | 2591 | 4946 | 28 |
| dft.Cyanide 1.90 | 650 | 525 | 650 | 726 | 27.2 / 31.8 | 132 | 7929 | 3075 |
| dz.Caedo 1.4 | 650 | 316 | 591 | 473 | 77.1 / 18.2 | 4685 | 3713 | 55 |
| kawigi.mini.Fhqwhgads 1.1 | 650 | 418 | 494 | 437 | 41.3 / 19.9 | 1308 | 7033 | 458 |
| kawigi.sbf.FloodMini 1.4 | 650 | 437 | 528 | 477 | 39.5 / 19.9 | 952 | 6507 | 586 |
| kid.Toa .0.5 | 650 | 438 | 400 | 942 | 54.5 / 19.3 | 2320 | 308 | 41 |
| kms.Golden 0.10 | 650 | 418 | 541 | 538 | 38.8 / 28.0 | 1421 | 4201 | 3187 |
| lucasslf.Dodger 1.0 | 650 | 445 | 619 | 685 | 42.9 / 22.8 | 813 | 5629 | 1187 |
| mk.Alpha 0.2.1 | 650 | 493 | 400 | 431 | 58.4 / 13.8 | 3175 | 4760 | 0 |
| mladjo.Grrrrr 0.9 | 650 | 459 | 600 | 623 | 37.9 / 29.0 | 637 | 2586 | 4451 |
| nz.jdc.nano.NeophytePattern 1.1 | 650 | 344 | 547 | 378 | 60.2 / 23.2 | 3939 | 4337 | 1588 |
| pedersen.Hubris 2.4 | 650 | 406 | 559 | 453 | 56.5 / 21.6 | 3192 | 4714 | 110 |
| ph.micro.Pikeman 0.4.5 | 650 | 539 | 619 | 632 | 32.8 / 23.7 | 234 | 4297 | 4988 |
| suh.mega.WaveSurferPG 1.06 | 650 | 417 | 575 | 709 | 52.3 / 23.1 | 2903 | 2322 | 746 |
| synapse.rsim.GeomancyBS 0.11 | 650 | 410 | 650 | 752 | 41.2 / 27.0 | 441 | 3577 | 126 |
| theo.avenge.Pequod 1.0 | 650 | 528 | 600 | 805 | 29.9 / 26.8 | 222 | 6067 | 454 |
| theo.real.Ahab 1.0 | 650 | 525 | 619 | 855 | 28.9 / 28.4 | 189 | 7692 | 52 |
| tm.Yuugao 1.0 | 650 | 467 | 556 | 554 | 47.0 / 25.7 | 1635 | 4305 | 149 |
| trab.Crusader 0.1.7 | 650 | 482 | 644 | 740 | 33.9 / 30.9 | 341 | 4329 | 0 |
| wiki.mini.Sedan 1.0 | 650 | 504 | 603 | 499 | 34.1 / 22.3 | 421 | 7981 | 869 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 8.4% | 175 | 3479 | 3 | 30.8 | 575 / 582 (99%) | 0 | 0 |
| ak.Fermat 2.0 | 8.1% | 90 | 158 | 3 | 27.8 | 550 / 555 (99%) | 0 | 0 |
| ary.SMG 1.01 | 11.4% | 127 | 800 | 3 | 48.7 | 1191 / 1192 (100%) | 0 | 0 |
| ary.mini.Nimi 1.0 | 6.7% | 109 | 546 | 3 | 53.0 | 1438 / 1440 (100%) | 0 | 0 |
| bayen.nut.Squirrel 1.621 | 6.7% | 104 | 50 | 3 | 33.0 | 867 / 869 (100%) | 0 | 0 |
| brainfade.Fallen 0.63 | 7.3% | 108 | 5100 | 3 | 37.6 | 794 / 794 (100%) | 0 | 0 |
| can.Pookie 1.1 | 6.9% | 90 | 54 | 3 | 26.9 | 678 / 678 (100%) | 0 | 0 |
| cf.mini.Chiva 1.0 | 6.2% | 93 | 380 | 3 | 29.9 | 720 / 722 (100%) | 0 | 0 |
| cf.proto.Shiva 2.2 | 6.9% | 113 | 78 | 3 | 44.1 | 1173 / 1179 (99%) | 0 | 0 |
| chase.pm.Pytko 1.0 | 6.9% | 83 | 262 | 3 | 41.1 | 867 / 867 (100%) | 0 | 0 |
| css.Delitioner 0.11 | 10.2% | 98 | 210 | 3 | 34.4 | 762 / 765 (100%) | 0 | 0 |
| dft.Cyanide 1.90 | 7.0% | 77 | 68 | 3 | 49.2 | 1378 / 1386 (99%) | 0 | 0 |
| dz.Caedo 1.4 | 12.4% | 96 | 49 | 3 | 29.4 | 520 / 521 (100%) | 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 5.0% | 82 | 1824 | 3 | 26.3 | 695 / 696 (100%) | 0 | 0 |
| kawigi.sbf.FloodMini 1.4 | 5.1% | 99 | 52 | 3 | 27.0 | 674 / 677 (100%) | 0 | 0 |
| kid.Toa .0.5 | 6.1% | 87 | 124 | 3 | 43.6 | 678 / 678 (100%) | 0 | 0 |
| kms.Golden 0.10 | 7.4% | 87 | 61 | 3 | 35.1 | 1081 / 1082 (100%) | 0 | 0 |
| lucasslf.Dodger 1.0 | 6.8% | 89 | 69 | 3 | 50.0 | 1272 / 1277 (100%) | 0 | 0 |
| mk.Alpha 0.2.1 | 5.3% | 83 | 52 | 3 | 26.4 | 898 / 898 (100%) | 0 | 0 |
| mladjo.Grrrrr 0.9 | 7.3% | 112 | 164 | 3 | 41.9 | 1115 / 1115 (100%) | 0 | 0 |
| nz.jdc.nano.NeophytePattern 1.1 | 9.0% | 93 | 40 | 3 | 24.7 | 585 / 586 (100%) | 0 | 0 |
| pedersen.Hubris 2.4 | 7.8% | 92 | 180 | 3 | 28.4 | 590 / 590 (100%) | 0 | 0 |
| ph.micro.Pikeman 0.4.5 | 5.7% | 93 | 62 | 3 | 42.4 | 992 / 992 (100%) | 0 | 0 |
| suh.mega.WaveSurferPG 1.06 | 9.1% | 117 | 947 | 3 | 52.9 | 1312 / 1316 (100%) | 0 | 0 |
| synapse.rsim.GeomancyBS 0.11 | 7.5% | 98 | 284 | 3 | 51.8 | 1356 / 1356 (100%) | 0 | 0 |
| theo.avenge.Pequod 1.0 | 6.0% | 86 | 730 | 3 | 39.0 | 984 / 984 (100%) | 0 | 0 |
| theo.real.Ahab 1.0 | 6.8% | 96 | 93 | 2 | 51.6 | 1332 / 1332 (100%) | 0 | 0 |
| tm.Yuugao 1.0 | 7.2% | 97 | 464 | 3 | 31.8 | 697 / 697 (100%) | 0 | 0 |
| trab.Crusader 0.1.7 | 7.4% | 92 | 131 | 3 | 50.7 | 1486 / 1487 (100%) | 0 | 0 |
| wiki.mini.Sedan 1.0 | 5.1% | 81 | 3169 | 3 | 30.8 | 853 / 856 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ak.Fermat 2.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ary.SMG 1.01 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ary.mini.Nimi 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bayen.nut.Squirrel 1.621 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| brainfade.Fallen 0.63 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| can.Pookie 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cf.mini.Chiva 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cf.proto.Shiva 2.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| chase.pm.Pytko 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| css.Delitioner 0.11 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dft.Cyanide 1.90 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dz.Caedo 1.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.sbf.FloodMini 1.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kid.Toa .0.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kms.Golden 0.10 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lucasslf.Dodger 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mk.Alpha 0.2.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mladjo.Grrrrr 0.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nz.jdc.nano.NeophytePattern 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pedersen.Hubris 2.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ph.micro.Pikeman 0.4.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| suh.mega.WaveSurferPG 1.06 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| synapse.rsim.GeomancyBS 0.11 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.avenge.Pequod 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.real.Ahab 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tm.Yuugao 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| trab.Crusader 0.1.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wiki.mini.Sedan 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## First rounds against last rounds

Per battle, the first 5 rounds against the last 10, then the paired difference (last minus first) over battles with its 95% interval. Win rate is rounds won over rounds with an R record; damage share is bullet damage dealt over dealt plus taken. Positive means the robot does better late in the battle.

| Opponent | Build | Battles | Win rate, first 5 | Win rate, last 10 | Late minus early (pp) | Damage share, first 5 | Damage share, last 10 | Late minus early (pp) |
|---|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | hadur2.Hadur 3.9sa | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 3.9 | 50.0% ± 17.3 | 65.3% ± 10.1 | +15.3 ± 21.4 |
| KiraNL.ChupaLite 0.4 | hadur2.Hadur 3.9 | 8 | 87.5% ± 15.3 | 87.5% ± 5.9 | +0.0 ± 14.1 | 56.1% ± 8.9 | 68.4% ± 3.5 | +12.3 ± 7.4 |
| ak.Fermat 2.0 | hadur2.Hadur 3.9sa | 8 | 92.5% ± 17.7 | 96.3% ± 4.3 | +3.8 ± 16.1 | 61.7% ± 31.2 | 60.7% ± 15.2 | -1.0 ± 32.3 |
| ak.Fermat 2.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 97.2% ± 6.6 | +2.2 ± 11.2 | 64.0% ± 8.3 | 69.2% ± 8.4 | +5.2 ± 11.6 |
| ary.SMG 1.01 | hadur2.Hadur 3.9sa | 8 | 87.5% ± 12.4 | 97.5% ± 5.9 | +10.0 ± 15.5 | 42.8% ± 13.6 | 51.8% ± 11.8 | +9.0 ± 20.1 |
| ary.SMG 1.01 | hadur2.Hadur 3.9 | 8 | 77.5% ± 18.8 | 87.5% ± 5.9 | +10.0 ± 16.7 | 62.7% ± 11.3 | 58.5% ± 4.1 | -4.3 ± 9.8 |
| ary.mini.Nimi 1.0 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 96.3% ± 4.3 | -3.7 ± 4.3 | 47.1% ± 12.1 | 61.2% ± 11.2 | +14.0 ± 15.0 |
| ary.mini.Nimi 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 90.0% ± 6.3 | -7.5 ± 10.7 | 66.6% ± 8.8 | 56.5% ± 3.1 | -10.1 ± 11.2 |
| bayen.nut.Squirrel 1.621 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 71.0% ± 11.0 | 83.0% ± 8.4 | +12.0 ± 11.7 |
| bayen.nut.Squirrel 1.621 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 79.1% ± 10.0 | 77.7% ± 9.7 | -1.4 ± 10.1 |
| brainfade.Fallen 0.63 | hadur2.Hadur 3.9sa | 8 | 95.0% ± 7.7 | 97.4% ± 4.1 | +2.4 ± 7.6 | 60.0% ± 16.5 | 41.5% ± 14.2 | -18.5 ± 11.9 |
| brainfade.Fallen 0.63 | hadur2.Hadur 3.9 | 8 | 80.0% ± 17.9 | 87.2% ± 10.9 | +7.2 ± 20.9 | 57.0% ± 7.8 | 59.8% ± 4.7 | +2.8 ± 6.5 |
| can.Pookie 1.1 | hadur2.Hadur 3.9sa | 8 | 95.0% ± 7.7 | 98.8% ± 3.0 | +3.7 ± 8.9 | 49.9% ± 17.8 | 65.9% ± 6.2 | +16.0 ± 20.8 |
| can.Pookie 1.1 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 96.3% ± 4.3 | +1.2 ± 8.3 | 71.2% ± 5.5 | 65.6% ± 5.9 | -5.6 ± 5.5 |
| cf.mini.Chiva 1.0 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 64.9% ± 6.2 | 84.1% ± 4.3 | +19.1 ± 7.4 |
| cf.mini.Chiva 1.0 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 92.5% ± 7.4 | +0.0 ± 10.0 | 67.1% ± 2.5 | 69.9% ± 4.5 | +2.8 ± 5.2 |
| cf.proto.Shiva 2.2 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 53.1% ± 18.8 | 68.6% ± 17.0 | +15.6 ± 20.7 |
| cf.proto.Shiva 2.2 | hadur2.Hadur 3.9 | 8 | 85.0% ± 14.8 | 85.0% ± 10.0 | +0.0 ± 14.1 | 47.2% ± 10.3 | 52.8% ± 6.7 | +5.7 ± 15.3 |
| chase.pm.Pytko 1.0 | hadur2.Hadur 3.9sa | 8 | 92.5% ± 12.4 | 84.3% ± 11.1 | -8.2 ± 17.5 | 42.3% ± 8.1 | 51.4% ± 7.7 | +9.1 ± 12.3 |
| chase.pm.Pytko 1.0 | hadur2.Hadur 3.9 | 8 | 82.5% ± 14.0 | 84.7% ± 6.2 | +2.2 ± 17.2 | 51.3% ± 6.1 | 54.2% ± 4.6 | +2.9 ± 7.0 |
| css.Delitioner 0.11 | hadur2.Hadur 3.9sa | 8 | 67.5% ± 17.7 | 93.5% ± 8.1 | +26.0 ± 19.5 | 42.5% ± 8.4 | 71.0% ± 5.5 | +28.4 ± 10.3 |
| css.Delitioner 0.11 | hadur2.Hadur 3.9 | 8 | 85.0% ± 11.8 | 95.0% ± 6.3 | +10.0 ± 13.4 | 58.5% ± 6.2 | 70.8% ± 4.8 | +12.3 ± 8.3 |
| dft.Cyanide 1.90 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 63.2% ± 16.3 | 69.0% ± 12.3 | +5.8 ± 19.3 |
| dft.Cyanide 1.90 | hadur2.Hadur 3.9 | 8 | 77.5% ± 10.7 | 86.9% ± 10.8 | +9.4 ± 8.7 | 45.4% ± 9.0 | 45.2% ± 6.7 | -0.2 ± 8.2 |
| dz.Caedo 1.4 | hadur2.Hadur 3.9sa | 8 | 85.0% ± 17.3 | 87.2% ± 8.9 | +2.2 ± 16.3 | 50.2% ± 6.6 | 71.2% ± 4.8 | +21.0 ± 7.6 |
| dz.Caedo 1.4 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 96.3% ± 4.3 | +8.8 ± 14.4 | 72.8% ± 8.9 | 85.9% ± 4.4 | +13.1 ± 8.5 |
| kawigi.mini.Fhqwhgads 1.1 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 7.7 | 62.1% ± 11.5 | 64.8% ± 8.1 | +2.7 ± 14.6 |
| kawigi.mini.Fhqwhgads 1.1 | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 97.4% ± 4.1 | +7.4 ± 9.7 | 59.0% ± 7.8 | 69.9% ± 3.9 | +10.9 ± 9.1 |
| kawigi.sbf.FloodMini 1.4 | hadur2.Hadur 3.9sa | 8 | 87.5% ± 12.4 | 96.3% ± 4.3 | +8.8 ± 11.3 | 45.3% ± 13.8 | 69.4% ± 8.3 | +24.0 ± 16.0 |
| kawigi.sbf.FloodMini 1.4 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 96.3% ± 4.3 | +1.2 ± 8.3 | 63.9% ± 4.6 | 69.9% ± 5.0 | +6.0 ± 6.9 |
| kid.Toa .0.5 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 75.8% ± 13.3 | 81.7% ± 8.3 | +5.9 ± 12.1 |
| kid.Toa .0.5 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 95.0% ± 4.5 | +0.0 ± 8.9 | 68.1% ± 5.4 | 78.2% ± 4.6 | +10.1 ± 7.9 |
| kms.Golden 0.10 | hadur2.Hadur 3.9sa | 8 | 90.0% ± 12.6 | 91.3% ± 9.4 | +1.2 ± 13.7 | 49.7% ± 12.5 | 50.0% ± 8.1 | +0.2 ± 18.1 |
| kms.Golden 0.10 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 88.6% ± 7.0 | -3.9 ± 13.4 | 54.3% ± 3.5 | 59.8% ± 5.8 | +5.5 ± 5.4 |
| lucasslf.Dodger 1.0 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 96.3% ± 4.3 | -1.2 ± 5.4 | 33.2% ± 11.1 | 40.3% ± 20.5 | +7.2 ± 24.4 |
| lucasslf.Dodger 1.0 | hadur2.Hadur 3.9 | 8 | 92.5% ± 12.4 | 93.6% ± 6.3 | +1.1 ± 15.1 | 64.0% ± 9.5 | 61.5% ± 4.1 | -2.4 ± 8.9 |
| mk.Alpha 0.2.1 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 66.9% ± 25.6 | 95.6% ± 6.0 | +28.7 ± 25.6 |
| mk.Alpha 0.2.1 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 73.7% ± 4.7 | 84.4% ± 3.1 | +10.7 ± 6.5 |
| mladjo.Grrrrr 0.9 | hadur2.Hadur 3.9sa | 8 | 87.5% ± 12.4 | 97.5% ± 3.9 | +10.0 ± 11.8 | 57.5% ± 11.6 | 44.1% ± 15.7 | -13.4 ± 19.8 |
| mladjo.Grrrrr 0.9 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 87.5% ± 11.6 | -5.0 ± 15.5 | 60.5% ± 6.3 | 53.2% ± 6.0 | -7.3 ± 9.8 |
| nz.jdc.nano.NeophytePattern 1.1 | hadur2.Hadur 3.9sa | 8 | 85.0% ± 14.8 | 91.3% ± 5.4 | +6.3 ± 16.1 | 53.8% ± 5.2 | 69.2% ± 3.0 | +15.4 ± 5.0 |
| nz.jdc.nano.NeophytePattern 1.1 | hadur2.Hadur 3.9 | 8 | 95.0% ± 11.8 | 98.8% ± 3.0 | +3.8 ± 12.6 | 66.6% ± 2.6 | 73.2% ± 3.3 | +6.7 ± 3.5 |
| pedersen.Hubris 2.4 | hadur2.Hadur 3.9sa | 8 | 65.0% ± 14.8 | 97.4% ± 4.1 | +32.4 ± 16.1 | 40.3% ± 7.0 | 77.6% ± 2.4 | +37.3 ± 6.5 |
| pedersen.Hubris 2.4 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 95.0% ± 4.5 | +2.5 ± 8.7 | 68.0% ± 7.2 | 71.7% ± 2.5 | +3.7 ± 6.7 |
| ph.micro.Pikeman 0.4.5 | hadur2.Hadur 3.9sa | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 7.4 | 54.9% ± 35.0 | 54.8% ± 15.1 | -0.1 ± 41.8 |
| ph.micro.Pikeman 0.4.5 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 92.5% ± 3.9 | -5.0 ± 6.3 | 56.0% ± 5.0 | 53.5% ± 6.6 | -2.5 ± 8.5 |
| suh.mega.WaveSurferPG 1.06 | hadur2.Hadur 3.9sa | 8 | 90.0% ± 12.6 | 82.4% ± 9.7 | -7.6 ± 17.2 | 57.3% ± 15.3 | 64.3% ± 11.7 | +6.9 ± 25.1 |
| suh.mega.WaveSurferPG 1.06 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 84.9% ± 10.9 | -10.1 ± 11.8 | 74.1% ± 9.1 | 74.0% ± 4.6 | -0.1 ± 9.9 |
| synapse.rsim.GeomancyBS 0.11 | hadur2.Hadur 3.9sa | 8 | 65.0% ± 21.4 | 91.3% ± 8.3 | +26.2 ± 24.0 | 44.2% ± 12.3 | 60.5% ± 7.4 | +16.2 ± 14.1 |
| synapse.rsim.GeomancyBS 0.11 | hadur2.Hadur 3.9 | 8 | 75.0% ± 11.8 | 88.8% ± 8.3 | +13.8 ± 16.1 | 57.1% ± 4.3 | 60.1% ± 5.0 | +3.0 ± 5.1 |
| theo.avenge.Pequod 1.0 | hadur2.Hadur 3.9sa | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 9.7 | 34.2% ± 11.4 | 51.4% ± 11.7 | +17.2 ± 19.3 |
| theo.avenge.Pequod 1.0 | hadur2.Hadur 3.9 | 8 | 87.5% ± 17.7 | 73.6% ± 15.3 | -13.9 ± 15.4 | 53.6% ± 8.8 | 48.5% ± 8.3 | -5.1 ± 11.0 |
| theo.real.Ahab 1.0 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 95.0% ± 4.5 | -2.5 ± 5.9 | 60.7% ± 24.5 | 52.0% ± 11.1 | -8.6 ± 23.1 |
| theo.real.Ahab 1.0 | hadur2.Hadur 3.9 | 8 | 77.5% ± 14.0 | 76.0% ± 9.9 | -1.5 ± 21.6 | 50.9% ± 7.8 | 46.0% ± 3.0 | -4.9 ± 8.5 |
| tm.Yuugao 1.0 | hadur2.Hadur 3.9sa | 8 | 90.0% ± 8.9 | 93.5% ± 6.7 | +3.5 ± 10.0 | 39.9% ± 4.7 | 65.5% ± 12.6 | +25.6 ± 11.0 |
| tm.Yuugao 1.0 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 93.8% ± 6.2 | +6.3 ± 10.9 | 57.1% ± 7.0 | 64.5% ± 5.1 | +7.4 ± 7.7 |
| trab.Crusader 0.1.7 | hadur2.Hadur 3.9sa | 8 | 92.5% ± 12.4 | 87.4% ± 16.6 | -5.1 ± 21.3 | 40.6% ± 14.3 | 36.1% ± 5.8 | -4.5 ± 17.7 |
| trab.Crusader 0.1.7 | hadur2.Hadur 3.9 | 8 | 80.0% ± 12.6 | 93.3% ± 9.8 | +13.3 ± 11.0 | 51.0% ± 9.3 | 55.2% ± 6.6 | +4.2 ± 5.3 |
| wiki.mini.Sedan 1.0 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 62.3% ± 26.8 | 80.2% ± 10.5 | +17.9 ± 27.4 |
| wiki.mini.Sedan 1.0 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 95.0% ± 6.3 | +5.0 ± 12.6 | 56.2% ± 13.6 | 64.8% ± 7.8 | +8.6 ± 12.7 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | +7.5 ± 19.9 | +10.0 ± 6.3 | -6.1 ± 24.8 | -3.1 ± 7.5 |
| ak.Fermat 2.0 | -2.5 ± 20.8 | -1.0 ± 8.9 | -2.4 ± 30.9 | -8.5 ± 16.0 |
| ary.SMG 1.01 | +10.0 ± 23.6 | +10.0 ± 8.9 | -19.9 ± 21.3 | -6.7 ± 14.5 |
| ary.mini.Nimi 1.0 | +2.5 ± 5.9 | +6.2 ± 7.7 | -19.4 ± 10.9 | +4.7 ± 13.7 |
| bayen.nut.Squirrel 1.621 | -2.5 ± 5.9 | +0.0 ± 0.0 | -8.1 ± 14.7 | +5.2 ± 12.8 |
| brainfade.Fallen 0.63 | +15.0 ± 21.4 | +10.1 ± 13.0 | +3.0 ± 19.8 | -18.3 ± 17.2 |
| can.Pookie 1.1 | +0.0 ± 12.6 | +2.5 ± 5.9 | -21.3 ± 18.5 | +0.3 ± 8.4 |
| cf.mini.Chiva 1.0 | +5.0 ± 7.7 | +7.5 ± 7.4 | -2.2 ± 5.5 | +14.2 ± 6.5 |
| cf.proto.Shiva 2.2 | +15.0 ± 14.8 | +13.8 ± 9.9 | +5.9 ± 17.3 | +15.8 ± 20.7 |
| chase.pm.Pytko 1.0 | +10.0 ± 23.6 | -0.4 ± 13.2 | -8.9 ± 10.2 | -2.8 ± 9.1 |
| css.Delitioner 0.11 | -17.5 ± 26.0 | -1.5 ± 5.7 | -16.0 ± 10.7 | +0.1 ± 7.0 |
| dft.Cyanide 1.90 | +20.0 ± 12.6 | +11.8 ± 10.4 | +17.9 ± 18.3 | +23.9 ± 13.2 |
| dz.Caedo 1.4 | -2.5 ± 20.8 | -9.0 ± 10.7 | -22.6 ± 13.4 | -14.7 ± 7.8 |
| kawigi.mini.Fhqwhgads 1.1 | +7.5 ± 8.7 | +0.1 ± 6.5 | +3.1 ± 12.2 | -5.1 ± 9.8 |
| kawigi.sbf.FloodMini 1.4 | -7.5 ± 12.4 | +0.0 ± 4.5 | -18.6 ± 12.6 | -0.6 ± 9.1 |
| kid.Toa .0.5 | +2.5 ± 5.9 | +5.0 ± 4.5 | +7.7 ± 10.7 | +3.5 ± 10.2 |
| kms.Golden 0.10 | -2.5 ± 14.0 | +2.6 ± 10.7 | -4.6 ± 14.4 | -9.8 ± 8.2 |
| lucasslf.Dodger 1.0 | +5.0 ± 14.8 | +2.6 ± 3.8 | -30.8 ± 9.2 | -21.2 ± 20.1 |
| mk.Alpha 0.2.1 | +5.0 ± 7.7 | +0.0 ± 0.0 | -6.8 ± 23.3 | +11.2 ± 8.3 |
| mladjo.Grrrrr 0.9 | -5.0 ± 14.8 | +10.0 ± 14.1 | -3.0 ± 10.8 | -9.1 ± 15.5 |
| nz.jdc.nano.NeophytePattern 1.1 | -10.0 ± 17.9 | -7.5 ± 5.9 | -12.8 ± 4.4 | -4.1 ± 5.5 |
| pedersen.Hubris 2.4 | -27.5 ± 8.7 | +2.4 ± 6.2 | -27.7 ± 8.4 | +5.9 ± 3.0 |
| ph.micro.Pikeman 0.4.5 | -2.5 ± 10.7 | +5.0 ± 6.3 | -1.1 ± 35.0 | +1.2 ± 18.2 |
| suh.mega.WaveSurferPG 1.06 | -5.0 ± 14.8 | -2.5 ± 14.0 | -16.8 ± 17.7 | -9.7 ± 15.3 |
| synapse.rsim.GeomancyBS 0.11 | -10.0 ± 21.9 | +2.5 ± 15.3 | -12.8 ± 14.1 | +0.4 ± 9.0 |
| theo.avenge.Pequod 1.0 | +7.5 ± 21.8 | +23.9 ± 13.2 | -19.4 ± 14.6 | +2.9 ± 12.6 |
| theo.real.Ahab 1.0 | +20.0 ± 15.5 | +19.0 ± 11.2 | +9.8 ± 21.5 | +6.0 ± 11.6 |
| tm.Yuugao 1.0 | +2.5 ± 10.7 | -0.3 ± 9.2 | -17.2 ± 5.2 | +1.0 ± 12.0 |
| trab.Crusader 0.1.7 | +12.5 ± 15.3 | -6.0 ± 17.0 | -10.5 ± 18.0 | -19.1 ± 9.0 |
| wiki.mini.Sedan 1.0 | +10.0 ± 12.6 | +5.0 ± 6.3 | +6.1 ± 22.2 | +15.4 ± 16.3 |
