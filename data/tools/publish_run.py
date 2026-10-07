#!/usr/bin/env python3
"""Publish a bench run's analysis to the project site (GitHub Pages, the gh-pages branch).

    publish_run.py run --work DIR --set FILE [--label L] [--kind solo|team|melee]
                       [--build X --baseline-build Y] [--kaizen FILE] [--goal TEXT]
    publish_run.py backfill [--bench-dir data/bench] [--only SUBSTR]
    publish_run.py index

Common options: --site-dir DIR writes into that directory instead of the gh-pages branch
(no git); --no-push commits to a temporary gh-pages worktree and does not push; --dry-run
builds everything in a temporary directory and writes nothing to the repository or the
branch. --repo defaults to the repository this script lives in.

`run` takes a finished work directory (the bench's --out): it exports the raw rows, runs
analyse.py's paired analysis, renders the A3 one-pager (a3.py) and adds the run to the
site's registry under bench/. `backfill` does the same for every committed data/bench TSV
that holds a paired candidate/baseline score share. `index` only rebuilds bench/index.html
(site/build.sh --publish calls it so the site's bench pages keep the site's style).

The site's layout, all under bench/ so site/build.sh can preserve it:

    bench/index.html          latest run and the history table, newest first
    bench/runs.json           the registry the index is built from
    bench/trend.svg           docs/bench/trend.svg when the repository has it
    bench/runs/ID/index.html  the A3 one-pager;  analysis.json, a3.md, report.md beside it

Melee runs have no per-opponent paired figure yet: they are published with the gate
NOT ANALYSED and the run's own report, never with a number made up for the page. A failed
publish never changes the run: the wrappers ignore this script's exit code.
Python 3 standard library only.
"""

import argparse
import contextlib
import datetime
import html
import importlib.util
import io
import json
import os
import re
import shutil
import subprocess
import sys
import tempfile

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)

import a3  # noqa: E402
import analyse  # noqa: E402

REPO = os.path.abspath(os.path.join(HERE, "..", ".."))
NOT_ANALYSED = "NOT_ANALYSED"
BRANCH = "gh-pages"
SKIP_TSV = re.compile(r"(_rounds|_bullets|_energy|history|-field)\.tsv$|^(duel|melee)-")


def esc(s):
    return html.escape("" if s is None else str(s), quote=True)


def slug(s):
    return re.sub(r"[^A-Za-z0-9._-]+", "-", str(s)).strip("-") or "run"


def load_json(path):
    try:
        with open(path, encoding="utf-8") as f:
            return json.load(f)
    except (OSError, ValueError):
        return {}


# ------------------------------------------------------------------ run metadata

def work_conditions(work):
    """conditions.json of a work directory; a melee run keeps one per field, the first is used."""
    c = load_json(os.path.join(work, "conditions.json"))
    if c:
        return c, os.path.join(work, "conditions.json")
    for name in sorted(os.listdir(work)) if os.path.isdir(work) else []:
        p = os.path.join(work, name, "conditions.json")
        if os.path.isfile(p):
            return load_json(p), p
    return {}, None


def version_of(robot):
    return re.sub(r"^\S+\s+", "", robot or "").strip() or None


def kind_of(work, cond):
    opts = cond.get("options") or {}
    if str(opts.get("team", "")).lower() == "true" or "team" in os.path.basename(str(opts.get("set", ""))).lower():
        return "team"
    if str(opts.get("melee", "")).lower() == "true" or not os.path.isdir(os.path.join(work, "battles")):
        return "melee"
    return "solo"


def label_of(work, cond):
    opts = cond.get("options") or {}
    out = os.path.basename(str(opts.get("out") or work).rstrip("/\\"))
    out = re.sub(r"-\d{8}-\d{6}$", "", out)
    return slug(out or "run")


def date_of(cond):
    fin = str(cond.get("finished") or cond.get("started") or "")
    return fin[:10] if re.match(r"\d{4}-\d{2}-\d{2}", fin) else datetime.date.today().isoformat()


def run_py(script, *args):
    """Run a sibling tool in a child interpreter, so its argparse and exit codes stay its own."""
    r = subprocess.run([sys.executable, os.path.join(HERE, script)] + list(args), capture_output=True, text=True)
    if r.returncode != 0:
        raise RuntimeError("%s failed: %s" % (script, (r.stderr or r.stdout).strip()[-400:]))
    return r.stdout


def analyse_tsv(tsv, label, set_name, cond_path, out_json, candidate=None, baseline=None, selected_on=None):
    args = [tsv, "--json", out_json, "--label", label, "--set-name", set_name]
    if cond_path:
        args += ["--conditions", cond_path]
    if candidate:
        args += ["--candidate", candidate, "--baseline", baseline]
    if selected_on:
        args += ["--selected-on", selected_on]
    with contextlib.redirect_stdout(io.StringIO()):
        analyse.main(args)
    with open(out_json, encoding="utf-8") as f:
        return json.load(f)


# ------------------------------------------------------------------ one run's files

def build_run(src, tmp, kaizen=None, goal=None):
    """Return (entry, files) for a run described by `src`; files maps a name to bytes or str.

    src keys: id, date, label, kind, set, engine, work, report (optional path).
    """
    files = {}
    analysis = src.get("analysis")
    entry = dict(id=src["id"], date=src["date"], label=src["label"], kind=src["kind"], set=src.get("set"),
                 engine=src.get("engine"), source=src.get("source"))
    if analysis:
        run = analysis.get("run") or {}
        pooled = analysis.get("pooled") or {}
        entry.update(candidate=run.get("candidate"), baseline=run.get("baseline"), seeds=run.get("seeds"),
                     rounds=run.get("rounds"), gate=(analysis.get("gate") or {}).get("verdict"),
                     verdict=pooled.get("verdict"), diff=pooled.get("diff"), ci95=pooled.get("clusteredCi95"),
                     n=pooled.get("n"), opponents=pooled.get("nOpponents"),
                     host=(run.get("conditions") or {}).get("host"))
        k = a3.parse_kaizen(kaizen) if kaizen else None
        page = a3.render_html(analysis, k, goal)
        nav = ('<p style="margin:0;padding:6px 14px;font:13px system-ui,sans-serif">'
               '<a href="../../index.html">&larr; Bench analysis</a> &middot; <a href="analysis.json">analysis.json</a>'
               ' &middot; <a href="a3.md">markdown</a>%s</p>') % (' &middot; <a href="report.md">full report</a>' if src.get("report") else "")
        page = page.replace('<div class="sheet">', nav + '<div class="sheet">', 1)
        files["index.html"] = page
        files["a3.md"] = a3.render_md(analysis, k, goal)
        files["analysis.json"] = json.dumps(analysis, indent=1, allow_nan=False) + "\n"
    else:
        entry.update(candidate=src.get("candidate"), baseline=src.get("baseline"), gate=NOT_ANALYSED,
                     verdict=None, host=src.get("host"))
        files["index.html"] = unanalysed_page(src, entry)
    if src.get("report") and os.path.isfile(src["report"]):
        with open(src["report"], encoding="utf-8", errors="replace") as f:
            files["report.md"] = f.read()
    return entry, files


def unanalysed_page(src, entry):
    why = src.get("why") or "no paired per-opponent analysis exists for this kind of run yet"
    rows = [("Run", entry["id"]), ("Kind", entry["kind"]), ("Candidate", entry.get("candidate")),
            ("Baseline", entry.get("baseline")), ("Set", entry.get("set")), ("Engine", entry.get("engine")),
            ("Host", entry.get("host"))]
    table = "".join("<tr><th>%s</th><td>%s</td></tr>" % (esc(k), esc(v if v else "not measured")) for k, v in rows)
    report = ' <a href="report.md">The run\'s own report</a> has its tables.' if src.get("report") else ""
    return ('<!DOCTYPE html><html lang="en"><head><meta charset="utf-8"><meta name="viewport" content="width=device-width,initial-scale=1">'
            '<title>%s</title></head><body style="font:15px system-ui,sans-serif;max-width:760px;margin:24px auto;padding:0 16px">'
            '<p><a href="../../index.html">&larr; Bench analysis</a></p><h1>%s</h1>'
            '<p><b>NOT ANALYSED.</b> %s.%s Nothing on this page is filled in.</p><table>%s</table></body></html>\n'
            % (esc(entry["id"]), esc(entry["id"]), esc(why), report, table))


# ------------------------------------------------------------------ site writing

def read_registry(site):
    return load_json(os.path.join(site, "bench", "runs.json")).get("runs", [])


def write_site(site, repo, entries_files):
    """Add runs to site/bench, rewrite runs.json and index.html. entries_files: [(entry, files)]."""
    bench = os.path.join(site, "bench")
    os.makedirs(bench, exist_ok=True)
    runs = {r["id"]: r for r in read_registry(site)}
    now = datetime.datetime.now(datetime.timezone.utc).strftime("%Y-%m-%dT%H:%MZ")
    for entry, files in entries_files:
        d = os.path.join(bench, "runs", entry["id"])
        shutil.rmtree(d, ignore_errors=True)
        os.makedirs(d)
        for name, body in files.items():
            with open(os.path.join(d, name), "w", encoding="utf-8", newline="\n") as f:
                f.write(body)
        entry["path"] = "runs/%s/" % entry["id"]
        entry["published"] = now
        runs[entry["id"]] = entry
    ordered = sorted(runs.values(), key=lambda r: (r["date"], r["id"]), reverse=True)
    with open(os.path.join(bench, "runs.json"), "w", encoding="utf-8", newline="\n") as f:
        json.dump(dict(schema=1, runs=ordered), f, indent=1)
        f.write("\n")
    trend = os.path.join(repo, "docs", "bench", "trend.svg")
    has_trend = os.path.isfile(trend)
    if has_trend:
        shutil.copyfile(trend, os.path.join(bench, "trend.svg"))
    with open(os.path.join(bench, "index.html"), "w", encoding="utf-8", newline="\n") as f:
        f.write(index_page(ordered, repo, has_trend))
    return ordered


def site_page(repo):
    spec = importlib.util.spec_from_file_location("site_build", os.path.join(repo, "site", "build.py"))
    mod = importlib.util.module_from_spec(spec)
    spec.loader.exec_module(mod)
    return mod.page


GATE_CLASS = {"TRUSTED": "ok", "CAUTION": "warn", "NOT_TRUSTED": "bad", NOT_ANALYSED: "na"}
VERDICT_TEXT = {"down": "behind", "up": "ahead", "level": "level", "not-resolved": "not resolved"}


def result_text(r):
    text = VERDICT_TEXT.get(r.get("verdict"), "not analysed")
    return text + ", untrusted" if r.get("gate") == "NOT_TRUSTED" and r.get("verdict") else text


def fmt_diff(r):
    if not isinstance(r.get("diff"), (int, float)):
        return "not measured"
    ci = r.get("ci95")
    span = " (%+.2f to %+.2f)" % (ci[0], ci[1]) if ci and None not in ci else ""
    return "%+.2f%s" % (r["diff"], span)


def index_page(runs, repo, has_trend):
    style = ("<style>.gate{display:inline-block;padding:1px 8px;border-radius:10px;font-size:.85rem;font-weight:600;border:1px solid var(--line)}"
             ".gate.ok{color:#1a7f37}.gate.warn{color:#9a6700}.gate.bad{color:#cf222e}.gate.na{color:var(--muted)}"
             ".latest{background:var(--surface);border:1px solid var(--line);border-radius:10px;padding:12px 16px;margin:12px 0}</style>")
    if not runs:
        body = ("<h1>Bench analysis</h1><p class=\"lede\">No run has been published yet. After a harness run, "
                "<code>data/tools/publish_run.py run --work hadur-bench/work/&lt;run&gt; --set hadur-bench/&lt;set&gt;.txt</code> "
                "(or the wrapper's <code>--publish</code>) adds it here, and <code>publish_run.py backfill</code> adds the committed history.</p>")
    else:
        latest = runs[0]
        by_kind = {}
        for r in runs:
            by_kind.setdefault(r["kind"], r)

        def card(r, title):
            return ('<div class="latest"><b>%s</b>: <a href="%s">%s</a> <span class="gate %s">%s</span><br>%s %s %s, %s, %s</div>'
                    % (esc(title), esc(r["path"]), esc(r["id"]), GATE_CLASS.get(r.get("gate"), "na"),
                       esc((r.get("gate") or "unknown").replace("_", " ")), esc(r.get("candidate") or "?"),
                       "against", esc(r.get("baseline") or "?"),
                       esc(result_text(r)), esc(fmt_diff(r))))
        cards = card(latest, "Latest")
        for kind in sorted(by_kind):
            if by_kind[kind] is not latest:
                cards += card(by_kind[kind], "Latest %s" % kind)
        trs = "".join(
            '<tr><td>%s</td><td><a href="%s">%s</a></td><td>%s</td><td>%s against %s</td><td>%s</td><td><span class="gate %s">%s</span></td><td>%s</td><td>%s</td></tr>'
            % (esc(r["date"]), esc(r["path"]), esc(r["label"]), esc(r["kind"]), esc(r.get("candidate") or "?"),
               esc(r.get("baseline") or "?"), esc(r.get("set") or ""), GATE_CLASS.get(r.get("gate"), "na"),
               esc((r.get("gate") or "unknown").replace("_", " ")), esc(result_text(r) if r.get("verdict") else ""), esc(fmt_diff(r)))
            for r in runs)
        trend = '<h2>Trend</h2><p><img src="trend.svg" alt="Bench trend across runs" style="max-width:100%"></p>' if has_trend else ""
        body = ("<h1>Bench analysis</h1><p class=\"lede\">One A3 page per harness run: the gate on top, then what the paired data "
                "shows, where the deficit sits and what is not measured. The figures are the candidate minus the baseline "
                "in score-share points with the opponent-clustered 95%% interval; a run is called behind or ahead only when "
                "that interval excludes zero. The bench observes the robot and makes no evolution decision.</p>"
                "%s%s<h2>History</h2><div class=\"table\"><table><tr><th>Date</th><th>Run</th><th>Kind</th><th>Builds</th><th>Set</th>"
                "<th>Gate</th><th>Result</th><th>Difference (points)</th></tr>%s</table></div>"
                "<p>Published by <code>data/tools/publish_run.py</code>; the registry is <a href=\"runs.json\">runs.json</a>.</p>"
                % (style, cards, trs)) + trend
    return site_page(repo)("Bench analysis", body, "bench/index.html", depth=1)


# ------------------------------------------------------------------ sources

def source_from_work(args, tmp):
    work = os.path.abspath(args.work)
    cond, cond_path = work_conditions(work)
    kind = args.kind or kind_of(work, cond)
    opts = cond.get("options") or {}
    set_file = args.set or ""
    robot, base = cond.get("robot"), cond.get("baselineRobot")
    build = args.build or version_of(robot) or "candidate"
    baseline_build = args.baseline_build or version_of(base) or ""
    label = args.label or label_of(work, cond)
    date = args.date or date_of(cond)
    src = dict(id="%s_%s" % (date, slug(label)), date=date, label=label, kind=kind, engine=cond.get("engine") or "default",
               set=os.path.basename(set_file or str(opts.get("set") or "")), candidate=build, baseline=baseline_build,
               host=cond.get("host"), source="work directory", report=args.report or (
                   os.path.join(work, "report.md") if os.path.isfile(os.path.join(work, "report.md")) else None))
    if not src["report"] and opts.get("report"):
        cand = os.path.normpath(os.path.join(os.path.dirname(os.path.dirname(work)), str(opts["report"])))
        src["report"] = cand if os.path.isfile(cand) else None
    if kind == "melee":
        src["why"] = "melee has no per-opponent paired analysis; the pooled pairwise figures are in the run's report"
        return src
    if kind == "team":
        src["why"] = "A3 one-pagers cover 1v1 only for now; the team figures are in the run's report"
        return src
    if not baseline_build:
        src["why"] = "the run has no baseline, so there is no paired difference"
        return src
    if not set_file or not os.path.isfile(set_file):
        raise RuntimeError("--set must name the run's opponent set file (got %r)" % set_file)
    tsv = os.path.join(tmp, "rows.tsv")
    if kind == "team":
        run_py("export_team.py", "--work", work, "--set", set_file, "--build", build, "--baseline-build", baseline_build, "--out", tsv)
    else:
        run_py("export_battles.py", "--work", work, "--set", set_file, "--build", build, "--baseline-build", baseline_build, "--share", "--out", tsv)
    src["analysis"] = analyse_tsv(tsv, label, src["set"], cond_path, os.path.join(tmp, "analysis.json"), build, baseline_build)
    src["analysis"]["run"]["date"] = date
    src["analysis"]["run"]["engine"] = src["engine"]
    return src


def sources_from_backfill(args, tmp):
    bench_dir = os.path.join(args.repo, args.bench_dir)
    out, skipped = [], []
    for name in sorted(os.listdir(bench_dir)):
        if not name.endswith(".tsv") or SKIP_TSV.search(name) or (args.only and args.only not in name):
            continue
        path = os.path.join(bench_dir, name)
        m = re.match(r"(\d{4}-\d{2}-\d{2})_(.+?)\.tsv$", name)
        if not m:
            continue
        label = slug(re.sub(r"^hadur-", "", re.sub(r"[-_]local_cold$|_cold$", "", m.group(2))))
        if "team" in name:
            skipped.append("%s: A3 one-pagers cover 1v1 only for now" % name)
            continue
        try:
            with open(path, encoding="utf-8", newline="") as f:
                header = f.readline().rstrip("\n").split("\t")
            if "score_share" not in header or "build" not in header:
                raise ValueError("no score_share column")
            rows = analyse.read_rows([path], "score_share")
            builds = [b for b in dict.fromkeys(r["build"] for r in rows if r["ok"] != "false")]
            if len(builds) < 2:
                raise ValueError("fewer than two builds")
            cand, base = analyse.pick_builds([r for r in rows if r["ok"] != "false"], None, None)
            analysis = analyse_tsv(path, label, label, None, os.path.join(tmp, "bf-%d.json" % len(out)), cand, base)
            analysis["run"]["date"] = m.group(1)
        except (ValueError, SystemExit, RuntimeError, KeyError) as e:
            skipped.append("%s: %s" % (name, e))
            continue
        out.append(dict(id="%s_%s" % (m.group(1), label), date=m.group(1), label=label, kind="solo", set=label, engine=None,
                        analysis=analysis, source="backfill from %s/%s" % (args.bench_dir, name)))
    return out, skipped


# ------------------------------------------------------------------ publishing

def git(repo, *argv, check=True):
    r = subprocess.run(["git", "-C", repo] + list(argv), capture_output=True, text=True)
    if check and r.returncode != 0:
        raise RuntimeError("git %s: %s" % (" ".join(argv), (r.stderr or r.stdout).strip()))
    return r


def publish_branch(repo, build_fn, message, push):
    """Check out gh-pages in a temporary worktree, let build_fn(site_dir) write bench/, commit, push."""
    for attempt in range(3):
        r = git(repo, "fetch", "-q", "origin", BRANCH, check=False)
        if r.returncode != 0:
            raise RuntimeError("no %s branch on origin yet: run site/build.sh --publish once first" % BRANCH)
        tmp = tempfile.mkdtemp(prefix="hadur-pages-")
        try:
            git(repo, "worktree", "add", "-q", "--detach", tmp, "origin/" + BRANCH)
            build_fn(tmp)
            git(tmp, "add", "-A", "bench")
            if git(tmp, "diff", "--cached", "--quiet", check=False).returncode == 0:
                print("gh-pages already has these runs")
                return
            git(tmp, "-c", "user.name=%s" % (os.environ.get("GIT_AUTHOR_NAME") or git(repo, "config", "user.name", check=False).stdout.strip() or "hadur-bench"),
                "-c", "user.email=%s" % (os.environ.get("GIT_AUTHOR_EMAIL") or git(repo, "config", "user.email", check=False).stdout.strip() or "hadur-bench@users.noreply.github.com"),
                "commit", "-q", "-m", message)
            if not push:
                print("committed to a temporary gh-pages worktree and did not push (--no-push)")
                return
            if git(tmp, "push", "-q", "origin", "HEAD:" + BRANCH, check=False).returncode == 0:
                print("published: %s" % message)
                return
        finally:
            git(repo, "worktree", "remove", "--force", tmp, check=False)
            shutil.rmtree(tmp, ignore_errors=True)
    raise RuntimeError("could not push %s after 3 attempts (another publish was in flight)" % BRANCH)


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    sub = ap.add_subparsers(dest="cmd", required=True)
    common = argparse.ArgumentParser(add_help=False)
    common.add_argument("--repo", default=REPO, help="repository root (default: this script's)")
    common.add_argument("--site-dir", help="write into this directory instead of the gh-pages branch")
    common.add_argument("--no-push", action="store_true", help="commit to a temporary gh-pages worktree, do not push")
    common.add_argument("--dry-run", action="store_true", help="build in a temporary directory, write nothing")
    r = sub.add_parser("run", parents=[common])
    r.add_argument("--work", required=True, help="the bench's --out directory")
    r.add_argument("--set", help="the run's opponent set file")
    r.add_argument("--label"); r.add_argument("--date"); r.add_argument("--kind", choices=["solo", "team", "melee"])
    r.add_argument("--build", help="candidate label (default: version in the robot name)")
    r.add_argument("--baseline-build")
    r.add_argument("--report", help="the run's report.md (default: the one in the work directory or conditions.json)")
    r.add_argument("--kaizen", help="a kaizen file for the A3's whys, countermeasures and plan")
    r.add_argument("--goal", help="the A3's goal sentence")
    b = sub.add_parser("backfill", parents=[common])
    b.add_argument("--bench-dir", default="data/bench"); b.add_argument("--only")
    sub.add_parser("index", parents=[common])
    args = ap.parse_args(argv)

    with tempfile.TemporaryDirectory(prefix="hadur-publish-") as tmp:
        built, notes = [], []
        if args.cmd == "run":
            sources = [source_from_work(args, tmp)]
        elif args.cmd == "backfill":
            sources, notes = sources_from_backfill(args, tmp)
        else:
            sources = []
        for src in sources:
            built.append(build_run(src, tmp, getattr(args, "kaizen", None), getattr(args, "goal", None)))
        for n in notes:
            print("skipped " + n)
        for entry, _ in built:
            print("run %s: gate %s" % (entry["id"], entry.get("gate")))
        if args.dry_run:
            site = os.path.join(tmp, "site")
            write_site(site, args.repo, built)
            print("dry run: %d run(s) built, nothing written to the repository or %s" % (len(built), BRANCH))
            return 0
        if args.site_dir:
            write_site(os.path.abspath(args.site_dir), args.repo, built)
            print("wrote %d run(s) under %s" % (len(built), os.path.join(args.site_dir, "bench")))
            return 0
        msg = ("Bench analysis: %s" % built[0][0]["id"]) if len(built) == 1 else "Bench analysis: %s (%d runs)" % (args.cmd, len(built))
        publish_branch(args.repo, lambda site: write_site(site, args.repo, built), msg, not args.no_push)
    return 0


if __name__ == "__main__":
    try:
        sys.exit(main())
    except (RuntimeError, SystemExit) as e:
        if isinstance(e, SystemExit):
            raise
        print("publish_run: %s" % e, file=sys.stderr)
        sys.exit(1)
