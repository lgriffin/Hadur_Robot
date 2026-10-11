# Paper: Twenty Years On

An initial 8-page paper charting the history of the Hadur work: Robocode as the entry point it
was in college, and what changed (and what did not) when the robot was rebuilt with agents in
September and October 2026. It is a draft for a journal submission once Hadur reaches the top 10
of the 1v1 RoboRumble; the shortlisted venue is the *Software: Practice and Experience* special
issue on AI-Native Software Engineering (due 15 January 2027).

| File | What it is |
|---|---|
| `main.tex` | The paper (two-column, 10 pt, A4) |
| `refs.bib` | Bibliography |
| `figures/*.tex` | Every figure, drawn in TikZ/pgfplots with its data inline and its source named in a comment |
| `main.pdf` | The compiled draft, 8 pages |

Build with `make` (pdflatex, bibtex, TikZ and pgfplots; on Debian or Ubuntu,
`texlive-latex-extra texlive-pictures texlive-fonts-recommended`).

## Where the numbers come from

Each figure and table cites a file in this repository, so the paper can be rechecked as the
data moves:

- 1v1 APS and rank by release: `README.md` (Rank history), `docs/bench/live-3.9.md`
- Score share against Shadow by stage: `docs/strategy-evolution.md` (Results by stage)
- 3.9 against 3.8.5 by rank band: `docs/bench/live-3.9.md`
- Bench against ladder disagreements: `data/learnings.md` (L-01, L-22, L-24), `docs/bench/live-3.8.md`, `docs/bench/live-3.9.md`
- Pull requests per day: `git log --first-parent origin/master`
- The 3.9 walk-through: `docs/releases/v3.9.md`, `docs/requirements.md` (RAM-3), `kaizen/`

## Before submission

- Add the author's affiliation and contact (marked `TODO(Leigh)` in `main.tex`).
- Move to the venue's template (Wiley for SPE) and its reference style.
- Update the history, figures and abstract when Hadur reaches the top 10.
- Check the references in `refs.bib` against the publishers' records.
