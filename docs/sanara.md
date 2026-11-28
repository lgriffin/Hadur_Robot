# Sanara: a NanoRumble 1v1 entry

Sanara (`hadur117.nano.Sanara`) is a 1v1 nanobot for the NanoRumble (codesize under 250 bytes,
about 300 robots). It is a duel design from the first byte and shares no subsystem with Sanaro, the
NanoMelee entry: Sanaro 0.3 benched 26.7 ± 3.2 APS in this division, because melee anti-gravity
backs away from a single enemy along a line any gun reads, its wall push is tuned for the 1000 px
melee field, and its far 0.1 shots only cost energy in a duel.

Sanara 0.1 is built in its own module, `sanara/` (249 bytes, `mvn -pl sanara verify`). It benched 78.4 on the whole division and entered the NanoRumble on 28 November 2026 at 5th of 300, 78.08 APS (PWIN 91.97%), 2.65 behind 1st; the sections below record how it got there.

## 1. The design

- **Radar.** One call locks the radar: turn it back by whatever turn is left, every scan.
- **Movement.** A perpendicular orbit at full speed, tilted by the distance error so it drifts out
  when the enemy closes and in when it hangs back. When the enemy's energy drops (a shot), Sanara
  reverses with a chance read from a table by distance; it also reverses on a wall hit. No stop
  option and no random speed: both lost on our MiniRumble and MicroRumble bots.
- **Gun.** Symbolic pattern matching: one character a tick holds the enemy's lateral velocity; the
  longest recent match of up to 30 ticks is found by string search, and the lateral speeds that
  followed it are summed over the bullet's flight and divided by distance, giving a bearing offset
  directly instead of a rebuilt position. A match i ticks back means the history repeats with
  period i, so the replay wraps back to the match when it reaches the present.
- **Energy.** Power 3 inside 200 px, else 2, from a table; never a 0.1 shot.
- **Known approximation.** Any drop in the enemy's energy counts as a shot, including the damage
  of Sanara's own hits; telling them apart costs bytes the fitted build does not have.

Published techniques used, credited here and in the source: symbolic pattern matching and the
one-call radar lock (both described on the RoboWiki), and reacting to an enemy shot from its
energy drop. The reversal chance by distance, the distance tilt, the angular replay and the tables
are Sanara's own.

## 2. Bytes

Tables live in string constants, which the rumble's codesize count (method bytecode only) does not
charge. A sizing build priced the parts with javac: shell 41, radar 8, reversal on a shot 41, orbit
36, pattern gun 107, aim and power 68, 301 in all. The fitted build (flat reversal chance, power 2,
the matched tick's speed held over the flight instead of a tick-by-tick replay, no radar-for-gun
adjust) compiles to 254, so about 5 bytes still have to come from byte-identical golf or one more
cut that the screen shows is free.

## 3. The bench pieces

| File | What it is |
|---|---|
| `hadur-bench/kitlab/arms/Sanara-0.java` | the over-budget base 0.0; every screen knob is a constant at the top |
| `hadur-bench/kitlab/sanara-arms.txt` | the step 2 arms, one sed each over the base |
| `hadur-bench/kitlab/sanara_arms.sh` | builds the arms as `kitlab/jars/hadur117.nano.Sanara_<NAME>.jar` |
| `hadur-bench/kitlab/arms/SanaraProbe*.java` | the step 0 probes: still, orbit, and orbit with a 0.5 reversal on each shot; all aim head-on at power 2 |
| `hadur-bench/kitlab/nano-all-field.txt` | the whole division, 299 bots at weight 1 |
| `hadur-bench/kitlab/nano-smoke-field.txt` | eight top nanos for a quick check |

Build and run one arm (`kitlab/run.sh FIELD JAR "NAME VER" LABEL SEEDS PARALLEL`):

```
kitlab/sanara_arms.sh c aa p4
kitlab/run.sh nano-all kitlab/jars/hadur117.nano.Sanara_c.jar "hadur117.nano.Sanara c" sanara-c 2 3
```

## 4. The plan

1. **Step 0, behaviour profile.** The top 5 and ten rank-band bots against the three probes and
   Sanara, with the truth log on (`KITLAB_TRUTH=true kitlab/run.sh ...`): their hit rate per
   motion, shots and power per round, distance.
2. **Step 1, the base.** Sanara 0.0 built and smoke-tested (no exceptions, no skipped turns).
3. **Step 2, the screen.** The arms on a 60-bot sample of the division, 2 seeds, read against `c`
   and `aa`. The best pair must project 74 or better before any golf.
4. **Step 3, the fit.** Cuts the screen allows, byte-identical golf checked by replay, a jar at
   249 bytes or less in its own module.
5. **Step 4, the read.** The whole division at 2 seeds, then 12 seeds; the entry gate is a
   projected 78 (top 5), with about 76 (top 15) as the fallback.

## 5. Results so far

| Run | Field | Result |
|---|---|---|
| 0.0 smoke, 1 seed | 8 top nanos | 50.9 ± 9.4 score share; beats LittleBlackBook 1.0 (62%), PatternAdept 1.0 (64%), Caligula, Machete; loses to PralDeGuerre (37%) and ThnikkaBot (35%); 0 skipped turns |
| 0.0 first build, 1 seed | whole division, 299 bots | 69.1 ± 2.2 score share, about 54th on the live table (Sanaro 0.3: 26.7); by live rank: top 5 53.4%, 6-20 52.6%, 21-50 50.3%, 51-100 57.0%, 101-200 64.1%, 201+ 89.3%; 0.3 skipped turns a battle |
| 0.0 with the wrapping replay (arm `c`), 1 seed | whole division, 299 bots | 69.8 ± 2.2, about 50th; paired against the first build +0.70 ± 0.67 per bot; 0.3 skipped turns a battle |
| PatternAdept 1.0 (live 5th) as a reference, 1 seed | whole division | 77.6 ± 2.4; against Sanara 0.0 on each bot it is level or behind in the top 50 and 8.1 APS ahead across ranks 51 to 250 |
| arm `p0`, 1 seed | whole division | -3.92 ± 2.38 against 0.0 (top 50 -13.9 a bot) |
| arm `bandit`, 1 seed | whole division | 73.1, +3.29 ± 1.40 against 0.0 (ranks 51 to 250 +5.1 a bot, top 50 -1.2) |
| bandit with a closer distance, 1 seed | whole division | ideal 150 px 75.7, 200 px 76.4, 250 px 77.7, 300 px 77.5, 350 px 76.2; 520 px without bandit -5.7 against 0.0 |
| `b250`, `b300`, `c` and PatternAdept, second seed | whole division | `b250` 77.0, `b300` 77.5, `c` 69.9, PatternAdept 77.7 |
| two seeds pooled, paired against PatternAdept (live 77.69) | whole division | `b300` 77.58 (95% low 76.27), `b250` 77.46 (low 76.05), `c` 69.96; `b300` against PatternAdept by live rank: 1-20 +11.3, 21-50 +5.7, 51-100 -2.6, 101-250 -1.8 |
| other single changes, 1 seed, against 0.0 | whole division | tick-by-tick replay replaced by the matched tick held (`short`) -13.4; power 2 flat -2.5; reversal chance 8/64 -2.4; key 20 -0.6; aim jitter -0.9; history cap -0.2 |

The first read says the gun and the reversal already hold the top of the field level, and the points are lost in the middle: ranks 51 to 200 out-shoot the orbit (their score is about half bullet damage, none of them rams). That is the band the reversal arms (`p8`, `tick`, `ptab`) and the distance arms are aimed at.

The behaviour profile (`kitlab/nano-probe-field.txt`: the live top 5 and the 25 bots ranked 51+ that beat 0.0 hardest) explains it. Many mid-field bots aim roughly head-on, and reversing when they fire steps Sanara back onto their line: they hit a plain orbit 4 to 8% of their bullet damage potential and Sanara 13 to 18%. Learning and linear guns are the other way round: they hit the plain orbit 31 to 63% and the reversing orbit about half that. So the movement is chosen per opponent: `BANDIT` plays each mode for a round, then each round plays the mode that has taken less fire per tick (`DECAY` weights later rounds).

The chooser and a closer orbit carry the base to PatternAdept's level: `b300`, pooled over two seeds, projects 77.6, above the top 10 line (76.6). The tick-by-tick replay and the power table both pay, so neither is a free cut.

The bytes are the open problem. A lean build of `b300` (no screen knobs) is 416 bytes, 95 of them the round-by-round chooser. Replacing the chooser with a per-opponent list of plain-orbit bots in a string constant costs about 10 bytes, and a first golf pass brings that build to 317. The arms `r300` (always reverse) and `o300` (always plain orbit) measure which mode each bot needs, to build that list and to bound what it can gain. About 70 bytes still have to come from golf or from a cut that costs the least score.

**A fixed mode per opponent beats the chooser.** At 300 px, two seeds each: always reverse (`r300`) 73.2, always orbit (`o300`) 66.1, the chooser (`b300`) 77.5. Picking each bot's mode from one seed and scoring it on the other projects 79.3 ± 1.4 paired against PatternAdept, and the list costs about 10 bytes against the chooser's 95. `kitlab/sanara-orbit-300.txt` holds the 142 bots the plain orbit suits; the base reads it through the `ORBIT` knob. Arm `t300` (the list at 300 px) and `tp2` (the same at power 2 flat, 24 bytes cheaper) are on fresh seeds now.

Fresh seeds confirm the list: `t300` 79.52 ± 1.34 paired against PatternAdept over two new seeds (79.49 and 79.56 on each), level or ahead in every rank band and +15 a bot in the live top 20. Without the power table (`tp2`) it is 78.19, so the table is worth 1.3, nearly all of it against the top 20. On the 22 Nov table 79.5 sits third and 78.2 fifth. Next: `ttr` (the history symbol truncated instead of rounded, 3 bytes) and `tng` (no gun adjust for the body turn, 5 bytes), then the fit.

**The fit.** Against `t300` on two seeds, paired per bot: truncating the history symbol instead of rounding (`ttr`, 3 bytes) costs 0.67 ± 0.47, dropping the gun's adjust for the body turn (`tng`, 5 bytes) 0.53 ± 0.41, and power 2 flat (`tp2`) 1.33 ± 0.64. javac cannot get the list build under about 300 bytes, so the fitted class is written as bytecode with ASM (`kitlab/sanara-gen/Gen.java`, class version 49, no stack map frames). The main savings: the leg length folded into `dir` (±600, so the tilt is `(300 - d) / dir`), the replay as a do-while summing `h[i-1 - n % i]` (the same sum as the wrapping replay), the history kept in the event's local slot once the event is read, and the power pushed once for both `setFire` and the flight time. The same play as `t300` is 270 bytes (`h1`). Builds at or under 249: `f1`/`f2` (power 2, no gun adjust; 249 and 245) and `g600`/`g450` (power 600/d or 450/d, which the engine caps at 3, flight time d/14, no gun adjust; 249). All are on the whole division now.

Whole division, paired against PatternAdept: `h1` (the hand-written class with `t300`'s play, 270 bytes) 79.61 on one seed, so the bytecode plays like the javac build; `h14` (flight time d/14 whatever the power) 79.51, free. Fitted builds on two seeds: `g600` 78.30 ± 1.49, `f2` 77.71 ± 1.27, `f1` 77.57 ± 1.26, `g450` 75.70 ± 1.51. Lower power at range loses, so `g800` and `g1000` are next.

Power 800/d (`g800`) and 1000/d (`g1000`) on two seeds: 78.44 and 77.67. Four seeds each settle it: `g800` 78.41 ± 1.35 (the two new seeds alone 78.39), `g600` 78.05 ± 1.50. `g800` is the entry candidate: 249 bytes, about fifth on the live table. Its orbit list was fitted on the javac build, so `r800` (always reverse) and `o800` (always orbit) refit it on the fitted build itself.

Refitting the orbit list on `g800` itself (`r800` always reverse 72.35, `o800` always orbit 65.53, two seeds each) cross-validates at 78.26, against 78.14 for the current list on the same battles: no real gain, so the list stays. Sanara 0.1 is `g800`: module `sanara/`, where `hadur117.nano.gen.SanaraGen` writes the class from `src/main/gen/sanara-orbit.txt` during the build (byte for byte the benched `g800` code, 249 bytes by Robocode's codesize tool), and `src/main/source/hadur117/nano/Sanara.java` is the readable form shipped in the jar. Release notes: `docs/releases/sanara-v0.1.md`; workflow `release-sanara.yml`.

## 0.2: a reversal chance per bot

Sanara 0.1 entered at 78.08, 5th, and the live table tracks the bench (78.28 on the same bots). Against the leader, jk.sheldor.nano.Yatagan 1.2.3 (80.73), almost the whole gap sits in live ranks 61 to 150 (2.55 of 2.85 APS); Sanara is level or ahead against the top 60. Benching Yatagan and LittleBlackBook 1.0 on the whole division shows why: they deal about what Sanara deals there, but take far less. Linear-aiming mid-field bots (TimDog, Gnome, AdeptBSB, DoctorBob, Mosquito, Elite and others) do 30 to 50 damage a round to 0.1 and 5 to 18 to the leaders.

Reversing on every shot (`c100`) cuts those bots' damage two to three times (DoctorBob 51 to 18 a round, AdeptBSB 53 to 20, Gnome 35 to 11), but costs 9 to 14 points a bot against the top 60, where pattern and learning guns read a reversal that always comes. So the chance is set per bot. The screens at chance 0 (`o800`), 0.45, 0.6 (`g800`), 0.75, 0.9 and 1 (`c45` to `c100`) give each bot's best, kept only when it leads 0.1's mode by more than 2 points; picking on one half of the seeds and scoring on the other projects 81.0 to 81.3.

The chance costs no bytes. The reversal test is `Math.random() * 58000 > CHANCE.indexOf(name)`: a bot's place in the chance string is its chance, `1 - index / 58000`, padding `|` sets each group's place, chance-0 bots sit past 58000, and a bot not in the string reverses on every shot. That replaces the orbit-list test and the 0.6 compare and is one byte shorter: 248 bytes. `SanaraGen` lays the string out from `src/main/gen/sanara-chance.txt` and fails the build if any listed bot would land more than 0.03 from its chance (SANARA-4); the bench builds use `kitlab/sanara-gen/layout.py`, which also checks every bot in the field.

| Read | Field | Result |
|---|---|---|
| Yatagan 1.2.3 and LittleBlackBook 1.0 as references, 1 seed | whole division | live ranks 61-150: damage taken a round Yatagan 23-31, LittleBlackBook 20-28, PatternAdept 28-38, Sanara 0.1 27-39 |
| `p6` (chances 0 to 1), 2 fresh seeds | whole division | 81.48 ± 1.04 paired against PatternAdept; +3.04 ± 0.84 a bot against 0.1; by live rank: 1-20 +14.7, 21-50 +10.2, 51-100 +3.3, 101-250 +2.5 against PatternAdept |
| `p3` (chances 0, 0.6, 1 only), 2 fresh seeds | whole division | 81.26 ± 1.03; +2.81 ± 0.82 against 0.1 |
| `p6` against Yatagan on the same bench, 1 Yatagan seed | whole division | -0.13 ± 0.89 a bot: level |

Sanara 0.2 is `p6`.
