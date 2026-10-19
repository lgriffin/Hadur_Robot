"""A movement generator: a parametric mover and a plain shooter in pure Python, no Robocode.

The generator writes the same Trace the bench's truth logs give, so a generated style is
fingerprinted and judged by the gun panel exactly as a recorded robot is. It is open loop: it
never sees a bullet, only when the shooter fired (as a Robocode robot sees an energy drop), so
it measures how learnable a movement *pattern* is, not how well it dodges.

Robocode's movement rules are kept: speed up 1 px/tick, slow 2, at most 8; turn at most
10 - 0.75|v| degrees a tick; robots drive backwards when that is the shorter turn; walls stop
a robot dead. The shooter orbits at 500 px with random reversals and fires power 1.9 whenever
its gun is cool (every 14 ticks, the first after 30), as Shadow does.

A style is a genome (a dict, see SPACE): preferred distance and how hard it is held, a
reversal clock (periodic, uniform, Levy or a logistic-map die), coupling of reversals to enemy
shots (probability and phase of the bullet's flight), stops, slow segments, a lateral wobble,
the wall-smoothing stick, and a regime switch between short and long dwells.
"""
import math
import random

from movetrace import FIELD_W, FIELD_H, HALF_BOT, Round, Trace, bullet_speed, norm_angle

# name: (low, high) for floats, list for categories
SPACE = {
    "pref_dist": (250.0, 700.0),
    "dist_gain": (0.0, 1.5),
    "clock": ["periodic", "uniform", "levy", "logistic", "none"],
    "dwell_min": (4.0, 60.0),
    "dwell_span": (0.0, 80.0),
    "levy_alpha": (0.6, 2.5),
    "p_wave": (0.0, 1.0),
    "wave_phase": (0.0, 1.2),
    "p_stop": (0.0, 0.6),
    "stop_len": (2.0, 30.0),
    "p_stop_flip": (0.0, 1.0),
    "v_max": (4.0, 8.0),
    "p_slow": (0.0, 0.6),
    "slow_v": (0.0, 5.0),
    "wobble": (0.0, 0.8),
    "wobble_period": (8.0, 80.0),
    "stick": (40.0, 200.0),
    "p_wall_rev": (0.0, 1.0),
    "p_regime": (0.0, 0.4),
    "regime_scale": (1.0, 5.0),
}

ROUNDS, TICKS = 35, 700
MARGIN = 26.0


def random_genome(rng):
    g = {}
    for k, s in SPACE.items():
        g[k] = rng.choice(s) if isinstance(s, list) else rng.uniform(*s)
    return g


def mutate(g, rng, scale=0.15):
    out = dict(g)
    for k, s in SPACE.items():
        if isinstance(s, list):
            if rng.random() < 0.1:
                out[k] = rng.choice(s)
        elif rng.random() < 0.5:
            lo, hi = s
            out[k] = min(hi, max(lo, out[k] + rng.gauss(0, scale * (hi - lo))))
    return out


def inside(x, y):
    return MARGIN <= x <= FIELD_W - MARGIN and MARGIN <= y <= FIELD_H - MARGIN


def smooth(x, y, a, turn_dir, stick):
    """Rotate travel angle a toward turn_dir until a stick of that length stays in the field.
    Returns (angle, rotated)."""
    for k in range(80):
        if inside(x + stick * math.sin(a), y + stick * math.cos(a)):
            return a, k > 0
        a += turn_dir * 0.05
    return a, True


def step_velocity(v, tgt):
    if v == 0 or (v > 0) == (tgt > 0) and abs(tgt) >= abs(v):
        s = 1.0 if tgt > 0 else -1.0 if tgt < 0 else 0.0
        return s * min(abs(tgt), abs(v) + 1.0) if s else 0.0
    if (v > 0) != (tgt > 0) and tgt != 0:
        if abs(v) > 2:
            return v - math.copysign(2.0, v)
        return math.copysign(max(0.0, 1.0 - abs(v) / 2.0), tgt)
    # same sign, slowing down
    return math.copysign(max(abs(tgt), abs(v) - 2.0), v)


def drive(x, y, h, v, a, speed):
    """One Robocode tick toward travel angle a at speed; returns (x, y, h, v)."""
    diff = norm_angle(a - h)
    sign = 1.0
    if abs(diff) > math.pi / 2:
        diff = norm_angle(diff + math.pi)
        sign = -1.0
    maxturn = math.radians(10 - 0.75 * abs(v))
    h = norm_angle(h + max(-maxturn, min(maxturn, diff)))
    v = step_velocity(v, sign * speed)
    nx, ny = x + v * math.sin(h), y + v * math.cos(h)
    cx = min(FIELD_W - HALF_BOT, max(HALF_BOT, nx))
    cy = min(FIELD_H - HALF_BOT, max(HALF_BOT, ny))
    if cx != nx or cy != ny:
        v = 0.0
    return cx, cy, h, v


class Mover:
    def __init__(self, g, rng):
        self.g, self.rng = g, rng
        self.dir = rng.choice((-1, 1))
        self.logx = rng.uniform(0.1, 0.9)
        self.regime = 1.0
        self.stop_until = -1
        self.flip_after_stop = False
        self.reverse_at = set()
        self.next_rev = self.dwell(0)
        self.speed = g["v_max"]

    def dwell(self, t):
        g, rng = self.g, self.rng
        lo, span = g["dwell_min"] * self.regime, g["dwell_span"] * self.regime
        c = g["clock"]
        if c == "none":
            return 10 ** 9
        if c == "periodic":
            d = lo
        elif c == "uniform":
            d = lo + rng.random() * span
        elif c == "levy":
            d = lo * (1.0 - rng.random()) ** (-1.0 / g["levy_alpha"])
        else:
            self.logx = 4.0 * self.logx * (1.0 - self.logx)
            if not 1e-9 < self.logx < 1 - 1e-9:
                self.logx = rng.uniform(0.1, 0.9)
            d = lo + self.logx * span
        return t + max(2, int(min(d, 250)))

    def reverse(self, t):
        g, rng = self.g, self.rng
        self.next_rev = self.dwell(t)
        self.speed = g["slow_v"] if rng.random() < g["p_slow"] else g["v_max"]
        if rng.random() < g["p_stop"]:
            self.stop_until = t + int(g["stop_len"])
            self.flip_after_stop = rng.random() < g["p_stop_flip"]
        else:
            self.dir = -self.dir

    def on_fire(self, t, flight):
        g, rng = self.g, self.rng
        if rng.random() < g["p_wave"]:
            self.reverse_at.add(t + int(g["wave_phase"] * flight))
        if rng.random() < g["p_regime"]:
            self.regime = g["regime_scale"] if self.regime == 1.0 else 1.0

    def travel(self, t, x, y, sx, sy):
        g = self.g
        if t == self.stop_until and self.flip_after_stop:
            self.dir = -self.dir
        if t >= self.next_rev or t in self.reverse_at:
            self.reverse_at.discard(t)
            self.reverse(t)
        dist = math.hypot(x - sx, y - sy)
        bearing = math.atan2(x - sx, y - sy)
        delta = max(-0.7, min(0.7, g["dist_gain"] * (dist - g["pref_dist"]) / g["pref_dist"]))
        delta += g["wobble"] * math.sin(2 * math.pi * t / g["wobble_period"])
        a = bearing + self.dir * (math.pi / 2 + delta)
        a, hit = smooth(x, y, a, self.dir, g["stick"])
        if hit and self.rng.random() < g["p_wall_rev"] * 0.1:
            self.reverse(t)
        speed = 0.0 if t < self.stop_until else self.speed
        return a, speed


def shooter_angle(t, x, y, mx, my, state, rng):
    if t >= state["next"]:
        state["dir"] = -state["dir"]
        state["next"] = t + rng.randint(10, 50)
    dist = math.hypot(x - mx, y - my)
    bearing = math.atan2(x - mx, y - my)
    delta = max(-0.5, min(0.5, (dist - 500) / 500))
    a = bearing + state["dir"] * (math.pi / 2 + delta)
    return smooth(x, y, a, state["dir"], 120)[0]


def simulate(g, seed=1, rounds=ROUNDS, ticks=TICKS, subject="generated"):
    rng = random.Random(seed)
    out = []
    for _ in range(rounds):
        x, y = rng.uniform(50, 750), rng.uniform(50, 550)
        sx, sy = rng.uniform(50, 750), rng.uniform(50, 550)
        while math.hypot(x - sx, y - sy) < 300:
            sx, sy = rng.uniform(50, 750), rng.uniform(50, 550)
        h, v, sh, sv = rng.uniform(-math.pi, math.pi), 0.0, rng.uniform(-math.pi, math.pi), 0.0
        mover = Mover(g, rng)
        sstate = {"dir": 1, "next": rng.randint(10, 50)}
        heat = 3.0
        rows, fires = [], {}
        for t in range(1, ticks + 1):
            rows.append((t, x, y, h, v, 100.0, sx, sy, sh, sv, 100.0))
            heat = max(0.0, heat - 0.1)
            if heat <= 1e-9 and t > 1:
                fires[t] = 1.9
                heat = 1 + 1.9 / 5
                mover.on_fire(t + 1, math.hypot(x - sx, y - sy) / bullet_speed(1.9))
            a, speed = mover.travel(t, x, y, sx, sy)
            x, y, h, v = drive(x, y, h, v, a, speed)
            sa = shooter_angle(t, sx, sy, x, y, sstate, rng)
            sx, sy, sh, sv = drive(sx, sy, sh, sv, sa, 8.0)
        out.append(Round(rows, fires))
    return Trace(subject, "generated-shooter", out, f"seed{seed}")
