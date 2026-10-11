# analysis.json: the contract between the analysis and its readers

`data/tools/analyse.py --json analysis.json` writes one document per run. It is the single input
for anything that presents a run (the A3 one-page report, the trend, a findings summary), so that
no reader recomputes a verdict. The analysis decides; the readers display.

```
python data/tools/analyse.py data/bench/<run>_a.tsv data/bench/<run>_b.tsv \
    --candidate 3.8.5 --baseline 3.8 \
    --conditions docs/bench/local/<run>/conditions.json \
    --label top20big-385 --set-name top20.txt --json analysis.json
```

`--conditions` is the run's `conditions.json`. Without it the conditions block is filled from the
rows' host columns where they exist and is `null` where they do not. `--selected-on baseline`
declares that the opponent set was chosen from the baseline's results (for example "the robots 3.8
lost to"), which adds a warning and a CAUTION.

## Schema 1

```json
{
  "schema": 1,
  "run": {
    "label": "top20big-385", "candidate": "3.8.5", "baseline": "3.8",
    "set": "top20.txt", "seeds": 100, "rounds": 35, "engine": "1.9.5.6", "date": "2026-10-07",
    "selectedOn": null,
    "conditions": {
      "host": "...", "cpuConstant": 1488498, "parallel": 12, "childHeap": "2G", "childCpus": 2,
      "hostLoad": {"min": 10.0, "mean": 60.0, "max": 100.0}, "otherJvms": 0
    }
  },
  "gate": {"verdict": "TRUSTED | CAUTION | NOT_TRUSTED", "reasons": ["..."]},
  "pooled": {
    "diff": 2.32, "ci95": [1.34, 3.30], "clusteredCi95": [-0.96, 5.59],
    "n": 400, "nOpponents": 20,
    "tost": {"margin": 1.0, "p": 0.31, "equivalent": false},
    "verdict": "up | down | level | not-resolved"
  },
  "opponents": [
    {"name": "...", "diff": 0.0, "ci95": [0.0, 0.0], "holm": 1.0, "bh": 1.0,
     "skips": {"cand": 20.1, "base": 19.4}, "n": 20, "failed": 0}
  ],
  "excluded": [{"name": "zen.Ronin", "reason": "failed every battle (16 of 16)", "failed": 16, "total": 16}],
  "floorWarning": false,
  "trust": {
    "skippedPerBattle": {"cand": 22.3, "base": 20.5},
    "duressPerBattle": {"cand": 0.4, "base": 0.3},
    "untrustedPairs": 52, "pairs": 400,
    "withoutDuress": {"n": 380, "diff": 2.24, "clusteredCi95": [-1.0, 5.5], "removed": 20}
  }
}
```

`run.conditions.hostLoad.{min,mean,max}` is **percent** (0 to 100, one decimal), converted from the
fractions in the TSV and `conditions.json`. `run.conditions.otherJvms` is the most other Robocode
JVMs seen across the battles; `conditions.json`'s start-of-run note may say there were none, so
the two can differ.

All differences are in score-share points (candidate minus baseline). Missing values are `null`,
never `NaN` and never a made-up number: "not measured" stays visible.

## How each part is derived

**pooled.** `diff` is the pooled paired difference. `ci95` is the per-battle interval (every
battle an independent observation); `clusteredCi95` treats the opponent as the unit and so
includes how much the opponents differ from each other. The clustered interval is the honest
one, because the opponents are a sample of robots Hadur might meet and a gap on 20 robots says
less than the same gap on 400 independent battles would suggest. It is the headline in the text
report and it decides `verdict`:

- `level`: the clustered 90% interval lies inside plus or minus `tost.margin` (TOST equivalence).
- `down`: not level, and the clustered 95% interval is entirely below zero.
- `up`: not level, and the clustered 95% interval is entirely above zero.
- `not-resolved`: anything else, including fewer than two opponents.

**gate.** Decided from the trust data and the conditions, before any score is read.

- `NOT_TRUSTED`: no pairs; more than 25% of pairs untrusted; or the two builds skipped turns very
  differently (more than 1.5 times and more than 10 a battle), meaning they ran under different
  load. A reader must not present the headline as a result.
- `CAUTION`: any untrusted pairs; a floor effect; mixed rounds per battle; host CPU averaging over
  85%; other Robocode JVMs beside the bench; or a set chosen from the baseline's results.
- `TRUSTED`: none of the above.

A pair is untrusted when either side has duress ticks, has lost R records (see below), or skipped
more than 2.0 turns per round. This mirrors `BattleResult.trusted()`.

**R records.** On this engine the last round's R record often never arrives (`finalRMissing`).
Both builds share it, so it is not held against a row: `rShortfall - finalRMissing > 0` is the
test when both columns exist, and `roundRecords != rounds` when they do not.

**floorWarning.** True when both builds are pushed so far that their difference is a floor
effect: more than 100 skipped turns a battle on either side, or both mean score shares under 35%
while skipping more than 2 turns a round. Under a floor the sign of a difference is not evidence.
The low-CPU-constant "tight" runs are the example: both builds fall to about 30% share.

**opponents.** Per opponent, with Holm and Benjamini-Hochberg adjusted p-values over the opponents
in the run. `failed` counts that opponent's failed battles (either build).

**excluded.** Opponents where every battle failed. They carry no pairs, so they are named here
instead of silently missing from `pooled`.

**trust.withoutDuress.** The pooled figure recomputed without every pair that had duress on
either side; `null` when no pair had duress.

## Additions and refinements

Fields beyond the first sketch of the contract: `run.selectedOn`, `trust.pairs` and
`trust.withoutDuress`. `run.conditions.hostLoad` and `otherJvms` come from `conditions.json`'s
`hostSample` when present. Readers should ignore fields they do not know, and a change that
breaks a reader raises `schema`.

## Seeds versus opponents

`analyse.py --plan` now also reports, for the pooled clustered interval, the spread between
opponents and what it implies. When that spread alone keeps the half-width above the target, the
plan says "MORE OPPONENTS, NOT MORE SEEDS" and gives the number of opponents needed. More seeds per
opponent narrow each opponent's interval but cannot narrow the pooled one.
