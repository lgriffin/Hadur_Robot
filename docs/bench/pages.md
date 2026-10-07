# Bench analysis on the project site

After a harness run, its analysis is published to the project site, so the latest result and every
earlier one are one click away at <https://lgriffin.github.io/Hadur_Robot/bench/index.html>.

## What the site shows

- `bench/index.html`: the latest run, the latest run of each kind (1v1, team, melee), the history
  table newest first with the gate and the result of each, and the trend chart
  (`docs/bench/trend.svg`) when the repository has one.
- `bench/runs/<date>_<label>/index.html`: the A3 one-pager for that run (`data/tools/a3.py`), with
  `analysis.json`, `a3.md` and the run's own `report.md` beside it.
- `bench/runs.json`: the registry the index is built from.

The gate comes first on every page. A result is shown as ahead or behind only when the
opponent-clustered 95% interval excludes zero, and a run whose gate is NOT TRUSTED says "untrusted"
next to its figure. Melee runs have no per-opponent paired analysis yet, so they are published as
NOT ANALYSED with the run's own report: no number is made up for the page.

## Publishing a run

Automatically, at the end of a wrapper run:

    ./bench-top20.sh --seeds 10 --publish          # also bench-team-top20.sh, bench-melee-top20.sh
    .\bench-top20.ps1 -Seeds 10 -Publish           # PowerShell
    HADUR_BENCH_PUBLISH=1 ./bench-top20.sh ...     # the same, without a flag

By hand, from a finished work directory (the bench's `--out`):

    python3 data/tools/publish_run.py run --work hadur-bench/work/<run> --set hadur-bench/top20.txt --label top20

In a queue plan, as a step after the run: `hadur-bench/plans/publish-example.queue`.

`run` reads the builds, host, engine and date from the work directory's `conditions.json`, exports
the raw rows (`export_battles.py`, or `export_team.py` for a team run), runs `analyse.py`, renders the
A3 and pushes one commit to the `gh-pages` branch. Options: `--kaizen FILE` and `--goal TEXT` fill the
A3's whys, countermeasures and goal, `--label`, `--date`, `--kind`, `--build` and `--baseline-build`
override what is read, `--no-push` commits to a temporary worktree and stops, `--dry-run` builds in a
temporary directory and writes nothing, `--site-dir DIR` writes the pages into a directory with no git.

A publish that fails prints why and exits non-zero. The wrappers ignore that exit code, so a publish
failure never changes the run's own result or exit code. Needs push access to `origin` and a
`gh-pages` branch (made by the first `site/build.sh --publish`).

## History

    python3 data/tools/publish_run.py backfill

publishes every committed `data/bench/*.tsv` that holds a paired candidate and baseline `score_share`
(1v1 only; team and melee runs are listed without a one-pager) in one commit, naming each skipped file and why. Those TSVs have no `conditions.json`,
so the gate reads what the rows carry and most are CAUTION or NOT TRUSTED. Run it once after this
lands, and again after a results PR adds TSVs; a run already published is replaced, not duplicated.

## How it stays out of the site build

`site/build.sh --publish` (run by `.github/workflows/pages.yml` on every push to master) used to wipe
the branch before copying the new site. It now keeps `bench/` across the wipe and rebuilds
`bench/index.html` in the site's current style, so a docs rebuild never loses a published run. If a
docs rebuild and a bench publish land at the same moment the second push is rejected, not merged:
`publish_run.py` retries three times, and the workflow can be re-run.

Tests: `python3 data/tools/test_publish_run.py` (run in CI).
