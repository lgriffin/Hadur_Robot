# The `pc-team-family` card (BENCH-301)

The bench shall carry the `pc-team-family` card, which builds two family teams with the `tmfamily` ablation (TMODE-65) beside an aa baseline and a bb A/A copy: `fn`, five member classes running one brain, and `fd`, two radar members and three Droid members. It pilots each arm on the top eight teams of `plans/team-family-pilot-set.txt` at 8 fresh seeds from 45600, 12 rounds, stopping an arm whose projected change is under -0.30 APS, then screens bb and each arm that cleared on the whole field (`team-census46.txt`) at 12 fresh seeds from 45700, paired with aa and gated by `tools/team_modes.py gate` at +0.10 APS with the 95% low end above zero over 47 pairings. Every battle step shall stop on 10 failed battles, on no battle in 30 minutes, or on 60 or more skipped turns a battle over the last 200, and the card shall end in a results PR on `claude/pc-team-family-results`.

Stage or check: T7
