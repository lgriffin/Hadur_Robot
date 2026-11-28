# Sanara: a NanoRumble 1v1 entry

Sanara (`hadur117.nano.Sanara`) is a 1v1 nanobot for the NanoRumble (codesize under 250 bytes,
about 300 robots). It is a duel design from the first byte and shares no subsystem with Sanaro, the
NanoMelee entry: Sanaro 0.3 benched 26.7 ± 3.2 APS in this division, because melee anti-gravity
backs away from a single enemy along a line any gun reads, its wall push is tuned for the 1000 px
melee field, and its far 0.1 shots only cost energy in a duel.

Nothing is entered yet. The work so far is the over-budget base and the bench pieces to screen it.

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
