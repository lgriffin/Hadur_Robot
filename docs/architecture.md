# Hadur v1.17 Architecture

Hadur is a dual-mode competitive Robocode robot that automatically switches between
specialised 1v1 (duel) and free-for-all (melee) strategies based on the number of
opponents. This document describes the subsystem architecture, class relationships,
and runtime control flow.

## Subsystem Overview

The robot is organised into five subsystems, each responsible for a single concern.
The main `Hadur` class orchestrates them, routing events and selecting the correct
mode-specific behaviour each tick.

```mermaid
graph TB
    subgraph Orchestrator
        H[Hadur<br><i>extends AdvancedRobot</i>]
    end

    subgraph Intelligence
        B[Brain<br><i>opponent tracking &<br>classification</i>]
        TS[MeleeTargetSelector<br><i>melee target scoring</i>]
    end

    subgraph Radar
        R[Radar<br><i>duel lock / melee spin</i>]
    end

    subgraph Targeting
        G[Gun<br><i>5-gun virtual array</i>]
        GW[GunWave<br><i>virtual bullet wave</i>]
    end

    subgraph Movement
        WS[WaveSurfer<br><i>duel dodge movement</i>]
        MR[MinimumRiskMovement<br><i>melee risk pathfinding</i>]
        EW[EnemyWave<br><i>incoming bullet wave</i>]
    end

    subgraph Model
        OD[OpponentData]
        SN[Snapshot]
        BM[BattleMode]
        MT[MovementType]
    end

    H --> R
    H --> G
    H --> WS
    H --> MR
    H --> B
    H --> TS

    G --> GW
    WS --> EW
    B --> OD
    B --> SN
    B --> MT
    B --> BM
    TS --> B
    TS --> OD
    MR --> B
    MR --> OD
    R --> B
    OD --> SN
    OD --> MT
```

## Class Diagram

Key fields and methods for each class. Static fields that persist across rounds are
marked with `$`.

```mermaid
classDiagram
    class Hadur {
        -Radar radar
        -Gun gun
        -WaveSurfer waveSurfer
        -MinimumRiskMovement minimumRisk
        -Brain brain
        -MeleeTargetSelector targetSelector
        -BattleMode battleMode
        +run()
        +onScannedRobot(e)
        +onBulletHit(e)
        +onHitByBullet(e)
        +onRobotDeath(e)
        -runDuelTick()
        -runMeleeTick()
    }

    class Brain {
        -Map~String,OpponentData~ opponents$
        -List~Long~ ourFireTicks
        -BattleMode battleMode
        +update(e, myX, myY, heading, time)
        +recordOurFire(tick)
        +recordDamageDealt(name, dmg)
        +recordDamageReceived(name, dmg)
        +getOpponent(name) OpponentData
        +getAllOpponents() Collection
        +getStalestOpponent(time) OpponentData
        +getAliveCount(time) int
        +removeOpponent(name)
        +resetRound()
        +detectGunType(name, errors) String
        -classify(od) MovementType
        -assessThreat(od) double
        -detectWaveSurfer(od, ticks, revs) bool
    }

    class MeleeTargetSelector {
        -double HYSTERESIS = 0.80
        -String currentTarget
        +selectTarget(robot, brain) String
        +onRobotDeath(name)
        +resetRound()
    }

    class Gun {
        -double[][][][][][] gfStats$
        -ArrayList~GunWave~ waves
        -LinkedList~boolean[]~ vgResults
        -int[] vgHits
        -int activeGun
        -Map~String,double[]~ meleeState
        -double[] headingHist
        -double[] velocityHist
        +init(bfW, bfH)
        +onScannedRobot(robot, e)
        +onScannedRobotMelee(robot, e, target, scanned) bool
        +clearMeleeState()
        +smartFirePower(dist, myE, enemyE) double
        +getAccuracy() double
        -circularPrediction() double
        -linearPrediction() double
        -patternPrediction() double
        -updateWaves(enemyPos, time)
        -selectBestGun() int
    }

    class GunWave {
        +Point2D firePosition
        +long fireTime
        +double bulletSpeed
        +double absBearing
        +double latDir
        +double mea
        +double[] aimAngles
        +int distSeg, velSeg, latvelSeg
        +int accelSeg, wallSeg
        +boolean realBullet
    }

    class Radar {
        -boolean lockAcquired
        +doDuelRadar(robot, absBearing)
        +doMeleeRadar(robot, brain)
        +spinRadar(robot)
        +resetRound()
    }

    class WaveSurfer {
        -double[][][][] dangerStats$
        -double[] moveProfile$
        -int totalHitsTaken$
        -ArrayList~EnemyWave~ waves
        -double lastEnemyEnergy
        -int orbitDirection
        +init(bfW, bfH)
        +onScannedRobot(robot, e)
        +doSurfing(robot)
        +onHitByBullet(robot, e)
        -evaluateDanger(robot, dir, w1, w2) double
        -predictPosition(robot, dir, wave) Point2D
        -wallSmooth(pos, angle, dir) double
    }

    class EnemyWave {
        +Point2D fireLocation
        +long fireTime
        +double bulletSpeed
        +double directAngle
        +int lateralDirection
        +int distSeg, velSeg, accelSeg
    }

    class MinimumRiskMovement {
        -double fieldWidth, fieldHeight
        -Point2D destination
        -long destTime
        +init(bfW, bfH)
        +doMinimumRisk(robot, brain)
        -findSafestPoint(myPos, robot, brain) Point2D
        -calculateRisk(point, myPos, robot, brain) double
        -navigateTo(robot, dest)
    }

    class OpponentData {
        +String name
        +MovementType movementType
        +double threatLevel
        +double x, y
        +double heading, velocity
        +double energy
        +long lastScanTick
        +int fireCount, hitsOnUs
        +double damageDealt, damageReceived
        +LinkedList~Snapshot~ window
    }

    class Snapshot {
        +long tick
        +double heading
        +double velocity
        +double energy
        +double x, y
    }

    class BattleMode {
        <<enumeration>>
        DUEL
        MELEE
    }

    class MovementType {
        <<enumeration>>
        STOPPED
        LINEAR
        CIRCULAR
        OSCILLATING
        RANDOM
        WAVE_SURFER
        UNKNOWN
    }

    Hadur --> Radar
    Hadur --> Gun
    Hadur --> WaveSurfer
    Hadur --> MinimumRiskMovement
    Hadur --> Brain
    Hadur --> MeleeTargetSelector
    Hadur --> BattleMode
    Gun --> GunWave
    WaveSurfer --> EnemyWave
    Brain --> OpponentData
    Brain --> Snapshot
    Brain --> MovementType
    Brain --> BattleMode
    MeleeTargetSelector --> Brain
    MeleeTargetSelector --> OpponentData
    MinimumRiskMovement --> Brain
    MinimumRiskMovement --> OpponentData
    Radar --> Brain
    OpponentData --> Snapshot
    OpponentData --> MovementType
```

## Duel Mode Flow

In 1v1 battles, Hadur uses a tight radar lock, wave surfing for dodging, and a
five-gun virtual gun array for targeting. The radar locks onto the single opponent
with a 2x-overshoot technique. The gun fires virtual waves from all five prediction
methods and selects the one with the best rolling hit rate.

```mermaid
sequenceDiagram
    participant RC as Robocode Engine
    participant H as Hadur
    participant R as Radar
    participant B as Brain
    participant G as Gun
    participant WS as WaveSurfer

    Note over H: run() loop begins

    H->>R: spinRadar() [initial search]
    RC-->>H: onScannedRobot(e)
    H->>B: update(e, myX, myY, heading, time)
    B->>B: classify(od) + assessThreat(od)
    H->>G: onScannedRobot(robot, e)

    Note over G: Compute 5 aim angles
    G->>G: guessFactor(segmented stats)
    G->>G: patternPrediction()
    G->>G: circularPrediction()
    G->>G: linearPrediction()
    G->>G: headOnAngle = absBearing
    G->>G: selectBestGun() [rolling 30-wave window]
    G->>RC: setTurnGunRight + setFireBullet
    G->>G: createWave() [virtual + real]

    H->>WS: onScannedRobot(robot, e)
    Note over WS: Detect enemy fire via energy drop
    WS->>WS: create EnemyWave if drop in [0.09, 3.01]
    H->>R: doDuelRadar(absBearing) [2x overshoot lock]

    Note over H: Main tick
    H->>WS: doSurfing(robot)
    WS->>WS: closestWave() + secondClosestWave()
    WS->>WS: evaluateDanger(CW) vs evaluateDanger(CCW)
    WS->>WS: predictPosition() with wall smoothing
    WS->>RC: setTurnRight + setAhead [dodge]

    H->>RC: execute()
```

## Melee Mode Flow

In free-for-all battles (3+ robots), Hadur switches to a spinning radar for full
coverage, minimum-risk movement to avoid crossfire, and a simplified multi-prediction
gun aimed at the highest-priority target. The target selector scores opponents by
a weighted sum of energy, distance, and gun-turn angle.

```mermaid
sequenceDiagram
    participant RC as Robocode Engine
    participant H as Hadur
    participant R as Radar
    participant B as Brain
    participant TS as TargetSelector
    participant G as Gun
    participant MR as MinRiskMovement

    Note over H: run() — getOthers() > 1 → MELEE

    H->>R: spinRadar() [continuous 360° sweep]
    H->>MR: doMinimumRisk(robot, brain)
    MR->>B: getAllOpponents()
    MR->>MR: findSafestPoint() [24 dirs × 3 dists]
    MR->>MR: calculateRisk() per opponent<br>[energy/dist² × threatLevel]
    MR->>RC: setTurnRight + setAhead

    H->>RC: execute()

    RC-->>H: onScannedRobot(e) [opponent A]
    H->>B: update(e, ...)
    B->>B: classify + assessThreat
    H->>TS: selectTarget(robot, brain)
    TS->>TS: score = energy×0.8 + dist×0.5 + gunTurn×0.3
    TS-->>H: targetName

    H->>G: onScannedRobotMelee(robot, e, target, scanned)
    G->>G: store per-opponent [prevVel, prevHeading]

    alt scannedName == targetName
        G->>G: circularPrediction / linearPrediction / headOn
        G->>RC: setTurnGunRight
        G->>RC: setFireBullet [if gun aimed within 3°]
        G-->>H: return true [fired]
        H->>B: recordOurFire(time)
    else scannedName != targetName
        G-->>H: return false [not target]
    end

    RC-->>H: onScannedRobot(e) [opponent B]
    Note over H: repeat — radar keeps spinning

    Note over H: When getOthers() == 1
    H->>H: battleMode = DUEL
    H->>B: setBattleMode(1)
    Note over H: Switch to duel flow
```

## Data Flow — Intelligence Pipeline

The Brain maintains a sliding window of 100 snapshots per opponent and uses
statistical analysis to classify movement patterns and assess threat levels.
This intelligence feeds into both movement (risk weighting) and target selection.

```mermaid
flowchart LR
    subgraph Input
        SE[ScannedRobotEvent]
    end

    subgraph Brain
        UP[update]
        FD[Fire Detection<br><i>energy drop 0.09–3.01</i>]
        SW[Sliding Window<br><i>100 snapshots</i>]
        CL[classify]
        AT[assessThreat]
    end

    subgraph Classification
        WV[WAVE_SURFER<br><i>reversals correlate<br>with our fire ticks</i>]
        LI[LINEAR<br><i>avgHC &lt; 0.03<br>revRate &lt; 0.04</i>]
        OS[OSCILLATING<br><i>revRate &ge; 0.06</i>]
        CI[CIRCULAR<br><i>avgHC &ge; 0.03<br>low variance</i>]
        RA[RANDOM<br><i>cv &ge; 0.8 or<br>stdHC &gt; 0.04</i>]
        ST[STOPPED<br><i>&gt;80% stationary</i>]
    end

    subgraph Threat ["Threat Score (0–1)"]
        ACC[Accuracy 35%]
        ENE[Energy 25%]
        AGG[Aggression 20%]
        POW[Bullet Power 20%]
    end

    subgraph Consumers
        MR[MinimumRiskMovement<br><i>risk × (0.5 + threat)</i>]
        MTS[MeleeTargetSelector<br><i>energy × 0.8 + dist × 0.5</i>]
        GUN[Gun<br><i>fire power selection</i>]
    end

    SE --> UP
    UP --> FD
    UP --> SW
    SW --> CL
    SW --> AT
    CL --> WV
    CL --> LI
    CL --> OS
    CL --> CI
    CL --> RA
    CL --> ST
    AT --> ACC
    AT --> ENE
    AT --> AGG
    AT --> POW

    CL --> |movementType| MTS
    AT --> |threatLevel| MR
    AT --> |threatLevel| MTS
    FD --> |fireCount| GUN
```

## Static Persistence Across Rounds

Several data structures use `static` fields to accumulate learning across rounds
within the same battle. This allows the robot to improve targeting and movement
as it observes more of each opponent's behaviour.

| Class | Field | Shape | Purpose |
|-------|-------|-------|---------|
| `Brain` | `opponents` | `Map<String, OpponentData>` | Per-opponent tracking, classification, threat |
| `Gun` | `gfStats` | `double[5][5][5][3][3][31]` | GuessFactor hit bins segmented by distance, velocity, lateral velocity, acceleration, wall proximity |
| `WaveSurfer` | `dangerStats` | `double[5][5][3][47]` | Danger bins segmented by distance, velocity, acceleration |
| `WaveSurfer` | `moveProfile` | `double[47]` | Visit-count profile for movement flattening |
| `Hadur` | `roundsPlayed/Won` | `int` | Win rate tracking |
