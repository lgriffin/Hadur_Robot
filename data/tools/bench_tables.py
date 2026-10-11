"""Shared readers for the committed per-battle bench tables in data/bench/ (standard library only)."""

import csv
import math
import re
from statistics import NormalDist

T95 = [12.706, 4.303, 3.182, 2.776, 2.571, 2.447, 2.365, 2.306, 2.262, 2.228,
       2.201, 2.179, 2.160, 2.145, 2.131, 2.120, 2.110, 2.101, 2.093, 2.086,
       2.080, 2.074, 2.069, 2.064, 2.060, 2.056, 2.052, 2.048, 2.045, 2.042]


def t_crit95(df):
    """Two-sided 95% Student t critical value; df up to 30 is rounded down (conservative)."""
    if df < 1:
        return float("nan")
    if df <= 30:
        return T95[int(df) - 1]
    z = NormalDist().inv_cdf(0.975)
    return (z + (z**3 + z) / (4 * df) + (5 * z**5 + 16 * z**3 + 3 * z) / (96 * df**2)
            + (3 * z**7 + 19 * z**5 + 17 * z**3 - 15 * z) / (384 * df**3))


def read_tsv(path):
    with open(path, encoding="utf-8", newline="") as f:
        return list(csv.DictReader(f, delimiter="\t"))


def is_battle_table(rows):
    return bool(rows) and {"build", "opponent", "seed", "ok", "score_share"} <= set(rows[0])


def norm_build(build):
    return re.sub(r"^hadur-?", "", build.strip())


def version_key(build):
    return tuple(int(p) for p in re.findall(r"\d+", build))


def share_pp(row):
    """Score share in percentage points, or None when the battle failed or has no share."""
    if row["ok"].strip().lower() != "true" or not row["score_share"].strip():
        return None
    return 100.0 * float(row["score_share"])


def mean(xs):
    return sum(xs) / len(xs)


def sd(xs):
    if len(xs) < 2:
        return float("nan")
    m = mean(xs)
    return math.sqrt(sum((x - m) ** 2 for x in xs) / (len(xs) - 1))
