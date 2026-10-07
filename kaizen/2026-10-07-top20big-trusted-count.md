# The bench report and the analysis gate disagree on how many battles are trusted

Finding: the 100-seed run's bench report says 1359 of 2000 candidate battles are trusted, while the analysis gate holds 328 of 2000 pairs as untrusted, so the two readings of the same rows differ by about 450 battles.
Run: `docs/bench/local/2026-10-07_top20big-385.md`, read with `docs/bench/local/2026-10-07_top20big-385-findings.md`
Raised: 2026-10-07

## 5 Whys

1. Why does the report say only 1359 of 2000 are trusted? Report.java counts a battle as untrusted when `roundRecords` is not equal to `rounds`. In the exported rows 494 of the 2000 candidate battles are one round short of R records.
2. Why are so many battles one round short? In 972 of the 982 battles (both builds) with a shortfall, exactly one record is missing and it is the last round's (`finalRMissing`, G14), a loss the engine does this on both builds. Re-counting with that one exception gives 1810 of 2000 candidate battles trusted.
3. Why does the analysis gate say something different? `analyse.py` `untrusted_reasons` already leaves the final-round loss out (it holds a row against `short - final > 0` only), while `BattleResult.trusted()` and the report's Trust table do not.
4. Why do the two differ? G14 entered the Java side in commit a7c9c47d as a signal only (`finalRMissing`), and the exception for it entered `analyse.py` later, in commit 074ea653 with analysis.json. `BattleResult.trusted()` and the Trust table were not changed then, so "trusted" has two definitions.
5. Why did nothing flag it? No test compares the two rules on one set of rows, so the drift was invisible until a 4000-row run put both numbers side by side.

Chain ends at: the trusted rule is written twice (Java and Python) with no test that they agree.

## Countermeasure

Kind: harness-change
Action: Make `BattleResult.trusted()` and the report's Trust table apply the same final-round exception as `analyse.untrusted_reasons`, and add one test that feeds the same fixture rows (including a battle one round short with `finalRMissing` 1) to both and requires the same verdict.
Owner: not assigned
Due: not set
Verified by: open

## Follow-up

- The next report's Trust table reads about 1810 of 2000 for this run's rows, and the number matches the A3 page's untrusted-pair count.
- Left as it is, nothing about the score-share results changes: the pooled difference is -0.32 on all pairs and -0.36 on the 968 pairs with no duress, skip or R shortfall.
