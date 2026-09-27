# Melee gates: M5 (melee memory and the hand-off to the duel)

The M5 build (still versioned 2.2) on the hand-off field (`melee-handoff.txt`: Shadow, Diamond and Portia among nine melee bots) and the clean 1v1 against the same three (`handoff-duel.txt`), both in `handoff-gates.txt`. The M4 build ran the hand-off field too, as the baseline. Everything is cold: the bench gives every battle a fresh robot directory, so no 1v1 profile or `.hm` file exists when a round hands off, and the H records show none was found. The hand-off's memory half (opening the survivor's 1v1 profile) therefore does not show here; what does show is the rest of the hand-off: the survivor's in-flight shots injected as duel waves, and the ledger no longer crediting a dead robot's hits to the survivor. Same engine and cores as M4; 5 seeds, not the plan's 20.

## Summary against the exit gate

The M5 exit gate is Hadur's win rate in melee rounds that end as a duel against Shadow, Diamond or Portia within 5 points of its clean 1v1 against them.

| Last opponent | M4 hand-off: won / rounds | M5 hand-off: won / rounds | Clean 1v1: rounds won |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 0 / 7 | 3 / 12 | 50 / 175 (28.6%) |
| abc.Shadow 3.84i | 2 / 6 | 3 / 8 | 134 / 175 (76.6%) |
| positive.Portia 1.26e | 0 / 2 | 2 / 6 | 152 / 175 (86.9%) |
| **The three together** | **3 / 15 (20%)** | **8 / 26 (31%)** | **57%** weighted to M5's mix |

**The gate is not met: 31% against 57%, 26 points short.** M5 wins more of these duels than M4 (31% against 20%), and more rounds reach one (26 against 15), but the samples are small: 26 rounds give a 95% interval of roughly 16 to 50%. The comparison is also not like for like. A clean 1v1 starts both robots at 100 energy with no damage taken, while a melee survivor has spent a long round getting there, usually with less energy than the strong bot that also survived. What a cold bench cannot show, and the plan meant by the gate, is the survivor's 1v1 profile at the hand-off; that needs a warm run (a 1v1 battle first, then melee in the same robot directory), which the bench does not yet support. It is listed for M6.

| Hand-off field | M4 | M5 |
|---|---|---|
| APS | 51.5 | 50.9 |
| Survival | 59.9 | 58.3 |
| Rounds won | 10 / 175 | 9 / 175 |
| Mean place | 4.61 | 4.75 |
| Skipped turns | 3 | 69 |

The melee score is unchanged within the noise (the battle range is 46 to 54 for both). Skipped turns rose from 3 to 69; they fall in the long duels against Diamond, Portia and Shadow that M5 reaches more often, where the duel's own tick budget sheds levels (the clean 1v1 skips 11 to 32 per 175 rounds against the same bots), and once at a hand-off tick (round 3 of battle 1). Two rounds' M records were lost to skipped round-end turns (173 of 175 reported).

## M4 baseline on the hand-off field


hadur2.Hadur 2.2 against 9 opponents at once, 35 rounds per battle, 5 battles, 1000x1000.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 51.5 | 59.9 | 10 / 175 | 4.61 | 10.3% | 8111 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 15.1% | 61 |
| abc.Shadow 3.84i | 2.2 | 12.4% | 30 |
| positive.Portia 1.26e | 2.8 | 12.4% | 28 |
| hadur2.Hadur 2.2 | 4.4 | 10.3% | 10 |
| kawigi.mini.Coriantumr 1.1 | 5.8 | 9.4% | 10 |
| darkcanuck.B26354 1.06 | 6.2 | 9.1% | 14 |
| rz.HawkOnFire 0.1 | 7.0 | 8.8% | 3 |
| kawigi.sbf.FloodHT 0.9.2 | 7.2 | 8.2% | 6 |
| simonton.micro.Sprout 1.1.3 | 8.6 | 7.7% | 5 |
| gh.Griezel 0.5.4 | 9.8 | 6.6% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 51.7 | 60.3 | 1 / 35 | 1716 |
| 2 | 4 | 52.1 | 61.0 | 1 / 35 | 1608 |
| 3 | 4 | 54.0 | 64.8 | 4 / 35 | 1619 |
| 4 | 6 | 46.3 | 48.3 | 1 / 35 | 1565 |
| 5 | 4 | 53.6 | 65.1 | 3 / 35 | 1603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 7 | 0% |
| abc.Shadow 3.84i | 6 | 33% |
| kawigi.sbf.FloodHT 0.9.2 | 4 | 50% |
| darkcanuck.B26354 1.06 | 4 | 50% |
| kawigi.mini.Coriantumr 1.1 | 4 | 50% |
| positive.Portia 1.26e | 2 | 0% |
| gh.Griezel 0.5.4 | 2 | 0% |
| rz.HawkOnFire 0.1 | 2 | 100% |

Skipped turns: 3.

Posture (Hadur's M records, 175 rounds): 106599 melee ticks, 6493 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (175 rounds): longest scan gap while four or more were alive 56 ticks (175 rounds over 8); rounds whose longest gap at any count was over 8: 175; robots dropped as dead without a death event: 0.

Targeting waves (175 rounds): 37997 sent, 33728 reached their opponent, 4610 virtual hits (13.7% of those reached).


## M5 run


hadur2.Hadur 2.2 against 9 opponents at once, 35 rounds per battle, 5 battles, 1000x1000.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 50.9 | 58.3 | 9 / 175 | 4.75 | 10.0% | 8084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.4 | 14.7% | 53 |
| abc.Shadow 3.84i | 2.2 | 12.4% | 25 |
| positive.Portia 1.26e | 2.4 | 12.4% | 33 |
| hadur2.Hadur 2.2 | 4.6 | 10.0% | 9 |
| darkcanuck.B26354 1.06 | 5.8 | 9.4% | 19 |
| kawigi.mini.Coriantumr 1.1 | 6.4 | 9.0% | 8 |
| kawigi.sbf.FloodHT 0.9.2 | 7.0 | 8.7% | 11 |
| rz.HawkOnFire 0.1 | 7.8 | 8.4% | 4 |
| gh.Griezel 0.5.4 | 8.2 | 7.7% | 10 |
| simonton.micro.Sprout 1.1.3 | 9.2 | 7.1% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 50.5 | 58.1 | 3 / 35 | 1601 |
| 2 | 5 | 48.6 | 52.1 | 1 / 35 | 1592 |
| 3 | 5 | 51.4 | 59.7 | 2 / 35 | 1661 |
| 4 | 5 | 51.7 | 59.7 | 3 / 35 | 1686 |
| 5 | 4 | 52.2 | 61.9 | 0 / 35 | 1544 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 12 | 25% |
| abc.Shadow 3.84i | 8 | 38% |
| positive.Portia 1.26e | 6 | 33% |
| darkcanuck.B26354 1.06 | 2 | 0% |
| kawigi.mini.Coriantumr 1.1 | 2 | 0% |
| gh.Griezel 0.5.4 | 2 | 50% |
| rz.HawkOnFire 0.1 | 2 | 0% |
| simonton.micro.Sprout 1.1.3 | 1 | 0% |
| kawigi.sbf.FloodHT 0.9.2 | 1 | 0% |

Skipped turns: 69.

Posture (Hadur's M records, 173 rounds): 102907 melee ticks, 8785 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (173 rounds): longest scan gap while four or more were alive 72 ticks (173 rounds over 8); rounds whose longest gap at any count was over 8: 173; robots dropped as dead without a death event: 0.

Targeting waves (173 rounds): 37314 sent, 33135 reached their opponent, 4303 virtual hits (13.0% of those reached).

### Bench: hadur2.Hadur 2.2 (cold)

35 rounds x 5 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 4 cores. robocode.cpu.constant=3615284.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| abc.Shadow 3.84i | headline | 60.0% ± 6.3 | 76.4% ± 6.9 | 44.3% ± 5.1 | 134 / 175 | 9.4% ± 1.0 | 8.3% ± 1.3 | 23 | 0 | 1.13 / 15.4 |
| voidious.Diamond 1.8.28 | headline | 35.2% ± 8.0 | 27.3% ± 11.6 | 44.5% ± 5.2 | 50 / 175 | 6.9% ± 0.6 | 8.5% ± 0.4 | 11 | 0 | 2.12 / 29.7 |
| positive.Portia 1.26e | headline | 72.1% ± 3.9 | 86.9% ± 4.0 | 57.2% ± 4.4 | 152 / 175 | 11.4% ± 0.7 | 7.1% ± 0.6 | 32 | 0 | 1.31 / 25.9 |

### Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| abc.Shadow 3.84i | 9676 | 431 | 9654 | 9653 (99.8%) | 23 (0.2%) | 1 (0.0%) | 402 | 108 | 18 |
| voidious.Diamond 1.8.28 | 38225 | 1281 | 39846 | 38211 (100.0%) | 14 (0.0%) | 1635 (4.1%) | 2122 | 207 | 6 |
| positive.Portia 1.26e | 10617 | 10 | 10617 | 10617 (100.0%) | 0 (0.0%) | 0 (0.0%) | 490 | 106 | 19 |

### Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| abc.Shadow 3.84i | 10536 | 889 (8.4%) | 9766 |
| voidious.Diamond 1.8.28 | 38164 | 4134 (10.8%) | 37733 |
| positive.Portia 1.26e | 11027 | 1082 (9.8%) | 9928 |

### Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| abc.Shadow 3.84i | 650 | 463 | 650 | 788 | 29.0 / 36.5 | 0 | 1480 | 59 |
| voidious.Diamond 1.8.28 | 650 | 541 | 650 | 2569 | 24.8 / 30.9 | 0 | 172 | 104 |
| positive.Portia 1.26e | 650 | 508 | 650 | 829 | 37.5 / 28.0 | 0 | 1950 | 34 |

### Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| abc.Shadow 3.84i | 8.3% | 23 | 175 | 2 | 55.0 | 887 / 889 (100%) | 0 | 0 |
| voidious.Diamond 1.8.28 | 8.5% | 11 | 473 | 2 | 225.4 | 4131 / 4134 (100%) | 0 | 0 |
| positive.Portia 1.26e | 7.1% | 32 | 240 | 3 | 60.5 | 1082 / 1082 (100%) | 0 | 0 |

### Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| abc.Shadow 3.84i | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| voidious.Diamond 1.8.28 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| positive.Portia 1.26e | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| abc.Shadow 3.84i | abc.Shadow | 1 | 35 | 20659 | 9.0% | 7.8% ± 1.2 | 8.3% | 20.4% / 19.1% | 7.8% | 600 / 184 | T3/M1 | 59% |
| voidious.Diamond 1.8.28 | voidious.Diamond | 1 | 35 | 23701 | 8.4% | 7.2% ± 1.0 | 6.6% | 22.8% / 21.5% | 8.9% | 600 / 300 | T3/M1 | 30% |
| positive.Portia 1.26e | positive.Portia | 1 | 35 | 20159 | 7.9% | 7.5% ± 1.2 | 11.2% | 26.0% / 26.3% | 7.5% | 600 / 164 | T3/M0 | 75% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

