# Watching a PC card as it runs (BENCH-128 to BENCH-131)

Leigh, 2026-10-28: "Why can't the harness do what you have done in the cloud there and monitor as it
runs? Instead I'm doing 6 hour runs that have clear failures." Until now a PC card was read only from
its results PR at the end. Now the queue runner reads every battle as it lands and can stop a card on
rules the card declared before it started.

## What you see during a run

- **On GitHub:** the branch `claude/<plan>-progress` (for example `claude/pc-shield-exit-progress`),
  file `progress.md`, refreshed every 15 minutes and at once on any stop. A thread reads the same file
  (and `progress.json`) to follow the run, the way it follows a cloud run. `queue.log` beside it is the
  queue log's tail. The push uses a private git index, so the PC's checkout and working tree are never
  touched, and a failed push is logged once and never affects the run.
- **On the PC:** `.\queue.ps1 status <plan>` prints the same page; `work/queue-<plan>.progress.md` is
  rewritten every minute; the queue log gets a one-line progress entry every 30 minutes.
- **The page:** each step's state; for a battle step the battles done of the card's total, battles an
  hour, ETA, failures, skipped turns a battle (first 100 against last 100, to show a build-up), and per
  arm its share, its running difference from the pooled control (APS when the card gives `field=`, as
  the gates read it) with the 95% interval and the stop rule's z 3 bound, the A/A check, and every
  stop rule with its state. Every multi-arm step on every existing card gets this with no card change.
- **An alert:** with `set ALERT = lgriffin` on the card, a tripped rule or a failed watched step opens a
  GitHub issue assigned to you.

## How a card stops itself

Rules are lines on the step, fixed before the run like the rest of the card:

```
  watch: field=1217
  stop: fails 30                               halt: 30 failed battles (crash, broken jar)
  stop: dead 8                                 halt: an arm scoring nothing in 8+ battles (stale/bad jar)
  stop: skips 40 over 200                      halt: last 200 battles skip 40+ turns a battle (PR #331)
  stop: stall 30m                              halt: no battle finished in 30 minutes
  stop: aa after 20%                           halt: A/A outside its band at z 3 (bench defect)
  stop: futility s4,s0 below 0.10 after 30%    finish: no candidate can still reach the gate's bar
```

- **halt** kills the step and stops the queue. Every battle already fought is kept (its row stays on
  disk and Bench reads it back), so fixing the cause and rerunning resumes where it stopped. Only the
  battles in flight at that moment (at most one a worker, 12 on the PC) are fought again.
- **finish** kills the step but records it as done: the rows so far become its `arms.tsv` and an
  `EARLY-STOP.md`, the gate and results-PR steps run on them, and the results PR opens with the
  progress page so it says the run stopped early and why.
- **Cost, stated on the page:** every rule row says what it would stop, and the page says how many
  battles (and hours) a stop now would leave unrun. Nothing fought is discarded.
- **Statistics:** interim looks use z 3 (about 0.3% two-sided each), not the gates' 95%, so reading
  every minute does not turn noise into a stop. Futility also needs 10 robots read and the card's
  `--shuffle-jobs` (BENCH-128), so a partial run is a random sample of the panel rather than the set's
  first robots; the runner refuses a futility rule without it.
- **Overrides:** `--no-stop-rules` (show, never act), `--continue-early` (rerun a step a futility rule
  ended), `--no-publish` (keep progress local).

## Found on the way: resume never read back a clean battle

`Arms.resumed` read a battle's row with `strip()`, which also took the tab before the empty errors column
that every clean battle has (the PC's arms.tsv rows end that way), so the column count never matched and
a stopped multi-arm run fought every battle again. It now strips only the line break (ArmsTest).
"Steps resume part-way" was true of the queue but not of the battles inside a multi-arm step until now.

## Cloud test (2026-10-28, 4-core cloud box)

`plans/watch-smoke.queue`: 12 weak nanos x c, aa, dz x 2 seeds x 10 rounds = 72 battles, dz a weak nano
standing in for an arm that clearly loses. Progress was pushed (to a local test remote) every 2 minutes;
the futility rule stopped the screen at 52 of 72 battles (14:43, 3 min in), the gate read the 52 rows
(A/A -1.20 ± 2.27, inside its band). The page at the stop:

#### screen

**52 of 72 battles** (72%), 0 failed. Running 3 min, 1039 battles/h, about 1 min left (ends ~14:44 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.8 overall, first 52 0.8, last 52 0.8; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 17 | 0 | 89.03 | - | - | - | 1.2 |
| aa | 18 | 0 | 87.82 | -1.20 (11 robots) | ±2.27 | -4.68 .. +2.27 | 1.1 |
| dz | 17 | 0 | 50.87 | -37.48 (11 robots) | ±8.80 | -50.94 .. -24.01 | 0.2 |
A/A: aa - c -1.20 pts over 11 robots; 1% band ±2.79 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 6` | halt | ok | 0 failed of 52 |
| `dead 6` | halt | ok | every arm scoring |
| `skips 60 over 30` | halt | ok | 1.0 a battle over the last 30 (first 30: 0.7) |
| `stall 20m` | halt | ok | last battle 0 min ago |
| `aa after 30%` | halt | ok | aa - c -1.20 pts over 11 robots, stop band ±3.25 |
| `futility dz below 0 after 30%` | finish | TRIPPED | dz -37.48, best case -24.01 pts vs bar +0.00 |

Stopping now would leave 20 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.
