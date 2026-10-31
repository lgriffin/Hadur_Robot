#!/usr/bin/env python3
"""Write a JayLexi arm that starts from learned priors (docs/bench/kitlab-priors.md).

  python3 tools/kitlab_prior_arm.py PRIORS.json TEMPLATE OUT.java [--peak M] [--aim-max A]

TEMPLATE is kitlab/arms/JayLexi-P.tmpl (first-shot table) or JayLexi-PF.tmpl (the whole gun
profile, @GUNF@: 480 x 47 chars, each segment's smoothed prior at peak --profile-max, read as
char / @GUNK@ so the peak weighs M waves). @GUN@ becomes 480 chars, one per gun segment in the
order ((history * 4 + lateral) * 4 + walls) * 5 + distance, each the bin of that segment's
smoothed prior peak (an empty segment takes the whole table's peak); @PEAK@ is M waves' worth,
M / 600. @AIM@ becomes 47 chars, where the field aimed at us over all segments, smoothed, peak A,
and @AIMK@ the divisor that makes the peak 0.01, as large as the head-on term it replaces.
"""
import argparse
import json

import numpy as np

BINS = 47
KERNEL = 1.0 / ((np.arange(BINS)[None, :] - np.arange(BINS)[:, None]) ** 2 + 1)


def java(chars):
    """A Java string literal body: three-digit octal escapes below 256, so a digit after one is
    never read into it (javac reads them after its unicode pass, so no line break can appear), and
    unicode escapes above, which are never a line break."""
    out = ''.join(chr(c) if 32 < c < 127 and chr(c) not in '"\\' else
                  '\\%03o' % c if c < 256 else '\\u%04x' % c for c in chars)
    assert unjava(out) == list(chars), 'string table does not read back'
    return out


def unjava(body):
    """The chars a literal body written by java() holds, read as javac reads it."""
    out, i = [], 0
    while i < len(body):
        if body[i] != '\\':
            out.append(ord(body[i]))
            i += 1
        elif body[i + 1] == 'u':
            out.append(int(body[i + 2:i + 6], 16))
            i += 6
        else:
            j = i + 1
            while j < len(body) and j < i + 4 and body[j] in '01234567':
                j += 1
            out.append(int(body[i + 1:j], 8))
            i = j
    return out


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('priors')
    ap.add_argument('template')
    ap.add_argument('out')
    ap.add_argument('--peak', type=float, default=3)
    ap.add_argument('--aim-max', type=int, default=100)
    ap.add_argument('--opp-max', type=int, default=100, help='per-opponent rows: the peak char (100 is as heavy as the field row)')
    ap.add_argument('--profile-max', type=int, default=120, help='the whole-profile template (JayLexi-PF.tmpl): a peak char')
    a = ap.parse_args()
    d = json.load(open(a.priors))
    gun = np.array(d['gun']).reshape(-1, BINS) @ KERNEL
    overall = int(np.argmax(gun.sum(axis=0)))
    peaks = [int(np.argmax(r)) if r.max() > 0 else overall for r in gun]
    aim = np.array(d['surf']).reshape(-1, BINS).sum(axis=0) @ KERNEL
    aim = np.rint(aim / aim.max() * a.aim_max).astype(int)
    s = open(a.template).read()
    # The whole profile: each segment smoothed, peak --profile-max (an empty one the table's).
    whole = gun.sum(axis=0) / gun.sum(axis=0).max()
    prof = [r / r.max() if r.max() > 0 else whole for r in gun]
    flat = [int(round(v * a.profile_max)) or 1 for r in prof for v in r]
    s = s.replace('@GUNF@', java(flat)).replace('@GUNK@', repr(a.profile_max * 600 / a.peak))
    s = s.replace('@GUN@', java(peaks)).replace('@AIM@', java(aim))
    s = s.replace('@PEAK@', repr(a.peak / 600)).replace('@AIMK@', '%de2' % a.aim_max)
    # Per-opponent rows (JayLexi-PO.tmpl): each recorded opponent's aim at us, smoothed, peak
    # --opp-max, after the field's row; a name whose hash char another shares is left out.
    rows, keys, seen = [list(aim)], [], {}
    for name, m in sorted(d.get('per_bot', {}).items()):
        h = 0
        for ch in name:
            h = (31 * h + ord(ch)) & 0xFFFFFFFF
        seen.setdefault(h & 0xFFFF, []).append((name, m))
    for k, entries in sorted(seen.items()):
        prof = np.array(entries[0][1]).sum(axis=0) @ KERNEL
        if len(entries) > 1 or prof.max() == 0 or k == 0:
            continue
        keys.append(k)
        rows.append(list(np.rint(prof / prof.max() * a.opp_max).astype(int)))
    s = s.replace('@AIMROWS@', java([max(c, 0) for r in rows for c in r])).replace('@NAMES@', java(keys))
    s = s.replace('@CLAMP@', java([max(0, min(BINS - 1, x - 160)) for x in range(400)]))
    open(a.out, 'w').write(s)
    print(f'{a.out}: gun peaks {len(peaks)} (overall bin {overall}), aim peak bin {int(np.argmax(aim))}')


if __name__ == '__main__':
    main()
