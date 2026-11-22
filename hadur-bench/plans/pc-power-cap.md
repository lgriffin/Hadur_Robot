# The `pc-power-cap` card (BENCH-236)

The bench shall carry the `pc-power-cap` card: master (c), its A/A copy (aa) and pk (a POW-18 `power-cap:` line for each robot of `plans/power-cap-add.txt`: Roborio 1.2.4, Gilgalad 1.99.5c, Firestarter 2.0f, Rabbit 0.001, Domogled 1.2; a `power-cap5:` line for each of `plans/power-cap5-add.txt`: MatchupAGF 1.1, WaveSurferPG 1.06) on `panel-power-cap.txt` at 12 fresh seeds from 16000; then a 3-point per-robot pick (`mode_table.py`) that names the lines to ship and per-robot results; 12 workers, truth log off, stopping on 30 failed battles, an arm scoring nothing in 8, 60+ skipped turns a battle over the last 200 or no battle in 30 minutes; then a results PR.

Stage or check: T7
