# Nullstride in the mid-table: bench results (issue #140)

Run 2026-10-07 (finished 2026-10-08) from `hadur-bench/plans/mid-39.queue`, prepared in
`2026-10-07_nullstride-mid-table.md`. All 1v1, 8 seeds, 35 rounds, Robocode 1.11.1, child heap 2G, CPU constant 1488498,
parallel 12, 2 CPUs per child, up to 2 other Robocode JVMs beside the bench (live RoboRumble clients). Headlines are
opponent-clustered 95% intervals, candidate minus baseline, points of score share. No change to `hadur-core` or
`hadur-robot`; `3.9sa` is an ablation build made by `build-ablation.sh shield-all`, never released.

Sets: `mid-39.txt` is 40 bots from ranks 51-400 on neither DrussGT's shield list nor Hadur's D5 list; `mid-shield-39.txt`
is 30 mid-table bots from DrussGT's shield list. Raw rows are `data/bench/2026-10-07_hadur-<label>-local_cold.tsv`.

## Headlines

| Run | Compare | Set | Headline | Reading | Gate |
|---|---|---|---|---|---|
| mid | 3.9 vs 3.4 | 40 off-list | -0.01 [-0.76, +0.74] | LEVEL | CAUTION (11% untrusted) |
| mid-shieldall | 3.9sa vs 3.9 | 40 off-list | -1.24 [-3.46, +0.98] | not resolved | CAUTION (14%) |
| mid-shieldall-list | 3.9sa vs 3.9 | 30 on-list | **+8.05** [+4.06, +12.04] | UP | CAUTION (14%) |
| mid-null | Nullstride 2.3.3 vs 3.9 | 40 off-list | **+10.95** [+8.91, +12.99] | Nullstride UP | NOT_TRUSTED* |
| mid-null-list | Nullstride 2.3.3 vs 3.9 | 30 on-list | **+17.84** [+15.41, +20.27] | Nullstride UP | NOT_TRUSTED* |

\*The gate fails only because the builds skipped different numbers of turns: Nullstride skips 46 and 33 turns a battle
(0.16% and 0.09% of its turns; its own runtime cost), Hadur 12. Hadur's duress is 20 to 22 ticks a battle. Without the
pairs with duress the figures are +10.87 [+8.86, +12.89] and +17.67 [+15.22, +20.11]. The leads are many times any
load effect and 38 of 40 and 30 of 30 opponents agree, but by the rules of this bench they are reported as untrusted.

## What Nullstride's points are made of

Pooled per battle (35 rounds), means over opponents:

| | Off-list 40: Hadur 3.9 | Nullstride | On-list 30: Hadur 3.9 | 3.9sa | Nullstride |
|---|---|---|---|---|---|
| Opponents' bullet damage on it | 828 | **397** | 866 | 428 | **171** |
| Opponents' total score | 1081 | 465 | 1121 | 577 | 206 |
| Opponent survival + bonuses | 243 | 65 | 254 | 147 | 30 |
| Its own bullet damage dealt | 1635 | 1265 | 1544 | 671 | 525 |
| Ticks per round | 748 | 847 | 756 | 924 | 1035 |
| Rounds won below 95% (bots) | 30 of 40 | 7 of 40 | 24 of 30 | n/a | 1 of 30 |

Ram damage is negligible everywhere (under 10 a battle). Reading:

1. **Nullstride wins by not being hit, not by hitting harder.** It deals fewer bullet points than Hadur (1265 vs 1635, and
   525 vs 1544 on the list) and still wins by 11 to 18 points of share, because opponents get 52% (off-list) and 80%
   (on-list) less bullet damage off it. This is a movement or shielding effect, matching the compare-page inference.
2. **On DrussGT's list, shielding is most of the mechanism and Hadur can reach part of it.** Turning Hadur's shield mode on
   for those bots (3.9sa) gains +8.05, 22 of 30 opponents up, 18 significant after Benjamini-Hochberg (largest: dft.Cyanide
   +30.0, cf.proto.Shiva +24.4, brainfade.Fallen +20.5, theo.avenge.Pequod +20.1, theo.real.Ahab +20.0), and halves bullet
   damage taken (859 to 428). That closes about 45% of Nullstride's +17.84 on the list. Nullstride still takes 171, so it does
   more than shield mode does. Rounds lengthen in both (756, 924, 1035 ticks): a shielded duel is slow.
3. **Off the list, shielding does not help, and the lead is something else.** 3.9sa is not resolved (-1.24; 31 of 40
   opponents down, 11 significantly; 9 up, 5 significantly, led by cjm.Charo +21.0). Nullstride still leads by +10.95 there, taking 52% less
   bullet damage, and Hadur 3.9 wins fewer than 95% of rounds on 30 of these 40 bots against 7 for Nullstride. The off-list gap is lost
   rounds and bullet avoidance (the issue's M1/M4 and movement), not shielding. 3.9 and 3.4 are level on these bots (`mid`),
   so 3.9 did not change this; lowest survival: dragonbyte.Neutrino 52.5%, stelo.PastFuture 75.7%, ags.Glacier 77.5%.
4. **Where Nullstride is closest:** penguin.MrFreeze (-0.36) and pez.mini.VertiLeach (-0.08) on the off-list set; no
   opponent on the shield list is level (smallest +6.3, can.Pookie).

## What this means for 3.10 (for the owner to decide)

- **Candidate change A: extend Hadur's shield list toward DrussGT's list.** The bench shows +8.05 on 30 list bots that
  are not on D5, with SHIELD-6 still bounding the cost. Losers exist (8 of 30 down, 5 significant, worst css.Delitioner
  -10.4, dz.Caedo -9.4, pedersen.Hubris -7.1), so entries should be added per bot, not wholesale. The same switch
  applied to everything costs about 1 point off-list, so do not shield all.
- **Candidate change B: survival and bullet avoidance on the mid-table**, the off-list half of the gap, and the same
  direction as the #138 findings (Knight ahead through less bullet damage taken; 3.9 under 95% round survival on 18 of 32
  lost-rounds bots).
- Not measured: engine-side bullet-on-bullet counts (would confirm Nullstride shields directly); its bullet damage taken
  is the indirect read.

Caveats: 8 seeds a bot; the clustered intervals are dominated by opponent spread; a hypothesis from 70 bots of ranks
51-400 may not carry to the rest. The `mid-shieldall` and `mid-shieldall-list` sets are by design disjoint, so the
off-list and on-list figures are not one pooled number.
