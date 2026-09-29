# BENCH-4: the cross-version prefill condition

Part of R4b (see [r4-client-conditions.md](r4-client-conditions.md) for the rest of the
matrix): the plan's top candidate for the 08:30 UTC collapse is a data directory a real
client wrote with more than one Hadur version, since `robots/.data/hadur2/Hadur.data/` is
shared by every version installed there. Built here by running the 2.2 jar warm (never
wiped) over the weak set to 184 KB, then the 3.0 jar warm on top of it (same 184 KB, its
profiles), then running 3.2 prefilled from that directory over the same set, cold rounds
per opponent as usual but never wiping mid-pass.

**Result: not reproduced.** Survival stays 97 to 100%, the usual one round in 35 lost on
two opponents (bench noise, `data/learnings.md` L-19), against the live drop to 71-77%.

One bench pass per condition, each isolating one difference from the rumble client's default (a shared or prefilled data directory, CPU constant, background load, engine or JVM). Survival share is Hadur's fraction of rounds survived.

## prefilled by 2.2 then 3.0

robocode.cpu.constant=3980385.

| Opponent | Survival share | Skipped turns | Rounds won | Battles ok |
|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 100.0% | 14 | 35 / 35 | 1 / 1 |
| abud.ThirdRobo 1.0 | 100.0% | 13 | 35 / 35 | 1 / 1 |
| bons.NanoStalker 1.2 | 100.0% | 3 | 35 / 35 | 1 / 1 |
| dittman.BlindSquirl Retired | 100.0% | 16 | 35 / 35 | 1 / 1 |
| hlavko.nano.Ringo 2.0 | 100.0% | 9 | 35 / 35 | 1 / 1 |
| jep.nano.Hawkwing 0.4.1 | 97.1% | 11 | 34 / 35 | 1 / 1 |
| kawigi.sbf.Barracuda 1.0 | 97.1% | 10 | 34 / 35 | 1 / 1 |
| nexus.Two 0.2 | 100.0% | 6 | 35 / 35 | 1 / 1 |
| pa.Improved 1.1 | 100.0% | 7 | 35 / 35 | 1 / 1 |
| quietus.NarrowRadar 0.1 | 100.0% | 7 | 35 / 35 | 1 / 1 |
| racso.Crono 1.0 | 100.0% | 11 | 35 / 35 | 1 / 1 |
| zzx.Gron 1.14 | 100.0% | 10 | 35 / 35 | 1 / 1 |

