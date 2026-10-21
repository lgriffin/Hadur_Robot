# AES early cloud read: can a refit of the surf's danger blend rank better?

2026-10-19. Base 3.14hjsw with the AES-1 recorder (`build-ablation.sh heatjit,swall,aesrec`,
3.14hjswar), 48 of the 432 flat x learning bots (every ninth of `aes-flat-learning.txt`), 1 seed
(1071), 35 rounds, cloud (parallel 3). 41 bots left records; the other 7 were met without the
three-option surf (shield mode or no shots). Reports: `2026-10-19_aes-cloud-fit-family.md` and
`2026-10-19_aes-cloud-fit-view.md` (`data/tools/aes_rank.py`, CMA-ES 2,000 evaluations a half).

## What the waves look like

44,238 real waves matched to their bullet (99.8% of real-wave records; 70% of all enemy bullets).
Re-blend parity at today's weights: **100%**.

| | Share of waves |
|---|---|
| The option taken was hit | 9.5% |
| Each option, taken or not (ccw / stop / cw) | 12.6% / 13.8% / 13.0% |
| Some option was hit | 36.9% |
| Every option with a plan was hit (trapped) | 0.1% |

The surf already does better than a blind pick among its three options (9.5% against about 13%),
and almost every hit was avoidable: some other option would have missed (avoidable damage is 99%
of damage taken on these waves).

## The refit

| Groups | Fit on | In-sample cut | Held-out change in damage per wave (95% CI) | Held-out avoidable cut |
|---|---|---|---|---|
| family (10 parameters) | half A | 7.2% | -0.008 (-0.042..+0.031) | 1.3% |
| family | half B | 7.6% | -0.040 (-0.127..+0.022) | 5.2% |
| view (16 parameters) | half A | 11.6% | -0.023 (-0.045..-0.000) | 3.7% |
| view | half B | 8.0% | -0.016 (-0.063..+0.021) | 2.1% |

Kill 1's bar is a 15% held-out cut with the interval clear of zero. Every row misses it, and the
two halves' fitted parameters disagree in direction on half of them (normal view, flatteners,
distancing base, next-wave weight, uncertain factor).

## Reading

- The best any blend did even on the bots it was fitted to is a 7-12% cut, and that in-sample
  figure is an upper bound on held-out: it shrinks as overfitting falls with more bots. More data
  can firm up a 2-5% held-out cut; it cannot lift it to 15%.
- So the terms the surf already computes do not carry the signal to rank the three options much
  better against these guns. The learning guns aim where Hadur's danger model also thinks it is
  safe; reweighting the same views moves the miss around rather than removing it. The remaining
  lever, if there is one, is new information about the enemy gun, not search over Hadur's blend.
- This is 41 bots at one seed, so it is an early read, not the PC verdict.
