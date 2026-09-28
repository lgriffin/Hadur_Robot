/**
 * Hadur 2's core: the whole of the robot's strategy, as plain Java that never sees the
 * Robocode engine.
 *
 * <p><b>Hexagonal architecture.</b> The core is the inside of a hexagon. It takes one
 * {@link hadur2.core.model.BotInput} a tick (the robot's state and the events that arrived
 * with it) and returns one {@link hadur2.core.model.BotOrders}; it writes line records to a
 * {@link hadur2.core.port.Telemetry} and keeps opponent profiles in a
 * {@link hadur2.core.port.ProfileStore}. The adapter in the {@code hadur-robot} module
 * ({@code hadur2.Hadur}) is the only code that touches the engine: it turns engine events
 * into {@link hadur2.core.model.BotEvent} values, builds the input from the getters, applies
 * the orders through the setters, and backs the store with Robocode's data directory. That
 * split is what lets the core be replayed, fuzzed and fault-injected without an engine.</p>
 *
 * <p>The ArchUnit rules in {@code hadur2.core.arch.ArchitectureTest} enforce the boundary on
 * every build. The core depends on nothing from {@code robocode.*} and uses only the JDK's
 * {@code java.lang}, {@code java.util} and {@code java.awt.geom} (CORE-1). It holds no
 * unseeded randomness, threads, reflection, file or other I/O, and no clock (RES-6), and no
 * mutable static state, so two cores never share anything and the same inputs always give the
 * same orders (CORE-2). This package itself holds the three classes the adapter talks to.</p>
 *
 * <ul>
 * <li>{@link hadur2.core.HadurCore}: the brain. One instance lives for the whole battle
 *     (Robocode makes a new robot object each round, so the adapter keeps it static), which
 *     is how learning survives from round to round.</li>
 * <li>{@link hadur2.core.Guard}: wraps every core tick and returns safe orders if the core
 *     throws or returns nothing (RES-1).</li>
 * <li>{@link hadur2.core.RoundStats}: the round's counters and the {@code R} record that
 *     carries every fault and degradation counter to the bench report (RES-5).</li>
 * </ul>
 *
 * <p><b>The tick.</b> Robocode runs a robot's event handlers inside {@code execute()} and then
 * returns to {@code run()}; the core keeps that order. The adapter queues the tick's events,
 * builds the input and calls {@link hadur2.core.Guard#tick}, which calls
 * {@link hadur2.core.HadurCore#tick}:</p>
 *
 * <ol>
 * <li>The {@link hadur2.core.posture.PostureGate} picks the tick's subsystems, failing closed
 *     to the duel: melee only while two or more opponents are alive, no sentry is alive or
 *     has been scanned this round, and melee has not thrown this round (GATE-1 to GATE-4). A
 *     melee that has just ended hands over to a clean duel at full speed (MELEE-2).</li>
 * <li>The events. Every non-sentry scan and death goes to the melee tracker (GATE-5 keeps
 *     sentries out of everything). In the duel posture, the duel opponent's scan makes a gun
 *     wave and a candidate enemy wave, and the energy ledger turns only unexplained energy
 *     drops into firing waves (WAVE-1, WAVE-2). Bullet events feed the ledger, the hit
 *     windows, the shield detector and the bullet shadows; the adapter's {@code TickTime}
 *     and skipped turns feed the tick budget (TIME-1, TIME-2).</li>
 * <li>The driving posture's main body. Melee: the melee brain's radar, destination and aim.
 *     Duel: fire the shot aimed last tick and aim the next, break the waves that have passed
 *     us, check the profile's seeds against live evidence (RES-4), step the distance,
 *     endgame and flavour policies, update the shadows, surf (or ram), and sweep the radar
 *     back to a lost enemy (RADAR-1).</li>
 * <li>With sentries on the field, the duel's orders are checked against their border
 *     (GATE-3). The orders go back through the guard to the adapter.</li>
 * </ol>
 *
 * <p>Units follow Robocode throughout: positions in px (x east, y north), angles in radians
 * with headings absolute (0 = north, clockwise) and bearings relative to the robot's
 * heading, time in ticks, energy and bullet power in the engine's units (power in
 * [0.1, 3.0]). A guess factor is in [-1, 1]: the fraction of the maximum escape angle a
 * target reached, signed by the direction it was moving when the wave was fired.</p>
 *
 * <p><b>Subpackages.</b> Each is described in full by its own classes; the requirement IDs are
 * those of {@code docs/requirements.md}.</p>
 *
 * <ul>
 * <li>{@code model}: the port values ({@link hadur2.core.model.BotInput},
 *     {@link hadur2.core.model.BotEvent}, {@link hadur2.core.model.BotOrders}), robot states
 *     and their bounded logs, {@link hadur2.core.model.Wave} (precise intersection, guess
 *     factors, shadowed fractions) and the {@link hadur2.core.model.WaveManager}, and the
 *     shared seed weight (ADAPT-3). Must not depend on gun, move or replay.</li>
 * <li>{@code physics}: {@link hadur2.core.physics.Angles} and
 *     {@link hadur2.core.physics.Rules}, identical to Robocode's, the battle field and the
 *     {@link hadur2.core.physics.MovementPredictor} that runs the engine's movement rules
 *     forward. Must not depend on gun, move, replay or knn.</li>
 * <li>{@code knn}: the weighted KD-tree and the {@link hadur2.core.knn.KnnView}s the gun and
 *     the surf keep their samples in, capped in size (RES-2), with k shared out by the tick
 *     budget (TIME-1).</li>
 * <li>{@code ledger}: the {@link hadur2.core.ledger.EnergyLedger}, which explains the enemy's
 *     energy changes between scans by our hits, its refunds, wall hits and collisions, so
 *     only a corrected drop in [0.1, 3.0] becomes a wave (WAVE-1, WAVE-2). A leaf on the
 *     engine's rules: it may depend only on physics and the JDK.</li>
 * <li>{@code gun}: the {@link hadur2.core.gun.GunController}, the main KNN gun, the
 *     anti-surfer gun and the virtual guns that rate them. It takes the opening book's and the
 *     policies' decisions through its own setters (ADAPT-1, ADAPT-3). Gun and move never
 *     depend on each other.</li>
 * <li>{@code move}: wave surfing. The {@link hadur2.core.move.MoveController} holds the
 *     enemy's waves and the danger views; {@link hadur2.core.move.BulletShadows} takes out
 *     the firing angles our own bullets would meet (MOVE-1); the
 *     {@link hadur2.core.move.SurfMover} turns danger into orders, with go-to surfing
 *     (MOVE-2) and the ram (END-2).</li>
 * <li>{@code memory}: opponent memory for duels (MEM-1 to MEM-5, RES-3): lineage keys, the
 *     profile and its checksummed codec, the round folder and the library that loads, saves
 *     and evicts; {@link hadur2.core.memory.Estimate}, a rate with its Agresti-Coull margin
 *     (DIAL-1); the tiers. A leaf that reaches storage only through the port; no gun, move,
 *     knn, ledger, melee, physics or model code may depend on it.</li>
 * <li>{@code adapt}: recognise and adapt (ADAPT-1 to ADAPT-3, RES-4): the
 *     {@link hadur2.core.adapt.OpeningBook} that reads a profile once, the seed loader and
 *     the seed trust. It sees only memory, the model and the JDK, never
 *     {@code BotInput} or {@code BotEvent} (DIAL-2), and the lower packages never see it.</li>
 * <li>{@code policy}: aggressive and unhittable (DIST-1, POW-1, POW-2, END-1, END-2, MOVE-2,
 *     TIME-1, TIME-2): rolling hit windows, the distance controller, the power policy, the
 *     endgame and the enemy's gun heat, the movement flavour and the
 *     {@link hadur2.core.policy.TickBudget}. It sees only memory, physics and the JDK
 *     (DIAL-2), and gun, move and the lower packages never see it.</li>
 * <li>{@code shield}: the bullet-shielding counter (SHIELD-1, SHIELD-2): the
 *     {@link hadur2.core.shield.ShieldDetector} and the deterministic
 *     {@link hadur2.core.shield.AimJitter}.</li>
 * <li>{@code posture}: the melee extension's gate (GATE-1 to GATE-5). The
 *     {@link hadur2.core.posture.PostureGate} picks melee or duel each tick and remembers
 *     sentry names for the battle; the {@link hadur2.core.posture.DuelFocus} names the one
 *     opponent the duel fights while several are alive (the closest when the duel takes
 *     over, kept until it dies); the {@link hadur2.core.posture.SentryFence} simulates the
 *     duel's orders a few ticks ahead and replaces them with a drive to the centre if they
 *     would take the robot near the sentries' border. A leaf on the model and physics that
 *     only this package sees, so neither brain can tell which posture is on.</li>
 * <li>{@code melee}: the melee brain, driven each tick by the
 *     {@link hadur2.core.melee.MeleeController}. A per-round tracker of every opponent that
 *     drops the dead at once and infers shots from unexplained energy drops of 0.1 to 3.0
 *     (MSENSE-1, MSENSE-2); a radar that spins with four or more opponents alive and turns
 *     toward the one scanned longest ago with two or three (MRADAR-1, MRADAR-2);
 *     minimum-risk movement over a ring of candidate points, weighting the points where
 *     Hadur would be an opponent's closest robot and the virtual bullets of each inferred
 *     shot, and tightening its ring with two opponents left (MMOVE-1 to MMOVE-4); a target
 *     selector with a switching margin (MELEE-5); a circular gun with a linear fallback that
 *     fires no more than the kill needs (MELEE-6) and holds fire at a target whose last scan
 *     is too old (MELEE-7); and a strategy that keeps clear of two opponents fighting each
 *     other (MMOVE-5). It depends only on the model, physics and the JDK, and no duel package
 *     may depend on it (GATE-1). The plan's later groups, MGUN and MMEM, belong to its M4
 *     and M5 stages.</li>
 * <li>{@code port}: the outbound interfaces, {@link hadur2.core.port.Telemetry} and
 *     {@link hadur2.core.port.ProfileStore}, with the in-memory store for tests and the
 *     bench. Must not depend on gun, move or replay.</li>
 * <li>{@code replay}: the line codec and the {@link hadur2.core.replay.Replay} driver that run
 *     a recorded battle back through a fresh core and guard, checking CORE-2 end to end.</li>
 * </ul>
 *
 * <p>The duel's packages (adapt, gun, knn, ledger, memory, move, physics, policy, shield) are
 * pinned by source hash in {@code DuelIdentityTest} as of the melee extension's M0, so melee
 * work cannot change how Hadur fights a duel. Everything that grows during a battle is capped
 * (RES-2).</p>
 */
package hadur2.core;
