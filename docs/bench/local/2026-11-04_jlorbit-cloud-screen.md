# Multi-arm run

| Arm | Battles | Finished | Mean score share | Engine disables | Skipped turns a battle |
|---|---|---|---|---|---|
| aa | 80 | 80 | 87.54% | 0 | 0.1 |
| c | 80 | 80 | 87.84% | 0 | 0.0 |
| far | 80 | 80 | 88.70% | 0 | 0.1 |
| near | 80 | 80 | 88.14% | 0 | 0.0 |

Paired comparisons, the A/A band and factorial effects: `python3 data/tools/multiarm.py arms.tsv`.

Conditions: robocode.cpu.constant=3803444. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v233, no other Robocode JVMs running, parallel 1. Battle JVM flags: -Xmx2G. Rounds 10, field 800x600, 1 seed(s) an arm.

## JayLexi orbit screen (pc-jaylexi-orb, BENCH-187)

c = the 0.5 orbit base (every robot 1.15 rad, plays as 0.4), aa its A/A rebuild, near every robot 1.35, far every
robot 0.95. Panel kitlab/mini-mid-field.txt (80 robots of ranks 121-450), 1 seed (9970), 10 rounds.

| Arm | Mean vs c (points) | Robots at +3 or more |
|---|---:|---:|
| aa (null) | -0.30 ± 0.48 | 1 |
| near | +0.31 ± 1.40 | 19 |
| far | +0.86 ± 1.39 | 22 |

Biggest single reads: Prestige +21.8 near / +17.8 far, OthoMicro +16.1 / +15.8, IotaCT +14.7 / +14.2, AceSurf +10.9 /
+15.6. Robots that read big for both arms are partly c having a bad seed there; the PC pilot pools c and aa against
that. One seed a robot is noise-heavy, which is why the card pilots first.
