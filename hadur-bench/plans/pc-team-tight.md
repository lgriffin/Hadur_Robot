# The `pc-team-tight` card (BENCH-274)

The bench shall carry the `pc-team-tight` card, which builds TMODE-59 on (`tmtight`, suffix tp) beside an aa baseline and a bb A/A copy and fights only the five teams of `plans/team-tight-set.txt` (OgiTeam, ShadowTeam, AlephTeam, Xmen, DemoniacNimrods), 12 rounds: a pilot of tp at 4 fresh seeds from 31000 with a stop below 0 projected APS, then bb and tp at 24 fresh seeds from 31100, each paired with aa, gated by `tools/team_modes.py gate` at +0.3 APS with the 95% low end above zero, the five teams' gain spread over the 47 TeamRumble pairings. Every battle step shall stop on 10 failed battles, on no battle in 30 minutes, or on 60 or more skipped turns a battle over the last 200, and the card shall end in a results PR on `claude/pc-team-tight-results`.

Stage or check: T7
