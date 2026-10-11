# A2 gate: the lifted duel against 3.5.1

A2 moves the duel out of `HadurCore` into `duel.DuelController` with no intended change of
play; every fixture replays to identical orders, telemetry and store files. The bench checks
the rest: `arch-gates.txt` on 3.5.1 (the A0 baseline) and on the A2 candidate, run at the
same time on one 4-core machine, then reruns of the two sets that read lowest.

**Verdict: within noise.** No set moved beyond its own noise once rerun, there were no
faults on either side, and per-turn time is level (median turn p95 2.32 ms before,
2.43 ms after; a replay of the eleven fixtures costs about 2% more CPU on A2).

## The gate suite

| Set | Battles | 3.5.1 | A2 | Change | Skipped turns (3.5.1 / A2) |
|---|---|---|---|---|---|
| Reference duels (score share) | 5 seeds x 6 | 91.7% | 91.5% | -0.2 | 152 / 208 |
| Top 19 (score share) | 1 seed x 18 | 49.8% | 46.1% | -3.7 (SE 1.7) | 477 / 511 |
| Weak leak (score share) | 1 seed x 11 | 88.3% | 84.5% | -3.9 (one battle, see below) | 103 / 81 |
| Melee sentry (APS) | 3 battles | 64.9 | 69.7 | +4.8 | 6 / 8 |
| Melee reference (APS) | 3 battles | 53.3 | 50.6 | -2.7 | 35 / 45 |
| Melee hand-off (APS) | 3 battles | 51.5 | 49.6 | -1.9 | 42 / 74 |
| Strong duels (score share) | 3 seeds x 3 | 53.5% | 49.3% | -4.3 | 107 / 145 |

Both passes ran alongside other work on the machine, so skipped turns are high on both and
vary with load; the per-turn times above are the like-for-like comparison.

Per opponent:

| Set | Opponent | 3.5.1 | A2 | Change | Skips | Faults |
|---|---|---|---|---|---|---|
| duel | sample.SpinBot | 99.7% | 100.0% | +0.3 | 20 / 8 | 0 / 0 |
| duel | sample.Tracker | 100.0% | 99.8% | -0.2 | 3 / 25 | 0 / 0 |
| duel | sample.Crazy | 99.0% | 98.3% | -0.7 | 51 / 59 | 0 / 0 |
| duel | sample.Walls | 98.1% | 98.5% | +0.4 | 33 / 58 | 0 / 0 |
| duel | sample.RamFire | 99.5% | 99.6% | +0.1 | 11 / 14 | 0 / 0 |
| duel | abc.Shadow 3.83c | 53.8% | 52.8% | -1.0 | 34 / 44 | 0 / 0 |
| top19 | kc.mega.BeepBoop 2.0 | 14.6% | 16.8% | +2.2 | 30 / 20 | 0 / 0 |
| top19 | jk.mega.DrussGT 3.1.16 | 36.5% | 33.7% | -2.8 | 25 / 33 | 0 / 0 |
| top19 | oog.mega.saguaro.Saguaro 1.0 | 74.2% | 80.5% | +6.3 | 6 / 11 | 0 / 0 |
| top19 | aaa.r.ScalarR 0.005h.053-noshield | 21.7% | 26.8% | +5.1 | 38 / 36 | 0 / 0 |
| top19 | voidious.Diamond 1.8.22 | 34.8% | 27.3% | -7.5 | 30 / 32 | 0 / 0 |
| top19 | cb.fire.Firestarter 2.0f | 37.6% | 34.7% | -2.9 | 38 / 26 | 0 / 0 |
| top19 | lxx.Tomcat 3.68 | 51.7% | 49.9% | -1.8 | 54 / 29 | 0 / 0 |
| top19 | rsalesc.mega.Knight 0.6.28 | 42.3% | 38.3% | -4.0 | 41 / 43 | 0 / 0 |
| top19 | dsekercioglu.mega.Raven 3.56j8 | 66.9% | 53.7% | -13.2 | 9 / 51 | 0 / 0 |
| top19 | xander.cat.XanderCat 12.9 | 49.5% | 55.8% | +6.3 | 8 / 25 | 0 / 0 |
| top19 | aw.Gilgalad 1.99.5c | 39.8% | 33.4% | -6.4 | 11 / 23 | 0 / 0 |
| top19 | pc.Wavelet 1.5 | 51.3% | 48.5% | -2.8 | 29 / 38 | 0 / 0 |
| top19 | kc.serpent.WaveSerpent 2.11 | 65.7% | 51.5% | -14.2 | 6 / 13 | 0 / 0 |
| top19 | gh.GresSuffurd 0.4.13 | 58.1% | 57.9% | -0.2 | 40 / 23 | 0 / 0 |
| top19 | dsekercioglu.mega.WhiteFang 2.8.1 | 65.9% | 68.7% | +2.8 | 34 / 22 | 0 / 0 |
| top19 | cs.Nene 1.0.5 | 63.1% | 60.7% | -2.4 | 10 / 13 | 0 / 0 |
| top19 | jk.melee.Neuromancer 7.12 | 47.7% | 36.1% | -11.6 | 60 / 62 | 0 / 0 |
| top19 | voidious.Dookious 1.573c | 74.2% | 55.4% | -18.8 | 8 / 11 | 0 / 0 |
| weak | vort.Chaser 0.0.3 | 95.2% | 95.2% | +0.0 | 0 / 2 | 0 / 0 |
| weak | bbo.RamboT 0.3 | 98.1% | 96.4% | -1.7 | 24 / 9 | 0 / 0 |
| weak | PSW.Relentless 0.1 | 98.6% | 97.1% | -1.5 | 2 / 2 | 0 / 0 |
| weak | mahrgell.mahrram 1.3 | 78.9% | 78.3% | -0.6 | 7 / 8 | 0 / 0 |
| weak | sample.RamFire | 99.7% | 99.4% | -0.3 | 0 / 8 | 0 / 0 |
| weak | stelo.MirrorNano 1.4 | 93.9% | 54.4% | -39.5 | 15 / 24 | 0 / 0 |
| weak | stelo.MirrorMicro 1.1 | 92.8% | 91.9% | -0.9 | 9 / 12 | 0 / 0 |
| weak | zyx.nano.RedBull 1.0 | 90.7% | 93.0% | +2.3 | 34 / 6 | 0 / 0 |
| weak | bwbaugh.nano.Tirunculus 0.0.0a | 86.0% | 85.2% | -0.8 | 2 / 3 | 0 / 0 |
| weak | demetrix.nano.SledgeHammer 0.22 | 68.4% | 68.3% | -0.1 | 6 / 4 | 0 / 0 |
| weak | mz.NanoDeath 2.56 | 69.1% | 69.9% | +0.8 | 4 / 3 | 0 / 0 |
| sentry | APS | 64.9 | 69.7 | +4.8 | 0 / 0 | 0 / 0 |
| sentry | Survival | 66.7 | 83.3 | +16.6 | 0 / 0 | 0 / 0 |
| sentry | skipped | 6.0 | 8.0 | +2.0 | 0 / 0 | 0 / 0 |
| reference | APS | 53.3 | 50.6 | -2.7 | 0 / 0 | 0 / 0 |
| reference | Survival | 60.4 | 55.6 | -4.8 | 0 / 0 | 0 / 0 |
| reference | skipped | 35.0 | 45.0 | +10.0 | 0 / 0 | 0 / 0 |
| handoff | APS | 51.5 | 49.6 | -1.9 | 0 / 0 | 0 / 0 |
| handoff | Survival | 57.6 | 54.8 | -2.8 | 0 / 0 | 0 / 0 |
| handoff | skipped | 42.0 | 74.0 | +32.0 | 0 / 0 | 0 / 0 |
| clean | abc.Shadow 3.84i | 57.0% | 52.2% | -4.8 | 20 / 19 | 0 / 0 |
| clean | voidious.Diamond 1.8.28 | 32.4% | 29.0% | -3.4 | 60 / 48 | 0 / 0 |
| clean | positive.Portia 1.26e | 71.2% | 66.6% | -4.6 | 27 / 78 | 0 / 0 |

## Reruns

**MirrorNano** (weak set, 54.4% in the gate pass against 93.9%). The gate battle saw MIR-1
switch on in only 6 of 35 rounds. Four seeds each, run side by side:

| | Seed 1 | Seed 2 | Seed 3 | Seed 4 | Mean | Mirror shots |
|---|---|---|---|---|---|---|
| 3.5.1 | 93.6% | 93.4% | 92.2% | 93.7% | 93.2% | 250 to 265 a battle |
| A2 | 91.1% | 92.1% | 91.7% | 93.3% | 92.1% | 253 to 269 a battle |

Every battle won 35 of 35 rounds, and the mirror response fired as often on A2 as on 3.5.1.
Without MirrorNano the weak set moves -0.3.

**Strong duels** (`handoff-duel.txt`, the lowest-reading set with more than one seed), five
seeds each, run side by side:

| Opponent | 3.5.1 | A2 |
|---|---|---|
| abc.Shadow 3.84i | 55.6% ± 7.3 | 55.9% ± 3.1 |
| voidious.Diamond 1.8.28 | 29.1% ± 6.8 | 32.0% ± 7.9 |
| positive.Portia 1.26e | 66.8% ± 4.5 | 71.5% ± 5.8 |

A2 reads level or higher on all three, so the gate pass's -4.3 was noise. The top-19 set is
one battle per opponent; its -3.7 sits at about two standard errors with the same direction
of error as the strong set's first pass, and the strong rerun is its check.

Full reports: [a0-baseline-3.5.1.md](a0-baseline-3.5.1.md) and [a2-candidate.md](a2-candidate.md).
