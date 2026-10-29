#!/usr/bin/env python3
"""Live progress and pre-declared stop rules for queue steps (BENCH-129, BENCH-130).

A queue step can carry a `watch:` line and `stop:` lines (benchqueue.py reads them):

    screen | ./bench-top20.sh ... --set panel.txt --seeds 3 --arms plans/x.arms --out work/x --shuffle-jobs
      after: prep
      watch: field=1217
      stop: fails 30
      stop: dead 8
      stop: skips 40 over 200
      stop: stall 30m
      stop: aa after 20%
      stop: futility s4,s0 below 0.10 after 30%

watch: takes key=value pairs; each defaults from the step's own command, so `watch:` alone works:
    out=DIR      the run's --out (its battles/*/arm-row.tsv rows are read as they land, BENCH-95)
    arms=FILE    the run's --arms file          set=FILE  the --set file (its robots are the panel)
    seeds=N      the run's --seeds              battles=N the run's size (default arms x robots x seeds)
    control=c    the control arm                aa=aa     the A/A copy of the control
    field=N      pairings in the live field: arm differences are then read as APS, the panel sum / N,
                 as the cards' gates read them (tools/shield_s2.py gate)
A step without --arms (team, melee, census) is watched from its step log: battles, failures, skips.
Every --arms step is watched even without a watch: line (progress only; only stop: lines stop anything).

stop: rules, checked every minute while the step runs. Interim looks use Z_STOP = 3.0 (about 0.3%
two-sided a look), not the 95% the gates use, so looking every minute does not turn noise into stops.
    fails N                       N failed battles (crash, broken jar, engine refusing a robot). halt
    dead K                        an arm with K or more battles and not one point scored in any of them:
                                  a jar that does not load or a stale/wrong build. halt
    skips S [over W]              the last W battles (default 100) skip S or more turns a battle on
                                  average: the skipped-turn build-up of PR #331. halt
    stall M                       no battle finished for M (90s, 30m, 1h): a hung step. halt
    aa [after F%]                 the A/A arm's difference from the control outside its band at Z_STOP
                                  (multiarm.aa_check's band, 2.58 there): the bench has an arm defect,
                                  every comparison is void. halt
    futility A[,B..] below X [after F%]
                                  every listed arm's upper bound (Z_STOP) of its projected difference is
                                  under X (APS with field=, else share points): none of them can still pass
                                  the gate. finish. Needs the jobs shuffled (--shuffle-jobs), else the
                                  running mean reads only the first robots of the set.
halt stops the step and the queue: nothing fought is lost (every battle's row stays and BENCH-95 reads it
back), a rerun resumes, and the steps after it wait. finish stops the step as done: the rows so far
become its arms.tsv, so the gate and results PR steps run on them and say the run stopped early.

Python 3 standard library only.
"""
import glob
import json
import math
import os
import re
import shlex
import statistics as st
import sys
import time
from pathlib import Path

HERE = Path(__file__).resolve().parent
sys.path.insert(0, str(HERE.parent / "data" / "tools"))
import multiarm  # noqa: E402

Z_STOP = 3.0
HALT, FINISH = "halt", "finish"
ROW_FILE = "arm-row.tsv"
HEADER = ["arm", "robot", "opponent", "role", "seed", "worker", "position", "ok", "rounds", "score",
          "theirScore", "score_share", "survival_share", "bullet_share", "firsts", "survival", "theirSurvival",
          "bulletDamage", "theirBulletDamage", "skippedTurns", "turnMaxMs", "engineDisables", "duressTicks",
          "hostCpuMean", "errors"]
RATE_WINDOW = 1800


class WatchError(ValueError):
    pass


def parse_duration(text):
    m = re.fullmatch(r"\s*(\d+(?:\.\d+)?)\s*([smh]?)\s*", text)
    if not m:
        raise WatchError(f"bad duration '{text}' (use 90s, 30m or 1h)")
    return float(m.group(1)) * {"": 60, "s": 1, "m": 60, "h": 3600}[m.group(2)]


def parse_fraction(text):
    m = re.fullmatch(r"\s*(\d+(?:\.\d+)?)\s*(%?)\s*", text)
    if not m:
        raise WatchError(f"bad fraction '{text}' (use 25%)")
    v = float(m.group(1)) / (100 if m.group(2) or float(m.group(1)) > 1 else 1)
    if not 0 <= v <= 1:
        raise WatchError(f"fraction '{text}' is not between 0% and 100%")
    return v


class Rule:
    """One `stop:` line."""

    def __init__(self, text):
        self.text = text.strip()
        words = self.text.split()
        if not words:
            raise WatchError("empty stop rule")
        self.kind, rest = words[0], words[1:]
        self.after = 0.0
        if "after" in rest:
            i = rest.index("after")
            if i + 1 >= len(rest):
                raise WatchError(f"stop: {self.text}: 'after' needs a fraction")
            self.after = parse_fraction(rest[i + 1])
            rest = rest[:i] + rest[i + 2:]
        try:
            if self.kind == "fails":
                self.n = int(rest[0]); assert len(rest) == 1 and self.n >= 1
            elif self.kind == "dead":
                self.n = int(rest[0]); assert len(rest) == 1 and self.n >= 1
            elif self.kind == "skips":
                self.limit = float(rest[0])
                self.window = int(rest[2]) if len(rest) == 3 and rest[1] == "over" else 100
                assert len(rest) in (1, 3) and self.window >= 1
            elif self.kind == "stall":
                self.seconds = parse_duration(rest[0]); assert len(rest) == 1
            elif self.kind == "aa":
                assert not rest
            elif self.kind == "futility":
                assert len(rest) == 3 and rest[1] == "below"
                self.arms = [a for a in rest[0].split(",") if a]
                self.bar = float(rest[2])
                assert self.arms
            else:
                raise WatchError(f"unknown stop rule '{self.kind}' (fails, dead, skips, stall, aa, futility)")
        except (IndexError, ValueError, AssertionError):
            raise WatchError(f"bad stop rule '{self.text}'; see benchwatch.py for the forms")
        self.action = FINISH if self.kind == "futility" else HALT


class Spec:
    """A step's `watch:` line, with what it leaves out taken from the step's command."""

    def __init__(self, text, command, home):
        self.home = Path(home)
        flags = command_flags(command)
        kv = {}
        for word in (text or "").split():
            if "=" not in word:
                raise WatchError(f"watch: expected key=value, not '{word}'")
            k, _, v = word.partition("=")
            if k not in ("out", "arms", "set", "seeds", "battles", "control", "aa", "field"):
                raise WatchError(f"watch: unknown key '{k}'")
            kv[k] = v
        self.out = kv.get("out", flags.get("--out"))
        self.arms_file = kv.get("arms", flags.get("--arms"))
        self.set_file = kv.get("set", flags.get("--set"))
        self.control, self.aa = kv.get("control", "c"), kv.get("aa", "aa")
        self.field = int(kv["field"]) if "field" in kv else None
        self.shuffled = "--shuffle-jobs" in flags or flags.get("--job-order") == "shuffled"
        seeds = kv.get("seeds", flags.get("--seeds"))
        self.seeds = int(seeds) if seeds and seeds.isdigit() else None
        self.battles = int(kv["battles"]) if "battles" in kv else None
        self.arm_labels, self.arm_jars, self.panel = [], {}, None
        if self.arms_file and (self.home / self.arms_file).is_file():
            for raw in (self.home / self.arms_file).read_text(encoding="utf-8-sig").splitlines():
                f = [x.strip() for x in raw.split("|")]
                if raw.strip() and not raw.lstrip().startswith("#") and len(f) == 3:
                    self.arm_labels.append(f[0])
                    self.arm_jars[f[0]] = f[2]
        if self.set_file and (self.home / self.set_file).is_file():
            self.panel = sum(1 for raw in (self.home / self.set_file).read_text(encoding="utf-8-sig").splitlines()
                             if raw.strip() and not raw.lstrip().startswith("#"))
        if self.battles is None and self.arm_labels and self.panel and self.seeds:
            self.battles = len(self.arm_labels) * self.panel * self.seeds

    @property
    def multiarm(self):
        return bool(self.arms_file)

    def check(self, rules):
        """Refuse a rule the step cannot be read for, when the plan is read rather than mid-run."""
        for r in rules:
            if r.kind in ("dead", "aa", "futility") and not self.multiarm:
                raise WatchError(f"stop: {r.text}: needs a multi-arm step (--arms)")
            if r.kind == "futility":
                if not self.shuffled:
                    raise WatchError(f"stop: {r.text}: needs --shuffle-jobs on the step, else a partial run "
                                     "reads only the set's first robots")
                missing = [a for a in r.arms if self.arm_labels and a not in self.arm_labels]
                if missing:
                    raise WatchError(f"stop: {r.text}: no arm '{missing[0]}' in {self.arms_file}")
            if r.kind == "aa" and self.arm_labels and self.aa not in self.arm_labels:
                raise WatchError(f"stop: {r.text}: no A/A arm '{self.aa}' in {self.arms_file}")
            files_there = all((self.home / f).is_file() for f in (self.arms_file, self.set_file) if f)
            if r.after and r.kind in ("aa", "futility") and not self.battles and files_there:
                raise WatchError(f"stop: {r.text}: 'after' needs the run's size (battles=N, or --set and --seeds)")


def command_flags(command):
    try:
        words = shlex.split(command)
    except ValueError:
        words = command.split()
    out = {}
    for i, w in enumerate(words):
        if w.startswith("--") and w not in out:
            nxt = words[i + 1] if i + 1 < len(words) else ""
            out[w] = nxt if nxt and not nxt.startswith("--") else ""
    return out


_CACHE = {}


def read_rows(run_dir, since=0.0):
    """Every finished battle's row under RUN/battles, oldest first, with its file time; rows written
    before `since` (the step's start) are battles a resumed run read back. A row file is read again
    only when its time changes, so a 3,000-battle card costs a directory listing a minute."""
    rows = []
    for f in glob.glob(os.path.join(str(run_dir), "battles", "*", ROW_FILE)):
        try:
            mtime = os.path.getmtime(f)
            hit = _CACHE.get(f)
            if hit and hit[0] == mtime:
                text = hit[1]
            else:
                text = Path(f).read_text(encoding="utf-8").rstrip("\r\n")
                _CACHE[f] = (mtime, text)
        except OSError:
            continue
        c = text.split("\t")
        if len(c) != len(HEADER):
            continue
        r = dict(zip(HEADER, c))
        r["_t"], r["_resumed"] = mtime, mtime < since
        rows.append(r)
    rows.sort(key=lambda r: r["_t"])
    return rows


# A battle's line in a step log: duel (score share), melee or team (`battle N/M: `, or the
# melee path's `battle N/M[ baseline] FAILED`, which has no colon after the count).
LOG_BATTLE = re.compile(r"score share [\d.]+%|battle \d+/\d+(?: baseline)?(?:: | FAILED)|placed \d")
LOG_SKIPS = re.compile(r"skipped (?:turns )?(\d+)")


def read_log(step_log):
    """Battles, failures and skips counted from a step's log, for steps with no arm rows."""
    battles, failed, skips = 0, 0, []
    try:
        with open(step_log, encoding="utf-8", errors="replace") as f:
            for line in f:
                if LOG_BATTLE.search(line):
                    battles += 1
                    failed += "FAILED" in line
                    m = LOG_SKIPS.search(line)
                    if m:
                        skips.append(int(m.group(1)))
    except OSError:
        pass
    return battles, failed, skips


def _float(x):
    try:
        v = float(x)
        return v if v == v else None
    except (TypeError, ValueError):
        return None


def summarize(spec, rules, step_log, started, now=None):
    """The step's progress: battles, rate, ETA, failures, skips, per-arm differences, rule states."""
    now = now or time.time()
    s = {"started": started, "updated": now, "elapsed": now - started, "expected": spec.battles,
         "panel": spec.panel, "field": spec.field, "multiarm": spec.multiarm, "arms": [], "aa": None,
         "warnings": []}
    if spec.multiarm:
        rows = read_rows(spec.home / spec.out, since=started) if spec.out else []
        fresh = [r for r in rows if not r["_resumed"]]
        s["battles"], s["resumed"] = len(rows), len(rows) - len(fresh)
        # A failed row from before this step started is a battle Bench fights again, not a new failure.
        s["failed"] = sum(1 for r in fresh if r["ok"] != "true")
        skips = [int(r["skippedTurns"]) for r in fresh if r["ok"] == "true"]
        last_t = max((r["_t"] for r in fresh), default=None)
        recent_t = [r["_t"] for r in fresh if r["_t"] >= now - RATE_WINDOW]
        s["disables"] = sum(int(r["engineDisables"]) for r in fresh)
        s["rows"] = rows
        _arm_table(spec, rows, s, fresh)
    else:
        battles, failed, skips = read_log(step_log)
        s.update(battles=battles, resumed=0, failed=failed, disables=None)
        try:
            last_t = os.path.getmtime(step_log) if battles else None
        except OSError:
            last_t = None
        recent_t = []
        fresh = [None] * battles
    span = min(RATE_WINDOW, now - started)
    if recent_t and span > 0:
        rate = len(recent_t) / span * 3600
    elif fresh and now > started:
        rate = len(fresh) / (now - started) * 3600
    else:
        rate = None
    s["rate"] = rate
    s["eta"] = (spec.battles - s["battles"]) / rate * 3600 if rate and spec.battles else None
    s["fraction"] = s["battles"] / spec.battles if spec.battles else None
    s["last_battle_age"] = now - (last_t if last_t else started)
    s["skips"] = skips
    s["rules"] = [evaluate(r, spec, s) for r in rules]
    if spec.multiarm and not spec.shuffled:
        s["warnings"].append("jobs are in set order (no --shuffle-jobs): running means read the set's first robots")
    for label, jar in spec.arm_jars.items():
        p = spec.home / jar
        if p.is_file() and p.stat().st_mtime < started - 12 * 3600:
            s["warnings"].append(f"arm {label}'s jar {jar} was built {(started - p.stat().st_mtime) / 3600:.0f} h "
                                 "before this step started: check it is not stale")
        elif spec.multiarm and not p.is_file():
            s["warnings"].append(f"arm {label}'s jar {jar} is missing")
    return s


def _arm_table(spec, rows, s, fresh):
    run = multiarm.Run([{k: v for k, v in r.items() if not k.startswith("_")} for r in rows])
    refs = [a for a in (spec.control, spec.aa) if a in run.share]
    scale = (spec.panel / spec.field) if spec.field and spec.panel else None
    for arm in spec.arm_labels or run.arms:
        rs = [r for r in rows if r["arm"] == arm]
        ok = [r for r in rs if r["ok"] == "true"]
        level, _, _ = run.level(arm) if arm in run.share else (None, None, 0)
        e = {"arm": arm, "battles": len(rs), "failed": len(rs) - len(ok), "level": level,
             "skips": st.mean(int(r["skippedTurns"]) for r in ok) if ok else None,
             "fresh": sum(1 for r in fresh if r["arm"] == arm),
             "scored": sum(1 for r in fresh if r["arm"] == arm and r["ok"] == "true"
                           and (_float(r["score_share"]) or 0) > 0), "diff": None}
        arm_refs = [spec.control] if arm == spec.aa else ([] if arm == spec.control else refs)
        if arm_refs and arm in run.share and all(a in run.share for a in arm_refs):
            d = list(run.diffs(arm, arm_refs).values())
            if d:
                m = st.mean(d)
                sd = st.stdev(d) if len(d) > 1 else None
                e.update(diff=m, n=len(d), ci95=multiarm.Z95 * sd / math.sqrt(len(d)) if sd is not None else None,
                         half_stop=Z_STOP * sd / math.sqrt(len(d)) if sd is not None else None, scale=scale)
        s["arms"].append(e)
    if spec.control in run.share and spec.aa in run.share:
        aa = multiarm.aa_check(run, spec.control, spec.aa)
        if aa:
            aa["band_stop"] = aa["band"] * Z_STOP / multiarm.Z99
            s["aa"] = aa


def evaluate(rule, spec, s):
    """{rule, state: waiting|ok|TRIPPED, detail}."""
    out = {"rule": rule.text, "action": rule.action, "state": "ok", "detail": ""}
    frac = s.get("fraction")
    if rule.after and (frac is None or frac < rule.after):
        out["state"] = "waiting"
        out["detail"] = f"checks from {rule.after:.0%} of the battles" + (f" (now {frac:.0%})" if frac is not None else "")
        return out
    k = rule.kind
    if k == "fails":
        out["detail"] = f"{s['failed']} failed of {s['battles']}"
        if s["failed"] >= rule.n:
            out["state"] = "TRIPPED"
    elif k == "dead":
        # Fresh battles only: rows read back from before a rebuilt jar are not this run's evidence.
        dead = [e for e in s["arms"] if e["fresh"] >= rule.n and e["scored"] == 0]
        out["detail"] = ", ".join(f"arm {e['arm']} scored nothing in {e['fresh']} battles (delete its "
                                  f"{spec.out}/battles/*-{e['arm']} rows after fixing the jar, or Bench reads them back)"
                                  for e in dead) or "every arm scoring"
        if dead:
            out["state"] = "TRIPPED"
    elif k == "skips":
        sk = s["skips"]
        if len(sk) < rule.window:
            out.update(state="waiting", detail=f"{len(sk)} of {rule.window} battles to read")
            return out
        recent = st.mean(sk[-rule.window:])
        out["detail"] = f"{recent:.1f} a battle over the last {rule.window} (first {rule.window}: {st.mean(sk[:rule.window]):.1f})"
        if recent >= rule.limit:
            out["state"] = "TRIPPED"
    elif k == "stall":
        age = s["last_battle_age"]
        out["detail"] = f"last battle {age / 60:.0f} min ago"
        if age >= rule.seconds:
            out["state"] = "TRIPPED"
    elif k == "aa":
        aa = s["aa"]
        if not aa or aa.get("n", 0) < 10 or aa["diff"] is None:
            out.update(state="waiting", detail="fewer than 10 robots read in both")
            return out
        out["detail"] = f"aa - {spec.control} {aa['diff']:+.2f} pts over {aa['n']} robots, stop band ±{aa['band_stop']:.2f}"
        if abs(aa["diff"]) > aa["band_stop"]:
            out["state"] = "TRIPPED"
    elif k == "futility":
        parts, beaten = [], 0
        for arm in rule.arms:
            e = next((x for x in s["arms"] if x["arm"] == arm), None)
            if not e or e.get("half_stop") is None or e.get("n", 0) < 10:
                out.update(state="waiting", detail=f"arm {arm}: fewer than 10 robots read")
                return out
            m, h = project(e, spec)
            parts.append(f"{arm} {m:+.2f}, best case {m + h:+.2f}")
            beaten += (m + h) < rule.bar
        unit = "APS" if spec.field and spec.panel else "pts"
        out["detail"] = "; ".join(parts) + f" {unit} vs bar {rule.bar:+.2f}"
        if beaten == len(rule.arms):
            out["state"] = "TRIPPED"
    return out


def project(e, spec):
    """An arm's mean difference and Z_STOP half-width, as panel APS when the field is known."""
    scale = (spec.panel / spec.field) if spec.field and spec.panel else 1.0
    return e["diff"] * scale, e["half_stop"] * scale


def tripped(summary):
    return next((r for r in summary["rules"] if r["state"] == "TRIPPED"), None)


def write_arms_tsv(rows, path):
    """The rows so far as an arms.tsv, as Bench writes one at the end of a run (sorted)."""
    lines = sorted("\t".join(r[h] for h in HEADER) for r in rows)
    tmp = Path(str(path) + ".tmp")
    tmp.write_text("\t".join(HEADER) + "\n" + "\n".join(lines) + ("\n" if lines else ""), encoding="utf-8")
    os.replace(tmp, path)


def hours(sec):
    if sec is None:
        return "-"
    return f"{sec / 3600:.1f} h" if sec >= 3600 else f"{sec / 60:.0f} min"


def clock(t):
    return time.strftime("%H:%M", time.localtime(t))


def render_step(name, spec, s):
    """One watched step as Markdown."""
    exp = s["expected"]
    lines = [f"### {name}", ""]
    head = f"**{s['battles']}" + (f" of {exp}" if exp else "") + " battles**"
    if s["fraction"] is not None:
        head += f" ({s['fraction']:.0%})"
    head += f", {s['failed']} failed"
    if s["resumed"]:
        head += f", {s['resumed']} read back from an earlier run"
    head += f". Running {hours(s['elapsed'])}"
    if s["rate"]:
        head += f", {s['rate']:.0f} battles/h"
    if s["eta"] is not None:
        head += f", about {hours(s['eta'])} left (ends ~{clock(s['updated'] + s['eta'])} PC time)"
    lines.append(head + f". Last battle {hours(s['last_battle_age'])} ago.")
    sk = s["skips"]
    if sk:
        w = min(100, len(sk))
        lines.append(f"Skipped turns a battle: {st.mean(sk):.1f} overall, first {w} {st.mean(sk[:w]):.1f}, "
                     f"last {w} {st.mean(sk[-w:]):.1f}" + (f"; engine disables {s['disables']}" if s.get("disables") is not None else "") + ".")
    if s["arms"]:
        unit = "APS" if spec.field and spec.panel else "pts"
        lines += ["", f"| arm | battles | failed | share | vs control ({unit}) | 95% | stop-rule bound (z {Z_STOP:g}) | skips |",
                  "|---|---:|---:|---:|---:|---:|---:|---:|"]
        for e in s["arms"]:
            diff = ci = bound = "-"
            if e["diff"] is not None:
                sc = e.get("scale") or 1.0
                diff = f"{e['diff'] * sc:+.2f}"
                if e.get("ci95") is not None:
                    ci = f"±{e['ci95'] * sc:.2f}"
                    bound = f"{(e['diff'] - e['half_stop']) * sc:+.2f} .. {(e['diff'] + e['half_stop']) * sc:+.2f}"
                diff += f" ({e['n']} robots)"
            lvl = f"{e['level']:.2f}" if e["level"] is not None else "-"
            skp = f"{e['skips']:.1f}" if e["skips"] is not None else "-"
            lines.append(f"| {e['arm']} | {e['battles']} | {e['failed']} | {lvl} | {diff} | {ci} | {bound} | {skp} |")
        if spec.field and spec.panel:
            lines.append(f"\nAPS = mean difference over the robots read x {spec.panel} panel robots / {spec.field} pairings.")
        aa = s["aa"]
        if aa and aa["diff"] is not None:
            lines.append(f"A/A: {spec.aa} - {spec.control} {aa['diff']:+.2f} pts over {aa['n']} robots; 1% band ±{aa['band']:.2f}"
                         + (" (inside)" if aa["ok"] else " (OUTSIDE: comparisons void)") + ".")
    if s["rules"]:
        lines += ["", "| stop rule | on trip | state | now |", "|---|---|---|---|"]
        for r in s["rules"]:
            lines.append(f"| `{r['rule']}` | {r['action']} | {r['state']} | {r['detail']} |")
        if exp:
            left = exp - s["battles"]
            lines.append(f"\nStopping now would leave {left} battles unrun"
                         + (f" (about {hours(s['eta'])})" if s["eta"] is not None else "")
                         + "; every battle already fought is kept and a rerun resumes from it.")
    for w in s["warnings"]:
        lines.append(f"\n> warning: {w}")
    return "\n".join(lines) + "\n"


def to_json(s):
    return {k: v for k, v in s.items() if k not in ("rows", "skips")} | {
        "skips_mean": st.mean(s["skips"]) if s["skips"] else None,
        "skips_last100": st.mean(s["skips"][-100:]) if s["skips"] else None}
