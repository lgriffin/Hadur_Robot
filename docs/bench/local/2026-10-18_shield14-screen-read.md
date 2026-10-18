# SHIELD-14 screen: shield waves for wall-hit shots, on the stop-and-start

2026-10-18. 3.13hjsw (`heatjit,swall`: the stop-and-start plus SHIELD-14, commit 792391ac) against
3.13hj, paired, the 200 robots of 3.13's shield list (`hadur-bench/shield-313.txt`) in 4 chunks
(`work/sw-hjsw-c0..3-*`, sets `work/sw/c*.txt`), seeds 980-981, 35 rounds, cloud. Score share per
opponent is the mean over both seeds; APS is the sum of per-opponent differences over the 1,217
pairings (only listed robots can change).

| | Value |
|---|---|
| Mean difference, score share | **+0.71 points (+0.16 to +1.27)** |
| APS over the whole field | **+0.12 (+0.03 to +0.21)** |
| Robots up / down | 119 / 76 |
| Damage taken a round | 3.60 -> 3.02 |

What got through, from the `SB` records (both builds, 400 battles each):

| Class | 3.13hj damage | 3.13hjsw damage |
|---|---|---|
| nowave | 6,296 | **2,030** |
| off (after the mode is left) | 24,114 | **20,079** |
| missed | 8,947 | 8,564 |
| unshielded | 9,240 | 9,792 |
| first | 1,960 | 1,812 |
| Battles where SHIELD-6's budget ended the mode | 76 | 58 |

The fix removes two thirds of the nowave damage, as the leak read predicted
(`2026-10-18_shield-nowave-read.md`), and a second gain the ceiling did not count: with fewer hits
taken, SHIELD-6's damage budget runs out in fewer battles, so the mode stays on and the `off` damage
falls by about as much again. That is why the result beats the +0.08 nowave ceiling.

With the stop-and-start's +0.24 (whole field) the stack is about +0.36 APS, over the +0.3 gate on
screens, so it goes to the census (Leigh, 2026-10-17: census once the stack clears +0.3).
