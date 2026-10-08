# 3.10 on the fixed bench against all 144 PEERGAP opponents (`peergap-310`)

2026-10-08. Plan `hadur-bench/plans/peergap-310.queue`, run with `.\queue.ps1 run peergap-310` from master at ad7c3cd0 (PR #158), after the BENCH-83 fix was confirmed ([confirm-fix-310](2026-10-08_confirm-fix-310-findings.md)). Local bench host, Hadur 3.10 alone, the 144 opponents of `hadur-bench/peergap-310.txt`, 4 seeds each (576 battles), 35 rounds, Robocode 1.11.1, CPU constant 1488498, parallel 12, child CPUs 2, child heap 2G. No RoboRumble clients and no other Robocode JVMs. The battle step took 506 s.

Raw rows: `data/bench/2026-10-08_hadur-peergap-310-local_cold.tsv` (and `_rounds`). Generated report: [peergap-310](2026-10-08_peergap-310.md). Classification: [opponents-3.10.tsv](../opponents-3.10.tsv), regenerated with the `live_passes.py classify` command in [live-3.10](../live-3.10.md) section 3.

## Result

- All 576 battles finished; no "JDK resource denied" rows and 0 security errors. 460 of 576 battles are trusted; the rest had duress ticks (88 battles) or missing round records. The classifier's bench figure uses trusted battles only.
- Mean score share over the 144 is 84.1%. The live typical score for the same 144 is 80.3 and the peers' median is 87.8, so on this set the bench reads a little easier than live (+3.8) and the peers beat Hadur by about 7.5 points.
- The bench now covers every PEERGAP bot (144 of 144; 76 before). 68 had never been benched and 41 had only the crippled harness.
- **BENCHSEES, the bots the bench can work on (bench 5+ under the peers' median): 45, up from 35.** 12 are new and 2 dropped out. All 45 are PEERGAP, none is on the shield list, 15 are rammers and 6 are nanos. They are the 3.11 gate-list candidates; picking the list is the owner's call.
- Only 10 of the 144 are BENCHGAP (bench and live 10+ apart), so for most of the set the bench and live agree and the bench can be trusted as a proxy.
- Net room over the whole field at the peers' median is **+0.76 APS** (+0.75 before this run). BENCHSEES alone holds +0.29 of it; PEERGAP as a whole +0.75.

## The 45 BENCHSEES bots, largest peer gap first

Bench is Hadur 3.10's trusted bench score share on this run (plus earlier bench rows the classifier pools); live is Hadur's typical live score; peers is the median of Tomcat 3.68, Knight 0.6.28 and Raven 3.56j8 against the bot. With 4 seeds a single bot's bench figure is wide (several points), so use the list as a set, not for individual ranking.

| Rank | Opponent | Kind | Bench | Live typical | Peers | Peer gap (live) |
|---:|---|---|---:|---:|---:|---:|
| 500 | hp.Athena 0.1 |  | 78.50 | 76.13 | 87.05 | +12.97 |
| 589 | demetrix.nano.Neutrino 0.27 | nano | 82.04 | 76.85 | 88.09 | +12.59 |
| 513 | mz.NanoDeath 2.56 |  | 67.25 | 66.14 | 78.67 | +11.95 |
| 385 | dmh.robocode.robot.PinkPanther 1.1 |  | 65.34 | 63.57 | 71.97 | +10.65 |
| 477 | sul.Bicephal 1.2 | rammer | 68.49 | 67.06 | 78.01 | +10.61 |
| 637 | suh.nano.RammingC 1.00 | rammer | 72.88 | 72.17 | 82.82 | +10.16 |
| 470 | gh.micro.GrubbmThree 1.01 | rammer | 65.16 | 62.90 | 74.87 | +10.06 |
| 777 | janm.Jammy 1.0 |  | 84.41 | 82.62 | 92.53 | +9.98 |
| 615 | suzushin7.nano.Galaxy03 1.01 | rammer | 72.63 | 72.53 | 82.81 | +9.93 |
| 800 | lorneswork.Predator 1.0 |  | 90.79 | 86.64 | 97.94 | +9.91 |
| 250 | slugzilla.ButtHead 2.0 | rammer | 68.99 | 70.17 | 78.70 | +9.39 |
| 279 | ers.nano.sunderer.Sunderer 1.23a | nano | 72.25 | 72.33 | 81.89 | +9.22 |
| 988 | ender.EnderRobot 1.1 |  | 84.30 | 86.59 | 96.18 | +9.09 |
| 479 | kc.micro.rammer.MaxRisk 0.6 | rammer | 68.97 | 65.67 | 75.84 | +9.08 |
| 676 | step.nanoPri 1.0 | rammer | 74.65 | 74.16 | 82.75 | +8.72 |
| 953 | com.syncleus.robocode.Dreadnaught 0.1 |  | 85.43 | 83.70 | 92.98 | +8.62 |
| 502 | mn.nano.perceptual.Impact 1.3.0 | nano | 66.00 | 66.70 | 75.50 | +8.33 |
| 991 | stelo.Lifestealer 1.0 |  | 80.86 | 78.80 | 88.20 | +8.32 |
| 501 | jab.micro.Sanguijuela 0.8 | rammer | 70.38 | 69.98 | 77.71 | +8.29 |
| 523 | demetrix.nano.SledgeHammer 0.22 | nano | 68.80 | 66.47 | 77.35 | +8.12 |
| 753 | davidalves.net.DuelistNano 1.0 |  | 82.18 | 80.30 | 89.06 | +7.96 |
| 246 | sheldor.nano.Sabreur 1.1.2 | rammer | 68.77 | 70.87 | 78.92 | +7.78 |
| 342 | jk.nano.Machete 2.0 | rammer | 72.15 | 72.47 | 79.92 | +7.78 |
| 525 | sL300.Mozart life |  | 74.65 | 73.72 | 83.32 | +7.72 |
| 486 | nan.Ihivatar_Mk_1 1.0 |  | 89.37 | 88.42 | 94.81 | +7.67 |
| 321 | sheldor.nano.SabreuseNano 1.1 | rammer | 71.45 | 70.21 | 78.33 | +7.61 |
| 596 | supersample.SuperRamFire 1.0 | rammer | 83.34 | 77.44 | 88.84 | +7.39 |
| 387 | wiki.WaveRammer 1.0 |  | 73.65 | 72.99 | 81.49 | +7.28 |
| 964 | Noran.BitchingElk 0.054 |  | 91.42 | 90.37 | 96.42 | +7.15 |
| 245 | slugzilla.RandomGF 1.0 |  | 78.47 | 76.88 | 84.06 | +6.85 |
| 771 | blir.nano.Bruce R1.0.0 | nano | 79.52 | 79.50 | 86.77 | +6.73 |
| 228 | xander.cat.Mikey 1.2 |  | 83.88 | 83.78 | 89.84 | +6.71 |
| 822 | stranger.nano.TestBot 1.0 | nano | 88.76 | 86.35 | 95.89 | +6.66 |
| 705 | EH.Fusion 0.32 | rammer | 80.81 | 78.90 | 86.40 | +6.53 |
| 492 | alpha.BlackIce 1.0 |  | 81.39 | 78.69 | 86.41 | +6.12 |
| 274 | oog.nano.Caligula 1.15 | rammer | 73.00 | 75.88 | 81.57 | +5.49 |
| 989 | kneels.ToNoone 0.2 |  | 91.56 | 88.75 | 97.64 | +5.36 |
| 923 | apc.Colossus2 0.12 |  | 89.00 | 88.41 | 95.13 | +5.13 |
| 652 | maribo.FollowFire 1.11 | rammer | 69.96 | 70.40 | 77.43 | +5.00 |
| 166 | lxx.ConceptA 0.8 |  | 80.00 | 81.32 | 87.42 | +4.59 |
| 442 | serenity.nonSense 1.39 |  | 83.37 | 80.69 | 88.45 | +3.94 |
| 536 | agd.Mooserwirt2 2.7 |  | 89.46 | 91.75 | 97.08 | +3.88 |
| 827 | vjik.UnViolation 1.1 |  | 89.93 | 88.72 | 95.23 | +3.86 |
| 650 | fnc.bandit2002.Bandit2002 4.0.2 |  | 82.42 | 79.69 | 87.50 | +3.16 |
| 717 | strider.Festis 1.2.1 |  | 88.37 | 88.33 | 94.33 | +2.33 |

## Read

- 21 of the 45 are rammers or nanos and 20 are tagged LEAK (survival 95+ but APS under 85): Hadur outlives them but by less margin than the peers. The ranks run from about 100 to 1000, so there is no single band to target.
- Nothing here changes `hadur-core` or `hadur-robot`, and no release was cut.
