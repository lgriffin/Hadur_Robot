# Rumble and bench data archive

Everything Hadur has learned from the live RoboRumble and from the local bench, kept as data
so later work can harvest it. Nothing here is on the release path: the Maven build, the
robot and CI never read `data/`, and a stage never has to update it to merge.

- [`catalog.tsv`](catalog.tsv) lists every dataset: what it is, where it came from, when.
- [`learnings.md`](learnings.md) is the ledger of findings, each with its evidence.
- [`simulator.md`](simulator.md) weighs what a "simulator" would add over the bench.

## Layout

```
data/
  README.md, catalog.tsv, learnings.md, simulator.md
  rumble/
    pages/    saved web pages, byte for byte as the browser wrote them (.mht)
    parsed/   one table per saved page, parsed from it
  bench/
    <date>_hadur-<version>_<set>_<cold|warm>.tsv   raw per-opponent rows of one bench run
    duel-history.tsv    every duel table of every docs/bench report, one row per opponent
                        (a failed matchup keeps its row, with the status in `note`)
    melee-history.tsv   Hadur's summary row from every melee table
    melee-field.tsv     every melee standings table, one row per entrant
  tools/
    harvest_bench.py    rebuilds the three *-history/field files from docs/bench/*.md
    drussgt/            DrussGT bench analysis, energy model and shield-list tools (see its README)
    parse_rumble_page.py  parses a saved BotDetails or Rankings page into rumble/parsed/
```

The bench reports themselves stay in [`docs/bench/`](../docs/bench/) as the readable record;
`data/bench/` is the same numbers in one flat, joinable form.

## Naming

`<UTC capture time>_<site>_<page>[_<subject>].<ext>`, for example
`2026-09-28T1724Z_roborumble_botdetails_hadur2.Hadur_3.0.mht`. The capture time is the
`Date:` header of the saved `.mht` (when the page was saved, not when battles were fought).
A parsed file keeps its page's stem, so the pair sorts together. Spaces in robot names
become underscores, as in jar names. Use a date alone when there is no single capture time.

Sites: `roborumble` is the LiteRumble server (rumble.robowiki.net: `BotDetails`,
`Rankings`), `robowiki` the wiki (`RoboRumble/Participants`, `Country_Flags`).

## Adding data

1. **A saved page** (Leigh saves it in the browser as "Webpage, single file" and uploads it to
   the project): copy it into `rumble/pages/` under the naming rule, parse it into
   `rumble/parsed/` with the same stem (`python3 data/tools/parse_rumble_page.py PAGE.mht`
   does both page kinds), and add a row to `catalog.tsv` for each. The pages
   are public rumble data. `.gitattributes` keeps their bytes exact (CRLF, MIME parts).
   The pages to keep saving: the current version's `BotDetails` after every few hundred
   pairings, and the `Rankings` top 100 on the same day, so rank and APS line up.
2. **A bench run**: the report goes to `docs/bench/` as always. If the run also wrote a raw
   per-opponent table, commit it to `bench/` under the naming rule. Then run
   `python3 data/tools/harvest_bench.py` and commit the refreshed history files.
3. **A finding**: add an entry to `learnings.md` with its evidence (a file here, a report, a
   PR or issue). Mark it refuted rather than deleting it when later data disagrees.

Doing any of this is optional for a stage PR. When it is skipped, the next harvest catches
up; `python3 data/tools/harvest_bench.py --check` says whether the history files are stale.

## Tools

`tools/harvest_bench.py` uses only the Python standard library. Its tests:

```
python3 -m unittest discover -s data/tools
```

They are not wired into CI on purpose, so that a new bench report can never turn a stage PR
red. Code the build depends on belongs in `hadur-bench` with its own tests, and copies any
fixture it needs from here into `src/test/resources/`. The planned BENCH-5 live-details
reader (`hadur.bench.LiveDetails`, R4) is the first such case.

## Parsed page formats

- `*_botdetails_*.csv`: the LiteRumble BotDetails table as exported: rank, flag, name,
  compare link, APS, APS CI, NPP, survival, KNNPBI, battles, latest battle (UTC), opponent
  APS, opponent survival. One row per pairing.
- `*_rankings_top50.tsv`: rank, name, APS.
- `*_participants_jars.txt`: one archive-mirror jar URL per participant, alphabetical.
- `*_top50_jars.tsv`: rank, name, APS, the jar URL the bench downloaded (blank when none).
