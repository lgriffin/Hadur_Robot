# The `pc-mirror-off` card (BENCH-224)

The bench shall carry the `pc-mirror-off` card: master (c), its A/A copy (aa) and mo, a build in which janm.Jammy 1.0, suh.nano.MirrorL 1.00 and suh.nano.MirrorH 1.01 carry MIR-2 mirror-off lines (`plans/mirror-off-add.txt`, `build-ablation.sh mirofflist`), on those three robots at 12 fresh seeds from 12700; then the APS gate for mo (`tools/shield_s2.py gate`, 0.005 bar over 1,217 pairings, 95% low end above 0), a 3-point per-robot pick (`mode_table.py`) that names the lines to ship and per-robot results; 12 workers, truth log off, stopping on 30 failed battles, an arm scoring nothing in 8, 60+ skipped turns a battle over the last 200 or no battle in 30 minutes; then a results PR.

Stage or check: T7
