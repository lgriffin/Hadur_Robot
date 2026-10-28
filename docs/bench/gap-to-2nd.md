# 1v1: opponents to close the gap to 2nd (2026-10-28)

Leigh 2026-10-28 06:54 GMT: 3.18.1 is 4th at 91.34, DrussGT 2nd at 92.57 (+1.28); find the
opponents we can change our approach for. Taking 3rd and testing it is the agreed first target.
Write-up for reading: "Hadur 1v1: opponents to close the gap to 2nd" (Claude Doc), per-bot table in
the project files (`gap-to-2nd/gap-to-2nd-opponents.tsv`).

## Live read

LiteRumble BotDetails fetched 2026-10-28 07:00 GMT (Hadur 3.18.1, all cloud battles; DrussGT 3.1.16,
Saguaro 1.0, BeepBoop 2.0), Hadur pooled with 3.17's clean first pass (same code). Groups fixed by mode
labels (ours, Saguaro's shipped table, DrussGT's shield list), APS = points / 1,219 pairings.

| Group | Bots | DrussGT lead | Saguaro lead | Tailorable |
|---|---:|---:|---:|---|
| Rivals shield, we surf | 136 | +0.34 | +0.46 | shield quality |
| We shield | 273 | +0.10 | +0.12 | on 26 of them |
| Strong learners (opp APS 70+) | 68 | +0.38 | -0.44 | no (core) |
| Other scoreMax | 173 | +0.34 | -0.19 | mostly no |
| Simple guns (shotDodger) | 383 | +0.37 | +0.50 | no per bot |
| Rammers / perfect prediction | 36 | +0.09 | +0.16 | new mode |
| Wave-poison, we surf | 48 | +0.10 | +0.08 | a few |
| Anti-basic-surfer | 27 | +0.09 | +0.06 | new gun |
| Our stop-and-go | 73 | -0.29 | +0.02 | ours |
| All | 1,217 | +1.51 | +0.76 | |

Tailorable estimate +0.32 to +0.51 APS: enough for 3rd, not 2nd.

## Cloud reads (4-core box, 35 rounds, engine 1.11.1)

**Shield read** (`local/2026-10-28_cloud-fid-read.md`, 8 robots x c / shield-all / Saguaro x 3 seeds).
Against the four listed robots (Pytko, Komarious, BlackIce, MatchupWS) Hadur takes 330-625 bullet
damage a battle, Saguaro 98-150. The logs say why: about 16 hits leak in the first ~15 rounds
(`SB ... missed`), SHIELD-11 leaves the battle at 150 damage (`SH,...,off,damage`), and the surf then
takes 44-94 hits in the remaining rounds (`SB ... off`).

**Shield exit** (`local/2026-10-28_cloud-shield-exit.md`, same 8 x c / s4 / s0 / shield-all+s0 x 3 seeds):

| Robot | c | s4 (exit at 400) | s0 (budget only) | Saguaro |
|---|---:|---:|---:|---:|
| Pytko | 78.6 | 89.7 | 88.9 | 95.1 |
| BlackIce | 82.0 | 91.9 | 91.0 | 96.4 |
| MatchupWS | 75.3 | 85.9 | 84.0 | 93.0 |
| Komarious | 78.7 | 94.8 | 91.4 | 95.1 |

On the four surfed robots, forcing the shield on without the exit did not help (Hydrogen's damage
halves but the score falls), so those stay surfed.

**Re-pick** (`local/2026-10-28_cloud-repick.md`, 14 robots x c / off-list / stop-and-go / shift / shield-all
x 3 seeds): three lock at 5+ points, all shield-listed robots Saguaro fights with wave poison:
Wolverine stop-and-go 98.8 vs 91.2, Hikari shift 95.5 vs 83.8, Melody shift 98.6 vs 90.7 (+0.02 APS).
The other eleven keep their mode; BaronTrozo stays at ~69 under every mode we have.

**Shield exit on 30 more listed robots** (`local/2026-10-28_cloud-shield-exit2.md`, 18 of the weakest listed
robots plus 12 at random, c / s4 / s0 x 2 seeds): s4 +1.61 ± 2.49 points a robot, s0 +1.40 ± 2.31.
Weak 18: s4 +1.8, s0 +2.3; random 12: s4 +1.3, s0 +0.1. Per robot it is mixed: +12 to +18 on Smoke,
Quest, Cyprus, SMG, CopyKat; -7 to -11 on Pantheist, Toa, MirrorPM. A global exit at 400 looks
positive on the listed field; the PC card measures it on all 276 and also reports per-robot picks, in
case a per-opponent exit beats one value. Taking the random 12 (+1.3 points) as the
typical listed robot, s4 would be worth about +0.3 APS over 276 (cloud noise is wide: 0 to +0.5).

## PC result (pc-shield-exit, 2026-10-28 13:44 GMT)

Card `plans/pc-shield-exit.queue` (BENCH-126), results branch `claude/pc-shield-exit-results`: all 276
listed robots x c/aa/s4/s0 x 3 fresh seeds, then the three re-picks on 6 fresh seeds.

| Arm | APS vs control | Gate | Verdict |
|---|---:|---:|---|
| s4 (exit at 400) | +0.04 ± 0.09 | +0.10 | FAIL |
| s0 (budget only) | -0.01 ± 0.10 | +0.10 | FAIL |
| A/A | -0.11 ± 0.43 | band | clean |
| Re-pick (Wolverine, Hikari, Melody) | +0.02 ± 0.00 | +0.01 | PASS |

A later exit helps as often as it hurts (Fenrir +10.5, Robovirus -13), and the cloud's big winners
shrank on the PC (Komarious +16 to +5): cloud 3-seed per-robot gains on a handful of robots shrink
two to three times on the full card, so the live read's "shield fidelity +0.2 to +0.3" was not real.
The per-robot pick finds 7 robots worth +0.06 APS in sample; that needs a per-opponent exit line
and fresh seeds before it counts. The re-pick ships as table entries (this PR).

## Rammers (cloud, 2026-10-28)

12 nano rammers x 2 seeds (`local/2026-10-28_cloud-ram-read.md`): Saguaro 82.1%, Hadur 71.5%. Ram damage is level;
the gap is their bullets: they hit Hadur on about 58% of shots and Saguaro on 34%. Replaying each shot from the
truth log, a linear aim would hit Hadur's RAM-2 escape (full speed on a smooth heading) on 52% of shots, Saguaro on
35%. None of our modes helps (`local/2026-10-28_cloud-ram-screen.md`: no escape 67.5, stop-and-go 69.8 / 70.6,
simple-aim dodge 72.2, A/A 72.4). A speed break (4 px/tick while a shot led for full speed flies) lost 2.6.
RAM-5, the escape weighing its paths against the shots in flight (head-on and linear aims), smoked at
71.2 -> 78.3 (`local/2026-10-28_cloud-ram-rk.md`), 11 of 12 up.

## Next

Banked toward 3rd: +0.02 of the +0.41 needed. Tailoring left is about +0.1 (per-opponent exit, an
anti-ram mode, an anti-basic-surfer gun); Saguaro's +0.5 lead on the 383 simple-gun robots needs
core movement work.

PC card `plans/pc-1v1-ram.queue` (BENCH-132, about 1 h, Leigh starts it): RAM-5 on all 45 rammers and
perfect-prediction robots, and SHIELD-19's per-opponent exits for the 7 picked robots, both on fresh seeds.
If the cloud's rammer gain holds at half, it is worth about +0.1 APS.
