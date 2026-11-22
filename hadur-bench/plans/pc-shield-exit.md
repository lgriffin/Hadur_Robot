# The `pc-shield-exit` card (BENCH-126)

The bench shall carry the `pc-shield-exit` card, which builds SHIELD-11's battle exit at 400 damage (`sdmg400`) and with no damage exit (`sdmgoff`) beside an aa A/A copy, runs them against all robots on the shield list at 3 seeds from 3400 and gates each at +0.10 APS with the 95% low end above zero, writes the per-robot pick and every robot's difference with losses (`tools/per_robot.py`), stops before the results PR if any analysis fails, and verifies the three stop-and-go re-picks (`slistdrop,sgolist,sgo2list`) on 6 fresh seeds from 3500.

Stage or check: T7
