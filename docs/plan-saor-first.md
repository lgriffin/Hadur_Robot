# Saor: plan for 1st in MicroMelee

Leigh, 2026-10-25 23:32 UTC: "3rd at 68.08 … Now lets plan the gap to 1st." This plan is
built from the live pages archived in `data/rumble/pages/2026-10-25T23*` and the bench
census in PR #284. The gap split comes from `data/tools/melee_gap.py live`.

## 1. Where Saor stands

| | APS | Survival (rounds won) | Saor's score against it |
|---|---|---|---|
| 1st kc.micro.Figment 1.0 | 69.37 | 37.7 | 49.1 |
| 2nd wompi.Wallaby 5.1 | 68.96 | 37.5 | 45.9 |
| **3rd Saor 0.1** | **68.08 ± 0.37** | **29.7** | |
| 4th oog.melee.Capulet 1.2 | 67.37 | 29.2 | 49.9 |

Saor needs +1.30 to tie Figment. A safe 1st needs about **+1.8**, because Saor's own score
has a ±0.37 interval after 533 battles.

## 2. Where the gap is

This is Figment's lead over Saor, split by the opponent's MicroMelee rank. The "APS from
band" column sums to the gap:

| Opponent ranks | n | Saor | Figment | APS from band | Saor survival | Figment survival |
|---|---|---|---|---|---|---|
| 1-10 | 8 | 52.4 | 54.7 | +0.12 | 28.3 | 34.5 |
| 11-30 | 20 | 58.5 | 60.1 | +0.21 | 31.3 | 38.6 |
| 31-60 | 30 | 61.7 | 64.0 | +0.44 | 28.4 | 38.5 |
| 61-100 | 40 | 68.5 | 69.7 | +0.32 | 29.2 | 38.0 |
| 101-200 | 57 | 77.0 | 77.5 | +0.20 | 30.6 | 37.6 |

Wallaby's lead (+0.84) has the same shape. It is +0.09 from the top 10 and the rest is spread
over the field.

Three things follow from this:

- **The gap is not a few matchups.** It is about a point everywhere. The top 10, where the
  bench saw Saor lose its final duels to Wallaby and Figment, give only +0.12 of it.
- **The gap is rounds won.** Figment wins about 8 points more of its rounds than Saor in every
  band. Wallaby is the same.
- **Saor is nearly a copy of Figment**, so the gap sits in the few places where Saor differs
  from it. These are listed in section 4.

## 3. Why the bench reads 1.6 under live

The bench census read 66.45. Live reads 68.08. Per opponent, the bench is under live by 0.9
(median) to 1.6 (mean). Rounds won are further apart: 52% on the bench against 30% live.

The cause is how the size rumbles are scored. LiteRumble scores MicroMelee from the
**MeleeRumble battles**: ten robots drawn from all 416 entries, scored only on the pairings
where both robots are micro. Saor also appears in the MeleeRumble table itself, 31st at 63.70.
The bench census is different. It runs fields of nine micro opponents only, so Saor never
meets the megabots that win most live rounds.

Hadur's melee census, which does draw from the full melee field, matched its live rounds won
(47% against 43%). So the bench's ranking of arms is probably sound. Its absolute level and
its survival figures are not. Stage 0 fixes this before any gain is claimed.

## 4. How Saor differs from Figment

All of these are in `Saor.java` against `kc/micro/Figment.java`. Everything else is the same
arithmetic: the corner movement, the Markov state, the 17.5 px aim wall, the kernel, the power
formula, and a cold playout's vote of 5 (Figment sets `weight = 5` on an empty row too, so
with arm W Saor matches it).

| Difference | Saor | Figment | Bytes to revert |
|---|---|---|---|
| Playouts per aim | 64 | **128** | 0 (arm G, 764 javac) |
| When a row is sampled | 8 or more samples, otherwise hold the state | **any sample** (min 126) | saves 2 (arm W) |
| Power cap | `others / 3 + 1.9` | **none** | saves 14 (arm U, -0.12 ± 0.35) |
| Leg after a ram | 50 px (SAOR-9) | **none** | saves 13 (arm R) |
| Fire at power 0 or below | yes: below 1 energy `log10(E)` is negative and the engine fires 0.1 | **no** (`power > 0`) | costs 7 (arm Z) |
| Opponent hash | 512 rows | 256 | 0 |
| Angle bins | 1024 | 1000 | 0 |

The playout count stands out. Halving it makes each aim noisier, and that would cost rounds
won everywhere, which is the shape of the gap. Halving the playouts makes the most sense as
the cause, but it has not been tested.

## 5. Stages

The stages are U6 onward in docs/saor.md (SAOR-16 is the live-shaped census). Each card is
started by Leigh and runs from master. Every arm is paired per field against the control, and
the read uses `tools/saor_arms.py`.

**Stages 0 and 1 share one card, `plans/pc-saor-s01.queue`, which takes about 4-5 h.** It runs
the live-shaped census for C, Figment, Wallaby and FX, and the MicroMelee census for C, G, W, R,
Z and FX. The results PR goes to `claude/pc-saor-s01-results`.

How the card is built:

- `tools/saor_live.py` builds the live-shaped fields from `melee-census-317`.
- `tools/saor_arms.sh live` seats an arm. An arm written `@robot` seats that robot.
- `SAOR_RUN=s01` keeps the card's battles and reports apart from earlier cards.
- `saor_arms.py --field live --only work/saor-s01/live/micro.txt` counts only the micro pairings.

Stage 1 runs on the fast census because that census ranks arms well even though its level is
off.

| Stage | What | Arms | PC time | Pass |
|---|---|---|---|---|
| **0. Live-shaped census** | A second census, `micromelee-live`: fields of 9 drawn from the full MeleeRumble list (the PC already holds the melee jars), scored only on the micro pairings. Run Saor 0.1, Figment and Wallaby in the seat, on both censuses. | C, Figment, Wallaby | about 3 h | The live census reproduces live: Figment over Saor by +1.3 ± 0.5, Wallaby by +0.8 ± 0.5, and Saor's level within 0.5 of 68.08. |
| **1. Figment parity** | Revert the differences in section 4, one at a time and then all together. | G (128 playouts), W (any-sample rows), R (no ram leg), Z (power > 0), FX (all four plus U: Figment but for 512 hashes and 1024 bins) | about 2.5 h | An arm gains at least +0.3, with a low end above 0. Expected (a guess): G is worth most of the gap. |
| **2. Beyond Figment, no bytes** | Constants that cost nothing. | 256 playouts (if no skipped turns), power constant 250 and 400, learning threshold 0.5 and 0.9, leg constant 55 | about 3 h | The same rule, stacked on stage 1's winner. |
| **3. Beyond Figment, with bytes** | Spend what stage 1 frees (up to about 30 bytes: cap 14, ram leg 14). Candidates: a duel-only move for the last two (the duel screen's orbit), or a corner chosen away from the crowd. | 2-3 arms | about 2 h | The same rule. |
| **4. Stack and ship 0.2** | Fit the stack into 749 bytes after ProGuard, update the core, SaorLab and SAOR-15, then confirm on the live census with 8 seeds. | the stack against 0.1 | about 2 h | The live census projects at least Figment + 0.5 (69.9), with its low end above 69.37. Then release 0.2 on Leigh's go. |

Stop rules:

- **If stage 0 cannot reproduce live**, stop. The bench is not fit to plan 1st with, so
  rethink the census before spending more PC time.
- **If stage 1 finds nothing**, the gap is not in the differences from Figment. Read
  Figment's and Saor's rounds side by side before stage 2.

## 6. What a guaranteed 1st takes

Figment and Wallaby are not changing; both have been in the rumble for years. If stage 1
closes the gap, Saor ties Figment. Clearing it by 0.5 needs stages 2 and 3 to add about +0.5
on top. That is not certain: the largest single gain the arm screen found so far was zero. The
plan is built so that each stage's verdict shows how much is left before the next card.
