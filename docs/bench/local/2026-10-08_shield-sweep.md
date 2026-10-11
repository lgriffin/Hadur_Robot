# Shield-all sweep of the DrussGT list bots, ranks 51 to 700 (issue #146)

2026-10-08. Local bench host (Threadripper, 48 logical cores). Plan: `hadur-bench/plans/shield-sweep.queue` (PR #147), run with `./queue.sh run shield-sweep`.
Candidate `hadur2.Hadur 3.9sa` (3.9 with `ShieldList.matches` always true, so every round opens in shield mode) against baseline `hadur2.Hadur 3.9`, paired by seed, 8 seeds per opponent, 35 rounds, Robocode 1.11.1, CPU constant 1488498, parallel 12, child heap 2G, child CPUs 2. No change to `hadur-core` or `hadur-robot`. Nothing here is a release.

Raw rows: `data/bench/2026-10-08_hadur-shield-sweep-{mid,low}-v39-local_cold.tsv` (and `_rounds`). Generated run reports: [mid](2026-10-08_shield-sweep-mid-v39.md), [low](2026-10-08_shield-sweep-low-v39.md).

## Headlines (score share, points, 3.9sa minus 3.9)

| Set | Ranks | Opponents | Pairs | Difference | 95% (opponent-clustered) | Gate |
|---|---|---:|---:|---:|---|---|
| shield-sweep-mid | 51 to 400 | 109 | 872 | +4.70 | [+3.10, +6.30] UP | CAUTION: 170 of 872 pairs untrusted (19%), up to 1 other JVM |
| shield-sweep-low | 401 to 700 | 91 | 728 | -2.40 | [-3.74, -1.06] DOWN | CAUTION: 114 of 728 untrusted (16%), up to 2 other JVMs |

Without the pairs with duress the figures barely move (+4.65 and -2.36). The untrusted share comes from the 12-wide host load, equal on both sides.

Shield mode everywhere is a gain on average across the mid ranks and a loss across the low ranks. The average hides a wide spread, so the choice has to be per bot, which is what the D5 rule does.

## Per-bot spread (D5 rule)

| | Mid (109) | Low (91) |
|---|---:|---:|
| Interval above 0 ("wins") | 45 | 19 |
| Of those, also Holm-significant | 19 | 4 |
| Interval spans 0 with mean gain of 9 or more ("open") | 1 | 0 |
| Interval below 0 (losers, stay off) | 14 | 44 |
| Difference positive / negative | 74 / 35 | 33 / 58 |

Rule as in `ShieldListData`: an entry needs the paired difference's interval above 0, or an open interval with a mean gain of 9 points or more (APS is the objective). The interval used is the per-opponent 95% paired interval on 8 seeds, not multiplicity-adjusted, so expect a few false wins among 64: about 2.5% of 200 bots, around 5. The Holm-significant ones (23) are firm.

## Where the points go

Pooled per-battle mean over opponents (35 rounds):

| Set | Build | Our score | Their score | Bullet damage dealt | Bullet damage taken | Ticks per round | Opponents where our round survival is under 95% |
|---|---|---:|---:|---:|---:|---:|---:|
| mid | 3.9sa | 2733 | 638 | 642 | 481 | 916 | 51 of 109 |
| mid | 3.9 | 3646 | 1028 | 1457 | 806 | 726 | 78 of 109 |
| low | 3.9sa | 3109 | 623 | 933 | 499 | 798 | 41 of 91 |
| low | 3.9 | 4240 | 643 | 1844 | 563 | 569 | 22 of 91 |

(The score columns are raw points per battle, not shares.) Shield mode halves our own bullet damage everywhere and lengthens rounds. On the mid set it takes more away from the opponent (their score drops 1028 to 638, bullet damage taken 806 to 481, fewer lost rounds) than it costs us, which is the net gain. On the low set the opponent loses almost nothing (643 to 623) while we give up about 900 points of our own, and more rounds are lost (41 of 91 opponents under 95% survival against 22 with 3.9). So on the low ranks shield mode gives up points without taking any back. The data does not say why; I have not looked at which low-rank bots shoot back.

## Candidate additions to `ShieldListData`

These are candidates for the owner. `hadur-robot` is not edited here. Names are as Robocode reports them, so they paste directly. The Holm column marks the firm ones.

Wins (64), interval above 0:

```java
            "simonton.beta.LifelongObsession 0.5.1",
            "simonton.mini.WeeksOnEnd 1.10.4",
            "rdt.AgentSmith.AgentSmith 0.5",
            "jam.mini.Raiko 0.43",
            "tide.pear.Pear 0.62.1",
            "jekl.mini.BlackPearl .91",
            "DM.mega.Bezier 1.618fprrr",
            "kc.micro.Thorn 1.252",
            "stefw.Tigger 0.0.23",
            "wilson.Chameleon 0.91",
            "ph.mini.Archer 0.6.6",
            "lucasslf.HariSeldon 0.2.1",
            "wiki.mini.BlackDestroyer 0.9.0",
            "wcsv.Engineer.Engineer 0.5.4",
            "lucasslf.Wiggins 0.6",
            "AIR.iRobot 1.0",
            "Krabb.krabby.Krabby 1.18b",
            "vuen.Fractal 0.55",
            "zen.Lindada 0.2",
            "bvh.mini.Freya 0.55",
            "jekl.DarkHallow .90.9",
            "pkbots.BoyTDSurfer 1.0",
            "theo.Tungsten 1.0a",
            "trm.Wrekt 1.1.6.f",
            "pez.mako.Mako 1.5",
            "simonton.micro.GFMicro 1.0",
            "rz.Aleph 0.34",
            "syl.Centipede 0.5",
            "bvh.frg.Friga 0.112dev",
            "florent.small.LittleAngel 1.8",
            "jekl.Jekyl .70",
            "ad.Quest 0.10",
            "ahf.r2d2.R2d2 0.86",
            "metal.small.dna2.MCoolDNA 1.5",
            "davidalves.net.DuelistMini 1.1",
            "amk.ChumbaWumba 0.3",
            "mnt.AHEB 0.6a",
            "spinnercat.CopyKat 1.2.3",
            "gh.GrubbmGrb 1.2.4",
            "rcb.Vanessa03 0",
            "tw.Exterminator 1.0",
            "robar.micro.Kirbyi 1.0",
            "nat.nano.Ocnirp 1.73",
            "jcs.Decepticon 2.5.3",
            "davidalves.net.DuelistMicroMkII 1.1",
            "casey.Flee 1.0",
            "kawigi.mini.Coriantumr 1.1",
            "myl.micro.NekoNinja 1.30",
            "arthord.KostyaTszyu Beta2",
            "stelo.Randomness 1.1",
            "tzu.TheArtOfWar 1.2",
            "nat.nano.OcnirpPM 1.0",
            "pe.mini.SandboxMini 1.2",
            "nat.Hikari dev0001",
            "metal.small.MCool 1.21",
            "suh.nano.RandomPM 1.02",
            "lrem.magic.TormentedAngel Antiquitie",
            "ags.micro.Carpet 1.1",
            "stelo.SteloTestNano 1.0",
            "apv.NanoLauLectrikTheCannibal 1.1",
            "simonton.nano.WeekendObsession_S 1.7",
            "ins.MobyNano 0.8",
            "starpkg.StarViewerZ 1.26",
            "ds.OoV4 0.3b",
```

Open with mean gain of 9 or more (1):

```java
            "pez.clean.Swiffer 0.2.9",
```

### Wins, mid ranks 51 to 400

| Opponent | Diff | 95% half-width | Holm p |
|---|---:|---:|---:|
| simonton.beta.LifelongObsession 0.5.1 | +30.82 | 4.31 | 0.000 |
| simonton.mini.WeeksOnEnd 1.10.4 | +29.59 | 5.08 | 0.000 |
| rdt.AgentSmith.AgentSmith 0.5 | +21.57 | 3.19 | 0.000 |
| jam.mini.Raiko 0.43 | +21.15 | 2.48 | 0.000 |
| tide.pear.Pear 0.62.1 | +20.80 | 3.57 | 0.000 |
| jekl.mini.BlackPearl .91 | +19.09 | 4.27 | 0.002 |
| DM.mega.Bezier 1.618fprrr | +18.97 | 8.33 | 0.086 |
| pez.clean.Swiffer 0.2.9 | +18.73 | 20.11 | 1.000 |
| kc.micro.Thorn 1.252 | +17.93 | 4.06 | 0.002 |
| stefw.Tigger 0.0.23 | +16.97 | 4.24 | 0.003 |
| wilson.Chameleon 0.91 | +16.71 | 4.31 | 0.004 |
| ph.mini.Archer 0.6.6 | +16.66 | 7.93 | 0.134 |
| lucasslf.HariSeldon 0.2.1 | +15.36 | 3.58 | 0.002 |
| wiki.mini.BlackDestroyer 0.9.0 | +14.75 | 3.53 | 0.002 |
| wcsv.Engineer.Engineer 0.5.4 | +14.31 | 9.51 | 0.702 |
| lucasslf.Wiggins 0.6 | +14.21 | 8.04 | 0.340 |
| AIR.iRobot 1.0 | +13.82 | 3.53 | 0.003 |
| Krabb.krabby.Krabby 1.18b | +13.59 | 2.74 | 0.001 |
| bvh.mini.Freya 0.55 | +12.83 | 2.01 | 0.000 |
| jekl.DarkHallow .90.9 | +12.63 | 9.16 | 0.974 |
| pkbots.BoyTDSurfer 1.0 | +12.33 | 4.44 | 0.028 |
| theo.Tungsten 1.0a | +12.21 | 5.00 | 0.059 |
| trm.Wrekt 1.1.6.f | +12.00 | 11.66 | 1.000 |
| pez.mako.Mako 1.5 | +11.49 | 7.06 | 0.499 |
| simonton.micro.GFMicro 1.0 | +11.34 | 3.45 | 0.010 |
| rz.Aleph 0.34 | +11.24 | 7.54 | 0.722 |
| bvh.frg.Friga 0.112dev | +9.89 | 3.04 | 0.011 |
| florent.small.LittleAngel 1.8 | +9.33 | 3.71 | 0.050 |
| jekl.Jekyl .70 | +9.13 | 7.24 | 1.000 |
| ad.Quest 0.10 | +9.06 | 6.25 | 0.816 |
| ahf.r2d2.R2d2 0.86 | +8.87 | 3.37 | 0.039 |
| metal.small.dna2.MCoolDNA 1.5 | +8.67 | 7.36 | 1.000 |
| davidalves.net.DuelistMini 1.1 | +8.53 | 4.85 | 0.343 |
| mnt.AHEB 0.6a | +8.23 | 3.58 | 0.083 |
| gh.GrubbmGrb 1.2.4 | +7.44 | 6.08 | 1.000 |
| rcb.Vanessa03 0 | +7.25 | 6.00 | 1.000 |
| tw.Exterminator 1.0 | +7.17 | 6.77 | 1.000 |
| robar.micro.Kirbyi 1.0 | +7.10 | 5.99 | 1.000 |
| jcs.Decepticon 2.5.3 | +6.65 | 5.14 | 1.000 |
| davidalves.net.DuelistMicroMkII 1.1 | +6.58 | 4.76 | 0.974 |
| kawigi.mini.Coriantumr 1.1 | +6.53 | 2.47 | 0.037 |
| arthord.KostyaTszyu Beta2 | +6.24 | 5.26 | 1.000 |
| stelo.Randomness 1.1 | +6.14 | 4.94 | 1.000 |
| pe.mini.SandboxMini 1.2 | +5.62 | 5.46 | 1.000 |
| nat.Hikari dev0001 | +5.43 | 3.82 | 0.882 |
| ags.micro.Carpet 1.1 | +4.75 | 4.63 | 1.000 |

### Wins, low ranks 401 to 700

| Opponent | Diff | 95% half-width | Holm p |
|---|---:|---:|---:|
| vuen.Fractal 0.55 | +12.93 | 3.61 | 0.005 |
| zen.Lindada 0.2 | +12.90 | 3.59 | 0.005 |
| syl.Centipede 0.5 | +10.55 | 4.38 | 0.046 |
| amk.ChumbaWumba 0.3 | +8.44 | 5.27 | 0.349 |
| spinnercat.CopyKat 1.2.3 | +7.66 | 5.71 | 0.642 |
| nat.nano.Ocnirp 1.73 | +6.96 | 2.24 | 0.011 |
| casey.Flee 1.0 | +6.55 | 3.73 | 0.239 |
| myl.micro.NekoNinja 1.30 | +6.30 | 2.92 | 0.085 |
| tzu.TheArtOfWar 1.2 | +5.79 | 4.23 | 0.632 |
| nat.nano.OcnirpPM 1.0 | +5.78 | 4.82 | 0.932 |
| metal.small.MCool 1.21 | +5.26 | 3.30 | 0.350 |
| suh.nano.RandomPM 1.02 | +5.02 | 4.69 | 1.000 |
| lrem.magic.TormentedAngel Antiquitie | +4.80 | 3.54 | 0.635 |
| stelo.SteloTestNano 1.0 | +4.51 | 2.48 | 0.208 |
| apv.NanoLauLectrikTheCannibal 1.1 | +4.36 | 3.32 | 0.694 |
| simonton.nano.WeekendObsession_S 1.7 | +4.19 | 3.21 | 0.694 |
| ins.MobyNano 0.8 | +3.96 | 3.83 | 1.000 |
| starpkg.StarViewerZ 1.26 | +2.45 | 2.42 | 1.000 |
| ds.OoV4 0.3b | +2.16 | 2.01 | 1.000 |

### Losers (interval below 0): keep off the list

Mid: 14 bots, worst sqTank.waveSurfing.LionWWSVMvoid 0.01 -10.1, suh.mega.WaveSurferGF 1.04 -8.9, robar.nano.Pugio 1.49 -8.8, rz.Artist 0.2 -8.5, rc.yoda.Yoda 1.0.6c.fix -6.7.
Low: 44 bots, worst ratosh.Nobo 0.21 -15.9, dy.LevelOne 2.0 -13.9, rjw.RabidWombat 0.71 -13.3, lessonz.robocode.Oz 0.5.0 -13.0, bigpete.Stewie 1.0 -12.8.

## Caveats

- 8 seeds per bot. Per-bot intervals are wide, and the admission rule is a screen, not proof. Issue #146 proposes confirming any entries on fresh seeds before the list changes.
- Selection bias: all 200 bots are on DrussGT's shield list, so these are bots a strong robot chose to shield. The result says nothing about bots off that list (the Nullstride mid-table work found 3.9sa -1.24 there).
- Gate CAUTION on both sets (16 to 19% of pairs untrusted, equal-load both sides, one to two other Robocode JVMs on the host). Not a run to use to claim small effects, fine for the per-bot screen.
- SHIELD-6 (leave shield mode when enemy bullet damage would hold share under 85%) is active in 3.9sa as in 3.9 and is not isolated here. The effect of a listed bot in the real robot is therefore bounded by SHIELD-6, and the benefit of shield-all on the low set is what the always-on mode costs.
- The ranks 1 to 50 and the 14 existing entries are not repeated here.
