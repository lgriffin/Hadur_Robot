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

## 5. Saor stays its own robot

Leigh, 2026-10-25 23:52 UTC: "I do want us unique and different, inspired by others but not
copying them byte for byte."

- **The parity arms are measurements, not candidates.** G, W, R, Z and FX run Figment's code,
  and they only show which difference costs Saor points. None of them ships. FX above all is
  Figment's robot in all but its hash and bins, so it is a diagnostic only.
- **A parity result names a cause; the fix is Saor's own.** If the playout count is the cost,
  the question becomes how Saor spends its CPU on aiming in its own way. For example, it could
  run more playouts only on the tick it fires, or end a playout early once the bins agree. The
  answer is not to run Figment's 128.
- **Saor keeps what makes it Saor** unless a measurement shows a part costs points. That means
  the circular cold start, the end-game power cap, the leg after a ram, 512 opponent rows and
  1024 bins. A part that costs points is redesigned, not swapped for Figment's version.
- **Stages 2 and 3 are where Saor gets ahead.** They hold Saor's own ideas, built on what
  stage 1 shows. 0.2 has to be measurably different from Figment in behaviour, not only in
  constants.

## 6. Stages

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
| **1. Figment parity (measurement only)** | Revert the differences in section 4, one at a time and then all together, to find which ones cost points. None ships (section 5). | G (128 playouts), W (any-sample rows), R (no ram leg), Z (power > 0), FX (all four plus U: Figment but for 512 hashes and 1024 bins) | about 2.5 h | An arm gains at least +0.3, with a low end above 0. Expected (a guess): G is worth most of the gap. |
| **2. Beyond Figment, no bytes** | Saor's own answer to what stage 1 finds (section 5), and constants that cost nothing. | for example: aim effort spent on the firing tick, power constant 250 and 400, learning threshold 0.5 and 0.9, leg constant 55 | about 3 h | The same rule, on Saor 0.1 plus its own answer from this stage (never a parity arm). |
| **3. Beyond Figment, with bytes** | Spend bytes freed only where stage 1 shows a Saor part costs points (up to about 30 bytes if the cap, 14, and the ram leg, 14, both do). Candidates: a duel-only move for the last two (the duel screen's orbit), or a corner chosen away from the crowd. | 2-3 arms | about 2 h | The same rule. |
| **4. Stack and ship 0.2** | Stack Saor's own winners (never a parity arm, section 5) and fit them into 749 bytes after ProGuard, update the core, SaorLab and SAOR-15, then confirm on the live census with 8 seeds. | the stack against 0.1 | about 2 h | The live census projects at least Figment + 0.5 (69.9), with its low end above 69.37. Then release 0.2 on Leigh's go. |

Stop rules:

- **If stage 0 cannot reproduce live**, stop. The bench is not fit to plan 1st with, so
  rethink the census before spending more PC time.
- **If stage 1 finds nothing**, the gap is not in the differences from Figment. Read
  Figment's and Saor's rounds side by side before stage 2.

## 6a. Stages 0 and 1: results (pc-saor-s01, PR #294, 2026-10-26)

**Stage 0 passed.** The live-shaped census reproduces live:

| Seat | Live-shaped census | vs Saor 0.1, by field | Live (2026-10-25) |
|---|---|---|---|
| Saor 0.1 | 68.14 ± 0.21 | | 68.08 |
| Figment | 69.80 ± 0.20 | +1.69 ± 0.29 | +1.30 |
| Wallaby | 69.62 ± 0.16 | +1.28 ± 0.27 | +0.84 |

The level is right to 0.06. Both rivals' leads are inside the ±0.5 pass band, and they read
about 0.4 high. From here the live-shaped census is the projection of a live score.

**Stage 1 found the gap in one place**, which is waiting for 8 samples. The MicroMelee census,
paired by field against C (66.43 ± 0.26):

| Arm | vs C | Rounds won | Verdict |
|---|---|---|---|
| G, 128 playouts | -0.05 ± 0.35 | 52.3% | no effect: the playout guess was wrong |
| **W, sample any seen row** | **+1.35 ± 0.34** | **59.5%** (C 51.2%) | **the cost** |
| R, no ram leg | +0.30 ± 0.36 | | small, low end below 0 |
| Z, power > 0 guard | +0.25 ± 0.35 | | small, low end below 0 |
| FX, all of them | +1.51 ± 0.35 | 60.1% | W plus about 0.15 |

On the live-shaped census, FX reads 69.73 ± 0.21, level with Figment's 69.80. Most patterns a
melee opponent shows are seen fewer than 8 times, so Saor 0.1 spent most of its aims on
circular projection. That is the rounds-won gap of section 2.

What this means under section 5:

- W is Figment's rule, so it is the reference and not the answer.
- Saor keeps its idea that a thin pattern deserves less trust. Its answer is a confidence vote
  (arms D and DC): it samples any seen pattern, but a playout through one under 8 samples votes
  less.
- R's +0.30 is a weak sign that the ram leg costs points. If stage 4 needs bytes, the ram leg
  is the first trade, and it is justified by that measurement.
- The playout count stays at 64.

## 6b. Stage 2 card (pc-saor-s02, about 4-5 h)

| Arm | What | Bytes (javac) |
|---|---|---|
| C | Saor 0.1, the control | 764 |
| W | Figment's any-sample rule, the reference | 762 |
| T2, T4 | Saor's threshold at 2 and 4 samples | 763 |
| **D** | Confidence vote: sample any seen row, and a playout through a row under 8 samples votes 5, not 100 | 766 |
| **DC** | Graded confidence: a playout through a row under 8 samples votes at most 5 + 12 per sample (an unseen row keeps the cold 5) | 777 |
| DK250, DK400 | D with the power constant at 250 and 400 (325 now) | 766 |
| DH5, DH9 | D learning a transition below 0.5 and 0.9 gun heat (0.7 now) | 766 |

Every arm runs on the MicroMelee census. C, D and DC also run on the live-shaped census. The
pass is the same as stage 1. On the live-shaped census the 1st bar is a low end above 69.37.
D is 2 bytes over after ProGuard, and DC about 13 over. The ram leg's 13 bytes would pay for
either.

## 6c. Stage 2: results (pc-saor-s02, PR #311, 2026-10-26)

**Stage 2 passed. Saor's own graded vote closes the gap Figment's rule closed.**

Live-shaped census, paired by field against C:

| Arm | Live-shaped census | vs C | Low end above 69.37 |
|---|---|---|---|
| C, Saor 0.1 | 68.28 ± 0.21 | | no |
| D, flat vote | 69.27 ± 0.20 | +0.99 ± 0.29 | no |
| **DC, graded vote** | **69.56 ± 0.19** | **+1.28 ± 0.28** | **yes** |

C read 68.28 here against 68.08 live, so this card sits about 0.2 high. DC therefore projects
to about 69.4 live. That is level with Figment's 69.37, not clear of it. In stage 0, Figment
read +1.69 over C on this census, and DC reads +1.28.

MicroMelee census, against C (66.18 ± 0.22):

| Arm | vs C | Note |
|---|---|---|
| W, Figment's rule (reference) | +1.59 ± 0.32 | |
| **DC** | **+1.44 ± 0.35** | the same as W within noise |
| T2 | +1.32 ± 0.32 | |
| D | +1.12 ± 0.34 | |
| T4 | +0.66 ± 0.34 | |
| DH9, D learning below 0.9 heat | +1.45 ± 0.34 | +0.33 over D |
| DK400, D power constant 400 | +1.24 ± 0.31 | +0.12 over D |
| DK250 | +1.11 ± 0.32 | nothing |
| DH5 | +1.04 ± 0.33 | nothing |

DH9 and DK400 point the right way, but neither clears noise on its own. Both are free, so stage 4
tests them stacked.

## 6d. Stage 4 card (pc-saor-s03, about 4-5 h)

Stage 3 is not needed as its own card. DC's 13 bytes come from the ram leg, which stage 1
measured at +0.30, and S1 builds at exactly 749 after ProGuard.

| Arm | What | Bytes |
|---|---|---|
| C | Saor 0.1, the control | 749 |
| DC | stage 2's winner, repeated as the anchor (MicroMelee census only) | 762 |
| **S1** | DC without the ram leg | **749** |
| **S2** | S1 learning a transition below 0.9 gun heat | 749 |
| **S3** | S2 with power constant 400 | 749 |
| FIG | Figment seated, live-shaped census only | |

C, FIG, S1, S2 and S3 run the live-shaped census (8 seeds). C, DC, S1, S2 and S3 run the MicroMelee
census (12 seeds). Reading FIG in the same run gives the lead over Figment directly, with no
cross-card offset.

Pass, from section 6: the best S arm leads FIG by at least +0.5 on the live-shaped census, with
its low end above Figment's live 69.37 after the run's offset (C read minus 68.08). That arm then
becomes 0.2: the core, SaorLab and SAOR-15 are updated to match, and Saor enters only on Leigh's
go. If no S arm clears +0.5 over FIG, the best one still ties Figment. The plan then needs
another Saor-own idea (section 6, stage 3's duel move or corner choice) before a release that is
sure of 1st.

## 7. What a guaranteed 1st takes

Figment and Wallaby are not changing; both have been in the rumble for years. If stage 1
closes the gap, Saor ties Figment. Clearing it by 0.5 needs stages 2 and 3 to add about +0.5
on top. That is not certain: the largest single gain the arm screen found so far was zero. The
plan is built so that each stage's verdict shows how much is left before the next card.
