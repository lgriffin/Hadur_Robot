# The `pc-warm` card (BENCH-175)

The bench shall carry the `pc-warm` card: seedall (sa, every opponent's KNN seeds kept after one battle) against master's A/A build (aa) as robot and baseline on `screen-311.txt`, 2 fresh seeds from 7900, each battle cold and then warm on the profile it left (`--cold-warm`), 12 workers, truth log off, stopping on 30 failed battles, 60+ skipped turns a battle over the last 200 or no battle in 30 minutes; then lukewarm (lw: POW-1 and POW-3 apply, once our rolling hit rate is known within POW-4's margin, only where POW-4's expected-value check also picks full power) on its own at the same seeds under the same stop rules; then `tools/cold_warm_read.py` for sa and for lw against aa (each build's warm minus cold, robot minus aa warm, the cold pair as an A/A, the robots memory hurts and helps most) and a results PR.

Stage or check: T7
