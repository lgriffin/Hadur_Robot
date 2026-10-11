# Overnight 3.9 bench: findings (issue #138)

Date: 2026-10-07 (run overnight into 2026-10-08). Host: the Threadripper bench PC, Robocode 1.11.1, 35 rounds, 800x600,
child heap 2G, parallel 12, 2 CPUs per child, CPU constant 1488498 (calib-cpu: 1000000). Hadur 3.9 is the `master` build,
unreleased. Nothing in `hadur-core` or `hadur-robot` changed; this is data and tooling only.

Six runs, all 1v1, all seed-paired, all headlines opponent-clustered 95% intervals (points of score share, candidate minus
baseline). Raw rows are in `data/bench/2026-10-07_hadur-<label>-local_cold.tsv` (and `_rounds.tsv`), listed in
`data/catalog.tsv`. Per-run reports and per-opponent pages are `docs/bench/local/2026-10-07_<label>.md`.

## Headlines

| Run | Compare | Opponents x seeds | Headline | Reading | Gate |
|---|---|---|---|---|---|
| leak-score | 3.9 vs 3.4 | 32 rammers x 8 | **+5.71** [+3.51, +7.92] | UP | NOT_TRUSTED (27% untrusted; +5.66 without duress pairs) |
| lost-rounds | 3.9 vs 3.4 | 32 x 8 | **+1.70** [+0.15, +3.25] | UP, only just | CAUTION (18% untrusted) |
| tail | 3.9 vs 3.4 | 39 x 8 | **+0.16** [-0.34, +0.66] | LEVEL (equivalent at margin 1.0) | CAUTION (21% untrusted; +0.09 without duress) |
| tail-knight | Knight 0.6.28 vs 3.9 | 39 x 8 | **+1.20** [+0.55, +1.85] | Knight UP | CAUTION (9% untrusted; +1.08 without duress) |
| calib-cpu | 3.9 vs 3.8.5, CPU 1000000 | 32 x 16 | **+0.28** [-0.04, +0.60] | LEVEL | CAUTION (23% untrusted) |
| calib-warm, cold half | 3.9 vs 3.8.5 | 32 x 8 | +0.54 [-0.13, +1.22] | not resolved | NOT_TRUSTED (26% untrusted) |
| calib-warm, warm half | 3.9 vs 3.8.5 | 32 x 8 | +0.60 [-0.45, +1.65] | not resolved | CAUTION (4% untrusted) |

One opponent, `e32.Omni 0.06`, fails every battle in every build ("expected 2 robots; found 1": the engine cannot load
it). It is excluded from the pooled figures of the tail and tail-knight runs and listed under "Excluded or failing
opponents" in their reports. The `tail` and `tail-knight` queue steps therefore exited 1; the other 39 opponents completed
all 8 seeds. Most of the gate cautions come from the live RoboRumble clients still sharing the host (up to 2 other JVMs),
which is why the without-duress figures are quoted beside the headlines. None of them moves a reading.

## What each run answers (the #138 reading rules)

### tail-knight: the bench sees the gap to Knight

Knight 0.6.28 scores +1.20 [+0.55, +1.85] over 3.9 on the weak tail, so the gap is a bench effect, not live-only noise.
Pooled over the 39 opponents (per-battle means, 35 rounds, points):

| Per battle | Hadur 3.9 | Knight | Difference |
|---|---|---|---|
| Opponent bullet damage on us | 344 | 295 | Knight takes 14% less |
| Opponent ram damage on us | 17 | 10 | |
| Opponent survival + last-survivor points | 31 | 12 | Knight is outlived less |
| Our bullet damage on them | 2424 | 2407 | level |
| Opponents' total score | 400 | 320 | Knight concedes 80 fewer |
| Engine ticks per round | 469 | 482 | Knight rounds are slightly longer |

Reading: the gap is **movement against simple guns**. Knight takes about 50 fewer bullet damage points per battle and
does not shoot faster (damage dealt is level, rounds are not shorter), so kill speed is not the difference. Rams are a
small part. Per opponent the gap is concentrated: seven opponents are significant after Benjamini-Hochberg adjustment (EH.Fusion +5.4,
fm.claire +2.9, nan.Ihivatar_Mk_1 +6.5, jab.micro.Sanguijuela +7.0, uccc.MilkyWay +1.6, hirataatsushi.Trinity +1.5,
omens.CannonfodderNano +1.3), with js.PinBall +4.2 and apv.TheBrainPi +3.6 large but not resolved. 3.10 has a bench
target here: bullet damage taken by 3.9 on these simple-gun bots.

### tail: 3.9 holds the tail against 3.4

+0.16 [-0.34, +0.66], equivalent at margin 1.0. Nothing regressed on the tail. The one resolved opponent is
jab.micro.Sanguijuela +8.49 (Holm 0.007), a rammer. 3.9 round survival on the tail is below 95% on three bots:
apv.TheBrainPi 90.0% (3.4: 92.9), myl.nano.Kakuru 94.3% (95.0), suh.micro.WallPM 94.3% (93.9).

### leak-score: the ram fix is the 3.9 gain against rammers

+5.71 [+3.51, +7.92] on the 32 rammer set, and 3.9 is ahead on nearly every opponent (21 significant); the one exception,
SuperRamFire -2.67, is not significant. Where the points went (per battle, pooled):

| Per battle | Hadur 3.4 | Hadur 3.9 |
|---|---|---|
| Opponents' ram damage on us | 767 | 173 |
| Opponents' bullet damage on us | 1351 | 1469 |
| Our ram damage | 463 | 97 |
| Our bullet damage | 2383 | 2872 |
| Opponents' total score | 2295 | 1720 |
| Opponent survival + bonuses | 162 | 72 |
| Engine ticks per round | 373 | 358 |

3.9 gives away about 600 fewer ram points per battle and kills faster with bullets (+490), at a cost of about 120 more
bullet damage taken. Of what the rammers still score against 3.9, 85% is bullet damage. For 3.10: more distance control
buys little more against rammers; their bullets are now the leak.

### lost-rounds: survival is still short on 18 of 32 bots

+1.70 [+0.15, +3.25] (UP, CAUTION). Largest per-opponent gains: OldManXP +12.5, NaN +16.3, Sunderer +8.2, MaxRisk +6.8.
3.9 round survival is below 95% on **18 of 32** bots (3.4: 20). Lowest: Archer 81.8%, Kludgy 82.5%, RandomBot 82.9%,
MatchupAGF 83.2%, Grrrrr 84.3%, MatchupMini 85.4%, PinkPanther 86.1%, MicroAspid 87.9%. These stay on the target list.

### calib-cpu and calib-warm: neither condition shows 3.9 at +1.5

The rule was: whichever condition shows 3.9 at least 1.5 above 3.8.5 becomes the gate condition for 3.10. None does.

| Condition | 3.9 minus 3.8.5 |
|---|---|
| CPU constant 1000000 (slower clients), 16 seeds | +0.28 [-0.04, +0.60], only yk.JahMicro significant (+1.88) |
| Cold start (data wiped), CPU 1488498 | +0.54 [-0.13, +1.22] |
| Warm start (shelf kept from the cold battle) | +0.60 [-0.45, +1.65] |
| Warm minus cold (paired, same opponent and seed) | +0.05 [-0.72, +0.83] |

Warm start does not help 3.9 more than 3.8.5 does, and a slower CPU does not hurt it. **The live passes stay the measure
for 3.10**; no new gate condition is adopted. The warm half was exported from the `-warm` battle directories of the
calib-warm work directory with the same exporter (the exporter has no warm switch; directories were copied under
cold names to a scratch work directory).

## What this changes for 3.10

1. Bench-visible target: bullet damage taken on the simple-gun tail (Knight ahead by 1.2), then survival on the 18
   lost-rounds bots under 95%.
2. Rammers: the ram problem is solved; the remaining leak is bullets, not rams.
3. Calibration: no cold or CPU condition separates 3.9 from 3.8.5, so there is nothing to gate on beyond the usual
   top 20 and live passes.
4. Open: `e32.Omni 0.06` cannot be loaded by the engine and should be dropped from `tail-39.txt` or replaced.

Caveats: every run shared the host with 1 to 2 live RoboRumble JVMs (recorded in each report); clustered intervals are
wide because opponents differ, so more seeds will not narrow them, more opponents might.
