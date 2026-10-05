# DrussGT bench tools

Analysis of the 4-5 October 2026 bench session (Hadur 3.5.1 and probe builds against DrussGT 3.1.16). Standard library only, except `duel.py` which uses numpy if present. A run is `label=dir[,dir...]` (see `runs.py`).

- `export_tables.py` flattens runs into the four tables in `data/bench/`; `summary.py` recomputes the report's figures from them.
- `analyze.py`, `econ.py`, `energy_trace.py`, `outcomes.py`, `shares.py`, `endings.py`, `extras.py`, `evidence_replay.py`: per-run analyses; `run_analysis.sh WORK OUT` runs them all.
- `duel.py`, `model_runs.py`: the energy-duel model and its fixed-seed runs (`validate`, `rates`, `sens`, `grid1`, `grid2`, `press`).
- `shield_targets.py`: joins DrussGT's shield list with BotDetails and rankings; writes the TSV and `hadur-bench` sets.
- `build_probe.sh`, `run_queue.sh`, `bench-first-seed.patch`, `bench-enemy-console.patch`: how the probe builds were made and queued. The patches apply to master be5bec2.

Tests: `python3 -m unittest discover -s data/tools`.
