# Bench A3 reports

One page per bench run that says what was measured, how far to trust it, where the loss sits, and
what to do next. The layout follows the A3 report of `tutors-sdk/tutors-release-harness`:
Background, Current condition, Goal, Root cause, Countermeasures, Plan, Follow-up, with a trust
gate across the top.

Each report is two files with the same stem: `<date>_<label>.html` (print it on A3 landscape from
a browser) and `<date>_<label>.md` (the same content for diffs and GitHub).

Example: [2026-10-06_ll-351v34.html](2026-10-06_ll-351v34.html), the live-loser leak set, Hadur 3.5.1
against 3.4. Open the `.html` in a browser; GitHub shows the `.md` twin.

## How to read one

1. **Gate** (top band): TRUSTED, CAUTION or NOT_TRUSTED, with the reasons. NOT_TRUSTED withholds the
   verdict, because an overloaded bench measures a different robot. CAUTION means read the sign
   with care, for example both builds near 30% share (a floor effect), unequal skipped turns, or
   opponents with no result.
2. **Headline**: the pooled paired difference in score-share points, with the per-battle and the
   opponent-clustered 95% intervals. The verdict uses the clustered interval. An interval that
   spans zero is "not resolved", never a gain or a loss. "Level" needs the TOST test to pass.
3. **Current condition**: the forest plot, one row per opponent. A filled dot passed Holm
   (adjusted p under 0.05); a hollow one did not. Opponents with no result are listed apart and are
   not in the figures.
4. **Root cause**: a Pareto of each losing opponent's mean deficit, with the vital few that make
   80% flagged. It sums losses only, wins are not netted off. Below it, the 5 Whys, if a kaizen
   file was given.
5. **Countermeasures, Plan, Follow-up**: taken from the kaizen file. One countermeasure kind per
   file: `mutant`, `bench-run`, `harness-change`, `set-change`, `doc` or `none`.

Wherever an input is missing the page says "not measured". Nothing is estimated or filled in. The
5 Whys are never written by the tool: a person writes them in `kaizen/`, and the page quotes them.

## How to make one

From the repo root:

```
# 1. an analysis.json for the run (see the contract below)
python data/tools/analyse.py ... --json > analysis.json        # once analyse.py --json lands
python data/tools/a3.py from-tsv data/bench/<run>.tsv \
    --candidate <build> --baseline <build> --label <label> --date <YYYY-MM-DD> \
    --conditions <run's conditions.json> > analysis.json        # until then

# 2. the page, optionally with a kaizen file and a goal sentence
python data/tools/a3.py make analysis.json --kaizen kaizen/<file>.md --goal "text"
```

`make` writes `docs/bench/a3/<date>_<label>.{html,md}`; use `--out-dir` and `--stem` to change
that. Check the kaizen files with `python data/tools/a3.py register` (add `--write` to refresh the
table in `kaizen/README.md`). Tests: `cd data/tools && python test_a3.py`.

`from-tsv` is an interim bridge. It re-derives the figures from an `export_battles.py` TSV with
`analyse.py` and applies its own gate rules (NOT_TRUSTED above 2.0 skipped turns per round;
CAUTION for a floor effect under 35% share, a skip imbalance, or more than 10% of opponents with
no result). Once `analyse.py --json` exists, make the analysis from that and retire the bridge.

## The analysis.json contract (schema 1)

`make` reads this and refuses any other `schema`. Every key is optional except `schema`; a missing
one renders as "not measured".

```
{"schema": 1,
 "goal": "optional one sentence",
 "run": {"label", "candidate", "baseline", "set", "seeds", "rounds", "engine", "date",
         "conditions": {"host", "cpuConstant", "parallel", "childHeap", "childCpus",
                        "hostLoad": {"min", "mean", "max"}, "otherJvms"}},
 "gate": {"verdict": "TRUSTED|CAUTION|NOT_TRUSTED", "reasons": [str]},
 "pooled": {"diff", "ci95": [lo, hi], "clusteredCi95": [lo, hi], "n", "nOpponents",
            "tost": {"margin", "p", "equivalent"}, "verdict": "down|up|level|not-resolved"},
 "opponents": [{"name", "diff", "ci95": [lo, hi], "holm", "bh",
                "skips": {"cand", "base"}, "n", "failed"}],
 "excluded": [{"name", "reason", "failed", "total"}],
 "floorWarning": bool,
 "trust": {"skippedPerBattle": {"cand", "base"}, "duressPerBattle": {"cand", "base"},
           "untrustedPairs"}}
```

Units: differences and intervals are score-share points; `hostLoad` is percent (0 to 100), not a
fraction. `goal` is an extension for this tool and may be absent. A reference file is
`data/tools/fixtures/analysis-ll-351v34.json`, real data from the 3.5.1 against 3.4 run.

## On the project site

`data/tools/publish_run.py` renders each run's A3 and publishes it, with the history, to the site's
`bench/` pages after a harness run: see `docs/bench/pages.md`.

## What this does not do

It does not run battles, change the robot, or decide what Hadur should do next. It reports what is
measured and how sure we are, and shows the countermeasure a person has written down.
