package hadur2.core.melee;

import java.awt.geom.Point2D;
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
        AGGRESSIVE
    }

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
        List<EnemyInfo> alive = tracker.alive();
        if (alive.isEmpty()) return Plan.normal();

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
}
