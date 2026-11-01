# The rival's shield crossing power (SHIELD-22, SHIELD-23)

Of the rival's 2.07 APS lead over 3.20, +0.49 comes from the 240 robots we both shield. Its shield and ours
are the same family: stand still, predict each enemy bullet's heading, shoot it out of the air. Two
mechanics differ.

**Listing.** It shields a listed robot for the whole battle until 800 damage. We leave after 150 (400 or no
damage exit for the robots SHIELD-19 names). This was measured on every robot on the shield list in
pc-shield-exit (PR #383). An exit at 400 scored +0.04 ± 0.09 APS and no damage exit -0.01 ± 0.10, so both
failed. The per-robot picks shipped as SHIELD-19. Nothing more is left to measure here.

**Crossing power.** For each enemy bullet both shields search fire ticks and powers for a crossing.

- Ours fires the plan with the widest shadow, up to just under the enemy's power.
- The rival's scores each plan by tolerance, capped at "enough". It adds a bonus for powers no dearer than
  the enemy's power times our energy over its energy, and a small cost per point of power. In effect, the
  cheapest crossing that is wide enough wins.

A crossing costs us our bullet's power and the enemy its own. Cheaper crossings drain the enemy faster than
us, and the energy-ratio rule spends less when we are behind.

Two switches, both off on master:

| Switch | Ablation | Rule |
|---|---|---|
| `cheap` (SHIELD-22) | `scheap`, suffix sc | Of the plans from the chosen spot, the cheapest with half the widest shadow or more, first among those no dearer than enemy power x our energy / its energy |
| `ratio` (SHIELD-23) | `sratio`, suffix sr | No plan dearer than enemy power x our energy / its energy (never under 0.1); the widest under that cap |

Card `hadur-bench/plans/pc-shield-power.queue` (BENCH-165) runs both on all 281 robots on master's shield
list (`panel-shield-listed-321.txt`), with c and aa, on 4 fresh seeds from 7200. That is 4,496 battles,
about 1 h 5 min on the PC. Each arm is gated at +0.05 APS with the 95% low end above 0, and a 5-point
per-robot pick feeds a confirm card if neither passes globally.
