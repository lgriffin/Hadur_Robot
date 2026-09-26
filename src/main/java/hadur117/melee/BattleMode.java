package hadur117.melee;

/**
 * Battle mode, derived each tick from the number of opponents still alive.
 *
 * <p>Each mode names the movement, radar and targeting subsystems Hadur runs in it,
 * so the orchestrator switches behaviour by switching mode.</p>
 */
public enum BattleMode {
    DUEL(Movement.WAVE_SURFING, Radar.NARROW_LOCK, Targeting.VIRTUAL_GUN_ARRAY),
    MELEE(Movement.MINIMUM_RISK, Radar.FULL_SWEEP, Targeting.CIRCULAR);

    public enum Movement { WAVE_SURFING, MINIMUM_RISK }
    public enum Radar { NARROW_LOCK, FULL_SWEEP }
    public enum Targeting { VIRTUAL_GUN_ARRAY, CIRCULAR }

    public final Movement movement;
    public final Radar radar;
    public final Targeting targeting;

    BattleMode(Movement movement, Radar radar, Targeting targeting) {
        this.movement = movement;
        this.radar = radar;
        this.targeting = targeting;
    }

    /** DUEL when at most one opponent is left, MELEE otherwise. */
    public static BattleMode fromOthers(int others) {
        return others <= 1 ? DUEL : MELEE;
    }
}
