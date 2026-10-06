# Bench strategy: the melee top 20, one robot at a time

The 1v1 note (`docs/bench/top20-strategy.md`) plans a per-robot bench for the RoboRumble top 20.
This is its melee counterpart: a bench plan for the 20 strongest MeleeRumble robots Hadur can
fight locally, so the owner can see which of them Hadur loses pairwise points to. The MeleeRumble
scores APS as the mean, over every other robot in a battle, of Hadur's share of the pair's
score (`100 H / (H + X)`); Hadur 3.7 is 18th at 65.25 (`data/rumble/parsed/2026-10-05T1546Z_meleerumble_rankings.tsv`).
A pooled APS hides which robots cost points, the same way the 1v1 top-10 mean did.

## The design: five fields, not one

A MeleeRumble battle holds 10 robots, so 20 opponents cannot share one. The set has 20 opponents:
ranks 1-3, 5-17 and 19-22 (Hadur is 18; jd.Nullstride at 4 has no archive jar, so ranks 21 and
22, stelo.PastFuture and stelo.Spread, stand in). `hadur-bench/melee-top20.txt` is a suite of five
fields of Hadur plus nine opponents, `melee-top20-a.txt` to `melee-top20-e.txt`; its header explains
the pairing. Every opponent is in two or more fields, each field has four strong (ranks 1-10) and
five lower robots (11-22), and no two fields share more than three robots. The two strongest
(ScalarR, Neuromancer) and Hadur's three neighbours (Figment 17, Lambda 19, Wallaby 20) are in three.
`melee-top20-set.txt` lists all 20 once, for fetching and for naming ranks.

| Field | Opponents by rank |
|---|---|
| A | 1, 2, 7, 9 / 11, 14, 16, 20, 21 |
| B | 2, 6, 8, 10 / 13, 17, 20, 21, 22 |
| C | 3, 5, 8, 9 / 15, 16, 17, 19, 20 |
| D | 1, 3, 7, 10 / 12, 14, 17, 19, 22 |
| E | 1, 2, 5, 6 / 11, 12, 13, 15, 19 |

All 20 jars are in `hadur-bench/opponents/` (11 were already there at the ranked version, 9 were
fetched; none failed). One run of 5 seeds is 25 battles of 35 rounds, 10 to 15 battles per robot.
A battle's wall time has not been measured on this host; time the first one before planning.

## How a run is made

```powershell
.\hadur-bench\bench-melee-top20.ps1 -Seeds 5 -Rounds 35 -Label 2026-10-06
.\hadur-bench\bench-melee-top20.ps1 -Seeds 5 -FieldsParallel 5 -Label 2026-10-06   # one process per field
.\hadur-bench\bench-melee-top20.ps1 -Seeds 10 -Parallel 4 -Baseline hadur-bench\baselines\hadur2.Hadur_3.7.jar
```

```sh
./hadur-bench/bench-melee-top20.sh --seeds 5 --rounds 35 --label 2026-10-06
./hadur-bench/bench-melee-top20.sh --seeds 10 --parallel 4 --baseline baselines/hadur2.Hadur_3.7.jar
```

The first form is the suite, `mvn -q compile exec:java "-Dexec.args=--suite melee-top20.txt --seeds 5 --rounds 35 --out ... --report ..."`,
the fields one after another with one combined report. The script prints the exact command and passes
the options straight to Bench: `--cpu-constant` (read from `C:\robocode\config\robocode.properties` unless
given or `-NoCpuPin`; Bench pins it in every home and names it in the report), `--parallel` (seeds of a
field at once on worker homes), `--child-cpus`, `--child-heap`, `--baseline` and `--per-opponent`.
Afterwards it runs
`python data/tools/melee_pairwise.py --work <out> --set hadur-bench/melee-top20-set.txt`, which writes
`docs/bench/local/<date>_<label>_per-opponent.md`: per opponent, pooled over its fields, Hadur's mean
pairwise share with its standard deviation, battles Hadur out-scored it, both mean final ranks, and the
duels between them. A single field is `-Fields A`; one robot is the fields it stands in (table below).

Against 3.7: pass `-Baseline <3.7 jar>` (`--baseline` for the sh script; the baseline's name is derived
from the file name, `hadur2.Hadur 3.7`). Each field's battle is then fought a second time with the
baseline on the same seed, and each field's report gains a "Paired A/B" section: APS, survival and
rounds won, then Hadur's pairwise share against each opponent, as candidate, baseline and the
seed-for-seed difference with its 95% interval (the BENCH-2 convention). The seed is the battle number,
but once the robots behave differently the battles diverge, so the pairing removes the common draw
(the field, the opening) rather than making the two runs identical; read the interval, not the
mean. 3.8's D stages did not touch melee (`docs/bench/release-check-3.8.md`), so against 3.7 expect
nothing to move; a gap is a regression to chase or noise to size. The paired tables are per field. The
pooled per-opponent table from `melee_pairwise.py` covers the candidate only (it skips the baseline's
`melee-N-baseline` battle directories); a pooled paired difference across fields is not built.

Per-opponent files: each field also writes one markdown per opponent to
`<report>_per-opponent/<field>/<slug>.md` (`-NoPerOpponent` skips them), with a per-seed table of
Hadur's place and score, the opponent's score, the pairwise share, skipped turns and the rounds that
ended as a duel with it, plus the baseline's share and the paired difference when a baseline ran.
These are one field's battles only; the cross-field pool is still `melee_pairwise.py`.

## What to read per opponent

1. **Hadur's pairwise share** (per-opponent table, "Hadur share" and "sd"). This is the APS component
   that robot contributes. Below 50 means it out-scores Hadur pair by pair.
2. **Out-scored it** (x / battles), and **both mean final ranks**: whether the share is consistent or
   one lucky field.
3. **Finishing place distribution**: the main report's "Hadur per battle" table (place, APS, survival)
   and the "Mean place" table, which lists every robot in the field with its mean final rank and score share.
4. **APS and survival per field**: the table's second block, and the main report's headline row.
5. **Duels**: "Rounds that ended as a duel" lists the last opponent and Hadur's win rate. This is the
   nearest the bench gets to "who killed Hadur": the bench does not record killers.

Not available: who killed Hadur in rounds that ended with more than two robots, Hadur's hit rate per
opponent, or bullet damage per pair (see the follow-ups).

## Trust checks, before reading any number

1. **Every battle ok.** No "battle(s) failed" line; no `expected N robots, found M` in a battle's
   `engine.log` (a jar missing or a name that does not match). A failed battle drops out of the means silently.
2. **Skipped turns.** Each field's report opens with the same line as the 1v1 report: skipped turns in
   total over N battles, per battle, and the most in one battle. 38 over 105 rounds at 3.0
   (`melee-3.0-strong.md`) and 3 to 69 over 175 rounds on the hand-off field (`m5-gates.md`) are the
   references; some skips are the round-end profile checkpoint after Hadur wins a round and cost no score
   (`m6-gates.md`), so a rise is a load signal only if it follows load. A "Duress ticks" line follows
   it when Hadur's `R` records carry the field (3.8 does). Compare one field at `-Parallel 1` and at the
   width you plan before trusting it: `--parallel` above 1 gives each battle JVM `--child-cpus 2` by
   default, and the 1v1 ladder (`docs/bench/local/2026-10-06_parallel-ladder.md`) found that unflagged
   children put every battle into duress. `-FieldsParallel` multiplies the width (fields times seeds).
3. **The CPU constant.** The report's host line names the constant (pinned or calibrated), the host and the
   parallel width; check it is the same for every field and for the 3.7 run.
4. **Other JVMs.** The owner's RoboRumbleAtHome clients (four 1v1, one melee, one team) normally run on this
   host and share the CPU. Pause them, or note them next to the result, as the 1v1 ladder does.

## The bands

- **Band 1, ranks 1-3 (APS 71.5 to 72.8): ScalarR, Neuromancer, Firestarter.** The robots Hadur must beat to
  climb. Rest on 10 to 15 battles each; read before the rest.
- **Band 2, ranks 5-10 (68.3 to 70.2): Diamond, DemonicRage, Portia, Shadow, Glacier, Mirage.** Diamond, Portia
  and Shadow are the only robots here with prior local melee evidence (the hand-off field).
- **Band 3, ranks 11-17 (65.4 to 68.1): Medina, Combat, Aleph, Matcha, Numbat, Mallais, Figment.** Within three
  points of Hadur's 65.25; a pairwise share under 50 here is the more worrying result.
- **Band 4, ranks 19-22 (64.8 to 65.1): Lambda, Wallaby, PastFuture, Spread.** Level with Hadur or just
  behind it; they are the sanity band, and a loss to them says more about Hadur than a loss to band 1.

What is already measured (older Hadur versions, other versions of some robots, so context rather than a baseline):
Hadur 3.0 on a field of Diamond 1.8.22, Shadow 3.83c, ScalarR 0.005h.053-noshield and six others scored APS 61.6,
survival 72.6 (`melee-3.0-strong.md`); on nine classic bots 63.0 (`melee-3.0-classic.md`); on the hand-off
field (Shadow, Diamond, Portia and six) 3.5.1 scored 51.5 and the M5 build 50.9 (`m5-gates.md`, `a3-melee.md`);
on the reference field 3.5.1 scored 53.3 and A3 52.7. Live, 3.5.1 was 18th at 65.31 with survival 38.90
(`docs/architecture-evolution.md`). The history is in `data/bench/melee-history.tsv` and `melee-field.tsv`.

## Robot by robot

"Mean final rank" is the engine's rank in a battle, averaged. Style notes are only what this repo's
documents say; where nothing is recorded the entry says unknown.

### 1. aaa.r.ScalarR 0.005g.047
MeleeRumble APS 72.80. Fields A, D, E. Style: not documented here for melee. In the 1v1 plan it is a DrussGT-route
target. Prior: the other version, 0.005h.053-noshield, took 13.7% of the score at mean final rank 3.3 with 56 round
wins, and won 8% of its 12 duels with Hadur 3.0 (`melee-3.0-strong.md`). This ranked version has not been fought locally.
Local 3.8 result (2026-10-06, 10 seeds a field, 35 rounds): Hadur 3.8 took 40.8% of the score over 30 battles (3 fields), mean place 5.0 against its 1.3, out-scored it in 0 / 30. Paired 3.8 minus 3.7 on the same seeds: -0.6 ± 1.8 pp pooled over fields (A -0.4, D -0.0, E -1.3).

### 2. jk.melee.Neuromancer 7.12
APS 72.19. Fields A, B, E. Style: unknown here. In 1v1 it is a coin flip (51.6% live at 3.4, `docs/top20-analysis.md`).
No melee run recorded.
Local 3.8 result (2026-10-06, 10 seeds a field, 35 rounds): Hadur 3.8 took 42.1% of the score over 30 battles (3 fields), mean place 5.4 against its 1.8, out-scored it in 0 / 30. Paired 3.8 minus 3.7 on the same seeds: -1.5 ± 1.6 pp pooled over fields (A -2.1, B -0.8, E -1.7).

### 3. cb.fire.Firestarter 2.0f
APS 71.52. Fields C, D. Style: one robot on all three ladders (7th 1v1, 3rd melee, 2nd team); its 2.0 notes
restructured it for team play (`docs/architecture-evolution.md`). No melee run recorded.
Local 3.8 result (2026-10-06, 10 seeds a field, 35 rounds): Hadur 3.8 took 44.0% of the score over 20 battles (2 fields), mean place 5.5 against its 2.9, out-scored it in 2 / 20. Paired 3.8 minus 3.7 on the same seeds: -1.9 ± 2.3 pp pooled over fields (C -3.7, D +0.0).

### 5. voidious.Diamond 1.8.28
APS 70.18. Fields C, E. Style: not documented here for melee. Prior: on the hand-off field 3.5.1 saw it at mean final
rank 1.7 and a 14.6% share (A3: 1.0, 14.6%); Hadur won 3 of 12 duels against it at M5 and 28.6% of clean 1v1 rounds
(`m5-gates.md`). It takes the hand-off when the field thins. In 1v1 it is a DrussGT-route target.
Local 3.8 result (2026-10-06, 10 seeds a field, 35 rounds): Hadur 3.8 took 44.9% of the score over 20 battles (2 fields), mean place 6.2 against its 3.4, out-scored it in 3 / 20. Paired 3.8 minus 3.7 on the same seeds: -1.4 ± 3.7 pp pooled over fields (C -1.1, E -1.6).

### 6. justin.DemonicRage 3.4
APS 70.05. Fields B, E. Style unknown; no run recorded.
Local 3.8 result (2026-10-06, 10 seeds a field, 35 rounds): Hadur 3.8 took 45.4% of the score over 20 battles (2 fields), mean place 5.8 against its 3.2, out-scored it in 3 / 20. Paired 3.8 minus 3.7 on the same seeds: +0.0 ± 2.9 pp pooled over fields (B -1.1, E +1.1).

### 7. positive.Portia 1.26e
APS 69.43. Fields A, D. Style unknown here. Prior: final rank 2.3 to 2.8 and a share of 12 to 13% on the hand-off
field; Hadur won 2 of 6 duels at M5 yet 86.9% of clean 1v1 rounds (`m5-gates.md`), so its melee strength is more than its duel.
Local 3.8 result (2026-10-06, 10 seeds a field, 35 rounds): Hadur 3.8 took 51.0% of the score over 20 battles (2 fields), mean place 4.5 against its 5.4, out-scored it in 13 / 20. Paired 3.8 minus 3.7 on the same seeds: -1.3 ± 3.2 pp pooled over fields (A -0.6, D -2.0).

### 8. abc.Shadow 3.84i
APS 69.33. Fields B, C. Style unknown here beyond being strong in melee and 1v1. Prior: final rank 2.0 to 2.3, share
12 to 13%; 3 of 8 duels won at M5, 76.6% of clean 1v1 rounds (`m5-gates.md`). Shadow 3.83c scored 15.4% against Hadur 3.0.
Local 3.8 result (2026-10-06, 10 seeds a field, 35 rounds): Hadur 3.8 took 44.3% of the score over 20 battles (2 fields), mean place 6.0 against its 3.2, out-scored it in 1 / 20. Paired 3.8 minus 3.7 on the same seeds: -3.0 ± 2.5 pp pooled over fields (B -0.6, C -5.4).

### 9. ags.Glacier 0.2.11
APS 68.92. Fields A, C. Style unknown; no run recorded.
Local 3.8 result (2026-10-06, 10 seeds a field, 35 rounds): Hadur 3.8 took 48.2% of the score over 20 battles (2 fields), mean place 5.5 against its 4.5, out-scored it in 6 / 20. Paired 3.8 minus 3.7 on the same seeds: -0.8 ± 2.2 pp pooled over fields (A -1.7, C +0.0).

### 10. kc.mini.Mirage 0.2
APS 68.31. Fields B, D. Style unknown; the name suggests a mini-class robot. No run recorded.
Local 3.8 result (2026-10-06, 10 seeds a field, 35 rounds): Hadur 3.8 took 46.5% of the score over 20 battles (2 fields), mean place 5.0 against its 3.1, out-scored it in 3 / 20. Paired 3.8 minus 3.7 on the same seeds: -0.2 ± 1.6 pp pooled over fields (B +0.3, D -0.8).

### 11. rsalesc.melee.Medina 0.4.5
APS 68.09. Fields A, E. Style unknown; no run recorded.
Local 3.8 result (2026-10-06, 10 seeds a field, 35 rounds): Hadur 3.8 took 54.3% of the score over 20 battles (2 fields), mean place 5.2 against its 8.0, out-scored it in 17 / 20. Paired 3.8 minus 3.7 on the same seeds: -1.2 ± 3.2 pp pooled over fields (A -0.2, E -2.1).

### 12. mn.Combat 3.25.0
APS 68.07. Fields D, E. Style: extends `TeamRobot`, and its team build leads the TeamRumble
(`docs/architecture-evolution.md`). No melee run recorded.
Local 3.8 result (2026-10-06, 10 seeds a field, 35 rounds): Hadur 3.8 took 50.6% of the score over 20 battles (2 fields), mean place 5.2 against its 6.0, out-scored it in 12 / 20. Paired 3.8 minus 3.7 on the same seeds: +1.6 ± 2.3 pp pooled over fields (D +2.1, E +1.2).

### 13. rz.Aleph 0.34
APS 67.93. Fields B, E. Style unknown, but the classic-set regular and the best-measured here. Prior: it took the top
of the classic field at every version, mean final rank 1.0 to 1.3 and a 13 to 17% share (3.0: 1.2, 16.3%, 48 round
wins; `melee-3.0-classic.md`), and Hadur's survival was second only to Aleph's (`m6-gates.md`).
Local 3.8 result (2026-10-06, 10 seeds a field, 35 rounds): Hadur 3.8 took 49.1% of the score over 20 battles (2 fields), mean place 5.8 against its 5.2, out-scored it in 5 / 20. Paired 3.8 minus 3.7 on the same seeds: +0.0 ± 3.2 pp pooled over fields (B -0.4, E +0.4).

### 14. catcat20.Matcha 0.006
APS 66.50. Fields A, D. Style unknown; no run recorded.
Local 3.8 result (2026-10-06, 10 seeds a field, 35 rounds): Hadur 3.8 took 52.6% of the score over 20 battles (2 fields), mean place 4.5 against its 6.5, out-scored it in 17 / 20. Paired 3.8 minus 3.7 on the same seeds: -1.5 ± 3.2 pp pooled over fields (A -2.8, D -0.2).

### 15. wompi.Numbat 2.1
APS 66.48. Fields C, E. Style unknown; no run recorded.
Local 3.8 result (2026-10-06, 10 seeds a field, 35 rounds): Hadur 3.8 took 50.1% of the score over 20 battles (2 fields), mean place 6.2 against its 7.0, out-scored it in 13 / 20. Paired 3.8 minus 3.7 on the same seeds: -2.2 ± 2.4 pp pooled over fields (C -5.3, E +0.9).

### 16. justin.Mallais 14.0
APS 65.89. Fields A, C. Style unknown; no run recorded.
Local 3.8 result (2026-10-06, 10 seeds a field, 35 rounds): Hadur 3.8 took 50.0% of the score over 20 battles (2 fields), mean place 5.5 against its 6.1, out-scored it in 12 / 20. Paired 3.8 minus 3.7 on the same seeds: -3.2 ± 2.7 pp pooled over fields (A -0.4, C -5.9).

### 17. kc.micro.Figment 1.0
APS 65.38. Fields B, C, D (three). Style unknown; the name suggests a micro-class robot (the jar is 5 KB). No run recorded.
Local 3.8 result (2026-10-06, 10 seeds a field, 35 rounds): Hadur 3.8 took 61.0% of the score over 30 battles (3 fields), mean place 5.5 against its 9.5, out-scored it in 30 / 30. Paired 3.8 minus 3.7 on the same seeds: -0.7 ± 2.8 pp pooled over fields (B -1.0, C -2.2, D +1.2).

### 19. catcat20.Lambda 0.024
APS 65.09. Fields C, D, E (three). Style unknown; no run recorded.
Local 3.8 result (2026-10-06, 10 seeds a field, 35 rounds): Hadur 3.8 took 53.3% of the score over 30 battles (3 fields), mean place 5.6 against its 7.8, out-scored it in 26 / 30. Paired 3.8 minus 3.7 on the same seeds: -3.6 ± 2.8 pp pooled over fields (C -5.8, D -2.3, E -2.7).

### 20. wompi.Wallaby 5.1
APS 64.99. Fields A, B, C (three). Style unknown; no run recorded.
Local 3.8 result (2026-10-06, 10 seeds a field, 35 rounds): Hadur 3.8 took 53.0% of the score over 30 battles (3 fields), mean place 5.5 against its 7.5, out-scored it in 27 / 30. Paired 3.8 minus 3.7 on the same seeds: -2.4 ± 2.8 pp pooled over fields (A -1.7, B -0.3, C -5.2).

### 21. stelo.PastFuture 2.3.2 (stands in for Nullstride)
APS 64.86. Fields A, B. Style unknown; no run recorded.
Local 3.8 result (2026-10-06, 10 seeds a field, 35 rounds): Hadur 3.8 took 59.6% of the score over 20 battles (2 fields), mean place 5.1 against its 9.2, out-scored it in 20 / 20. Paired 3.8 minus 3.7 on the same seeds: -1.5 ± 1.9 pp pooled over fields (A -3.2, B +0.3).

### 22. stelo.Spread 0.9 (stands in for Nullstride's gap)
APS 64.80. Fields B, D. Style unknown; no run recorded.
Local 3.8 result (2026-10-06, 10 seeds a field, 35 rounds): Hadur 3.8 took 58.0% of the score over 20 battles (2 fields), mean place 5.0 against its 8.6, out-scored it in 20 / 20. Paired 3.8 minus 3.7 on the same seeds: -0.0 ± 3.0 pp pooled over fields (B -1.0, D +0.9).

## Follow-ups that need Java changes

Issue #102 closed the first four: melee now has `--parallel` (seeds of a field at once on worker homes,
with `--child-cpus` and `--child-heap`), `--cpu-constant` pinned in every home and named in a host line,
the skipped-turns (and duress) tallies, `--baseline` with a per-field paired table, and `--per-opponent`.
Written without a battle run (the host was busy), so the first real run is also the smoke test. What is
left:

1. **Pooled per-opponent across fields, with the baseline.** `--per-opponent` is one field's battles per
   opponent. Pooling an opponent over the fields it stood in, and pairing that pool against the baseline,
   is still `data/tools/melee_pairwise.py` (candidate only) and a pooled paired table does not exist.
2. **No killer record.** `rounds.csv` has Hadur's place and the last duel opponent, not who killed Hadur
   in a crowded round; that needs a death-event harvester in `MeleeHarvester`.
3. **No hit-rate or shield diagnostics in melee**: the 1v1 report's "Unhittable" and "Aggression"
   sections have no melee equivalent. Duress is now only a per-field tally of ticks from the R records.
4. **Seed reuse across fields**: every field's battle `i` uses `RANDOMSEED=i`, so the five fields are not
   decorrelated in their first-turn randomness. Unlikely to matter, but a field-specific offset would remove it.
