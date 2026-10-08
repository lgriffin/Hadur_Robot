# Shield-all sweep, confirmation of the 65 candidates (issue #146)

2026-10-08, same host and conditions as the sweep ([report](2026-10-08_shield-sweep.md)): 3.9sa (shield mode always on) against 3.9, 35 rounds, Robocode 1.11.1, CPU constant 1488498, parallel 12, child heap 2G. The 65 bots the sweep screened in (interval above 0, or open with a mean gain of 9 or more) were fought again at 16 seeds each, 1,040 pairs. Plan `hadur-bench/plans/shield-confirm.queue`, set `hadur-bench/shield-confirm.txt`. Raw rows `data/bench/2026-10-08_hadur-shield-confirm-v39-local_cold.tsv` (and `_rounds`); generated report [here](2026-10-08_shield-confirm-v39.md). No change to `hadur-core` or `hadur-robot`.

## Result

The candidates hold. Pooled 3.9sa minus 3.9 on these 65 bots is **+10.94** [+9.37, +12.51] (opponent-clustered 95%), against +10.77 on the same bots in the sweep. There is no regression to the mean to see. Gate CAUTION (75 of 1,040 pairs untrusted, 7%, up to 1 other Robocode JVM).

| | Count (of 65) |
|---|---:|
| Difference positive | 65 |
| Interval above 0 (confirmed) | 60 |
| Holm-significant | 57 |
| Interval spans 0, gain under 9 | 5 |
| Interval below 0 | 0 |

By subset: the 23 bots that were Holm-significant in the sweep read +15.5 there and +15.1 now, all 23 confirmed. The other 42 read +8.2 in the sweep and +8.7 now, 37 confirmed.

The sweep used engine seeds 1 to 8 and this run seeds 1 to 16, so half the battles reuse a seed. The seed explains none of the variance (charter, principle 1; the same jar, opponent and seed differs by 3 to 5 points between sessions), and the new seeds agree with the old: pooled +10.5 on seeds 1 to 8 (64 of 65 positive) and +11.3 on seeds 9 to 16 (65 of 65 positive).

## The five that do not clear the rule

Positive but with an interval spanning 0 and a gain under 9, so they would not be admitted on this run alone:  `gh.GrubbmGrb 1.2.4` (+3.2 +/- 5.0, sweep +7.4);  `stelo.Randomness 1.1` (+2.4 +/- 2.7, sweep +6.1);  `apv.NanoLauLectrikTheCannibal 1.1` (+2.1 +/- 2.2, sweep +4.4);  `nat.nano.OcnirpPM 1.0` (+1.4 +/- 4.4, sweep +5.8);  `lrem.magic.TormentedAngel Antiquitie` (+1.2 +/- 2.4, sweep +4.8). None is significantly down. They are the first to remove if the list needs trimming.

## Against the list on master

All 65 are already on `ShieldListData` as merged in PR #150 (the 3.10 list has 97 entries: the 14 earlier ones plus 83). The other 18 of those 83 did not come from this screen and are not covered here. Nothing needs adding from this run; the pre-release gate for the full list is `candidate-310`.

## Caveats

- Same opponents and mostly the same jars, so this confirms the screen was not luck, not that the effect holds off the DrussGT list (the Nullstride work found 3.9sa -1.24 off it).
- 3.9sa is shield mode always on, with SHIELD-6 as in 3.9. 3.10's real list is exact-version entries, so the number here is the effect of shield mode on these bots, not a forecast of the release's APS.

## Per-bot results

| Opponent | Sweep (8 seeds) | Confirm (16 seeds) | Confirm 95% half-width |
|---|---:|---:|---:|
| simonton.beta.LifelongObsession 0.5.1 | +30.8 | +32.0 | 2.8 |
| simonton.mini.WeeksOnEnd 1.10.4 | +29.6 | +26.3 | 3.1 |
| pez.clean.Swiffer 0.2.9 | +18.7 | +24.8 | 9.9 |
| rdt.AgentSmith.AgentSmith 0.5 | +21.6 | +21.4 | 3.3 |
| jam.mini.Raiko 0.43 | +21.1 | +20.8 | 2.5 |
| tide.pear.Pear 0.62.1 | +20.8 | +20.4 | 2.5 |
| jekl.DarkHallow .90.9 | +12.6 | +18.4 | 5.8 |
| DM.mega.Bezier 1.618fprrr | +19.0 | +17.8 | 5.2 |
| trm.Wrekt 1.1.6.f | +12.0 | +17.4 | 5.7 |
| wilson.Chameleon 0.91 | +16.7 | +17.3 | 3.1 |
| jekl.mini.BlackPearl .91 | +19.1 | +17.0 | 3.2 |
| ph.mini.Archer 0.6.6 | +16.7 | +16.0 | 5.3 |
| bvh.mini.Freya 0.55 | +12.8 | +15.8 | 1.6 |
| pkbots.BoyTDSurfer 1.0 | +12.3 | +15.8 | 3.4 |
| lucasslf.HariSeldon 0.2.1 | +15.4 | +15.5 | 2.6 |
| lucasslf.Wiggins 0.6 | +14.2 | +14.9 | 4.2 |
| rz.Aleph 0.34 | +11.2 | +14.6 | 5.0 |
| wcsv.Engineer.Engineer 0.5.4 | +14.3 | +14.6 | 3.8 |
| zen.Lindada 0.2 | +12.9 | +14.1 | 2.2 |
| AIR.iRobot 1.0 | +13.8 | +13.6 | 2.3 |
| metal.small.dna2.MCoolDNA 1.5 | +8.7 | +13.5 | 3.0 |
| kc.micro.Thorn 1.252 | +17.9 | +13.5 | 4.7 |
| wiki.mini.BlackDestroyer 0.9.0 | +14.8 | +12.9 | 3.0 |
| theo.Tungsten 1.0a | +12.2 | +12.6 | 3.6 |
| vuen.Fractal 0.55 | +12.9 | +12.4 | 2.1 |
| stefw.Tigger 0.0.23 | +17.0 | +12.1 | 3.5 |
| simonton.micro.GFMicro 1.0 | +11.3 | +11.2 | 2.3 |
| Krabb.krabby.Krabby 1.18b | +13.6 | +11.2 | 2.6 |
| pez.mako.Mako 1.5 | +11.5 | +11.0 | 4.2 |
| jekl.Jekyl .70 | +9.1 | +10.5 | 2.2 |
| bvh.frg.Friga 0.112dev | +9.9 | +10.4 | 1.3 |
| tw.Exterminator 1.0 | +7.2 | +10.3 | 4.0 |
| arthord.KostyaTszyu Beta2 | +6.2 | +10.1 | 2.5 |
| syl.Centipede 0.5 | +10.6 | +10.1 | 1.8 |
| spinnercat.CopyKat 1.2.3 | +7.7 | +10.0 | 2.9 |
| ahf.r2d2.R2d2 0.86 | +8.9 | +9.4 | 2.2 |
| davidalves.net.DuelistMicroMkII 1.1 | +6.6 | +8.8 | 3.4 |
| mnt.AHEB 0.6a | +8.2 | +8.3 | 3.3 |
| robar.micro.Kirbyi 1.0 | +7.1 | +8.3 | 2.5 |
| myl.micro.NekoNinja 1.30 | +6.3 | +8.2 | 1.9 |
| rcb.Vanessa03 0 | +7.2 | +7.9 | 4.0 |
| amk.ChumbaWumba 0.3 | +8.4 | +7.9 | 4.1 |
| pe.mini.SandboxMini 1.2 | +5.6 | +7.8 | 3.3 |
| kawigi.mini.Coriantumr 1.1 | +6.5 | +7.7 | 1.7 |
| ad.Quest 0.10 | +9.1 | +7.2 | 4.0 |
| davidalves.net.DuelistMini 1.1 | +8.5 | +7.2 | 4.0 |
| stelo.SteloTestNano 1.0 | +4.5 | +6.7 | 2.4 |
| jcs.Decepticon 2.5.3 | +6.7 | +6.6 | 3.0 |
| suh.nano.RandomPM 1.02 | +5.0 | +6.3 | 2.2 |
| nat.Hikari dev0001 | +5.4 | +6.0 | 2.3 |
| casey.Flee 1.0 | +6.5 | +5.9 | 2.5 |
| tzu.TheArtOfWar 1.2 | +5.8 | +5.7 | 3.0 |
| ins.MobyNano 0.8 | +4.0 | +5.2 | 2.1 |
| metal.small.MCool 1.21 | +5.3 | +5.1 | 1.6 |
| nat.nano.Ocnirp 1.73 | +7.0 | +5.0 | 3.2 |
| ags.micro.Carpet 1.1 | +4.8 | +5.0 | 3.4 |
| florent.small.LittleAngel 1.8 | +9.3 | +4.4 | 4.1 |
| simonton.nano.WeekendObsession_S 1.7 | +4.2 | +3.6 | 3.2 |
| starpkg.StarViewerZ 1.26 | +2.5 | +3.6 | 1.3 |
| gh.GrubbmGrb 1.2.4 | +7.4 | +3.2 | 5.0 |
| ds.OoV4 0.3b | +2.2 | +2.6 | 1.3 |
| stelo.Randomness 1.1 | +6.1 | +2.4 | 2.7 |
| apv.NanoLauLectrikTheCannibal 1.1 | +4.4 | +2.1 | 2.2 |
| nat.nano.OcnirpPM 1.0 | +5.8 | +1.4 | 4.4 |
| lrem.magic.TormentedAngel Antiquitie | +4.8 | +1.2 | 2.4 |
