# Hadur — Architecture Evolution: one identity, three strands

_This is the repository copy of Leigh's plan doc, [Hadur — Architecture Evolution](https://claude.ai/artifact/S9G69XWVcAVLgBevsWQL8e), as it stood when A0 started (5 October 2026). The doc holds the diagrams; where the two differ, the doc is the plan and this file is its record. Progress through the stages is in [Stage log](#stage-log) at the end._

2026-10-05 · Leigh

Hadur becomes one identity kernel with three strands, Duel, Melee and Team, behind a single role contract. The battle's facts fix its charter at tick 0, and within a round the role can only step down one ladder: Team, then Melee, then Duel. Six stages (A0 to A5) get there without changing the code of the nine packages pinned today, and the ladder plans start from the A2 release, 3.6.

**Status: final.** Leigh settled the open decisions on 5 October 2026, and the Decisions table at the end records them. An implementer thread builds the plan stage by stage, one PR per stage, with the usual rigour: EARS rows in `docs/requirements.md`, a tagged Cucumber scenario per ID, unit and jqwik tests, and `hadur.arch.stage` bumped in the root pom.

Three house rules run tighter here. The only ArchUnit changes are the ones this plan names, no fixture is re-recorded from A1 to A4, and no code in the nine pinned packages changes.

## Leigh: the framing

> I want an architecture evolution for Hadur using my hexagonal approach. There are three goals: 1v1, melee and team. All are attainable. Before focusing on an individual route, such as the Druss route, I want a scalable approach so that the bot's output weaves into its role without overlap. It knows its role, it adapts instantly, and it does not have to guess or switch. That gives a uniform approach for three strands of innovation, one per ladder, while keeping a core of identity across the board. Let's redesign the architecture now, before the individual plans converge on their ladders.

The design below is held to five tests taken from that brief.

| Test | What it means here |
|---|---|
| It knows its role | The charter is read from the engine's facts at tick 0, and the role from its counts on every tick. Neither is inferred from how the battle looks. |
| It adapts instantly | Every role the battle can ask for is built and warmed up before the first tick. A change of role is one reset, and at most one baton. |
| No guess, no switch | One pure function picks the role from the charter, three counts, the round's vetoes and the roles that have already driven. It never moves back up, so a round has at most two changes. |
| No overlap | Every package, output channel, memory file and requirement has exactly one owner. |
| A core of identity | What makes Hadur recognisable is shared by all three strands, and no strand can change it alone. |

## Where Hadur stands

Hadur 3.5.1 is 16th of 1,216 in the 1v1 RoboRumble and 18th of 415 in the MeleeRumble, and has no TeamRumble entry. The rankings were read on 5 October 2026.

| Ladder | Battle | Hadur 3.5.1 | Top three |
|---|---|---|---|
| [RoboRumble](https://rumble.robowiki.net/Rankings?game=roborumble) | 1v1, 800 × 600, 35 rounds | 16th of 1,216, APS 86.65 on 1,119 of 1,215 pairings | BeepBoop 95.03, Nullstride 94.90, DrussGT 92.60 |
| [MeleeRumble](https://rumble.robowiki.net/Rankings?game=meleerumble) | 10 robots, 1000 × 1000, 35 rounds | 18th of 415, APS 65.31, survival 38.90 | ScalarR 72.80, Neuromancer 72.19, Firestarter 71.51 |
| [TeamRumble](https://rumble.robowiki.net/Rankings?game=teamrumble) | teams of 5, 1200 × 1200, 10 rounds | not entered; 45 teams | CombatTeam 83.47, FirestarterTeam 83.09, ShadowTeam 80.51 |

One robot on three ladders is how the top does it. Firestarter is 7th, 3rd and 2nd on the three. [Combat](https://robowiki.net/wiki/Combat) extends `TeamRobot` and is 12th in melee, while CombatTeam leads the teams. [Firestarter's 2.0 notes](https://robowiki.net/wiki/Firestarter/Version_History) record what adding a team late cost: "Change the whole bot structure to be more suitable for team play."

[Twin Duel](https://robowiki.net/wiki/Twin_Duel), the two-robot team ladder, is out of scope. Its rules cap a team at 2,000 code bytes and forbid file access.

### What the current core makes hard

These findings are read from the source at commit 11e7c68, robot 3.5.1.

| Finding | Evidence in the code | Why it blocks three strands |
|---|---|---|
| `HadurCore` is the duel | 2,100 lines and about 90 fields, roughly two thirds of them duel state. Melee is a delegate, `MeleeController`; the duel is inline. | A third role would add a third set of branches to every event handler. |
| The posture is binary | `Posture` is `DUEL` or `MELEE`, chosen by `PostureGate.evaluate(others, numSentries)`. | In a team battle `getOthers()` counts teammates, so a teammate reads as an opponent and becomes a target. |
| Events are routed by exception | Handlers branch on `inMelee`, `focusing`, `foreign(name)` and a count of melee bullets still in flight. | Each new role multiplies the special cases. |
| Two pictures of the field | The duel tracks its enemy inline and reads shots from the exact `EnergyLedger`. Melee has `EnemyTracker` and its own shot inference. The duel borrows melee's tracker to pick its focus. | A team needs one picture that teammates can also feed. |
| Memory is wired by `enemiesTotal` | The constructor builds either a 1v1 library, or a melee memory plus a read-only survivor library. | A team's memory has no place, and the quota has no single owner. |
| The duel that ends a melee is a lesser duel | `GunController` takes `enemiesTotal`. Above one it fires no virtual guns, takes no opening, keeps no seed samples and uses a melee power table. | Work on the 1v1 ladder does not reach the melee endgame. |
| The ports are closed to a team | `BotOrders` is six numbers, `BotEvent` a closed set of ten, and the adapter an `AdvancedRobot`. | Hadur cannot hear a teammate or tell it anything. |
| The guardrails name one strand | `DuelIdentityTest` pins the duel only, and the ArchUnit rules list packages by hand. | Nothing stops a melee or team change from touching another strand. |

This is an ownership problem, not a speed problem. With the melee feed removed from 1v1 battles, the six replay fixtures still replay bit for bit over 9,144 ticks. The mean tick against Shadow moves by about 4%, from 0.126 to 0.121 ms, which is close to the noise of the machine it was timed on.

## The shape: one identity, three strands

The outer hexagon does not change: Robocode stays outside, behind the adapter. The evolution is a second boundary inside the core, between what Hadur is and how it fights in each kind of battle.

*Diagram in the plan doc: architecture · adapter, conductor, three strands, kernel, two ports.*

The adapter and the two ports exist today. The strand boundary, the slim conductor and the World are what this plan adds.

Three kinds of code sit inside the core, and each has one job.

- **The kernel** is Hadur's identity. It holds the facts, the memory, the evidence rules and the discipline. It has no tactics, and no strand can change it alone.
- **A strand** is one role's tactics behind one entry class, its brain, with its own memory shelf, requirements and bench set. A strand never imports another strand.

- **The conductor** is today's `HadurCore`, reduced to running the tick. It owns the role contract and one seam to each brain, and adds no strategy of its own.

| Term | Meaning | In code |
|---|---|---|
| Kernel | What every strand shares | `model`, `physics`, `knn`, `ledger`, `memory`, `port`, plus new `world` |
| Strand | One role's tactics | Duel: `gun`, `move`, `adapt`, `policy`, `shield`, plus new `duel`. Melee: `melee`. Team: new `team` |
| Brain | A strand's one entry class | `duel.DuelController`, lifted out of `HadurCore`; `melee.MeleeController`; `team.TeamController` |
| Conductor | The tick's five steps and the seam to each brain | `HadurCore`, `Guard`, `replay`, plus new `role`, which takes in `posture` |
| Role | The strand driving this tick | `RoleId`: `TEAM`, `MELEE`, `DUEL` |
| Charter | The kind of battle, fixed at tick 0: Duel, Melee or Team. It names the roles the battle can ever ask for | `Charter`, from `BattleFacts` |
| World | The one picture of the field | `world`, grown from `melee.EnemyTracker` |
| Archive | The conductor's facade over memory. It hands each brain its shelf, or none | Over `memory.ProfileLibrary` and `MeleeMemory` |
| Fence | A conductor check on the finished orders. It can only replace a drive | `SentryFence` |
| Fire permission | The conductor's word, given before the role drives, on whether a shot may leave this tick | `Tick.mayFire`. The fire-lane check sets it from A5 |
| Baton | What the outgoing role leaves for the next | Replaces `handOff` and `injectWaves` |
| Link | Teammates' reports, as bytes | `BotEvent.Message`, `BotOrders.messages` |
| Seat | A member's job inside the Team role | Left to the Team plan |

The existing package names stay. Ownership is declared in one map that the build enforces, so none of the nine pinned packages has to move.

## Knowing the role

The role is read, never inferred. Two engine facts at tick 0 fix the battle's charter, and three counts pick the role on every tick: the enemies, teammates and sentries alive.

### At tick 0: the charter

The adapter reads `getTeammates()` and `getOthers()` in `run()`, before the first tick, and passes them in as `BattleFacts`. A null or empty teammate list means no team. Until the adapter becomes a `TeamRobot` in A4 it cannot ask for teammates, so the roster is always empty.

| Facts at tick 0 | Charter | Roles built | Ladder |
|---|---|---|---|
| At most one opponent, no teammates | Duel | Duel | RoboRumble |
| Two or more opponents, no teammates | Melee | Melee, Duel | MeleeRumble |
| Teammates | Team | Team, Melee, Duel | TeamRumble |

Only the charter's roles are constructed, warmed up and fed. A 1v1 battle holds no melee or team object, so it is today's duel and nothing else. With no opponent at all the charter is still Duel, and no shelf is opened, as today.

Until the Team strand exists, a Team-charter battle builds only Melee and Duel. It is still a Team-charter battle, and that keeps the 1v1 and melee shelves from being written in it.

### Every tick: the resolver

`RoleResolver` is one pure function, and the first row that holds wins.

Its count of enemies errs upward. Off a team it is the engine's `getOthers()`. On a team it is the smaller of two numbers that are never too low: `getOthers()` less the teammates heard from on this tick, and the enemies at the start less the distinct enemies known dead this round. A doubt can then delay the step down to the Duel but never cause it (WORLD-8).

| On a team | Means |
|---|---|
| Enemies at the start | The others less the roster, read once before the first tick into `BattleFacts` |
| An enemy | A robot off the roster. Where a battle has sentries, only one already seen not to be a sentry |
| Known dead | An engine death event names the robot, to Hadur or to a teammate that reports it. A later sighting of it, or a report from it, withdraws the death |
| Heard from | A report stating the tick before is read from the teammate, or Hadur's radar scans it on this tick. Never while it is known dead |
| Teammates alive | The roster less those known dead or presumed dead (WORLD-3) |

| Order | Condition | Role |
|---|---|---|
| 1 | The Team role is built and not vetoed. A teammate and an enemy are alive. Neither Melee nor Duel has driven this round | Team |
| 2 | The Melee role is built and not vetoed. Two or more enemies are alive and no sentry is. Duel has not driven this round | Melee |
| 3 | Otherwise, including the turns after the last enemy has died | Duel |

A veto lasts the round. A sentry scanned this round or a Melee fault vetoes Melee, as GATE-3 and GATE-4 say today. A Team fault will veto Team.

*Diagram in the plan doc: role ladder · three roles, and the Guard beneath them.*

Once a role has driven in a round, no role above it drives again that round. That latch, not the counts, makes the role move only down, at most twice a round. Only a new round clears the latch, and a tick the Guard covers leaves it as it stands.

- **Duel is the floor.** It is never vetoed. If it throws, the Guard covers that tick and the core recovers on the next scan, as today (RES-1). The Guard is not a rung.
- **A Melee or Team fault costs one rung for the round.** The next role down drives the same tick, as GATE-4 does today. The same holds for a fault while a role only observes.

- **A change of role is a reset, and sometimes a baton.** At the change the incoming role's tracking is cleared and the speed limit restored (MELEE-2). When the change is the count of enemies falling to one, the Duel takes the baton at the survivor's first scan (MMEM-2). After a veto there is no baton, as today. A round's first tick is not a change.
- **One corner of today's play changes.** Today melee can take over mid-round if a sentry dies without being scanned that round. With the latch it cannot.

- **The focus stays where it is.** With several enemies alive and the Duel driving, `DuelFocus` still names the one opponent, by today's rule.
- **A team member's seat is for the Team plan.** The constraint set here is that a seat must be computable from the roster alone, so that no member waits on a message.

## The strand contract

Every strand's brain sits behind one interface, and the conductor runs the same five steps whichever role drives.

```java
public interface Role {
    RoleId id();

    // battle and round
    void prepare();                               // before the first tick: open the shelf it was handed
    void newRound(RoundFacts round);
    void roundEnded(RoundResult result);          // fold what was learned onto its own shelf
    void checkpoint(long tick);                   // at most once a battle (MEM-10)
    void battleEnded(long tick);                  // the final save

    // every tick
    void observe(BotEvent event, Tick tick);      // every role of the charter, driving or not
    void drive(Tick tick, BotOrders.Builder out); // the driving role only: this tick's orders

    // a change of role
    void reset();                                 // about to drive mid-round: a clean slate
    Baton give(Tick tick);                        // asked inside the survivor's first scan
    void take(Baton baton, Tick tick);            // in that scan, after the opponent switch

    // after a fault
    void recover();                               // RES-1: drop transient state
}
```


`Tick` is what the conductor hands a role on every call: the filtered input, the World, which role drives this tick, the Duel's focus as it stands, and whether the tick is in duress. In `drive` it also carries the budget level as it stands after the events, and the fire permission.

**The seams.** A brain never imports `role`. Its seam turns `Tick` into the brain's own arguments, as `MeleeController.Situation` is filled today, so dependencies run one way, from conductor to brain. The seam also hands the brain its shelf when it is built, or none, by charter: no brain decides from a count of opponents what memory it has.

The Melee seam is today's `meleeTick` and `goTo`, moved as they are, with the last command, the fire gate and the slow-down on sharp turns. Taking those into `melee` is for the Melee plan.

### The tick

- **Resolve.** Before any event is handled, the conductor notes sentry scans and, on a team, this tick's deaths, its own scans of teammates and its reports, and asks the resolver for the role. On a change it resets the incoming role and orders full speed. It also settles whether this tick runs in duress (RES-9).
- **Observe.** Each event goes to the World and then to the roles of the charter, in the engine's order. The driving role acts on it. The others only learn: the melee brain is fed during a duel, and the Duel hears bullets and collisions during a melee but no scan. In duress only deaths and the budget's own events are passed on, and a scan just moves the Duel's fix on its opponent.

- **Drive.** The conductor sets the fire permission from the World. The driving role's main body then fills the orders, using the World, its own shelf and the budget level as it stands after the events.
- **Fence.** The conductor's fences check the finished orders and may replace a drive.

- **Send.** The kernel adds its team report, and the orders return through the Guard.

This is the order `HadurCore.tick` follows today, and A2 keeps it exactly. The role is chosen before the tick's events, and the World and the roles see each event one at a time, never the whole tick at once. Until A3 the World is the tracker inside the melee brain.

### Who owns what

| Output or state | Owner | Rule |
|---|---|---|
| Body, gun, radar and fire orders | The driving role originates them | WEAVE-1 |
| The full-speed order at a change of role | The conductor | MELEE-2, GATE-3, GATE-4 |
| Replacing a drive | The conductor's fences, which only restrict | WEAVE-2 |
| Whether a shot may leave this tick | The conductor, as a permission given before the role drives | WEAVE-3, WEAVE-4 |
| Team report: own status, sightings, the round's deaths, bullet events | The kernel | LINK-4 |
| Team report: intent | The Team role | Team plan |
| The damage our bullet did to a robot | The World and the energy ledger, so that the drop is not read as a shot | WORLD-1, WAVE-1 |
| Whether our bullet hit or missed | The role that fired it | WORLD-5, as `meleeBulletsInFlight` does today |
| Memory files | One shelf per strand, handed out by the conductor's Archive, and any role may read any shelf. The battle counter is part of the `.hp` library, and the health record is the conductor's | SHELF-1, SHELF-3 |
| Round records | `R` is the whole robot's and stays with the conductor. `M` carries melee's, and `T` will carry the team's | Fields are only ever appended |

**The fire permission.** A shot ordered this tick leaves from Hadur's present position on the gun's present heading, so the conductor can say before the role drives whether a teammate stands in that lane. The role then holds its shot and its books together, where a fence striking the shot out afterwards would leave a brain counting a bullet that never flew. Until A5 the permission is always given.

The fire lane runs from Hadur along the gun's present heading to the wall. Its half-width is set in A5 and grows by 8 px, a robot's top speed, for each tick since the teammate's position was last known. A position older than the WORLD-3 window is too old to use, and that teammate is left out of the check. A role that orders a shot without the permission has faulted (WEAVE-6).

**The baton.** Today's hand-off gives the duel three things: the survivor's shots still short of Hadur, Hadur's own path during the melee, and the survivor's 1v1 profile, read and never written. The first two are the baton, and the third is the Duel reading its own shelf. The conductor also carries across what both brains read today: the sentry names, the robots dead this round and, for the `H` record, whether the melee shelf knew the survivor.

**What a strand sees.** The conductor hands each brain a filtered input that holds evidence about enemies only. Its `others` is the enemies alive, and a teammate's scan, hit, collision or death goes to the World alone. One thing still crosses: when Hadur's own bullet ends on a teammate, or on a teammate's bullet, the role that fired it is told the bullet missed, so its count of bullets in flight stays right (WORLD-6). A blocked shot then reads as a miss in the hit rate, and A5 reports how often that happens.

Sentries are handled as today (GATE-5). In 1v1 and melee battles the filtered input is the raw one, so nothing changes. In a team battle the brains need no edit to fight beside teammates.

**`HadurCore`**** stays the facade.** Its public methods and accessors remain and delegate. The 41 places where tests construct a core, and the tests that inject a failing melee brain, do not change in A2.

**No new**** branch****es**** on the kind of battle.** New strand code may not ask whether it is in a duel, a melee or a team, because the resolver has already answered. The `is1v1` branches in `gun` and the dead robot's bullet branch that moves with the Duel are the legacy exceptions.

## The identity kernel

The kernel is what makes Hadur recognisable on every ladder: honest senses, memory, decisions on evidence, and a robot that never stops.

| Part of the identity | What it guarantees on every ladder | Today | Change |
|---|---|---|---|
| World | One picture of the field: every robot as enemy, teammate or sentry, with position, energy and death, and the enemy shots inferred | `melee.EnemyTracker`, the duel's inline fields, the gate's sentry names | Promoted to `world` in A3. The roster and teammates' reports arrive in A5 |
| Energy ledger | Only bullet spending becomes a wave (WAVE-1, WAVE-2) | One enemy, in the duel | Later: one ledger per tracked enemy. More evidence, such as a teammate's reported hit, gives cleaner waves |
| Memory | Each opponent has one lineage key and a block per strand, crash-safe and inside the quota | `memory` holds the `.hp` profile and its library. `MeleeMemory`, in the root package, holds `.hm` | The conductor's Archive hands each brain its shelf, or none, by charter. The `.hp` format stays kernel-owned, because the melee endgame already reads it |
| The dial | Every policy input is a value with a margin, and no policy reads the clock (DIAL-1, DIAL-2) | Enforced on the duel's `adapt` and `policy` | New policy packages come under the same rule. Melee's existing time-based rules are named exceptions |
| Guard and budget | Orders every tick (RES-1). Work is shed before a turn is skipped (TIME-1, TIME-2) | `Guard`; `TickBudget` and `Duress` shaped for the duel | The conductor keeps the budget and passes its level on `Tick`. `TickBudget` stays in `policy` as a named exception until a second strand sheds work |
| Physics and replay | The engine's rules bit for bit on any field size. Same inputs, same orders (CORE-2) | Six 1v1 fixtures. Some melee constants assume a 1000 px field | Fixtures for each charter. The World's shot lifetime is derived from the field in A5 |

This table lists what every ladder relies on, not who owns the code. The ownership map decides that: the Guard, replay and the Archive are the conductor's, and `TickBudget` and the dial's packages are the Duel's.

**Promotion.** A mechanism moves from a strand into the kernel only when a second strand needs it. It is split at that moment: the mechanism goes to the kernel, and the terms, weights and thresholds stay with each strand. The first candidates are `MinimumRiskMovement`, `FieldGun` and the level tracker inside `TickBudget`.

**Shared eyes are kernel work.** A sighting is a sighting whoever made it. Merging teammates' reports into the World is not a Team tactic, so a team with no Team strand still sees with five radars. It needs them: the radar reaches 1,200 px and the team field's diagonal is 1,697 px.

## The ports

A handful of additions at the hexagon's edge make a team possible, and nothing existing changes meaning.

| Port | Today | Added | Why |
|---|---|---|---|
| `BattleFacts` | Field size and `getOthers()` go to the constructor | Own name, own starting energy, the roster from `getTeammates()`, the sentry border | The charter at tick 0, and whether this member leads |
| `BotEvent` | Ten kinds | `Message(sender, bytes)`. The bullet-meets-bullet event gains the other bullet's owner | Teammates' reports, and telling a teammate's bullet from an enemy's |
| `BotOrders` | Six numbers | `messages`: byte arrays to broadcast | Our own report |
| Round result | The adapter reports win, loss or draw from `getOthers()` and its own energy | In a team battle the round-ended handler records a win when the member's energy is above 0. At energy 0 it leaves the result to the win or death event that follows in the same batch. A member killed on an earlier turn has already recorded its loss, as today | A living teammate would otherwise turn a win into a draw |
| Replay codec | `F`, `N`, `I` and `O` lines. The `I` line already takes optional trailing fields | More optional trailing fields and a message event | Old transcripts must still decode |
| Adapter | `hadur2.Hadur extends AdvancedRobot` | `extends TeamRobot` | Off a team it behaves as before |
| `ProfileStore` | Read, write, delete, list | A gate on writes and deletes: in a team battle only the scribe's store takes them. The Archive asks the gate before it calls a library, so a gated save is never attempted. A delete a library makes on its own is refused quietly and counted as gated | Five members share one data directory |
| Packaging | One jar on two participants pages | A second jar, `hadur2.HadurTeam`, whose `.team` file lists the robot five times | The TeamRumble client looks for `.team` in the jar |

Messages are plain byte arrays in the core's own versioned, checksummed format. The core may not touch `java.io` (RES-6), so it cannot define a serializable class. A damaged message fails the way a damaged profile does: ignored and counted.

The team's members are the same class as the solo robot. A robot may read only its own class's data directory, so one class is what lets one memory serve three ladders.

The scribe is the team's leader, fixed for the battle at tick 0. Each member knows whether it leads from its own energy, because only the leader starts a round with 200. Who is alive is each member's belief, so a scribe chosen by liveness could be two members or none. A leader that is dead when a round ends writes only at the battle's end, as a dead robot does today.

### Engine facts the design leans on

These are read from the Robocode 1.9.5.6 source, the engine the bench runs.

| Fact | Consequence |
|---|---|
| `getOthers()` counts living teammates and leaves sentries out | Enemies alive is computed in the World |
| `getTeammates()` lists the other members in roster order and is null off a team | The charter is certain at tick 0 |
| The first member is the leader, with 200 energy. When it dies each living teammate loses 30 | The World marks leaders, ours and theirs. Ours is the scribe |
| A bullet that hits a teammate does its damage and scores nothing. The shooter still gets its energy back | The fire-lane check |
| Two teammates' bullets destroy each other, as any two bullets do | Ours is reported to the role as a miss (WORLD-6) |
| A shot ordered this tick leaves from the robot's present position on the gun's present heading, before the gun turns | The lane is known before the role drives |
| A kill pays 20% of the whole team's damage to that robot | Focus fire is a lever for the Team plan |
| A serialized message is at most 32,768 bytes and arrives the next tick | Reports are one tick old |
| A robot's messages are dispatched in its scan step, after every death of that turn, and only if it is still alive | A report stating the tick before proves its sender alive on the tick it is read (WORLD-8) |
| While a sender skips turns, the engine delivers its last messages again each turn | A report is known by its sender and stated tick, and is merged once (WORLD-4) |
| The engine announces every death to every living robot, a sentry's included, though the count of others never held the sentry | On a team only a robot seen not to be a sentry counts as an enemy's death |
| A robot killed after a round's last turn is announced dead on the next round's first turn | A later sighting or report withdraws a death |
| A skipped turn wipes the robot's queued scans, hits and robot deaths. Team messages are queued apart and still arrive | A death can be missed, so reports carry the round's deaths, and the count of enemies errs upward (WORLD-8) |
| At a round's end every living robot of the last team standing is sent a win event. It is delivered after the round-ended event and before a death event | In a team battle the round-ended event alone cannot tell a disabled winner from a robot killed on the last turn |
| The radar reaches 1,200 px, and the team field's diagonal is 1,697 px | One robot cannot always see the whole field |
| Each robot has its own class loader | The static core is per member. Members share only messages and the data directory |
| The data directory is per class, and each instance counts its own writes against the 200 KB quota | One writer per battle (SHELF-2) |

## The three strands

Each strand is a loadout on the same contract. A ladder plan fills one column and touches no other.

|  | Duel | Melee | Team |
|---|---|---|---|
| Ladder | RoboRumble | MeleeRumble | TeamRumble |
| Brain | `duel.DuelController`, lifted in A2 | `melee.MeleeController` | `team.TeamController`, in the Team plan |
| Drives when | Whenever neither Team nor Melee does | Resolver row 2: two or more enemies and no sentry, unless vetoed or latched | Resolver row 1: a teammate and an enemy alive, unless vetoed or latched |
| Radar | Lock and reacquire | Spin; oldest scan first below four enemies | Team plan |
| Movement | Wave surfing, bullet shadows, flavours | Minimum risk with virtual bullets | Team plan |
| Gun | KNN main, anti-surfer and hybrid guns, rated as virtual guns | Field gun | Team plan |
| Energy | Power policy, endgame | Melee energy table | Team plan |
| Memory shelf | `.hp` profile, tiers and seeds | `.hm` block | `.ht` block, in the Team plan |
| Gate suite | `reference-set.txt`, `top19.txt`, `weak-leak.txt` | `melee-gates.txt`, `handoff-gates.txt` | Team suite, built in A5 |
| Next plan | The Druss route; the top-15 plan | Melee climb | Team plan |

**The duelist sits under every ladder.** A melee round Hadur survives ends in the Duel role, and so does a team round that comes down to one against one. The target is one Duel configuration in every charter. Removing the `is1v1` branches is a Duel change that the Melee bench gates.

**Where the Druss route plugs in.** [The Druss work](https://claude.ai/artifact/KARFCbDaXVnDMvAj85oG48) finds the gap to DrussGT is energy management, not aim: Hadur overspends 11.8 energy a round, in ticks 200 to 800. The code that finding points at is Duel-owned: `policy.PowerPolicy`, `policy.EnemyGunHeat`, `gun`, and the power chain now inline in `HadurCore.onScan`. After A2 that chain lives in `duel.DuelController`, and the route re-pins the duel alone. It becomes a kernel change only if it alters how a shot is detected in `ledger` or what a profile stores in `memory`.

**The team baseline needs no Team strand.** After A5 five Hadurs can fight as a team with no team tactics. Each plays the Melee role with teammates off its target list, eyes shared through the World, and the fire-lane check. It writes no profile. Firestarter's 1.14 began the same way: "Implement basic team play." The Team plan then adds seats, target allocation and formation in its own package.

### What a ladder plan must state

- The strand it changes, and so the one pin it will re-pin.
- Any kernel ask, each as its own stage gated on all three benches.

- Its requirement group and its stage property.
- Its gate suites, its baseline and the ladder number it expects to move.

- That it keeps the contract: orders every tick inside the budget, the budget level and the fire permission honoured, the baton both ways, and its shelf's byte budget.

## Guardrails

Overlap is prevented by the build, not by agreement. Every package has one owner, every owner is pinned, and a change may re-pin only the owners it names.

| Guardrail | Today | Evolved |
|---|---|---|
| Ownership | 16 ArchUnit rules that list packages by hand | 13 of the 16 stay as they are. `postureIsALeaf` is rewritten when `posture` folds into `role` (A1), `duressLearnsNothing` when `Duress` moves (A2), and `meleeIsSeparateFromDuel` lets `melee` see `world` (A3). One ownership map is added: kernel, duel, melee, team, conductor. A package with no owner fails the build (STRAND-1), and the layers hold: kernel under strands under conductor (STRAND-2) |
| Identity pins | `DuelIdentityTest`, one snapshot of nine packages. `model` and `port` are not pinned | One snapshot per owner (STRAND-3). A new package is pinned by the stage that adds it |
| Replay | Six 1v1 fixtures, compared on orders only, with no store | Orders, telemetry and the files a fixture leaves in its store are all compared, and the round-end, checkpoint and battle-end calls are replayed too. A0 adds melee, sentry and hand-off fixtures, a warm fixture on a seeded store and a duress fixture (STRAND-4). Team fixtures come in A5 (STRAND-5) |
| Requirements | One `requirements.md`, three stage properties, stages matched as S, M or R | The same file with a section per owner and IDs unchanged, `hadur.arch.stage`, and a traceability test that reads the A stages |
| Conductor | `HadurCore` has 46 import lines | It imports the kernel, each strand's brain and the types that brain's public surface hands it. Anything else is a named exception, written out class by class in the ownership map. Today that is `policy.TickBudget`, `MeleeRadar` and the melee profile types behind `MeleeMemory` |

### Which benches gate a change

| A change to | May re-pin | Must pass |
|---|---|---|
| The Duel strand | Duel | The duel suites, the melee and hand-off gates and the team suite. Fixtures of any charter may be re-recorded, because the Duel drives in all of them |
| The Melee strand | Melee | The melee and hand-off gates and the team suite. 1v1 fixtures stay unchanged |
| The Team strand | Team | The team suite. Every other charter's fixtures stay unchanged |
| The kernel, a port or the conductor | The kernel and the conductor | Every gate suite and every fixture. Old transcripts and profiles still load |
| A promotion | The kernel and the donor strand | The donor's suite with no change in play, then the receiver's |

Three implementation threads can then run at once, one per strand, and the lower a strand sits on the ladder the more benches gate it. Which pins a change may touch is a review rule that each pull request states. The build shows which pins moved.

## Requirements (EARS)

Six new groups carry the evolution: ROLE, WORLD, WEAVE, LINK, SHELF and STRAND. They are traced like the rest, and `hadur.arch.stage` says which are due. None of these IDs is used or reserved today.

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| ROLE-1 | Event | When a battle starts, the core shall fix the battle's charter from the battle facts before the first tick. | A1 |
| ROLE-2 | Ubiquitous | The core shall choose each tick's role from the charter, the counts of enemies, teammates and sentries alive, the round's vetoes and the roles that have already driven this round, and from nothing else. | A1 |
| ROLE-3 | State | While the Team role's own conditions do not hold, the Melee role is built and has not failed this round, two or more enemies are alive, no sentry robot is alive or has been scanned this round, and the Duel role has not driven this round, the core shall drive the robot with the Melee role. | A1 |
| ROLE-4 | State | While a role has driven in the current round, the core shall not drive with a role above it in the order Team, Melee, Duel. | A1 |
| ROLE-5 | State | While a tick is not in duress (RES-9), the core shall offer each of its events to the roles of the charter, Melee before Duel, in the engine's order, except that a sentry's scan and a sentry's bullet are offered to no role (GATE-5) and Hadur's hit on a robot the Duel is ignoring is not offered to the Melee role. | A2 |
| ROLE-6 | Ubiquitous | The core shall hold no role outside its charter. | A3 |
| WORLD-1 | State | While a tick is not in duress (RES-9), the core shall feed one model of the field with every scan, hit and death that ROLE-5 offers the Melee role, before any role is offered it. | A3 |
| WORLD-2 | Ubiquitous | The core shall report to a role, as its count of others, the engine's count off a team and the count of enemies alive that WORLD-8 defines on a team. | A5 |
| WORLD-3 | Unwanted | If a teammate has sent no report for a set number of ticks while the engine's count of others has fallen, then the core shall count it dead. | A5 |
| WORLD-4 | Event | When teammates' reports arrive, the core shall merge each report once, in the order of their stated ticks, and keep the newer of two sightings of a robot. | A5 |
| WORLD-5 | Event | When a role hands over with bullets of its own still in flight, the core shall keep the first bullet outcomes that follow, one for each of those bullets, out of the next role's gun evidence. | A2 |
| WORLD-6 | Event | When one of our bullets ends on a teammate or on a teammate's bullet, the core shall report it to the role that fired it as a bullet that missed. | A5 |
| WORLD-7 | Ubiquitous | The core shall offer an event that names a teammate to the World alone. | A5 |
| WORLD-8 | State | While in a team battle, the core shall take as its count of enemies alive the smaller of the engine's count of others less the teammates heard from on that tick, and the enemies at the start less the distinct enemies known dead that round. | A5 |
| WEAVE-1 | Ubiquitous | Only the driving role shall originate a tick's body, gun, radar and fire orders, apart from the full-speed order the conductor gives at a change of role. | A2 |
| WEAVE-2 | Ubiquitous | A fence shall only replace a drive; it shall never touch the gun, the radar, the fire order or the messages. | A2 |
| WEAVE-3 | Ubiquitous | The driving role shall order a shot only on a tick for which the conductor has given the fire permission. | A2 |
| WEAVE-4 | State | While a living teammate's last known position is no older than the WORLD-3 window and lies in the fire lane, the conductor shall withhold the fire permission. | A5 |
| WEAVE-5 | State | While in a team battle, the Guard's safe orders shall hold fire. | A5 |
| WEAVE-6 | Unwanted | If the driving role orders a shot on a tick without the fire permission, then the core shall treat it as that role's fault. | A2 |
| LINK-1 | Ubiquitous | Team messages shall be byte arrays in a versioned, checksummed format that the core encodes and decodes. | A4 |
| LINK-2 | Unwanted | If a message fails its checksum or carries an unknown version, then the core shall ignore it and count it. | A4 |
| LINK-3 | Unwanted | If no teammate's report has arrived, then the core shall still resolve its role from the engine's facts alone. | A5 |
| LINK-4 | State | While it has a living teammate, the core shall broadcast its own state, its fresh sightings, the deaths it knows of this round and its bullet events with the orders of every tick it completes. | A5 |
| SHELF-1 | Ubiquitous | A shelf shall be written only on behalf of its own strand's role. | A4 |
| SHELF-2 | State | While in a team battle, a member that is not the team's leader shall neither write to nor delete from the store. | A5 |
| SHELF-3 | Ubiquitous | The `.hp` shelf shall be written only in a Duel-charter battle, the `.hm` shelf only in a Melee-charter battle and the `.ht` shelf only in a Team-charter battle. | A4 |
| SHELF-4 | Ubiquitous | The `.hm` and `.ht` shelves shall each stay within a fixed byte budget. | A4 |
| STRAND-1 | Ubiquitous | Every package of the core shall have exactly one owner: the kernel, one strand, or the conductor. | A0 |
| STRAND-2 | Ubiquitous | No strand's package shall depend on another strand's or on the conductor's, and no kernel package on a strand's or the conductor's. | A0 |
| STRAND-3 | Ubiquitous | Each owner's sources shall be pinned by hash. | A0 |
| STRAND-4 | Ubiquitous | A recorded duel battle and a recorded melee battle shall each replay to identical orders, telemetry and store files. | A0 |
| STRAND-5 | Ubiquitous | A recorded team battle shall replay to identical orders and telemetry for each recorded member. | A5 |

Only one existing requirement is retired. GATE-1 gives way to ROLE-3 at A1, which carries the same conditions plus the latch. Its 10 test tags are retagged in that stage: six scenario tags and the two tests in `PostureGateTest` to ROLE-3, and the two ArchUnit rules to STRAND-2. Those two tests are rewritten against `RoleResolver`, and `sentryAliveKeepsTheDuel` now expects the Duel to stay once it has driven.

Others keep their IDs and gain a clause. GATE-4 and GATE-5 stay in force as they are.

| Existing ID | Stage | The clause |
|---|---|---|
| TIME-5 | A3 | One warm-up tick for each role of the charter, where it now says one tick |
| MMEM-1 | A4 | "A melee battle" reads "a Melee-charter battle" |
| GATE-2, MELEE-2, MMEM-2 | A5 | "Opponents alive" reads "enemies alive as the core counts them" (WORLD-8) |
| RES-9 | A5 | Its shot waits for the fire permission (WEAVE-3) |
| RES-7 | A5 | It applies only off a team (WEAVE-5) |
| GATE-2, GATE-3 | Team plan | Each gains a Team clause, because both name the duel as the only alternative to melee |

Three requirements are left for the Team plan, so that their IDs are not spent early: the Team row of the resolver, the Team fault rule, and the seat rule.

## Stages A0 to A5

Six stages reach the new shape, each gated before the next starts. A0 to A4 are built to leave 1v1 and melee play unchanged. The one exception is A1's latch, which only matters when a sentry dies unscanned, and A0's sentry fixture holds no such round.

Where a new requirement's wording and a recorded fixture disagree in those stages, the fixture wins and the difference is raised as its own change.

*Diagram in the plan doc: roadmap · six stages, six gates, two releases, three ladder plans.*

| Stage | Builds | Gate |
|---|---|---|
| A0 Pin and record | The ownership map and one pin per owner, from today's tree. Bench recording on the melee path. New fixtures: melee and hand-off on a store, sentry, a warm duel on a seeded store, a duress round. The recorder re-derives the adapter's memory-prepare, round-end, checkpoint, battle-end and health-record calls in its own event handlers and logs them beside the transcript, and a test-side replay loop with its own Guard replays them. The replay test compares telemetry and store files as well as orders, and the six old transcripts get a snapshot of the telemetry they replay to today. `requirements.md` gains a section per owner, and the traceability test reads the A stages. Today's benches recorded as the baseline | `mvn verify` is green and no shipped class has changed, the `replay` package included |
| A1 Facts and resolver | `BattleFacts`, `Charter` and `RoleResolver` with the latch, in place of `PostureGate`. `posture` folds into `role`. `posture()` and `veto()` keep their enum constants: `Veto` moves out of `PostureGate` and both enums move to `role`, so only imports and the qualifier change at their call sites, and the `M` record reads as before. Until A4 the roster is always empty. The `ROLE` record | Every fixture's orders are unchanged, and telemetry differs only by `ROLE` lines, which the comparison sets aside from here on. Property tests show the resolver always answers, never moves up within a round, and changes at most twice a round |
| A2 Lift the duel | `duel.DuelController` lifted out of `HadurCore`, with `Duress`, to stand beside `melee.MeleeController`. `Role`, `Tick` and a seam per brain. Each seam hands its brain its shelf, or none, by charter. The focus stays with the conductor, and the Melee seam's `give` copies the survivor's shots and Hadur's path into the baton, so `duel` imports nothing from `melee`. `RoundStats` moves to `model`, so the Duel keeps its counters without importing the conductor. `HadurCore` becomes the conductor and keeps its public surface | Every fixture replays unchanged in orders, telemetry and store files, with none re-recorded. No file in the nine packages pinned today is edited. Paired A/B on the duel sets, the melee gates and the hand-off gates shows nothing beyond noise, and skipped turns are no higher. Then 3.6 ships on its own, as set out below |
| A3 The World | `melee.EnemyTracker` and its types promoted to `world`, fed exactly as the tracker is today. The focus and the hand-off read the World. `meleeIsSeparateFromDuel` lets `melee` see `world`. Only the charter's roles are built and fed, and the adapter's warm-up runs one throwaway tick for each of them | Every fixture replays unchanged, store files included. The melee and hand-off gates stay within noise, and the `M` record's counters do not move |
| A4 Ports for a team | `BotEvent.Message`, `BotOrders.messages`, the owner's name on the bullet-meets-bullet event, the link codec and the replay codec's new fields. The adapter on `TeamRobot`, with the roster and the starting energy in `BattleFacts`. `SentryFence` carries messages through. The store's gate on writes and deletes, and the Archive's shelves by charter | Old transcripts and profiles still load. The duel and melee suites and the session bench stay within noise on the new adapter, and REL-1 holds |
| A5 Team baseline | The roster, teammates' reports and the upward-erring count of enemies in the World. The filtered input. The fire-lane check, and a Guard that knows the roster and holds fire on a team. The scribe and the team round result. The World's shot lifetime derived from the field, still 130 on 1000 × 1000. The bench's team runner with one transcript per member, a team reference set and gate suite, team fixtures and the team jar | No shot is ordered while a teammate's last known position, no older than the WORLD-3 window, lies in the fire lane, and the share of shots with a teammate truly in the lane is reported. No `.hp` or `.hm` file is written in a team battle, and only the leader's store takes a write or a delete. The count of enemies is never below the truth. No faults, every message decodes, skipped turns, teammate collisions and blocked shots are counted, and a team baseline is on record. Then the team entry ships |

### What A2 must keep

A2 is a move, not a redesign. It keeps what `HadurCore` does today, in the same order, and these are the places where a slip would change play or a record.

| Where | What stays exactly as today |
|---|---|
| Before the events | The role is chosen from the engine's counts. Sentry scans are noted first, because a sentry's bullet is delivered ahead of its scan. Duress is settled here, and only for a duel whose opponent has been scanned. The melee scan gap is measured here, and only on ticks where Melee is chosen |
| Each event | It reaches the tracker and the melee brain, then the Duel, one event at a time. An opponent's melee block is loaded at its first scan of the battle, after the tracker has the scan and before the Duel sees it. The focus and the hand-off read the tracker as it stands at that event |
| What each brain is fed | The melee brain is fed whichever role drives: scans, deaths, the bullets that hit Hadur, and Hadur's own hits except on a robot the duel is ignoring. Sentries stay under GATE-5. While another role drives, the Duel is offered no scan, but it still hears bullets and collisions for its ledger, its bullet shadows and the count of bullets in flight. A3 stops the melee feed in 1v1 battles, where the fixtures already show it changes nothing |
| In duress | A scan only moves the Duel's fix on its opponent, and a bullet's outcome is only counted in the round's statistics. Deaths and the budget's events are handled as usual. Nothing else reaches the tracker, a brain or the count of bullets in flight |
| After the events | A few seed samples are replayed, only when the Duel was chosen before the events and the tick is not in duress. Then a melee event fault takes effect, and then the main body runs and reads the budget level. The radar lock a scan set is written before the main body's own radar order, so `observe` needs no builder: the lifted Duel holds the lock until `drive` |
| A change of role | A round's first tick is not a change. The hand-off happens inside the survivor's first duel scan: after the tracker and the melee brain have taken that scan and the Duel has switched its opponent, and before the Duel logs the scan or adds its own waves. It happens only when the change was the count of enemies falling to one, and after a veto there is none |
| A fault | A fault in a melee event handler takes effect after the tick's last event, or on the next tick if the core aborts first. The role that takes over starts from fresh orders and is not replayed that tick's events, and a shot the melee seam had already counted stays counted. A recovery (RES-1) is core-wide: every role drops its transient state, the tracker is cleared, the count of bullets in flight is zeroed and the focus dropped, while the vetoes and the latch stay. The tick after a recovery is not a change of role: no reset, no full-speed order, no new baton. A baton already pending stays pending and is taken from the cleared tracker |
| The round's counters | The melee, focus and duel tick counters do not advance on a tick the Guard covers, and the Guard's fault count replaces the core's in the `R` record |

### Releases, and where the ladder plans start

Two releases come out of these stages, and Leigh runs each by hand in every mode it can play before it goes to a rumble. No ladder plan merges code before the first of them is out.

| Release | Carries | Leigh runs by hand first | Then |
|---|---|---|---|
| 3.6 | A0 to A2 and nothing else | A 1v1 battle, a ten-robot melee and a battle with sentries, where the latch is the one intended change | It replaces 3.5.1 on the RoboRumble and MeleeRumble pages. One complete pass on each ladder is read against 3.5.1's with BENCH-5, never a partial one |
| The team entry | A3 to A5, with whatever the ladder plans have shipped by then | The same three, and five Hadurs against another team | `hadur2.HadurTeam` goes on the TeamRumble page, built from the same commit and version as the solo jar |

Team play is not in 3.6: until A5 a teammate still reads as an opponent. Before 3.6 replaces it, 3.5.1's complete pages on both ladders are saved as the baseline, and a fall in APS or survival beyond the pages' own noise holds the ladder plans until it is explained against the fixtures. A3 and A4 ship inside whichever release follows them.

- **Duel.** The Druss route starts from 3.6. The top-15 plan stays proposed until then: its R11 is re-read against `duel.DuelController` and ships as the version after 3.6, the number it had pencilled for itself. Its R10 is bench-only and does not collide.
- **Melee.** Its plan starts after A3, on the World, and not before 3.6 is out.

- **Team.** Its plan starts from the team entry.

A0 to A5 change no code in the nine packages pinned today: `adapt`, `gun`, `knn`, `ledger`, `memory`, `move`, `physics`, `policy` and `shield`. Where a stage re-pins the kernel, it is for `model`, `port` or `world` only. Comments in the nine that name `HadurCore` go stale after A2, and putting them right is one optional, comment-only re-pin. A3 re-pins melee once, as the donor of the tracker.

## Risks and decisions

The largest risk is A2, which moves well over half of `HadurCore` in one stage. The wider fixtures recorded in A0 are what make it safe.

| Risk | Why it matters | Mitigation |
|---|---|---|
| A2 moves the duel's orchestration in one stage | A slip changes play without failing a unit test | What A2 must keep is written down, place by place. The fixtures are recorded in A0, before anything moves, and A2 may not re-record one. 3.6 carries A0 to A2 alone, so its live pass checks the move by itself |
| Today's fixtures cover little: three rounds each, no store, orders only | The opening book, the seeds, telemetry and duress are never replayed | A0 adds melee, sentry, hand-off, warm and duress fixtures, replays the round-end calls and compares telemetry and store files. The paired A/B bench backs them up |
| A `TeamRobot` adapter on the 1v1 ladder | A client quirk could cost live rounds, as the 3.0 and 3.1 slides did | A4 runs the session bench (BENCH-6) on the new adapter. Combat, a `TeamRobot`, already ranks 12th in melee |
| Five members share one data directory | Each counts its own quota, so together they can overrun 200 KB or interleave a save | One scribe, the leader, fixed at tick 0 (SHELF-2). The baseline writes no profile. A5 checks for one writer per battle |
| A skipped turn wipes queued scans, hits and deaths | A member can miss a death and miscount who is alive | Reports survive a skip and carry the round's deaths their sender knows of. The count of enemies errs upward in a doubt, so a miss can delay the step down to the Duel but never cause it (WORLD-8). A5 checks the count against the bench's truth log |
| A teammate can drive into a bullet after it is fired | The fire-lane check cannot promise zero team hits | The gate is the check's own rule, on last known positions. The share of shots with a teammate truly in the lane is reported, not gated |
| Teammates are hidden from the movers | Neither mover steers round a robot it cannot see. A collision costs both robots 0.6 energy and stops the one that drove in | A5's gate counts teammate collisions. A teammate term in the mover is an early Team-plan item |
| Melee constants assume a 1000 px field | Inferred shots expire after 130 ticks, and a slow bullet needs 155 to cross the team field | A5 derives the World's shot lifetime from the field, keeping 130 on 1000 × 1000. The melee gun's 90-tick history is left to the Melee plan |
| The team jar carries its own copy of the robot | A client holding both jars could resolve the robot's name and version to either. This is read from the engine's code and has not been run | Build both jars from one commit with identical classes. A5 checks it on a client set-up |
| CPU on a 1200 × 1200 field with nine other robots | Skipped turns have already cost rounds on the 1v1 ladder | A5's gate counts skipped turns. The melee brain sheds no work today, so a shed table for it is the first promotion to make if the count is high |
| The kernel becomes the bottleneck | Three plans queue behind kernel changes | The promotion rule keeps the kernel small. A kernel change is its own pull request with every gate |

### Decisions

Leigh settled the first four on 5 October 2026. The next three stand as this plan recommended until he says otherwise, and the last is set on the bench.

| Decision | Outcome | Standing |
|---|---|---|
| One class or two | One class, `hadur2.Hadur` on `TeamRobot`, so one memory serves all three ladders | Decided |
| A0 to A2 or the top-15 plan's R11 first | A0 to A2 first. No R11 work starts before 3.6 is out | Decided |
| A2 as its own release | Yes, as 3.6, once Leigh has run it by hand in every mode | Decided |
| The Guard on a team | It holds fire (WEAVE-5), so RES-7 applies only off a team | Decided |
| Five full robots or a leader with droids | Five full robots for the A5 baseline. A droid is a different class with no radar and its own data directory, so droids are a question for the Team plan | As recommended |
| Packages or a Maven module per strand | Packages with the ownership map, and modules only if the rules leak | As recommended |
| Twin Duel | Out of scope, on its 2,000-byte rule | As recommended |
| The silent-teammate window and the fire lane's width | WORLD-3 and WEAVE-4 leave the numbers open | Set on the bench in A5 |

## Sources

Everything was read on 4 and 5 October 2026.

**Hadur**

- [lgriffin/Hadur_Robot](https://github.com/lgriffin/Hadur_Robot/tree/11e7c68) at commit 11e7c68, robot 3.5.1: [HadurCore.java](https://github.com/lgriffin/Hadur_Robot/blob/11e7c68/hadur-core/src/main/java/hadur2/core/HadurCore.java), [PostureGate.java](https://github.com/lgriffin/Hadur_Robot/blob/11e7c68/hadur-core/src/main/java/hadur2/core/posture/PostureGate.java), [GunController.java](https://github.com/lgriffin/Hadur_Robot/blob/11e7c68/hadur-core/src/main/java/hadur2/core/gun/GunController.java), [ArchitectureTest.java](https://github.com/lgriffin/Hadur_Robot/blob/11e7c68/hadur-core/src/test/java/hadur2/core/arch/ArchitectureTest.java), [DuelIdentityTest.java](https://github.com/lgriffin/Hadur_Robot/blob/11e7c68/hadur-core/src/test/java/hadur2/core/arch/DuelIdentityTest.java), [architecture.md](https://github.com/lgriffin/Hadur_Robot/blob/11e7c68/docs/architecture.md), [requirements.md](https://github.com/lgriffin/Hadur_Robot/blob/11e7c68/docs/requirements.md) and [learnings.md](https://github.com/lgriffin/Hadur_Robot/blob/11e7c68/data/learnings.md).
- The adapter and the bench's recorder: [Hadur.java](https://github.com/lgriffin/Hadur_Robot/blob/11e7c68/hadur-robot/src/main/java/hadur2/Hadur.java) and [HadurRecorder.java](https://github.com/lgriffin/Hadur_Robot/blob/11e7c68/hadur-robot/src/main/java/hadur2/HadurRecorder.java).

- Read for single claims: [Guard.java](https://github.com/lgriffin/Hadur_Robot/blob/11e7c68/hadur-core/src/main/java/hadur2/core/Guard.java), [ProfileLibrary.java](https://github.com/lgriffin/Hadur_Robot/blob/11e7c68/hadur-core/src/main/java/hadur2/core/memory/ProfileLibrary.java), [MeleeMemory.java](https://github.com/lgriffin/Hadur_Robot/blob/11e7c68/hadur-core/src/main/java/hadur2/core/MeleeMemory.java), [Replay.java](https://github.com/lgriffin/Hadur_Robot/blob/11e7c68/hadur-core/src/main/java/hadur2/core/replay/Replay.java) and [PostureGateTest.java](https://github.com/lgriffin/Hadur_Robot/blob/11e7c68/hadur-core/src/test/java/hadur2/core/posture/PostureGateTest.java).
- For the status line and the release steps: [rumble-submission.md](https://github.com/lgriffin/Hadur_Robot/blob/11e7c68/docs/rumble-submission.md) and [the top-30 plan](https://github.com/lgriffin/Hadur_Robot/blob/11e7c68/docs/rumble-climb-top30-plan.md).

- [The top-15 plan](https://github.com/lgriffin/Hadur_Robot/blob/claude/plan-top-15-7gdh3i/docs/rumble-climb-top15-plan.md) (R10, R11), proposed on its own branch.
- Earlier plans: [Hadur 2, a duelist that remembers](https://claude.ai/artifact/KDkC1j5Yj8vWH6XQydyYH8), [the Melee Extension Plan](https://claude.ai/code/artifact/0eb1c942-b15b-4386-b995-7e71b46bb0c3) and [Hadur vs DrussGT 3.1.16](https://claude.ai/artifact/KARFCbDaXVnDMvAj85oG48), which is still being written.

- The replay timing was run for this document: two builds of the core from 11e7c68, the six fixtures, the median of 15 passes each.

**Robocode engine, tag VER_1_9_5_6**

- [RobotPeer.java](https://github.com/robo-code/robocode/blob/VER_1_9_5_6/robocode.battle/src/main/java/net/sf/robocode/battle/peer/RobotPeer.java): leader and droid energy, the leader's death, the count of others, message dispatch, robot collisions, when a shot leaves, and what a skipped turn clears.
- [Battle.java](https://github.com/robo-code/robocode/blob/VER_1_9_5_6/robocode.battle/src/main/java/net/sf/robocode/battle/Battle.java): how a round ends and who is sent the win event. The event classes in robocode.api give the priorities that order it.

- [TeamRobotProxy.java](https://github.com/robo-code/robocode/blob/VER_1_9_5_6/robocode.host/src/main/java/net/sf/robocode/host/proxies/TeamRobotProxy.java): teammates and the message size limit.
- [BulletPeer.java](https://github.com/robo-code/robocode/blob/VER_1_9_5_6/robocode.battle/src/main/java/net/sf/robocode/battle/peer/BulletPeer.java) and [RobotStatistics.java](https://github.com/robo-code/robocode/blob/VER_1_9_5_6/robocode.battle/src/main/java/net/sf/robocode/battle/peer/RobotStatistics.java): team fire and the kill bonus.

- [EventManager.java](https://github.com/robo-code/robocode/blob/VER_1_9_5_6/robocode.host/src/main/java/net/sf/robocode/host/events/EventManager.java): which events are dropped.
- [RobotFileSystemManager.java](https://github.com/robo-code/robocode/blob/VER_1_9_5_6/robocode.host/src/main/java/net/sf/robocode/host/io/RobotFileSystemManager.java) and [JavaHost.java](https://github.com/robo-code/robocode/blob/VER_1_9_5_6/robocode.host/src/main/java/net/sf/robocode/host/JavaHost.java): the quota, the data directory and the class loader. The radar range is in Rules.java.

- [teamrumble.txt](https://github.com/robo-code/robocode/blob/VER_1_9_5_6/robocode.content/src/main/resources/roborumble/teamrumble.txt), with its siblings for the other ladders, and [BotsDownload.java](https://github.com/robo-code/robocode/blob/VER_1_9_5_6/robocode.roborumble/src/main/java/net/sf/robocode/roborumble/netengine/BotsDownload.java): field sizes, rounds and the team jar check.

**Rumble and RoboWiki**

- LiteRumble rankings for the [RoboRumble](https://rumble.robowiki.net/Rankings?game=roborumble), [MeleeRumble](https://rumble.robowiki.net/Rankings?game=meleerumble) and [TeamRumble](https://rumble.robowiki.net/Rankings?game=teamrumble).
- RoboWiki: [Teams](https://robowiki.net/wiki/Teams), [Twin Duel](https://robowiki.net/wiki/Twin_Duel), [Combat](https://robowiki.net/wiki/Combat) and [Firestarter's version history](https://robowiki.net/wiki/Firestarter/Version_History). Wiki quotes came through a page-fetching tool, so check the wording on the page before reusing one.

## Stage log

| Stage | Pull request | What landed |
|---|---|---|
| A0 Pin and record | [#87](https://github.com/lgriffin/Hadur_Robot/pull/87) | The ownership map and one pin per owner (STRAND-1 to STRAND-3); five new fixtures recorded on 3.5.1 (melee, sentry, hand-off on a store, warm duel, duress); the recorder logs the store and the adapter's memory calls; the replay compares telemetry and store files (STRAND-4); `hadur.arch.stage` A0. |
| A1 Facts and resolver | [#88](https://github.com/lgriffin/Hadur_Robot/pull/88) | `BattleFacts`, `Charter` and `RoleResolver` with the latch in place of `PostureGate`; `posture` folded into `role`; the `ROLE` record, set aside by the replay comparison; GATE-1 retired for ROLE-3; `hadur.arch.stage` A1. |
| A2 Lift the duel | [#89](https://github.com/lgriffin/Hadur_Robot/pull/89) | `duel.DuelController` lifted out of `HadurCore` with `Duress`; `role.Role`, `Tick`, `RoundFacts`, `RoundResult`; the conductor's `DuelSeam` and `MeleeSeam`, each handing its brain its shelf by charter; `model.Baton` and `model.RoundStats`; the fire permission (WEAVE-3, WEAVE-6); ROLE-5, WORLD-5, WEAVE-1 to WEAVE-3 and WEAVE-6 tested; every fixture replays unchanged; the paired bench within noise ([docs/bench/a2-ab.md](bench/a2-ab.md)); released as 3.6; `hadur.arch.stage` A2. |
| A3 The World | [#92](https://github.com/lgriffin/Hadur_Robot/pull/92) | `melee.EnemyTracker` and its types promoted to the kernel's `world`, fed by the conductor before any role (WORLD-1); the melee brain's books-only handlers; only the charter's roles built (ROLE-6), so a 1v1 holds no melee brain; one warm-up tick per role, with the warm-up's cooling-rate fault fixed (TIME-5); every fixture replays unchanged; `hadur.arch.stage` A3. Gate: melee and hand-off level or better against A2, no M counter moved ([a3-melee.md](bench/a3-melee.md)). |
| A4 Ports for a team | [#93](https://github.com/lgriffin/Hadur_Robot/pull/93) | `BotEvent.Message`, the bullet owner on bullet-meets-bullet, `BotOrders.messages` and `withDrive`; `BattleFacts` with our name, starting energy and sentry border; the kernel's `link` package (LINK-1, LINK-2); the replay codec's `G`, `X` owner and `O` messages; `SentryFence` keeps the messages (WEAVE-2); the conductor's `Archive` over the port's `GatedProfileStore` (SHELF-1, SHELF-3); the adapter on `TeamRobot`; every fixture replays unchanged; `hadur.arch.stage` A4. Gate: duel, melee and session benches within noise against A3 ([a4-gate.md](bench/a4-gate.md)). |
| A5 Team baseline | this stage | The conductor's `TeamLink` and the World's `Roster`: the filtered input (WORLD-2, WORLD-6, WORLD-7), reports merged once by tick (WORLD-4), the silent teammate presumed dead after 20 ticks (WORLD-3) and the upward-erring count of enemies (WORLD-8, LINK-3); every tick's report sent while a teammate lives (LINK-4); the fire lane, 24 px plus 8 px a tick of age (WEAVE-4); a Guard that holds fire on a team (WEAVE-5); the leader as the only scribe (SHELF-2); the World's shot lifetime from the field; the `T` and `E` records; the team jar `hadur2.HadurTeam`, the bench's team mode, reference set and gate suite, one transcript per member and two team fixtures (STRAND-5); the release attaches the team jar; every older fixture replays unchanged; `hadur.arch.stage` A5. Gate: no fault, no rejected message, no count below the truth, no stray shelf, 0.2% of shots with a teammate truly in the lane; baseline 28.1% share over eight teams ([a5-team.md](bench/a5-team.md)). |
