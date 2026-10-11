#!/usr/bin/env python3
"""The energy model's runs behind the DrussGT bench report (docs/bench/d0-drussgt-probes.md).

    model_runs.py validate        the model against the bench at three operating points, each
                                  with that run's hit rates and a copy of DrussGT's predictor
                                  (60 battles each; the slow one)
    model_runs.py rates [N]       how far the answer moves when a run is given another run's
                                  hit rates (30 battles)
    model_runs.py sens [N]        what a point of hit rate is worth (60 battles)
    model_runs.py grid1 [N]       the lead-aware rule: opening threshold by gap (40 battles)
    model_runs.py grid2 [N]       the gamble: its floor energy by its power (40 battles)
    model_runs.py press [N]       spending a surplus lead on heavier bullets (30 battles)

Every run but `validate` gives DrussGT our exact power in place of its predictor ("fast").
Seeds are fixed, so a run prints the same lines every time; the session's output is under
data/bench/2026-10-05_hadur-3.5.1_drussgt-probes_cold_analysis/.
"""

import sys

import duel
from duel import evaluate, keep_last, make_lead, show

# Hit rates per shot by bullet power, measured on the bench: Hadur's (H) and DrussGT's (D).
BASE_H, BASE_D = duel.H_RATE, duel.D_RATE                       # the released build's run
L0_H = [(0.10, 0.0799), (1.95, 0.0671)]                          # the lead-aware run
L0_D = [(0.15, 0.1024), (0.75, 0.0900), (1.35, 0.0700), (1.95, 0.0674)]
C0_H = [(0.10, 0.0771), (1.95, 0.0708)]                          # the all-chaff run
C0_D = [(0.15, 0.1068), (1.95, 0.0705)]
H_POOL = [(0.10, 0.078), (1.95, 0.0696)]                         # pooled over the runs
D_POOL = [(0.15, 0.1024), (0.75, 0.094), (1.35, 0.082), (1.95, 0.0693)]

BASE, L0, CHAFF, MIRROR = (duel.POLICIES[k] for k in ('base', 'l0', 'chaff', 'mirror'))


def validate():
    n = 60

    def ev(pol, h, d, seed, fast=True):
        return evaluate(pol, n, seed, h_rate=h, d_rate=d, fast=fast)

    show('base, baseline rates, predictor', ev(BASE, BASE_H, BASE_D, 7, fast=False))
    show('l0, lead-aware rates, predictor', ev(L0, L0_H, L0_D, 7, fast=False))
    show('chaff, all-chaff rates, predictor', ev(CHAFF, C0_H, C0_D, 7, fast=False))
    show('mirror, baseline rates, predictor', ev(MIRROR, BASE_H, BASE_D, 7, fast=False))
    show('l0 pooled', ev(L0, H_POOL, D_POOL, 21))
    show('l0 pooled + keep last shot', ev(keep_last(L0), H_POOL, D_POOL, 21))
    show('base pooled', ev(BASE, H_POOL, D_POOL, 21))
    show('base pooled + keep last shot', ev(keep_last(BASE), H_POOL, D_POOL, 21))


def rates(n=30):
    show('base  fast, base rates', evaluate(BASE, n, 11, fast=True))
    show('l0    fast, base rates', evaluate(L0, n, 11, fast=True))
    show('l0    fast, L0 rates', evaluate(L0, n, 11, h_rate=L0_H, d_rate=L0_D, fast=True))
    show('chaff fast, base rates', evaluate(CHAFF, n, 11, fast=True))
    show('chaff fast, C0 rates', evaluate(CHAFF, n, 11, h_rate=C0_H, d_rate=C0_D, fast=True))


def sens(n=60):
    def ev(pol, h, d, seed=21):
        return evaluate(pol, n, seed, h_rate=h, d_rate=d, trace_ticks=None, fast=True)

    def hl(q):  # Hadur's light-bullet rate
        return [(0.10, q), (1.95, H_POOL[1][1])]

    def dl(q):  # DrussGT's light-bullet rate, its heavier bullets scaled the same way
        f = q / D_POOL[0][1]
        return [(p, r * f) for p, r in D_POOL]

    show('l0 pooled rates', ev(L0, H_POOL, D_POOL))
    for q in (0.068, 0.088, 0.098, 0.108):
        show('l0, Hadur light %.1f%%' % (100 * q), ev(L0, hl(q), D_POOL))
    for q in (0.0824, 0.0924, 0.1124):
        show('l0, Druss light %.2f%%' % (100 * q), ev(L0, H_POOL, dl(q)))
    show('l0, H light 9.8, D 9.24', ev(L0, hl(0.098), dl(0.0924)))
    show('base pooled rates', ev(BASE, H_POOL, D_POOL))
    show('base, Hadur light 9.8%', ev(BASE, hl(0.098), D_POOL))
    show('base, Druss light 9.24%', ev(BASE, H_POOL, dl(0.0924)))


def grid(pol, n):
    return evaluate(pol, n, 5, h_rate=H_POOL, d_rate=D_POOL, trace_ticks=None, fast=True)


def grid1(n=40):
    for open_e in (100.0, 80.0, 70.0, 60.0, 50.0, 40.0):
        for gap in (-10.0, -3.0, 0.0, 3.0, 8.0):
            show('open %3.0f gap %+3.0f' % (open_e, gap), grid(make_lead(open_e=open_e, gap=gap), n))


def grid2(n=40):
    for min_e in (3.0, 10.0, 20.0, 30.0):
        for gamble in (1.15, 1.95, 2.95):
            show('min_e %2.0f gamble %.2f' % (min_e, gamble), grid(make_lead(min_e=min_e, gamble=gamble), n))


def press(n=30):
    for press_lead in (10.0, 20.0, 30.0):
        for press_e in (25.0, 40.0, 60.0):
            for press_p in (0.5, 1.0, 1.95):
                show('press lead>%2.0f ed<%2.0f p=%.2f' % (press_lead, press_e, press_p),
                     grid(make_lead(press_lead=press_lead, press_e=press_e, press_p=press_p), n))


RUNS = {'validate': validate, 'rates': rates, 'sens': sens, 'grid1': grid1, 'grid2': grid2, 'press': press}

if __name__ == '__main__':
    what = sys.argv[1] if len(sys.argv) > 1 else ''
    if what not in RUNS:
        sys.exit(__doc__)
    if len(sys.argv) > 2 and what != 'validate':
        RUNS[what](int(sys.argv[2]))
    else:
        RUNS[what]()
