package hadur2.core;

import hadur2.core.duel.DuelController;
import hadur2.core.model.Baton;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.role.Role;
import hadur2.core.role.RoleId;
import hadur2.core.role.RoundFacts;
import hadur2.core.role.RoundResult;
import hadur2.core.role.Tick;

/**
 * The conductor's seam for the Duel's brain (A2): it turns each {@link Tick} into the
 * {@link DuelController}'s own arguments. The answers the Duel must not work out for itself
 * are the conductor's and are passed in: whether a scan is of the focus, whether a bullet
 * outcome is the Duel's own (WORLD-5), whether the Duel drives, and when the melee's baton
 * is handed over.
 *
 * <p>While another role drives, the Duel is offered no scan, but it still hears bullets and
 * collisions for its ledger, its bullet shadows and the count of bullets in flight.</p>
 */
final class DuelSeam implements Role {

    private final HadurCore core;
    final DuelController duel;
    /** The scan being handled, for a hand-off inside it. */
    private BotEvent.Scan scan;

    DuelSeam(HadurCore core, DuelController duel) {
        this.core = core;
        this.duel = duel;
    }

    @Override
    public RoleId id() {
        return RoleId.DUEL;
    }

    @Override
    public void prepare() {
        duel.prepare();
    }

    @Override
    public void newRound(RoundFacts round) {
        duel.newRound(round.round(), round.stats());
    }

    @Override
    public void roundEnded(RoundResult result) {
        duel.roundEnded(result.tick(), result.won());
        duel.libraryStats();
    }

    @Override
    public void checkpoint(long tick) {
        duel.save(tick, true);
    }

    @Override
    public void battleEnded(long tick) {
        duel.save(tick, false);
    }

    @Override
    public void observe(BotEvent event, Tick tick) {
        BotInput in = tick.in();
        boolean driving = tick.driving() == RoleId.DUEL;
        if (event instanceof BotEvent.Scan) {
            if (!driving) return;
            BotEvent.Scan e = (BotEvent.Scan) event;
            // With several opponents alive the duel fights one and ignores the others.
            if (tick.focusing() && !e.name().equals(core.focusTarget(in.location()))) return;
            duel.switchOpponent(e.name());
            // MMEM-2: before the duel adds its own wave for this scan.
            if (core.handOffPending()) {
                scan = e;
                core.handOff(tick, e);
                scan = null;
            }
            duel.scan(in, e);
        } else if (event instanceof BotEvent.BulletHit) {
            BotEvent.BulletHit e = (BotEvent.BulletHit) event;
            boolean foreign = tick.foreign(e.name());
            // Asked first on purpose: every outcome must pass through it once, to keep the
            // count of melee bullets in flight right (WORLD-5).
            boolean own = core.duelBulletResolved() && !foreign;
            duel.bulletHit(e, own, foreign, driving);
        } else if (event instanceof BotEvent.HitByBullet) {
            BotEvent.HitByBullet e = (BotEvent.HitByBullet) event;
            // Not the duel's enemy: only the melee brain learns who hurts us.
            if (tick.focusing() && !e.name().equals(tick.focus().target())) return;
            duel.hitByBullet(in, e, driving, core.diedThisRound(e.name()));
        } else if (event instanceof BotEvent.BulletMissed) {
            duel.bulletMissed((BotEvent.BulletMissed) event, core.duelBulletResolved());
        } else if (event instanceof BotEvent.BulletHitBullet) {
            duel.bulletHitBullet(in, (BotEvent.BulletHitBullet) event, core.duelBulletResolved());
        } else if (event instanceof BotEvent.HitRobot) {
            // WAVE-1: a collision costs the enemy energy too; only the duel's enemy counts.
            if (!tick.foreign(((BotEvent.HitRobot) event).name())) duel.robotsCollided();
        }
    }

    /** RES-9: in duress a scan only moves the Duel's fix on its opponent. */
    void observeInDuress(BotEvent.Scan e, Tick tick) {
        if (!e.name().equals(duel.opponent())) return;
        if (tick.focusing() && !e.name().equals(core.focusTarget(tick.in().location()))) return;
        duel.duressScan(tick.in(), e);
    }

    @Override
    public void drive(Tick tick, BotOrders.Builder out) {
        if (tick.duress()) duel.duressDrive(tick.in(), out, tick.mayFire());
        else duel.drive(tick.in(), out, tick.level(), tick.mayFire());
    }

    /** MELEE-2: the survivor was never tracked as a duel opponent; start fresh. */
    @Override
    public void reset() {
        duel.resetTracking();
    }

    /** RES-14: duress ended; the Duel drops its pre-duress waves and starts its view afresh. */
    void afterDuress() {
        duel.resumeAfterDuress();
    }

    /** The Duel is the floor: it never hands over. */
    @Override
    public Baton give(Tick tick) {
        return Baton.EMPTY;
    }

    /**
     * MMEM-2: inside the survivor's first scan, after the opponent switch. The conductor's
     * {@code handOff} is the only caller, from within {@link #observe} on that scan.
     *
     * @throws IllegalStateException if called outside the survivor's scan
     */
    @Override
    public void take(Baton baton, Tick tick) {
        if (scan == null) {
            throw new IllegalStateException("the Duel takes a baton only inside the survivor's scan");
        }
        duel.take(tick.in(), baton, scan.name(), scan.energy());
    }

    @Override
    public void recover() {
        duel.recover();
    }
}
