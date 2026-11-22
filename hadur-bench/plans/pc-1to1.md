# The `pc-1to1` card (BENCH-133)

The bench shall carry the `pc-1to1` card, the 1:1 tournament of docs/bench/local/2026-10-28_one-to-one-map.md: on `panel-1to1-shield.txt` (the 124 robots DrussGT or Nullstride shield and Hadur surfs, rammers out) it runs c, aa, `shield-all,sdmg400`, `shield-all,smove,sdmg400` and `strial`; on `panel-1to1-learn.txt` (the 103 learning- or mixed-gun robots on stat-prone or oscillating movement that Hadur plays normally and scores under 97 against) it runs c, aa, `sgo`, `sgo2` and `sdplan`; each at 6 fresh seeds (from 3800 and 3900), truth log off, 12 workers; it reads each arm's panel gate, `mode_table.py` picks at margin 5 and every robot's per-arm difference with losses, and stops before the results PR if any analysis fails.

Stage or check: T7
