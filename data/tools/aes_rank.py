#!/usr/bin/env python3
"""AES: refit the surf's danger blend offline against the bullets the engine fired (docs/plan-aes.md).

    python3 data/tools/aes_rank.py join WORKDIR [WORKDIR ...] --out DATA.npz [--jobs 8]
    python3 data/tools/aes_rank.py fit DATA.npz --set hadur-bench/census-312.txt --out REPORT \\
        [--bots SETFILE] [--groups family|view] [--evals 3000] [--seed 1]

A bench run of an `aesrec` build (hadur-bench/build-ablation.sh) leaves, per battle directory
WORKDIR/battles/<slug>-<seed>/, a hadur.log with one AES record per wave at the surf's first
three-option rating of it (AES-1, docs/requirements.md) and a truth.log.gz with every enemy bullet
as it first appears. `join` matches each record on a real wave to the bullet the enemy fired on it
(the bullet appears in the truth log one tick after the wave's fire time, at the same power) and
marks each option hit or missed by whether the bullet's heading lies inside the option's plan
interval. The bullet's heading is fixed once fired, so for that wave this is a fact, not a
simulation; what it cannot see is how the enemy's gun would learn from a different choice later.

`fit` rebuilds the surf's choice from the logged terms with a parameter vector, checks that at
today's weights it picks the option the surf took (parity), then searches the weights with CMA-ES
for the blend that takes the least bullet damage on the waves, each opponent weighted equally. It
splits the opponents into two halves by rank (alternating), fits on each and scores on the other,
and reports the held-out change in damage on these waves with a bootstrap interval over opponents.

The blend, per option, as SurfMover.waveDanger computes it with the parameters at their base
values (in brackets):
    views  = sum_g m_g * a_g / sum_g m_g * b_g       (view-group multipliers m_g [1]; the fallback
                                                      danger when no view had data)
    first  = (alpha * hitRate * (1 - shadowed) + views) * damage^beta * u^uncertain
             * tti^-gamma * B^q / B * escape          (alpha [1], beta [1], u [0.5], gamma [1], B [2.5])
    total  = first + nu * (loggedTotal - loggedFirst) (nu [1]: the next wave's cheapest danger)
The option taken is the stop when its total is the least or tied, else clockwise when it is below
counter-clockwise, else counter-clockwise (SurfMover.surf).

`join` needs only the standard library to parse; saving the data set and `fit` need numpy.
"""

import argparse
import gzip
import json
import math
import os
import re
import sys
from collections import defaultdict
from multiprocessing import Pool

FIXED = 11  # AesRecord.FIXED
LOW, HIGH, FIRST, HIT_RATE, SHADOWED, VIEW_SCORE, DAMAGE, UNCERTAIN, TTI, DIST_Q, ESCAPE = range(FIXED)
VIEWS = ["simple", "normal", "recent1", "recent2", "recent3", "recent4", "recent5", "recent6",
         "lightFlattener", "flattener", "flattener2"]
FAMILIES = {"simple": [0], "normal": [1], "recent": [2, 3, 4, 5, 6, 7], "light": [8], "flattener": [9, 10]}
DIR_RE = re.compile(r"^(?P<slug>.+)-(?P<seed>\d+)(?P<baseline>-baseline)?$")
SLUG_RUN = re.compile(r"[^A-Za-z0-9._-]+")


# ----------------------------------------------------------------------------- parsing (stdlib)

def num(s):
    return float("nan") if s == "nan" else float(s)


def parse_record(line):
    """One AES line (anything before 'AES,' is the harvester's prefix) as a dict, or None.

    Keys: round, tick, fire, power, firing, sx, sy, chosen, views, options (3 entries, each None
    or (total, terms list)).
    """
    i = line.find("AES,")
    if i < 0:
        return None
    p = line[i:].rstrip("\n").split(",")
    try:
        rec = {"round": int(p[1]), "tick": int(p[2]), "fire": int(p[3]), "power": float(p[4]),
               "firing": p[5] == "1", "sx": float(p[6]), "sy": float(p[7]),
               "chosen": int(p[8]), "views": int(p[9])}
        width = FIXED + 2 * rec["views"] + 1
        at, options = 10, []
        for _ in range(3):
            if p[at] == "0":
                options.append(None)
                at += 1
                continue
            total = num(p[at + 1])
            terms = [num(x) for x in p[at + 2:at + 2 + width]]
            if len(terms) != width:
                return None
            options.append((total, terms))
            at += 2 + width
        if at != len(p):
            return None
        rec["options"] = options
        return rec
    except (IndexError, ValueError):
        return None


def read_spawns(path):
    """{round: [(turn, power, heading)]}: each enemy bullet as it first appears in the truth log.

    The F record names the turn and power; the new bullet is the enemy bullet in that turn's T
    record that no earlier F took, nearest the enemy (as census_classify.read_truth reads it).
    """
    spawns = defaultdict(list)
    try:
        f = gzip.open(path, "rt", encoding="utf-8")
    except OSError:
        return spawns
    with f:
        last_eb, last_e, taken = [], None, set()
        try:
            for line in f:
                if line.startswith("T,"):
                    p = line.rstrip("\n").split(",")
                    if len(p) < 13:
                        continue
                    last_e = (float(p[8]), float(p[9]))
                    last_eb, taken = [], set()
                    if len(p) > 13 and p[13]:
                        for b in p[13].split(" "):
                            if b.startswith("E:"):
                                q = b.split(":")
                                if len(q) >= 4:
                                    last_eb.append((float(q[1]), float(q[2]), float(q[3])))
                elif line.startswith("F,"):
                    p = line.rstrip("\n").split(",")
                    if len(p) < 5:
                        continue
                    r, t, power = int(p[1]), int(p[2]), float(p[4])
                    best, bd = None, 80.0
                    for k, (bx, by, _) in enumerate(last_eb):
                        if k in taken or last_e is None:
                            continue
                        d = math.hypot(bx - last_e[0], by - last_e[1])
                        if d < bd:
                            best, bd = k, d
                    if best is not None:
                        taken.add(best)
                        spawns[r].append((t, power, last_eb[best][2]))
        except (EOFError, OSError, ValueError):
            pass  # a truncated log keeps what was read
    return spawns


def inside(angle, low, high):
    """PlanInterval.contains: angle in [low, high], the short way round."""
    mid = (low + high) / 2
    a = angle - mid
    a = (a + math.pi) % (2 * math.pi) - math.pi + mid
    return low <= a <= high


def bullet_damage(power):
    return 4 * power + max(0.0, 2 * (power - 1))


def join_battle(dirpath):
    """[(rec, heading, power)] for every record on a real wave matched to its bullet, and counts."""
    spawns = read_spawns(os.path.join(dirpath, "truth.log.gz"))
    used = set()
    out, stats = [], {"records": 0, "real": 0, "matched": 0, "bullets": sum(len(v) for v in spawns.values())}
    log = os.path.join(dirpath, "hadur.log")
    if not os.path.exists(log):
        return out, stats
    with open(log, encoding="utf-8", errors="replace") as f:
        for line in f:
            if "AES," not in line:
                continue
            rec = parse_record(line)
            if rec is None:
                continue
            stats["records"] += 1
            if not rec["firing"]:
                continue
            stats["real"] += 1
            best = None
            for k, (t, power, heading) in enumerate(spawns.get(rec["round"], ())):
                if (rec["round"], k) in used or abs(power - rec["power"]) > 0.05:
                    continue
                dt = abs(t - rec["fire"] - 1)
                if dt <= 1 and (best is None or dt < best[0]):
                    best = (dt, k, power, heading)
            if best is None:
                continue
            used.add((rec["round"], best[1]))
            stats["matched"] += 1
            out.append((rec, best[3], best[2]))
    return out, stats


def battle_id(name):
    """(opponent slug, seed, baseline) of a battle directory's name, or None."""
    m = DIR_RE.match(name)
    return None if m is None else (m.group("slug"), int(m.group("seed")), m.group("baseline") is not None)


def _join_job(args):
    dirpath, name = args
    rows, stats = join_battle(dirpath)
    return name, rows, stats


def join(workdirs, out, jobs):
    import numpy as np
    tasks = []
    for w in workdirs:
        base = os.path.join(w, "battles")
        for name in sorted(os.listdir(base)):
            bid = battle_id(name)
            if bid is None or bid[2]:
                continue  # baseline battles are another build's choices
            tasks.append((os.path.join(base, name), name))
    bots, cols = {}, defaultdict(list)
    totals = defaultdict(int)
    views = None
    with Pool(max(1, jobs)) as pool:
        for name, rows, stats in pool.imap_unordered(_join_job, tasks, chunksize=4):
            for k, v in stats.items():
                totals[k] += v
            slug = battle_id(name)[0]
            bi = bots.setdefault(slug, len(bots))
            for rec, heading, power in rows:
                if views is None:
                    views = rec["views"]
                if rec["views"] != views:
                    continue
                width = FIXED + 2 * views + 1
                present, hit, total, terms = [], [], [], []
                for o in rec["options"]:
                    if o is None:
                        present.append(False)
                        hit.append(False)
                        total.append(float("inf"))
                        terms.append([float("nan")] * width)
                    else:
                        present.append(True)
                        hit.append(inside(heading, o[1][LOW], o[1][HIGH]))
                        total.append(o[0])
                        terms.append(o[1])
                cols["bot"].append(bi)
                cols["damage"].append(bullet_damage(power))
                cols["chosen"].append(rec["chosen"])
                cols["present"].append(present)
                cols["hit"].append(hit)
                cols["total"].append(total)
                cols["terms"].append(terms)
    if not cols["bot"]:
        sys.exit("no matched records: is this a run of an aesrec build?")
    names = sorted(bots, key=bots.get)
    np.savez_compressed(out, bot=np.array(cols["bot"], dtype=np.int32),
                        damage=np.array(cols["damage"], dtype=np.float32),
                        chosen=np.array(cols["chosen"], dtype=np.int8),
                        present=np.array(cols["present"], dtype=bool),
                        hit=np.array(cols["hit"], dtype=bool),
                        total=np.array(cols["total"], dtype=np.float64),
                        terms=np.array(cols["terms"], dtype=np.float32),
                        bots=np.array(names), views=np.array(views))
    print("battles %d, records %d, on real waves %d, matched to a bullet %d of %d bullets; %d opponents -> %s"
          % (len(tasks), totals["records"], totals["real"], totals["matched"], totals["bullets"], len(names), out))


# ----------------------------------------------------------------------------- the blend (numpy)

def groups_of(mode, views):
    if mode == "view":
        return [[i] for i in range(views)]
    return [idx for idx in FAMILIES.values() if max(idx) < views]


class Data:
    """The joined waves, with the view parts summed per group."""

    def __init__(self, path, mode):
        import numpy as np
        z = np.load(path)
        self.bot = z["bot"]
        self.damage = z["damage"].astype(np.float64)
        self.chosen = z["chosen"].astype(np.int64)
        self.present = z["present"]
        self.hit = z["hit"]
        self.total = z["total"]
        self.bots = list(z["bots"])
        views = int(z["views"])
        t = z["terms"].astype(np.float64)
        self.fixed = t[:, :, :FIXED]
        a, b = t[:, :, FIXED:FIXED + views], t[:, :, FIXED + views:FIXED + 2 * views]
        self.fallback = t[:, :, FIXED + 2 * views]
        self.groups = groups_of(mode, views)
        self.a = np.stack([a[:, :, g].sum(axis=2) for g in self.groups], axis=2)
        self.b = np.stack([b[:, :, g].sum(axis=2) for g in self.groups], axis=2)
        self.next = np.where(self.present, self.total - self.fixed[:, :, FIRST], 0.0)
        self.mode = mode

    def subset(self, mask):
        import copy
        d = copy.copy(self)
        for k in ("bot", "damage", "chosen", "present", "hit", "total", "fixed", "fallback", "a", "b", "next"):
            setattr(d, k, getattr(self, k)[mask])
        return d


def base_params(n_groups):
    """The parameter vector at today's weights: group log-multipliers (the first group fixed at 1,
    so n_groups - 1 of them), log alpha, beta, gamma, log(B - 1), log nu, logit u."""
    return [0.0] * (n_groups - 1) + [0.0, 1.0, 1.0, math.log(1.5), 0.0, 0.0]


def param_names(d):
    g = list(FAMILIES) if d.mode == "family" else VIEWS
    g = g[:len(d.groups)]
    return ["m_" + x for x in g[1:]] + ["log_alpha", "beta", "gamma", "log_B_minus_1", "log_nu", "logit_u"]


def bounds(n_groups):
    """The box the search stays in (each parameter is clipped to it): group log-multipliers
    within e^-5..e^5, alpha e^-5..e^3, beta 0..4, gamma 0..3, B 1.05..8.4, nu e^-5..e^3, u 0.02..0.98."""
    k = n_groups - 1
    return ([-5.0] * k + [-5.0, 0.0, 0.0, -3.0, -5.0, -4.0],
            [5.0] * k + [3.0, 4.0, 3.0, 2.0, 3.0, 4.0])


def clip(d, x):
    import numpy as np
    lo, hi = bounds(len(d.groups))
    return np.clip(np.asarray(x, dtype=float), lo, hi)


def totals(d, x):
    """Each option's rebuilt total under parameters x (clipped to the box); +inf where the option had no plan."""
    import numpy as np
    x = clip(d, x)
    k = len(d.groups) - 1
    m = np.concatenate([[1.0], np.exp(np.asarray(x[:k]))])
    alpha, beta, gamma = math.exp(x[k]), x[k + 1], x[k + 2]
    big_b, nu = 1 + math.exp(x[k + 3]), math.exp(x[k + 4])
    u = 1 / (1 + math.exp(-x[k + 5]))  # logit 0 -> 0.5
    f = d.fixed
    num_ = (d.a * m).sum(axis=2)
    den = (d.b * m).sum(axis=2)
    with np.errstate(invalid="ignore", divide="ignore"):
        views = np.where(np.isnan(d.fallback), num_ / den, d.fallback)
    views = np.nan_to_num(views, nan=0.0)
    first = ((alpha * f[:, :, HIT_RATE] * (1 - f[:, :, SHADOWED]) + views)
             * np.power(f[:, :, DAMAGE], beta) * np.where(f[:, :, UNCERTAIN] > 0, u, 1.0)
             / np.power(f[:, :, TTI], gamma) * np.power(big_b, f[:, :, DIST_Q]) / big_b * f[:, :, ESCAPE])
    t = first + nu * d.next
    return np.where(d.present, np.nan_to_num(t, nan=np.inf), np.inf)


def pick(t):
    """SurfMover.surf's choice from the three totals (ordinals 0 ccw, 1 stop, 2 cw)."""
    import numpy as np
    ccw, stop, cw = t[:, 0], t[:, 1], t[:, 2]
    take_stop = (stop <= ccw) & (stop <= cw)
    return np.where(take_stop, 1, np.where(cw < ccw, 2, 0))


def per_bot(d, choice):
    """{bot: (waves, damage taken on them, avoidable damage)} for a choice per wave."""
    import numpy as np
    rows = np.arange(len(choice))
    hit = d.hit[rows, choice]
    missable = (d.present & ~d.hit).any(axis=1)
    taken = d.damage * hit
    avoid = taken * missable
    nb = int(d.bot.max()) + 1 if len(d.bot) else 0
    w = np.bincount(d.bot, minlength=nb)
    return w, np.bincount(d.bot, weights=taken, minlength=nb), np.bincount(d.bot, weights=avoid, minlength=nb)


def objective(d, x):
    """Mean over opponents of bullet damage taken per wave on these waves."""
    import numpy as np
    w, taken, _ = per_bot(d, pick(totals(d, x)))
    keep = w > 0
    return float((taken[keep] / w[keep]).mean())


def cmaes(f, x0, sigma, evals, seed):
    """A plain (mu/mu_w, lambda) CMA-ES (Hansen's tutorial, arXiv:1604.00772), minimising f."""
    import numpy as np
    rng = np.random.default_rng(seed)
    n = len(x0)
    lam = 4 + int(3 * math.log(n))
    mu = lam // 2
    w = np.log(mu + 0.5) - np.log(np.arange(1, mu + 1))
    w /= w.sum()
    mueff = 1 / (w ** 2).sum()
    cc = (4 + mueff / n) / (n + 4 + 2 * mueff / n)
    cs = (mueff + 2) / (n + mueff + 5)
    c1 = 2 / ((n + 1.3) ** 2 + mueff)
    cmu = min(1 - c1, 2 * (mueff - 2 + 1 / mueff) / ((n + 2) ** 2 + mueff))
    damps = 1 + 2 * max(0, math.sqrt((mueff - 1) / (n + 1)) - 1) + cs
    chin = math.sqrt(n) * (1 - 1 / (4 * n) + 1 / (21 * n * n))
    m = np.array(x0, dtype=float)
    pc, ps, cov = np.zeros(n), np.zeros(n), np.eye(n)
    best_x, best_f = m.copy(), f(m)
    used, gen = 1, 0
    while used + lam <= evals:
        vals, vecs = np.linalg.eigh(cov)
        vals = np.maximum(vals, 1e-20)
        z = rng.standard_normal((lam, n))
        y = z * np.sqrt(vals) @ vecs.T
        xs = m + sigma * y
        fs = np.array([f(x) for x in xs])
        used += lam
        order = np.argsort(fs)
        if fs[order[0]] < best_f:
            best_f, best_x = float(fs[order[0]]), xs[order[0]].copy()
        ysel = y[order[:mu]]
        ymean = w @ ysel
        m = m + sigma * ymean
        inv_sqrt = vecs @ np.diag(1 / np.sqrt(vals)) @ vecs.T
        ps = (1 - cs) * ps + math.sqrt(cs * (2 - cs) * mueff) * inv_sqrt @ ymean
        gen += 1
        hsig = np.linalg.norm(ps) / math.sqrt(1 - (1 - cs) ** (2 * gen)) / chin < 1.4 + 2 / (n + 1)
        pc = (1 - cc) * pc + hsig * math.sqrt(cc * (2 - cc) * mueff) * ymean
        cov = ((1 - c1 - cmu) * cov + c1 * (np.outer(pc, pc) + (1 - hsig) * cc * (2 - cc) * cov)
               + cmu * (ysel.T * w) @ ysel)
        sigma *= math.exp((cs / damps) * (np.linalg.norm(ps) / chin - 1))
    return best_x, best_f, used


def bootstrap(diffs, reps=2000, seed=7):
    import numpy as np
    rng = np.random.default_rng(seed)
    diffs = np.asarray(diffs)
    means = [diffs[rng.integers(0, len(diffs), len(diffs))].mean() for _ in range(reps)]
    return float(diffs.mean()), float(np.percentile(means, 2.5)), float(np.percentile(means, 97.5))


def read_ranks(path):
    """{battle slug: rank} from a set file's 'name | rankN-bandB | jar' lines (slug = jar stem)."""
    out = {}
    with open(path, encoding="utf-8") as f:
        for line in f:
            if line.startswith("#") or "|" not in line:
                continue
            p = [x.strip() for x in line.split("|")]
            m = re.search(r"rank(\d+)", p[1]) if len(p) > 1 else None
            stem = p[2][:-4] if len(p) > 2 and p[2].endswith(".jar") else SLUG_RUN.sub("_", p[0])
            out[stem] = int(m.group(1)) if m else 10 ** 6
    return out


def fit(args):
    import numpy as np
    d = Data(args.data, args.groups)
    if args.bots:
        keep = set(read_ranks(args.bots))
        idx = np.array([b in keep for b in d.bots])
        d = d.subset(idx[d.bot])
    x0 = np.array(base_params(len(d.groups)))
    names = param_names(d)
    lines = ["# AES refit: %s" % os.path.basename(args.data), "",
             "Groups: %s (%d), %d waves, %d opponents, CMA-ES %d evaluations per half, seed %d."
             % (args.groups, len(d.groups), len(d.bot), len(set(d.bot.tolist())), args.evals, args.seed), ""]

    # Parity: today's weights must pick what the surf picked.
    base_pick = pick(totals(d, x0))
    parity = float((base_pick == d.chosen).mean())
    lines += ["## Parity", "", "Re-blend at today's weights picks the option the surf took on **%.2f%%** of waves "
              "(gate: 99%%; below it the record or the re-blend is wrong and nothing below counts)." % (100 * parity), ""]
    if parity < 0.99:
        sys.exit("parity %.2f%% is below the 99%% gate; the record or the re-blend is wrong, no fit written" % (100 * parity))

    # Bot halves: alternate by rank.
    ranks = read_ranks(args.set) if args.set else {}
    present = sorted(set(d.bot.tolist()))
    order = sorted(present, key=lambda i: (ranks.get(d.bots[i], 10 ** 6), d.bots[i]))
    half = np.zeros(len(d.bots), dtype=int)
    for j, i in enumerate(order):
        half[i] = j % 2
    if len(present) < 2:
        sys.exit("fewer than two opponents with waves; no halves to fit")
    taken_bot = lambda dd, x: per_bot(dd, pick(totals(dd, x)))

    rows, fitted, diffs_all = [], {}, []
    for train_half in (0, 1):
        train = d.subset(half[d.bot] == train_half)
        test = d.subset(half[d.bot] != train_half)
        xb, fb, used = cmaes(lambda x: objective(train, x), x0, args.sigma, args.evals, args.seed + train_half)
        xb = clip(d, xb)
        fitted["AB"[train_half]] = xb.tolist()
        wb, tb0, ab0 = taken_bot(test, x0)
        _, tb1, ab1 = taken_bot(test, xb)
        keep = wb > 0
        per0, per1 = tb0[keep] / wb[keep], tb1[keep] / wb[keep]
        av0, av1 = ab0[keep] / wb[keep], ab1[keep] / wb[keep]
        mean_d, lo, hi = bootstrap(per1 - per0)
        diffs_all += list(per1 - per0)
        rows.append((train_half, objective(train, x0), fb, keep.sum(), per0.mean(), per1.mean(), av0.mean(), av1.mean(),
                     mean_d, lo, hi))

    lines += ["## Held-out result", "",
              "Damage taken per wave on the recorded waves, mean over the held-out opponents (each equal); "
              "avoidable = the picked option was hit and another would have missed.", "",
              "| Fit on | Train today | Train fitted | Held-out bots | Held-out today | Held-out fitted | Avoidable today | Avoidable fitted | Change (95% CI) |",
              "|---|---|---|---|---|---|---|---|---|"]
    for th, f0, fb, nb, p0, p1, a0, a1, md, lo, hi in rows:
        lines.append("| half %s | %.4f | %.4f | %d | %.4f | %.4f | %.4f | %.4f | %+.4f (%+.4f..%+.4f) |"
                     % ("AB"[th], f0, fb, nb, p0, p1, a0, a1, md, lo, hi))
    cut = [(1 - r[7] / r[6]) if r[6] > 0 else 0 for r in rows]
    lines += ["", "Avoidable damage cut on held-out bots: half A fit %.1f%%, half B fit %.1f%%." % (100 * cut[0], 100 * cut[1]), ""]
    kill = min(cut) < 0.15 or any(r[10] >= 0 for r in rows)
    sign = [np.sign(np.array(fitted["A"]) - x0), np.sign(np.array(fitted["B"]) - x0)]
    lines += ["**Kill 1: %s.** (Stops if either half cuts avoidable damage by under 15%% or its interval reaches 0.)"
              % ("FAILS, close AES" if kill else "passes, build MOVE-22"), ""]

    lines += ["## Fitted parameters", "", "| Parameter | Today | Fit on A | Fit on B | Same direction |", "|---|---|---|---|---|"]
    for i, n in enumerate(names):
        lines.append("| %s | %.3f | %.3f | %.3f | %s |" % (n, x0[i], fitted["A"][i], fitted["B"][i],
                                                       "yes" if sign[0][i] == sign[1][i] else "no"))
    lines += ["", "Group multipliers and alpha, nu are log values (0 = today); B = 1 + exp(log_B_minus_1) "
              "(today 2.5); u = 1 / (1 + exp(-logit_u)) (today 0.5).", ""]

    # One fit on everything, for the switch.
    xall, fall, _ = cmaes(lambda x: objective(d, x), x0, args.sigma, args.evals, args.seed + 7)
    xall = clip(d, xall)
    lines += ["## Fit on all opponents (for MOVE-22)", "",
              "Objective today %.4f, fitted %.4f (in sample)." % (objective(d, x0), fall), ""]
    lines += ["| Parameter | Value |", "|---|---|"] + ["| %s | %.4f |" % (n, v) for n, v in zip(names, xall)]
    os.makedirs(os.path.dirname(os.path.abspath(args.out)), exist_ok=True)
    with open(args.out + ".md", "w", encoding="utf-8") as f:
        f.write("\n".join(lines) + "\n")
    with open(args.out + ".json", "w", encoding="utf-8") as f:
        json.dump({"groups": args.groups, "names": names, "today": x0.tolist(), "fit_A": fitted["A"],
                   "fit_B": fitted["B"], "fit_all": xall.tolist(), "parity": parity, "kill1": bool(kill)}, f, indent=1)
    print("\n".join(lines))


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.split("\n\n")[0])
    sub = ap.add_subparsers(dest="cmd", required=True)
    j = sub.add_parser("join")
    j.add_argument("work", nargs="+")
    j.add_argument("--out", required=True)
    j.add_argument("--jobs", type=int, default=4)
    fp = sub.add_parser("fit")
    fp.add_argument("data")
    fp.add_argument("--set", help="set file whose rankN tags order the opponents for the halves")
    fp.add_argument("--out", required=True, help="report path without extension (.md and .json written)")
    fp.add_argument("--bots", help="set file naming the opponents to fit on (others are left out)")
    fp.add_argument("--groups", choices=["family", "view"], default="family")
    fp.add_argument("--evals", type=int, default=3000)
    fp.add_argument("--sigma", type=float, default=0.5)
    fp.add_argument("--seed", type=int, default=1)
    a = ap.parse_args(argv)
    if a.cmd == "join":
        join(a.work, a.out, a.jobs)
    else:
        fit(a)


if __name__ == "__main__":
    main()
