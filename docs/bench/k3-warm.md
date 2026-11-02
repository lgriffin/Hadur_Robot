# K2 and K3 of the road to king: budget, and what memory is worth (2026-11-02)

The road to king (K0 to K4) is set out in Leigh's doc "Hadur: the 1:1 map, tonight's card, and the road to
1v1 king" (2026-10-28). K0 (the gun oracle) is done. K1 shipped the simple aims as members (MOVE-29); the
learning-gun mimics (MOVE-33) failed as a global switch and are now tested robot by robot (pc-mimic-on). This
note covers the next two phases: K2 (the budget) and K3 (what the robot already knows when round 1 starts).

## K2: the ensemble fits the budget

K2's target was skipped turns within 10% of the control with the full ensemble on. pc-mimic (PR #581,
663 battles an arm on the PC) measured it. With all six mimics on every learner, mm skipped 35.4 turns a
battle against the control's 34.8 (+1.7%), and its engine disables were lower (1.2 against 2.0 per 100).
The ensemble is inside the budget, so K2 needs no card.

## K3: what round 1 knows

K3 as written ships each robot's converged member weights in the table. Two reads say that form is small:

- **The oracle.** On the 432 learning guns, the best fixed per-robot mix, chosen in hindsight, scores
  +0.387 bits. The rolling blend the robot plays scores +0.377 (pc-k1-aim, PR #432). Per-robot weights
  shipped as a prior can gain at most that gap.
- **Round 0.** On the cloud against 24 learners we take 29 damage in round 0, against 20 to 23 in later
  rounds. DrussGT takes 38 in round 0 against 20 later. The round-0 excess is about 1% of a battle's
  damage taken.

The larger form of K3 is a warm start: ship each robot's profile (its tiers, its verdicts and the KNN seeds)
in the jar, so every battle starts as if it had met the robot before. That only pays if warm beats cold,
and the bench has never measured it, because it fights every battle cold. Live clients do not: 3.12's read
found a stored verdict for about 55% of opponents.

### Cloud reads (`--cold-warm`: each battle cold, then warm on the profile the cold one left)

| Build | Robots | Warm minus cold (points) | Notes |
|---|---|---|---|
| 3.21 (aa), profiles as live clients keep them (stats only, MEM-8) | 24 | +1.36 ± 3.65 | Neutrino 87.3 -> 70.9 |
| 3.21 without the tier full-power rules (nt: POW-1, POW-3 off) | 24 | -1.11 ± 2.61 | Neutrino 86.0 -> 87.4 |
| seedall (sa): every opponent's KNN seeds kept | 3 | lost on all 3 | Neutrino 85 -> 69, PvP1 89 -> 78, JollyNinja 95 -> 66 (5 rounds) |

- **Neutrino.** The stored profile rates Neutrino's gun T0, which is true: it hits us 0.5% of the time.
  POW-1 then fires every shot at power 3. Neutrino dodges 85% of them, and we fire ourselves to 0 energy:
  rounds survived fall from 20-22 of 35 to 11. Without the tier rules, warm holds level. Across all 24
  robots, removing the tier rules is no better (-1.1), so the fix belongs to the robots it hurts, not to
  everyone. POW-15's `full-off:` list (pc-full-off) can carry Neutrino.
- **Seeds.** The warm start with seeds lost on every robot read. Live clients keep seeds for up to five
  opponents met twice and scored under 60% against (MEM-8, ADAPT-3). Those are the strong learners, where a
  bad replay costs the most.

## The card: pc-warm (BENCH-174)

`plans/pc-warm.queue` measures this at scale on the PC:

- **Panel:** the 400-robot screen (`screen-311.txt`, drawn in proportion to band size, so a mean estimates
  APS).
- **Builds:** seedall (sa) as the robot and master's A/A build (aa) as the baseline.
- **Lukewarm (lw):** Leigh's "a lukewarm start before adapting". The stored tier still opens the battle at full
  power (POW-1, POW-3). Once this battle's own hit rate on the opponent is known within POW-4's margin, the tier
  rules apply only where POW-4's expected-value check also picks full power. lw plays the same seeds on its own
  and is read against cw's aa rows.
- **Battles:** 2 fresh seeds from 7900, each battle cold and then warm. That is 4,800 battles over three builds,
  about 3 hours.
- **The read** (`tools/cold_warm_read.py`):
  - each build's warm minus cold;
  - sa minus aa when warm;
  - the cold pair as an A/A, since sa and aa play alike until they save;
  - the robots memory hurts and helps most.

The card decides K3's next step:

- **Warm beats cold, with seeds or without:** K3 ships profiles. `ShelfProfileStore` (MEM-16, drafted)
  reads a profile from the jar when the data directory has none. A shelf card then harvests the profiles
  and tests them cold against master.
- **lw warm beats aa warm:** the gate is the leak's fix, and ships as its own requirement.
- **Warm loses:** memory is a live leak to fix first, per robot from the read's "hurts most" list, before
  anything is shipped.
