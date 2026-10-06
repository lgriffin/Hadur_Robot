# Bench: hadur2.Hadur 3.8-on (cold)

35 rounds x 3 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=3569580.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

**Stratified APS estimate (BENCH-1) for hadur2.Hadur 3.8-on:** 86.8% ± 2.4.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| apv.test.Virus 0.6.1 | shield-under-70 | 88.2% ± 4.1 | 98.1% ± 4.1 | 59.7% ± 11.3 | 103 / 105 | 19.8% ± 8.6 | 3.9% ± 1.2 | 2 | 0 | 0.79 / 44.2 |
| cf.mini.Chiva 1.0 | shield-under-70 | 86.8% ± 2.4 | 98.1% ± 4.1 | 76.8% ± 1.2 | 103 / 105 | 42.3% ± 16.6 | 7.4% ± 3.3 | 3 | 0 | 0.94 / 13.3 |
| cx.Princess 1.0 | shield-under-70 | 97.3% ± 6.5 | 99.0% ± 4.1 | 55.0% ± 70.6 | 104 / 105 | 0.7% ± 1.1 | 0.2% ± 0.1 | 0 | 0 | 1.28 / 15.8 |
| ej.ChocolateBar 1.1 | shield-under-70 | 91.8% ± 11.4 | 98.1% ± 8.2 | 57.7% ± 35.7 | 103 / 105 | 7.3% ± 9.8 | 1.1% ± 0.4 | 0 | 0 | 0.63 / 53.2 |
| kcn.unnamed.Unnamed 1.21 | shield-under-70 | 95.6% ± 3.4 | 100.0% ± 0.0 | 67.9% ± 9.7 | 105 / 105 | 5.1% ± 1.9 | 0.9% ± 1.1 | 2 | 0 | 0.68 / 36.7 |
| mue.Hyperion 0.8 | shield-under-70 | 69.7% ± 10.8 | 84.8% ± 10.8 | 56.3% ± 10.6 | 89 / 105 | 14.5% ± 1.1 | 8.7% ± 3.3 | 9 | 0 | 1.23 / 116.8 |
| ph.musketeer.Musketeer 0.6 | shield-under-70 | 79.0% ± 13.6 | 91.4% ± 12.3 | 36.0% ± 18.3 | 96 / 105 | 6.3% ± 3.3 | 4.1% ± 1.2 | 4 | 0 | 0.73 / 26.0 |
| simonton.mega.SniperFrog 1.0.fix2 | shield-under-70 | 93.7% ± 6.7 | 100.0% ± 0.0 | 69.1% ± 25.0 | 105 / 105 | 12.4% ± 1.6 | 1.5% ± 1.0 | 4 | 0 | 1.05 / 15.1 |
| suh.micro.MirrorPM 1.00 | shield-under-70 | 95.1% ± 5.2 | 98.1% ± 4.1 | 91.8% ± 6.7 | 103 / 105 | 79.7% ± 56.7 | 2.9% ± 2.7 | 2 | 0 | 0.71 / 18.1 |
| vic.Locke 0.7.5.5 | shield-under-70 | 87.6% ± 15.8 | 96.2% ± 10.8 | 42.7% ± 4.1 | 101 / 105 | 4.6% ± 2.1 | 1.3% ± 1.5 | 2 | 0 | 0.78 / 29.8 |
| amk.ChumbaMini 0.2 | shield-70-80 | 77.8% ± 4.9 | 95.2% ± 4.1 | 60.5% ± 5.9 | 100 / 105 | 17.6% ± 1.3 | 6.7% ± 1.8 | 6 | 0 | 1.10 / 30.9 |
| bvh.mini.Fenrir 0.39 | shield-70-80 | 77.8% ± 5.4 | 91.4% ± 7.1 | 61.2% ± 6.3 | 96 / 105 | 34.1% ± 23.3 | 5.5% ± 1.9 | 16 | 0 | 0.95 / 32.5 |
| cx.micro.Smoke 0.96 | shield-70-80 | 84.0% ± 10.1 | 97.1% ± 7.1 | 45.9% ± 10.8 | 102 / 105 | 10.2% ± 6.0 | 2.2% ± 1.6 | 5 | 0 | 0.92 / 30.6 |
| dft.Virgin 1.25 | shield-70-80 | 95.4% ± 5.3 | 100.0% ± 0.0 | 74.9% ± 24.2 | 105 / 105 | 10.3% ± 0.9 | 1.2% ± 1.6 | 16 | 0 | 0.65 / 59.3 |
| jam.micro.RaikoMicro 1.44 | shield-70-80 | 90.6% ± 4.1 | 97.1% ± 0.0 | 50.9% ± 19.3 | 102 / 105 | 4.2% ± 6.1 | 1.3% ± 2.0 | 13 | 0 | 0.60 / 29.9 |
| kid.Gladiator .7.2 | shield-70-80 | 93.8% ± 8.5 | 97.1% ± 12.3 | 84.6% ± 11.3 | 102 / 105 | 13.2% ± 5.1 | 0.8% ± 0.8 | 21 | 0 | 0.66 / 47.9 |
| nat.Hikari dev0001 | shield-70-80 | 86.7% ± 8.8 | 98.1% ± 4.1 | 47.4% ± 6.3 | 103 / 105 | 15.3% ± 9.2 | 2.9% ± 1.6 | 11 | 0 | 0.71 / 23.7 |
| pez.gloom.GloomyDark 0.9.2 | shield-70-80 | 85.8% ± 4.7 | 94.3% ± 7.1 | 51.8% ± 20.3 | 99 / 105 | 7.4% ± 2.7 | 1.4% ± 0.7 | 9 | 0 | 0.70 / 16.7 |
| rsim.mini.BulletCatcher 0.4 | shield-70-80 | 83.9% ± 6.5 | 97.1% ± 7.1 | 62.4% ± 3.1 | 102 / 105 | 18.0% ± 5.8 | 5.9% ± 2.7 | 8 | 0 | 0.90 / 16.7 |
| stelo.MatchupMini 1.1 | shield-70-80 | 66.4% ± 10.7 | 81.9% ± 10.8 | 46.7% ± 23.5 | 86 / 105 | 13.7% ± 3.6 | 6.5% ± 5.4 | 12 | 0 | 2.56 / 159.0 |
| theo.Tungsten 1.0a | shield-70-80 | 81.5% ± 15.6 | 92.4% ± 14.8 | 53.2% ± 22.0 | 97 / 105 | 14.0% ± 6.7 | 2.4% ± 1.4 | 4 | 0 | 0.95 / 43.7 |
| wcsv.mega.PowerHouse2 0.2 | shield-70-80 | 77.8% ± 13.7 | 91.4% ± 14.2 | 49.0% ± 9.6 | 96 / 105 | 20.3% ± 8.6 | 3.3% ± 1.4 | 16 | 0 | 0.86 / 25.5 |
| amk.ChumbaWumba 0.3 | shield-80-90 | 88.6% ± 18.4 | 96.2% ± 10.8 | 59.8% ± 8.7 | 101 / 105 | 10.4% ± 11.4 | 1.7% ± 2.5 | 7 | 0 | 0.73 / 32.8 |
| casey.Flee 1.0 | shield-80-90 | 84.0% ± 15.6 | 95.2% ± 10.8 | 47.8% ± 5.4 | 100 / 105 | 12.6% ± 5.6 | 2.3% ± 1.1 | 8 | 0 | 0.67 / 18.2 |
| gh.GrubbmGrb 1.2.4 | shield-80-90 | 86.3% ± 25.1 | 94.3% ± 12.3 | 68.7% ± 40.0 | 99 / 105 | 19.8% ± 35.4 | 6.8% ± 17.9 | 10 | 0 | 0.99 / 48.6 |
| kawigi.mini.Fhqwhgads 1.1 | shield-80-90 | 82.4% ± 14.2 | 93.3% ± 10.8 | 49.4% ± 29.8 | 98 / 105 | 11.6% ± 4.2 | 5.0% ± 0.1 | 4 | 0 | 0.70 / 90.5 |
| lucasslf.Dodger 1.0 | shield-80-90 | 83.1% ± 7.7 | 94.3% ± 7.1 | 39.2% ± 27.1 | 99 / 105 | 8.2% ± 2.9 | 3.0% ± 1.2 | 9 | 0 | 0.65 / 76.8 |
| nkn.mini.Jskr0 0.1 | shield-80-90 | 93.5% ± 8.1 | 99.0% ± 4.1 | 58.2% ± 14.6 | 104 / 105 | 11.0% ± 4.1 | 0.9% ± 1.6 | 6 | 0 | 0.61 / 53.0 |
| pedersen.Hubris 2.4 | shield-80-90 | 74.4% ± 4.8 | 85.7% ± 7.1 | 64.4% ± 5.1 | 90 / 105 | 18.2% ± 3.5 | 9.7% ± 5.3 | 10 | 0 | 1.33 / 48.7 |
| reaper.Reaper 1.1 | shield-80-90 | 95.9% ± 10.1 | 99.0% ± 4.1 | 77.5% ± 24.9 | 104 / 105 | 10.4% ± 7.4 | 0.8% ± 1.2 | 5 | 0 | 0.75 / 79.7 |
| shinh.Entangled 0.3 | shield-80-90 | 86.9% ± 2.1 | 97.1% ± 0.0 | 60.3% ± 22.6 | 102 / 105 | 13.2% ± 7.8 | 3.0% ± 2.0 | 12 | 0 | 0.87 / 22.1 |
| stelo.SteloTestNano 1.0 | shield-80-90 | 88.9% ± 6.4 | 97.1% ± 0.0 | 62.9% ± 9.6 | 102 / 105 | 20.8% ± 2.6 | 2.6% ± 4.8 | 28 | 0 | 0.68 / 26.1 |
| timmit.nano.TimCat 0.13 | shield-80-90 | 84.3% ± 0.6 | 95.2% ± 4.1 | 70.2% ± 5.6 | 100 / 105 | 22.7% ± 9.9 | 3.7% ± 0.4 | 27 | 0 | 1.12 / 52.0 |
| wiki.BasicGFSurfer 1.02 | shield-80-90 | 73.9% ± 6.1 | 88.6% ± 7.1 | 49.1% ± 8.9 | 93 / 105 | 11.2% ± 4.4 | 4.4% ± 2.0 | 4 | 0 | 1.03 / 14.4 |
| bndl.LostLion 1.2 | shield-90-95 | 90.6% ± 8.8 | 99.0% ± 4.1 | 72.6% ± 6.5 | 104 / 105 | 20.7% ± 7.4 | 2.7% ± 2.9 | 2 | 0 | 2.55 / 55.0 |
| dz.Caedo 1.4 | shield-90-95 | 80.5% ± 15.2 | 92.4% ± 21.7 | 58.3% ± 11.3 | 97 / 105 | 18.0% ± 6.2 | 6.7% ± 2.8 | 3 | 0 | 0.97 / 66.0 |
| lrem.quickhack.QuickHack 1.0 | shield-90-95 | 89.4% ± 3.9 | 100.0% ± 0.0 | 44.5% ± 4.1 | 105 / 105 | 11.2% ± 2.1 | 4.1% ± 0.2 | 8 | 0 | 0.67 / 14.0 |
| mz.Adept 2.65 | shield-90-95 | 83.9% ± 3.5 | 94.3% ± 0.0 | 57.5% ± 3.8 | 99 / 105 | 32.1% ± 12.3 | 3.2% ± 1.6 | 3 | 0 | 0.70 / 35.2 |
| rsk1.RSK1 4.0 | shield-90-95 | 85.2% ± 14.0 | 95.2% ± 10.8 | 50.9% ± 20.9 | 100 / 105 | 12.2% ± 10.2 | 2.5% ± 2.9 | 1 | 0 | 0.86 / 15.7 |
| throxbot.ThroxBot 0.1 | shield-90-95 | 85.0% ± 2.2 | 96.2% ± 4.1 | 69.7% ± 10.5 | 101 / 105 | 26.5% ± 4.8 | 5.6% ± 4.4 | 10 | 0 | 1.26 / 33.2 |
| cli.WasteOfAmmo 1.0 | shield-95-up | 100.0% ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | 105 / 105 | 211.7% ± 29.4 | 0.0% ± 0.0 | 4 | 0 | 0.65 / 11.5 |
| gh.nano.Grofvuil 0.2 | shield-95-up | 94.5% ± 3.1 | 100.0% ± 0.0 | 76.2% ± 18.5 | 105 / 105 | 33.2% ± 14.8 | 1.7% ± 1.1 | 3 | 0 | 0.64 / 11.3 |
| logiblocs.SittingDroid 1.0 | shield-95-up | 100.0% ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | 105 / 105 | 80.1% ± 1.1 | 0.0% ± 0.0 | 3 | 0 | 0.56 / 33.8 |
| Noran.RandomTargeting 0.02 | shield-95-up | 99.3% ± 1.3 | 100.0% ± 0.0 | 95.2% ± 9.9 | 105 / 105 | 16.0% ± 7.3 | 0.1% ± 0.2 | 6 | 0 | 0.58 / 16.8 |
| sample.Fire | shield-95-up | 99.2% ± 0.2 | 100.0% ± 0.0 | 98.3% ± 0.5 | 105 / 105 | 36.9% ± 12.8 | 6.4% ± 3.5 | 4 | 0 | 0.57 / 34.9 |
| suh.nano.OscillatorL 1.00 | shield-95-up | 83.5% ± 1.8 | 88.6% ± 0.0 | 79.0% ± 3.0 | 93 / 105 | 29.0% ± 5.5 | 6.1% ± 1.0 | 7 | 0 | 1.01 / 11.9 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| apv.test.Virus 0.6.1 | 5896 | 180 | 5896 | 5895 (100.0%) | 1 (0.0%) | 1 (0.0%) | 9 | 22 | 8 |
| cf.mini.Chiva 1.0 | 2299 | 5 | 2300 | 2299 (100.0%) | 0 (0.0%) | 1 (0.0%) | 56 | 51 | 4 |
| cx.Princess 1.0 | 206 | 2 | 206 | 206 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 1 | 0 |
| ej.ChocolateBar 1.1 | 5471 | 0 | 5471 | 5471 (100.0%) | 0 (0.0%) | 0 (0.0%) | 6 | 8 | 6 |
| kcn.unnamed.Unnamed 1.21 | 5396 | 2 | 5396 | 5396 (100.0%) | 0 (0.0%) | 0 (0.0%) | 13 | 7 | 7 |
| mue.Hyperion 0.8 | 4205 | 7 | 4205 | 4205 (100.0%) | 0 (0.0%) | 0 (0.0%) | 106 | 44 | 11 |
| ph.musketeer.Musketeer 0.6 | 6816 | 182 | 6816 | 6816 (100.0%) | 0 (0.0%) | 0 (0.0%) | 34 | 5 | 11 |
| simonton.mega.SniperFrog 1.0.fix2 | 5782 | 9 | 5784 | 5782 (100.0%) | 0 (0.0%) | 2 (0.0%) | 5 | 10 | 8 |
| suh.micro.MirrorPM 1.00 | 6500 | 43 | 6879 | 6500 (100.0%) | 0 (0.0%) | 379 (5.5%) | 26 | 12 | 6 |
| vic.Locke 0.7.5.5 | 5624 | 1 | 5626 | 5624 (100.0%) | 0 (0.0%) | 2 (0.0%) | 28 | 5 | 5 |
| amk.ChumbaMini 0.2 | 2557 | 6 | 2557 | 2557 (100.0%) | 0 (0.0%) | 0 (0.0%) | 94 | 42 | 7 |
| bvh.mini.Fenrir 0.39 | 3502 | 3 | 3487 | 3480 (99.4%) | 22 (0.6%) | 7 (0.2%) | 108 | 37 | 17 |
| cx.micro.Smoke 0.96 | 3342 | 1 | 3344 | 3342 (100.0%) | 0 (0.0%) | 2 (0.1%) | 90 | 10 | 10 |
| dft.Virgin 1.25 | 3632 | 1 | 3593 | 3593 (98.9%) | 39 (1.1%) | 0 (0.0%) | 15 | 7 | 13 |
| jam.micro.RaikoMicro 1.44 | 5115 | 0 | 5083 | 5082 (99.4%) | 33 (0.6%) | 1 (0.0%) | 21 | 8 | 13 |
| kid.Gladiator .7.2 | 3160 | 0 | 3704 | 3129 (99.0%) | 31 (1.0%) | 575 (15.5%) | 358 | 7 | 19 |
| nat.Hikari dev0001 | 4863 | 6 | 4871 | 4828 (99.3%) | 35 (0.7%) | 43 (0.9%) | 395 | 29 | 13 |
| pez.gloom.GloomyDark 0.9.2 | 4985 | 2 | 4985 | 4985 (100.0%) | 0 (0.0%) | 0 (0.0%) | 35 | 5 | 12 |
| rsim.mini.BulletCatcher 0.4 | 6534 | 64 | 6558 | 6531 (100.0%) | 3 (0.0%) | 27 (0.4%) | 397 | 52 | 11 |
| stelo.MatchupMini 1.1 | 4986 | 3 | 4986 | 4986 (100.0%) | 0 (0.0%) | 0 (0.0%) | 112 | 39 | 15 |
| theo.Tungsten 1.0a | 4925 | 4 | 4929 | 4925 (100.0%) | 0 (0.0%) | 4 (0.1%) | 28 | 14 | 7 |
| wcsv.mega.PowerHouse2 0.2 | 4883 | 102 | 4841 | 4841 (99.1%) | 42 (0.9%) | 0 (0.0%) | 26 | 21 | 14 |
| amk.ChumbaWumba 0.3 | 3323 | 1 | 3323 | 3323 (100.0%) | 0 (0.0%) | 0 (0.0%) | 12 | 9 | 13 |
| casey.Flee 1.0 | 3556 | 5 | 3593 | 3546 (99.7%) | 10 (0.3%) | 47 (1.3%) | 406 | 42 | 10 |
| gh.GrubbmGrb 1.2.4 | 5757 | 1 | 5725 | 5725 (99.4%) | 32 (0.6%) | 0 (0.0%) | 41 | 25 | 17 |
| kawigi.mini.Fhqwhgads 1.1 | 4551 | 175 | 4551 | 4551 (100.0%) | 0 (0.0%) | 0 (0.0%) | 21 | 11 | 9 |
| lucasslf.Dodger 1.0 | 9593 | 189 | 9587 | 9587 (99.9%) | 6 (0.1%) | 0 (0.0%) | 19 | 5 | 14 |
| nkn.mini.Jskr0 0.1 | 5103 | 0 | 5103 | 5102 (100.0%) | 1 (0.0%) | 1 (0.0%) | 15 | 6 | 8 |
| pedersen.Hubris 2.4 | 3321 | 8 | 3218 | 3214 (96.8%) | 107 (3.2%) | 4 (0.1%) | 171 | 38 | 9 |
| reaper.Reaper 1.1 | 4921 | 3 | 4938 | 4921 (100.0%) | 0 (0.0%) | 17 (0.3%) | 123 | 9 | 5 |
| shinh.Entangled 0.3 | 8413 | 5 | 8414 | 8399 (99.8%) | 14 (0.2%) | 15 (0.2%) | 129 | 39 | 14 |
| stelo.SteloTestNano 1.0 | 3304 | 4 | 3245 | 3245 (98.2%) | 59 (1.8%) | 0 (0.0%) | 12 | 12 | 57 |
| timmit.nano.TimCat 0.13 | 2490 | 1 | 2479 | 2476 (99.4%) | 14 (0.6%) | 3 (0.1%) | 152 | 36 | 18 |
| wiki.BasicGFSurfer 1.02 | 5042 | 5 | 5043 | 5042 (100.0%) | 0 (0.0%) | 1 (0.0%) | 70 | 32 | 23 |
| bndl.LostLion 1.2 | 7656 | 3 | 7722 | 7655 (100.0%) | 1 (0.0%) | 67 (0.9%) | 104 | 45 | 8 |
| dz.Caedo 1.4 | 4580 | 171 | 4610 | 4579 (100.0%) | 1 (0.0%) | 31 (0.7%) | 20 | 39 | 3 |
| lrem.quickhack.QuickHack 1.0 | 7461 | 243 | 7461 | 7461 (100.0%) | 0 (0.0%) | 0 (0.0%) | 26 | 16 | 6 |
| mz.Adept 2.65 | 3268 | 2 | 3268 | 3268 (100.0%) | 0 (0.0%) | 0 (0.0%) | 45 | 13 | 10 |
| rsk1.RSK1 4.0 | 5158 | 4 | 5159 | 5158 (100.0%) | 0 (0.0%) | 1 (0.0%) | 64 | 14 | 7 |
| throxbot.ThroxBot 0.1 | 3824 | 10 | 3824 | 3824 (100.0%) | 0 (0.0%) | 0 (0.0%) | 43 | 53 | 21 |
| cli.WasteOfAmmo 1.0 | 983 | 3 | 983 | 983 (100.0%) | 0 (0.0%) | 0 (0.0%) | 744 | 54 | 39 |
| gh.nano.Grofvuil 0.2 | 6141 | 0 | 6139 | 6139 (100.0%) | 2 (0.0%) | 0 (0.0%) | 42 | 14 | 2 |
| logiblocs.SittingDroid 1.0 | 0 | 0 | 0 | - | - | - | 3 | 0 | 12 |
| Noran.RandomTargeting 0.02 | 13078 | 0 | 13078 | 13078 (100.0%) | 0 (0.0%) | 0 (0.0%) | 12 | 12 | 10 |
| sample.Fire | 3047 | 1 | 3047 | 3047 (100.0%) | 0 (0.0%) | 0 (0.0%) | 9 | 15 | 53 |
| suh.nano.OscillatorL 1.00 | 1988 | 6 | 1990 | 1987 (99.9%) | 1 (0.1%) | 3 (0.2%) | 31 | 45 | 8 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| apv.test.Virus 0.6.1 | 758 | 5567 (734.4%) | 32 |
| cf.mini.Chiva 1.0 | 1141 | 1288 (112.9%) | 0 |
| cx.Princess 1.0 | 99 | 156 (157.6%) | 0 |
| ej.ChocolateBar 1.1 | 1036 | 5243 (506.1%) | 0 |
| kcn.unnamed.Unnamed 1.21 | 1380 | 4975 (360.5%) | 187 |
| mue.Hyperion 0.8 | 3884 | 829 (21.3%) | 2757 |
| ph.musketeer.Musketeer 0.6 | 1231 | 6004 (487.7%) | 0 |
| simonton.mega.SniperFrog 1.0.fix2 | 886 | 5240 (591.4%) | 86 |
| suh.micro.MirrorPM 1.00 | 831 | 6099 (733.9%) | 0 |
| vic.Locke 0.7.5.5 | 1298 | 5137 (395.8%) | 374 |
| amk.ChumbaMini 0.2 | 2875 | 249 (8.7%) | 1672 |
| bvh.mini.Fenrir 0.39 | 2163 | 1648 (76.2%) | 0 |
| cx.micro.Smoke 0.96 | 1601 | 2779 (173.6%) | 408 |
| dft.Virgin 1.25 | 1106 | 3375 (305.2%) | 0 |
| jam.micro.RaikoMicro 1.44 | 1205 | 4825 (400.4%) | 0 |
| kid.Gladiator .7.2 | 3544 | 2904 (81.9%) | 1629 |
| nat.Hikari dev0001 | 674 | 4476 (664.1%) | 101 |
| pez.gloom.GloomyDark 0.9.2 | 1270 | 4670 (367.7%) | 177 |
| rsim.mini.BulletCatcher 0.4 | 1431 | 5277 (368.8%) | 997 |
| stelo.MatchupMini 1.1 | 3304 | 2167 (65.6%) | 2057 |
| theo.Tungsten 1.0a | 1089 | 4389 (403.0%) | 491 |
| wcsv.mega.PowerHouse2 0.2 | 1074 | 4161 (387.4%) | 561 |
| amk.ChumbaWumba 0.3 | 901 | 2948 (327.2%) | 0 |
| casey.Flee 1.0 | 726 | 3212 (442.4%) | 0 |
| gh.GrubbmGrb 1.2.4 | 1458 | 4953 (339.7%) | 934 |
| kawigi.mini.Fhqwhgads 1.1 | 1080 | 3890 (360.2%) | 134 |
| lucasslf.Dodger 1.0 | 826 | 9117 (1103.8%) | 0 |
| nkn.mini.Jskr0 0.1 | 512 | 4936 (964.1%) | 209 |
| pedersen.Hubris 2.4 | 3328 | 520 (15.6%) | 1578 |
| reaper.Reaper 1.1 | 823 | 4762 (578.6%) | 0 |
| shinh.Entangled 0.3 | 1596 | 7471 (468.1%) | 805 |
| stelo.SteloTestNano 1.0 | 694 | 2980 (429.4%) | 0 |
| timmit.nano.TimCat 0.13 | 1964 | 911 (46.4%) | 0 |
| wiki.BasicGFSurfer 1.02 | 1920 | 3438 (179.1%) | 1149 |
| bndl.LostLion 1.2 | 1270 | 6440 (507.1%) | 0 |
| dz.Caedo 1.4 | 1380 | 3689 (267.3%) | 847 |
| lrem.quickhack.QuickHack 1.0 | 670 | 6948 (1037.0%) | 131 |
| mz.Adept 2.65 | 659 | 2959 (449.0%) | 0 |
| rsk1.RSK1 4.0 | 1090 | 4503 (413.1%) | 362 |
| throxbot.ThroxBot 0.1 | 1089 | 2939 (269.9%) | 0 |
| cli.WasteOfAmmo 1.0 | 634 | 0 (0.0%) | 0 |
| gh.nano.Grofvuil 0.2 | 443 | 5872 (1325.5%) | 0 |
| logiblocs.SittingDroid 1.0 | 1557 | 0 (0.0%) | 0 |
| Noran.RandomTargeting 0.02 | 772 | 12659 (1639.8%) | 275 |
| sample.Fire | 1503 | 2871 (191.0%) | 0 |
| suh.nano.OscillatorL 1.00 | 1548 | 435 (28.1%) | 438 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| apv.test.Virus 0.6.1 | 650 | 438 | 650 | 824 | 13.1 / 8.7 | 2 | 201 | 604 |
| cf.mini.Chiva 1.0 | 650 | 396 | 483 | 372 | 62.5 / 18.8 | 733 | 870 | 1 |
| cx.Princess 1.0 | 650 | 297 | 650 | 37 | 1.4 / 1.1 | 0 | 42 | 0 |
| ej.ChocolateBar 1.1 | 650 | 438 | 650 | 826 | 6.7 / 4.7 | 0 | 97 | 0 |
| kcn.unnamed.Unnamed 1.21 | 650 | 479 | 650 | 846 | 6.5 / 3.2 | 0 | 287 | 0 |
| mue.Hyperion 0.8 | 650 | 366 | 650 | 595 | 41.8 / 32.6 | 263 | 1802 | 12 |
| ph.musketeer.Musketeer 0.6 | 650 | 461 | 650 | 931 | 6.8 / 11.1 | 0 | 163 | 437 |
| simonton.mega.SniperFrog 1.0.fix2 | 650 | 386 | 650 | 821 | 10.5 / 4.9 | 8 | 460 | 163 |
| suh.micro.MirrorPM 1.00 | 650 | 488 | 400 | 841 | 59.5 / 5.4 | 563 | 125 | 76 |
| vic.Locke 0.7.5.5 | 650 | 440 | 650 | 857 | 5.3 / 7.0 | 0 | 84 | 0 |
| amk.ChumbaMini 0.2 | 650 | 469 | 608 | 420 | 41.2 / 26.9 | 801 | 1612 | 1247 |
| bvh.mini.Fenrir 0.39 | 650 | 426 | 650 | 573 | 32.9 / 20.9 | 579 | 773 | 1 |
| cx.micro.Smoke 0.96 | 650 | 462 | 650 | 617 | 10.4 / 11.7 | 2 | 324 | 164 |
| dft.Virgin 1.25 | 650 | 441 | 650 | 629 | 10.0 / 3.5 | 3 | 187 | 0 |
| jam.micro.RaikoMicro 1.44 | 650 | 447 | 650 | 813 | 5.1 / 4.8 | 0 | 57 | 0 |
| kid.Gladiator .7.2 | 650 | 472 | 483 | 854 | 19.6 / 3.6 | 48 | 30 | 37 |
| nat.Hikari dev0001 | 650 | 322 | 650 | 700 | 8.3 / 9.3 | 6 | 120 | 75 |
| pez.gloom.GloomyDark 0.9.2 | 650 | 452 | 650 | 814 | 7.6 / 6.9 | 0 | 122 | 1 |
| rsim.mini.BulletCatcher 0.4 | 650 | 354 | 642 | 847 | 25.2 / 15.1 | 225 | 847 | 433 |
| stelo.MatchupMini 1.1 | 650 | 463 | 650 | 700 | 25.8 / 27.8 | 203 | 388 | 1011 |
| theo.Tungsten 1.0a | 650 | 411 | 650 | 760 | 12.4 / 10.7 | 37 | 297 | 0 |
| wcsv.mega.PowerHouse2 0.2 | 650 | 390 | 650 | 713 | 15.3 / 15.4 | 52 | 492 | 254 |
| amk.ChumbaWumba 0.3 | 650 | 447 | 650 | 558 | 10.3 / 7.0 | 60 | 415 | 210 |
| casey.Flee 1.0 | 650 | 397 | 650 | 568 | 8.9 / 9.8 | 25 | 432 | 277 |
| gh.GrubbmGrb 1.2.4 | 650 | 450 | 650 | 805 | 17.1 / 8.9 | 18 | 563 | 1 |
| kawigi.mini.Fhqwhgads 1.1 | 650 | 360 | 650 | 685 | 9.8 / 9.7 | 54 | 229 | 471 |
| lucasslf.Dodger 1.0 | 650 | 410 | 650 | 1208 | 5.7 / 8.9 | 0 | 202 | 390 |
| nkn.mini.Jskr0 0.1 | 650 | 414 | 650 | 741 | 5.3 / 4.0 | 2 | 24 | 33 |
| pedersen.Hubris 2.4 | 650 | 399 | 508 | 513 | 51.6 / 28.5 | 1075 | 1619 | 34 |
| reaper.Reaper 1.1 | 650 | 408 | 650 | 746 | 7.0 / 2.4 | 1 | 98 | 0 |
| shinh.Entangled 0.3 | 650 | 501 | 650 | 1131 | 15.4 / 9.5 | 97 | 212 | 64 |
| stelo.SteloTestNano 1.0 | 650 | 372 | 650 | 553 | 12.0 / 7.2 | 29 | 163 | 111 |
| timmit.nano.TimCat 0.13 | 650 | 398 | 400 | 429 | 36.8 / 15.6 | 449 | 1404 | 105 |
| wiki.BasicGFSurfer 1.02 | 650 | 354 | 650 | 715 | 18.3 / 18.7 | 232 | 574 | 605 |
| bndl.LostLion 1.2 | 650 | 527 | 650 | 976 | 22.0 / 8.5 | 178 | 459 | 0 |
| dz.Caedo 1.4 | 650 | 273 | 650 | 685 | 22.9 / 15.6 | 301 | 478 | 567 |
| lrem.quickhack.QuickHack 1.0 | 650 | 253 | 650 | 1008 | 6.6 / 8.1 | 2 | 657 | 780 |
| mz.Adept 2.65 | 650 | 226 | 650 | 549 | 14.3 / 10.5 | 54 | 279 | 112 |
| rsk1.RSK1 4.0 | 650 | 371 | 650 | 772 | 11.2 / 9.5 | 84 | 293 | 274 |
| throxbot.ThroxBot 0.1 | 650 | 414 | 567 | 569 | 36.0 / 15.1 | 453 | 510 | 145 |
| cli.WasteOfAmmo 1.0 | 650 | 357 | 400 | 218 | 72.2 / 0.0 | 365 | 48 | 0 |
| gh.nano.Grofvuil 0.2 | 650 | 202 | 650 | 836 | 15.5 / 4.5 | 47 | 193 | 0 |
| logiblocs.SittingDroid 1.0 | 650 | 404 | 650 | 231 | 120.0 / 0.0 | 0 | 0 | 0 |
| Noran.RandomTargeting 0.02 | 650 | 500 | 567 | 1605 | 9.6 / 0.5 | 31 | 85 | 26 |
| sample.Fire | 650 | 412 | 408 | 612 | 71.9 / 1.2 | 280 | 128 | 30 |
| suh.nano.OscillatorL 1.00 | 650 | 301 | 400 | 301 | 62.7 / 16.6 | 1083 | 1329 | 260 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| apv.test.Virus 0.6.1 | 3.9% | 2 | 24 | 2 | 2.2 | 21 / 5567 (0%) | 0 | 0 |
| cf.mini.Chiva 1.0 | 7.4% | 3 | 33 | 3 | 9.1 | 68 / 1288 (5%) | 0 | 0 |
| cx.Princess 1.0 | 0.2% | 0 | 8 | 1 | 0.5 | 4 / 156 (3%) | 0 | 0 |
| ej.ChocolateBar 1.1 | 1.1% | 0 | 44 | 1 | 1.8 | 16 / 5243 (0%) | 0 | 0 |
| kcn.unnamed.Unnamed 1.21 | 0.9% | 2 | 38 | 2 | 4.0 | 41 / 4975 (1%) | 0 | 0 |
| mue.Hyperion 0.8 | 8.7% | 9 | 60 | 3 | 34.7 | 345 / 829 (42%) | 0 | 0 |
| ph.musketeer.Musketeer 0.6 | 4.1% | 4 | 47 | 3 | 7.2 | 68 / 6004 (1%) | 0 | 0 |
| simonton.mega.SniperFrog 1.0.fix2 | 1.5% | 4 | 36 | 3 | 5.4 | 48 / 5240 (1%) | 0 | 0 |
| suh.micro.MirrorPM 1.00 | 2.9% | 2 | 30 | 2 | 2.6 | 15 / 6099 (0%) | 0 | 0 |
| vic.Locke 0.7.5.5 | 1.3% | 2 | 49 | 2 | 3.7 | 30 / 5137 (1%) | 0 | 0 |
| amk.ChumbaMini 0.2 | 6.7% | 6 | 49 | 2 | 23.7 | 242 / 249 (97%) | 0 | 0 |
| bvh.mini.Fenrir 0.39 | 5.5% | 16 | 55 | 3 | 14.9 | 95 / 1648 (6%) | 0 | 0 |
| cx.micro.Smoke 0.96 | 2.2% | 5 | 1953 | 2 | 5.0 | 47 / 2779 (2%) | 0 | 0 |
| dft.Virgin 1.25 | 1.2% | 16 | 30 | 3 | 1.7 | 12 / 3375 (0%) | 0 | 0 |
| jam.micro.RaikoMicro 1.44 | 1.3% | 13 | 36 | 3 | 1.7 | 14 / 4825 (0%) | 0 | 0 |
| kid.Gladiator .7.2 | 0.8% | 21 | 73 | 3 | 7.7 | 33 / 2904 (1%) | 0 | 0 |
| nat.Hikari dev0001 | 2.9% | 11 | 33 | 3 | 2.8 | 34 / 4476 (1%) | 0 | 0 |
| pez.gloom.GloomyDark 0.9.2 | 1.4% | 9 | 30 | 2 | 2.3 | 18 / 4670 (0%) | 0 | 0 |
| rsim.mini.BulletCatcher 0.4 | 5.9% | 8 | 48 | 2 | 10.9 | 83 / 5277 (2%) | 0 | 0 |
| stelo.MatchupMini 1.1 | 6.5% | 12 | 85 | 3 | 28.0 | 239 / 2167 (11%) | 0 | 0 |
| theo.Tungsten 1.0a | 2.4% | 4 | 74 | 2 | 4.4 | 52 / 4389 (1%) | 0 | 0 |
| wcsv.mega.PowerHouse2 0.2 | 3.3% | 16 | 42 | 3 | 6.1 | 95 / 4161 (2%) | 0 | 0 |
| amk.ChumbaWumba 0.3 | 1.7% | 7 | 51 | 3 | 3.3 | 22 / 2948 (1%) | 0 | 0 |
| casey.Flee 1.0 | 2.3% | 8 | 52 | 3 | 2.9 | 22 / 3212 (1%) | 0 | 0 |
| gh.GrubbmGrb 1.2.4 | 6.8% | 10 | 63 | 3 | 7.7 | 104 / 4953 (2%) | 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 5.0% | 4 | 55 | 3 | 6.0 | 57 / 3890 (1%) | 0 | 0 |
| lucasslf.Dodger 1.0 | 3.0% | 9 | 73 | 3 | 3.6 | 24 / 9117 (0%) | 0 | 0 |
| nkn.mini.Jskr0 0.1 | 0.9% | 6 | 43 | 3 | 1.4 | 17 / 4936 (0%) | 0 | 0 |
| pedersen.Hubris 2.4 | 9.7% | 10 | 46 | 3 | 27.2 | 220 / 520 (42%) | 0 | 0 |
| reaper.Reaper 1.1 | 0.8% | 5 | 46 | 2 | 1.4 | 13 / 4762 (0%) | 0 | 0 |
| shinh.Entangled 0.3 | 3.0% | 12 | 47 | 3 | 8.0 | 71 / 7471 (1%) | 0 | 0 |
| stelo.SteloTestNano 1.0 | 2.6% | 28 | 51 | 3 | 2.1 | 21 / 2980 (1%) | 0 | 0 |
| timmit.nano.TimCat 0.13 | 3.7% | 27 | 82 | 3 | 14.1 | 60 / 911 (7%) | 0 | 0 |
| wiki.BasicGFSurfer 1.02 | 4.4% | 4 | 57 | 3 | 16.0 | 183 / 3438 (5%) | 0 | 0 |
| bndl.LostLion 1.2 | 2.7% | 2 | 183 | 2 | 11.1 | 44 / 6440 (1%) | 0 | 0 |
| dz.Caedo 1.4 | 6.7% | 3 | 691 | 1 | 8.1 | 66 / 3689 (2%) | 0 | 0 |
| lrem.quickhack.QuickHack 1.0 | 4.1% | 8 | 374 | 2 | 4.3 | 34 / 6948 (0%) | 0 | 0 |
| mz.Adept 2.65 | 3.2% | 3 | 29 | 3 | 2.2 | 28 / 2959 (1%) | 0 | 0 |
| rsk1.RSK1 4.0 | 2.5% | 1 | 43 | 2 | 6.2 | 61 / 4503 (1%) | 0 | 0 |
| throxbot.ThroxBot 0.1 | 5.6% | 10 | 51 | 3 | 7.1 | 43 / 2939 (1%) | 0 | 0 |
| cli.WasteOfAmmo 1.0 | 0.0% | 4 | 12 | 2 | 0.4 | - | 0 | 0 |
| gh.nano.Grofvuil 0.2 | 1.7% | 3 | 41 | 3 | 2.1 | 13 / 5872 (0%) | 0 | 0 |
| logiblocs.SittingDroid 1.0 | 0.0% | 3 | 17 | 2 | 0.0 | - | 0 | 0 |
| Noran.RandomTargeting 0.02 | 0.1% | 6 | 44 | 2 | 4.3 | 49 / 12659 (0%) | 0 | 0 |
| sample.Fire | 6.4% | 4 | 24 | 3 | 1.4 | 8 / 2871 (0%) | 0 | 0 |
| suh.nano.OscillatorL 1.00 | 6.1% | 7 | 27 | 3 | 14.8 | 105 / 435 (24%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| apv.test.Virus 0.6.1 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| cf.mini.Chiva 1.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| cx.Princess 1.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| ej.ChocolateBar 1.1 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| kcn.unnamed.Unnamed 1.21 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| mue.Hyperion 0.8 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| ph.musketeer.Musketeer 0.6 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| simonton.mega.SniperFrog 1.0.fix2 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| suh.micro.MirrorPM 1.00 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| vic.Locke 0.7.5.5 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| amk.ChumbaMini 0.2 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| bvh.mini.Fenrir 0.39 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| cx.micro.Smoke 0.96 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| dft.Virgin 1.25 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| jam.micro.RaikoMicro 1.44 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| kid.Gladiator .7.2 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| nat.Hikari dev0001 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| pez.gloom.GloomyDark 0.9.2 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| rsim.mini.BulletCatcher 0.4 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| stelo.MatchupMini 1.1 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| theo.Tungsten 1.0a | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| wcsv.mega.PowerHouse2 0.2 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| amk.ChumbaWumba 0.3 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| casey.Flee 1.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| gh.GrubbmGrb 1.2.4 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| lucasslf.Dodger 1.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| nkn.mini.Jskr0 0.1 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| pedersen.Hubris 2.4 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| reaper.Reaper 1.1 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| shinh.Entangled 0.3 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| stelo.SteloTestNano 1.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| timmit.nano.TimCat 0.13 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| wiki.BasicGFSurfer 1.02 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| bndl.LostLion 1.2 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| dz.Caedo 1.4 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| lrem.quickhack.QuickHack 1.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| mz.Adept 2.65 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| rsk1.RSK1 4.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| throxbot.ThroxBot 0.1 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| cli.WasteOfAmmo 1.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| gh.nano.Grofvuil 0.2 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| logiblocs.SittingDroid 1.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| Noran.RandomTargeting 0.02 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| sample.Fire | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| suh.nano.OscillatorL 1.00 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.8-on vs hadur2.Hadur 3.8-off

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| apv.test.Virus 0.6.1 | 88.2% ± 4.1 | 64.9% ± 11.5 | +23.3 ± 15.4 |
| cf.mini.Chiva 1.0 | 86.8% ± 2.4 | 81.7% ± 5.7 | +5.1 ± 8.1 |
| cx.Princess 1.0 | 97.3% ± 6.5 | 98.8% ± 1.5 | -1.5 ± 7.9 |
| ej.ChocolateBar 1.1 | 91.8% ± 11.4 | 72.6% ± 13.8 | +19.1 ± 22.8 |
| kcn.unnamed.Unnamed 1.21 | 95.6% ± 3.4 | 79.3% ± 5.9 | +16.2 ± 9.3 |
| mue.Hyperion 0.8 | 69.7% ± 10.8 | 68.8% ± 2.6 | +0.8 ± 13.2 |
| ph.musketeer.Musketeer 0.6 | 79.0% ± 13.6 | 67.4% ± 8.7 | +11.6 ± 16.3 |
| simonton.mega.SniperFrog 1.0.fix2 | 93.7% ± 6.7 | 71.8% ± 14.5 | +22.0 ± 19.5 |
| suh.micro.MirrorPM 1.00 | 95.1% ± 5.2 | 70.1% ± 85.5 | +25.1 ± 84.9 |
| vic.Locke 0.7.5.5 | 87.6% ± 15.8 | 62.5% ± 11.8 | +25.0 ± 5.6 |
| amk.ChumbaMini 0.2 | 77.8% ± 4.9 | 80.0% ± 8.1 | -2.2 ± 12.0 |
| bvh.mini.Fenrir 0.39 | 77.8% ± 5.4 | 78.1% ± 8.2 | -0.3 ± 13.6 |
| cx.micro.Smoke 0.96 | 84.0% ± 10.1 | 70.4% ± 14.4 | +13.6 ± 9.4 |
| dft.Virgin 1.25 | 95.4% ± 5.3 | 76.0% ± 13.6 | +19.4 ± 18.9 |
| jam.micro.RaikoMicro 1.44 | 90.6% ± 4.1 | 72.5% ± 16.8 | +18.1 ± 20.8 |
| kid.Gladiator .7.2 | 93.8% ± 8.5 | 82.4% ± 3.1 | +11.3 ± 10.0 |
| nat.Hikari dev0001 | 86.7% ± 8.8 | 83.8% ± 3.0 | +2.9 ± 8.2 |
| pez.gloom.GloomyDark 0.9.2 | 85.8% ± 4.7 | 76.2% ± 13.5 | +9.7 ± 17.2 |
| rsim.mini.BulletCatcher 0.4 | 83.9% ± 6.5 | 85.7% ± 5.8 | -1.8 ± 12.1 |
| stelo.MatchupMini 1.1 | 66.4% ± 10.7 | 66.8% ± 6.8 | -0.4 ± 16.7 |
| theo.Tungsten 1.0a | 81.5% ± 15.6 | 74.2% ± 5.8 | +7.3 ± 17.0 |
| wcsv.mega.PowerHouse2 0.2 | 77.8% ± 13.7 | 71.7% ± 7.2 | +6.2 ± 14.5 |
| amk.ChumbaWumba 0.3 | 88.6% ± 18.4 | 85.3% ± 3.2 | +3.4 ± 21.3 |
| casey.Flee 1.0 | 84.0% ± 15.6 | 89.8% ± 5.7 | -5.7 ± 11.5 |
| gh.GrubbmGrb 1.2.4 | 86.3% ± 25.1 | 83.5% ± 11.2 | +2.7 ± 17.9 |
| kawigi.mini.Fhqwhgads 1.1 | 82.4% ± 14.2 | 80.0% ± 15.0 | +2.4 ± 8.3 |
| lucasslf.Dodger 1.0 | 83.1% ± 7.7 | 81.2% ± 5.2 | +1.9 ± 12.2 |
| nkn.mini.Jskr0 0.1 | 93.5% ± 8.1 | 85.4% ± 1.3 | +8.1 ± 7.7 |
| pedersen.Hubris 2.4 | 74.4% ± 4.8 | 83.4% ± 5.2 | -9.0 ± 7.7 |
| reaper.Reaper 1.1 | 95.9% ± 10.1 | 86.6% ± 2.5 | +9.2 ± 11.7 |
| shinh.Entangled 0.3 | 86.9% ± 2.1 | 87.6% ± 1.9 | -0.7 ± 3.6 |
| stelo.SteloTestNano 1.0 | 88.9% ± 6.4 | 87.6% ± 6.3 | +1.3 ± 12.2 |
| timmit.nano.TimCat 0.13 | 84.3% ± 0.6 | 96.9% ± 3.1 | -12.6 ± 2.7 |
| wiki.BasicGFSurfer 1.02 | 73.9% ± 6.1 | 79.6% ± 6.4 | -5.7 ± 12.5 |
| bndl.LostLion 1.2 | 90.6% ± 8.8 | 92.9% ± 4.5 | -2.3 ± 8.8 |
| dz.Caedo 1.4 | 80.5% ± 15.2 | 83.5% ± 9.3 | -3.0 ± 5.9 |
| lrem.quickhack.QuickHack 1.0 | 89.4% ± 3.9 | 88.1% ± 12.4 | +1.3 ± 15.1 |
| mz.Adept 2.65 | 83.9% ± 3.5 | 90.2% ± 4.0 | -6.3 ± 6.9 |
| rsk1.RSK1 4.0 | 85.2% ± 14.0 | 89.2% ± 10.6 | -4.0 ± 3.5 |
| throxbot.ThroxBot 0.1 | 85.0% ± 2.2 | 94.8% ± 2.9 | -9.9 ± 5.0 |
| cli.WasteOfAmmo 1.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 |
| gh.nano.Grofvuil 0.2 | 94.5% ± 3.1 | 98.8% ± 1.0 | -4.3 ± 2.5 |
| logiblocs.SittingDroid 1.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 |
| Noran.RandomTargeting 0.02 | 99.3% ± 1.3 | 99.6% ± 0.4 | -0.3 ± 1.6 |
| sample.Fire | 99.2% ± 0.2 | 100.0% ± 0.0 | -0.8 ± 0.2 |
| suh.nano.OscillatorL 1.00 | 83.5% ± 1.8 | 97.3% ± 5.2 | -13.8 ± 5.3 |

**Stratified APS estimate (BENCH-1):** candidate 86.8% ± 2.4, baseline 83.9% ± 3.0.

## Shield probe (BENCH-11): shield mode on against off

`hadur2.Hadur 3.8-on` has the shield list name every opponent below; `hadur2.Hadur 3.8-off` has an empty list. The two jars are the same bytes apart from that list and the version string, and each seed is fought by both at the same `RANDOMSEED`, so the paired difference is the effect of shield mode. Positive means shield mode scores more.

| Opponent | Weight | Shield on | Shield off | Paired diff (pp) | Verdict | Rounds on | Shield shots | Met bullets | Hits taken | Left early | Budget exits |
|---|---|---|---|---|---|---|---|---|---|---|---|
| apv.test.Virus 0.6.1 | 0.01289 | 88.2% ± 4.1 | 64.9% ± 11.5 | +23.3 ± 15.4 | wins | 105 | 5549 | 5544 | 204 | {close=9, unpredicted=34} | 0 |
| cf.mini.Chiva 1.0 | 0.01289 | 86.8% ± 2.4 | 81.7% ± 5.7 | +5.1 ± 8.1 | open | 70 | 1250 | 1212 | 95 | {close=44, quiet=2} | 3 |
| cx.Princess 1.0 | 0.01289 | 97.3% ± 6.5 | 98.8% ± 1.5 | -1.5 ± 7.9 | open | 6 | 157 | 151 | 5 | {close=2, unpredicted=1} | 0 |
| ej.ChocolateBar 1.1 | 0.01289 | 91.8% ± 11.4 | 72.6% ± 13.8 | +19.1 ± 22.8 | open | 105 | 5228 | 5227 | 42 | {close=6, quiet=26} | 0 |
| kcn.unnamed.Unnamed 1.21 | 0.01289 | 95.6% ± 3.4 | 79.3% ± 5.9 | +16.2 ± 9.3 | wins | 105 | 4945 | 4934 | 28 | {close=11, quiet=30} | 0 |
| mue.Hyperion 0.8 | 0.01289 | 69.7% ± 10.8 | 68.8% ± 2.6 | +0.8 ± 13.2 | open | 26 | 556 | 484 | 73 | {close=2, outhit=2, unpredicted=16} | 3 |
| ph.musketeer.Musketeer 0.6 | 0.01289 | 79.0% ± 13.6 | 67.4% ± 8.7 | +11.6 ± 16.3 | open | 101 | 5941 | 5935 | 220 | {close=10, unpredicted=52} | 1 |
| simonton.mega.SniperFrog 1.0.fix2 | 0.01289 | 93.7% ± 6.7 | 71.8% ± 14.5 | +22.0 ± 19.5 | wins | 105 | 5202 | 5192 | 26 | {close=15, unpredicted=2} | 0 |
| suh.micro.MirrorPM 1.00 | 0.01289 | 95.1% ± 5.2 | 70.1% ± 85.5 | +25.1 ± 84.9 | open | 105 | 6171 | 6081 | 66 | {close=12, quiet=40, unpredicted=13} | 0 |
| vic.Locke 0.7.5.5 | 0.01289 | 87.6% ± 15.8 | 62.5% ± 11.8 | +25.0 ± 5.6 | wins | 105 | 5126 | 5106 | 51 | {close=9, quiet=22, unpredicted=2} | 0 |
| amk.ChumbaMini 0.2 | 0.02474 | 77.8% ± 4.9 | 80.0% ± 8.1 | -2.2 ± 12.0 | open | 28 | 95 | 5 | 49 | {close=3, outhit=1, unpredicted=21} | 3 |
| bvh.mini.Fenrir 0.39 | 0.02474 | 77.8% ± 5.4 | 78.1% ± 8.2 | -0.3 ± 13.6 | open | 75 | 1868 | 1551 | 81 | {close=15, duress=1, quiet=3, unpredicted=16} | 3 |
| cx.micro.Smoke 0.96 | 0.02474 | 84.0% ± 10.1 | 70.4% ± 14.4 | +13.6 ± 9.4 | wins | 97 | 2812 | 2726 | 52 | {close=7, quiet=19, unpredicted=7} | 1 |
| dft.Virgin 1.25 | 0.02474 | 95.4% ± 5.3 | 76.0% ± 13.6 | +19.4 ± 18.9 | wins | 105 | 3383 | 3361 | 16 | {close=7, duress=1, quiet=17} | 0 |
| jam.micro.RaikoMicro 1.44 | 0.02474 | 90.6% ± 4.1 | 72.5% ± 16.8 | +18.1 ± 20.8 | open | 105 | 4812 | 4809 | 30 | {close=5, duress=1, quiet=32} | 0 |
| kid.Gladiator .7.2 | 0.02474 | 93.8% ± 8.5 | 82.4% ± 3.1 | +11.3 ± 10.0 | wins | 105 | 2891 | 2869 | 15 | {close=8, duress=1, quiet=80, unpredicted=1} | 0 |
| nat.Hikari dev0001 | 0.02474 | 86.7% ± 8.8 | 83.8% ± 3.0 | +2.9 ± 8.2 | open | 105 | 4453 | 4441 | 94 | {close=6, duress=1, unpredicted=5} | 1 |
| pez.gloom.GloomyDark 0.9.2 | 0.02474 | 85.8% ± 4.7 | 76.2% ± 13.5 | +9.7 ± 17.2 | open | 105 | 4679 | 4651 | 55 | {close=6, quiet=17} | 0 |
| rsim.mini.BulletCatcher 0.4 | 0.02474 | 83.9% ± 6.5 | 85.7% ± 5.8 | -1.8 ± 12.1 | open | 94 | 5226 | 5186 | 241 | {close=11, unpredicted=42} | 2 |
| stelo.MatchupMini 1.1 | 0.02474 | 66.4% ± 10.7 | 66.8% ± 6.8 | -0.4 ± 16.7 | open | 50 | 1962 | 1924 | 82 | {close=9, unpredicted=9} | 3 |
| theo.Tungsten 1.0a | 0.02474 | 81.5% ± 15.6 | 74.2% ± 5.8 | +7.3 ± 17.0 | open | 105 | 4377 | 4336 | 100 | {close=13, quiet=10, unpredicted=6} | 0 |
| wcsv.mega.PowerHouse2 0.2 | 0.02474 | 77.8% ± 13.7 | 71.7% ± 7.2 | +6.2 ± 14.5 | open | 92 | 4091 | 4062 | 102 | {close=6, duress=2, quiet=1, unpredicted=3} | 2 |
| amk.ChumbaWumba 0.3 | 0.02684 | 88.6% ± 18.4 | 85.3% ± 3.2 | +3.4 ± 21.3 | open | 105 | 2942 | 2926 | 30 | {close=16} | 0 |
| casey.Flee 1.0 | 0.02684 | 84.0% ± 15.6 | 89.8% ± 5.7 | -5.7 ± 11.5 | open | 105 | 3195 | 3189 | 59 | {close=13, unpredicted=4} | 0 |
| gh.GrubbmGrb 1.2.4 | 0.02684 | 86.3% ± 25.1 | 83.5% ± 11.2 | +2.7 ± 17.9 | open | 91 | 4884 | 4846 | 45 | {close=5, duress=1, outhit=3, quiet=6} | 1 |
| kawigi.mini.Fhqwhgads 1.1 | 0.02684 | 82.4% ± 14.2 | 80.0% ± 15.0 | +2.4 ± 8.3 | open | 105 | 3846 | 3830 | 178 | {close=17, unpredicted=41} | 0 |
| lucasslf.Dodger 1.0 | 0.02684 | 83.1% ± 7.7 | 81.2% ± 5.2 | +1.9 ± 12.2 | open | 105 | 9082 | 9090 | 235 | {close=8, duress=1, unpredicted=45} | 0 |
| nkn.mini.Jskr0 0.1 | 0.02684 | 93.5% ± 8.1 | 85.4% ± 1.3 | +8.1 ± 7.7 | wins | 105 | 4924 | 4919 | 32 | {close=4} | 0 |
| pedersen.Hubris 2.4 | 0.02684 | 74.4% ± 4.8 | 83.4% ± 5.2 | -9.0 ± 7.7 | loses | 41 | 364 | 298 | 71 | {close=5, duress=1, quiet=2, unpredicted=27} | 3 |
| reaper.Reaper 1.1 | 0.02684 | 95.9% ± 10.1 | 86.6% ± 2.5 | +9.2 ± 11.7 | open | 105 | 4761 | 4749 | 16 | {close=6, quiet=4, unpredicted=1} | 0 |
| shinh.Entangled 0.3 | 0.02684 | 86.9% ± 2.1 | 87.6% ± 1.9 | -0.7 ± 3.6 | open | 105 | 7577 | 7372 | 124 | {close=10, duress=1, quiet=7, unpredicted=34} | 0 |
| stelo.SteloTestNano 1.0 | 0.02684 | 88.9% ± 6.4 | 87.6% ± 6.3 | +1.3 ± 12.2 | open | 105 | 2995 | 2956 | 42 | {close=10, duress=1, unpredicted=3} | 0 |
| timmit.nano.TimCat 0.13 | 0.02684 | 84.3% ± 0.6 | 96.9% ± 3.1 | -12.6 ± 2.7 | loses | 55 | 980 | 841 | 82 | {close=7, quiet=1, unpredicted=30} | 3 |
| wiki.BasicGFSurfer 1.02 | 0.02684 | 73.9% ± 6.1 | 79.6% ± 6.4 | -5.7 ± 12.5 | open | 75 | 3263 | 3251 | 88 | {close=20} | 3 |
| bndl.LostLion 1.2 | 0.01681 | 90.6% ± 8.8 | 92.9% ± 4.5 | -2.3 ± 8.8 | open | 105 | 6582 | 6361 | 128 | {close=5, quiet=2, unpredicted=49} | 0 |
| dz.Caedo 1.4 | 0.01681 | 80.5% ± 15.2 | 83.5% ± 9.3 | -3.0 ± 5.9 | open | 87 | 3632 | 3620 | 204 | {close=7, unpredicted=56} | 2 |
| lrem.quickhack.QuickHack 1.0 | 0.01681 | 89.4% ± 3.9 | 88.1% ± 12.4 | +1.3 ± 15.1 | open | 105 | 6929 | 6907 | 269 | {close=7, unpredicted=92} | 0 |
| mz.Adept 2.65 | 0.01681 | 83.9% ± 3.5 | 90.2% ± 4.0 | -6.3 ± 6.9 | open | 100 | 2945 | 2931 | 89 | {close=8, quiet=8, unpredicted=1} | 1 |
| rsk1.RSK1 4.0 | 0.01681 | 85.2% ± 14.0 | 89.2% ± 10.6 | -4.0 ± 3.5 | loses | 99 | 4471 | 4437 | 62 | {close=8, outhit=1, quiet=1, unpredicted=6} | 1 |
| throxbot.ThroxBot 0.1 | 0.01681 | 85.0% ± 2.2 | 94.8% ± 2.9 | -9.9 ± 5.0 | loses | 87 | 2950 | 2896 | 163 | {close=12, unpredicted=17} | 2 |
| cli.WasteOfAmmo 1.0 | 0.02521 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | open | 105 | 907 | 0 | 0 | {close=7, quiet=8} | 0 |
| gh.nano.Grofvuil 0.2 | 0.02521 | 94.5% ± 3.1 | 98.8% ± 1.0 | -4.3 ± 2.5 | loses | 104 | 5863 | 5859 | 55 | {close=12, duress=1, rammed=1} | 0 |
| logiblocs.SittingDroid 1.0 | 0.02521 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | open | 105 | 0 | 0 | 0 | {close=7, quiet=98} | 0 |
| Noran.RandomTargeting 0.02 | 0.02521 | 99.3% ± 1.3 | 99.6% ± 0.4 | -0.3 ± 1.6 | open | 105 | 12612 | 12610 | 12 | {close=8} | 0 |
| sample.Fire | 0.02521 | 99.2% ± 0.2 | 100.0% ± 0.0 | -0.8 ± 0.2 | loses | 105 | 2883 | 2863 | 32 | {close=10, outhit=2, quiet=50} | 0 |
| suh.nano.OscillatorL 1.00 | 0.02521 | 83.5% ± 1.8 | 97.3% ± 5.2 | -13.8 ± 5.3 | loses | 19 | 330 | 330 | 81 | {close=3} | 3 |

**Weighted mean paired difference over the 46 opponents (BENCH-1 weights):** +2.9 ± 2.7 pp.

Verdicts: *wins* when the interval of the paired difference lies above 0, *loses* when it lies below, *open* when it spans 0 or there is only one seed. Put an opponent on the list only when it wins over enough seeds (twenty resolve a paired difference to about ±2.7 points).

Opponents shield mode wins against, as entries for `ShieldListData.lines()` (`hadur-robot/src/main/java/hadur2/ShieldListData.java`):

```
apv.test.Virus 0.6.1
kcn.unnamed.Unnamed 1.21
simonton.mega.SniperFrog 1.0.fix2
vic.Locke 0.7.5.5
cx.micro.Smoke 0.96
dft.Virgin 1.25
kid.Gladiator .7.2
nkn.mini.Jskr0 0.1
```

# Bench: hadur2.Hadur 3.8-on baseline (hadur2.Hadur 3.8-off) (cold)

35 rounds x 3 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=3569580.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

**Stratified APS estimate (BENCH-1) for hadur2.Hadur 3.8-on baseline (hadur2.Hadur 3.8-off):** 83.9% ± 3.0.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| apv.test.Virus 0.6.1 | shield-under-70 | 64.9% ± 11.5 | 80.0% ± 12.3 | 49.9% ± 9.0 | 84 / 105 | 10.6% ± 0.5 | 7.2% ± 1.9 | 11 | 0 | 1.62 / 31.8 |
| cf.mini.Chiva 1.0 | shield-under-70 | 81.7% ± 5.7 | 95.2% ± 8.2 | 68.8% ± 3.9 | 100 / 105 | 17.3% ± 3.9 | 6.8% ± 0.9 | 6 | 0 | 1.11 / 12.3 |
| cx.Princess 1.0 | shield-under-70 | 98.8% ± 1.5 | 100.0% ± 0.0 | 79.8% ± 22.2 | 105 / 105 | 0.9% ± 0.2 | 0.3% ± 0.4 | 0 | 0 | 1.13 / 11.4 |
| ej.ChocolateBar 1.1 | shield-under-70 | 72.6% ± 13.8 | 88.6% ± 14.2 | 56.0% ± 14.9 | 93 / 105 | 11.7% ± 1.9 | 6.2% ± 1.8 | 12 | 0 | 1.28 / 19.5 |
| kcn.unnamed.Unnamed 1.21 | shield-under-70 | 79.3% ± 5.9 | 95.2% ± 4.1 | 60.4% ± 4.5 | 100 / 105 | 10.8% ± 3.2 | 5.1% ± 1.1 | 16 | 0 | 1.29 / 64.5 |
| mue.Hyperion 0.8 | shield-under-70 | 68.8% ± 2.6 | 80.0% ± 7.1 | 59.1% ± 2.1 | 84 / 105 | 15.0% ± 2.4 | 9.0% ± 1.3 | 8 | 0 | 1.27 / 14.0 |
| ph.musketeer.Musketeer 0.6 | shield-under-70 | 67.4% ± 8.7 | 82.9% ± 7.1 | 52.3% ± 9.9 | 87 / 105 | 11.9% ± 1.8 | 7.2% ± 1.3 | 12 | 0 | 1.30 / 20.6 |
| simonton.mega.SniperFrog 1.0.fix2 | shield-under-70 | 71.8% ± 14.5 | 83.8% ± 14.8 | 60.4% ± 15.5 | 88 / 105 | 14.6% ± 3.7 | 7.4% ± 0.7 | 11 | 0 | 1.55 / 16.6 |
| suh.micro.MirrorPM 1.00 | shield-under-70 | 70.1% ± 85.5 | 77.1% ± 98.4 | 64.8% ± 75.3 | 81 / 105 | 32.0% ± 26.7 | 12.9% ± 6.6 | 3 | 0 | 1.09 / 10.5 |
| vic.Locke 0.7.5.5 | shield-under-70 | 62.5% ± 11.8 | 77.1% ± 12.3 | 48.3% ± 9.1 | 81 / 105 | 11.2% ± 2.9 | 7.5% ± 1.0 | 20 | 0 | 1.55 / 46.9 |
| amk.ChumbaMini 0.2 | shield-70-80 | 80.0% ± 8.1 | 95.2% ± 4.1 | 64.2% ± 12.6 | 100 / 105 | 16.7% ± 5.9 | 6.1% ± 0.8 | 12 | 0 | 1.11 / 17.8 |
| bvh.mini.Fenrir 0.39 | shield-70-80 | 78.1% ± 8.2 | 89.5% ± 10.8 | 68.3% ± 7.7 | 94 / 105 | 18.8% ± 3.4 | 8.0% ± 2.4 | 11 | 0 | 1.11 / 38.3 |
| cx.micro.Smoke 0.96 | shield-70-80 | 70.4% ± 14.4 | 86.7% ± 17.9 | 53.4% ± 9.6 | 91 / 105 | 12.4% ± 1.4 | 5.9% ± 2.0 | 27 | 0 | 1.27 / 34.5 |
| dft.Virgin 1.25 | shield-70-80 | 76.0% ± 13.6 | 91.4% ± 18.8 | 58.5% ± 7.0 | 96 / 105 | 11.7% ± 3.6 | 5.4% ± 0.4 | 27 | 0 | 1.20 / 77.7 |
| jam.micro.RaikoMicro 1.44 | shield-70-80 | 72.5% ± 16.8 | 89.5% ± 21.7 | 54.2% ± 10.1 | 94 / 105 | 11.2% ± 2.4 | 6.4% ± 0.6 | 14 | 0 | 1.32 / 96.9 |
| kid.Gladiator .7.2 | shield-70-80 | 82.4% ± 3.1 | 94.3% ± 0.0 | 71.2% ± 5.3 | 99 / 105 | 14.6% ± 1.4 | 7.0% ± 2.0 | 15 | 0 | 0.99 / 33.8 |
| nat.Hikari dev0001 | shield-70-80 | 83.8% ± 3.0 | 97.1% ± 0.0 | 70.4% ± 5.0 | 102 / 105 | 15.8% ± 1.3 | 6.4% ± 1.2 | 9 | 0 | 1.17 / 40.6 |
| pez.gloom.GloomyDark 0.9.2 | shield-70-80 | 76.2% ± 13.5 | 89.5% ± 17.9 | 61.7% ± 7.9 | 94 / 105 | 11.9% ± 1.7 | 5.4% ± 1.3 | 9 | 0 | 1.25 / 25.2 |
| rsim.mini.BulletCatcher 0.4 | shield-70-80 | 85.7% ± 5.8 | 94.3% ± 7.1 | 77.9% ± 7.9 | 99 / 105 | 25.4% ± 3.5 | 7.0% ± 2.5 | 10 | 0 | 1.26 / 9.8 |
| stelo.MatchupMini 1.1 | shield-70-80 | 66.8% ± 6.8 | 81.9% ± 10.8 | 52.3% ± 1.8 | 86 / 105 | 12.0% ± 1.3 | 7.7% ± 1.9 | 10 | 0 | 2.53 / 30.4 |
| theo.Tungsten 1.0a | shield-70-80 | 74.2% ± 5.8 | 87.6% ± 4.1 | 59.2% ± 6.2 | 92 / 105 | 11.1% ± 1.8 | 7.8% ± 10.7 | 26 | 0 | 1.40 / 26.2 |
| wcsv.mega.PowerHouse2 0.2 | shield-70-80 | 71.7% ± 7.2 | 87.6% ± 10.8 | 56.0% ± 4.1 | 92 / 105 | 13.3% ± 2.4 | 7.2% ± 1.1 | 14 | 0 | 1.41 / 31.6 |
| amk.ChumbaWumba 0.3 | shield-80-90 | 85.3% ± 3.2 | 100.0% ± 0.0 | 65.0% ± 8.0 | 105 / 105 | 11.4% ± 3.0 | 3.9% ± 0.3 | 26 | 0 | 1.17 / 53.8 |
| casey.Flee 1.0 | shield-80-90 | 89.8% ± 5.7 | 100.0% ± 0.0 | 76.1% ± 10.8 | 105 / 105 | 14.9% ± 1.7 | 3.9% ± 2.5 | 9 | 0 | 1.01 / 17.3 |
| gh.GrubbmGrb 1.2.4 | shield-80-90 | 83.5% ± 11.2 | 93.3% ± 16.4 | 73.2% ± 5.4 | 98 / 105 | 15.8% ± 5.8 | 6.1% ± 1.4 | 15 | 0 | 1.22 / 24.6 |
| kawigi.mini.Fhqwhgads 1.1 | shield-80-90 | 80.0% ± 15.0 | 93.3% ± 14.8 | 65.5% ± 15.1 | 98 / 105 | 14.2% ± 3.1 | 6.6% ± 3.3 | 14 | 0 | 1.06 / 26.6 |
| lucasslf.Dodger 1.0 | shield-80-90 | 81.2% ± 5.2 | 95.2% ± 8.2 | 66.7% ± 0.8 | 100 / 105 | 13.8% ± 0.8 | 6.4% ± 1.0 | 14 | 0 | 1.32 / 39.9 |
| nkn.mini.Jskr0 0.1 | shield-80-90 | 85.4% ± 1.3 | 97.1% ± 0.0 | 72.1% ± 1.9 | 102 / 105 | 14.8% ± 0.3 | 5.0% ± 0.9 | 11 | 0 | 1.12 / 22.1 |
| pedersen.Hubris 2.4 | shield-80-90 | 83.4% ± 5.2 | 96.2% ± 8.2 | 71.5% ± 3.5 | 101 / 105 | 17.6% ± 0.6 | 7.5% ± 0.7 | 12 | 0 | 1.35 / 139.2 |
| reaper.Reaper 1.1 | shield-80-90 | 86.6% ± 2.5 | 99.0% ± 4.1 | 75.1% ± 6.8 | 104 / 105 | 15.5% ± 1.3 | 7.2% ± 0.9 | 27 | 0 | 1.36 / 57.7 |
| shinh.Entangled 0.3 | shield-80-90 | 87.6% ± 1.9 | 96.2% ± 4.1 | 79.8% ± 0.6 | 101 / 105 | 17.6% ± 1.2 | 7.3% ± 0.9 | 38 | 0 | 1.54 / 99.3 |
| stelo.SteloTestNano 1.0 | shield-80-90 | 87.6% ± 6.3 | 99.0% ± 4.1 | 76.1% ± 8.4 | 104 / 105 | 20.6% ± 3.5 | 5.6% ± 2.6 | 12 | 0 | 1.06 / 23.6 |
| timmit.nano.TimCat 0.13 | shield-80-90 | 96.9% ± 3.1 | 99.0% ± 4.1 | 93.6% ± 1.0 | 104 / 105 | 16.3% ± 1.5 | 0.8% ± 0.3 | 17 | 0 | 1.03 / 25.9 |
| wiki.BasicGFSurfer 1.02 | shield-80-90 | 79.6% ± 6.4 | 92.4% ± 8.2 | 66.6% ± 8.3 | 97 / 105 | 14.8% ± 2.0 | 6.5% ± 1.0 | 9 | 0 | 1.23 / 13.3 |
| bndl.LostLion 1.2 | shield-90-95 | 92.9% ± 4.5 | 99.0% ± 4.1 | 86.9% ± 11.5 | 104 / 105 | 21.8% ± 3.1 | 5.0% ± 4.7 | 7 | 0 | 2.94 / 65.0 |
| dz.Caedo 1.4 | shield-90-95 | 83.5% ± 9.3 | 87.6% ± 10.8 | 79.3% ± 9.0 | 92 / 105 | 19.4% ± 0.8 | 12.6% ± 1.3 | 6 | 0 | 1.21 / 11.8 |
| lrem.quickhack.QuickHack 1.0 | shield-90-95 | 88.1% ± 12.4 | 96.2% ± 10.8 | 81.0% ± 13.8 | 101 / 105 | 25.0% ± 5.3 | 8.3% ± 3.4 | 1 | 0 | 1.22 / 10.9 |
| mz.Adept 2.65 | shield-90-95 | 90.2% ± 4.0 | 99.0% ± 4.1 | 81.5% ± 7.4 | 104 / 105 | 23.8% ± 2.6 | 4.8% ± 2.8 | 3 | 0 | 1.05 / 10.6 |
| rsk1.RSK1 4.0 | shield-90-95 | 89.2% ± 10.6 | 96.2% ± 8.2 | 81.9% ± 13.8 | 101 / 105 | 16.9% ± 1.3 | 5.1% ± 4.5 | 4 | 0 | 1.24 / 15.0 |
| throxbot.ThroxBot 0.1 | shield-90-95 | 94.8% ± 2.9 | 100.0% ± 0.0 | 90.1% ± 4.9 | 105 / 105 | 31.5% ± 7.5 | 4.6% ± 3.1 | 6 | 0 | 1.03 / 11.1 |
| cli.WasteOfAmmo 1.0 | shield-95-up | 100.0% ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | 105 / 105 | 64.5% ± 0.9 | 0.0% ± 0.0 | 4 | 0 | 0.75 / 20.1 |
| gh.nano.Grofvuil 0.2 | shield-95-up | 98.8% ± 1.0 | 100.0% ± 0.0 | 97.7% ± 1.9 | 105 / 105 | 41.8% ± 4.3 | 1.0% ± 0.6 | 1 | 0 | 0.92 / 12.7 |
| logiblocs.SittingDroid 1.0 | shield-95-up | 100.0% ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | 105 / 105 | 79.6% ± 0.4 | 0.0% ± 0.0 | 1 | 0 | 0.57 / 12.6 |
| Noran.RandomTargeting 0.02 | shield-95-up | 99.6% ± 0.4 | 100.0% ± 0.0 | 99.3% ± 0.8 | 105 / 105 | 20.0% ± 4.7 | 0.8% ± 0.7 | 5 | 0 | 0.87 / 16.9 |
| sample.Fire | shield-95-up | 100.0% ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | 105 / 105 | 40.2% ± 2.9 | 0.0% ± 0.0 | 1 | 0 | 0.70 / 10.6 |
| suh.nano.OscillatorL 1.00 | shield-95-up | 97.3% ± 5.2 | 100.0% ± 0.0 | 94.7% ± 10.1 | 105 / 105 | 27.3% ± 2.8 | 1.9% ± 3.9 | 2 | 0 | 0.86 / 13.6 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| apv.test.Virus 0.6.1 | 4990 | 33 | 4990 | 4990 (100.0%) | 0 (0.0%) | 0 (0.0%) | 184 | 38 | 16 |
| cf.mini.Chiva 1.0 | 3093 | 5 | 3093 | 3093 (100.0%) | 0 (0.0%) | 0 (0.0%) | 114 | 68 | 9 |
| cx.Princess 1.0 | 138 | 0 | 138 | 138 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 3 | 0 |
| ej.ChocolateBar 1.1 | 4540 | 4 | 4540 | 4540 (100.0%) | 0 (0.0%) | 0 (0.0%) | 207 | 44 | 15 |
| kcn.unnamed.Unnamed 1.21 | 4413 | 4 | 4395 | 4395 (99.6%) | 18 (0.4%) | 0 (0.0%) | 155 | 38 | 18 |
| mue.Hyperion 0.8 | 3902 | 6 | 3902 | 3902 (100.0%) | 0 (0.0%) | 0 (0.0%) | 110 | 56 | 10 |
| ph.musketeer.Musketeer 0.6 | 5206 | 28 | 5206 | 5205 (100.0%) | 1 (0.0%) | 1 (0.0%) | 235 | 64 | 24 |
| simonton.mega.SniperFrog 1.0.fix2 | 4398 | 8 | 4398 | 4398 (100.0%) | 0 (0.0%) | 0 (0.0%) | 197 | 70 | 16 |
| suh.micro.MirrorPM 1.00 | 2658 | 18 | 2658 | 2658 (100.0%) | 0 (0.0%) | 0 (0.0%) | 7 | 66 | 5 |
| vic.Locke 0.7.5.5 | 4710 | 1 | 4694 | 4689 (99.6%) | 21 (0.4%) | 5 (0.1%) | 236 | 58 | 21 |
| amk.ChumbaMini 0.2 | 2472 | 5 | 2458 | 2458 (99.4%) | 14 (0.6%) | 0 (0.0%) | 56 | 37 | 9 |
| bvh.mini.Fenrir 0.39 | 2584 | 6 | 2583 | 2583 (100.0%) | 1 (0.0%) | 0 (0.0%) | 102 | 40 | 12 |
| cx.micro.Smoke 0.96 | 2955 | 1 | 2945 | 2942 (99.6%) | 13 (0.4%) | 3 (0.1%) | 140 | 39 | 21 |
| dft.Virgin 1.25 | 3081 | 6 | 3064 | 3061 (99.4%) | 20 (0.6%) | 3 (0.1%) | 114 | 37 | 22 |
| jam.micro.RaikoMicro 1.44 | 4313 | 3 | 4289 | 4277 (99.2%) | 36 (0.8%) | 12 (0.3%) | 180 | 27 | 17 |
| kid.Gladiator .7.2 | 5065 | 4 | 7245 | 5063 (100.0%) | 2 (0.0%) | 2182 (30.1%) | 796 | 91 | 41 |
| nat.Hikari dev0001 | 3486 | 6 | 3459 | 3457 (99.2%) | 29 (0.8%) | 2 (0.1%) | 90 | 52 | 6 |
| pez.gloom.GloomyDark 0.9.2 | 4215 | 1 | 4215 | 4215 (100.0%) | 0 (0.0%) | 0 (0.0%) | 181 | 59 | 10 |
| rsim.mini.BulletCatcher 0.4 | 3412 | 14 | 3413 | 3409 (99.9%) | 3 (0.1%) | 4 (0.1%) | 266 | 63 | 12 |
| stelo.MatchupMini 1.1 | 4595 | 6 | 4595 | 4595 (100.0%) | 0 (0.0%) | 0 (0.0%) | 175 | 57 | 10 |
| theo.Tungsten 1.0a | 4045 | 6 | 3975 | 3971 (98.2%) | 74 (1.8%) | 4 (0.1%) | 138 | 47 | 27 |
| wcsv.mega.PowerHouse2 0.2 | 4347 | 126 | 4338 | 4338 (99.8%) | 9 (0.2%) | 0 (0.0%) | 171 | 39 | 16 |
| amk.ChumbaWumba 0.3 | 2766 | 4 | 2741 | 2741 (99.1%) | 25 (0.9%) | 0 (0.0%) | 33 | 41 | 29 |
| casey.Flee 1.0 | 2558 | 9 | 2588 | 2547 (99.6%) | 11 (0.4%) | 41 (1.6%) | 344 | 52 | 11 |
| gh.GrubbmGrb 1.2.4 | 4322 | 11 | 4322 | 4322 (100.0%) | 0 (0.0%) | 0 (0.0%) | 113 | 50 | 17 |
| kawigi.mini.Fhqwhgads 1.1 | 2795 | 16 | 2780 | 2780 (99.5%) | 15 (0.5%) | 0 (0.0%) | 41 | 41 | 13 |
| lucasslf.Dodger 1.0 | 5154 | 23 | 5154 | 5154 (100.0%) | 0 (0.0%) | 0 (0.0%) | 203 | 54 | 17 |
| nkn.mini.Jskr0 0.1 | 3470 | 6 | 3470 | 3470 (100.0%) | 0 (0.0%) | 0 (0.0%) | 69 | 39 | 11 |
| pedersen.Hubris 2.4 | 3111 | 10 | 3085 | 3085 (99.2%) | 26 (0.8%) | 0 (0.0%) | 145 | 46 | 14 |
| reaper.Reaper 1.1 | 5004 | 11 | 4994 | 4991 (99.7%) | 13 (0.3%) | 3 (0.1%) | 231 | 79 | 20 |
| shinh.Entangled 0.3 | 3734 | 11 | 3715 | 3714 (99.5%) | 20 (0.5%) | 1 (0.0%) | 138 | 44 | 25 |
| stelo.SteloTestNano 1.0 | 1954 | 9 | 1927 | 1927 (98.6%) | 27 (1.4%) | 0 (0.0%) | 33 | 29 | 7 |
| timmit.nano.TimCat 0.13 | 2026 | 1 | 2025 | 2025 (100.0%) | 1 (0.0%) | 0 (0.0%) | 47 | 29 | 15 |
| wiki.BasicGFSurfer 1.02 | 3737 | 6 | 3738 | 3737 (100.0%) | 0 (0.0%) | 1 (0.0%) | 94 | 55 | 14 |
| bndl.LostLion 1.2 | 2511 | 9 | 2511 | 2511 (100.0%) | 0 (0.0%) | 0 (0.0%) | 36 | 47 | 8 |
| dz.Caedo 1.4 | 3196 | 7 | 3197 | 3196 (100.0%) | 0 (0.0%) | 1 (0.0%) | 43 | 67 | 7 |
| lrem.quickhack.QuickHack 1.0 | 2718 | 19 | 2718 | 2718 (100.0%) | 0 (0.0%) | 0 (0.0%) | 76 | 51 | 2 |
| mz.Adept 2.65 | 1693 | 9 | 1693 | 1693 (100.0%) | 0 (0.0%) | 0 (0.0%) | 5 | 38 | 5 |
| rsk1.RSK1 4.0 | 3347 | 4 | 3348 | 3347 (100.0%) | 0 (0.0%) | 1 (0.0%) | 115 | 49 | 6 |
| throxbot.ThroxBot 0.1 | 1725 | 9 | 1725 | 1725 (100.0%) | 0 (0.0%) | 0 (0.0%) | 7 | 39 | 4 |
| cli.WasteOfAmmo 1.0 | 658 | 10 | 658 | 658 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 27 | 5 |
| gh.nano.Grofvuil 0.2 | 1321 | 6 | 1325 | 1321 (100.0%) | 0 (0.0%) | 4 (0.3%) | 35 | 41 | 2 |
| logiblocs.SittingDroid 1.0 | 0 | 0 | 0 | - | - | - | 0 | 0 | 2 |
| Noran.RandomTargeting 0.02 | 3518 | 9 | 3518 | 3518 (100.0%) | 0 (0.0%) | 0 (0.0%) | 12 | 55 | 8 |
| sample.Fire | 444 | 4 | 444 | 444 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 18 | 5 |
| suh.nano.OscillatorL 1.00 | 1768 | 7 | 1771 | 1767 (99.9%) | 1 (0.1%) | 4 (0.2%) | 32 | 37 | 5 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| apv.test.Virus 0.6.1 | 5287 | 484 (9.2%) | 4505 |
| cf.mini.Chiva 1.0 | 3593 | 254 (7.1%) | 1469 |
| cx.Princess 1.0 | 189 | 16 (8.5%) | 0 |
| ej.ChocolateBar 1.1 | 5185 | 456 (8.8%) | 4871 |
| kcn.unnamed.Unnamed 1.21 | 5122 | 398 (7.8%) | 3924 |
| mue.Hyperion 0.8 | 4021 | 386 (9.6%) | 3787 |
| ph.musketeer.Musketeer 0.6 | 5576 | 459 (8.2%) | 4458 |
| simonton.mega.SniperFrog 1.0.fix2 | 4653 | 460 (9.9%) | 4324 |
| suh.micro.MirrorPM 1.00 | 1200 | 81 (6.8%) | 113 |
| vic.Locke 0.7.5.5 | 5447 | 395 (7.3%) | 4352 |
| amk.ChumbaMini 0.2 | 2868 | 222 (7.7%) | 1326 |
| bvh.mini.Fenrir 0.39 | 2912 | 136 (4.7%) | 340 |
| cx.micro.Smoke 0.96 | 3827 | 292 (7.6%) | 2538 |
| dft.Virgin 1.25 | 4020 | 265 (6.6%) | 2156 |
| jam.micro.RaikoMicro 1.44 | 5202 | 398 (7.7%) | 4817 |
| kid.Gladiator .7.2 | 9127 | 448 (4.9%) | 8404 |
| nat.Hikari dev0001 | 3509 | 371 (10.6%) | 3244 |
| pez.gloom.GloomyDark 0.9.2 | 5234 | 350 (6.7%) | 3011 |
| rsim.mini.BulletCatcher 0.4 | 3317 | 261 (7.9%) | 3278 |
| stelo.MatchupMini 1.1 | 4903 | 418 (8.5%) | 3274 |
| theo.Tungsten 1.0a | 4866 | 354 (7.3%) | 3383 |
| wcsv.mega.PowerHouse2 0.2 | 4797 | 363 (7.6%) | 2774 |
| amk.ChumbaWumba 0.3 | 3335 | 212 (6.4%) | 1291 |
| casey.Flee 1.0 | 2889 | 167 (5.8%) | 1417 |
| gh.GrubbmGrb 1.2.4 | 4295 | 442 (10.3%) | 4133 |
| kawigi.mini.Fhqwhgads 1.1 | 3147 | 294 (9.3%) | 2121 |
| lucasslf.Dodger 1.0 | 5132 | 508 (9.9%) | 4412 |
| nkn.mini.Jskr0 0.1 | 3556 | 310 (8.7%) | 2297 |
| pedersen.Hubris 2.4 | 3359 | 254 (7.6%) | 1686 |
| reaper.Reaper 1.1 | 5003 | 388 (7.8%) | 4345 |
| shinh.Entangled 0.3 | 4243 | 284 (6.7%) | 961 |
| stelo.SteloTestNano 1.0 | 2112 | 158 (7.5%) | 895 |
| timmit.nano.TimCat 0.13 | 2472 | 94 (3.8%) | 0 |
| wiki.BasicGFSurfer 1.02 | 3833 | 351 (9.2%) | 3072 |
| bndl.LostLion 1.2 | 2324 | 112 (4.8%) | 639 |
| dz.Caedo 1.4 | 3235 | 226 (7.0%) | 1379 |
| lrem.quickhack.QuickHack 1.0 | 2600 | 262 (10.1%) | 1925 |
| mz.Adept 2.65 | 1750 | 158 (9.0%) | 695 |
| rsk1.RSK1 4.0 | 3738 | 251 (6.7%) | 1597 |
| throxbot.ThroxBot 0.1 | 1629 | 103 (6.3%) | 331 |
| cli.WasteOfAmmo 1.0 | 880 | 0 (0.0%) | 0 |
| gh.nano.Grofvuil 0.2 | 1233 | 120 (9.7%) | 706 |
| logiblocs.SittingDroid 1.0 | 1586 | 0 (0.0%) | 0 |
| Noran.RandomTargeting 0.02 | 3136 | 271 (8.6%) | 1392 |
| sample.Fire | 1678 | 37 (2.2%) | 0 |
| suh.nano.OscillatorL 1.00 | 1681 | 102 (6.1%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| apv.test.Virus 0.6.1 | 650 | 507 | 650 | 678 | 31.6 / 31.7 | 25 | 923 | 710 |
| cf.mini.Chiva 1.0 | 650 | 479 | 400 | 496 | 50.5 / 22.9 | 780 | 1914 | 38 |
| cx.Princess 1.0 | 650 | 413 | 650 | 27 | 2.9 / 0.8 | 0 | 210 | 0 |
| ej.ChocolateBar 1.1 | 650 | 492 | 650 | 664 | 34.5 / 27.3 | 131 | 747 | 0 |
| kcn.unnamed.Unnamed 1.21 | 650 | 549 | 650 | 662 | 33.2 / 21.8 | 70 | 1544 | 0 |
| mue.Hyperion 0.8 | 650 | 375 | 650 | 552 | 46.3 / 32.1 | 513 | 1526 | 0 |
| ph.musketeer.Musketeer 0.6 | 650 | 495 | 567 | 703 | 34.8 / 31.7 | 78 | 458 | 544 |
| simonton.mega.SniperFrog 1.0.fix2 | 650 | 475 | 567 | 613 | 43.3 / 28.2 | 470 | 1455 | 952 |
| suh.micro.MirrorPM 1.00 | 650 | 503 | 483 | 380 | 65.2 / 34.5 | 866 | 446 | 33 |
| vic.Locke 0.7.5.5 | 650 | 499 | 650 | 704 | 32.1 / 34.5 | 55 | 705 | 0 |
| amk.ChumbaMini 0.2 | 650 | 451 | 467 | 406 | 42.3 / 23.5 | 642 | 1673 | 1263 |
| bvh.mini.Fenrir 0.39 | 650 | 426 | 408 | 421 | 55.9 / 25.9 | 1321 | 1530 | 3 |
| cx.micro.Smoke 0.96 | 650 | 497 | 650 | 512 | 32.5 / 28.5 | 167 | 1731 | 121 |
| dft.Virgin 1.25 | 650 | 512 | 617 | 537 | 33.7 / 23.9 | 143 | 2213 | 0 |
| jam.micro.RaikoMicro 1.44 | 650 | 506 | 650 | 668 | 32.9 / 27.8 | 7 | 971 | 2 |
| kid.Gladiator .7.2 | 650 | 454 | 400 | 1110 | 51.5 / 20.8 | 791 | 57 | 46 |
| nat.Hikari dev0001 | 650 | 410 | 433 | 498 | 49.1 / 20.7 | 819 | 1412 | 975 |
| pez.gloom.GloomyDark 0.9.2 | 650 | 536 | 650 | 675 | 37.5 / 23.3 | 60 | 978 | 0 |
| rsim.mini.BulletCatcher 0.4 | 650 | 393 | 483 | 461 | 61.8 / 17.5 | 749 | 1825 | 336 |
| stelo.MatchupMini 1.1 | 650 | 495 | 650 | 640 | 35.2 / 32.1 | 215 | 830 | 1451 |
| theo.Tungsten 1.0a | 650 | 515 | 592 | 637 | 34.6 / 23.9 | 21 | 1338 | 15 |
| wcsv.mega.PowerHouse2 0.2 | 650 | 466 | 567 | 623 | 38.1 / 29.9 | 208 | 1165 | 1549 |
| amk.ChumbaWumba 0.3 | 650 | 516 | 567 | 457 | 31.3 / 16.8 | 78 | 2765 | 2024 |
| casey.Flee 1.0 | 650 | 471 | 400 | 407 | 38.2 / 12.1 | 357 | 2655 | 1258 |
| gh.GrubbmGrb 1.2.4 | 650 | 476 | 483 | 577 | 48.6 / 17.8 | 533 | 2080 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 650 | 419 | 492 | 439 | 39.6 / 21.0 | 319 | 3232 | 77 |
| lucasslf.Dodger 1.0 | 650 | 451 | 625 | 672 | 44.2 / 22.1 | 273 | 1801 | 453 |
| nkn.mini.Jskr0 0.1 | 650 | 449 | 483 | 493 | 44.0 / 17.0 | 402 | 1817 | 1127 |
| pedersen.Hubris 2.4 | 650 | 405 | 567 | 476 | 55.0 / 21.9 | 1167 | 1736 | 26 |
| reaper.Reaper 1.1 | 650 | 428 | 508 | 665 | 57.6 / 19.1 | 904 | 1736 | 148 |
| shinh.Entangled 0.3 | 650 | 556 | 617 | 582 | 63.9 / 16.2 | 1072 | 1331 | 40 |
| stelo.SteloTestNano 1.0 | 650 | 413 | 400 | 326 | 53.8 / 17.0 | 1276 | 1836 | 773 |
| timmit.nano.TimCat 0.13 | 650 | 399 | 400 | 358 | 42.1 / 2.9 | 514 | 2422 | 19 |
| wiki.BasicGFSurfer 1.02 | 650 | 410 | 483 | 531 | 44.9 / 22.5 | 518 | 1482 | 1253 |
| bndl.LostLion 1.2 | 650 | 489 | 400 | 358 | 65.9 / 10.1 | 1487 | 1756 | 19 |
| dz.Caedo 1.4 | 650 | 320 | 650 | 485 | 74.8 / 19.6 | 1775 | 1179 | 38 |
| lrem.quickhack.QuickHack 1.0 | 650 | 374 | 458 | 385 | 69.2 / 16.3 | 1348 | 1929 | 218 |
| mz.Adept 2.65 | 650 | 291 | 400 | 283 | 58.9 / 13.4 | 1244 | 1563 | 320 |
| rsk1.RSK1 4.0 | 650 | 474 | 483 | 523 | 56.8 / 12.7 | 802 | 1836 | 988 |
| throxbot.ThroxBot 0.1 | 650 | 411 | 400 | 264 | 72.1 / 8.0 | 1223 | 1466 | 320 |
| cli.WasteOfAmmo 1.0 | 650 | 402 | 400 | 152 | 81.3 / 0.0 | 619 | 676 | 173 |
| gh.nano.Grofvuil 0.2 | 650 | 344 | 400 | 206 | 75.7 / 1.8 | 868 | 1005 | 0 |
| logiblocs.SittingDroid 1.0 | 650 | 489 | 650 | 233 | 120.0 / 0.0 | 0 | 0 | 0 |
| Noran.RandomTargeting 0.02 | 650 | 534 | 400 | 472 | 81.9 / 0.6 | 1744 | 1264 | 152 |
| sample.Fire | 650 | 415 | 400 | 267 | 95.7 / 0.0 | 1136 | 136 | 45 |
| suh.nano.OscillatorL 1.00 | 650 | 296 | 400 | 271 | 66.6 / 3.9 | 1246 | 1508 | 448 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| apv.test.Virus 0.6.1 | 7.2% | 11 | 79 | 3 | 47.3 | 480 / 484 (99%) | 0 | 0 |
| cf.mini.Chiva 1.0 | 6.8% | 6 | 65 | 3 | 29.5 | 254 / 254 (100%) | 0 | 0 |
| cx.Princess 1.0 | 0.3% | 0 | 12 | 1 | 1.3 | 16 / 16 (100%) | 0 | 0 |
| ej.ChocolateBar 1.1 | 6.2% | 12 | 36 | 3 | 43.1 | 456 / 456 (100%) | 0 | 0 |
| kcn.unnamed.Unnamed 1.21 | 5.1% | 16 | 57 | 3 | 41.9 | 397 / 398 (100%) | 0 | 0 |
| mue.Hyperion 0.8 | 9.0% | 8 | 51 | 3 | 37.0 | 386 / 386 (100%) | 0 | 0 |
| ph.musketeer.Musketeer 0.6 | 7.2% | 12 | 64 | 2 | 49.5 | 458 / 459 (100%) | 0 | 0 |
| simonton.mega.SniperFrog 1.0.fix2 | 7.4% | 11 | 50 | 2 | 41.8 | 460 / 460 (100%) | 0 | 0 |
| suh.micro.MirrorPM 1.00 | 12.9% | 3 | 39 | 2 | 12.7 | 81 / 81 (100%) | 0 | 0 |
| vic.Locke 0.7.5.5 | 7.5% | 20 | 103 | 3 | 44.7 | 393 / 395 (99%) | 0 | 0 |
| amk.ChumbaMini 0.2 | 6.1% | 12 | 79 | 3 | 23.4 | 222 / 222 (100%) | 0 | 0 |
| bvh.mini.Fenrir 0.39 | 8.0% | 11 | 62 | 3 | 24.6 | 136 / 136 (100%) | 0 | 0 |
| cx.micro.Smoke 0.96 | 5.9% | 27 | 52 | 3 | 27.6 | 292 / 292 (100%) | 0 | 0 |
| dft.Virgin 1.25 | 5.4% | 27 | 89 | 3 | 28.9 | 263 / 265 (99%) | 0 | 0 |
| jam.micro.RaikoMicro 1.44 | 6.4% | 14 | 71 | 3 | 40.8 | 396 / 398 (99%) | 0 | 0 |
| kid.Gladiator .7.2 | 7.0% | 15 | 102 | 3 | 69.0 | 448 / 448 (100%) | 0 | 0 |
| nat.Hikari dev0001 | 6.4% | 9 | 80 | 3 | 32.9 | 368 / 371 (99%) | 0 | 0 |
| pez.gloom.GloomyDark 0.9.2 | 5.4% | 9 | 37 | 3 | 40.1 | 350 / 350 (100%) | 0 | 0 |
| rsim.mini.BulletCatcher 0.4 | 7.0% | 10 | 53 | 2 | 32.3 | 261 / 261 (100%) | 0 | 0 |
| stelo.MatchupMini 1.1 | 7.7% | 10 | 150 | 2 | 43.5 | 418 / 418 (100%) | 0 | 0 |
| theo.Tungsten 1.0a | 7.8% | 26 | 108 | 3 | 37.7 | 352 / 354 (99%) | 0 | 0 |
| wcsv.mega.PowerHouse2 0.2 | 7.2% | 14 | 81 | 3 | 41.2 | 363 / 363 (100%) | 0 | 0 |
| amk.ChumbaWumba 0.3 | 3.9% | 26 | 75 | 3 | 26.1 | 210 / 212 (99%) | 0 | 0 |
| casey.Flee 1.0 | 3.9% | 9 | 1517 | 3 | 24.6 | 167 / 167 (100%) | 0 | 0 |
| gh.GrubbmGrb 1.2.4 | 6.1% | 15 | 54 | 2 | 41.2 | 442 / 442 (100%) | 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 6.6% | 14 | 78 | 3 | 26.5 | 292 / 294 (99%) | 0 | 0 |
| lucasslf.Dodger 1.0 | 6.4% | 14 | 73 | 2 | 49.0 | 503 / 508 (99%) | 0 | 0 |
| nkn.mini.Jskr0 0.1 | 5.0% | 11 | 31 | 3 | 33.0 | 310 / 310 (100%) | 0 | 0 |
| pedersen.Hubris 2.4 | 7.5% | 12 | 64 | 3 | 29.3 | 253 / 254 (100%) | 0 | 0 |
| reaper.Reaper 1.1 | 7.2% | 27 | 120 | 3 | 47.6 | 387 / 388 (100%) | 0 | 0 |
| shinh.Entangled 0.3 | 7.3% | 38 | 66 | 3 | 35.4 | 282 / 284 (99%) | 0 | 0 |
| stelo.SteloTestNano 1.0 | 5.6% | 12 | 56 | 3 | 18.4 | 157 / 158 (99%) | 0 | 0 |
| timmit.nano.TimCat 0.13 | 0.8% | 17 | 42 | 3 | 19.3 | 94 / 94 (100%) | 0 | 0 |
| wiki.BasicGFSurfer 1.02 | 6.5% | 9 | 51 | 2 | 35.5 | 351 / 351 (100%) | 0 | 0 |
| bndl.LostLion 1.2 | 5.0% | 7 | 64 | 2 | 23.9 | 112 / 112 (100%) | 0 | 0 |
| dz.Caedo 1.4 | 12.6% | 6 | 58 | 2 | 30.4 | 226 / 226 (100%) | 0 | 0 |
| lrem.quickhack.QuickHack 1.0 | 8.3% | 1 | 50 | 2 | 25.9 | 262 / 262 (100%) | 0 | 0 |
| mz.Adept 2.65 | 4.8% | 3 | 37 | 2 | 16.1 | 158 / 158 (100%) | 0 | 0 |
| rsk1.RSK1 4.0 | 5.1% | 4 | 49 | 2 | 31.9 | 249 / 251 (99%) | 0 | 0 |
| throxbot.ThroxBot 0.1 | 4.6% | 6 | 29 | 2 | 16.4 | 103 / 103 (100%) | 0 | 0 |
| cli.WasteOfAmmo 1.0 | 0.0% | 4 | 17 | 2 | 6.3 | - | 0 | 0 |
| gh.nano.Grofvuil 0.2 | 1.0% | 1 | 28 | 2 | 12.6 | 120 / 120 (100%) | 0 | 0 |
| logiblocs.SittingDroid 1.0 | 0.0% | 1 | 11 | 1 | 0.0 | - | 0 | 0 |
| Noran.RandomTargeting 0.02 | 0.8% | 5 | 41 | 3 | 33.5 | 271 / 271 (100%) | 0 | 0 |
| sample.Fire | 0.0% | 1 | 19 | 2 | 4.2 | 37 / 37 (100%) | 0 | 0 |
| suh.nano.OscillatorL 1.00 | 1.9% | 2 | 30 | 2 | 16.9 | 101 / 102 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| apv.test.Virus 0.6.1 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| cf.mini.Chiva 1.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| cx.Princess 1.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| ej.ChocolateBar 1.1 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| kcn.unnamed.Unnamed 1.21 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| mue.Hyperion 0.8 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| ph.musketeer.Musketeer 0.6 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| simonton.mega.SniperFrog 1.0.fix2 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| suh.micro.MirrorPM 1.00 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| vic.Locke 0.7.5.5 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| amk.ChumbaMini 0.2 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| bvh.mini.Fenrir 0.39 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| cx.micro.Smoke 0.96 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| dft.Virgin 1.25 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| jam.micro.RaikoMicro 1.44 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| kid.Gladiator .7.2 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| nat.Hikari dev0001 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| pez.gloom.GloomyDark 0.9.2 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| rsim.mini.BulletCatcher 0.4 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| stelo.MatchupMini 1.1 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| theo.Tungsten 1.0a | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| wcsv.mega.PowerHouse2 0.2 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| amk.ChumbaWumba 0.3 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| casey.Flee 1.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| gh.GrubbmGrb 1.2.4 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| lucasslf.Dodger 1.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| nkn.mini.Jskr0 0.1 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| pedersen.Hubris 2.4 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| reaper.Reaper 1.1 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| shinh.Entangled 0.3 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| stelo.SteloTestNano 1.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| timmit.nano.TimCat 0.13 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| wiki.BasicGFSurfer 1.02 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| bndl.LostLion 1.2 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| dz.Caedo 1.4 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| lrem.quickhack.QuickHack 1.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| mz.Adept 2.65 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| rsk1.RSK1 4.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| throxbot.ThroxBot 0.1 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| cli.WasteOfAmmo 1.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| gh.nano.Grofvuil 0.2 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| logiblocs.SittingDroid 1.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| Noran.RandomTargeting 0.02 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| sample.Fire | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| suh.nano.OscillatorL 1.00 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
