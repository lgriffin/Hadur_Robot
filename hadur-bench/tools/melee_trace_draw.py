#!/usr/bin/env python3
"""Draw a melee round from a battle's trace.log.gz (BENCH-213, --melee-trace true).

    python3 tools/melee_trace_draw.py BATTLE_DIR --round N --out PNG [--ticks 150,400,...] [--us hadur117]

Top row: the field at each tick, every robot a dot sized by energy, an arrow from each robot to its
nearest living robot (the robot it most likely shoots), Hadur in red, bullets as short lines.
Bottom: the round's timeline, how many robots had Hadur as their nearest (red) against the mean
over the other robots (grey), Hadur's energy, and the robots alive.
"""
import argparse, gzip, math, os, sys
import matplotlib
matplotlib.use('Agg')
import matplotlib.pyplot as plt
from matplotlib.patches import FancyArrowPatch

def read(path):
    rounds = {}
    with gzip.open(path, 'rt') as f:
        for line in f:
            if not line.startswith('T,'): continue
            parts = line.rstrip('\n').split(',')
            rnd, turn = int(parts[1]), int(parts[2])
            robots = []
            for p in parts[3:-1]:
                name, x, y, h, v, e, alive = p.rsplit(':', 6)
                robots.append((name, float(x), float(y), float(h), float(v), float(e), alive == '1'))
            bullets = []
            for b in parts[-1].split('|') if parts[-1] else []:
                owner, x, y, h, pw = b.rsplit(':', 4)
                bullets.append((owner, float(x), float(y), float(h), float(pw)))
            rounds.setdefault(rnd, []).append((turn, robots, bullets))
    return rounds

def nearest(robots):
    alive = [r for r in robots if r[6]]
    out = {}
    for r in alive:
        best = None
        for o in alive:
            if o is r: continue
            d = math.hypot(o[1] - r[1], o[2] - r[2])
            if best is None or d < best[0]: best = (d, o[0])
        if best: out[r[0]] = best
    return out

def short(name):
    base = name.split(' ')[0].split('.')[-1]
    return base[:12]

def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('battle'); ap.add_argument('--round', type=int, required=True); ap.add_argument('--out', required=True)
    ap.add_argument('--ticks', default=''); ap.add_argument('--us', default='hadur117'); ap.add_argument('--field', default='1000x1000')
    a = ap.parse_args()
    W, H = (int(v) for v in a.field.split('x'))
    turns = read(os.path.join(a.battle, 'trace.log.gz'))[a.round]
    us = next(r[0] for r in turns[0][1] if r[0].startswith(a.us))
    # Timeline.
    t_x, load_us, load_other, energy, alive_n = [], [], [], [], []
    death = None
    for turn, robots, bullets in turns:
        nr = nearest(robots)
        alive = [r for r in robots if r[6]]
        me = next((r for r in robots if r[0] == us), None)
        if me is None: continue
        if not me[6]:
            if death is None: death = turn
            break
        if len(alive) < 3: break
        counts = {r[0]: 0 for r in alive}
        for n, (d, who) in nr.items(): counts[who] += 1
        t_x.append(turn); load_us.append(counts[us]); energy.append(me[5]); alive_n.append(len(alive))
        others = [c for n, c in counts.items() if n != us]
        load_other.append(sum(others) / len(others))
    ticks = [int(t) for t in a.ticks.split(',') if t] or [max(1, int(t_x[-1] * f)) for f in (0.2, 0.5, 0.8)] + [t_x[-1]]
    fig = plt.figure(figsize=(4.2 * len(ticks), 9))
    gs = fig.add_gridspec(2, len(ticks), height_ratios=[1.35, 1])
    by_turn = {t: (r, b) for t, r, b in turns}
    for i, tk in enumerate(ticks):
        tk = min(by_turn, key=lambda t: abs(t - tk))
        robots, bullets = by_turn[tk]
        ax = fig.add_subplot(gs[0, i]); ax.set_xlim(0, W); ax.set_ylim(0, H); ax.set_aspect('equal')
        ax.set_title(f'tick {tk}', fontsize=11); ax.set_xticks([]); ax.set_yticks([])
        nr = nearest(robots)
        for owner, x, y, h, pw in bullets:
            dx, dy = math.sin(h) * 25, math.cos(h) * 25
            ax.plot([x - dx, x + dx], [y - dy, y + dy], color='#c58a00' if owner != us else '#d62728', lw=0.8, alpha=0.7)
        for name, x, y, h, v, e, al in robots:
            if not al: continue
            mine = name == us
            ax.scatter([x], [y], s=40 + 2.2 * e, color='#d62728' if mine else '#4a6fa5', edgecolor='black', zorder=3, alpha=0.9)
            ax.annotate(f'{short(name)} {e:.0f}', (x, y), textcoords='offset points', xytext=(0, 9), ha='center', fontsize=7,
                        color='#8b0000' if mine else '#222')
            if name in nr:
                tx, ty = next((r[1], r[2]) for r in robots if r[0] == nr[name][1])
                ax.add_patch(FancyArrowPatch((x, y), (tx, ty), arrowstyle='-|>', mutation_scale=9, lw=1.1 if nr[name][1] == us else 0.6,
                                             color='#d62728' if nr[name][1] == us else '#999', alpha=0.9 if nr[name][1] == us else 0.6,
                                             shrinkA=6, shrinkB=8, zorder=2))
        load = sum(1 for n, (d, who) in nr.items() if who == us)
        ax.text(10, 12, f'{load} robots have Hadur as nearest', fontsize=8, color='#8b0000')
    ax = fig.add_subplot(gs[1, :])
    ax.step(t_x, load_us, where='post', color='#d62728', lw=1.6, label='robots whose nearest is Hadur')
    ax.step(t_x, load_other, where='post', color='#777', lw=1.2, label='same, mean over the other robots')
    ax.set_ylabel('nearest load'); ax.set_xlabel('tick'); ax.set_ylim(0, max(load_us + [3]) + 0.5)
    ax2 = ax.twinx(); ax2.plot(t_x, energy, color='#2a9d8f', lw=1.2, label="Hadur's energy"); ax2.set_ylabel('energy'); ax2.set_ylim(0, 105)
    for tk in ticks: ax.axvline(tk, color='#bbb', lw=0.7, ls=':')
    if death: ax.axvline(death, color='#d62728', lw=1.2, ls='--'); ax.text(death, ax.get_ylim()[1] * 0.92, ' Hadur dies', color='#8b0000', fontsize=9)
    h1, l1 = ax.get_legend_handles_labels(); h2, l2 = ax2.get_legend_handles_labels()
    ax.legend(h1 + h2, l1 + l2, loc='upper left', fontsize=8, framealpha=0.9)
    mean_us = sum(load_us) / len(load_us); mean_o = sum(load_other) / len(load_other)
    fig.suptitle(f'{os.path.basename(os.path.dirname(a.battle.rstrip("/")))} round {a.round + 1}: Hadur is someone\'s nearest robot '
                 f'{mean_us:.2f} times a tick on average, the other robots {mean_o:.2f}', fontsize=12)
    fig.tight_layout(rect=(0, 0, 1, 0.96))
    fig.savefig(a.out, dpi=130)
    print(f'{a.out}: round {a.round} ticks {t_x[0]}-{t_x[-1]}, death {death}, mean load Hadur {mean_us:.2f} others {mean_o:.2f}')

if __name__ == '__main__':
    main()
