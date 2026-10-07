# Bench: jd.Nullstride 2.3.3 (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 7890 over 240 battles (32.9 per battle, most in one battle 1038). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | mid-shield | 100.0% ± 0.0 | 100.0% ± 0.0 | 50.0% ± 0.0 | 280 / 280 | - | - | 0 | - | 0.21 / 9.9 |
| ak.Fermat 2.0 | mid-shield | 97.8% ± 4.6 | 99.3% ± 1.7 | 39.6% ± 21.0 | 278 / 280 | - | - | 9 | - | 0.95 / 43.9 |
| ary.SMG 1.01 | mid-shield | 93.5% ± 1.3 | 100.0% ± 0.0 | 88.4% ± 2.2 | 280 / 280 | - | - | 33 | - | 0.85 / 24.1 |
| ary.mini.Nimi 1.0 | mid-shield | 97.9% ± 2.9 | 99.6% ± 0.8 | 27.2% ± 19.2 | 279 / 280 | - | - | 0 | - | 0.17 / 211.1 |
| bayen.nut.Squirrel 1.621 | mid-shield | 95.2% ± 1.2 | 100.0% ± 0.0 | 91.1% ± 2.1 | 280 / 280 | - | - | 31 | - | 0.83 / 26.7 |
| brainfade.Fallen 0.63 | mid-shield | 91.5% ± 6.1 | 98.6% ± 1.3 | 41.8% ± 19.1 | 276 / 280 | - | - | 58 | - | 0.90 / 55.0 |
| can.Pookie 1.1 | mid-shield | 88.7% ± 2.0 | 97.9% ± 1.7 | 78.3% ± 2.9 | 274 / 280 | - | - | 61 | - | 1.00 / 35.0 |
| cf.mini.Chiva 1.0 | mid-shield | 90.5% ± 1.7 | 98.9% ± 1.2 | 80.8% ± 2.5 | 277 / 280 | - | - | 85 | - | 1.01 / 174.0 |
| cf.proto.Shiva 2.2 | mid-shield | 89.5% ± 3.8 | 97.5% ± 2.0 | 41.2% ± 29.4 | 273 / 280 | - | - | 53 | - | 0.90 / 47.6 |
| chase.pm.Pytko 1.0 | mid-shield | 98.3% ± 0.9 | 100.0% ± 0.0 | 27.9% ± 12.8 | 280 / 280 | - | - | 0 | - | 0.97 / 10.3 |
| css.Delitioner 0.11 | mid-shield | 98.7% ± 2.9 | 99.6% ± 0.8 | 37.7% ± 19.0 | 279 / 280 | - | - | 0 | - | 0.16 / 61.3 |
| dft.Cyanide 1.90 | mid-shield | 99.9% ± 0.2 | 100.0% ± 0.0 | 37.5% ± 19.4 | 280 / 280 | - | - | 1 | - | 0.21 / 10.2 |
| dz.Caedo 1.4 | mid-shield | 96.8% ± 0.8 | 99.6% ± 0.8 | 15.3% ± 7.7 | 279 / 280 | - | - | 0 | - | 0.28 / 9.6 |
| kawigi.mini.Fhqwhgads 1.1 | mid-shield | 98.1% ± 2.3 | 99.6% ± 0.8 | 63.4% ± 19.1 | 279 / 280 | - | - | 0 | - | 0.17 / 107.2 |
| kawigi.sbf.FloodMini 1.4 | mid-shield | 97.7% ± 3.0 | 99.6% ± 0.8 | 46.1% ± 19.7 | 279 / 280 | - | - | 0 | - | 0.17 / 100.9 |
| kid.Toa .0.5 | mid-shield | 92.8% ± 4.0 | 96.8% ± 2.4 | 3.9% ± 9.3 | 271 / 280 | - | - | 5 | - | 0.79 / 138.0 |
| kms.Golden 0.10 | mid-shield | 89.2% ± 6.2 | 97.9% ± 1.7 | 45.9% ± 20.9 | 274 / 280 | - | - | 43 | - | 0.84 / 60.9 |
| lucasslf.Dodger 1.0 | mid-shield | 99.9% ± 0.2 | 100.0% ± 0.0 | 48.8% ± 2.7 | 280 / 280 | - | - | 0 | - | 0.18 / 165.9 |
| mk.Alpha 0.2.1 | mid-shield | 100.0% ± 0.0 | 100.0% ± 0.0 | 50.0% ± 0.0 | 280 / 280 | - | - | 0 | - | 0.19 / 48.7 |
| mladjo.Grrrrr 0.9 | mid-shield | 91.6% ± 7.7 | 97.9% ± 2.8 | 29.1% ± 7.3 | 274 / 280 | - | - | 11 | - | 0.59 / 44.0 |
| nz.jdc.nano.NeophytePattern 1.1 | mid-shield | 98.2% ± 0.5 | 100.0% ± 0.0 | 47.1% ± 8.4 | 280 / 280 | - | - | 0 | - | 0.17 / 10.1 |
| pedersen.Hubris 2.4 | mid-shield | 97.9% ± 2.0 | 98.2% ± 1.8 | 16.3% ± 18.8 | 275 / 280 | - | - | 0 | - | 0.24 / 51.7 |
| ph.micro.Pikeman 0.4.5 | mid-shield | 98.6% ± 2.4 | 99.6% ± 0.8 | 37.2% ± 17.2 | 279 / 280 | - | - | 0 | - | 0.17 / 8.8 |
| suh.mega.WaveSurferPG 1.06 | mid-shield | 87.7% ± 1.7 | 98.6% ± 1.8 | 76.8% ± 2.4 | 276 / 280 | - | - | 7104 | - | 1.61 / 314.7 |
| synapse.rsim.GeomancyBS 0.11 | mid-shield | 98.4% ± 1.4 | 99.6% ± 0.8 | 6.3% ± 14.8 | 279 / 280 | - | - | 0 | - | 0.18 / 8.3 |
| theo.avenge.Pequod 1.0 | mid-shield | 91.3% ± 3.9 | 96.8% ± 2.0 | 14.9% ± 23.1 | 271 / 280 | - | - | 15 | - | 0.81 / 64.2 |
| theo.real.Ahab 1.0 | mid-shield | 88.6% ± 2.4 | 97.1% ± 2.6 | 58.2% ± 2.9 | 272 / 280 | - | - | 66 | - | 1.14 / 62.5 |
| tm.Yuugao 1.0 | mid-shield | 83.7% ± 1.9 | 96.8% ± 2.0 | 70.1% ± 2.0 | 271 / 280 | - | - | 227 | - | 1.16 / 33.8 |
| trab.Crusader 0.1.7 | mid-shield | 79.9% ± 2.2 | 92.4% ± 2.5 | 59.2% ± 4.3 | 259 / 280 | - | - | 88 | - | 1.20 / 31.7 |
| wiki.mini.Sedan 1.0 | mid-shield | 100.0% ± 0.0 | 100.0% ± 0.0 | 50.0% ± 0.0 | 280 / 280 | - | - | 0 | - | 0.18 / 8.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 8 | - | - | - | - | - | 904 |
| ak.Fermat 2.0 | 8 | 73 | 17.1% | 73.7% | 0.0% | 9.2% | 1032 |
| ary.SMG 1.01 | 8 | 402 | 0.0% | 99.8% | 0.2% | 0.0% | 332 |
| ary.mini.Nimi 1.0 | 8 | 47 | 13.4% | 55.9% | 19.9% | 10.8% | 1447 |
| bayen.nut.Squirrel 1.621 | 8 | 280 | 0.0% | 99.8% | 0.2% | 0.0% | 315 |
| brainfade.Fallen 0.63 | 8 | 264 | 9.5% | 84.7% | 0.0% | 5.8% | 1198 |
| can.Pookie 1.1 | 8 | 517 | 7.3% | 90.1% | 0.0% | 2.6% | 554 |
| cf.mini.Chiva 1.0 | 8 | 437 | 4.3% | 94.1% | 0.3% | 1.3% | 615 |
| cf.proto.Shiva 2.2 | 8 | 366 | 12.0% | 79.9% | 3.6% | 4.5% | 1094 |
| chase.pm.Pytko 1.0 | 8 | 36 | 0.0% | 100.0% | 0.0% | 0.0% | 949 |
| css.Delitioner 0.11 | 8 | 30 | 21.1% | 28.7% | 37.6% | 12.7% | 1227 |
| dft.Cyanide 1.90 | 8 | 2 | 0.0% | 100.0% | 0.0% | 0.0% | 986 |
| dz.Caedo 1.4 | 8 | 70 | 8.9% | 88.3% | 0.2% | 2.7% | 939 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 43 | 14.5% | 72.7% | 3.5% | 9.3% | 857 |
| kawigi.sbf.FloodMini 1.4 | 8 | 52 | 12.1% | 62.5% | 14.5% | 10.9% | 867 |
| kid.Toa .0.5 | 8 | 162 | 34.8% | 55.6% | 0.0% | 9.6% | 1407 |
| kms.Golden 0.10 | 8 | 374 | 10.0% | 82.9% | 2.1% | 4.9% | 754 |
| lucasslf.Dodger 1.0 | 8 | 2 | 0.0% | 100.0% | 0.0% | 0.0% | 1401 |
| mk.Alpha 0.2.1 | 8 | - | - | - | - | - | 1345 |
| mladjo.Grrrrr 0.9 | 8 | 219 | 17.2% | 47.5% | 23.9% | 11.4% | 929 |
| nz.jdc.nano.NeophytePattern 1.1 | 8 | 39 | 0.0% | 100.0% | 0.0% | 0.0% | 847 |
| pedersen.Hubris 2.4 | 8 | 44 | 71.4% | 12.6% | 1.7% | 14.3% | 1564 |
| ph.micro.Pikeman 0.4.5 | 8 | 30 | 20.9% | 66.5% | 0.0% | 12.6% | 946 |
| suh.mega.WaveSurferPG 1.06 | 8 | 615 | 4.1% | 94.3% | 0.0% | 1.6% | 1985 |
| synapse.rsim.GeomancyBS 0.11 | 8 | 35 | 18.0% | 76.6% | 0.0% | 5.4% | 1362 |
| theo.avenge.Pequod 1.0 | 8 | 218 | 25.8% | 60.4% | 4.9% | 8.8% | 1279 |
| theo.real.Ahab 1.0 | 8 | 322 | 15.5% | 79.8% | 0.0% | 4.7% | 1314 |
| tm.Yuugao 1.0 | 8 | 793 | 7.1% | 90.1% | 0.0% | 2.8% | 683 |
| trab.Crusader 0.1.7 | 8 | 721 | 18.2% | 74.7% | 0.0% | 7.0% | 1035 |
| wiki.mini.Sedan 1.0 | 8 | - | - | - | - | - | 875 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| ak.Fermat 2.0 | 8 | 8 | n/a | 0 | 0.03 | 0 | 0 | 0 |
| ary.SMG 1.01 | 8 | 8 | n/a | 0 | 0.12 | 0 | 0 | 0 |
| ary.mini.Nimi 1.0 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| bayen.nut.Squirrel 1.621 | 8 | 8 | n/a | 0 | 0.11 | 0 | 0 | 8 |
| brainfade.Fallen 0.63 | 8 | 8 | n/a | 0 | 0.21 | 0 | 0 | 0 |
| can.Pookie 1.1 | 8 | 8 | n/a | 0 | 0.22 | 0 | 0 | 0 |
| cf.mini.Chiva 1.0 | 8 | 8 | n/a | 0 | 0.30 | 0 | 0 | 0 |
| cf.proto.Shiva 2.2 | 8 | 8 | n/a | 0 | 0.19 | 0 | 0 | 0 |
| chase.pm.Pytko 1.0 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| css.Delitioner 0.11 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| dft.Cyanide 1.90 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| dz.Caedo 1.4 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| kawigi.sbf.FloodMini 1.4 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| kid.Toa .0.5 | 8 | 8 | n/a | 0 | 0.02 | 0 | 0 | 0 |
| kms.Golden 0.10 | 8 | 8 | n/a | 0 | 0.15 | 0 | 0 | 0 |
| lucasslf.Dodger 1.0 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| mk.Alpha 0.2.1 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| mladjo.Grrrrr 0.9 | 8 | 8 | n/a | 0 | 0.04 | 0 | 0 | 0 |
| nz.jdc.nano.NeophytePattern 1.1 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| pedersen.Hubris 2.4 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| ph.micro.Pikeman 0.4.5 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| suh.mega.WaveSurferPG 1.06 | 8 | 0 | n/a | 0 | 25.37 | 0 | 0 | 0 |
| synapse.rsim.GeomancyBS 0.11 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| theo.avenge.Pequod 1.0 | 8 | 8 | n/a | 0 | 0.05 | 0 | 0 | 0 |
| theo.real.Ahab 1.0 | 8 | 8 | n/a | 0 | 0.24 | 0 | 0 | 0 |
| tm.Yuugao 1.0 | 8 | 8 | n/a | 0 | 0.81 | 0 | 0 | 0 |
| trab.Crusader 0.1.7 | 8 | 8 | n/a | 0 | 0.31 | 0 | 0 | 0 |
| wiki.mini.Sedan 1.0 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |

232 of 240 battles trusted.

## Paired A/B: jd.Nullstride 2.3.3 vs hadur2.Hadur 3.9

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 100.0% ± 0.0 | 79.5% ± 2.8 | +20.5 ± 2.8 |
| ak.Fermat 2.0 | 97.8% ± 4.6 | 81.9% ± 2.7 | +15.8 ± 5.2 |
| ary.SMG 1.01 | 93.5% ± 1.3 | 69.8% ± 2.5 | +23.7 ± 3.1 |
| ary.mini.Nimi 1.0 | 97.9% ± 2.9 | 74.5% ± 3.0 | +23.4 ± 4.7 |
| bayen.nut.Squirrel 1.621 | 95.2% ± 1.2 | 83.3% ± 6.0 | +11.9 ± 6.9 |
| brainfade.Fallen 0.63 | 91.5% ± 6.1 | 69.8% ± 4.6 | +21.7 ± 8.9 |
| can.Pookie 1.1 | 88.7% ± 2.0 | 82.4% ± 2.0 | +6.3 ± 3.0 |
| cf.mini.Chiva 1.0 | 90.5% ± 1.7 | 81.2% ± 3.2 | +9.4 ± 3.3 |
| cf.proto.Shiva 2.2 | 89.5% ± 3.8 | 66.6% ± 3.8 | +23.0 ± 4.9 |
| chase.pm.Pytko 1.0 | 98.3% ± 0.9 | 71.3% ± 2.8 | +27.0 ± 2.2 |
| css.Delitioner 0.11 | 98.7% ± 2.9 | 79.6% ± 3.4 | +19.1 ± 2.2 |
| dft.Cyanide 1.90 | 99.9% ± 0.2 | 66.9% ± 5.8 | +33.0 ± 5.7 |
| dz.Caedo 1.4 | 96.8% ± 0.8 | 85.3% ± 3.0 | +11.5 ± 3.4 |
| kawigi.mini.Fhqwhgads 1.1 | 98.1% ± 2.3 | 81.6% ± 3.1 | +16.5 ± 3.7 |
| kawigi.sbf.FloodMini 1.4 | 97.7% ± 3.0 | 81.1% ± 4.1 | +16.6 ± 4.7 |
| kid.Toa .0.5 | 92.8% ± 4.0 | 84.6% ± 1.3 | +8.2 ± 4.2 |
| kms.Golden 0.10 | 89.2% ± 6.2 | 70.7% ± 4.1 | +18.6 ± 8.0 |
| lucasslf.Dodger 1.0 | 99.9% ± 0.2 | 80.1% ± 2.4 | +19.9 ± 2.5 |
| mk.Alpha 0.2.1 | 100.0% ± 0.0 | 88.4% ± 1.6 | +11.6 ± 1.6 |
| mladjo.Grrrrr 0.9 | 91.6% ± 7.7 | 68.7% ± 2.6 | +23.0 ± 7.4 |
| nz.jdc.nano.NeophytePattern 1.1 | 98.2% ± 0.5 | 83.1% ± 1.9 | +15.2 ± 1.8 |
| pedersen.Hubris 2.4 | 97.9% ± 2.0 | 80.7% ± 2.9 | +17.2 ± 2.8 |
| ph.micro.Pikeman 0.4.5 | 98.6% ± 2.4 | 74.1% ± 4.1 | +24.6 ± 3.8 |
| suh.mega.WaveSurferPG 1.06 | 87.7% ± 1.7 | 77.0% ± 3.7 | +10.6 ± 4.7 |
| synapse.rsim.GeomancyBS 0.11 | 98.4% ± 1.4 | 75.1% ± 3.1 | +23.2 ± 2.3 |
| theo.avenge.Pequod 1.0 | 91.3% ± 3.9 | 69.0% ± 4.2 | +22.3 ± 5.3 |
| theo.real.Ahab 1.0 | 88.6% ± 2.4 | 66.3% ± 2.6 | +22.4 ± 3.6 |
| tm.Yuugao 1.0 | 83.7% ± 1.9 | 76.7% ± 2.3 | +7.0 ± 3.1 |
| trab.Crusader 0.1.7 | 79.9% ± 2.2 | 68.8% ± 4.9 | +11.0 ± 5.5 |
| wiki.mini.Sedan 1.0 | 100.0% ± 0.0 | 78.8% ± 2.5 | +21.2 ± 2.5 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | +20.5 ± 2.8 | +6.1 ± 3.0 | +6.1 ± 3.0 | -16.3 ± 3.5 |
| ak.Fermat 2.0 | +15.8 ± 5.2 | +6.4 ± 3.6 | +6.4 ± 3.6 | -31.5 ± 20.2 |
| ary.SMG 1.01 | +23.7 ± 3.1 | +14.6 ± 3.0 | +14.6 ± 3.0 | +33.0 ± 3.9 |
| ary.mini.Nimi 1.0 | +23.4 ± 4.7 | +10.4 ± 4.0 | +10.4 ± 4.0 | -31.8 ± 20.0 |
| bayen.nut.Squirrel 1.621 | +11.9 ± 6.9 | +3.6 ± 3.6 | +3.6 ± 3.6 | +20.8 ± 11.7 |
| brainfade.Fallen 0.63 | +21.7 ± 8.9 | +16.4 ± 7.5 | +16.4 ± 7.5 | -16.0 ± 19.5 |
| can.Pookie 1.1 | +6.3 ± 3.0 | +1.4 ± 1.3 | +1.4 ± 1.3 | +10.2 ± 4.9 |
| cf.mini.Chiva 1.0 | +9.4 ± 3.3 | +5.4 ± 4.7 | +5.4 ± 4.7 | +11.9 ± 3.8 |
| cf.proto.Shiva 2.2 | +23.0 ± 4.9 | +14.6 ± 6.0 | +14.6 ± 6.0 | -8.7 ± 30.3 |
| chase.pm.Pytko 1.0 | +27.0 ± 2.2 | +13.2 ± 3.4 | +13.2 ± 3.4 | -27.4 ± 10.7 |
| css.Delitioner 0.11 | +19.1 ± 2.2 | +8.2 ± 4.5 | +8.2 ± 4.5 | -31.2 ± 17.5 |
| dft.Cyanide 1.90 | +33.0 ± 5.7 | +16.1 ± 6.0 | +16.1 ± 6.0 | -11.0 ± 19.4 |
| dz.Caedo 1.4 | +11.5 ± 3.4 | +11.4 ± 4.4 | +11.4 ± 4.4 | -66.7 ± 8.8 |
| kawigi.mini.Fhqwhgads 1.1 | +16.5 ± 3.7 | +3.6 ± 2.5 | +3.6 ± 2.5 | -2.5 ± 21.5 |
| kawigi.sbf.FloodMini 1.4 | +16.6 ± 4.7 | +6.4 ± 3.1 | +6.4 ± 3.1 | -21.9 ± 19.5 |
| kid.Toa .0.5 | +8.2 ± 4.2 | +1.8 ± 3.6 | +1.8 ± 3.6 | -70.9 ± 9.7 |
| kms.Golden 0.10 | +18.6 ± 8.0 | +12.5 ± 6.6 | +12.5 ± 6.6 | -10.7 ± 20.0 |
| lucasslf.Dodger 1.0 | +19.9 ± 2.5 | +6.8 ± 2.8 | +6.8 ± 2.8 | -17.4 ± 5.2 |
| mk.Alpha 0.2.1 | +11.6 ± 1.6 | +1.4 ± 1.8 | +1.4 ± 1.8 | -28.5 ± 1.9 |
| mladjo.Grrrrr 0.9 | +23.0 ± 7.4 | +15.4 ± 3.8 | +15.4 ± 3.8 | -25.9 ± 7.5 |
| nz.jdc.nano.NeophytePattern 1.1 | +15.2 ± 1.8 | +3.9 ± 1.8 | +3.9 ± 1.8 | -24.8 ± 9.3 |
| pedersen.Hubris 2.4 | +17.2 ± 2.8 | +7.9 ± 3.3 | +7.9 ± 3.3 | -55.5 ± 17.1 |
| ph.micro.Pikeman 0.4.5 | +24.6 ± 3.8 | +9.6 ± 4.6 | +9.6 ± 4.6 | -18.6 ± 18.1 |
| suh.mega.WaveSurferPG 1.06 | +10.6 ± 4.7 | +14.3 ± 5.9 | +14.3 ± 5.9 | +7.0 ± 4.4 |
| synapse.rsim.GeomancyBS 0.11 | +23.2 ± 2.3 | +10.4 ± 3.4 | +10.4 ± 3.4 | -55.0 ± 14.4 |
| theo.avenge.Pequod 1.0 | +22.3 ± 5.3 | +12.5 ± 4.9 | +12.5 ± 4.9 | -37.0 ± 24.2 |
| theo.real.Ahab 1.0 | +22.4 ± 3.6 | +15.0 ± 4.6 | +15.0 ± 4.6 | +9.7 ± 3.3 |
| tm.Yuugao 1.0 | +7.0 ± 3.1 | +7.9 ± 4.2 | +7.9 ± 4.2 | +4.9 ± 1.7 |
| trab.Crusader 0.1.7 | +11.0 ± 5.5 | +8.2 ± 6.2 | +8.2 ± 6.2 | +6.0 ± 6.4 |
| wiki.mini.Sedan 1.0 | +21.2 ± 2.5 | +5.4 ± 3.2 | +5.4 ± 3.2 | -10.8 ± 2.4 |
| All pairs | +17.8 ± 1.0 | +9.0 ± 0.8 | +9.0 ± 0.8 | -17.2 ± 3.7 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or, for a Hadur build, a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 8 | 6 | +20.5 ± 2.8 | +19.8 ± 3.9 |
| ak.Fermat 2.0 | 8 | 6 | +15.8 ± 5.2 | +14.6 ± 7.2 |
| ary.SMG 1.01 | 8 | 6 | +23.7 ± 3.1 | +24.7 ± 3.7 |
| ary.mini.Nimi 1.0 | 8 | 6 | +23.4 ± 4.7 | +22.9 ± 6.8 |
| bayen.nut.Squirrel 1.621 | 8 | 8 | +11.9 ± 6.9 | +11.9 ± 6.9 |
| brainfade.Fallen 0.63 | 8 | 7 | +21.7 ± 8.9 | +19.8 ± 9.3 |
| can.Pookie 1.1 | 8 | 8 | +6.3 ± 3.0 | +6.3 ± 3.0 |
| cf.mini.Chiva 1.0 | 8 | 7 | +9.4 ± 3.3 | +8.3 ± 2.6 |
| cf.proto.Shiva 2.2 | 8 | 6 | +23.0 ± 4.9 | +24.0 ± 6.8 |
| chase.pm.Pytko 1.0 | 8 | 6 | +27.0 ± 2.2 | +26.0 ± 1.8 |
| css.Delitioner 0.11 | 8 | 7 | +19.1 ± 2.2 | +19.2 ± 2.6 |
| dft.Cyanide 1.90 | 8 | 7 | +33.0 ± 5.7 | +32.1 ± 6.4 |
| dz.Caedo 1.4 | 8 | 8 | +11.5 ± 3.4 | +11.5 ± 3.4 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 6 | +16.5 ± 3.7 | +16.3 ± 4.3 |
| kawigi.sbf.FloodMini 1.4 | 8 | 6 | +16.6 ± 4.7 | +16.1 ± 5.4 |
| kid.Toa .0.5 | 8 | 8 | +8.2 ± 4.2 | +8.2 ± 4.2 |
| kms.Golden 0.10 | 8 | 4 | +18.6 ± 8.0 | +11.9 ± 12.9 |
| lucasslf.Dodger 1.0 | 8 | 8 | +19.9 ± 2.5 | +19.9 ± 2.5 |
| mk.Alpha 0.2.1 | 8 | 7 | +11.6 ± 1.6 | +11.4 ± 1.8 |
| mladjo.Grrrrr 0.9 | 8 | 5 | +23.0 ± 7.4 | +24.0 ± 6.5 |
| nz.jdc.nano.NeophytePattern 1.1 | 8 | 7 | +15.2 ± 1.8 | +15.0 ± 2.1 |
| pedersen.Hubris 2.4 | 8 | 6 | +17.2 ± 2.8 | +17.2 ± 4.1 |
| ph.micro.Pikeman 0.4.5 | 8 | 6 | +24.6 ± 3.8 | +25.0 ± 5.6 |
| suh.mega.WaveSurferPG 1.06 | 8 | 0 | +10.6 ± 4.7 | n/a |
| synapse.rsim.GeomancyBS 0.11 | 8 | 7 | +23.2 ± 2.3 | +23.8 ± 2.2 |
| theo.avenge.Pequod 1.0 | 8 | 7 | +22.3 ± 5.3 | +20.8 ± 4.8 |
| theo.real.Ahab 1.0 | 8 | 7 | +22.4 ± 3.6 | +22.8 ± 4.1 |
| tm.Yuugao 1.0 | 8 | 6 | +7.0 ± 3.1 | +6.7 ± 3.7 |
| trab.Crusader 0.1.7 | 8 | 6 | +11.0 ± 5.5 | +11.3 ± 7.2 |
| wiki.mini.Sedan 1.0 | 8 | 7 | +21.2 ± 2.5 | +21.6 ± 2.7 |
| All pairs | 240 | 191 | +17.8 ± 1.0 | +17.5 ± 1.2 |

# Bench: jd.Nullstride 2.3.3 baseline (hadur2.Hadur 3.9) (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 3044 over 240 battles (12.7 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | mid-shield | 79.5% ± 2.8 | 93.9% ± 3.0 | 66.3% ± 3.5 | 263 / 280 | 16.4% ± 0.7 | 7.5% ± 0.7 | 167 | 0 | 1.11 / 15.5 |
| ak.Fermat 2.0 | mid-shield | 81.9% ± 2.7 | 92.9% ± 3.4 | 71.0% ± 2.0 | 260 / 280 | 16.9% ± 1.1 | 6.1% ± 0.6 | 108 | 0 | 1.23 / 17.7 |
| ary.SMG 1.01 | mid-shield | 69.8% ± 2.5 | 85.4% ± 3.0 | 55.4% ± 2.4 | 239 / 280 | 14.0% ± 1.8 | 8.4% ± 0.6 | 138 | 0 | 1.11 / 177.2 |
| ary.mini.Nimi 1.0 | mid-shield | 74.5% ± 3.0 | 89.3% ± 3.8 | 59.0% ± 3.1 | 250 / 280 | 11.9% ± 0.3 | 8.5% ± 4.8 | 100 | 0 | 0.98 / 81.5 |
| bayen.nut.Squirrel 1.621 | mid-shield | 83.3% ± 6.0 | 96.4% ± 3.6 | 70.2% ± 10.1 | 270 / 280 | 21.2% ± 10.4 | 6.3% ± 0.7 | 104 | 0 | 1.04 / 19.4 |
| brainfade.Fallen 0.63 | mid-shield | 69.8% ± 4.6 | 82.1% ± 6.7 | 57.8% ± 2.8 | 230 / 280 | 15.4% ± 1.3 | 7.6% ± 0.8 | 114 | 0 | 0.98 / 15.7 |
| can.Pookie 1.1 | mid-shield | 82.4% ± 2.0 | 96.4% ± 2.1 | 68.1% ± 2.6 | 270 / 280 | 17.6% ± 1.4 | 6.1% ± 0.5 | 88 | 0 | 0.86 / 17.3 |
| cf.mini.Chiva 1.0 | mid-shield | 81.2% ± 3.2 | 93.6% ± 4.7 | 68.9% ± 3.1 | 262 / 280 | 16.2% ± 1.3 | 6.2% ± 0.5 | 97 | 0 | 0.90 / 213.5 |
| cf.proto.Shiva 2.2 | mid-shield | 66.6% ± 3.8 | 82.9% ± 6.0 | 49.9% ± 2.5 | 232 / 280 | 11.2% ± 0.3 | 7.1% ± 0.5 | 88 | 0 | 0.98 / 160.8 |
| chase.pm.Pytko 1.0 | mid-shield | 71.3% ± 2.8 | 86.8% ± 3.4 | 55.4% ± 2.4 | 243 / 280 | 11.8% ± 0.5 | 6.9% ± 0.5 | 102 | 0 | 1.08 / 198.8 |
| css.Delitioner 0.11 | mid-shield | 79.6% ± 3.4 | 91.4% ± 5.1 | 69.0% ± 2.5 | 256 / 280 | 16.7% ± 0.7 | 8.2% ± 0.6 | 97 | 0 | 0.92 / 234.1 |
| dft.Cyanide 1.90 | mid-shield | 66.9% ± 5.8 | 83.9% ± 6.0 | 48.5% ± 5.8 | 235 / 280 | 10.6% ± 0.7 | 6.9% ± 0.4 | 94 | 0 | 1.03 / 34.5 |
| dz.Caedo 1.4 | mid-shield | 85.3% ± 3.0 | 88.2% ± 4.7 | 82.1% ± 2.6 | 247 / 280 | 20.0% ± 1.1 | 12.4% ± 0.2 | 94 | 0 | 0.89 / 14.1 |
| kawigi.mini.Fhqwhgads 1.1 | mid-shield | 81.6% ± 3.1 | 96.1% ± 2.5 | 65.9% ± 3.6 | 269 / 280 | 15.1% ± 1.1 | 5.4% ± 0.8 | 89 | 0 | 0.84 / 56.6 |
| kawigi.sbf.FloodMini 1.4 | mid-shield | 81.1% ± 4.1 | 93.2% ± 3.1 | 68.0% ± 5.3 | 261 / 280 | 15.8% ± 1.6 | 5.4% ± 0.7 | 109 | 0 | 0.87 / 18.2 |
| kid.Toa .0.5 | mid-shield | 84.6% ± 1.3 | 95.0% ± 1.7 | 74.8% ± 1.8 | 266 / 280 | 15.5% ± 0.4 | 6.2% ± 0.7 | 79 | 0 | 1.04 / 54.5 |
| kms.Golden 0.10 | mid-shield | 70.7% ± 4.1 | 85.4% ± 5.6 | 56.6% ± 2.7 | 239 / 280 | 14.5% ± 0.8 | 8.9% ± 3.2 | 89 | 0 | 0.93 / 15.7 |
| lucasslf.Dodger 1.0 | mid-shield | 80.1% ± 2.4 | 93.2% ± 2.8 | 66.3% ± 3.1 | 261 / 280 | 14.0% ± 0.6 | 6.3% ± 0.3 | 95 | 0 | 0.92 / 113.4 |
| mk.Alpha 0.2.1 | mid-shield | 88.4% ± 1.6 | 98.6% ± 1.8 | 78.5% ± 1.9 | 276 / 280 | 18.7% ± 0.9 | 5.6% ± 0.5 | 97 | 0 | 0.89 / 13.9 |
| mladjo.Grrrrr 0.9 | mid-shield | 68.7% ± 2.6 | 82.5% ± 4.1 | 55.0% ± 1.6 | 231 / 280 | 12.7% ± 0.6 | 7.0% ± 0.5 | 93 | 0 | 0.97 / 171.0 |
| nz.jdc.nano.NeophytePattern 1.1 | mid-shield | 83.1% ± 1.9 | 96.1% ± 1.8 | 71.9% ± 2.4 | 269 / 280 | 19.3% ± 1.2 | 9.2% ± 0.8 | 85 | 0 | 0.85 / 59.9 |
| pedersen.Hubris 2.4 | mid-shield | 80.7% ± 2.9 | 90.4% ± 4.0 | 71.9% ± 2.3 | 253 / 280 | 18.4% ± 0.3 | 7.7% ± 0.6 | 105 | 0 | 0.96 / 29.6 |
| ph.micro.Pikeman 0.4.5 | mid-shield | 74.1% ± 4.1 | 90.0% ± 4.9 | 55.8% ± 4.1 | 252 / 280 | 10.9% ± 0.7 | 5.8% ± 0.6 | 99 | 0 | 0.98 / 15.1 |
| suh.mega.WaveSurferPG 1.06 | mid-shield | 77.0% ± 3.7 | 84.3% ± 4.6 | 69.8% ± 3.6 | 236 / 280 | 16.4% ± 2.2 | 8.8% ± 0.4 | 113 | 0 | 1.00 / 17.0 |
| synapse.rsim.GeomancyBS 0.11 | mid-shield | 75.1% ± 3.1 | 89.3% ± 4.0 | 61.2% ± 2.4 | 250 / 280 | 12.6% ± 0.8 | 7.6% ± 0.7 | 98 | 0 | 1.02 / 17.1 |
| theo.avenge.Pequod 1.0 | mid-shield | 69.0% ± 4.2 | 84.3% ± 4.6 | 51.9% ± 4.2 | 236 / 280 | 10.8% ± 0.5 | 6.3% ± 0.5 | 94 | 0 | 1.39 / 36.1 |
| theo.real.Ahab 1.0 | mid-shield | 66.3% ± 2.6 | 82.1% ± 4.0 | 48.5% ± 2.0 | 230 / 280 | 10.7% ± 0.4 | 6.9% ± 0.5 | 106 | 0 | 1.58 / 21.2 |
| tm.Yuugao 1.0 | mid-shield | 76.7% ± 2.3 | 88.9% ± 3.9 | 65.2% ± 1.2 | 249 / 280 | 15.8% ± 1.2 | 7.1% ± 0.9 | 110 | 0 | 0.96 / 14.6 |
| trab.Crusader 0.1.7 | mid-shield | 68.8% ± 4.9 | 84.2% ± 5.3 | 53.2% ± 4.9 | 236 / 280 | 11.7% ± 0.6 | 7.2% ± 0.4 | 96 | 0 | 1.23 / 23.9 |
| wiki.mini.Sedan 1.0 | mid-shield | 78.8% ± 2.5 | 94.6% ± 3.2 | 60.8% ± 2.4 | 265 / 280 | 12.5% ± 0.4 | 5.4% ± 0.6 | 96 | 0 | 0.93 / 13.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 8 | 1049 | 10.1% | 85.6% | 0.0% | 4.3% | 633 |
| ak.Fermat 2.0 | 8 | 888 | 14.1% | 79.9% | 0.0% | 6.0% | 610 |
| ary.SMG 1.01 | 8 | 1502 | 17.1% | 75.5% | 0.0% | 7.4% | 879 |
| ary.mini.Nimi 1.0 | 8 | 1168 | 16.1% | 76.9% | 0.1% | 6.9% | 909 |
| bayen.nut.Squirrel 1.621 | 8 | 800 | 7.8% | 88.3% | 0.4% | 3.6% | 706 |
| brainfade.Fallen 0.63 | 8 | 1471 | 21.2% | 70.0% | 0.0% | 8.8% | 745 |
| can.Pookie 1.1 | 8 | 843 | 7.4% | 89.4% | 0.0% | 3.2% | 597 |
| cf.mini.Chiva 1.0 | 8 | 927 | 12.1% | 81.7% | 1.0% | 5.2% | 655 |
| cf.proto.Shiva 2.2 | 8 | 1517 | 19.8% | 72.2% | 0.0% | 8.0% | 865 |
| chase.pm.Pytko 1.0 | 8 | 1321 | 17.5% | 75.3% | 0.0% | 7.2% | 805 |
| css.Delitioner 0.11 | 8 | 1075 | 14.0% | 80.4% | 0.0% | 5.7% | 675 |
| dft.Cyanide 1.90 | 8 | 1445 | 19.5% | 72.8% | 0.0% | 7.7% | 865 |
| dz.Caedo 1.4 | 8 | 872 | 23.7% | 67.6% | 0.0% | 8.8% | 639 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 847 | 8.1% | 88.1% | 0.0% | 3.8% | 589 |
| kawigi.sbf.FloodMini 1.4 | 8 | 870 | 13.6% | 80.3% | 0.2% | 5.9% | 600 |
| kid.Toa .0.5 | 8 | 780 | 11.2% | 84.7% | 0.0% | 4.1% | 1064 |
| kms.Golden 0.10 | 8 | 1434 | 17.9% | 74.6% | 0.0% | 7.5% | 699 |
| lucasslf.Dodger 1.0 | 8 | 939 | 12.6% | 82.0% | 0.0% | 5.4% | 813 |
| mk.Alpha 0.2.1 | 8 | 589 | 4.2% | 94.0% | 0.0% | 1.7% | 600 |
| mladjo.Grrrrr 0.9 | 8 | 1478 | 20.7% | 70.3% | 0.0% | 8.9% | 785 |
| nz.jdc.nano.NeophytePattern 1.1 | 8 | 927 | 7.4% | 89.2% | 0.0% | 3.4% | 522 |
| pedersen.Hubris 2.4 | 8 | 1019 | 16.6% | 76.4% | 0.0% | 7.0% | 595 |
| ph.micro.Pikeman 0.4.5 | 8 | 1123 | 15.6% | 78.0% | 0.0% | 6.4% | 792 |
| suh.mega.WaveSurferPG 1.06 | 8 | 1184 | 23.2% | 67.9% | 0.0% | 8.9% | 908 |
| synapse.rsim.GeomancyBS 0.11 | 8 | 1205 | 15.6% | 77.8% | 0.0% | 6.6% | 907 |
| theo.avenge.Pequod 1.0 | 8 | 1343 | 20.5% | 71.5% | 0.0% | 8.0% | 964 |
| theo.real.Ahab 1.0 | 8 | 1464 | 21.3% | 70.6% | 0.0% | 8.1% | 1040 |
| tm.Yuugao 1.0 | 8 | 1180 | 16.4% | 76.3% | 0.0% | 7.3% | 678 |
| trab.Crusader 0.1.7 | 8 | 1432 | 19.2% | 72.9% | 0.0% | 7.9% | 889 |
| wiki.mini.Sedan 1.0 | 8 | 931 | 10.1% | 85.2% | 0.0% | 4.7% | 643 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 8 | 6 | 298 | 0 | 0.60 | 1 | 1 | 0 |
| ak.Fermat 2.0 | 8 | 6 | 298 | 0 | 0.39 | 1 | 1 | 0 |
| ary.SMG 1.01 | 8 | 6 | 0 | 0 | 0.49 | 2 | 2 | 0 |
| ary.mini.Nimi 1.0 | 8 | 6 | 287 | 0 | 0.36 | 1 | 1 | 0 |
| bayen.nut.Squirrel 1.621 | 8 | 8 | 0 | 0 | 0.37 | 0 | 0 | 8 |
| brainfade.Fallen 0.63 | 8 | 7 | 0 | 0 | 0.41 | 1 | 1 | 0 |
| can.Pookie 1.1 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| cf.mini.Chiva 1.0 | 8 | 7 | 0 | 0 | 0.35 | 1 | 1 | 0 |
| cf.proto.Shiva 2.2 | 8 | 6 | 298 | 0 | 0.31 | 1 | 1 | 0 |
| chase.pm.Pytko 1.0 | 8 | 6 | 596 | 0 | 0.36 | 1 | 1 | 0 |
| css.Delitioner 0.11 | 8 | 7 | 0 | 0 | 0.35 | 1 | 1 | 0 |
| dft.Cyanide 1.90 | 8 | 7 | 0 | 0 | 0.34 | 1 | 1 | 0 |
| dz.Caedo 1.4 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 6 | 550 | 0 | 0.32 | 0 | 0 | 0 |
| kawigi.sbf.FloodMini 1.4 | 8 | 6 | 596 | 0 | 0.39 | 0 | 0 | 0 |
| kid.Toa .0.5 | 8 | 8 | 0 | 0 | 0.28 | 0 | 0 | 0 |
| kms.Golden 0.10 | 8 | 4 | 572 | 0 | 0.32 | 2 | 2 | 0 |
| lucasslf.Dodger 1.0 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| mk.Alpha 0.2.1 | 8 | 7 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| mladjo.Grrrrr 0.9 | 8 | 5 | 0 | 0 | 0.33 | 3 | 3 | 0 |
| nz.jdc.nano.NeophytePattern 1.1 | 8 | 7 | 0 | 0 | 0.30 | 1 | 1 | 0 |
| pedersen.Hubris 2.4 | 8 | 6 | 298 | 0 | 0.38 | 1 | 1 | 0 |
| ph.micro.Pikeman 0.4.5 | 8 | 6 | 0 | 0 | 0.35 | 2 | 1 | 0 |
| suh.mega.WaveSurferPG 1.06 | 8 | 6 | 0 | 0 | 0.40 | 2 | 2 | 0 |
| synapse.rsim.GeomancyBS 0.11 | 8 | 7 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| theo.avenge.Pequod 1.0 | 8 | 7 | 0 | 0 | 0.34 | 1 | 1 | 0 |
| theo.real.Ahab 1.0 | 8 | 7 | 0 | 0 | 0.38 | 1 | 1 | 0 |
| tm.Yuugao 1.0 | 8 | 6 | 596 | 0 | 0.39 | 0 | 0 | 0 |
| trab.Crusader 0.1.7 | 8 | 6 | 0 | 0 | 0.34 | 2 | 2 | 0 |
| wiki.mini.Sedan 1.0 | 8 | 7 | 298 | 0 | 0.34 | 0 | 0 | 0 |

197 of 240 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 9047 | 19 | 9026 | 9026 (99.8%) | 21 (0.2%) | 0 (0.0%) | 262 | 135 | 106 |
| ak.Fermat 2.0 | 8102 | 11 | 8086 | 8078 (99.7%) | 24 (0.3%) | 8 (0.1%) | 301 | 115 | 27 |
| ary.SMG 1.01 | 14565 | 25 | 14564 | 14563 (100.0%) | 2 (0.0%) | 1 (0.0%) | 719 | 183 | 99 |
| ary.mini.Nimi 1.0 | 14428 | 10 | 14419 | 14407 (99.9%) | 21 (0.1%) | 12 (0.1%) | 759 | 141 | 41 |
| bayen.nut.Squirrel 1.621 | 10807 | 22 | 10807 | 10807 (100.0%) | 0 (0.0%) | 0 (0.0%) | 498 | 147 | 35 |
| brainfade.Fallen 0.63 | 10601 | 14 | 10603 | 10601 (100.0%) | 0 (0.0%) | 2 (0.0%) | 903 | 144 | 51 |
| can.Pookie 1.1 | 7337 | 8 | 7357 | 7337 (100.0%) | 0 (0.0%) | 20 (0.3%) | 185 | 120 | 25 |
| cf.mini.Chiva 1.0 | 8378 | 7 | 8379 | 8377 (100.0%) | 1 (0.0%) | 2 (0.0%) | 368 | 124 | 30 |
| cf.proto.Shiva 2.2 | 12298 | 6 | 12284 | 12273 (99.8%) | 25 (0.2%) | 11 (0.1%) | 728 | 115 | 65 |
| chase.pm.Pytko 1.0 | 11960 | 11 | 11921 | 11921 (99.7%) | 39 (0.3%) | 0 (0.0%) | 467 | 126 | 40 |
| css.Delitioner 0.11 | 9914 | 15 | 9914 | 9914 (100.0%) | 0 (0.0%) | 0 (0.0%) | 309 | 154 | 38 |
| dft.Cyanide 1.90 | 13719 | 511 | 13679 | 13678 (99.7%) | 41 (0.3%) | 1 (0.0%) | 722 | 135 | 40 |
| dz.Caedo 1.4 | 8632 | 18 | 8630 | 8628 (100.0%) | 4 (0.0%) | 2 (0.0%) | 129 | 186 | 90 |
| kawigi.mini.Fhqwhgads 1.1 | 7429 | 30 | 7393 | 7393 (99.5%) | 36 (0.5%) | 0 (0.0%) | 177 | 116 | 26 |
| kawigi.sbf.FloodMini 1.4 | 7157 | 36 | 7123 | 7122 (99.5%) | 35 (0.5%) | 1 (0.0%) | 193 | 84 | 47 |
| kid.Toa .0.5 | 8669 | 3 | 11555 | 8666 (100.0%) | 3 (0.0%) | 2889 (25.0%) | 1665 | 119 | 16 |
| kms.Golden 0.10 | 10137 | 20 | 10101 | 10101 (99.6%) | 36 (0.4%) | 0 (0.0%) | 516 | 122 | 35 |
| lucasslf.Dodger 1.0 | 13515 | 63 | 13513 | 13512 (100.0%) | 3 (0.0%) | 1 (0.0%) | 654 | 152 | 42 |
| mk.Alpha 0.2.1 | 7818 | 17 | 7800 | 7799 (99.8%) | 19 (0.2%) | 1 (0.0%) | 304 | 110 | 34 |
| mladjo.Grrrrr 0.9 | 12163 | 20 | 12164 | 12162 (100.0%) | 1 (0.0%) | 2 (0.0%) | 418 | 118 | 59 |
| nz.jdc.nano.NeophytePattern 1.1 | 6797 | 19 | 6810 | 6791 (99.9%) | 6 (0.1%) | 19 (0.3%) | 473 | 153 | 25 |
| pedersen.Hubris 2.4 | 7882 | 19 | 7866 | 7865 (99.8%) | 17 (0.2%) | 1 (0.0%) | 255 | 118 | 39 |
| ph.micro.Pikeman 0.4.5 | 12132 | 15 | 12134 | 12132 (100.0%) | 0 (0.0%) | 2 (0.0%) | 464 | 110 | 38 |
| suh.mega.WaveSurferPG 1.06 | 16187 | 45 | 16187 | 16187 (100.0%) | 0 (0.0%) | 0 (0.0%) | 966 | 209 | 73 |
| synapse.rsim.GeomancyBS 0.11 | 14668 | 30 | 14647 | 14646 (99.9%) | 22 (0.1%) | 1 (0.0%) | 685 | 164 | 83 |
| theo.avenge.Pequod 1.0 | 10921 | 8 | 10998 | 10917 (100.0%) | 4 (0.0%) | 81 (0.7%) | 1042 | 90 | 48 |
| theo.real.Ahab 1.0 | 14908 | 7 | 14932 | 14903 (100.0%) | 5 (0.0%) | 29 (0.2%) | 1264 | 115 | 126 |
| tm.Yuugao 1.0 | 8565 | 6 | 8528 | 8528 (99.6%) | 37 (0.4%) | 0 (0.0%) | 392 | 124 | 43 |
| trab.Crusader 0.1.7 | 14323 | 24 | 14324 | 14323 (100.0%) | 0 (0.0%) | 1 (0.0%) | 725 | 184 | 53 |
| wiki.mini.Sedan 1.0 | 8496 | 57 | 8481 | 8476 (99.8%) | 20 (0.2%) | 5 (0.1%) | 207 | 92 | 36 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 9260 | 607 (6.6%) | 2502 |
| ak.Fermat 2.0 | 8747 | 629 (7.2%) | 4636 |
| ary.SMG 1.01 | 15390 | 1340 (8.7%) | 12718 |
| ary.mini.Nimi 1.0 | 15930 | 1390 (8.7%) | 13065 |
| bayen.nut.Squirrel 1.621 | 11305 | 979 (8.7%) | 7535 |
| brainfade.Fallen 0.63 | 11962 | 787 (6.6%) | 5022 |
| can.Pookie 1.1 | 8481 | 610 (7.2%) | 4743 |
| cf.mini.Chiva 1.0 | 9795 | 702 (7.2%) | 4231 |
| cf.proto.Shiva 2.2 | 14887 | 1089 (7.3%) | 9197 |
| chase.pm.Pytko 1.0 | 13496 | 911 (6.8%) | 7360 |
| css.Delitioner 0.11 | 9973 | 828 (8.3%) | 7531 |
| dft.Cyanide 1.90 | 15225 | 1296 (8.5%) | 9983 |
| dz.Caedo 1.4 | 8718 | 574 (6.6%) | 3004 |
| kawigi.mini.Fhqwhgads 1.1 | 8400 | 780 (9.3%) | 5551 |
| kawigi.sbf.FloodMini 1.4 | 8667 | 686 (7.9%) | 5211 |
| kid.Toa .0.5 | 19506 | 661 (3.4%) | 4455 |
| kms.Golden 0.10 | 10672 | 1015 (9.5%) | 7929 |
| lucasslf.Dodger 1.0 | 13433 | 1222 (9.1%) | 9932 |
| mk.Alpha 0.2.1 | 8273 | 1065 (12.9%) | 6175 |
| mladjo.Grrrrr 0.9 | 12766 | 1136 (8.9%) | 10354 |
| nz.jdc.nano.NeophytePattern 1.1 | 6445 | 537 (8.3%) | 3758 |
| pedersen.Hubris 2.4 | 8144 | 585 (7.2%) | 5728 |
| ph.micro.Pikeman 0.4.5 | 13184 | 922 (7.0%) | 10700 |
| suh.mega.WaveSurferPG 1.06 | 15136 | 1479 (9.8%) | 12800 |
| synapse.rsim.GeomancyBS 0.11 | 15752 | 1337 (8.5%) | 14166 |
| theo.avenge.Pequod 1.0 | 17688 | 962 (5.4%) | 8724 |
| theo.real.Ahab 1.0 | 19740 | 1413 (7.2%) | 16276 |
| tm.Yuugao 1.0 | 10427 | 641 (6.1%) | 3360 |
| trab.Crusader 0.1.7 | 15398 | 1458 (9.5%) | 13293 |
| wiki.mini.Sedan 1.0 | 9805 | 845 (8.6%) | 7404 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 650 | 506 | 572 | 483 | 50.2 / 25.6 | 2431 | 4435 | 2872 |
| ak.Fermat 2.0 | 650 | 461 | 431 | 460 | 49.6 / 20.3 | 2150 | 5406 | 1090 |
| ary.SMG 1.01 | 650 | 457 | 622 | 730 | 40.4 / 32.4 | 610 | 3464 | 99 |
| ary.mini.Nimi 1.0 | 650 | 515 | 644 | 758 | 36.8 / 25.7 | 545 | 4878 | 46 |
| bayen.nut.Squirrel 1.621 | 650 | 462 | 506 | 556 | 50.7 / 20.2 | 1248 | 4333 | 78 |
| brainfade.Fallen 0.63 | 650 | 457 | 453 | 595 | 40.2 / 29.4 | 2268 | 2900 | 60 |
| can.Pookie 1.1 | 650 | 422 | 400 | 447 | 46.0 / 21.5 | 1245 | 4946 | 22 |
| cf.mini.Chiva 1.0 | 650 | 502 | 563 | 507 | 47.9 / 21.6 | 1828 | 4498 | 166 |
| cf.proto.Shiva 2.2 | 650 | 498 | 619 | 715 | 31.3 / 31.3 | 387 | 3368 | 83 |
| chase.pm.Pytko 1.0 | 650 | 497 | 625 | 655 | 35.2 / 28.4 | 348 | 3520 | 4128 |
| css.Delitioner 0.11 | 650 | 395 | 600 | 525 | 54.7 / 24.7 | 2509 | 5510 | 120 |
| dft.Cyanide 1.90 | 650 | 532 | 650 | 715 | 28.4 / 30.1 | 251 | 8283 | 3442 |
| dz.Caedo 1.4 | 650 | 316 | 616 | 489 | 76.9 / 16.8 | 4797 | 3292 | 83 |
| kawigi.mini.Fhqwhgads 1.1 | 650 | 424 | 509 | 439 | 41.0 / 21.3 | 1130 | 6699 | 354 |
| kawigi.sbf.FloodMini 1.4 | 650 | 406 | 522 | 450 | 42.7 / 20.0 | 1224 | 6332 | 295 |
| kid.Toa .0.5 | 650 | 436 | 400 | 914 | 56.1 / 18.9 | 2162 | 300 | 184 |
| kms.Golden 0.10 | 650 | 422 | 506 | 549 | 39.7 / 30.6 | 1869 | 3730 | 3197 |
| lucasslf.Dodger 1.0 | 650 | 444 | 559 | 663 | 43.2 / 22.0 | 1144 | 5359 | 1208 |
| mk.Alpha 0.2.1 | 650 | 502 | 431 | 450 | 57.5 / 15.8 | 3436 | 4270 | 68 |
| mladjo.Grrrrr 0.9 | 650 | 470 | 603 | 634 | 36.4 / 29.7 | 406 | 2649 | 3868 |
| nz.jdc.nano.NeophytePattern 1.1 | 650 | 352 | 616 | 372 | 60.3 / 23.6 | 3841 | 4097 | 1574 |
| pedersen.Hubris 2.4 | 650 | 398 | 431 | 446 | 56.7 / 22.2 | 3548 | 4603 | 108 |
| ph.micro.Pikeman 0.4.5 | 650 | 540 | 628 | 641 | 31.7 / 25.0 | 281 | 5039 | 4721 |
| suh.mega.WaveSurferPG 1.06 | 650 | 426 | 528 | 758 | 52.9 / 23.0 | 2856 | 2536 | 903 |
| synapse.rsim.GeomancyBS 0.11 | 650 | 409 | 638 | 757 | 42.2 / 26.8 | 457 | 5209 | 207 |
| theo.avenge.Pequod 1.0 | 650 | 530 | 650 | 813 | 29.7 / 27.5 | 164 | 6391 | 852 |
| theo.real.Ahab 1.0 | 650 | 530 | 650 | 891 | 27.9 / 29.5 | 179 | 8594 | 205 |
| tm.Yuugao 1.0 | 650 | 451 | 556 | 528 | 48.2 / 25.7 | 1827 | 4007 | 177 |
| trab.Crusader 0.1.7 | 650 | 478 | 650 | 739 | 34.1 / 29.8 | 371 | 5755 | 2 |
| wiki.mini.Sedan 1.0 | 650 | 498 | 588 | 493 | 35.2 / 22.7 | 337 | 8169 | 942 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | 7.5% | 167 | 604 | 3 | 32.1 | 603 / 607 (99%) | 0 | 0 |
| ak.Fermat 2.0 | 6.1% | 108 | 238 | 3 | 28.7 | 628 / 629 (100%) | 0 | 0 |
| ary.SMG 1.01 | 8.4% | 138 | 1435 | 3 | 51.7 | 1338 / 1340 (100%) | 0 | 0 |
| ary.mini.Nimi 1.0 | 8.5% | 100 | 220 | 3 | 51.0 | 1390 / 1390 (100%) | 0 | 0 |
| bayen.nut.Squirrel 1.621 | 6.3% | 104 | 60 | 3 | 38.6 | 978 / 979 (100%) | 0 | 0 |
| brainfade.Fallen 0.63 | 7.6% | 114 | 269 | 3 | 37.8 | 785 / 787 (100%) | 0 | 0 |
| can.Pookie 1.1 | 6.1% | 88 | 47 | 3 | 26.2 | 610 / 610 (100%) | 0 | 0 |
| cf.mini.Chiva 1.0 | 6.2% | 97 | 314 | 3 | 29.9 | 702 / 702 (100%) | 0 | 0 |
| cf.proto.Shiva 2.2 | 7.1% | 88 | 168 | 3 | 43.7 | 1088 / 1089 (100%) | 0 | 0 |
| chase.pm.Pytko 1.0 | 6.9% | 102 | 74 | 3 | 42.4 | 906 / 911 (99%) | 0 | 0 |
| css.Delitioner 0.11 | 8.2% | 97 | 377 | 3 | 35.2 | 827 / 828 (100%) | 0 | 0 |
| dft.Cyanide 1.90 | 6.9% | 94 | 567 | 3 | 48.6 | 1286 / 1296 (99%) | 0 | 0 |
| dz.Caedo 1.4 | 12.4% | 94 | 148 | 3 | 30.7 | 572 / 574 (100%) | 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 5.4% | 89 | 70 | 3 | 26.4 | 777 / 780 (100%) | 0 | 0 |
| kawigi.sbf.FloodMini 1.4 | 5.4% | 109 | 186 | 3 | 25.4 | 684 / 686 (100%) | 0 | 0 |
| kid.Toa .0.5 | 6.2% | 79 | 66 | 3 | 41.3 | 661 / 661 (100%) | 0 | 0 |
| kms.Golden 0.10 | 8.9% | 89 | 79 | 3 | 35.7 | 1013 / 1015 (100%) | 0 | 0 |
| lucasslf.Dodger 1.0 | 6.3% | 95 | 56 | 3 | 48.2 | 1221 / 1222 (100%) | 0 | 0 |
| mk.Alpha 0.2.1 | 5.6% | 97 | 190 | 3 | 27.9 | 1064 / 1065 (100%) | 0 | 0 |
| mladjo.Grrrrr 0.9 | 7.0% | 93 | 766 | 3 | 42.4 | 1136 / 1136 (100%) | 0 | 0 |
| nz.jdc.nano.NeophytePattern 1.1 | 9.2% | 85 | 47 | 3 | 24.2 | 536 / 537 (100%) | 0 | 0 |
| pedersen.Hubris 2.4 | 7.7% | 105 | 67 | 3 | 28.0 | 584 / 585 (100%) | 0 | 0 |
| ph.micro.Pikeman 0.4.5 | 5.8% | 99 | 588 | 3 | 42.8 | 922 / 922 (100%) | 0 | 0 |
| suh.mega.WaveSurferPG 1.06 | 8.8% | 113 | 258 | 3 | 57.3 | 1474 / 1479 (100%) | 0 | 0 |
| synapse.rsim.GeomancyBS 0.11 | 7.6% | 98 | 316 | 3 | 52.2 | 1335 / 1337 (100%) | 0 | 0 |
| theo.avenge.Pequod 1.0 | 6.3% | 94 | 4741 | 2 | 39.0 | 959 / 962 (100%) | 0 | 0 |
| theo.real.Ahab 1.0 | 6.9% | 106 | 1259 | 3 | 53.1 | 1411 / 1413 (100%) | 0 | 0 |
| tm.Yuugao 1.0 | 7.1% | 110 | 219 | 3 | 30.5 | 637 / 641 (99%) | 0 | 0 |
| trab.Crusader 0.1.7 | 7.2% | 96 | 85 | 3 | 50.7 | 1458 / 1458 (100%) | 0 | 0 |
| wiki.mini.Sedan 1.0 | 5.4% | 96 | 328 | 3 | 30.3 | 841 / 845 (100%) | 0 | 0 |

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
| KiraNL.ChupaLite 0.4 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | - | - | n/a |
| KiraNL.ChupaLite 0.4 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 92.5% ± 7.4 | +2.5 ± 14.7 | 59.1% ± 4.3 | 64.2% ± 5.4 | +5.1 ± 7.6 |
| ak.Fermat 2.0 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | - | 40.7% ± 516.7 | n/a |
| ak.Fermat 2.0 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 92.2% ± 6.4 | -0.3 ± 13.0 | 66.5% ± 8.4 | 72.9% ± 4.6 | +6.3 ± 12.7 |
| ary.SMG 1.01 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 90.8% ± 4.3 | 86.7% ± 3.2 | -4.1 ± 4.1 |
| ary.SMG 1.01 | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 91.0% ± 7.4 | +1.0 ± 10.9 | 66.9% ± 5.7 | 52.1% ± 5.4 | -14.8 ± 9.9 |
| ary.mini.Nimi 1.0 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 9.9% | 2.4% | n/a |
| ary.mini.Nimi 1.0 | hadur2.Hadur 3.9 | 8 | 87.5% ± 8.7 | 88.6% ± 7.0 | +1.1 ± 10.5 | 56.5% ± 6.8 | 57.7% ± 5.8 | +1.2 ± 6.5 |
| bayen.nut.Squirrel 1.621 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 90.1% ± 5.7 | 92.4% ± 2.7 | +2.3 ± 6.0 |
| bayen.nut.Squirrel 1.621 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 96.3% ± 4.3 | +1.2 ± 8.3 | 77.1% ± 9.0 | 69.6% ± 11.1 | -7.6 ± 12.0 |
| brainfade.Fallen 0.63 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 8.2% ± 8.4 | 68.4% ± 14.3 | +59.5 ± 18.8 |
| brainfade.Fallen 0.63 | hadur2.Hadur 3.9 | 8 | 85.0% ± 14.8 | 87.2% ± 8.9 | +2.2 ± 19.9 | 58.1% ± 4.3 | 59.7% ± 5.3 | +1.7 ± 8.3 |
| can.Pookie 1.1 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 86.6% ± 6.9 | 74.9% ± 4.8 | -11.8 ± 8.5 |
| can.Pookie 1.1 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 100.0% ± 0.0 | +12.5 ± 12.4 | 67.9% ± 5.2 | 67.2% ± 4.6 | -0.7 ± 9.1 |
| cf.mini.Chiva 1.0 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 76.5% ± 7.6 | 82.6% ± 5.3 | +6.1 ± 9.0 |
| cf.mini.Chiva 1.0 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 97.4% ± 4.1 | +7.4 ± 14.8 | 64.1% ± 7.0 | 70.7% ± 5.7 | +6.6 ± 10.7 |
| cf.proto.Shiva 2.2 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 14.6% ± 12.6 | 53.0% ± 40.2 | +36.0 ± 39.8 |
| cf.proto.Shiva 2.2 | hadur2.Hadur 3.9 | 8 | 82.5% ± 16.6 | 83.8% ± 7.7 | +1.3 ± 22.5 | 52.9% ± 5.7 | 47.5% ± 5.1 | -5.3 ± 8.1 |
| chase.pm.Pytko 1.0 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 35.4% ± 75.3 | 18.0% ± 34.6 | -28.9 ± 76.4 |
| chase.pm.Pytko 1.0 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 91.3% ± 9.4 | -1.3 ± 13.7 | 56.4% ± 8.1 | 55.3% ± 5.6 | -1.0 ± 10.3 |
| css.Delitioner 0.11 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 0.0% | - | n/a |
| css.Delitioner 0.11 | hadur2.Hadur 3.9 | 8 | 82.5% ± 14.0 | 87.1% ± 8.2 | +4.6 ± 14.5 | 60.6% ± 6.2 | 69.9% ± 5.1 | +9.3 ± 7.4 |
| dft.Cyanide 1.90 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 0.0% | - | n/a |
| dft.Cyanide 1.90 | hadur2.Hadur 3.9 | 8 | 80.0% ± 12.6 | 79.7% ± 10.0 | -0.3 ± 13.7 | 47.6% ± 6.6 | 46.4% ± 7.8 | -1.2 ± 8.7 |
| dz.Caedo 1.4 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 15.4% ± 26.3 | 13.8% ± 18.3 | -1.1 ± 88.6 |
| dz.Caedo 1.4 | hadur2.Hadur 3.9 | 8 | 85.0% ± 14.8 | 95.0% ± 6.3 | +10.0 ± 16.1 | 76.0% ± 7.1 | 86.1% ± 5.4 | +10.1 ± 10.8 |
| kawigi.mini.Fhqwhgads 1.1 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 88.7% ± 20.8 | 47.0% ± 57.9 | -48.2 ± 58.4 |
| kawigi.mini.Fhqwhgads 1.1 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 92.5% ± 5.9 | -2.5 ± 10.7 | 59.5% ± 8.1 | 65.0% ± 3.9 | +5.5 ± 8.1 |
| kawigi.sbf.FloodMini 1.4 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 39.5% ± 15.4 | 34.2% ± 72.7 | -47.6 |
| kawigi.sbf.FloodMini 1.4 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 95.0% ± 4.5 | +7.5 ± 15.3 | 58.7% ± 6.7 | 68.6% ± 9.1 | +9.8 ± 13.1 |
| kid.Toa .0.5 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 0.0% ± 0.0 | 4.4% ± 10.3 | +11.6 ± 49.9 |
| kid.Toa .0.5 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 95.0% ± 4.5 | +0.0 ± 8.9 | 69.4% ± 5.6 | 77.5% ± 3.7 | +8.1 ± 4.2 |
| kms.Golden 0.10 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 12.2% ± 26.7 | 57.1% ± 29.0 | +59.8 ± 36.0 |
| kms.Golden 0.10 | hadur2.Hadur 3.9 | 8 | 85.0% ± 11.8 | 87.1% ± 6.2 | +2.1 ± 10.3 | 49.5% ± 5.4 | 56.4% ± 4.8 | +6.9 ± 5.3 |
| lucasslf.Dodger 1.0 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | - | 40.1% | n/a |
| lucasslf.Dodger 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 88.8% ± 10.4 | -8.8 ± 8.3 | 71.8% ± 5.5 | 65.3% ± 5.3 | -6.5 ± 8.7 |
| mk.Alpha 0.2.1 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | - | - | n/a |
| mk.Alpha 0.2.1 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 76.0% ± 3.9 | 81.1% ± 4.8 | +5.0 ± 4.1 |
| mladjo.Grrrrr 0.9 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 22.6% ± 18.1 | 48.7% | +37.9 |
| mladjo.Grrrrr 0.9 | hadur2.Hadur 3.9 | 8 | 77.5% ± 14.0 | 85.4% ± 8.2 | +7.9 ± 17.0 | 57.4% ± 3.9 | 55.8% ± 4.9 | -1.6 ± 5.9 |
| nz.jdc.nano.NeophytePattern 1.1 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 13.8% ± 19.0 | 77.1% ± 26.7 | +61.3 ± 39.7 |
| nz.jdc.nano.NeophytePattern 1.1 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 97.5% ± 3.9 | +5.0 ± 8.9 | 68.2% ± 5.1 | 71.0% ± 4.6 | +2.7 ± 7.6 |
| pedersen.Hubris 2.4 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 6.3% ± 14.8 | 12.0% ± 38.1 | +12.0 ± 38.1 |
| pedersen.Hubris 2.4 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 83.5% ± 4.6 | -14.0 ± 9.0 | 70.8% ± 4.3 | 67.9% ± 5.1 | -2.9 ± 5.7 |
| ph.micro.Pikeman 0.4.5 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 38.8% | 3.8% | n/a |
| ph.micro.Pikeman 0.4.5 | hadur2.Hadur 3.9 | 8 | 87.5% ± 17.7 | 92.5% ± 7.4 | +5.0 ± 21.0 | 49.3% ± 10.3 | 55.0% ± 8.4 | +5.7 ± 10.2 |
| suh.mega.WaveSurferPG 1.06 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 76.0% ± 5.9 | 76.7% ± 5.6 | +0.7 ± 7.3 |
| suh.mega.WaveSurferPG 1.06 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 83.5% ± 10.0 | -4.0 ± 17.5 | 72.3% ± 6.5 | 70.2% ± 4.6 | -2.1 ± 7.6 |
| synapse.rsim.GeomancyBS 0.11 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 0.0% ± 0.0 | 0.0% ± 0.0 | +0.0 ± 0.0 |
| synapse.rsim.GeomancyBS 0.11 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 91.3% ± 7.0 | +3.8 ± 9.9 | 58.7% ± 3.5 | 62.5% ± 5.7 | +3.8 ± 5.7 |
| theo.avenge.Pequod 1.0 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 0.0% | 17.6% ± 27.3 | +0.0 |
| theo.avenge.Pequod 1.0 | hadur2.Hadur 3.9 | 8 | 92.5% ± 12.4 | 83.5% ± 9.0 | -9.0 ± 13.3 | 55.0% ± 9.3 | 48.5% ± 5.3 | -6.6 ± 8.7 |
| theo.real.Ahab 1.0 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | - | 70.0% ± 4.6 | n/a |
| theo.real.Ahab 1.0 | hadur2.Hadur 3.9 | 8 | 82.5% ± 14.0 | 81.0% ± 8.3 | -1.5 ± 12.5 | 47.7% ± 10.3 | 48.5% ± 2.4 | +0.8 ± 10.6 |
| tm.Yuugao 1.0 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 68.1% ± 7.5 | 72.3% ± 4.6 | +4.1 ± 11.5 |
| tm.Yuugao 1.0 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 92.5% ± 7.4 | +0.0 ± 13.4 | 58.2% ± 4.3 | 67.8% ± 3.6 | +9.6 ± 6.1 |
| trab.Crusader 0.1.7 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | - | 67.4% ± 5.5 | n/a |
| trab.Crusader 0.1.7 | hadur2.Hadur 3.9 | 8 | 80.0% ± 20.0 | 88.8% ± 8.3 | +8.8 ± 23.4 | 49.9% ± 9.6 | 52.1% ± 4.4 | +2.2 ± 10.9 |
| wiki.mini.Sedan 1.0 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | - | - | n/a |
| wiki.mini.Sedan 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 4.5 | 56.4% ± 5.1 | 63.6% ± 5.0 | +7.2 ± 6.8 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | n/a | n/a | n/a | n/a |
| ak.Fermat 2.0 | n/a | n/a | n/a | -27.7 ± 460.6 |
| ary.SMG 1.01 | n/a | n/a | +24.0 ± 7.3 | +34.7 ± 3.9 |
| ary.mini.Nimi 1.0 | n/a | n/a | -51.8 | -54.6 |
| bayen.nut.Squirrel 1.621 | n/a | n/a | +12.9 ± 8.7 | +22.8 ± 11.5 |
| brainfade.Fallen 0.63 | n/a | n/a | -51.5 ± 9.0 | +4.0 ± 16.5 |
| can.Pookie 1.1 | n/a | n/a | +18.7 ± 7.8 | +7.6 ± 5.9 |
| cf.mini.Chiva 1.0 | n/a | n/a | +12.5 ± 10.9 | +11.9 ± 6.6 |
| cf.proto.Shiva 2.2 | n/a | n/a | -38.3 ± 11.6 | +6.6 ± 42.6 |
| chase.pm.Pytko 1.0 | n/a | n/a | -20.3 ± 59.1 | -36.3 ± 32.5 |
| css.Delitioner 0.11 | n/a | n/a | -49.4 | n/a |
| dft.Cyanide 1.90 | n/a | n/a | -43.6 | n/a |
| dz.Caedo 1.4 | n/a | n/a | -63.6 ± 28.1 | -71.7 ± 13.8 |
| kawigi.mini.Fhqwhgads 1.1 | n/a | n/a | +30.6 ± 26.0 | -17.1 ± 53.8 |
| kawigi.sbf.FloodMini 1.4 | n/a | n/a | -22.1 ± 19.1 | -30.0 ± 60.1 |
| kid.Toa .0.5 | n/a | n/a | -68.9 ± 20.2 | -73.1 ± 10.6 |
| kms.Golden 0.10 | n/a | n/a | -36.9 ± 22.3 | +0.7 ± 31.6 |
| lucasslf.Dodger 1.0 | n/a | n/a | n/a | -34.5 |
| mk.Alpha 0.2.1 | n/a | n/a | n/a | n/a |
| mladjo.Grrrrr 0.9 | n/a | n/a | -35.2 ± 22.2 | -11.1 |
| nz.jdc.nano.NeophytePattern 1.1 | n/a | n/a | -54.4 ± 20.7 | +5.8 ± 26.7 |
| pedersen.Hubris 2.4 | n/a | n/a | -64.6 ± 13.5 | -58.6 ± 40.0 |
| ph.micro.Pikeman 0.4.5 | n/a | n/a | -7.1 | -61.2 |
| suh.mega.WaveSurferPG 1.06 | n/a | n/a | +3.7 ± 6.8 | +6.4 ± 5.2 |
| synapse.rsim.GeomancyBS 0.11 | n/a | n/a | -62.0 ± 3.3 | -65.0 ± 6.0 |
| theo.avenge.Pequod 1.0 | n/a | n/a | -62.6 | -30.8 ± 27.0 |
| theo.real.Ahab 1.0 | n/a | n/a | n/a | +21.4 ± 4.7 |
| tm.Yuugao 1.0 | n/a | n/a | +9.9 ± 8.1 | +4.5 ± 6.0 |
| trab.Crusader 0.1.7 | n/a | n/a | n/a | +15.3 ± 7.6 |
| wiki.mini.Sedan 1.0 | n/a | n/a | n/a | n/a |
