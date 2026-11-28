# Hadur docs

A map of this folder. **Current** docs describe the code on master and are kept up to date;
**plans** are the records of work that has shipped or closed, kept for their reasoning and
read-outs, and are not updated after the fact.

## Current

| Doc | What it holds |
|---|---|
| [architecture-c4.md](architecture-c4.md) | The C4 view of all three styles (1v1, melee, team): containers, components, the switch and mode-table catalogue and the isolation rule |
| [architecture.md](architecture.md) | The narrative of each module and subsystem: the tick, ports and values, packages, owners and strands, memory, faults, determinism |
| [testing.md](testing.md) | The test layers, traceability, coverage, replay fixtures and the bench |
| [requirements/](requirements/README.md) | The EARS requirements, one file per area, and the retired table |
| [strategy-evolution.md](strategy-evolution.md) | How the strategy evolved, stage by stage, with the bench reads behind each step |
| [architecture-evolution.md](architecture-evolution.md) | The A0 to A5 evolution to one identity and three strands, and its stage log |
| [bullet-shielding.md](bullet-shielding.md) | Bullet shielding, both the counter and Hadur's own shield |
| [rumble-submission.md](rumble-submission.md) | Entering Hadur in the rumbles |
| [releases/](releases/) | Release notes for every Hadur and small-bot version |

### Small bots

| Doc | Robot |
|---|---|
| [saor.md](saor.md) | Saor, MicroMelee |
| [twinsaor.md](twinsaor.md) | TwinSaor, Twin Duel |
| [deise.md](deise.md) | Deise, MiniMelee |
| [sanaro.md](sanaro.md) | Sanaro, NanoMelee |
| [sanara.md](sanara.md) | Sanara, NanoRumble 1v1 (0.1 entered, 5th) |
| [kitlab.md](kitlab.md) | JayLexi (MiniRumble) and Eveimear (MicroRumble) |

## Proposals

Designs that are written down and estimated but not built.

| Doc | Topic |
|---|---|
| [sepia.md](sepia.md) | Sepia as built: the ink planner, the jet cycle and the ink surf, the lab arms and how to run them |
| [sepia-design.md](sepia-design.md) | Sepia, a second 1v1 robot on Hadur's kernel: ink cover, the jet cycle, the hub of species, its EARS rows, bench cards and an estimated APS |

## Plans and studies (historical)

Each is the plan or study as it stood when its work ran; the outcome is in the release notes
and in [strategy-evolution.md](strategy-evolution.md).

| Doc | Topic |
|---|---|
| [druss-route-plan.md](druss-route-plan.md) | DrussGT route, D1 to D6 (3.8) |
| [team-plan-t1.md](team-plan-t1.md) | Teammate collisions and friendly fire (T1) |
| [top20-analysis.md](top20-analysis.md) | 3.4 against the top 19 |
| [leak-38-plan.md](leak-38-plan.md) | Winning back 3.8's 1v1 leak |
| [rumble-climb-r4-r6-plan.md](rumble-climb-r4-r6-plan.md), [rumble-climb-top30-plan.md](rumble-climb-top30-plan.md), [rumble-climb-top15-plan.md](rumble-climb-top15-plan.md) | The rumble climb, R4 to R11 |
| [rumble-memory-scale-plan.md](rumble-memory-scale-plan.md), [skipped-turns-plan.md](skipped-turns-plan.md) | Memory and skipped turns at rumble scale (R8) |
| [plan-3.11-census.md](plan-3.11-census.md), [plan-3.12.md](plan-3.12.md) | 3.11 field census and 3.12 |
| [plan-90.md](plan-90.md), [plan-midrange.md](plan-midrange.md), [plan-top5.md](plan-top5.md), [plan-top3.md](plan-top3.md), [top5-pc-cards.html](top5-pc-cards.html) | The 1v1 climb from 87.7 APS toward the top 3 |
| [plan-mode-table.md](plan-mode-table.md), [plan-shield-quality.md](plan-shield-quality.md), [plan-aes.md](plan-aes.md) | Per-opponent mode table, SHIELD-16, the AES assessment |
| [top3-movement-study.md](top3-movement-study.md) | How the best movers move |
| [plan-melee-top5.md](plan-melee-top5.md) | Melee to the top 5 |
| [plan-team-top5.md](plan-team-top5.md) | HadurTeam to the top 5 |
| [plan-saor-first.md](plan-saor-first.md) | Saor to 1st in MicroMelee |
| [course-plan.md](course-plan.md) | The plan for the tutors' course in `course/` |

## Elsewhere

| Where | What |
|---|---|
| [archive/](archive/) | The requirement notes that sat between the old tables, the old follow-up list and the first copy of the architecture evolution plan |
| [bench/](bench/) | Bench reports and run read-outs, by date |
| [legacy-features/](legacy-features/) | The Gherkin features of the first robot, before Hadur 2 |
| `../hadur-bench/plans/` | Bench cards: queues, arms and the full card specs |
