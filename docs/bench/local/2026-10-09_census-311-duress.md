# 3.11 census, M3 follow-up: start-up duress

Date: 2026-10-09. Reads the M1 census rows (PR #165) again for one question the findings left open:
what the round-0 duress in 63% of Hadur's battles costs. Analysis only; no robot code changed.
Script: `python3 data/tools/census_duress.py`. It applies the census row rules first (drops the 612
"another JVM" rows and the 35 further battles with duress after round 0); `--keep-all` keeps them
and reads 0.69 instead of 0.62.

## What duress is

RES-9 (`hadur2.core.duel.Duress`): once the engine skips 3 of Hadur's turns in a round
(`TickBudget.DURESS_SKIPS`), the core drops to a fallback until 300 ticks pass without another skip
(RES-14): no gun waves, no surf, no samples. It orbits at the distance floor and fires head-on at
power 1.0. The census rows show 298 ticks (one episode) in 1,676 Hadur battles and 596 (two) in 382,
out of 4,844 paired battles. Round 0 averages about 5 skipped turns (class loading and JIT warm-up;
M0 rounds file), later rounds about 0 to 1. Against a band 6 bot a round lasts about 445 ticks, so
one episode is most of round 0 played without the gun or the surf.

## What it costs, within each opponent

Each opponent's battles with duress against its battles without, so the opponent cancels. Tomcat on
the same opponent and seeds is the control: if the seed or the host slot were harder, Tomcat would
drop too.

| Band | Opponents with both | Hadur share, duress minus none (95%) | Damage Hadur takes, extra a battle | Tomcat, same seeds (95%) | Battles with duress | APS cost |
|---|---:|---:|---:|---:|---:|---:|
| 3 (51-200) | 123 | -1.58 (±1.26) | - | -0.01 (±0.82) | 44% | 0.08 |
| 4 (201-400) | 139 | -1.59 (±0.81) | +38 | +0.58 (±0.60) | 61% | 0.19 |
| 5 (401-700) | 217 | -1.30 (±0.56) | +52 | -0.14 (±0.32) | 61% | 0.17 |
| 6 (701+) | 334 | -0.72 (±0.21) | +27 | -0.05 (±0.12) | 68% | 0.17 |
| All bands | | | | | 61% | **0.62** (0.45 to 0.62) |

APS cost: each opponent's share of battles with duress times its band's within-opponent
difference (gap to Tomcat, duress minus none), summed over the band's opponents, over 1,215.
Opponents with duress in every battle or in none have no difference of their own and take the
band's; counting only the opponents that have both kinds of battle gives the lower bound, 0.45.

- Tomcat is level on the seeds where Hadur hit duress, so the loss is Hadur's, not the seed's or
  the slot's.
- Split by duress, the gap to Tomcat in band 4 is -1.34 with duress and +0.92 without; in band 6
  -1.69 and -1.03. Without duress Hadur still trails in ranks 401 and below (about -0.4 APS of the
  gap), so duress is one mechanism, not all of it.
- Skipped turns alone barely matter within an opponent (r -0.07 to -0.08 against share in bands 5
  and 6); the cost comes with the switch to duress.

## What is not known

- **Whether live clients hit it as often.** Duress depends on host load: 63% of census battles,
  21% of the 48 M0 battles (same host, same parallel 12, a short run), 0 of 8 baseline battles in a
  Linux container at parallel 3. The bench gap agrees with live within 0.14, which suggests live
  pays something similar, but that is inferred. M4 step `p4` measures the rate at parallel 4.
- **Whether it is round 0.** The rounds files were not committed. On the PC:
  `python3 data/tools/census_rounds.py <the census rounds files>` prints, per band, rounds 0, 1 and
  2-34 for battles with and without duress. Extra damage in round 0 only means the start-up skips;
  every round worse means something else about those battles.
- TIME-3 learns the battle's tick allowance from the first skipped turn, which is a round-0 warm-up
  skip, and sheds against it for the rest of the battle. That may cost too; it is the `nl` candidate.

## Candidates (M4 screen, `hadur-bench/plans/m4-311.queue`)

Each is a one-line edit made by `build-ablation.sh` from the v3.10 tag:

| Build | Change | Risk |
|---|---|---|
| 3.10nd | RES-9 duress never switches on | a client that really is too slow: the robot keeps running the full gun and surf and skips more turns |
| 3.10nl | TIME-3 learns no allowance | shedding reacts to the adapter's guess, not the measured tick |
| 3.10ndnl | both | both |

Screen: `screen-311.txt`, 400 census bots drawn in proportion to band size, 2 fresh seeds, paired
against 3.10. A build goes to the full census only with a mean of +0.25 or more (the G2 threshold)
and an interval above 0, and no band below -0.05 APS. If one passes, the census run also needs a
loaded-host check before any release, because duress exists for slow clients.
