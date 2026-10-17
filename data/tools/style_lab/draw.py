"""Figures for the style lab (lab.py draw)."""
import json
import os

import numpy as np
import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt
from matplotlib.colors import LinearSegmentedColormap, TwoSlopeNorm

import fingerprint as fpmod
import generator as gen
import guns
import movetrace

BLUE = LinearSegmentedColormap.from_list("seq", ["#cde2fb", "#86b6ef", "#3987e5", "#1c5cab", "#0d366b"])
DIVERGE = LinearSegmentedColormap.from_list("div", ["#2a78d6", "#f0efec", "#e34948"])
ORANGE = "#eb6834"
INK, INK2, GRID = "#0b0b0b", "#52514e", "#e4e3df"

plt.rcParams.update({"font.size": 10, "axes.edgecolor": INK2, "axes.labelcolor": INK2,
                     "xtick.color": INK2, "ytick.color": INK2, "axes.titleweight": "bold",
                     "axes.spines.top": False, "axes.spines.right": False})


def short(slug):
    name = slug.split("_")[0].split(".")[-1]
    return "Hadur 3.13" if slug.startswith("hadur2") else ("Generated " + slug if slug.startswith("#") else name)


def load(out, name):
    p = os.path.join(out, name)
    if not os.path.exists(p):
        return None
    with open(p) as f:
        return json.load(f)


def axis_label(loadings, k, explained):
    top = sorted(loadings.items(), key=lambda kv: -abs(kv[1][k]))[:3]
    words = ", ".join(("+" if v[k] > 0 else "-") + n for n, v in top)
    return f"Style axis {k + 1} ({explained[k] * 100:.0f}% of spread): {words}"


def style_map(out, measured, space, elites, confirmed):
    fig, (ax, zx) = plt.subplots(1, 2, figsize=(17, 8.2), gridspec_kw={"width_ratios": [1, 1.15]})
    vmin, vmax = 0.08, 0.30
    pts = space.real
    b = np.array([measured[n]["best_gun"] for n in space.names])
    lo, hi = pts.min(axis=0), pts.max(axis=0)
    pad = (hi - lo) * 0.12
    zlo, zhi = lo - pad, hi + pad
    for a, zoom in ((ax, False), (zx, True)):
        if elites:
            xy = np.array([c["xy"] for c in elites["cells"].values()])
            eb = np.array([c["best_gun"] for c in elites["cells"].values()])
            a.scatter(xy[:, 0], xy[:, 1], c=eb, cmap=BLUE, vmin=vmin, vmax=vmax, marker="s",
                      s=60 if not zoom else 120, alpha=0.5, linewidths=0, label="Generated styles (least learnable per cell)")
        sc = a.scatter(pts[:, 0], pts[:, 1], c=b, cmap=BLUE, vmin=vmin, vmax=vmax, s=110 if zoom else 60,
                       edgecolors=INK2, linewidths=0.8, zorder=3, label="Recorded robots")
        if confirmed:
            for k, c in enumerate(confirmed[:5]):
                a.scatter([c["xy"][0]], [c["xy"][1]], marker="*", s=380 if zoom else 200, color=ORANGE,
                          edgecolors="white", linewidths=1.2, zorder=5, label="Best generated styles" if k == 0 else None)
                if zoom:
                    a.annotate(f"S{k + 1}", c["xy"], xytext=(8, -12), textcoords="offset points",
                               color=ORANGE, fontweight="bold", zorder=6)
        a.grid(color=GRID, linewidth=0.6)
        if zoom:
            for (x, y), n in zip(pts, space.names):
                a.annotate(short(n), (x, y), xytext=(5, 4), textcoords="offset points", fontsize=8,
                           color=INK if n.startswith("hadur2") else INK2,
                           fontweight="bold" if n.startswith("hadur2") else "normal", zorder=4)
            a.set_xlim(zlo[0], zhi[0])
            a.set_ylim(zlo[1], zhi[1])
            a.set_title("Close up: the corner every real robot lives in")
        else:
            from matplotlib.patches import Rectangle
            a.add_patch(Rectangle(zlo, *(zhi - zlo), fill=False, edgecolor=INK2, linestyle="--", linewidth=1))
            a.set_title("Whole map: generated styles cover far more ground")
            a.legend(loc="upper right", frameon=True, fontsize=8.5)
        a.set_xlabel(axis_label(space.loadings(), 0, space.explained), fontsize=8.5)
        a.set_ylabel(axis_label(space.loadings(), 1, space.explained), fontsize=8.5)
    cb = fig.colorbar(sc, ax=[ax, zx], shrink=0.75, pad=0.015)
    cb.set_label("Best panel gun's hit rate (lighter is harder to learn; 0.30 means 0.30 or more)")
    fig.suptitle("Style map: each robot's movement fingerprint on two axes", fontweight="bold", fontsize=13)
    fig.savefig(os.path.join(out, "style_map.png"), dpi=125, bbox_inches="tight")
    plt.close(fig)


def panel_heatmap(out, measured, confirmed):
    rows = sorted(measured, key=lambda n: measured[n]["best_gun"])
    labels = [short(n) for n in rows]
    data = [[measured[n]["panel"][g] - measured[n]["panel"]["random"] for g in guns.GUNS] for n in rows]
    real = [measured[n]["real_hit_rate"] - measured[n]["panel"]["random"] for n in rows]
    if confirmed:
        for k, c in enumerate(confirmed[:5]):
            labels.append(f"S{k + 1} (generated)")
            data.append([c["panel"][g] - c["panel"]["random"] for g in guns.GUNS])
            real.append(float("nan"))
    M = np.array([d + [r] for d, r in zip(data, real)]) * 100
    fig, ax = plt.subplots(figsize=(11, 0.32 * len(labels) + 2))
    im = ax.imshow(M, cmap=DIVERGE, norm=TwoSlopeNorm(vmin=-6, vcenter=0, vmax=max(10, np.nanmax(M))), aspect="auto")
    ax.set_xticks(range(len(guns.GUNS) + 1), list(guns.GUNS) + ["real Shadow"], rotation=30, ha="right")
    ax.set_yticks(range(len(labels)), labels)
    for i in range(M.shape[0]):
        for j in range(M.shape[1]):
            if np.isfinite(M[i, j]):
                ax.text(j, i, f"{M[i, j]:+.0f}", ha="center", va="center", fontsize=7.5,
                        color="white" if M[i, j] > 12 else INK)
    ax.set_title("Gun panel: hit rate above a random gun, points (rows sorted hardest to learn first)")
    fig.colorbar(im, ax=ax, shrink=0.6).set_label("percentage points over random")
    ax.spines[:].set_visible(False)
    fig.tight_layout()
    fig.savefig(os.path.join(out, "gun_panel.png"), dpi=130)
    plt.close(fig)


def validation(out, measured):
    names = [n for n in measured if np.isfinite(measured[n]["real_hit_rate"])]
    x = np.array([measured[n]["real_hit_rate"] for n in names]) * 100
    fig, axes = plt.subplots(1, 2, figsize=(12, 5))
    for ax, key, title in ((axes[0], "knn", "k-NN gun alone"), (axes[1], "best", "best gun on the panel")):
        y = np.array([measured[n]["panel"]["knn"] if key == "knn" else measured[n]["best_gun"] for n in names]) * 100
        ax.scatter(x, y, s=60, color="#2a78d6", edgecolors="white", linewidths=1.5)
        for xi, yi, n in zip(x, y, names):
            ax.annotate(short(n), (xi, yi), xytext=(4, 3), textcoords="offset points", fontsize=7.5, color=INK2)
        r = np.corrcoef(x, y)[0, 1] if len(x) > 2 else float("nan")
        rho = np.corrcoef(np.argsort(np.argsort(x)), np.argsort(np.argsort(y)))[0, 1] if len(x) > 2 else float("nan")
        ax.set_title(f"{title}: Pearson {r:.2f}, Spearman {rho:.2f}")
        ax.set_xlabel("Shadow's real hit rate on the robot (%)")
        ax.set_ylabel("Offline hit rate (%)")
        ax.grid(color=GRID, linewidth=0.6)
    fig.suptitle("Does the offline judge agree with a real gun?", fontweight="bold")
    fig.tight_layout()
    fig.savefig(os.path.join(out, "validation.png"), dpi=130)
    plt.close(fig)


def glyph_rows(work, measured, confirmed, picks):
    rows = []
    for n in picks:
        if n in measured:
            tr = movetrace.read_work_one(work, n)
            if tr:
                rows.append((short(n), tr, measured[n]["fingerprint"]))
    for k, c in enumerate((confirmed or [])[:3]):
        tr = gen.simulate(c["genome"], seed=9100 + k)
        rows.append((f"S{k + 1} (generated)", [tr], fpmod.fingerprint([tr])))
    return rows


def glyphs(out, rows):
    fig, axes = plt.subplots(len(rows), 3, figsize=(15, 1.9 * len(rows)), squeeze=False,
                             gridspec_kw={"width_ratios": [5, 1.3, 2]})
    for k, (name, traces, fp) in enumerate(rows):
        r = max(traces[0].rounds[3:] or traces[0].rounds, key=lambda q: q.n)
        f = movetrace.frame(r)
        lat = f["lat"][:600]
        ax = axes[k, 0]
        ax.imshow(lat[None, :], aspect="auto", cmap=DIVERGE, vmin=-8, vmax=8, extent=(0, len(lat), 0, 1))
        for tk in r.fires:
            i = tk - r.t[0]
            if 0 <= i < len(lat):
                ax.plot([i, i], [0.85, 1.0], color=INK, linewidth=0.8)
        ax.set_yticks([])
        ax.set_ylabel(name, rotation=0, ha="right", va="center", fontsize=9, color=INK)
        if k == 0:
            ax.set_title("Barcode: lateral speed tick by tick (blue one way, red the other; ticks on top = enemy shots)", fontsize=9.5)
        ax = axes[k, 1]
        T = np.array(fp["transitions"], dtype=float)
        T = T / max(1.0, T.sum())
        ax.imshow(np.sqrt(T), cmap=BLUE)
        ax.set_xticks([])
        ax.set_yticks([])
        if k == 0:
            ax.set_title("Vocabulary: beat-to-beat moves", fontsize=9.5)
        ax = axes[k, 2]
        imp = np.array(fp.get("reversal_impacts", []))
        if len(imp):
            ax.hist(imp, bins=10, range=(0, 1), color="#3987e5", edgecolor="white", density=True)
        ax.axhline(1.0, color=INK2, linewidth=0.8, linestyle=":")
        ax.set_yticks([])
        if k == 0:
            ax.set_title("Reversals by time to the next bullet (0 = arriving, dotted = no timing)", fontsize=9.5)
        if k < len(rows) - 1:
            ax.set_xticklabels([])
    fig.tight_layout()
    fig.savefig(os.path.join(out, "glyphs.png"), dpi=120)
    plt.close(fig)


GLYPH_PICKS = ["kc.mega.BeepBoop_2.0", "jk.mega.DrussGT_3.1.16", "voidious.Diamond_1.8.22",
               "aaa.r.ScalarR_0.005h.053-noshield", "hadur2.Hadur_3.13", "axeBots.Musashi_2.18",
               "suh.micro.WallPM_1.00", "js.PinBall_1.6"]


def all_figures(out, work):
    from lab import StyleSpace, load_reference
    measured = load(out, "measured.json")
    elites = load(out, "elites.json")
    confirmed = load(out, "confirmed.json")
    confirmed = sorted(confirmed, key=lambda c: c["best_gun"]) if confirmed else None
    space = StyleSpace(measured, load_reference(out))
    style_map(out, measured, space, elites, confirmed)
    panel_heatmap(out, measured, confirmed)
    validation(out, measured)
    glyphs(out, glyph_rows(work, measured, confirmed, GLYPH_PICKS))
