# Bench kaizen register

Every bench finding that needs a decision ends here in a countermeasure to the bench or the
process, never in blame. One file per 5 Whys; `docs/bench/a3/` pages read these files for the
Root cause, Countermeasures, Plan and Follow-up boxes, and never write them. The method follows
the A3 and kaizen register of `tutors-sdk/tutors-release-harness`.

## File format

```
# Title
Finding: one line, with the run it comes from
Run: the A3 page or report it was raised from
Raised: YYYY-MM-DD

## 5 Whys
1. Why ...? The answer, checkable against a report, a TSV row or a document.
...
Chain ends at: the first answer that is a process or a tool

## Countermeasure
Kind: one of mutant, bench-run, harness-change, set-change, doc, none
Action: what will be done
Owner: a name, or "not assigned"
Due: YYYY-MM-DD, or "not set"
Verified by: the run that shows it worked (leave "open" until then)

## Follow-up
- what the next run must show
```

Each answer must be checkable. "Human error" is not an answer; it prompts the next why. The kinds
are: `mutant` (a planted regression the bench must catch), `bench-run` (a run that answers the
question), `harness-change` (a change to the bench tooling), `set-change` (a change to an opponent
set), `doc` (a charter, strategy or SOP change), `none` (looked at, nothing to do).

## Checking and the register

```
python3 data/tools/a3.py register            # check every file, print the table
python3 data/tools/a3.py register --write    # regenerate the table below
```

The check fails when a file has no `Chain ends at`, no numbered 5 Whys, or not exactly one `Kind`
from the list. The table is generated; edit the files, then regenerate.

## Register

<!-- register:start -->
| 5 Whys | Kind | Owner | Due | Verified by |
|---|---|---|---|---|
| [The live-loser loss sits in the 3.4 to 3.5.1 step](2026-10-07-live-loser-3.4-to-3.5.1.md) | bench-run | not assigned | not set | open |
<!-- register:end -->
