"""Shadow geometry with the engine's order of play, as hadur117.core.move.BulletShadows states it.

A wave: source S, fire tick tw, speed ve; radius after turn k is ve*(k-tw).
Our bullet: origin O, unit direction u, speed vb, fire tick tf; at(k) = O + u*vb*(k-tf).
Certain shadow on turn k: our segment at(k-1)->at(k) inside ring [r(k)-ve, r(k)].
Possible (half weight): our at(k-2)->at(k-1) inside ring [r(k)-ve, r(k)]  (ours moves second)
                        our at(k-1)->at(k)   inside ring [r(k)-2ve, r(k)-ve] (theirs moves second)
A robot standing at R on turn k is met by the bullet's segment of turn k+1.
"""
import numpy as np

HALF = 18.0

def bullet_speed(p):
    return 20.0 - 3.0 * p

def body_samples(S, R, n=241):
    """Bearings (math angle from S) that hit a still 36x36 box centred R, sampled; returns thetas (n,) spanning
    the box's angular extent exactly, and the angular width."""
    cx, cy = R[0] - S[0], R[1] - S[1]
    corners = np.array([[cx - HALF, cy - HALF], [cx - HALF, cy + HALF], [cx + HALF, cy - HALF], [cx + HALF, cy + HALF]])
    c = np.arctan2(cy, cx)
    a = np.arctan2(corners[:, 1], corners[:, 0])
    d = (a - c + np.pi) % (2 * np.pi) - np.pi
    lo, hi = d.min(), d.max()
    th = c + np.linspace(lo, hi, n)
    return th, hi - lo

def hit_turn(S, R, th, ve, tw):
    """First turn on which a wave bullet at bearing th meets the still box at R (segment of that turn crosses it)."""
    cx, cy = R[0] - S[0], R[1] - S[1]
    dx, dy = np.cos(th), np.sin(th)
    # ray-box entry distance (slab method)
    with np.errstate(divide='ignore', invalid='ignore'):
        tx1 = (cx - HALF) / dx; tx2 = (cx + HALF) / dx
        ty1 = (cy - HALF) / dy; ty2 = (cy + HALF) / dy
    tmin = np.maximum(np.minimum(tx1, tx2), np.minimum(ty1, ty2))
    # the bullet's segment of turn k spans [ve*(k-1-tw), ve*(k-tw)]; it first contains tmin on turn:
    k = tw + np.ceil(tmin / ve)
    return k.astype(int)

def cover(S, tw, ve, O, ang, vb, tf, th, khit, kstop=None):
    """For candidate aim angles ang (m,) from origin O fired at tf with speed vb: boolean arrays (m, n) of
    certain and possible cover of bearings th (n,), honouring 'the meeting must come before the body is met'."""
    m, n = ang.size, th.size
    ux, uy = np.cos(ang)[:, None], np.sin(ang)[:, None]
    dx, dy = np.cos(th)[None, :], np.sin(th)[None, :]
    cert = np.zeros((m, n), bool)
    poss = np.zeros((m, n), bool)
    ox, oy = O[0] - S[0], O[1] - S[1]
    kfirst = max(tf + 1, tw + 1)
    klast = int(khit.max())
    if kstop is not None:
        klast = min(klast, int(kstop) - 1)   # our bullet met a robot or a wall on turn kstop: no later meeting
    # ray from S along (dx,dy): point rho*(dx,dy); bullet line: (ox,oy) + s*(ux,uy), s = distance flown.
    # Solve rho*d = o + s*u  ->  cross products.
    den = dx * uy - dy * ux                      # (m, n)
    with np.errstate(divide='ignore', invalid='ignore'):
        rho = (ox * uy - oy * ux) / den          # distance from S along the ray
        s = (ox * dy - oy * dx) / den            # distance flown by our bullet at the meeting point
    ok = np.isfinite(rho) & (rho > 0) & (s > 0)
    for k in range(kfirst, klast + 1):
        r = ve * (k - tw)
        s0, s1 = vb * (k - 1 - tf), vb * (k - tf)   # our segment of turn k in flown distance
        on_k = ok & (s >= s0) & (s <= s1)
        c = on_k & (rho >= r - ve) & (rho <= r) & (k < khit)[None, :]
        cert |= c
        if k - 2 >= tw:   # theirs moves second: our turn-k segment against their turn-(k-1) ring
            poss |= on_k & (rho >= r - 2 * ve) & (rho <= r - ve) & (k <= khit)[None, :]
        if k - 2 >= tf:   # ours moves second: our turn-(k-1) segment against their turn-k ring
            sp0, sp1 = vb * (k - 2 - tf), vb * (k - 1 - tf)
            on_p = ok & (s >= sp0) & (s <= sp1)
            poss |= on_p & (rho >= r - ve) & (rho <= r) & (k < khit)[None, :]
    return cert, poss

def score(cert, poss):
    """Expected share of bearings stopped: certain 1, possible-only 1/2."""
    return cert.mean(axis=-1) + 0.5 * (poss & ~cert).mean(axis=-1)
