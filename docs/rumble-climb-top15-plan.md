# Rumble climb, top 15: plan (R10, R11)

Planning document written on 2026-10-03, after Hadur 3.5.1 (R9: RAM-2 and MIR-1) entered the
RoboRumble 1v1 and read 21st on its first 259 pairings. It follows
[the top-30 plan](rumble-climb-top30-plan.md) (done: 3.4 reached 20th) and R9
([requirements.md](requirements.md#r9-notes-the-weak-bot-leak-shipped-as-35)).

**Status: proposed.** A Sonnet thread implements it stage by stage, one PR per stage, merged as
needed, with the usual rigour (EARS rows in `docs/requirements.md`, a tagged Cucumber scenario
per ID, unit and jqwik tests, ArchUnit unchanged, replay fixtures re-recorded when play
changes, deliberate `DuelIdentityTest` re-pins named in the PR, `hadur.climb.stage` bumped).

Goal (Leigh, 2026-10-03): **top 15 in the RoboRumble 1v1, by consolidating the pairings
against the robots ranked below Hadur.** Nothing in this plan targets the top 19.

## 1. Is 21st a regression? No: it is a partial pass

Two pages saved at 23:30 UTC, archived under `data/rumble/pages/` with parsed tables beside
them (`2026-10-03T2330Z_roborumble_rankings_top50` and
`2026-10-03T2330Z_roborumble_botdetails_hadur2.Hadur_3.5.1`, first 50 of 259 pairings by name).

| | 3.4 (2026-10-01, complete) | 3.5.1 (2026-10-03, partial) |
|---|---|---|
| Pairings / battles | 1,215 / 1,628 | 259 / 259 (19:09 to 22:03 UTC) |
| APS | 85.90 ± 0.20 | 85.54 ± 0.49 |
| Survival / PWIN | 93.92 / 99.26 | 93.83 / 98.84 |
| Rank | 20th | 21st (Phoenix 85.88 above, Roborio 85.44 below) |

- **A 259-pairing APS is a sample of opponents, and this one is within its noise.** Drawing
  259 opponents at random from 3.4's own 1,215 results gives a mean between 84.79 and 86.96
  (90% of 20,000 draws); 30% of draws read 85.54 or lower. That range spans rank 26 to rank
  13. The page's ± 0.49 is narrower than that because it does not count which opponents have
  been met yet. 3.4's own pass dipped the same way: 86.4 after its first 259 pairings, 84.7
  after 400, 85.90 complete.
- **On the same opponents 3.5.1 is not worse.** The 50 visible pairings (a name-ordered, so
  effectively random, slice of the 259) average +0.92 over 3.4's score against the same bots
  (± 1.6 at 95%, `data/rumble/parsed/2026-10-03_hadur-3.5.1_vs_3.4_common.tsv`): +0.7 against
  opponents under 60 APS, +0.7 from 60 to 86, +6.4 on the two above (Nene, Firestarter).
  Survival on those 50 is 91.8% against 91.0%.
- **Two things to watch on the complete page.** By hour the paired difference is +3.2 (19:00),
  +2.0 (20:00) and −1.8 (21:00), 17 to 19 pairings each: a hint of a dip, the size of 3.4's
  own mid-pass dip, too small to call. And five pairings fell by 7 to 18 points
  (GarmBox.Oranges 92.0 to 74.1 with six rounds lost, cf.proto.Shiva, areb.Union,
  axeBots.HataMoto, buba.Archivist). A one-battle score has an SD of about 4 points, so one
  of these is unusual (Oranges, about 3 SD); the panel below benches all five on 3.4 and
  3.5.1 and reads RAM-2 and MIR-1's ticks to rule out a misfire.

**Verdict:** the move from 20th to 21st says nothing about R9 yet. The complete pass (about
1,215 pairings) is the read; save the page when it is complete (section 5).

## 2. The gap to 15th

| Rank | Robot | APS |
|---|---|---|
| 13 | pc.Wavelet 1.5 | 87.13 |
| 14 | gh.GresSuffurd 0.4.13 | 86.78 |
| 15 | kc.serpent.WaveSerpent 2.11 | 86.73 |
| 16-19 | WhiteFang, Nene, Neuromancer, Dookious | 86.68 to 86.45 |
| 20 | davidalves.Phoenix 1.02 | 85.88 |

Ranks 13 to 19 sit within 0.7 APS of each other. To hold 15th through the ± 0.2 interval of
a complete pass, Hadur needs about **86.95**: **+1.05 over 3.4's measured 85.90**. R9 is
expected to give part of that (below); the rest has to come from here.

## 3. Consolidating the pairings below us

Source: 3.4's complete page, the last full measurement (1,215 pairings). 1,196 opponents
rank below Hadur. Bands by the opponent's own APS. "Rounds lost" is (100 − survival) × 35
summed over the band: lost rounds per 35-round pairing, the unit APS is averaged in. Most
pairings are one battle; the 350 with two or three lose about a third more rounds in total
(battle-weighted: 198, 722, 981 and 1,055 from the bottom band up). "APS cost" is the band's points lost divided by all 1,215 pairings.
"Value of a round" is the slope of Hadur's score on its survival inside the band.

| Opponent APS | Pairings | Hadur's score | Survival | Mean PBI | Rounds lost per 35-round pairing, summed (share) | Value of a round | APS cost of lost rounds |
|---|---|---|---|---|---|---|---|
| above 85.9 (top 19) | 19 | 47.7 | 48.2 | +5.2 | 345 | | (out of scope) |
| 70 to 85.9 | 151 | 70.8 | 84.3 | **+3.6** | 828 (15.7%) | 2.0 pts | 1.36 |
| 60 to 70 | 228 | 78.5 | 90.9 | −0.4 | 728 (9.1%) | 2.2 pts | 1.32 |
| 40 to 60 | 467 | 88.4 | 96.8 | **−1.8** | 527 (3.2%) | 4.2 pts | 1.82 |
| under 40 | 350 | 96.0 | 98.7 | **−1.4** | 159 (1.3%) | 3.5 pts | 0.46 |

What the table says:

1. **Above 70 APS Hadur already beats robots of its strength** (PBI +3.6). Nothing to fix there.
2. **Below 70 the whole deficit is lost rounds.** In the pairings where Hadur wins all 35
   rounds its PBI is −0.1 (under 40) and +0.3 (40 to 60): on par. Every point of the −1.4 to
   −1.8 PBI is in the pairings that lose a round. One lost round against a 40-60 APS robot
   costs about 4 points of that pairing's score.
3. **The losses are spread thin, not concentrated.** R9's 11 bots account for only 29 of the
   1,414 (per-pairing equivalent) rounds lost below 70 APS (−0.13 APS of PBI); the 16 opponents with rammer-like names
   for 33. The 50 worst pairings hold a quarter of the negative PBI. So there is no next
   "rammer" class to find by name: the leak is a broad rate.
4. **Against the weakest, the leak looks like one round per battle.** Of 248 single-battle
   pairings against robots under 40 APS, 86 lost exactly one round and 13 lost more. On the
   bench Hadur loses 2 rounds in 840 to robots of that kind (3.2, `weak-pbi.txt`), 0.24% of
   rounds; live it is 1.3%. A one-round loss to a robot that cannot otherwise touch Hadur
   points at something that happens to Hadur, not something the opponent does: a stall the
   engine punishes (L-28's mid-round disables, 3 in a 300-battle session), a round in duress
   (RES-9: three skipped turns put the rest of the round at the distance floor, firing
   head-on at power 1), or a round-start cost. **This is inference from the two rates; R10
   measures it.**

### Budget

| Source | Evidence | Ceiling | Planned |
|---|---|---|---|
| R9 (already in 3.5.1) | R9's 11 bots −0.13 APS live; rammer-like names −0.11 | about +0.25 | **+0.2** (measured by the complete pass) |
| A. Live-only round losses | live 1.3% vs bench 0.24% of rounds under 40 APS; if the 1.1% excess holds below 70, about 400 rounds | about +1.1 | **+0.4 to +0.5** (halve it) |
| B. Tactical round losses, 40-70 APS | about 990 rounds after removing A's share; 2 to 4 points each | about +2.5 | **+0.4 to +0.6** (cut a quarter) |
| Top 19 | | | 0 (must not fall: gate) |
| **Total** | | | **+1.0 to +1.3 → 86.9 to 87.2** |

Top 15 is the expected outcome, not a certain one: the central estimate (86.95) is the
threshold itself, and ranks 13 to 19 are 0.7 APS apart, so other robots' updates can move it.

## 4. Stages

### R10: measure the leak (no change to the robot)

The bench reproduces a live pairing to r = 0.96 (L-30), so a panel of below-us opponents
splits the leak into what the bench reproduces (tactics, B) and what it does not (live-only, A).

- **Panel:** `hadur-bench/below-us-panel.txt`, 49 opponents from 3.4's page: 30 `leak` (worst
  PBI with opponent APS 40-70 and a round lost), 10 `floor` (worst under 40), the 5
  `r9-watch` pairings from section 1, 4 `control` (every round won, PBI about 0, to tell
  regression to the mean from a real leak). R9's 11 are excluded; `weak-leak.txt` still
  guards them. Ten jars are not in the 2026-09-28 participants list; fetch by the archive's
  usual name and drop any that fail, saying so in the report.
- **Runs:** 3.5.1, 4 battles per opponent, cold, default conditions; then the same panel under
  the client conditions of BENCH-4 at a 1.0 ms and a 0.3 ms constant (`--client`), the
  settings that make skipped turns, and so duress, happen; then one BENCH-6 session of the
  panel in one engine process with the data directory kept, as a client runs it
  (`below-us-session.txt`, whose opponent file carries each robot's APS in field 2, which
  the session report reads, where the panel file carries the role).
  3.4 on the `r9-watch` five, same seeds, for the paired comparison.
- **Output:** `docs/bench/r10-below-us.md` with, per opponent and per band: live rounds lost per
  35 (3.4 page), bench rounds lost per 35 under each condition, and each lost round's
  autopsy (BENCH-9). The report ends with a table of lost rounds by cause, and the APS each
  cause is worth by section 3's round values. That table picks R11's requirements.

| ID | Pattern | Requirement |
|---|---|---|
| BENCH-9 | Event | When Hadur loses a round in a bench battle, the bench shall record the round's cause of death (enemy bullet, ram, wall, engine disable), both robots' energy 100 and 30 ticks before it, the mean distance over its last 100 ticks, its skipped turns and duress ticks, the modes active in it (RAM-2, MIR-1, duress, flattener), and which of head-on, linear and circular aim best explains the enemy bullets that hit Hadur in it. |
| BENCH-10 | Event | When a bench run and a saved BotDetails page share opponents, the bench shall report per opponent the live and bench rounds lost per 35 rounds and their difference, and over the run the lost rounds the bench reproduced and those it did not. |

### R11: close the leak (built from R10's table)

Each candidate below is built only if R10 shows its cause is worth at least 0.15 APS. Every
detector is gated by an offline replay over the top-19 truth logs before any bench (L-35), and
the stage passes only with the gates in section 4.1. The EARS rows are drafts: R10's numbers
set the thresholds.

| ID | Pattern | Candidate requirement | Built if R10 shows |
|---|---|---|---|
| RES-12 | Unwanted | If duress has run for 200 ticks with no further skipped turn, then the core shall leave duress and resume at the lowest computation level. | rounds lost in duress |
| RES-13 | Unwanted | If the core has not returned orders within the tick allowance, then the adapter shall still issue the previous tick's movement and an `execute`, so that the engine never sees 240 ticks without an action. | engine disables (L-28) |
| GUN-6 | State | While one of head-on, linear and circular aim explains at least 7 of the enemy's last 8 bullets within 0.04 rad, movement shall score that aim's angle as a certain hit in each wave the enemy fires. | deaths to simple guns at mid range (SledgeHammer and NanoDeath's kind, L-34) |
| DIST-2 | State | While GUN-6 holds, the distance policy shall set the target distance to at least 500 px. | the same, where distance below 400 px precedes the loss |
| POW-6 | Unwanted | If our energy is below 20 and below the enemy's, then the gun shall fire only when the KNN gun's expected hit chance exceeds the chance that wins the energy race at that power. | rounds lost with Hadur disabled at 0 energy |

### 4.1 Gates for R11's release (3.6)

- **Panel:** rounds lost on the panel at least a third lower than 3.5.1 at the same seeds,
  under both default and client conditions; no `control` opponent worse by more than its
  interval.
- **Weak set** (`weak-leak.txt`): at or above 3.5.1's 88.3%.
- **Top 19** (`top19.txt`): mean share no more than 1.0 point below 3.5.1's, at 10 battles per
  opponent (L-19: per-bot moves under 8 points are noise).
- **Skipped turns:** no higher than 3.5.1 on the panel session.

## 5. How it will be measured

1. **Now:** let 3.5.1 finish its pass. Save its BotDetails page (`&limit=2000`, so all pairings
   are on the page) when it reaches about 1,200 pairings, and the rankings. R10's report
   reads it with BENCH-5 by band and by hour against 3.4 on common opponents (paired, ± 95%).
   That is R9's measured effect and the baseline R11 is judged against. If 3.5.1 completes
   below 85.6 with a survival slide by hour, stop: that is the old slide, not this plan.
2. **R10 → R11 decision:** the cause table, in the thread, before any robot code changes.
3. **3.6 live:** one complete pass. Success is **APS ≥ 86.95 and rank ≤ 15 on the complete
   page**. The leading indicator is **rounds lost per 35 against opponents under 70 APS:
   3.4 = 1.35; target ≤ 0.9**, readable from the first 300 pairings (about two hours).
   Save the page at about 300 pairings and when complete.

## 6. What not to do

- Do not read a rank off a partial pass; 259 random opponents move APS by ± 1.1.
- Do not chase single pairings: the worst 50 below-us rows are a quarter of the leak, and a
  one-battle row carries ± 8 points.
- Do not tune for the top 19. Above 70 APS Hadur is already ahead of its strength.
- Do not ship a weak-bot rule that has not been replayed against the top-19 truth logs (L-35).
