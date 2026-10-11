# D5 gate: the shield list

The D5 build (`hadur2.Hadur 3.8`, shield mode and `hadur2.ShieldListData`) probed with
BENCH-11 (`--shield-probe`) over `hadur-bench/shield-panel.txt`: 46 opponents, 3 seeds of 35
rounds each, cold. The probe repacks the candidate jar twice, with every panel robot on the
list ("on") and with an empty list ("off"), and fights both at the same `RANDOMSEED` per seed, so
the paired difference is the effect of shield mode alone. Run on 6 October 2026 in the Claude
Code container (4 cores, Java 21). The full report is [d5-probe.md](d5-probe.md).

**Verdict: the gate passes, as a list and not as a switch.** Shield mode on every panel robot is
worth **+2.9 ± 2.7** points (weighted mean paired difference, BENCH-1 weights), stratified APS
**86.8 ± 2.4 on against 83.9 ± 3.0 off**. The gain is not uniform, so the list names only the
robots where it pays.

## The list

- **The 8 the probe marked "wins"** (paired interval above 0): apv.test.Virus 0.6.1,
  kcn.unnamed.Unnamed 1.21, simonton.mega.SniperFrog 1.0.fix2, vic.Locke 0.7.5.5,
  cx.micro.Smoke 0.96, dft.Virgin 1.25, kid.Gladiator .7.2, nkn.mini.Jskr0 0.1.
- **Plus 6 "open" ones with a mean gain of +9 points or more**: ej.ChocolateBar 1.1,
  jam.micro.RaikoMicro 1.44, ph.musketeer.Musketeer 0.6, suh.micro.MirrorPM 1.00,
  pez.gloom.GloomyDark 0.9.2, reaper.Reaper 1.1. APS is the objective, so a positive expected
  value counts even where 3 seeds leave the interval spanning 0.
- **Left off, the ones it loses against** (interval below 0): pedersen.Hubris 2.4 (-9.0),
  timmit.nano.TimCat 0.13 (-12.6), rsk1.RSK1 4.0 (-4.0), throxbot.ThroxBot 0.1 (-9.9),
  gh.nano.Grofvuil 0.2 (-4.3), sample.Fire (-0.8), suh.nano.OscillatorL 1.00 (-13.8).
  Every other "open" robot is left off too: its mean gain is under +9 or negative.

SHIELD-6 bounds what a wrong name costs: once the enemy's bullet damage would hold our score share
below 85%, shield mode is off for the rest of the battle. The list ships as the class
`hadur2.ShieldListData`.

## Every panel robot

Score share on (shield mode) and off, in percent, and the paired difference in points with its
95% interval.

| Opponent | Shield on | Shield off | Paired diff (pp) | Verdict | On the list |
|---|---|---|---|---|---|
| apv.test.Virus 0.6.1 | 88.2% ± 4.1 | 64.9% ± 11.5 | +23.3 ± 15.4 | wins | listed |
| cf.mini.Chiva 1.0 | 86.8% ± 2.4 | 81.7% ± 5.7 | +5.1 ± 8.1 | open | |
| cx.Princess 1.0 | 97.3% ± 6.5 | 98.8% ± 1.5 | -1.5 ± 7.9 | open | |
| ej.ChocolateBar 1.1 | 91.8% ± 11.4 | 72.6% ± 13.8 | +19.1 ± 22.8 | open | listed |
| kcn.unnamed.Unnamed 1.21 | 95.6% ± 3.4 | 79.3% ± 5.9 | +16.2 ± 9.3 | wins | listed |
| mue.Hyperion 0.8 | 69.7% ± 10.8 | 68.8% ± 2.6 | +0.8 ± 13.2 | open | |
| ph.musketeer.Musketeer 0.6 | 79.0% ± 13.6 | 67.4% ± 8.7 | +11.6 ± 16.3 | open | listed |
| simonton.mega.SniperFrog 1.0.fix2 | 93.7% ± 6.7 | 71.8% ± 14.5 | +22.0 ± 19.5 | wins | listed |
| suh.micro.MirrorPM 1.00 | 95.1% ± 5.2 | 70.1% ± 85.5 | +25.1 ± 84.9 | open | listed |
| vic.Locke 0.7.5.5 | 87.6% ± 15.8 | 62.5% ± 11.8 | +25.0 ± 5.6 | wins | listed |
| amk.ChumbaMini 0.2 | 77.8% ± 4.9 | 80.0% ± 8.1 | -2.2 ± 12.0 | open | |
| bvh.mini.Fenrir 0.39 | 77.8% ± 5.4 | 78.1% ± 8.2 | -0.3 ± 13.6 | open | |
| cx.micro.Smoke 0.96 | 84.0% ± 10.1 | 70.4% ± 14.4 | +13.6 ± 9.4 | wins | listed |
| dft.Virgin 1.25 | 95.4% ± 5.3 | 76.0% ± 13.6 | +19.4 ± 18.9 | wins | listed |
| jam.micro.RaikoMicro 1.44 | 90.6% ± 4.1 | 72.5% ± 16.8 | +18.1 ± 20.8 | open | listed |
| kid.Gladiator .7.2 | 93.8% ± 8.5 | 82.4% ± 3.1 | +11.3 ± 10.0 | wins | listed |
| nat.Hikari dev0001 | 86.7% ± 8.8 | 83.8% ± 3.0 | +2.9 ± 8.2 | open | |
| pez.gloom.GloomyDark 0.9.2 | 85.8% ± 4.7 | 76.2% ± 13.5 | +9.7 ± 17.2 | open | listed |
| rsim.mini.BulletCatcher 0.4 | 83.9% ± 6.5 | 85.7% ± 5.8 | -1.8 ± 12.1 | open | |
| stelo.MatchupMini 1.1 | 66.4% ± 10.7 | 66.8% ± 6.8 | -0.4 ± 16.7 | open | |
| theo.Tungsten 1.0a | 81.5% ± 15.6 | 74.2% ± 5.8 | +7.3 ± 17.0 | open | |
| wcsv.mega.PowerHouse2 0.2 | 77.8% ± 13.7 | 71.7% ± 7.2 | +6.2 ± 14.5 | open | |
| amk.ChumbaWumba 0.3 | 88.6% ± 18.4 | 85.3% ± 3.2 | +3.4 ± 21.3 | open | |
| casey.Flee 1.0 | 84.0% ± 15.6 | 89.8% ± 5.7 | -5.7 ± 11.5 | open | |
| gh.GrubbmGrb 1.2.4 | 86.3% ± 25.1 | 83.5% ± 11.2 | +2.7 ± 17.9 | open | |
| kawigi.mini.Fhqwhgads 1.1 | 82.4% ± 14.2 | 80.0% ± 15.0 | +2.4 ± 8.3 | open | |
| lucasslf.Dodger 1.0 | 83.1% ± 7.7 | 81.2% ± 5.2 | +1.9 ± 12.2 | open | |
| nkn.mini.Jskr0 0.1 | 93.5% ± 8.1 | 85.4% ± 1.3 | +8.1 ± 7.7 | wins | listed |
| pedersen.Hubris 2.4 | 74.4% ± 4.8 | 83.4% ± 5.2 | -9.0 ± 7.7 | loses | |
| reaper.Reaper 1.1 | 95.9% ± 10.1 | 86.6% ± 2.5 | +9.2 ± 11.7 | open | listed |
| shinh.Entangled 0.3 | 86.9% ± 2.1 | 87.6% ± 1.9 | -0.7 ± 3.6 | open | |
| stelo.SteloTestNano 1.0 | 88.9% ± 6.4 | 87.6% ± 6.3 | +1.3 ± 12.2 | open | |
| timmit.nano.TimCat 0.13 | 84.3% ± 0.6 | 96.9% ± 3.1 | -12.6 ± 2.7 | loses | |
| wiki.BasicGFSurfer 1.02 | 73.9% ± 6.1 | 79.6% ± 6.4 | -5.7 ± 12.5 | open | |
| bndl.LostLion 1.2 | 90.6% ± 8.8 | 92.9% ± 4.5 | -2.3 ± 8.8 | open | |
| dz.Caedo 1.4 | 80.5% ± 15.2 | 83.5% ± 9.3 | -3.0 ± 5.9 | open | |
| lrem.quickhack.QuickHack 1.0 | 89.4% ± 3.9 | 88.1% ± 12.4 | +1.3 ± 15.1 | open | |
| mz.Adept 2.65 | 83.9% ± 3.5 | 90.2% ± 4.0 | -6.3 ± 6.9 | open | |
| rsk1.RSK1 4.0 | 85.2% ± 14.0 | 89.2% ± 10.6 | -4.0 ± 3.5 | loses | |
| throxbot.ThroxBot 0.1 | 85.0% ± 2.2 | 94.8% ± 2.9 | -9.9 ± 5.0 | loses | |
| cli.WasteOfAmmo 1.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | open | |
| gh.nano.Grofvuil 0.2 | 94.5% ± 3.1 | 98.8% ± 1.0 | -4.3 ± 2.5 | loses | |
| logiblocs.SittingDroid 1.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | open | |
| Noran.RandomTargeting 0.02 | 99.3% ± 1.3 | 99.6% ± 0.4 | -0.3 ± 1.6 | open | |
| sample.Fire | 99.2% ± 0.2 | 100.0% ± 0.0 | -0.8 ± 0.2 | loses | |
| suh.nano.OscillatorL 1.00 | 83.5% ± 1.8 | 97.3% ± 5.2 | -13.8 ± 5.3 | loses | |

## Not built

D6 (predicting DrussGT's dodge) stays a research item: it is not part of this gate and no code for
it exists. The list is the only change D5 makes to play, and the probe's seeds are the evidence for
it; a list entry that a later run shows losing comes off by deleting its line.
