# Plan: the road from 87.7 to 90 APS

Leigh's plan of 2026-10-11, "Hadur: the road from 87.7 to 90 APS"
([the doc](https://claude.ai/code/artifact/fb45cb47-79d4-4d03-894e-1fb7b2f0e0b9)), in brief, and
where each of its steps stands in the repo.

## The finding

The 2.3 APS to 90 is in one place: bullet shielding. Nullstride 2.3.3 shields 287 robots that
are in the rumble and scores 96.9% live against them where Hadur 3.12 scores 84.2%; matching it
there is worth +2.99 APS (87.72 to 90.71). On the 172 opponents both have been benched shielding,
Hadur's shield mode scores 84.9% and Nullstride's 97.4%, so the opponents are shieldable and the
shield is what falls short. The decompiled jar shows one design with seven differences:

| | Hadur 3.12 (`ShieldMode`) | Nullstride (`jd.d`, `jd.br`) | Switch |
|---|---|---|---|
| Firing at the enemy while shielding | between shields, and at tick 32 of a quiet enemy | never | SHIELD-8 `hold` |
| What the predictors learn from | bullets that hit us | every enemy bullet, intercepted ones too | SHIELD-9 `learn` |
| Learned offset | running mean | most frequent error within 1e-5, of up to 500 | SHIELD-10 `mode` |
| Leaving inside a round | five exits | none | SHIELD-11 `stay` |
| Leaving for the battle | about 370 damage (SHIELD-6) | 150 damage, or no shot by tick 300 | SHIELD-11 `stay` |
| Heading bases | four head-on | three of those plus a body-turn base | SHIELD-12 `turn` |
| List | 102 entries, name and version | 298 name hashes, any version | step 3 |

## The steps

| Step | What | State |
|---|---|---|
| 1 | Ablate toward Nullstride's shield, one difference at a time, on the bots both list, 8 seeds, against 3.12 | Switches in `shieldmode.ShieldDesign` (SHIELD-8 to SHIELD-12, shipped off); `build-ablation.sh shold`, `slearn`, `smode`, `sstay`, `sturn`, `snull`. Cloud screen at 3 seeds on the 97 listed bots; PC run `plan90` steps `sh` to `sn` on the 89 both list |
| 2 | Classify the bullets that still get through | `SB` record per hit (first, unshielded, missed, nowave, off); `data/tools/shield_leaks.py` reads them with the zero-damage rounds and the paired difference |
| 3 | Sweep the rest of Nullstride's list with the best step-1 build in shield-all, D5 rule | `shield-ns-sweep.txt` (198 robots, from PR #190); PC step `s2` |
| 4 | Census the result, 4 seeds, against 3.12 | after step 3 |
| 5 | Diamond 1.8.22 and ScalarR no-shield as census subjects | `census-311-diamond.txt`, `census-311-scalarr.txt`; PC steps `diamond`, `scalarr` |
| 6 | Fix the `otherJvms` count | BENCH-89: own battles read before and after `jps`, gone or descendant pids left out |

## Nullstride's list

PR #190 recovered the list from the jar: 287 rumble robots (`hadur-bench/shield-nullstride.txt`),
89 also on Hadur's list (`shield-null-both.txt`, step 1) and 198 not (`shield-ns-sweep.txt`,
step 3). Before it landed, a proxy from the Nullstride census (it dealt under 2 points of bullet
damage a round in at least one battle) found 177 of those 198 with 3 false positives, so the
damage signature reads the list well. The cloud step-1 screen ran on Hadur's 97 listed bots;
`shield_leaks.py --set shield-null-both.txt` reads it on the 89.
