# Shipped per-opponent line audit (18 Nov 2026)

Each shipped per-opponent line was run against its off-switch on master 9c776187c: arm c (as shipped) vs the same
build with that robot's line(s) dropped (slistdrop for shield-list lines; a line-drop ablation for table entries).
4 fresh live-timing seeds each (35 rounds, --cpu-constant live), paired by seed. A line whose 95% interval sat wholly
below 0 got 12 more fresh seeds with the A/A twin as a second on-arm before removal.

| Group | Robots | Below 0 after 12 seeds | Clearly positive |
|---|---|---|---|
| Shield-list lines, 4 Nov table | 271 | none (17 noisy rows re-seeded, all kept) | 225 |
| Table and list lines dated 5-15 Nov | 117 | radnor.RamRod 1.0 gunStacks | 40 |
| Table-only lines, 4 Nov (surfKeys, stopGos, stopGoShifts, mimicOns) | 206 | scheronimus.AntiRebel 1.1 stopGoShifts | 66 |

Removed here:
- radnor.RamRod 1.0 from gunStacks: on minus off -3.08 +-2.11 share points on 12 fresh seeds (mean of c and twin);
  -2.43 +-2.20 over all 16 seeds vs c.
- scheronimus.AntiRebel 1.1 from stopGoShifts: -2.37 +-0.98 vs c and -2.69 +-0.98 vs the twin on 12 fresh seeds.

Two other candidates were level on 12 fresh seeds and stay: bvh.mini.Wodan 0.50 heatJits, davidalves.net.Duelist
0.1.6src surfKeys. Lines dated 16-17 Nov were locked on 12+ fresh seeds days ago and were not re-run.
