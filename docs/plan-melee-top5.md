# Melee: a plan from 17th to the top 5 (2026-10-25)

Leigh, 2026-10-25 20:30 UTC: "We have learned a lot about melee and are sitting in 17th. Top 5 is
the goal here as well. I'd like a plan that we can follow to get us there."

This plan starts from what is already measured: the 3.13 gap read
([melee-gap-3.13.md](bench/melee-gap-3.13.md)), the melee gun stage M7
([melee-gun-3.13.md](bench/melee-gun-3.13.md)), the PC census of 3.14 against 3.13
(`bench/local/2026-10-17_melee-census-314-vs-313.md`, 46 fields, 4 seeds), the Ogi deep dive
([ogi-deep-dive.md](bench/ogi-deep-dive.md): Ogi's melee, team and 1v1 entries are one jar), and
the lessons from the 1v1, team and Saor work. The new numbers come from the live pages read at
20:31 UTC today (archived in `data/rumble/pages/2026-10-25T2031Z_meleerumble_*`) and from a
re-read of the 3.14 census with `data/tools/melee_gap.py` (new, tests in CI).

## 1. Where Hadur stands and what top 5 needs

| Rank | Robot | APS | Survival (rounds won) |
|---|---|---|---|
| 1 | aaa.r.ScalarR 0.005g.047 | 72.75 | 82.7 |
| 3-4 | jd.Nullstride 2.3.3, cb.fire.Firestarter 2.0f | 71.47 | 74.4, 74.2 |
| **5** | **cz.libors.Ogi v1** | **70.72** | **68.6** |
| 6 | voidious.Diamond 1.8.28 | 70.12 | 68.5 |
| 7 | justin.DemonicRage 3.4 | 70.01 | 61.4 |
| 10 | ags.Glacier 0.2.11 | 68.87 | |
| **17** | **hadur2.Hadur 3.15** | **66.30 ± 0.17** | **43.5** |

- The page still scores the 3.15 entry. **3.17 plays melee exactly as 3.15 does**: no melee
  replay fixture changed between v3.15 and master (the team work since then is team-only).
- **Fifth needs +4.42 APS live.** Sixth needs +3.82, tenth +2.57. This is larger than any
  melee step so far (the biggest was MGUN-7, +0.88 on the census, about +0.7 live).
- **The bench reads the live ladder well.** Hadur's per-opponent share on the 3.14 PC census
  against its live per-opponent APS: r = 0.95 over 413 opponents, bench higher by +0.78 on
  average (live 66.41, census 67.19 on the same opponents). The same shape as 1v1 (bench about
  0.7 above live, gains carry 1:1), and MGUN-7's census gain carried live.
- **Bar for "census projects top 5":** census APS of at least 71.6 (Ogi 70.72 + the 0.8 offset
  + a small margin), which is **+4.4 over 3.14's census (67.2)**. Read as live, that is about
  70.8, level with Ogi and below Nullstride and Firestarter at 71.47.

## 2. Where the points are

### 2.1 By opponent band, against Ogi (5th)

`melee_gap.py live`, Hadur 3.15 against Ogi v1 over the 414 opponents both have met. "Survival"
is the page's per-opponent column: the share of rounds the robot won in battles with that
opponent.

| Opponent ranks | n | Hadur | Ogi | APS from band | Hadur survival | Ogi survival |
|---|---|---|---|---|---|---|
| 1-10 | 9 | 43.8 | 49.8 | +0.13 | 18.2 | 44.4 |
| 11-30 | 19 | 50.7 | 57.2 | +0.30 | 31.8 | 60.2 |
| 31-60 | 30 | 53.9 | 59.2 | +0.39 | 37.0 | 61.3 |
| 61-100 | 40 | 56.8 | 62.2 | +0.52 | 39.1 | 68.9 |
| 101-200 | 100 | 62.5 | 67.3 | +1.15 | 44.5 | 68.6 |
| 201-300 | 100 | 69.1 | 73.3 | +1.02 | 47.2 | 71.1 |
| 301+ | 116 | 78.1 | 81.3 | +0.90 | 46.6 | 71.4 |

Diamond (6th, +3.81), DemonicRage (7th, +3.69), Firestarter (+5.16) and Nullstride (+5.15) have
the same shape: 3 to 8 points against every band, so the bands just weight by their size.

**Read this table with care in melee.** A melee pairing is not a duel: Hadur's share against a
weak robot depends on Hadur's whole score in that battle, which is decided by the strong robots
in the same field. The band split says the gap is a whole-field habit (as the 3.13 read found);
it does not say Hadur plays badly against weak robots.

### 2.2 Rounds won: the defining number

The robots above Hadur win far more rounds. Ogi and Diamond win 69% of their rounds, DemonicRage
61%, Mirage (11th) 53%; Hadur wins 43%. On the 3.14 census Hadur won 47% of rounds, and how many
depends almost entirely on the strongest robot in the field:

| Strongest opponent in the field | Fields | Hadur rounds won |
|---|---|---|
| a top-10 robot | 7 | 18% |
| ranks 11-30 | 13 | 36% |
| ranks 31-60 | 15 | 54% |
| ranks 61+ | 11 | 70% |

A within-field fit over the census's 368 battles (field as a fixed effect) puts one more round
won per 35-round battle at about **+0.29 APS** (damage left free to move with it). The gap to
Ogi in rounds won, about 25 points (9 rounds a battle), is the size of the whole 4.4.

### 2.3 How rounds are lost: the endgame duel and the crowd

Per 35-round census battle (3.14):

| | Rounds a battle | Share |
|---|---|---|
| Won | 16.6 | 47% |
| Lost in the endgame duel (Hadur and one other left) | 8.0 | 23% |
| Died with two or more others alive (the crowd) | about 10.4 | 30% |

**The endgame duel against strong robots is lost far more often than Hadur's 1v1 rank says.**

| Survivor's melee rank | Duel endings a battle | Hadur won | Win rate |
|---|---|---|---|
| 1-10 | 2.04 | 0.42 | **21%** |
| 11-30 | 3.35 | 1.60 | **48%** |
| 31-60 | 5.18 | 3.49 | 67% |
| 61-100 | 4.77 | 3.66 | 77% |
| 101-200 | 6.43 | 4.89 | 76% |
| 201+ | 2.85 | 2.54 | 89% |

Against single robots: Diamond 5% of 77 duels, Firestarter 3% of 33, ScalarR 8% of 59, Medina
17% of 76, Neuromancer 16% of 57, Combat 20% of 54. Hadur is 7th to 8th of 1,200 in 1v1, about a
point behind Diamond there, so a 5% endgame against Diamond is not a duel-skill problem. The likely
causes, none measured yet: Hadur reaches the last two with less energy; the duel starts from a
clean slate (MELEE-2), with the 1v1 profile only, while the survivor has hundreds of ticks of
melee data on Hadur; and the 1v1 per-opponent mode table does not act in melee. Saor found the
same thing on the MicroMelee ladder (it loses most endgame duels, and only uncapped one-on-one
power helped across the board, `docs/saor.md`).

**The crowd.** Hadur dies before the last two in about 30% of rounds. Rounds won by robots ranked
101+ are 13.5% of all rounds on the census, so a fair share of those deaths are not to the
field's strongest robot.

### 2.4 Damage

On the 2026-10-16 census fields (`data/bench/2026-10-16_melee-census-gk-vs-313_firepower.tsv`)
Hadur with MGUN-7 does 124 damage a round; the top 12 do 153 to 203 (Diamond 183, ScalarR 198,
Medina 203, Mirage 156). Hadur's hit rate is already good (25.6% against Diamond's 23.5%); the
difference is shots (72 a round against 83, partly time alive) and power (1.29 against
1.4-1.85). Power alone was a wash before (mpow: +27% damage, APS +0.1) because the extra damage
was paid for in survival; what carried was a better gun (MGUN-7: +8% damage, +0.88 census).

### 2.5 What this means

The 4.4 is mostly rounds Hadur does not win against the one or two strong robots in each field:
about a third in the endgame duel, the rest in the crowd and in damage done while alive. Ogi,
fifth, gets there with architecture, not a lookup table (its melee is the same jar as its team
entry): a danger model per enemy with 13 simple aims, a minimum-risk move with "who is nearer the
shooter" weighting and a probability wave check of its 8 safest points, a play-it-forward kNN gun
over all enemies with records kept across rounds, and a true surf in the last duel.

## 3. Lessons that carry from 1v1, team and Saor

| Lesson | Where from | What it means here |
|---|---|---|
| The census reads live 1:1 for gains, with a fixed offset | 1v1 3.16/3.17, team C (+2.9 bench, +2.7 live), melee MGUN-7 | Gate every step on the PC census; the offset is +0.8 in melee |
| Per-opponent tailoring is the only thing that moved 1v1 live | 1v1 mode table | In melee it applies where a duel happens: the endgame survivor (Stage 1) |
| Global switches in melee movement and fire policy were washes | mpow, mhold (-6), mrate, gtgs, gwin | Do not spend PC hours on power, hold or fire-age switches again |
| Certain bullets along a path hem the robot in (-3 to -5) | M4 route scoring | Use Ogi's form: a probability profile, aimed-at weights, only the 8 safest points re-ranked |
| Ogi's wave check alone was flat in team | team step D (TMODE-11, PR #258) | Screen it in melee, but expect the gain from the danger model, not the check alone |
| Team gains came from a missing capability, not a tweak | team C fire lane | Build capabilities Hadur lacks (endgame carry-over, play-it-forward gun) |
| Uncapped one-on-one power wins endgame duels | Saor PC card | First arm of Stage 1 |
| Never hard-code the robot version in card args | pc-team-hunt rerun | Cards use `@V@` templates |

## 4. The plan

Each stage builds behind a melee-only switch, smokes on the cloud's five top-20 fields
(`./bench-melee-top20.sh --seeds 3 --parallel 2 --baseline <3.17 jar>`, about 75 minutes), then screens on the PC census
against 3.17 with an A/A arm. A stage that passes ships on master as a default for melee only.
Gains stack on master; there is no melee-only release (Hadur is one jar), and the release rule
stays: no release until the census projects top 5 (section 1 bar), alongside the 1v1 and team
rules in the tracker.

| Stage | What | Expected census APS | PC |
|---|---|---|---|
| 0 | Fresh baseline and the missing measurements | 0 (sets the bar) | 1 card, ~1.5-3 h |
| 1 | Endgame duel | +0.3 to +0.8 | 1 card, ~2-3 h |
| 2 | Play-it-forward melee gun | +1.0 to +2.5 | 1 card, ~2-3 h |
| 3 | Crowd survival: danger model and wave check | +0.5 to +2.0 | 1-2 cards, ~3-5 h |
| 4 | Stack census and endgame tailoring | +0.1 to +0.4, and the confirm | 1 card, ~3 h |
| | **Total** | **+1.9 to +5.7, central about +3.3** | **~12-17 h** |

**Honest read:** the central estimate lands near a census of 70.5, live about 69.7: 8th, ahead
of Portia and Shadow, behind DemonicRage. Top 5 needs the upper half of Stages 2 and 3. Tenth
(+2.6 live) should come from Stages 1 and 2. The plan says where to stop and rethink (section 6).

### Stage 0: baseline and measurements (no robot change)

1. **Refresh the census field** from the 2026-10-25 rankings (`hadur-bench/melee-census-317.txt`,
   46 fields of 9 made by `tools/melee_s0.py fields`, seed 317): all 414 robots but Hadur, Ogi
   and every top-10 robot included. Nullstride is left out because the robot archive has no jar for it (404).
2. **Bench measurements** (BENCH-103, bench-side only, so the robot and its fixtures are
   untouched): `rounds.csv` adds the tick the field fell to two, Hadur's and the survivor's
   energy then, and the damage Hadur took with three or more alive and with two. The rank
   at death and the killer were already recorded (BENCH-40).
3. **PC card `pc-melee-s0`** (`hadur-bench/plans/pc-melee-s0.queue`, BENCH-104): master (aa)
   against master (bb) on the new census, 4 seeds (368 battles) at the machine's melee width and
   CPU constant (BENCH-105: 12 workers on the PC; a laptop runs narrower after its host check), then
   six fields at half that width for the skipped-turn check, then `tools/melee_s0.py read` and a results PR on
   `claude/pc-melee-s0-results`. It gives the baseline census APS, the noise of the paired
   difference, the PC battle time, and the endgame and death tables for today's field.
4. **Read** (cloud): which of the endgame causes is real (energy deficit at hand-off, cold duel
   gun, mode), and where crowd deaths happen (count alive, killer distance, phase).

Gate to move on: A/A paired difference within ±0.2 with a 95% interval under ±0.3; skipped
turns at the chosen width no worse than at 6.

### Stage 1: the endgame duel

**Stage 0 result (2026-10-26, PR #292).** Census 66.99 ± 0.30 (live projection 66.19, beside
3.15's live 66.30): +4.61 to the 71.6 bar. A/A +0.20 ± 0.30 at 4 seeds, at its limit, so screens
need more seeds. Hadur dies with two opponents left in 12.8% of rounds, the largest share of its
deaths. It enters the endgame duel on 38.9 energy against a top-10 survivor's 59.4 and wins 17%
(44% even when ahead: the duel against the top 10 is a gun problem, Stage 2); against ranks 11-30
on 38.4 against 47.6 and wins 56% (89% ahead, 37% behind: the energy deficit). Damage taken a
round is 66.0 with three or more alive, 4.8 in the endgame.

**The Stage 1 card (`pc-melee-s1`, BENCH-109) therefore opens with e-entry**, as three switches
on the phase with two opponents left, where Hadur today already plays the duel (MMOVE-4's small
ring and high lateral weight, MGUN-2's duel power table): MEND-1 `e3ring` keeps the crowd's ring
and lateral weight, MEND-2 `e3pow` the crowd's power table, MEND-3 `e3far` weighs being a
survivor's closest robot 4 rather than 2 so the other two fight each other. Each is melee-only,
off a team (`melee.MeleeEndgame`). Each build runs alone on the census at 6 seeds and is paired
with an aa baseline battle for battle (`tools/melee_s0.py screen`), with a bb A/A copy; 1,380
battles. e-pow, e-carry and e-mode act in the duel itself, so they follow in a card of their own
once this one says how much of the deficit is the entry.

Built where melee hands over (MMEM-2's baton, the conductor and `MeleeSeam`), so a 1v1 battle
never takes the new path. Arms, each a melee-only switch:

- **e-pow**: uncapped one-on-one power in a melee endgame (Saor's winning arm); the duel's
  energy-race power as Ogi's `RacePower` does.
- **e-carry**: the survivor's melee observations feed the duel gun's first ticks (the baton
  already carries shots; add the survivor's movement samples), so the duel does not start cold.
- **e-mode**: the 1v1 mode table (shield, stop-and-go) chosen for the survivor in a melee
  endgame, where the table names it.
- **e-entry**: if Stage 0 finds an energy deficit at hand-off, hold back in the last three (lower
  power, wider berth to the two strongest) so Hadur enters the duel with more energy.

Expected: lifting endgame wins against ranks 1-60 from 52% to about 63% is +1.2 rounds a battle,
about +0.35; e-carry and e-mode can do more against the top 30, where 3.4 duels a battle are lost.
**Gate**: census APS with the 95% interval above 0 (from 2026-10-31; the +0.3 cut the stages first
carried is now only the mark of a gain worth a release alone), the 1-30 survivor band no worse,
A/A clean. The arms can share one card with Stage 2's first arms.

### Stage 2: a play-it-forward melee gun

**Stage 1 result (2026-10-26, PR #305).** No arm passed: er +0.14 ± 0.21, ep +0.06 ± 0.19, ef +0.29
± 0.31 (deaths with two opponents left 13.0% to 11.7%), A/A +0.01. No arm moved Hadur's energy
entering the endgame by more than 1.5 (baseline 46.5): the deficit is built across the whole crowd
phase, which is the gun's and the crowd movement's.

**What the code already has.** `FieldGun` already plays each neighbour's trajectory forward in the
opponent's own frame to the bullet's flight time, inside the walls, and `EnemyHistory`'s kd-tree
lives the whole battle (2,000 situations an opponent), so g-pif's replay and g-keep exist. What
Ogi has and Hadur lacks is the depth (24, not 12) and **features that see the crowd**: Hadur's
five describe an opponent by its distance to Hadur, speed, turn rate, time since reversing and
wall distance, while a melee robot moves by its own nearest robot. g-pow stays out (power alone
failed twice: mpow, and Stage 1's ep).

**The Stage 2 card (`pc-melee-s2`, BENCH-110)**: g4 (`g24`, K = 24 off a team), gc (`gcrowd`,
MGUN-11: the opponent's nearest robot's distance, its heading toward or away from it, opponents
alive), g4gc (both), and ef again on fresh seeds (3177-3182) so its two runs pool to 12. 1,656
battles. Gate as below; ef at +0.3.

Hadur's `FieldGun` takes K = 12 situations an opponent (MGUN-7) and sums densities. Ogi's melee
gun plays each of 24 neighbours forward to the bullet's flight time in the enemy's own frame,
with features that see the crowd (distance and direction to the enemy's nearest robot, enemies
alive), weights by match quality and by distance to the target, fires where the most weight
across all enemies lands, and keeps records across rounds per opponent (up to 1,500). Our own
version, written from the description:

- **g-pif**: play-it-forward replay of each neighbour's path (walls respected), K = 24, the crowd
  features, the distance weighting.
- **g-keep**: records kept across rounds and capped (check first how long `FieldGun`'s situations
  live today; keep them across the battle if they do not).
- **g-pow**: power from 1.92, 3.0 within 200 px or when the gun reads above 55% on that opponent,
  capped by the target's energy (Ogi), only on top of g-pif (power alone failed before).

Expected: closing a third to a half of the damage gap to the top 12 (+15-25% damage a round)
at MGUN-7's rate (+8% damage gave +0.88) is +1.0 to +2.5. **Gate**: +0.5 census APS, interval
above 0, Hadur's survival (rounds outlived) not down more than 1 point, no band below -0.5.
Team keeps its K = 3 gun unless the team thread screens it.

**Stage 2 result (2026-10-26, PR #316).** Against aa alone no arm passed, but the A/A came out at
+0.23 ± 0.22 (aa drew low). Paired battle for battle with the mean of aa and bb: g4 (K = 24)
**+0.34 ± 0.16**, g4gc +0.28 ± 0.18, gc +0.05 ± 0.15 (the crowd features add nothing), ef +0.13 ±
0.18, and ef pooled with Stage 1 over 12 seeds **+0.21 ± 0.16**. Depth is a real gain, ef a small
real one; both are under their bars. Stages 1 and 2 together come to about +0.55, under section 6's
+1.0 stop line: top 5 is out of reach on this core (census 66.99 + 0.55 projects about 66.7 live,
near today's 16th).

**Banking them (`pc-melee-bank`, BENCH-115):** g24 and e3far in one build (g4ef) beside aa and bb
on the census at 8 fresh seeds (3183-3190), 1,104 battles; g4ef pairs with the mean of aa and bb
(`screen --base2`) and passes at +0.3 with the low end above 0 and survival no more than 1 point
lower. A pass turns both on in master.

**Movement rebuild, step M0: the crowd exposure read (2026-10-26, BENCH-116).** Leigh chose to
bank g4 + ef and then rebuild the melee movement. Before building, master ran on 12 census fields
(every fourth, 1 seed, cloud; docs/bench/local/melee-exposure-317.md) with the new exposure.csv:

| Robots | Crowd damage taken per 100 crowd ticks | As the shooter's nearest | Nearest of | Crowd ticks a round |
|---|---|---|---|---|
| Hadur | 8.7 | 53% | 0.83 | 775 |
| Ranks 1-10 | 8.9 | 51% | 0.78 | 707 |
| Ranks 11-30 | 9.7 | 51% | 0.82 | 718 |
| Ranks 31-100 | 11.2 | 54% | 0.86 | 625 |

Hadur's crowd movement already takes damage at the top 10's rate and stays alive longer. In the
same battles (melee.csv) its survival score beats the top-10 robots' (13,333 a battle against
12,660), and its bullet damage trails (4,244 against 5,211). The difference is firepower: in the
crowd the top 10 fire at 2.62 power on average against Hadur's 1.64, at a similar hit rate (36%
against 39%) and damage per power spent (1.84 against 1.91), so they deal 125 damage a round there
against Hadur's 94 and win 74 energy back against 57. **A movement rebuild aims at a part that is not
behind;** the gap is the crowd's bullet power, now on a better gun (g4). Power alone was flat twice
on the older gun (mpow +0.1 on 3.13's K = 3 gun; Stage 1's ep +0.06), so a power stage must be
screened on top of g4ef.

**Firepower result (2026-10-26, PC card pc-melee-power, PR #320).** Leigh chose the firepower stage
over a movement rebuild. On master (K = 12 gun), each arm alone on the census at 6 seeds (3191-3196),
paired with the mean of aa and bb:

| Arm | Paired APS | 1-30 endgame wins | Others outlived | Verdict |
|---|---|---|---|---|
| bb (A/A, against aa) | +0.21 ± 0.32 | -0.2 pp | +0.3 pp | clean |
| pf (MGUN-12, floor 1.9) | +0.44 ± 0.18 | +0.2 pp | -0.4 pp | pass |
| po (MGUN-13, Ogi's 3.0 within 200 px, else 1.92) | **+0.62 ± 0.18** | -1.5 pp | +0.2 pp | pass |

po is the largest single melee gain of this plan. The bank card (BENCH-115) now also carries
g4efpo, the whole stack (g24 + MEND-3 + MGUN-13), so one run confirms Stage 2's gains and whether
crowd power adds on top of the better gun; a second read pairs g4efpo with g4ef itself, and MGUN-13
goes on master only if that difference is above 0 at the 95% low end. With the gains adding, the stack is worth about +1.2 of
the +4.61 to the census bar.

**Bank result (2026-10-26, PR #322).** The bank card ran before the g4efpo arm was added. g4ef
(K = 24 + MEND-3) against the mean of aa and bb, 8 seeds: **+0.62 ± 0.14**, PASS; 1-30 endgame wins
+2.8 pp, deaths with two left -0.9 pp, others outlived +1.3 pp; A/A -0.03 clean. Both are now on
master (MGUN-7's K = 24, MEND-3 on; `melee-samples` and `melee-handoff` re-recorded, melee pin moved;
duel and team fixtures unchanged). `pc-melee-ogi` (BENCH-118) screens MGUN-13 on that master at 8
seeds, passing if it adds at all (95% low end above 0).

**Ogi result (2026-10-27, PR #330).** On that master, po against the mean of aa and bb, 8 seeds:
**+0.57 ± 0.18**, PASS (1-30 endgame wins -1.3 pp, others outlived +0.1 pp; A/A +0.05 clean).
MGUN-13 ships on. Banked since Stage 0's census (66.99): about +1.2, so the census reads about 68.2
against the 71.6 bar, about 3.4 short.

**Exposure read on the banked build (2026-10-27, cloud, the same 12 fields x 1 seed as M0).** Hadur's
score is now level with the top 10's (19,873 a battle against 19,936; 19,366 before), its survival
still ahead (13,338 against 12,810) and its bullet damage still behind (4,691 against 5,346). Crowd
damage taken is unchanged (8.8 per 100 crowd ticks against the top 10's 9.6). MGUN-13 lifted Hadur's
mean crowd power only from 1.64 to 1.85, against the top 10's 2.56: the rule is idle with two
opponents left, under 20 own energy, and fires 1.92 rather than 3 between 200 and 300 px.
`pc-melee-power2` (BENCH-122) screens each of those (MGUN-14 two left, MGUN-15 from 10 energy,
MGUN-16 power 3 to 300 px) alone and all three together.

**Firepower part 2 result and the top-10 confirmation (2026-10-28).** The power2 card (PR #349):
MGUN-14 +0.06, MGUN-15 +0.04, all three -0.02, all failed; MGUN-16 +0.15 ± 0.15, its low end only
just above 0 on 6 seeds, held back. 3.18.1 reads 13th live at 67.92, beating its projection; 10th
(Mirage) is 68.24, +0.32 away. `pc-melee-wide` (BENCH-127) re-runs MGUN-16 alone on 8 fresh seeds
(3211-3218) with the same read; a pass turns it on in master. Firepower widening is otherwise spent:
the rest of the gap to 5th (+2.19 to Diamond's 70.11) needs Stage 3 or a bigger idea.

**MGUN-16 ships in 3.19 (2026-10-28).** Leigh chose to ship it in 3.19 on the power2 result alone
before `pc-melee-wide` ran; the card is retired and 3.19's live melee page is the read.

**3.19 live and Stage 3 (2026-10-29).** 3.19 reads 14th at 67.77; 10th is kc.mini.Mirage at 68.23
(+0.46), a 1,479-byte MiniMelee robot. On their 416 shared opponents Hadur is level with Mirage
against the top 10 (+0.14) and the weakest 216 (+0.18) but 1 to 1.6 APS behind against ranks 11-200,
with survival 4 to 6 points lower in every band: the crowd, as Deise's bench found against Mirage
(same damage, same final duels, last two reached 64% against 76%). Mirage's movement is Hadur's
family: least risk with virtual head-on and linear bullets. It differs in four choices, and
`pc-melee-crowd` (BENCH-137) screens one Hadur switch for each, with Hadur's own knowledge where
it has more: MMOVE-11 weighs a seen shot by the robots nearer its shooter (Mirage counts only
likely aimers; this is m-closer's bullet half), MMOVE-12 short hops (Mirage reaches 0.4 of its
target's distance, 30 to 150 px; Hadur 100 to 300), MMOVE-13 assumed shots from whoever Hadur is
nearest to, on the tick its gun could be cool by its last seen shot (Mirage assumes every tick),
and MMOVE-14 m-closer's push half. Gate +0.30, low end above 0, CPU guard by hand.

### Stage 3: crowd survival

The largest lever and the riskiest: M4's path scoring cost 3 to 5 APS, and the team's port of
Ogi's wave check alone was flat. Arms, in this order, each melee-only:

- **m-closer**: in the minimum-risk sum, an enemy's term divided by (1 + robots nearer that enemy
  than the point is), and each detected shot weighted by `1/(1+k)^2` with k the robots nearer
  the shooter (Ogi's aimed-at weight). Cheap, no path simulation.
- **m-danger**: a danger profile per enemy shot: the 1v1 side's `SimpleAims` and the kNN mixed by
  exponential weights (Ogi's DangerModel; `physics/SimpleAims` is pure and reusable).
- **m-wave**: the 8 lowest-risk destinations driven 30 ticks with the danger profiles, scored
  `risk/median + 3 x damage/median` (Ogi's form; Hadur's own TMODE-11 code is the start, with a
  melee switch).
- CPU guard: each arm reports skipped turns; a melee arm that raises them more than 20% is
  rejected whatever its APS (melee is CPU-sensitive, M4).

Expected: cutting crowd deaths by a quarter (2.6 a battle) turns about 1.7 of them into wins and
raises survival points: about +0.9, range +0.5 to +2.0. **Gate** as Stage 2. If m-closer and
m-danger are both flat, stop Stage 3 there (section 6).

**Melee surfer (MMOVE-15, 2026-10-29).** The top three (ScalarR, Neuromancer, Firestarter) all surf
learned enemy waves in melee; Hadur's melee movement only ever dodges head-on and linear guesses.
Leigh chose to build that before more single-knob arms. MMOVE-15 (`MELEE_SURF`, arm `msurf`/`ms`)
is m-closer's shot weight, m-danger and m-wave in one switch, our own build from Hadur's team
pieces: each seen shot is a wave weighed `1/(1+k)^2`; once Hadur has 5 hits from a shooter, that
shooter's bullets are its learned aims (the team's kNN log, fed off a team by Hadur's own hits);
the destination is the wave check (TMODE-11). Card `pc-melee-surf` (BENCH-136): aa, bb, ms on the
census at seeds 3225-3230, the Stage 3 gate and CPU guard.
Cloud smokes (12 census fields x 2 seeds, builds run side by side): the first build, every learned
aim of a shot as a bullet, read +0.13 ± 0.66 against the first aa run (+0.25 ± 0.64 against the
rerun) with skipped turns +50% (24 to 36 a battle), which the
CPU guard would fail. Keeping each shot's 4 nearest aims at the shot's whole weight, within MMOVE-3's
bullet cap: +0.56 ± 0.73 against an aa rerun (aa vs aa +0.12 ± 0.53), skips 24 vs 26, others
outlived +2.3 points, deaths with two left -2.4 points. Level to positive and CPU-clean: carded.

**Melee gun inspired by Ogi (MGUN-17..20, 2026-10-30).** Leigh: "Lets explore its gun for melee its
clearly working for it. Our goal is not to beat Ogi 1:1 its to beat the field. Lets not copy it
directly lets be inspired by it." Hadur's field gun already has Ogi's depth (24 situations) and power
(3 inside 300 px); the crowd features read null (MGUN-11). Four further ideas, each Hadur's own take,
each a switch off a team only:

- **MGUN-17 aim experts** (`EXPERTS`, arm `gexp`/`gx`). Ogi blends simple aims by how well each has
  been doing. Hadur already sends a virtual wave at every opponent on every gun cycle (MGUN-4); each
  wave now also scores head-on, linear and circular aims, decayed 0.95 a wave. After 20 waves, a simple
  aim that hits an opponent 1.25 times as often as the field gun takes it, as one solution weighted by
  what the field gun's own peak held of that opponent times the hit-rate edge, so the opponent pulls
  on the crowd peak by how likely a shot is to hit it. A robot the situations miss but a simple aim
  reads (oscillators, wall-huggers, sitting ducks) gets that aim. The first build shared every
  opponent among the four aims by hit rate to the fourth power; its single-angle solutions outweighed
  the field gun's spread ones at the crowd peak, and two cloud smokes read -1.47 ± 1.01 and
  -0.88 ± 0.53 with 6 less energy entering the endgame.
- **MGUN-18 hit-rate targeting** (`HIT_TARGET`, `grate`/`gr`): weight times 5 (hits + 1)/(waves + 5) of
  the aim the gun fires at the opponent, so the density peak leans toward robots we actually hit. (The
  smoked build used the best of all four aims' hits, which also favoured robots only an unused simple
  aim would hit; fixed after review, not re-smoked.)
- **MGUN-19 flatter distance** (`FLAT_DISTANCE`, `gdist`/`gd`): (100/d)^0.7, Ogi's d^-0.686 in our units;
  far robots in a dense line count for more.
- **MGUN-20 softer matches** (`SOFT_MATCH`, `gsoft`/`gv`): 1/(distance + mean distance), Ogi's
  1/(match + 1.6) scaled to our distances, so one near-identical situation cannot take an opponent.

Forced on together, the duel and team replay fixtures play bit for bit; only the melee fixtures
change. Card `pc-melee-gun` (BENCH-143): aa, bb and the four arms on the census at seeds 3234-3239,
the Stage 3 gate and CPU guard. A passing arm stacks with the melee surfer (if it passes) on fresh seeds.

**Result: parked (2026-10-30).** Cloud smokes on 8 census fields (docs/bench/local/melee-gun-smoke*-read.md):
on 1 seed every arm read below aa (gx -1.47 ± 1.01, gr -0.24, gd -0.91, gv -0.87); on 2 more seeds with an
A/A copy (bb -0.13 ± 0.86, clean) gx read -0.88 ± 0.53 and gr +0.18 ± 0.57; the v2 experts above
read -0.36 ± 0.50. Both expert builds entered the endgame about 6 energy lower. The parts of Ogi's gun
that pay (depth, power 3 close in) are already in Hadur. Leigh chose to park the line: the switches
stay on master, off, and `pc-melee-gun` is retired before it ran.

**ScalarR-inspired switches (MGUN-22, MMOVE-16..21, 2026-10-31).** Seven ideas from ScalarR's movement
and gun, each our own build on the melee surfer, each a switch off a team only (card `pc-melee-scal`,
BENCH-146; results PR #484, read `docs/bench/local/melee-scal-read.md`): aim-share wave weights (wm),
distance-and-energy power (ec), path danger (wq), robot shade (bs), cross-learning from hits on
others (xh), own-bullet shade (bw) and a two-wave step search (fv). On 46 fields x 6 seeds (276
battles an arm, bb -0.03 ± 0.21 clean): xh +0.19 ± 0.14 (low end +0.05, endgame level, skips +18%),
ec +0.18 ± 0.15 (endgame -4.8, skips +43%), bw +0.10 ± 0.15, wm +0.08 (skips +93%), bs +0.06
(endgame -3.7), wq 0.00, fv -0.20 ± 0.21. The cloud smokes (+0.45 to +0.94) did not repeat. No arm
cleared the +0.3 cut; Leigh (2026-10-31): "Where is the .3 coming from? It seems excessively high
and we are leaving .19 on the table." The cut was this plan's, set above the early A/A noise
(±0.3 at 4 seeds), and 6-seed screens resolve ±0.15, so the gate above drops the APS cut: the low
end above 0 with the endgame, survival and skip bars held passes. **MMOVE-19 ships on from 3.21**
(cross-learning, the one arm that passes that gate); ec, bs and wm fail their endgame or skip bars,
bw, wq and fv are inside noise. The line is closed; nothing further goes on the PC until the surfer
and xh are live and read per opponent on ranks 11-100.

**Diamond-inspired switches (MMOVE-22, MMOVE-23, MGUN-23, 2026-10-31).** Leigh: "what can we explore in
the cloud today to add to these? We have exceptionally strong reference bots to be inspired by, I'd like
something to move us even 0.5 APS"; "Survival helps so this is a good line". Diamond (5th) ships its source
under a zlib-style licence; three of its ideas, each our own build, each a switch off a team only:
**damage memory** (`MELEE_DAMAGE_MEMORY`, arm `mdmg`/`dm`: each opponent's risk term weighs by the damage it
has done to Hadur over the battle plus 10, times its mean distance, the weights averaging 1; Hadur otherwise
remembers a hit for 100 ticks), **full lateral weight** (`MELEE_FULL_LATERAL`, `mlat`/`la`: Diamond's
1 + |cos| in place of our 1 + 0.5 |cos| in the crowd) and **average-energy power** (`AVG_POWER`, `mavg`/`ea`:
at or above the field's mean energy with four or more left, 3 at any range to 700 px; below it, 1 beyond
300 px). Cloud smoke, 12 fields x 2 seeds against the same commit's aa (`docs/bench/local/dia-smoke.md`):
dm +0.44 ± 0.58 (energy entering the endgame +3.9, skips -5%), la +0.20 ± 0.75, ea -0.11 ± 0.49 with skips
+26% and 4 less energy at the endgame. Card `pc-melee-dia` (BENCH-152) screens dm and la on the census at
seeds 3253-3258 (clear of the smoke's) under the melee gate; ea stays off and uncarded. Also weighed and left: the endgame duel's
clean slate (MELEE-2; 23% of rounds are lost there, 46% won against ranks 1-30), the biggest pool but a
larger build; Diamond's radar and melee gun do what Hadur's already do; ScalarR's energy caps (E/6, E/15
beyond 325 px) hardly bite under Hadur's crowd rule, so they were not built.

### Stage 4: stack, tailor, confirm

- **Stack census** on master's defaults (all passed stages) against 3.17 on fresh seeds, 8 seeds
  (the confirm), with an A/A arm. The projection is this census minus 0.8.
- **Endgame tailoring**: per-survivor endgame choices (power race, mode) for the top-30 robots
  that still win most endgame duels, census-gated like the 1v1 table entries.
- **Release** only when the census projects top 5 (census 71.6 or more), together with the 1v1
  and team bars in the tracker. Melee gains already on master ship with whichever release comes
  first; that is fine because each passed its own gate.

## 5. Rules this plan keeps

- **Pure isolation.** Every change is behind a melee-only path (charter: two or more enemies at
  the start, no living teammate). Proof per stage: every 1v1 replay fixture and `DuelIdentityTest`
  unchanged (Stage 1 touches the hand-off, so its arms live in the conductor and the melee seam,
  and the duel package's sources keep their pin), team fixtures unchanged, melee fixtures
  re-recorded and re-pinned with the README commands.
- **Strategy before PC hours.** Stage 0's card is the only PC run before a stage has a cloud
  smoke that points the right way.
- **PC cards** go on master; Leigh starts them; one session drives the PC queue (this thread
  asks the coordinator for its slot and folds into the combined card when 1v1 or team have PC
  work); each card writes a results PR; no card hard-codes the robot version.
- **Tests, architecture, EARS.** Each stage adds its requirements to `docs/requirements.md` with
  tests and the traceability check: endgame `MEND-1..`, gun `MGUN-11..`, movement `MMOVE-11..`,
  bench and telemetry `BENCH-103..`. The melee package keeps its ArchUnit rules.

## 6. Stop rules

- Stage 0's A/A noise above ±0.3: fix the bench (seeds, width) before any screen.
- Stages 1 and 2 together under +1.0 on the census: top 5 is out of reach on this core; take the
  passed gains, report the projected rank (likely 12th to 14th), and decide with Leigh whether
  Stage 3 is worth a rebuild of the melee movement rather than arms on it.
- A stage that costs rounds won against the top-30 band (below -0.5) does not ship even if the
  mean passes.
- After Stage 3, if the stack census projects below 70.0 live, stop at the rank it gives and
  write it up; do not start switch-stacking (1v1 showed it cannot close a gap this size).

## 7. Order and what is needed from Leigh

1. This plan (PR). Then Stage 0's telemetry and census list on a PR (cloud work, no PC).
2. `pc-melee-s0` card, about 1.5-3 h, when Leigh has a PC slot (after the team HUNT rerun).
3. Stage 1 and the first Stage 2 arm built and smoked on the cloud, then one combined PC card.
4. Stage 3, then the Stage 4 stack census.

Reproduce the numbers in this plan:

```sh
python3 data/tools/melee_gap.py live data/rumble/pages/2026-10-25T2031Z_meleerumble_rankings.html \
  data/rumble/pages/2026-10-25T2031Z_meleerumble_botdetails_hadur2.Hadur_3.15.html \
  data/rumble/pages/2026-10-25T2031Z_meleerumble_botdetails_cz.libors.Ogi_v1.html
python3 data/tools/melee_gap.py census docs/bench/local/2026-10-17_melee-census-314-vs-313.md \
  data/rumble/pages/2026-10-25T2031Z_meleerumble_rankings.html
```
