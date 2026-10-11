#!/usr/bin/env python3
"""One-page A3 analysis of a bench run, standard library only.

  python3 data/tools/a3.py make ANALYSIS.json [--kaizen kaizen/FILE.md] [--goal TEXT]
                              [--out-dir docs/bench/a3] [--stem 2026-10-07_label]
  python3 data/tools/a3.py from-tsv FILE.tsv --candidate 3.5.1 --baseline 3.4 --label ll-351v34 [--set NAME]
                              [--conditions conditions.json] [--margin 1.0] > ANALYSIS.json
  python3 data/tools/a3.py register [--dir kaizen] [--write]

make       reads an analysis.json (contract in docs/bench/a3/README.md) and writes an HTML page and a
           markdown twin: the trust gate and the headline, Background, Current condition (with a forest
           plot), Goal, Root cause analysis (a Pareto of opponent losses, plus the 5 Whys read from a
           kaizen file), Countermeasures, Plan and Follow-up. Anything the input does not carry is
           shown as "not measured"; nothing is filled in. The 5 Whys are the kaizen file's, never written here.
from-tsv   an interim bridge: builds an analysis.json from an export_battles.py TSV with the functions in
           analyse.py, for runs that have no analysis.json yet.
register   checks every kaizen/*.md has a "Chain ends at" and exactly one countermeasure kind, and with
           --write regenerates the table in kaizen/README.md between its register markers.
"""

import argparse
import csv
import html
import json
import math
import os
import re
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

SCHEMA = 1
NOT_MEASURED = "not measured"
VITAL_SHARE = 0.8
PARETO_BARS = 12
FOREST_ROWS = 40
KINDS = ("mutant", "bench-run", "harness-change", "set-change", "doc", "none")
GATES = ("TRUSTED", "CAUTION", "NOT_TRUSTED")
VERDICT_WORDS = {
    "down": "DOWN: resolved worse than the baseline",
    "up": "UP: resolved better than the baseline",
    "level": "LEVEL: equivalent within the margin",
    "not-resolved": "NOT RESOLVED: the interval spans zero",
}


def get(d, *path):
    for key in path:
        if not isinstance(d, dict) or key not in d or d[key] is None:
            return None
        d = d[key]
    return d


def num(x, places=2, signed=False):
    if x is None or (isinstance(x, float) and math.isnan(x)):
        return NOT_MEASURED
    return ("%+.*f" if signed else "%.*f") % (places, x)


def pnum(p):
    if p is None or (isinstance(p, float) and math.isnan(p)):
        return NOT_MEASURED
    return "<0.0001" if p < 1e-4 else "%.4f" % p


def interval(ci, places=2):
    if not ci or len(ci) != 2 or any(v is None for v in ci):
        return NOT_MEASURED
    return "[%s, %s]" % (num(ci[0], places, True), num(ci[1], places, True))


def text(x):
    return NOT_MEASURED if x is None or x == "" else str(x)


def pair_text(d, key, places=1):
    c, b = get(d, key, "cand"), get(d, key, "base")
    if c is None and b is None:
        return NOT_MEASURED
    return "%s / %s" % (num(c, places) if c is not None else NOT_MEASURED,
                        num(b, places) if b is not None else NOT_MEASURED)


# ---------------------------------------------------------------- kaizen files

FIELD = re.compile(r"^\s*(?:[-*]\s*)?(?:\*\*)?([A-Za-z][A-Za-z ]*?)(?:\*\*)?\s*:\s*(.*\S)\s*$")


def parse_kaizen(path):
    """A kaizen file as a dict: title, fields, whys (list), sections (name -> lines)."""
    with open(path, encoding="utf-8") as f:
        lines = f.read().splitlines()
    k = dict(path=path, title="", fields={}, whys=[], sections={})
    section = ""
    for line in lines:
        if line.startswith("# ") and not k["title"]:
            k["title"] = line[2:].strip()
            continue
        if line.startswith("## "):
            section = line[3:].strip().lower()
            k["sections"].setdefault(section, [])
            continue
        k["sections"].setdefault(section, []).append(line)
        m = re.match(r"^\s*(\d+)\.\s+(.*\S)\s*$", line)
        if section.startswith("5 whys") and m:
            k["whys"].append(m.group(2))
            continue
        m = FIELD.match(line)
        if m:
            k["fields"].setdefault(m.group(1).strip().lower(), m.group(2).strip())
    return k


def kaizen_problems(k):
    out = []
    if not k["fields"].get("chain ends at"):
        out.append("no 'Chain ends at'")
    kinds = [v for key, v in k["fields"].items() if key == "kind"]
    kind = k["fields"].get("kind", "").strip().strip("`").lower()
    if not kinds:
        out.append("no countermeasure 'Kind'")
    elif kind not in KINDS:
        out.append("kind %r is not one of %s" % (kind, ", ".join(KINDS)))
    if sum(1 for line in k["sections"].get("countermeasure", []) if re.match(r"^\s*(?:[-*]\s*)?(?:\*\*)?kind(?:\*\*)?\s*:", line, re.I)) > 1:
        out.append("more than one countermeasure 'Kind'")
    if not k["whys"]:
        out.append("no numbered 5 Whys")
    return out


# ------------------------------------------------------------------- the model

def clean_opponents(analysis):
    out = []
    for o in analysis.get("opponents") or []:
        if o.get("name") is None:
            continue
        out.append(o)
    return out


def pareto(opponents):
    """Bars of each losing opponent's mean deficit, largest first, the vital few flagged."""
    losers = [(o["name"], -o["diff"], o) for o in opponents
              if isinstance(o.get("diff"), (int, float)) and o["diff"] < 0]
    losers.sort(key=lambda t: -t[1])
    total = sum(v for _, v, _ in losers)
    if total <= 0:
        return dict(total=0.0, bars=[], vital=0, vital_share=0.0, losers=0)
    bars, cum = [], 0.0
    vital = None
    for i, (name, v, o) in enumerate(losers):
        cum += v
        bars.append(dict(label=name, value=v, cumulative=cum / total, holm=o.get("holm"), other=False))
        if vital is None and cum / total >= VITAL_SHARE:
            vital = i + 1
    vital = vital or len(bars)
    vital_share = bars[vital - 1]["cumulative"]
    if len(bars) > PARETO_BARS:
        rest = bars[PARETO_BARS - 1:]
        bars = bars[:PARETO_BARS - 1] + [dict(label="%d other opponents" % len(rest),
                                              value=sum(b["value"] for b in rest),
                                              cumulative=rest[-1]["cumulative"], holm=None, other=True)]
    return dict(total=total, bars=bars, vital=vital, vital_share=vital_share, losers=len(losers))


def significant(o):
    h = o.get("holm")
    return isinstance(h, (int, float)) and h < 0.05


def headline(analysis):
    v = get(analysis, "pooled", "verdict")
    gate = get(analysis, "gate", "verdict")
    base = VERDICT_WORDS.get(v, NOT_MEASURED) if v else NOT_MEASURED
    if gate == "NOT_TRUSTED":
        return "NO VERDICT: the run is not trusted (%s)" % base
    return base


# ------------------------------------------------------------------- SVG plots

def esc(s):
    return html.escape(str(s), quote=True)


def forest_svg(opponents):
    rows = [o for o in opponents if isinstance(o.get("diff"), (int, float))]
    if not rows:
        return None, 0
    rows.sort(key=lambda o: o["diff"])
    shown = rows[:FOREST_ROWS // 2] + rows[-(FOREST_ROWS // 2):] if len(rows) > FOREST_ROWS else rows
    hidden = len(rows) - len(shown)
    reach = max([5.0] + [abs(v) for o in shown for v in (o.get("ci95") or [o["diff"], o["diff"]]) if v is not None])
    reach = min(5.0 * math.ceil(reach / 5.0), 40.0)
    lw, w, rh = 150, 560, 12
    h = rh * len(shown) + 30
    x = lambda v: lw + (max(-reach, min(reach, v)) + reach) / (2 * reach) * (w - lw - 10)
    parts = ['<svg viewBox="0 0 %d %d" role="img" aria-label="Per-opponent paired difference with 95%% intervals" '
             'xmlns="http://www.w3.org/2000/svg">' % (w, h)]
    parts.append('<line x1="%.1f" y1="4" x2="%.1f" y2="%d" class="zero"/>' % (x(0), x(0), h - 20))
    for t in (-reach, 0, reach):
        parts.append('<text x="%.1f" y="%d" class="tick" text-anchor="middle">%+d</text>' % (x(t), h - 6, round(t)))
    for i, o in enumerate(shown):
        y = 8 + i * rh
        name = o["name"] if len(o["name"]) <= 26 else o["name"][:25] + "…"
        parts.append('<text x="%d" y="%d" class="lab" text-anchor="end">%s</text>' % (lw - 6, y + 3, esc(name)))
        ci = o.get("ci95")
        cls = "dot-sig" if significant(o) else "dot"
        if ci and len(ci) == 2 and None not in ci:
            parts.append('<line x1="%.1f" y1="%d" x2="%.1f" y2="%d" class="ci"/>' % (x(ci[0]), y, x(ci[1]), y))
        parts.append('<circle cx="%.1f" cy="%d" r="2.6" class="%s"><title>%s %s</title></circle>' % (
            x(o["diff"]), y, cls, esc(o["name"]), num(o["diff"], 2, True)))
    parts.append("</svg>")
    return "".join(parts), hidden


def pareto_svg(par):
    bars = par["bars"]
    if not bars:
        return None
    w, h, left, bottom = 560, 190, 30, 70
    top = max(b["value"] for b in bars if not b["other"]) if any(not b["other"] for b in bars) else bars[0]["value"]
    bw = (w - left - 30) / len(bars)
    parts = ['<svg viewBox="0 0 %d %d" role="img" aria-label="Pareto of opponent losses" '
             'xmlns="http://www.w3.org/2000/svg">' % (w, h)]
    plot_h = h - bottom - 10
    for i, b in enumerate(bars):
        bh = min(plot_h, plot_h * b["value"] / top)
        x0 = left + i * bw + 4
        cls = "bar-sig" if significant(b) else "bar"
        if b["other"]:
            cls = "bar-other"
        parts.append('<rect x="%.1f" y="%.1f" width="%.1f" height="%.1f" class="%s"><title>%s: %s points%s</title></rect>' % (
            x0, 10 + plot_h - bh, bw - 8, bh, cls, esc(b["label"]), num(b["value"]), " (bar clipped to the tallest opponent)" if b["other"] and b["value"] > top else ""))
        parts.append('<text x="%.1f" y="%d" class="lab" transform="rotate(-35 %.1f %d)" text-anchor="end">%s</text>' % (
            x0 + bw / 2, h - bottom + 14, x0 + bw / 2, h - bottom + 14,
            esc(b["label"] if len(b["label"]) <= 22 else b["label"][:21] + "…")))
    pts = " ".join("%.1f,%.1f" % (left + i * bw + bw / 2, 10 + plot_h * (1 - b["cumulative"])) for i, b in enumerate(bars))
    parts.append('<polyline points="%s" class="cum"/>' % pts)
    y80 = 10 + plot_h * (1 - VITAL_SHARE)
    parts.append('<line x1="%d" y1="%.1f" x2="%d" y2="%.1f" class="thr"/>' % (left, y80, w - 30, y80))
    parts.append('<text x="%d" y="%.1f" class="tick">80%%</text>' % (w - 28, y80 + 3))
    parts.append("</svg>")
    return "".join(parts)


# -------------------------------------------------------------- the page itself

CSS = """
:root{--bg:#fff;--ink:#1d2433;--mute:#5b6577;--line:#cfd6e2;--head:#f1f4f9;--ok:#1f7a45;--warn:#a86a00;--bad:#b3261e;--acc:#2858a8}
@media (prefers-color-scheme:dark){:root{--bg:#14171d;--ink:#e6e9ef;--mute:#9aa4b5;--line:#343c4b;--head:#1d222c;--ok:#5cc88a;--warn:#e0a53a;--bad:#f08a82;--acc:#8ab4f8}}
@page{size:A3 landscape;margin:10mm}
*{box-sizing:border-box}
body{margin:0;background:var(--bg);color:var(--ink);font:13px/1.4 system-ui,-apple-system,"Segoe UI",sans-serif}
.sheet{max-width:1500px;margin:0 auto;padding:16px}
header{display:flex;flex-wrap:wrap;gap:12px;align-items:center;border-bottom:2px solid var(--ink);padding-bottom:8px;margin-bottom:10px}
header h1{font-size:19px;margin:0;flex:1 1 360px}
.gate{font-weight:700;padding:4px 12px;border-radius:4px;color:#fff}
.gate.TRUSTED{background:var(--ok)}.gate.CAUTION{background:var(--warn)}.gate.NOT_TRUSTED{background:var(--bad)}.gate.unknown{background:var(--mute)}
.headline{flex:1 1 100%;font-size:15px;font-weight:600}
.reasons{flex:1 1 100%;margin:0;color:var(--mute);font-size:12px}
.grid{display:grid;grid-template-columns:1fr 1fr;gap:10px}
@media (max-width:900px){.grid{grid-template-columns:1fr}}
.col{display:flex;flex-direction:column;gap:10px;min-width:0}
section{border:1px solid var(--line);border-radius:4px;overflow:hidden;break-inside:avoid}
section>h2{margin:0;padding:3px 8px;background:var(--head);font-size:12px;text-transform:uppercase;letter-spacing:.04em;border-bottom:1px solid var(--line)}
section>div{padding:6px 8px}
table{border-collapse:collapse;width:100%;font-size:12px}
td,th{padding:2px 6px;border-bottom:1px solid var(--line);text-align:left;vertical-align:top}
th{color:var(--mute);font-weight:600;width:34%}
td.n{text-align:right;font-variant-numeric:tabular-nums}
ol,ul{margin:0;padding-left:18px}li{margin:2px 0}
.nm{color:var(--mute);font-style:italic}
.cap{color:var(--mute);font-size:11px;margin:3px 0 0}
svg{width:100%;height:auto;display:block}
svg .lab,svg .tick{font-size:8px;fill:var(--ink)}svg .tick{fill:var(--mute)}
svg .zero{stroke:var(--mute);stroke-dasharray:3 2}svg .ci{stroke:var(--mute);stroke-width:1.2}
svg .dot{fill:none;stroke:var(--acc);stroke-width:1.2}svg .dot-sig{fill:var(--acc)}
svg .bar{fill:none;stroke:var(--acc);stroke-width:1.2}svg .bar-sig{fill:var(--acc)}svg .bar-other{fill:var(--line)}
svg .cum{fill:none;stroke:var(--bad);stroke-width:1.4}svg .thr{stroke:var(--mute);stroke-dasharray:4 3}
footer{margin-top:8px;color:var(--mute);font-size:11px}
@media print{.sheet{max-width:none;padding:0}body{font-size:11px}}
"""


def end_stop(t):
    return t if t.endswith(".") else t + "."


def li(items):
    return "<ul>%s</ul>" % "".join("<li>%s</li>" % i for i in items) if items else '<p class="nm">%s</p>' % NOT_MEASURED


def kv_table(rows):
    body = "".join("<tr><th>%s</th><td>%s</td></tr>" % (esc(k), v) for k, v in rows)
    return "<table>%s</table>" % body


def mval(s):
    """HTML for a value that may be the not-measured marker."""
    return '<span class="nm">%s</span>' % NOT_MEASURED if s == NOT_MEASURED else esc(s)


def background_rows(a):
    run, cond = a.get("run") or {}, get(a, "run", "conditions") or {}
    load = cond.get("hostLoad") or {}
    load_s = "%s / %s / %s %%" % (num(load.get("min"), 0), num(load.get("mean"), 0), num(load.get("max"), 0)) if load else NOT_MEASURED
    return [
        ("Compared", "%s (candidate) against %s (baseline)" % (text(run.get("candidate")), text(run.get("baseline")))),
        ("Opponent set", text(run.get("set"))),
        ("Seeds, rounds", "%s seeds, %s rounds" % (text(run.get("seeds")), text(run.get("rounds")))),
        ("Engine, date", "%s, %s" % (text(run.get("engine")), text(run.get("date")))),
        ("Host", text(cond.get("host"))),
        ("CPU constant", text(cond.get("cpuConstant"))),
        ("Parallel, child heap, child CPUs", "%s, %s, %s" % (text(cond.get("parallel")), text(cond.get("childHeap")), text(cond.get("childCpus")))),
        ("Host CPU min / mean / max", load_s),
        ("Other Robocode JVMs", text(cond.get("otherJvms"))),
    ]


def current_rows(a):
    p = a.get("pooled") or {}
    tost = p.get("tost") or {}
    tost_s = NOT_MEASURED
    if tost:
        tost_s = "margin %s: p=%s, %s" % (num(tost.get("margin"), 1), pnum(tost.get("p")),
                                          "equivalent" if tost.get("equivalent") else "not equivalent")
    t = a.get("trust") or {}
    return [
        ("Pooled difference (points, cand minus base)", num(p.get("diff"), 2, True)),
        ("95% interval, per battle", interval(p.get("ci95"))),
        ("95% interval, opponent-clustered", interval(p.get("clusteredCi95"))),
        ("Pairs, opponents", "%s, %s" % (text(p.get("n")), text(p.get("nOpponents")))),
        ("TOST", tost_s),
        ("Skipped turns per battle (cand / base)", pair_text(t, "skippedPerBattle")),
        ("Duress ticks per battle (cand / base)", pair_text(t, "duressPerBattle")),
        ("Untrusted pairs", text(t.get("untrustedPairs"))),
        ("Near the score floor", NOT_MEASURED if a.get("floorWarning") is None else ("yes: both builds are starved, read the sign with care" if a["floorWarning"] else "no")),
    ]


def goal_text(a, goal):
    if goal:
        return goal
    if a.get("goal"):
        return a["goal"]
    margin = get(a, "pooled", "tost", "margin")
    if margin is not None:
        return "The candidate is no worse than %s points below the baseline (non-inferiority, opponent-clustered), and no opponent is resolved down." % num(margin, 1)
    return NOT_MEASURED


def excluded_items(a):
    out = []
    for e in a.get("excluded") or []:
        out.append("%s: %s (%s of %s battles failed)" % (esc(text(e.get("name"))), esc(text(e.get("reason"))),
                                                         text(e.get("failed")), text(e.get("total"))))
    return out


def kaizen_blocks(k):
    """HTML for the 5 Whys, countermeasure, plan and follow-up of a kaizen file (None -> not measured)."""
    f = k["fields"] if k else {}
    if not k:
        nm = '<p class="nm">no kaizen file given: the 5 Whys are not recorded</p>'
        return nm, nm, nm, nm
    whys = "<ol>%s</ol>" % "".join("<li>%s</li>" % esc(w) for w in k["whys"]) if k["whys"] else '<p class="nm">%s</p>' % NOT_MEASURED
    whys += '<p class="cap">Chain ends at: %s From %s.</p>' % (esc(end_stop(f.get("chain ends at", NOT_MEASURED))), esc(os.path.basename(k["path"])))
    counter = kv_table([("Kind", esc(f.get("kind", NOT_MEASURED))), ("Action", esc(f.get("action", NOT_MEASURED)))])
    plan = kv_table([("Owner", esc(f.get("owner", NOT_MEASURED))), ("Due", esc(f.get("due", NOT_MEASURED))),
                     ("Verified by", esc(f.get("verified by", NOT_MEASURED)))])
    follow = [esc(l.strip()[2:]) for l in k["sections"].get("follow-up", []) if l.strip().startswith("- ")]
    return whys, counter, plan, li(follow)


def render_html(a, k=None, goal=None):
    gate = get(a, "gate", "verdict") if get(a, "gate", "verdict") in GATES else "unknown"
    reasons = get(a, "gate", "reasons") or []
    run = a.get("run") or {}
    title = "A3: %s against %s on %s" % (text(run.get("candidate")), text(run.get("baseline")), text(run.get("set")))
    opps = clean_opponents(a)
    forest, hidden = forest_svg(opps)
    par = pareto(opps)
    psvg = pareto_svg(par)
    whys, counter, plan, follow = kaizen_blocks(k)
    ex = excluded_items(a)
    forest_html = forest or '<p class="nm">%s</p>' % NOT_MEASURED
    cap = "Dots: candidate minus baseline in points, bars: 95%% interval; filled dots passed Holm adjustment (0.05)."
    if hidden:
        cap += " The %d opponents nearest zero are not drawn." % hidden
    if par["bars"]:
        pcap = ("%d opponents lost ground; the first %d make %s of the summed deficit. Filled bars passed Holm. "
                "Each bar is an opponent's own mean deficit in points; wins are not netted off.") % (
                    par["losers"], par["vital"], "%d%%" % round(100 * par["vital_share"]))
        pareto_html = psvg + '<p class="cap">%s</p>' % esc(pcap)
    else:
        pareto_html = '<p class="nm">%s</p>' % ("no opponent has a negative mean difference" if opps else NOT_MEASURED)
    reasons_html = '<p class="reasons">%s</p>' % esc("; ".join(reasons)) if reasons else ""
    return """<!DOCTYPE html>
<html lang="en"><head><meta charset="utf-8"><meta name="viewport" content="width=device-width,initial-scale=1">
<title>%(title)s</title><style>%(css)s</style></head><body><div class="sheet">
<header><h1>%(title)s</h1><span class="gate %(gate)s">%(gate_label)s</span>
<div class="headline">%(headline)s</div>%(reasons)s</header>
<div class="grid"><div class="col">
<section><h2>1 Background</h2><div>%(background)s</div></section>
<section><h2>2 Current condition</h2><div>%(current)s<h3 style="font-size:12px;margin:8px 0 2px">Excluded opponents</h3>%(excluded)s%(forest)s<p class="cap">%(forest_cap)s</p></div></section>
<section><h2>3 Goal</h2><div>%(goal)s</div></section>
</div><div class="col">
<section><h2>4 Root cause analysis</h2><div>%(pareto)s<h3 style="font-size:12px;margin:8px 0 2px">5 Whys</h3>%(whys)s</div></section>
<section><h2>5 Countermeasures</h2><div>%(counter)s</div></section>
<section><h2>6 Plan</h2><div>%(plan)s</div></section>
<section><h2>7 Follow-up</h2><div>%(follow)s</div></section>
</div></div>
<footer>Generated by data/tools/a3.py from analysis.json (schema %(schema)s). Nothing here is recomputed or filled in: &ldquo;not measured&rdquo; means the input did not carry it. The bench observes the robot; it makes no evolution decision.</footer>
</div></body></html>
""" % dict(title=esc(title), css=CSS, gate=gate, gate_label=esc(gate.replace("_", " ")), headline=esc(headline(a)),
           reasons=reasons_html, background=kv_table([(k_, mval(v)) for k_, v in background_rows(a)]),
           current=kv_table([(k_, mval(v)) for k_, v in current_rows(a)]),
           excluded=li(ex) if ex else '<p class="nm">none excluded</p>' if a.get("excluded") is not None else '<p class="nm">%s</p>' % NOT_MEASURED,
           forest=forest_html, forest_cap=esc(cap), goal=esc(goal_text(a, goal)), pareto=pareto_html,
           whys=whys, counter=counter, plan=plan, follow=follow, schema=SCHEMA)


def render_md(a, k=None, goal=None):
    run = a.get("run") or {}
    gate = get(a, "gate", "verdict") or NOT_MEASURED
    out = ["# A3: %s against %s on %s" % (text(run.get("candidate")), text(run.get("baseline")), text(run.get("set"))), "",
           "**Gate: %s.** %s" % (gate.replace("_", " "), headline(a))]
    for r in get(a, "gate", "reasons") or []:
        out.append("- %s" % r)
    out += ["", "## 1 Background", ""]
    out += ["- %s: %s" % (k_, v) for k_, v in background_rows(a)]
    out += ["", "## 2 Current condition", ""]
    out += ["- %s: %s" % (k_, v) for k_, v in current_rows(a)]
    ex = excluded_items(a)
    out += ["- Excluded opponents: %s" % ("; ".join(html.unescape(e) for e in ex) if ex else ("none" if a.get("excluded") is not None else NOT_MEASURED))]
    opps = [o for o in clean_opponents(a) if isinstance(o.get("diff"), (int, float))]
    if opps:
        out += ["", "| Opponent | Difference | 95% interval | Holm | Skips cand / base |", "|---|---|---|---|---|"]
        for o in sorted(opps, key=lambda o: o["diff"])[:FOREST_ROWS]:
            out.append("| %s | %s | %s | %s | %s |" % (o["name"], num(o["diff"], 2, True), interval(o.get("ci95")),
                                                       pnum(o.get("holm")), pair_text(o, "skips", 0)))
        if len(opps) > FOREST_ROWS:
            out.append("")
            out.append("%d more opponents, nearest zero, are not listed." % (len(opps) - FOREST_ROWS))
    out += ["", "## 3 Goal", "", goal_text(a, goal), "", "## 4 Root cause analysis", ""]
    par = pareto(clean_opponents(a))
    if par["bars"]:
        out += ["| Opponent | Mean deficit (points) | Cumulative share | Holm |", "|---|---|---|---|"]
        for b in par["bars"]:
            out.append("| %s | %s | %d%% | %s |" % (b["label"], num(b["value"]), round(100 * b["cumulative"]), pnum(b["holm"]) if not b["other"] else "-"))
        out.append("")
        out.append("The first %d of %d losing opponents make %d%% of the summed deficit; wins are not netted off." % (
            par["vital"], par["losers"], round(100 * par["vital_share"])))
    else:
        out.append(NOT_MEASURED if not opps else "No opponent has a negative mean difference.")
    out += ["", "### 5 Whys", ""]
    if k and k["whys"]:
        out += ["%d. %s" % (i + 1, w) for i, w in enumerate(k["whys"])]
        out += ["", "Chain ends at: %s (from `%s`)." % (end_stop(k["fields"].get("chain ends at", NOT_MEASURED)).rstrip("."), os.path.basename(k["path"]))]
    else:
        out.append("No kaizen file given: the 5 Whys are not recorded.")
    f = k["fields"] if k else {}
    out += ["", "## 5 Countermeasures", "", "- Kind: %s" % f.get("kind", NOT_MEASURED), "- Action: %s" % f.get("action", NOT_MEASURED),
            "", "## 6 Plan", "", "- Owner: %s" % f.get("owner", NOT_MEASURED), "- Due: %s" % f.get("due", NOT_MEASURED),
            "- Verified by: %s" % f.get("verified by", NOT_MEASURED), "", "## 7 Follow-up", ""]
    follow = [l.strip() for l in (k["sections"].get("follow-up", []) if k else []) if l.strip().startswith("- ")]
    out += follow or [NOT_MEASURED]
    out += ["", "_Generated by `data/tools/a3.py`. \"not measured\" means the input did not carry it._", ""]
    return "\n".join(out)


def make(args):
    with open(args.analysis, encoding="utf-8") as f:
        a = json.load(f)
    if a.get("schema") != SCHEMA:
        raise SystemExit("analysis.json schema %r is not %d" % (a.get("schema"), SCHEMA))
    k = parse_kaizen(args.kaizen) if args.kaizen else None
    run = a.get("run") or {}
    stem = args.stem or "%s_%s" % (text(run.get("date")).replace(NOT_MEASURED, "undated"), text(run.get("label")).replace(NOT_MEASURED, "run"))
    os.makedirs(args.out_dir, exist_ok=True)
    paths = []
    for ext, body in (("html", render_html(a, k, args.goal)), ("md", render_md(a, k, args.goal))):
        path = os.path.join(args.out_dir, "%s.%s" % (stem, ext))
        with open(path, "w", encoding="utf-8", newline="\n") as f:
            f.write(body)
        paths.append(path)
    print("\n".join(paths))
    return 0


# --------------------------------------------------------------------- from-tsv

def from_tsv(args):
    import analyse as an
    with open(args.tsv, encoding="utf-8", newline="") as f:
        raw = list(csv.DictReader(f, delimiter="\t"))
    rows = an.load([args.tsv], "score_share")
    cand, base = args.candidate, args.baseline
    per = an.pair(rows, "score_share", cand, base, 100.0)
    if not per:
        raise SystemExit("no pairs for %s and %s" % (cand, base))
    res = an.analyse(per, args.margin)
    names = [r["opponent"] for r in res["rows"]]
    opponents = []
    for r in res["rows"]:
        failed = sum(1 for x in raw if x["opponent"] == r["opponent"] and x.get("ok", "").lower() == "false")
        sk = {b: [float(x["skippedTurns"]) for x in raw if x["opponent"] == r["opponent"] and x["build"] == bb and x.get("ok", "").lower() != "false" and x.get("skippedTurns")]
              for b, bb in (("cand", cand), ("base", base))}
        opponents.append(dict(name=r["opponent"], diff=r["mean"], ci95=[r["mean"] - r["half"], r["mean"] + r["half"]] if not math.isnan(r["half"]) else None,
                              holm=None if math.isnan(r["p_holm"]) else r["p_holm"], bh=None if math.isnan(r["p_bh"]) else r["p_bh"],
                              skips={k_: (sum(v) / len(v) if v else None) for k_, v in sk.items()}, n=r["n"], failed=failed))
    excluded = []
    for opp in sorted({x["opponent"] for x in raw} - set(names)):
        tot = sum(1 for x in raw if x["opponent"] == opp and x["build"] == cand)
        bad = sum(1 for x in raw if x["opponent"] == opp and x["build"] == cand and x.get("ok", "").lower() == "false")
        excluded.append(dict(name=opp, reason="no battle finished on both builds", failed=bad, total=tot))

    def mean(build, col):
        v = [float(x[col]) for x in raw if x["build"] == build and x.get("ok", "").lower() != "false" and x.get(col, "") not in ("", "NaN")]
        return sum(v) / len(v) if v else None

    def mean_share(build):
        v = [float(x["score_share"]) for x in rows if x["build"] == build and x.get("score_share")]
        return 100 * sum(v) / len(v) if v else None

    rounds = next((int(x["rounds"]) for x in raw if x.get("rounds")), None)
    skips = dict(cand=mean(cand, "skippedTurns"), base=mean(base, "skippedTurns"))
    duress = dict(cand=mean(cand, "duressTicks"), base=mean(base, "duressTicks"))
    shares = (mean_share(cand), mean_share(base))
    floor = all(s is not None and s < 35.0 for s in shares)
    reasons = []
    gate = "TRUSTED"
    if rounds:
        worst = max((v for v in skips.values() if v is not None), default=0) / rounds
        if worst > 2.0:
            gate = "NOT_TRUSTED"
            reasons.append("skipped turns average %.1f per round, above the 2.0 trust limit" % worst)
    if gate != "NOT_TRUSTED":
        if floor:
            gate = "CAUTION"
            reasons.append("both builds average under 35%% score share (%.1f and %.1f): a floor effect, read the sign with care" % shares)
        if skips["cand"] is not None and skips["base"] is not None and abs(skips["cand"] - skips["base"]) > 5 and abs(skips["cand"] - skips["base"]) > 0.25 * max(skips["cand"], skips["base"]):
            gate = "CAUTION"
            reasons.append("skipped turns differ between the builds (%.1f against %.1f per battle)" % (skips["cand"], skips["base"]))
        if excluded and len(excluded) > 0.1 * (len(names) + len(excluded)):
            gate = "CAUTION"
            reasons.append("%d of %d opponents have no result" % (len(excluded), len(names) + len(excluded)))
    if not reasons:
        reasons.append("skipped turns %.1f / %.1f per battle (candidate / baseline), within the trust limit" % (skips["cand"] or 0, skips["base"] or 0))
    if excluded and gate == "TRUSTED":
        reasons.append("%d opponent(s) with no result are not in the figures: %s" % (len(excluded), ", ".join(e["name"] for e in excluded)))
    t = an.tost(res["cluster"], args.margin)
    lo, hi = res["cluster"]["lo"], res["cluster"]["hi"]
    verdict = "up" if lo > 0 else "down" if hi < 0 else "level" if t["equivalent"] else "not-resolved"
    cond = {}
    if args.conditions:
        with open(args.conditions, encoding="utf-8") as f:
            c = json.load(f)
        flags = " ".join(c.get("childFlags") or [])
        heap = re.search(r"-Xmx(\S+)", flags)
        cond = dict(host=c.get("host"), cpuConstant=re.sub(r"\D*(\d+).*", r"\1", str(c.get("cpuConstant", ""))) or None,
                    parallel=c.get("parallel"), childHeap=heap.group(1) if heap else "uncapped", childCpus=c.get("childCpus"))
    if raw and "hostCpuMean" in raw[0]:
        vals = [float(x["hostCpuMean"]) for x in raw if x.get("hostCpuMean") not in ("", "NaN", None) and float(x["hostCpuMean"]) >= 0]
        if vals:
            cond["hostLoad"] = dict(min=100 * min(float(x["hostCpuMin"]) for x in raw if x.get("hostCpuMin") not in ("", "NaN", None) and float(x["hostCpuMin"]) >= 0),
                                    mean=100 * sum(vals) / len(vals),
                                    max=100 * max(float(x["hostCpuMax"]) for x in raw if x.get("hostCpuMax") not in ("", "NaN", None)))
        jv = [int(float(x["otherJvms"])) for x in raw if x.get("otherJvms") not in ("", "NaN", None) and float(x["otherJvms"]) >= 0]
        if jv:
            cond["otherJvms"] = max(jv)
    out = dict(schema=SCHEMA,
               run=dict(label=args.label, candidate=cand, baseline=base, set=args.set or os.path.basename(args.tsv),
                        seeds=max(r["n"] for r in res["rows"]), rounds=rounds, engine=args.engine, date=args.date, conditions=cond),
               gate=dict(verdict=gate, reasons=reasons),
               pooled=dict(diff=res["battle"]["mean"], ci95=[res["battle"]["lo"], res["battle"]["hi"]],
                           clusteredCi95=[lo, hi], n=res["pairs"], nOpponents=len(names),
                           tost=dict(margin=args.margin, p=t["p_equivalent"], equivalent=t["equivalent"]), verdict=verdict),
               opponents=opponents, excluded=excluded, floorWarning=floor,
               trust=dict(skippedPerBattle=skips, duressPerBattle=duress, untrustedPairs=None))
    json.dump(out, sys.stdout, indent=1, sort_keys=False, allow_nan=False)
    sys.stdout.write("\n")
    return 0


# --------------------------------------------------------------------- register

START, END = "<!-- register:start -->", "<!-- register:end -->"


def register_table(directory):
    rows, problems = [], []
    for name in sorted(os.listdir(directory)):
        if not name.endswith(".md") or name.lower() == "readme.md":
            continue
        k = parse_kaizen(os.path.join(directory, name))
        for p in kaizen_problems(k):
            problems.append("%s: %s" % (name, p))
        f = k["fields"]
        rows.append("| [%s](%s) | %s | %s | %s | %s |" % (k["title"] or name, name, f.get("kind", "?"), f.get("owner", "?"),
                                                          f.get("due", "?"), f.get("verified by", "open")))
    table = ["| 5 Whys | Kind | Owner | Due | Verified by |", "|---|---|---|---|---|"] + rows
    return "\n".join(table), problems


def register(args):
    table, problems = register_table(args.dir)
    for p in problems:
        print("PROBLEM " + p, file=sys.stderr)
    if args.write:
        path = os.path.join(args.dir, "README.md")
        with open(path, encoding="utf-8") as f:
            body = f.read()
        if START not in body or END not in body:
            raise SystemExit("%s has no %s ... %s markers" % (path, START, END))
        head, rest = body.split(START, 1)
        tail = rest.split(END, 1)[1]
        with open(path, "w", encoding="utf-8", newline="\n") as f:
            f.write(head + START + "\n" + table + "\n" + END + tail)
    else:
        print(table)
    return 1 if problems else 0


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    sub = ap.add_subparsers(dest="cmd", required=True)
    m = sub.add_parser("make", help="write the A3 page and its markdown twin")
    m.add_argument("analysis")
    m.add_argument("--kaizen")
    m.add_argument("--goal")
    m.add_argument("--out-dir", default=os.path.join("docs", "bench", "a3"))
    m.add_argument("--stem")
    t = sub.add_parser("from-tsv", help="build an analysis.json from an export_battles.py TSV")
    t.add_argument("tsv")
    t.add_argument("--candidate", required=True)
    t.add_argument("--baseline", required=True)
    t.add_argument("--label", required=True)
    t.add_argument("--set")
    t.add_argument("--engine")
    t.add_argument("--date")
    t.add_argument("--margin", type=float, default=1.0)
    t.add_argument("--conditions", help="the run's conditions.json")
    r = sub.add_parser("register", help="check the kaizen files and print or write the register table")
    r.add_argument("--dir", default="kaizen")
    r.add_argument("--write", action="store_true")
    args = ap.parse_args(argv)
    return {"make": make, "from-tsv": from_tsv, "register": register}[args.cmd](args)


if __name__ == "__main__":
    sys.exit(main())
