# Worker ladder

Battles an hour against the number of battles run at once (BENCH-98). Skips a round are the
engine's skipped-turn lines per robot-round of Hadur (duel) or of each team member (team);
ratios are against the base run of the same kind. Pick rule: the widest run whose skips a
round stay within 15% of the base, whose engine disables a 100 battles stay within
1 of the base's and whose battles an hour are at least the base's. Truth-log-off runs
are left out of the pick and compared with the truth-on run of their width.

| Run | Kind | Workers | Battles | Minutes | Battles an hour | vs base | Skips a round | vs base | Disables /100 | Truth log MB a battle |
|---|---|---|---|---|---|---|---|---|---|---|
| d12 | duel | 12 | 416 | 10.6 | 2345 | 1.00x | 0.465 | 1.00x | 3.1 | 1.5 |
| d16 | duel | 16 | 416 | 9.3 | 2691 | 1.15x | 0.534 | 1.15x | 2.9 | 1.5 |
| d20 | duel | 20 | 416 | 9.3 | 2692 | 1.15x | 0.785 | 1.69x | 9.6 | 1.5 |
| d24 | duel | 24 | 416 | 9.0 | 2769 | 1.18x | 0.906 | 1.95x | 12.0 | 1.5 |
| d12x | duel | 12 | 416 | 10.2 | 2450 | 1.05x | 0.530 | 1.14x | 6.5 | 0.0 |
| d16x | duel | 16 | 416 | 8.9 | 2816 | 1.20x | 0.658 | 1.41x | 8.4 | 0.0 |
| t8 | team | 8 | 184 | 13.0 | 850 | 1.00x | 0.112 | 1.00x | 0.0 | 0.0 |
| t12 | team | 12 | 184 | 10.7 | 1028 | 1.21x | 0.119 | 1.06x | 0.0 | 0.0 |
| t16 | team | 16 | 184 | 9.6 | 1144 | 1.35x | 0.148 | 1.32x | 0.0 | 0.0 |

## Verdict

- duel: run at **16 workers** (d16): 2691 battles an hour, +15% on d12 at 12.
- team: run at **12 workers** (t12): 1028 battles an hour, +21% on t8 at 8.
- truth log off, d12x against d12 at 12 workers: +5% battles an hour, skips a round 0.530 against 0.465.
- truth log off, d16x against d16 at 16 workers: +5% battles an hour, skips a round 0.658 against 0.534.
