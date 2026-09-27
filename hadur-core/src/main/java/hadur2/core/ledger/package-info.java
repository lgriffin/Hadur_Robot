/**
 * The energy ledger: deciding which of the enemy's energy drops are bullets (WAVE-1,
 * WAVE-2).
 *
 * <p>A duel robot never sees the enemy's bullets; it infers each shot from the energy the
 * enemy spent on it and surfs a wave from there. {@link hadur2.core.ledger.EnergyLedger}
 * holds the tick's hits, refunds and collisions until the enemy's next scan, infers wall
 * hits from a sudden stop next to a wall, and reports the drop left over as a
 * {@link hadur2.core.ledger.EnergyLedger.Reading}. Only a remainder in [0.1, 3.0] is a
 * shot. {@code HadurCore} turns a shot into the enemy's firing wave and feeds its power to
 * the enemy gun-heat estimate that END-1 reads.</p>
 *
 * <p>Dependencies, enforced by {@code ArchitectureTest}: the ledger may use only itself,
 * the physics package (the engine's rules, {@link hadur2.core.physics.Rules}) and the JDK, so nothing the gun, the
 * movement or the rest of the core believes can change which drops become waves. Like the
 * whole core it uses no {@code robocode.*} class (CORE-1) and no randomness, threads,
 * reflection, I/O or clock (RES-6). No duel package is allowed to depend on the melee or
 * posture packages, this one included. The package is one of the duel's, pinned by
 * {@code DuelIdentityTest}.</p>
 */
package hadur2.core.ledger;
