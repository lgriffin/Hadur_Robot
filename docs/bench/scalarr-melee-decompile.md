# How ScalarR survives melee: a read of its decompiled jar (2026-10-30)

Leigh's ask (2026-10-30 16:05 GMT): "Can we deobfuscate ScalarR's bot?" ScalarR (aaa.r.ScalarR by
xor) leads the MeleeRumble with 73.09 APS and 82.9% survival. This note is what the jar shows
about its melee energy management, its melee surfing and its shadows, and which of its ideas
Deise and Hadur's melee could test.

Nothing below is copied code. Each idea is described in our words so we can write our own
version, as with the team read (docs/bench/team-top-decompile.md).

## 0. What was read, and the licence

- Jar: `aaa.r.ScalarR_0.005g.047.jar` (2019-02-27), from the robocode archive. It is the version
  the robowiki version history lists as the melee entry (1st, 73.09 APS, survival 82.94).
- **Licence:** none. The jar ships no licence file and no source, and the robowiki version
  history says nothing about a licence or released code. The class names are obfuscated on
  purpose. So we read it to learn ideas and write our own code. Nothing goes into Hadur, Deise
  or any other robot verbatim.
- **Readability:** good. CFR 0.152, Vineflower 1.10.1 and Procyon 0.6.0 each decompile all 459
  classes with no failed methods (Vineflower flags two `finally` blocks that it could not inline,
  and they are harmless). Class, field and method names are single letters (`a`, `aH`, `eO`),
  but the Robocode API calls, the constants and the log strings ("Surf warm up takes {}ms",
  "orbitalSmooth takes 4 times to finish", "Illegal risk {}") are kept, so the structure can be
  traced from `setFire`, `getEnergy` and the event handlers inward. Vineflower gives the
  clearest code; CFR recovers the one method Vineflower drops (`Y.get`, the wave picker).
- The decompiled tree is not committed (it is the author's work). It is rebuilt in a minute with
  `java -jar cfr-0.152.jar aaa.r.ScalarR_0.005g.047.jar --outputdir out`.

## 1. Class map (obfuscated name: what it does)

| Class | Role |
|---|---|
| `aaa.r.ScalarR` | Wiring. Registers every part. When the round starts with more than one opponent it builds a second, melee-only movement. |
| `aK`, `aY`, `aZ` | Battle state. `j()` is `getOthers()`. `aJ.f()` is "one opponent or fewer left" (duel mode). |
| `E` | **Bullet power** (section 2). |
| `aH` | Fires: `setFire(power)` once the gun is cool and turned, but never when the shot would take energy below 0.02. |
| `G`, `y`, `x`, `dn` | Melee gun: kNN per target, then one aim that covers the most probability across all enemies at once. `x` is the feature vector (11 dimensions, including the target's distance to its own nearest bot and wall reach forward and back). |
| `dt` | Chooses the movement: the duel surfer (`P` + `T`) with one opponent, the melee surfer (`R` + `V`) with more. |
| `du` | Surfer driver: a tree search over simulated paths, warmed up 500 times on tick 0 of round 1 so the JIT is hot. |
| `R` | **Melee path candidates** (section 3.1). |
| `Y` | **Wave picker** (section 3.2). |
| `V` | **Melee path danger**: wave danger plus crowd risk (section 3.3). |
| `aa`, `W`, `au`, `ae` | Danger of one wave at one point: the learned profile, minus the shadowed angles, smoothed by a kernel the width of a bot. |
| `aq`, `as`, `ao` | **Learned danger per shooter and per target** (section 4). |
| `ev`, `ew`, `ex` | **Energy accounting for every bot**: matches each energy drop to a fire, a bullet hit on another bot, or a collision (section 4.1). |
| `dS`, `eu`, `et` | Each enemy's fire events and a smoothed estimate of its bullet power. |
| `ag`, `ah` | **Bot shadows** (section 5.1). |
| `aj`, `ak`, `al`, `am` | **Bullet shadows** from ScalarR's own bullets (section 5.2). |
| `dD`, `dH` | Field geometry: wall clipping and wall smoothing ("orbitalSmooth"). |
| `dq` | Stops for one tick after ScalarR rams someone. |
| `ce` | Tracks its own energy to detect being disabled. |

## 2. Energy management (`E`)

The power comes from one function. With **two or more opponents alive**:

1. `p = clamp(1300 / d, 0.1, 3)`, where `d` is the distance to the **nearest** enemy, not to the
   target. So it fires 3 whenever anyone is within 433 px, 2.6 at 500 px, 2.0 at 650 px and 1.6
   at 800 px.
2. When the nearest enemy is more than 325 px away, `p` is also capped at `own energy / 15`.
3. Then, at every distance, `p` is capped at:
   - `own energy − 0.02` (never fire itself to death),
   - `own energy / 6`,
   - `strongest target's energy / 2.999` (no more than kills the healthiest bot the gun aimed at).
4. The result is clamped to 0.1..3.

| Own energy | Nearest 200 px | 400 px | 600 px | 800 px |
|---|---|---|---|---|
| 100 | 3.0 | 3.0 | 2.17 | 1.63 |
| 30 | 3.0 | 2.0 | 2.0 | 1.63 |
| 15 | 2.5 | 1.0 | 1.0 | 1.0 |
| 6 | 1.0 | 0.4 | 0.4 | 0.4 |

So the "more conservative energy management" in the version history is **not** lower power at
full health. At full health ScalarR fires hard, about twice Deise's `log10(E) × 325 / d` at range.
What is conservative is that power **falls in a straight line with its own energy**: energy/6
always, and energy/15 once nobody is close. Below about 45 energy the cap beyond 325 px starts
to bite; at 15 energy it fires 1.0 from range, at 6 energy 0.4.

With **one opponent left** (or in a duel) it uses a different table: 3 inside 150 px, 1.99 out to
325 px, and beyond that a power-down when its energy is below `clamp((enemy energy − own) × 4,
35, 63)`, as `(own / threshold)^3 × 1.99`, rounded down to a fixed list of powers. Then it plays
an **energy race**: it reads the enemy's smoothed bullet power (rising estimates move 83% of the
way, falling ones 50%). If the enemy fires lighter, it simulates the energy each side has left
after the shots it can fire during one bullet flight, and matches the enemy's power when its own
margin would be less than `max(their + 10, their × 1.2)`, blending in between. The same caps
(energy − 0.02, energy/6, kill power) apply.

Hadur's duel power-down uses the same 35/63/×4 shape but centres it at 63
(`63 + (target − own) × 4`). ScalarR's threshold is `(target − own) × 4` clamped to 35..63, so at
equal energy it powers down from 35, not 63. That is a 1v1 note, not a melee one.

## 3. Melee movement: surfing every wave in the air

### 3.1 Five candidate directions, 140 px each (`R`)

From each node of the search it tries only five destinations, each 140 px away:

1. an **anti-gravity** step: repelled by every enemy at `1/d²`, weakly drawn to the **nearest
   corner** (`0.5 / (500 + d²)`), the resulting direction scaled to 140 px;
2. straight on in its direction of travel;
3. straight back;
4. and 5. at 90° either side.

Each is wall-clipped and smoothed. The search goes two waves deep (the second level adds the
danger of the next wave) and simulates each path tick by tick for at most 130 ticks or until the
waves have passed.

### 3.2 Which waves it surfs (`Y`)

Every detected enemy wave counts, whoever it was aimed at. It keeps the **9 waves that reach it
soonest**, ignoring waves more than 30 ticks behind the first. In a duel with no wave in the
air, any enemy for which ScalarR is about the nearest bot (within 1.3 × that enemy's nearest
distance) is given a virtual power-3 wave fired now. Each wave's weight is its bullet damage.

### 3.3 Path danger (`V`)

For a path, with `waveDanger` summed over the waves it crosses (each scaled by that bullet's
damage) and `crowd` the average crowd risk along the path:

```
danger = (20 × waveDanger / totalDamageInAir + crowd / crowdAtStart) × (1 + crowd / crowdAtStart)
```

Crowd risk at a point is, summed over enemies, `clamp(enemy energy / own energy, 0.25, 4) / d²`,
plus 100 inside 52 px and 100,000 inside 37 px (a collision). So stronger enemies push harder,
weak ones barely count, and the crowd term both adds and multiplies, so a path into a crowd
cannot be saved by a quiet wave picture.

## 4. Learned danger per shooter and per target (`aq`)

Each enemy wave's danger is a **mixture over every bot it might have been aimed at**:

- For each bot alive when the wave was fired (ScalarR included, the shooter excluded), the
  angle to it is weighted by `1/d²` from the shooter, normalised over the bots.
- For each such shooter-target pair there is a kNN log of guess factors, keyed on the target's
  movement and on its relation to the shooter. The pair's learned guess factors are laid out
  round the line to that target.
- While a pair has fewer than 20 samples (and the round is not a duel), the shooter's own
  general log (all its targets pooled) is mixed in, weighted `w/(1−w)` with
  `w = 0.5 × min(1, 5 / samples)`.
- The head-on angle to each target is kept as a danger point too. In melee its weight shrinks as
  the pair's log fills (about `0.5 × max sample × clamp(10 / samples)`); with no samples it is
  full weight. In a duel it is dropped once there is any data.

The danger at ScalarR's spot is the sum of those points, each through a kernel the width of a
bot (`1 / (1 + 0.6565 x²)`, `x` = angle off the point over `asin(30 / d)`), times the share of
its body that no shadow covers.

### 4.1 Where the samples come from: every hit, on anyone (`ev`)

This is the piece Hadur has nothing like. ScalarR tracks **every bot's energy every tick** and
explains each change:

- a drop of 0.1..3 with nothing else to explain it is a **shot fired**;
- a drop that matches another enemy's wave (the bullet damage) at a time that wave could be
  passing within 50 px is a **hit by that enemy's bullet**, and if the shooter's energy rose by
  three times the power at the same time, both are confirmed;
- a bot whose energy reaches 0 after ScalarR's own bullet or ram is marked disabled.

Each "wave from A hit B" goes into the learning above with B's position, just as a hit on
ScalarR itself does (and a bullet-hit-bullet). So in a 10-bot battle it learns how each enemy
aims from **all of that enemy's hits on everybody**, not only from the few that land on
ScalarR. Each sample is credited to every target within 1.2 × the escape angle of the hit,
weighted `1/d²`, and also to the shooter's pooled log.

## 5. Shadows

### 5.1 Bot shadows (`ag`)

As a wave expands it reaches the other bots in turn. When it passes a bot (not the shooter) more
than 36 px from the source, the angles that bot's body covers (`±asin(18 / d)`) become a
**shadow**: a bullet aimed there would have hit that bot first. So hiding behind another bot from
a shooter really is safe, and the danger there is cut.

### 5.2 Bullet shadows (`aj`)

For each of ScalarR's own bullets, over the next 150 ticks it works out where the bullet crosses
each enemy wave and adds the covered angle as a shadow, as the duel surfers do. When a bullet
dies early, the part of the shadow after its death is taken back.

Shadowed angles are dropped from the danger profile, and the danger at a point is scaled by
the share of the bot's width left uncovered.

## 6. The gun, briefly

kNN per enemy (11 weighted features from the target's movement, its distance to its own
nearest bot, the bullet's flight time, and its wall reach forward and back, simulated). Each enemy's prediction becomes a set of points. Instead of aiming at one
target it sweeps the angle intervals (each point ± a bot's width) and fires at the angle that
covers the most probability **summed over all enemies**. The power then caps at what kills the
healthiest enemy in that aim set.

## 7. What we could test

Ordered by how cheap the test is. Each is an arm against today's master or today's Deise, on the
melee census, with A/A control, as usual.

### Deise (MiniMelee, 1,499 of 1,500 bytes)

1. **SCAL power curve.** Replace `log10(E) × 325 / d` with ScalarR's shape: `min(3, 1300 / d,
   E / 6)` and, beyond 325 px, also `E / 15`. Cost is a few bytes over today's line, so something
   else has to give; a cheaper close form is `min(1300 / d, E / 6, d > 325 ? E / 15 : 3)`.
   **Flag on pc-deise-e07:** its CONS arm (`240` in place of `325`) lowers power at every energy
   level. ScalarR does the opposite at full health (about twice Deise's power at range) and only
   falls away as its own energy falls. If CONS wins, SCAL is still worth an arm; if CONS loses,
   that matches what ScalarR does.
2. **Nearest-enemy distance for power.** ScalarR uses the distance to the nearest bot, not the
   target. If Deise's target is not its nearest bot, that is a one-variable change.
3. **Corner pull** in the movement: a weak attraction to the nearest corner on top of the
   repulsion from enemies. Deise's codesize decides whether it fits.

### Hadur melee (no codesize limit)

1. **MGUN energy arm (cheap).** Today's crowd rule (Ogi's: 3 within 300 px, else 1.92, from 20
   energy; 1.0 or 0.5 below) against ScalarR's: `1300 / dNearest`, then `E / 15` beyond 325 px,
   `E / 6` always, and the strongest-target kill cap. The biggest difference is at low energy,
   where ScalarR's caps fall in a line with its energy and Hadur's table steps.
2. **Learn enemy guns from enemy-on-enemy hits (medium).** Energy accounting that matches each
   enemy's drop to another enemy's wave. On its own this is a data source, measured by how many
   more samples per shooter we get; it pays only once the movement reads it (item 3).
3. **Melee surfing (large).** Hadur's melee movement is minimum risk with bullet danger at the
   destination. ScalarR's version history ties its survival climb to this: surfing head-on shots
   fired at everyone (45% to 53%), true melee surfing (53% to 65%), conservative energy (69% to
   76%), and shadows (76% to 83%). The minimum to try: the five 140 px candidates, two waves deep,
   the danger formula of section 3.3, with head-on and linear points per target weighted `1/d²`.
   Learned per-shooter profiles (section 4) and shadows (section 5) are separate arms on top.
   The team read found the same ingredient in Ogi and Firestarter: bullet danger **along the
   path**.
4. **Bot shadows (small once item 3 exists).** Each wave's angles behind a bot it passes first.

Isolation stands: all of this is melee-only and must leave 1v1 bit-identical.
