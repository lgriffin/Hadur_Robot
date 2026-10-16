# How the best movers move, and a movement of our own

2026-10-15, plan-top3 stage 1 (docs/plan-top3.md). Leigh asked how the top robots move, which one
takes the least damage, and whether geometry and maths, chaos theory or biology could give us a
way of moving no one has used before.

Sources: DrussGT 3.1.16, Diamond 1.8.22 and BeepBoop 2.0 ship their source in their rumble jars
(`hadur-bench/opponents/`); ScalarR 0.005h.053 ships none, and Nullstride is not reachable from
the cloud. The line references below are to those jars' sources and to `hadur-core`.

## Who takes the least damage

On the bench against the robots on neither shield list (`docs/plan-top3.md`), per round:

| Robot | Damage taken | Shields? |
|---|---|---|
| Nullstride | 6.8 | yes, 287 robots |
| ScalarR (noshield build) | 8.2 | no |
| Diamond | 9.5 | no |
| Hadur 3.13 | 12.8 | 200 robots |

DrussGT and BeepBoop are still to be measured (PC queue `top3-s0`). One correction to the plan:
DrussGT 3.1.16 carries EnergyDome's bullet shield (`jk/precise/EnergyDomeWorker.java`). It tries
the shield against every robot and keeps it while the damage taken stays under budget, with a
softer goal for 357 named robots (`jk/mega/ShieldTargets.java`). 113 of those 357 are on neither
Hadur's nor Nullstride's list. So part of DrussGT's lead over the "neither" group is shielding,
not surfing. Diamond and the ScalarR build we bench do not shield, so the movement gap measured
against them stands.

## How they move

| | Hadur 3.13 | Diamond | DrussGT | BeepBoop |
|---|---|---|---|---|
| Options per wave | 3: orbit either way at full speed, or stop | 3, same | dozens of stop points 7 px apart, both ways, up to 90 ticks | 5-6 speed profiles per wave (forward, back, halt, last plan, 2 drives to the safest point found) |
| Waves looked at | 2, the second only added on (1 under tick budget) | 2, full recursion | 3, exhaustive second wave | 3 (third approximated) |
| Wave before it is fired (gun heat) | **no** | yes, power by KNN | yes | yes |
| Time weight | 1 / time to impact | 1 / time to impact | (100 - t)² | 1 / sqrt(4 + t) |
| Distance | target 400-650, closes on a lead | never under 650 | retreats only, 1 / (d - 34) | retreats only, exp(start/end) |
| Flattener on at | 4.5% padded hit rate | 5.9% | 8-9% | 2-9% by model, weighted by results |
| How views are mixed | fixed weights | fixed weights | sum of ~135 one-hit-memory buffers | each model weighted by how well it predicted real bullets, cubed, every bullet |
| Simple guns | learned from hits | learned from hits | shield | 7 simulated guns (head-on, linear, circular...) as models |
| Randomness | none | none | none | small (end speed of candidate paths) |

What all three have and Hadur lacks: the **gun-heat wave**. When the enemy's gun is about to be
cool, they surf a bullet that has not been fired yet, at a predicted power, so the option taken on
the wave in the air already leaves room for the next one. Hadur only surfs waves it has seen fired
(`move/SurfMover.java:203`, `MoveController.findSurfableWave`), and our screen shows where that
hurts: 78% of the damage lands where the surf planned to be
(`docs/bench/local/2026-10-15_top3-s0-hf2-read.md`).

The other common threads: none of them closes distance to win (Hadur's DIST-1 goes to 400, and to
150 to finish); all three switch the flattener on later than Hadur's 4.5%; and the two strongest
look further ahead with more choices. More choices alone is not enough: our own go-to mode, with
the same danger model, screened -0.36 APS today
(`docs/bench/local/2026-10-15_top3-s1-goto-read.md`).

## Something of our own

Leigh's question: using geometry, chaos theory or biology, can we predict and move in a way no one
has? Three ideas, each a duel-only switch, off by default, screened like any other.

### 1. Protean escape (biology)

Prey under attack from a predator that learns, a hare from a fox or a moth from a bat, do not take
the single best escape. They pick among a few good escape angles at random. Biologists call it
protean behaviour, and cockroaches and fish show the same thing: escape angles cluster at a
handful of preferred directions, and the choice between them is unpredictable.

Every top surfer takes the argmin: the option with the lowest estimated danger. That choice is a
deterministic function of what the enemy can see, which is exactly what a learning gun learns.
Protean surfing takes option `o` with probability

    P(o) ∝ exp(-D_o / T),   T = c · spread(D)

where `D_o` is the option's danger and `spread(D)` is how much the danger views disagree about the
options (the standard deviation of each option's danger across views). When the views agree, `T`
is small and the surf takes the safest option, as now. When they disagree, which is when the
estimate is least trustworthy, the choice spreads over the near-equal options. No surfer we have
read does this: BeepBoop's randomness only varies how a candidate path ends, never which option
wins.

### 2. A chaotic die (chaos theory)

The die for the protean choice need not be a random number generator. The logistic map
`x(n+1) = 4·x(n)·(1 - x(n))` is fully chaotic: deterministic, with a positive Lyapunov exponent
(ln 2), so two nearly equal starting points diverge within a few dozen steps. Seeded from the
battle and stepped once per wave, it is as unpredictable to the enemy as a random draw, since the
enemy cannot see `x`. Unlike a random draw it replays exactly, so the replay fixtures stay
deterministic and every battle can be reproduced from its log. In plain terms, the chaos buys us
reproducibility, not extra unpredictability: against a gun that cannot see the hidden state, a
chaotic orbit and a fair die look the same.

### 3. Natural selection among the danger views (biology, replicator dynamics)

Hadur mixes its 11 danger views with fixed weights. BeepBoop's strongest idea, re-stated as
evolutionary game theory: treat the views as a population and let them reproduce in proportion to
how well they predicted the bullets that actually came. After each wave breaks, every view `i`
rated the true bullet's angle with probability `p_i`; then

    w_i ← w_i · p_i / Σ_j w_j p_j

which is the discrete replicator equation, and the Bayesian update for "which view is right about
this enemy". A small floor keeps every view alive (mutation), so a view can come back when the
enemy changes gun. Against a head-on or linear gun the view that sees it takes over within a few
bullets, which is where 4.2 of our 13.1 damage a round comes from (head-on plus linear, first HF
read).

## The protean pick, as an algorithm

2026-10-16, after the stop-and-start finding (MOVE-13, `docs/bench/local/2026-10-16_top3-s1-heat2-read.md`):
the surf's erratic re-picking while the enemy's gun is cool gained about +0.25 APS by accident. The
protean pick is the designed version: the same window, a controlled amount of randomness, a bounded
cost, and a die that replays.

### Notation

- Options `o ∈ O = {ccw, stop, cw}`, `K = |O| = 3`.
- Danger views `i = 1..m` (`m = 11`), with the surf's existing weights `w_i ≥ 0`, `Σ w_i = 1`.
- `d_{o,i} ∈ [0, 1]`: view `i`'s danger for option `o` (its kernel estimate of the chance the
  bullet's angle falls in the option's interval), before the shadow, damage and time factors.
- `D_o`: the surf's total danger for option `o` as it is computed today (the weighted mean of
  `d_{o,i}`, times the shadow, damage and 1/time factors, plus the second wave's least danger).
  Today's surf takes `argmin_o D_o`.
- `D* = min_o D_o`, and `ΔD_o = D_o − D* ≥ 0`.

### 1. When it acts: the protean window

The pick is protean only in the window `W`. That is the window MOVE-13 found: the enemy's estimated
gun heat is at most one tick's cooling and no firing wave in the air is within `t_min` ticks of
impact (start with `t_min = 10`). Outside `W` (a bullet about to arrive, or the gun still hot) the surf
takes `argmin_o D_o`, exactly as now. So the randomness is spent only where the enemy's next aim is
being formed, never when a real bullet is about to land.

### 2. How unsure the views are: the spread

For each option, the weighted disagreement of the views:

    μ_o = Σ_i w_i d_{o,i}
    s_o = sqrt( Σ_i w_i (d_{o,i} − μ_o)² )

and the spread over the options, normalised by the danger scale so it is unitless:

    S = (1/K) Σ_o s_o / (μ̄ + ε),    μ̄ = (1/K) Σ_o μ_o,    ε = 1e-6

`S` near 0 means the views agree on every option; `S` near 1 means they disagree by as much as the
danger itself.

### 3. Temperature

    T = c · S · D* + T_0

`c` (start at 1) sets how much the disagreement buys, and `D*` scales `T` to the danger in play.
`T_0` is a small floor (start at 0.02·D*) so a near tie is always broken at random. With
`T → 0`, the pick below becomes the argmin.

### 4. Which options may be drawn: the safety cap

    A = { o : ΔD_o ≤ δ · D* + δ_0 }    (start with δ = 0.5, δ_0 = 0.01)

An option more than 50% more dangerous than the best is never drawn, whatever the die says. The
best option is always in `A`.

### 5. The protean distribution (Gibbs, softmin)

    P(o) = exp(−ΔD_o / T) / Z,   o ∈ A;   P(o) = 0 otherwise;   Z = Σ_{o∈A} exp(−ΔD_o / T)

What it costs: the Gibbs distribution minimises expected danger minus `T` times entropy. So the
expected danger is at most the best plus `T` times the entropy of the pick:

    E_P[D] − D* ≤ T · H(P) ≤ T · ln K = 1.10 · T

The cost of being unpredictable is bounded and set by one number. What it buys: a gun that
has learned our argmin is right with probability `max_o P(o)` instead of 1.

### 6. The die: the logistic map, made uniform

    x_{n+1} = 4 x_n (1 − x_n)

It is chaotic (Lyapunov exponent `ln 2`: a difference of `10⁻¹⁵` grows to order 1 in about 50
steps), but its values are not uniform. Their density is `1 / (π √(x(1−x)))`, piled up near 0 and 1.
The map is conjugate to the tent map through `x = sin²(πu/2)`, so the uniform draw is

    u_n = (2/π) · arcsin( √x_n )    ∈ [0, 1], uniform

In floating point the orbit can fall into 0 or the fixed point 3/4, or into a short cycle. Guard:
if `x_n ∈ {0, 0.75, 1}`, or `x_n` repeats within the last 64 draws, set `x_n ← frac(x_n + φ)`, with
`φ = (√5 − 1)/2`. Seed per battle and round from a hash of the enemy's name and the round number,
mapped into `(0, 1)` away from 0, 1/4, 1/2, 3/4 and 1. The enemy never sees `x`, so to it the draws are
fair; to us they replay exactly, so the replay fixtures stay deterministic and the core keeps its
ban on `java.util.Random`.

### 7. Sampling

Order `A` by `ΔD_o` (best first) and take the first option whose cumulative probability reaches `u_n`:

    o_pick = min{ o_k : Σ_{j≤k} P(o_j) ≥ u_n }

### 8. How long a pick stands: the dwell

The stop-and-start re-picked every tick. The protean pick holds its choice for a dwell of `τ` ticks,
drawn from the same die, geometric with mean `τ̄`:

    τ = 1 + floor( ln(u_{n+1}) / ln(1 − 1/τ̄) )

A new pick is drawn when the dwell runs out, when the window opens, or when a new wave is first
surfed. `τ̄ = 1` reproduces MOVE-13's every-tick re-pick, and larger `τ̄` gives longer, smoother legs.
So one parameter places the movement anywhere between today's stop-and-start and plain surfing.

### The whole pick, per tick

    if not in W:                    take argmin_o D_o
    elif dwell > 0:                 keep the last pick; dwell −= 1
    else:
        compute D_o, d_{o,i}        (the surf already computes these)
        S, T, A, P                  (steps 2–5)
        u ← die; o ← sample(P, u)   (steps 6–7)
        dwell ← τ from the die      (step 8)
        take o

Cost per pick: 3 options × 11 views of numbers the surf already has, a few `exp`s and one `arcsin`,
well under a millisecond.

### Parameters to screen

| Parameter | Start | Meaning |
|---|---|---|
| `c` | 1 | how much the views' disagreement raises the temperature |
| `T_0` | 0.02·D* | the floor that breaks near ties at random |
| `δ`, `δ_0` | 0.5, 0.01 | the cap on how much worse a drawn option may be |
| `τ̄` | 1, 3, 8 | the mean dwell: re-pick rate |
| `t_min` | 10 | no protean pick when a real bullet is this close |

Test plan: lab first (silent Hadur against the six shooters, looking for lower hit rates from the
learning guns with no new hole), then the 400-bot screen against MOVE-13's stop-and-start at
`τ̄ = 1, 3, 8`. It is a duel-only switch, off by default, and the gate is +0.3 APS over 3.13.

## Test order

1. **Gun-heat wave**: what all three masters do. The largest expected gain.
2. **Constants the masters agree on**: flattener at 5.9% (Diamond) rather than 4.5%, and no
   closing under 650 outside the finish.
3. **Replicator weights** for the danger views.
4. **Protean escape with the chaotic die**: last, because it trades a little expected danger for
   unpredictability, so it needs the others in place to judge.

Each one goes through the 400-bot screen at 2 seeds paired with 3.13 on the cloud, then the PC's 8
seeds and the census, gate +0.3 APS, as in the plan. The option-dodge record (MOVE-10, screen
running) tells us before step 4 how often a different option would have dodged a hit at all.
