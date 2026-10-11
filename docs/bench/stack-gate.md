# Stack gate: D2 to D4 against D1 on the top-10 and weak sets

The D4 build (`hadur2.Hadur 3.8.4`, which carries D2, D3 and D4) against the D1 build
(`hadur2.Hadur 3.8.1`), paired by seed (BENCH-2), on the plan's other two sets:
`roborumble-top10.txt` at 3 seeds and `weak-leak.txt` at 2 seeds, 35 rounds each, cold. Suite
[hadur-bench/druss-stack-gates.txt](../../hadur-bench/druss-stack-gates.txt). Run on 6
October 2026 in the Claude Code container (4 cores, Java 21), one bench at a time. The raw
report is [stack-gate-report.md](stack-gate-report.md).

**Verdict: pass. The stack is ahead on the top 10 by +3.5 ± 3.2 points (30 pairs, 20 of them
up) and level on the weak set (-0.1 ± 0.6, 22 pairs). D3 and D4 merge on this result.**

Pooled intervals are 95% t intervals over the per-battle paired differences.

## Top 10 (3 seeds)

| Opponent | D4 share | D1 share | Paired diff (pp) |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 24.3% ± 4.2 | 17.4% ± 10.7 | +6.9 ± 8.1 |
| jk.mega.DrussGT 3.1.16 | 46.9% ± 14.6 | 40.3% ± 25.0 | +6.6 ± 36.3 |
| oog.mega.saguaro.Saguaro 1.0 | 73.5% ± 7.6 | 72.3% ± 4.8 | +1.2 ± 7.7 |
| aaa.r.ScalarR 0.005h.053-noshield | 35.0% ± 14.4 | 28.2% ± 10.9 | +6.8 ± 5.9 |
| voidious.Diamond 1.8.22 | 49.9% ± 10.5 | 49.4% ± 12.4 | +0.5 ± 2.7 |
| cb.fire.Firestarter 2.0f | 47.5% ± 22.3 | 44.4% ± 16.6 | +3.2 ± 36.6 |
| dsekercioglu.mega.Raven 3.56j8 | 54.4% ± 11.8 | 55.6% ± 6.3 | -1.2 ± 18.0 |
| xander.cat.XanderCat 12.9 | 67.2% ± 47.1 | 57.8% ± 3.0 | +9.5 ± 45.4 |
| lxx.Tomcat 3.68 | 53.5% ± 3.3 | 53.2% ± 10.4 | +0.3 ± 7.8 |
| rsalesc.mega.Knight 0.6.28 | 53.3% ± 3.9 | 51.8% ± 9.9 | +1.5 ± 11.3 |
| **Pooled** | | | **+3.5 ± 3.2** |

## Weak set (2 seeds)

| Opponent | D4 share | D1 share | Paired diff (pp) |
|---|---|---|---|
| vort.Chaser 0.0.3 | 94.9% | 94.4% | +0.5 |
| bbo.RamboT 0.3 | 97.8% | 97.4% | +0.4 |
| PSW.Relentless 0.1 | 98.3% | 98.2% | +0.1 |
| mahrgell.mahrram 1.3 | 79.4% | 79.1% | +0.3 |
| sample.RamFire | 99.7% | 99.8% | -0.1 |
| stelo.MirrorNano 1.4 | 93.2% | 93.1% | +0.1 |
| stelo.MirrorMicro 1.1 | 93.4% | 94.0% | -0.6 |
| zyx.nano.RedBull 1.0 | 93.9% | 95.0% | -1.1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 86.0% | 84.7% | +1.3 |
| demetrix.nano.SledgeHammer 0.22 | 67.3% | 68.3% | -1.0 |
| mz.NanoDeath 2.56 | 68.7% | 69.9% | -1.2 |
| **Pooled** | | | **-0.1 ± 0.6** |

## Reading

- The gain sits on the strong surfers that undercut or match our power (BeepBoop, ScalarR,
  DrussGT), where the lead-aware regime runs most and the D2 to D4 changes act. The weak set,
  where Hadur fires heavy bullets, is untouched, as it should be.
- This measures D2, D3 and D4 together. D2 is already merged (+1.0 ± 3.8 against D1 on
  DrussGT); D3 and D4 were each level against their previous stage on DrussGT
  ([d3-gate.md](d3-gate.md), [d4-gate.md](d4-gate.md)). The plan gates the stack on these
  sets once, and the stack passes.
- Skipped turns on the top 10: 746 against 737. D4's extra slow ticks do not show up as
  skips on this host.

## Caveats

- The jars were built before D5 and T1 merged. No top-10 robot is on D5's shield list, and
  T1 acts only on a team.
- Three seeds per top-10 opponent; per-opponent intervals are wide and only the pooled figure
  is read.
