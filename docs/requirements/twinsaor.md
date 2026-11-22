# Requirements: TwinSaor (Twin Duel)

TwinSaor, the Twin Duel team ([twinsaor.md](../twinsaor.md)).

EARS requirements, one row each; [README](README.md) gives the rules. IDs never change meaning and are never reused; a requirement that is dropped moves to [retired.md](retired.md).

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| TWIN-1 | Ubiquitous | The team shall be one robot class listed twice in the team file, neither member a Droid. | W0 |
| TWIN-2 | Unwanted | If the codesize tool reports 2,000 bytes or more for the team jar, then the build shall fail. | W0 |
| TWIN-3 | Ubiquitous | The domain core (`hadur117.twin.core`) shall not import or reference `robocode.*`, and the module shall depend on no Hadur or Saor module. | W0 |
| TWIN-4 | Unwanted | If a scanned robot is a teammate, then the twin shall neither target it nor learn from it. | W1 |
| TWIN-5 | Event | When a twin scans an enemy, it shall broadcast the scan, and both twins shall handle it by the same path. | W1 |
| TWIN-6 | Event | When a twin handles two scans of one enemy by one scanner one tick apart, it shall record that transition in its table for that enemy. | W0 |
| TWIN-7 | State | While two enemies live, both twins shall target the enemy with the least energy, switching only when the other is lower by 20 or more. | W0 |
| TWIN-8 | State | While both twins and both enemies live, the leader shall hold its radar on the target and the other twin on the other enemy. | W1 |
| TWIN-9 | State | While both twins live, each shall drive to a station 45 degrees either side of the team's bearing from the target, at 250 px with two enemies and 160 px with one (0.1: 100). | W0 |
| TWIN-10 | Event | When the target's energy drops by 0.1 to 3 between scans, a twin on its station shall reverse its leg. | W0 |
| TWIN-11 | Unwanted | If the partner is nearer than the target and within 0.15 rad of the gun heading, then the twin shall not fire. | W0 |
| TWIN-12 | State | While a twin is the last of its team against two enemies, it shall play Saor's corner oscillation on the 800 field. | W0 |
| TWIN-13 | Event | When a twin handles a scan of an enemy, it shall OR into its mode the mode table's entry at that enemy's name-hash slot; mode bit 1 shall stop the leg reversing on the target's shot (TWIN-10) and mode bit 2 shall set the two-enemy station range to 180 px. | W3 |
| TWIN-14 | Unwanted | If a team's mode table entry reads below zero on a fresh-seed gate against both the release before it and the default without the entry, then the entry shall not ship. | W3 |
