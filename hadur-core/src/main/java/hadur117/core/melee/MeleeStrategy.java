package hadur117.core.melee;

import hadur117.core.world.EnemyTracker;
import hadur117.core.world.EnemyInfo;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Picks Hadur's overall posture in a melee from the state of the battle.
 */
public class MeleeStrategy {

    public enum Posture {
        /** No special situation. */
        NORMAL,
        /** Two opponents are fighting each other: stay clear and wait for the survivor. */
        LET_THEM_FIGHT,
        /** Hadur leads on energy with several opponents left: don't become everyone's target. */
        LOW_PROFILE,
        /** Hadur leads on energy with two opponents left: finish the weaker one. */
        AGGRESSIVE,
        /**
         * MHIDE-1 (pc-melee-hide, off): a big crowd, or a crowd Hadur is behind in: be nobody's
         * nearest robot, shoot nobody who is not already shooting at Hadur, and wait for the field
         * to whittle down (Leigh, 2026-11-08: "We have no mechanic to try and hide and survive
         * until the field whittles down").
         */
        HIDE
    }

    /** MHIDE-1: the hide posture, off a team only. Ships off; the arm {@code mhide} turns it on. */
    public static final boolean HIDE = false;
    /** MHIDE-1: with this many opponents or more alive Hadur hides whatever its energy. */
    static final int HIDE_CROWD = 5;
    /** MHIDE-1: fewer opponents than this and Hadur never hides: the fight is on. */
    static final int HIDE_MIN = 3;

    /** The chosen posture, plus what it implies for targeting and positioning. */
    public static final class Plan {
        public final Posture posture;
        public final EnemyInfo preferredTarget;
        public final EnemyInfo[] fight;

        Plan(Posture posture, EnemyInfo preferredTarget, EnemyInfo[] fight) {
            this.posture = posture;
            this.preferredTarget = preferredTarget;
            this.fight = fight;
        }

        public static Plan normal() {
            return new Plan(Posture.NORMAL, null, null);
        }
    }

    public Plan evaluate(EnemyTracker tracker, Point2D.Double me, double myEnergy,
                         int others, long now) {
        return evaluate(tracker, me, myEnergy, others, now, false);
    }

    /**
     * As above; with {@code hide} (MHIDE-1, off a team) Hadur hides while {@link #HIDE_CROWD} or
     * more opponents are alive, or while {@link #HIDE_MIN} or more are and its energy is under the
     * living opponents' median; otherwise the postures below.
     */
    public Plan evaluate(EnemyTracker tracker, Point2D.Double me, double myEnergy,
                         int others, long now, boolean hide) {
        List<EnemyInfo> alive = tracker.alive();
        if (alive.isEmpty()) return Plan.normal();
        if (hide && shouldHide(myEnergy, others, alive)) return new Plan(Posture.HIDE, null, null);

        EnemyInfo weakest = null;
        boolean strongest = true;
        for (EnemyInfo e : alive) {
            if (weakest == null || e.energy < weakest.energy) weakest = e;
            if (e.energy >= myEnergy) strongest = false;
        }

        if (others == 2 && strongest) {
            return new Plan(Posture.AGGRESSIVE, weakest, null);
        }

        List<EnemyInfo[]> fights = tracker.engagedPairs(me, now);
        if (!fights.isEmpty()) {
            EnemyInfo[] fight = fights.get(0);
            EnemyInfo weaker = fight[0].energy <= fight[1].energy ? fight[0] : fight[1];
            return new Plan(Posture.LET_THEM_FIGHT, weaker, fight);
        }

        if (others >= 3 && strongest) {
            return new Plan(Posture.LOW_PROFILE, null, null);
        }
        return Plan.normal();
    }

    /** MHIDE-1: whether a crowd of {@code others} with these {@code alive} opponents calls for hiding. */
    static boolean shouldHide(double myEnergy, int others, List<EnemyInfo> alive) {
        if (others >= HIDE_CROWD) return true;
        if (others < HIDE_MIN) return false;
        List<Double> es = new ArrayList<>(alive.size());
        for (EnemyInfo e : alive) es.add(e.energy);
        Collections.sort(es);
        int n = es.size();
        double median = n % 2 == 1 ? es.get(n / 2) : (es.get(n / 2 - 1) + es.get(n / 2)) / 2;
        return myEnergy < median;
    }

    /**
     * MHIDE-3: whether Hadur at {@code me} is {@code target}'s nearest living robot among
     * {@code alive}: the one it is likeliest to be shooting at already.
     */
    public static boolean nearestIs(Point2D.Double me, EnemyInfo target, List<EnemyInfo> alive) {
        double mine = me.distance(target.location);
        for (EnemyInfo o : alive) {
            if (o != target && o.location.distance(target.location) < mine) return false;
        }
        return true;
    }
}
