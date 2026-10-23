# How the four rivals above Hadur are built (2026-10-23)

Leigh asked for source analysis of 4th to 7th, and chose on 2026-10-23 11:32 UTC to decompile the
three that ship no source. Jars are the rumble participants' own: Saguaro 1.0 (GitHub release),
ScalarR 0.005h.053-noshield and Ogi v1 (participants-list links). Decompiled with CFR 0.152 in a
scratch directory; nothing from them is copied into Hadur. Diamond 1.8.22 ships its source and was
read on Leigh's PC. Live numbers are from docs/bench/live-3.15-rivals.md.

| Rival | Lead over 3.15 | Size | Source |
|---|---|---|---|
| Saguaro 1.0 | +2.47 | 130 classes, 23,500 lines | decompiled, readable |
| ScalarR | +1.93 | 659 classes, 31,100 lines | decompiled, names obfuscated |
| Ogi v1 | +1.64 | 76 classes, 9,800 lines | decompiled, readable |
| Diamond 1.8.22 | +0.85 | 60 files | shipped source |

## Saguaro: a pre-trained specialist for every opponent

Saguaro carries eight modes and picks one per opponent by the score share each has earned against
it (a Bayesian comparison of each mode's share, with disqualification once a mode's upper bound
falls below another's mean):

- **ScoreMax**: a general fighter that plans movement and shots to maximise expected score.
- **BulletShield** and **MovingBulletShield**: shoot the enemy's bullets down, standing or moving.
- **ShotDodger**: works out which of 12 simple aims the enemy uses (head-on, linear, averaged
  linear, circular, each with and without the gun-turn lag, plus aim-at-centre) and dodges that exact shot.
- **WavePoison** and **WavePoisonShift**: stop-and-go patterns that feed a surfer's learning bad data.
- **PerfectPrediction**: predicts a predictable enemy's path exactly (rammers, mirrors).
- **AntiBasicSurfer**.

The jar ships a data file for each of 1,211 rumble opponents. Every file locks one mode and holds
50,000-120,000 points of score already played with it, hundreds of battles an opponent, played
offline before release. Decoded and joined to Saguaro's live lead over Hadur 3.15:

| Locked mode | Bots | Saguaro's lead (APS) | Saguaro there | Hadur there | Mostly |
|---|---|---|---|---|---|
| BulletShield | 181 | +0.75 | 94.5 | 89.5 | D, B |
| MovingBulletShield | 119 | +0.64 | 94.5 | 88.0 | D, B |
| WavePoisonShift | 103 | +0.63 | 93.9 | 86.5 | B, D |
| ShotDodger | 429 | +0.60 | 97.5 | 95.8 | B (390), rammers (27) |
| WavePoison | 45 | +0.24 | 93.8 | 87.3 | B, D |
| PerfectPrediction | 39 | +0.16 | 87.3 | 82.2 | rammers (25) |
| AntiBasicSurfer | 33 | +0.10 | 91.1 | 87.4 | mixed |
| ScoreMax | 252 | **-0.55** | 80.4 | 83.1 | mixed |

**Saguaro's whole lead is tailoring.** Where it plays its general mode it is 0.55 APS behind
Hadur. The shield modes cover 300 bots against Hadur's 200-entry shield list: on the 127 Saguaro
shields and Hadur does not, Saguaro gains +0.99 APS (72 standing, +0.62; 55 moving, +0.37). About
60 of those 127 were in Hadur's Nullstride shield sweep (`hadur-bench/shield-ns-sweep.txt`) and did
not make the list, so Saguaro's shield works where Hadur's did not. Hadur has no moving shield.

## Ogi: a classic surfer whose danger model knows simple guns

- **Surf danger is a mixture of experts.** A kNN of the enemy's past firing angles, 13 simple-aim
  predictions (head-on, linear with and without walls, circular, lateral averages over 5/20/40 ticks,
  a pattern replay, and linear at 1/2, 3/4 and 5/4 speed), and a flattener of Ogi's own visits.
  Each expert's weight is updated on every enemy bullet by how well it predicted it (exponential
  weights), so a simple gun is matched on the first few bullets and a learning gun takes over as
  its kNN fills.
- **Bullet power**: 1.92 by default; 3.0 within 200 px or once Ogi hits 55%+ of 20+ shots; 1.45 once
  it hits under 25% of 30+ shots; an energy-race chooser when either side is low.
- No per-opponent data in the jar. Ogi gains on ranks 51-400 and the large losses, not the weak tail.

## ScalarR: obfuscated; two parts read

- **A named shield list of 40 bots** (this is the "noshield" build: the shield is on only for them).
- **Bullet power**: 2.95 within 150 px or when its hit chance is over 33%; 1.95 out to 325 px;
  further out 1.95 or 2.95 by a flag; an energy race that compares both sides' projected energy;
  it holds fire at a disabled enemy beyond 150 px. Powers are rounded to a fixed ladder
  (0.1, 0.15, 0.45 ... 1.95, 2.15, 2.65).

## Diamond (read on the PC)

Hadur's duel surf, danger views, distancing and wall stick are largely Diamond's. Differences that
matter: Diamond pre-surfs an imaginary wave when the enemy's gun is about to fire (Hadur's `hj` /
RAM-4, which measured +0.10 field-wide and +0.42 ± 0.30 on rammers); Diamond turns its flatteners on
above a 5.9% enemy hit rate (3.15 keeps them off in duels); Diamond always orbits a rammer on the
side that turns away, where RAM-1 deliberately takes the other side.

## What this means for top 5 (+1.93 APS to ScalarR)

1. **The two highest-placed rivals both model simple guns explicitly.** Saguaro dodges the exact simple
   aim on 429 bots (+0.60 there); Ogi weighs 13 simple aims in every surf decision. Hadur's surf
   has only learned views, and its hit read showed rammers and weak bots hit it with close head-on
   and linear shots. One field-wide rule: add simple-aim experts to the duel surf danger, weighted
   by how well each predicts the enemy's bullets. Ogi gets almost nothing in the weak tail from it,
   so expect less than Saguaro's +0.60; it is the cleanest single build these reads point to.
2. **Shield coverage is worth about +1.0 APS to Saguaro** on 127 bots off Hadur's list, but Hadur's
   shield already failed on about half of them. Closing it needs a better shield (moving), not a
   longer list.
3. **Saguaro's edge is offline per-opponent training.** Copying that approach means a per-opponent
   table for the whole field, trained on the PC. That runs against the standing preference for one
   rule over the whole field and is Leigh's call.
4. ScalarR's and Ogi's power rules are close to what POW-12 tried; firepower stays closed.
