# Flattener off against 3.10 on the PC: the cloud's +1.0 does not hold (`flat-311`)

2026-10-08. Plan `hadur-bench/plans/flat-311.queue` (PR #160 branch, `claude/project-thread-nxui5r`), run with `.\queue.ps1 run flat-311`. Candidate is 3.10nf (`build-ablation.sh --ref v3.10 flat`: 3.10 with the flattener off), baseline is the released 3.10 jar, paired by seed. Local bench host (Threadripper PRO 9965WX, 48 logical cores), Robocode 1.11.1, 35 rounds, CPU constant 1488498, parallel 12, child CPUs 2, child heap 2G. No RoboRumble clients. The three steps took 324 s, 1070 s and 173 s.

Raw rows: `data/bench/2026-10-08_hadur-{gungap,top20,tail}-310nf-v310-pc-local_cold.tsv` (and `_rounds`). Generated reports: [gungap](2026-10-08_gungap-310nf-v310-pc.md), [top 20](2026-10-08_top20-310nf-v310-pc.md), [tail](2026-10-08_tail-310nf-v310-pc.md). The cloud read this re-tests is in `docs/bench/plan-3.11.md` on the PR #160 branch.

## Verdict

**The flattener-off change does not pass its gate.** On the 30 simple-gun bots, on fresh seeds, the pooled difference is +0.31, with an interval that spans 0, against the cloud's +1.0 ± 0.75. The top 20 reads -1.06, also unresolved but pointing the wrong way, with two large single-bot drops. The tail is level. By the plan's own rule (steps 2 and 3 decide: level there, ship it off; down on the top 20, keep it on) the flattener stays on. The +1.0 should be treated as a three-seed result that did not replicate.

| Step | Set | Opponents x seeds | 3.10nf minus 3.10 (clustered 95%) | Read | Trust gate |
|---|---|---|---|---|---|
| gungap-nf | 30 simple-gun bots (`gungap-311.txt`) | 30 x 8 (engine seeds 101 to 108) | **+0.31** [-0.60, +1.22] | not resolved | NOT_TRUSTED: 27% of pairs untrusted, up to 1 other JVM |
| top20-nf | RoboRumble top 20 | 20 x 5 | **-1.06** [-2.98, +0.87] | not resolved | CAUTION, 12 of 100 pairs untrusted |
| tail-nf | weak tail (`tail-39.txt`) | 39 x 4 | **+0.29** [-0.09, +0.67] | level (TOST equivalent within 1.0) | CAUTION, 32 of 156 untrusted, up to 1 other JVM |

## The simple-gun bots (step 1)

- Pooled +0.31 [-0.60, +1.22] over 240 pairs. Without the 60 pairs that had duress on either side it reads +0.48 [-0.41, +1.38]. Neither interval is above 0, so the pass condition fails.
- 16 of 30 bots are up (cloud: 21 of 30). No bot is significant after Holm or BH. The enemy's hit rate barely moved: 0.1689 with the flattener on, 0.168 off (cloud 0.165 to 0.153). Bullet damage taken fell from 945 to 922 a battle (cloud 984 to 917).
- The cloud's number came from 3 seeds on a 4-core host with a different CPU constant; this is 8 fresh seeds on the pinned bench. The two do not contradict a small real gain of around +0.3 to +0.5, but they do not show one.
- The step was flagged NOT_TRUSTED: 64 of 480 battles had duress ticks, and the host reported one other Java process in 122 of the gungap battles. I started none; I could not identify it from the run. The trusted-only reading above (+0.48) is the better figure and does not change the conclusion.

## The top 20 (step 2)

- Pooled -1.06 [-2.98, +0.87] over 100 pairs, 10 of 20 bots up. The non-inferiority test at margin 1.0 fails (p 0.52), so "level" is not shown.
- The drops are concentrated: Dookious -12.08 ± 9.82 and GresSuffurd -8.00 ± 6.74 (both unadjusted p about 0.03, neither significant after Holm or BH). These are top-20 bots, where the plan expects the flattener to earn its keep. At 5 seeds this is suggestive, not proven.
- Hit rate against Hadur: 0.0877 on, 0.0887 off; bullet damage taken 1103 on, 1137 off.

## The tail (step 3)

Level, +0.29 [-0.09, +0.67], 21 of 39 up; their hit rate is 0.0599 either way.

## What follows

- Keep the flattener on in 3.11 unless a bigger run on the 30 bots resolves a gain. `analyse.py --plan` gives the seed count needed to resolve a gain of this size; it was not run here.
- If the aim is to cut what simple guns do to Hadur, a change that switches the flattener off only against a bot whose hits show no learning (the plan's fallback rule) is the one worth testing; the top-20 drops say the switch must be per bot, not global.
- Nothing here changes `hadur-core` or `hadur-robot`, and no release was cut.
