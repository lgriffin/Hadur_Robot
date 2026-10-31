package hadur117.core.melee;

/**
 * Melee bullet power (MGUN-2, MGUN-3), the plan's energy table:
 *
 * <ul>
 * <li>a finisher (target energy at most {@link #FINISHER_ENERGY}) gets the power that kills
 *     it exactly, at most 3;</li>
 * <li>with two opponents or fewer left, the duel's own table (1.95, 2.95 inside 150 px,
 *     powering down beyond 325 px as energy runs low);</li>
 * <li>otherwise 1.0 beyond 500 px or below 20 energy (0.5 below 10), 1.5 at 300-500 px, and
 *     2.0 inside 300 px rising to 3.0 at 150 px.</li>
 * </ul>
 *
 * <p>Nothing is fired below {@link #MIN_OWN_ENERGY}, a shot never costs more than what kills
 * the target, and while Hadur leads the target on energy a shot never drops it below the
 * target's.</p>
 *
 * <p>On a team (MGUN-6, {@link #teamPower}) a member with {@link #TEAM_FULL_POWER_ENERGY} or
 * more fires 3, or what kills the target, in place of the table: the table is a free-for-all's,
 * and on the team ladder its light shots let rounds run a third longer than a team firing hard
 * (docs/bench/team-lower-half.md, sections 10 and 11).</p>
 */
public final class MeleeEnergyPolicy {

    public static final double FINISHER_ENERGY = 16.0;
    public static final double MIN_OWN_ENERGY = 1.0;
    static final double MIN_POWER = 0.1;
    static final double MAX_POWER = 3.0;
    /** MGUN-6: the own energy from which a member on a team fires full power. */
    public static final double TEAM_FULL_POWER_ENERGY = 30.0;
    /**
     * MGUN-12: off a team with three or more opponents and 20 energy or more, fire at least
     * {@link #CROWD_FLOOR_POWER} wherever the target is, in place of the table's 1.0 and 1.5 beyond
     * 300 px. Off: the crowd exposure read (BENCH-116) has the top 10 firing 2.6 in the crowd to
     * Hadur's 1.6 at the same hit rate, and the bench builds an arm with it on (pfloor).
     */
    public static final boolean CROWD_FLOOR = false;
    static final double CROWD_FLOOR_POWER = 1.9;
    /**
     * MGUN-13: as MGUN-12's conditions, fire Ogi's melee power instead: {@link #OGI_POWER}, and 3
     * within {@link #OGI_CLOSE} px. On: +0.62 on the K = 12 gun (BENCH-117) and +0.57 +-0.18 on
     * top of K = 24 and MEND-3 (pc-melee-ogi, BENCH-118).
     */
    public static final boolean CROWD_OGI = true;
    static final double OGI_POWER = 1.92;
    static final double OGI_CLOSE = 200;
    /** MGUN-12, MGUN-13: the own energy from which the crowd rules fire harder than the table. */
    static final double CROWD_RULE_ENERGY = 20.0;
    /**
     * MGUN-14: MGUN-13 also with two opponents left, where the duel's table fires now. Off: the
     * exposure read on the banked build (docs/plan-melee-top5.md) has Hadur's crowd power at 1.85
     * to the top 10's 2.56, and the rule idle there; the bench builds an arm with it on (ogi2).
     */
    public static final boolean OGI_TWO = false;
    /** MGUN-15: MGUN-13 from {@link #OGI_LOW_ENERGY} own energy, not 20. Off (arm ogie10). */
    public static final boolean OGI_LOW = false;
    static final double OGI_LOW_ENERGY = 10.0;
    /** MGUN-16: MGUN-13's power 3 out to {@link #OGI_WIDE_CLOSE} px, not 200. On for 3.19 (power2 card +0.15 +- 0.15, PR #349). */
    public static final boolean OGI_WIDE = true;
    static final double OGI_WIDE_CLOSE = 300;
    /**
     * MGUN-22 (arm mscal), inspired by ScalarR's melee power: off a team with two or more
     * opponents, power falls with the distance to the nearest robot and in a line with Hadur's own
     * energy rather than stepping at {@link #CROWD_RULE_ENERGY}. Off.
     */
    public static final boolean SCAL_POWER = false;
    static final double SCAL_REACH = 1300;
    static final double SCAL_FAR = 325;
    static final double SCAL_SHARE = 6;
    static final double SCAL_FAR_SHARE = 15;
    static final double SCAL_RESERVE = 0.02;
    /**
     * MGUN-23 (arm mavg), inspired by Diamond's melee power: off a team with three or more
     * opponents and {@link #CROWD_RULE_ENERGY}, while Hadur's energy is at or above the living
     * opponents' mean it fires 3 at any range up to {@link #AVG_FAR} px once four or more are
     * left (with three, MGUN-13 stands), and {@link #AVG_WEAK_POWER} beyond; below the mean it
     * fires {@link #AVG_WEAK_POWER} beyond {@link #AVG_FAR_WEAK} px. Off.
     */
    public static final boolean AVG_POWER = false;
    static final double AVG_FAR = 700;
    static final double AVG_FAR_WEAK = 300;
    static final double AVG_WEAK_POWER = 1.0;

    private MeleeEnergyPolicy() {}

    /** The power to fire at a target {@code distance} away with {@code targetEnergy}, or 0 to hold. */
    public static double power(double distance, double ownEnergy, double targetEnergy, int others) {
        if (ownEnergy < MIN_OWN_ENERGY) return 0;
        double p;
        if (targetEnergy <= FINISHER_ENERGY) {
            p = Math.min(MAX_POWER, killPower(targetEnergy));
        } else if (others <= 2) {
            p = duelPower(distance, ownEnergy, targetEnergy);
        } else if (distance > 500 || ownEnergy < 20) {
            p = ownEnergy < 10 ? 0.5 : 1.0;
        } else if (distance >= 300) {
            p = 1.5;
        } else if (distance <= 150) {
            p = 3.0;
        } else {
            p = 2.0 + (300 - distance) / 150.0;
        }
        p = Math.min(p, killPower(targetEnergy));
        if (ownEnergy > targetEnergy) {
            double lead = ownEnergy - targetEnergy;
            // A lead too small for the lightest shot is kept by holding fire.
            if (lead < MIN_POWER) return 0;
            p = Math.min(p, lead);
        }
        p = Math.max(p, MIN_POWER);
        return Math.min(p, ownEnergy);
    }

    /**
     * MGUN-6: the power a member on a team fires, given the table's {@code tablePower}. A hold
     * (0) stands; with {@link #TEAM_FULL_POWER_ENERGY} or more own energy the shot is 3, or what
     * kills the target, whatever the table said (its lead cap and two-left row included);
     * below that the table stands.
     */
    public static double teamPower(double tablePower, double ownEnergy, double targetEnergy) {
        if (tablePower <= 0 || ownEnergy < TEAM_FULL_POWER_ENERGY) return tablePower;
        return Math.min(MAX_POWER, killPower(targetEnergy));
    }

    /**
     * MGUN-12, MGUN-13: off a team, the power for a target with {@code others} opponents alive,
     * given the table's {@code tablePower}. A hold (0) stands, as do a finisher, fewer than three
     * opponents and own energy under {@link #CROWD_RULE_ENERGY}; otherwise a switched-on rule
     * replaces the table's power, still capped by what kills the target, by the lead over it and by
     * Hadur's own energy, as the table is. With both switches off the table stands.
     */
    public static double crowdPower(double tablePower, double distance, double ownEnergy, double targetEnergy,
                                    int others) {
        return crowdPower(tablePower, distance, ownEnergy, targetEnergy, others, CROWD_FLOOR, CROWD_OGI,
            OGI_TWO, OGI_LOW, OGI_WIDE);
    }

    static double crowdPower(double tablePower, double distance, double ownEnergy, double targetEnergy,
                             int others, boolean floor, boolean ogi) {
        return crowdPower(tablePower, distance, ownEnergy, targetEnergy, others, floor, ogi, false, false, false);
    }

    /** MGUN-14..16 widen MGUN-13 only: with it off they do nothing. */
    static double crowdPower(double tablePower, double distance, double ownEnergy, double targetEnergy,
                             int others, boolean floor, boolean ogi, boolean two, boolean low, boolean wide) {
        int least = ogi && two ? 2 : 3;
        double energy = ogi && low ? OGI_LOW_ENERGY : CROWD_RULE_ENERGY;
        if (tablePower <= 0 || others < least || ownEnergy < energy || targetEnergy <= FINISHER_ENERGY
            || !(floor || ogi)) {
            return tablePower;
        }
        if (floor && !ogi && others < 3) return tablePower;
        double close = ogi && wide ? OGI_WIDE_CLOSE : OGI_CLOSE;
        double p = ogi ? (distance <= close ? MAX_POWER : OGI_POWER) : Math.max(tablePower, CROWD_FLOOR_POWER);
        p = Math.min(p, killPower(targetEnergy));
        if (ownEnergy > targetEnergy) p = Math.min(p, ownEnergy - targetEnergy);
        p = Math.max(p, MIN_POWER);
        return Math.min(p, ownEnergy);
    }

    /**
     * As {@link #crowdPower(double, double, double, double, int)}, where with MGUN-22 on and two or
     * more opponents the power is {@link #scalPower} from the nearest robot's distance
     * {@code nearest}. A hold (0) and a finisher stand.
     */
    public static double crowdPower(double tablePower, double distance, double nearest, double ownEnergy,
                                    double targetEnergy, int others) {
        return crowdPower(tablePower, distance, nearest, ownEnergy, targetEnergy, others, SCAL_POWER);
    }

    /**
     * As above, with MGUN-23 on also read against {@code averageEnergy}, the living opponents'
     * mean energy (NaN when unknown: the rule stands down).
     */
    public static double crowdPower(double tablePower, double distance, double nearest, double ownEnergy,
                                    double targetEnergy, int others, double averageEnergy) {
        double p = crowdPower(tablePower, distance, nearest, ownEnergy, targetEnergy, others);
        return avgPower(p, distance, ownEnergy, targetEnergy, others, averageEnergy, AVG_POWER);
    }

    /**
     * MGUN-23: {@code p} (the rules so far) replaced by Diamond's crowd power where the switch
     * {@code on} and the crowd conditions hold; a hold (0) and a finisher stand, and the kill,
     * lead and own-energy caps apply as the table's do.
     */
    static double avgPower(double p, double distance, double ownEnergy, double targetEnergy, int others,
                           double averageEnergy, boolean on) {
        if (!on || p <= 0 || others < 3 || ownEnergy < CROWD_RULE_ENERGY || targetEnergy <= FINISHER_ENERGY
            || Double.isNaN(averageEnergy)) {
            return p;
        }
        double q;
        if (ownEnergy >= averageEnergy) {
            if (others < 4) return p;
            q = distance > AVG_FAR ? AVG_WEAK_POWER : MAX_POWER;
        } else {
            if (distance <= AVG_FAR_WEAK) return p;
            q = AVG_WEAK_POWER;
        }
        q = Math.min(q, killPower(targetEnergy));
        if (ownEnergy > targetEnergy) q = Math.min(q, ownEnergy - targetEnergy);
        q = Math.max(q, MIN_POWER);
        return Math.min(q, ownEnergy);
    }

    static double crowdPower(double tablePower, double distance, double nearest, double ownEnergy,
                             double targetEnergy, int others, boolean scal) {
        if (scal && tablePower > 0 && others >= 2 && targetEnergy > FINISHER_ENERGY) {
            return scalPower(nearest, ownEnergy, targetEnergy);
        }
        return crowdPower(tablePower, distance, ownEnergy, targetEnergy, others);
    }

    /**
     * MGUN-22: {@link #SCAL_REACH}/{@code nearest}, capped at own energy/{@link #SCAL_SHARE}, at
     * own energy/{@link #SCAL_FAR_SHARE} beyond {@link #SCAL_FAR} px, at what kills the target and
     * {@link #SCAL_RESERVE} short of Hadur's own energy and at the lead over the target, as the table
     * is (a lead under the lightest shot holds, 0); 0.1 to 3.
     */
    static double scalPower(double nearest, double ownEnergy, double targetEnergy) {
        double p = SCAL_REACH / Math.max(1, nearest);
        if (nearest > SCAL_FAR) p = Math.min(p, ownEnergy / SCAL_FAR_SHARE);
        p = Math.min(p, ownEnergy / SCAL_SHARE);
        p = Math.min(p, killPower(targetEnergy));
        p = Math.min(p, ownEnergy - SCAL_RESERVE);
        if (ownEnergy > targetEnergy) {
            double lead = ownEnergy - targetEnergy;
            if (lead < MIN_POWER) return 0;
            p = Math.min(p, lead);
        }
        return Math.max(MIN_POWER, Math.min(MAX_POWER, p));
    }

    /** The duel gun's 1v1 table, mirrored here: melee code does not reach into the duel. */
    static double duelPower(double distance, double ownEnergy, double targetEnergy) {
        double p = distance < 150 ? 2.95 : 1.95;
        if (distance > 325) {
            double powerDownPoint = Math.max(35.0, Math.min(63.0, 63.0 + (targetEnergy - ownEnergy) * 4.0));
            if (ownEnergy < powerDownPoint) p = Math.min(p, Math.pow(ownEnergy / powerDownPoint, 3) * 1.95);
        }
        return p;
    }

    /**
     * The least power whose damage finishes a robot with {@code energy} left: e/4 below
     * power 1, else (e + 2)/6, with a hair more so rounding cannot leave it alive.
     */
    public static double killPower(double energy) {
        double p = energy <= 4.0 ? energy / 4.0 : (energy + 2.0) / 6.0;
        return Math.max(MIN_POWER, p + 0.01);
    }
}
