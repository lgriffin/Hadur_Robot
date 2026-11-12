package hadur117.core.melee;

import hadur117.core.model.RobotState;
import hadur117.core.model.RobotStateLog;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.DiaUtils;
import hadur117.core.world.EnemyInfo;
import hadur117.core.world.EnemyShot;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * TMODE-27, Ogi's dodge as one piece: the team movement that replaces the virtual bullets of
 * MMOVE-3 and every switch laid on them (SOFT, LEARN, POOL, WAVES) while it plays.
 *
 * <ol>
 * <li><b>Who it was for.</b> A detected shot counts for Hadur by 1/(1+k)^2 for the k
 *     teammates nearer its source (TMODE-2), or by MMOVE-9's nearest rule where the table
 *     says the team shoots its closest enemy (TMODE-20).</li>
 * <li><b>Where it went.</b> When a shot is first seen it is turned once into a profile: each
 *     of {@link AimExperts}' simple aims at Hadur's state when it was fired, and the team's
 *     learned aims pooled by class, each carrying its expert's weight against that enemy
 *     class. Profiles are made once a shot, never per candidate, which is what kept the
 *     learned aims (LEARN with WAVES) from costing skipped turns.</li>
 * <li><b>Where to go.</b> The base risk ranks the candidates without any bullet in it
 *     the {@link #RERANK} safest and the held destination are each
 *     driven to for 30 ticks through every profile and, for 15, through the teammates' bullets
 *     (TMODE-25), and the score is Ogi's {@code risk/median + 3 x damage/median}.</li>
 * </ol>
 *
 * <p>Team-only, like every mode, except that MMOVE-30 ({@link MinimumRiskMovement#MELEE_DODGE})
 * drives the same profiles off a team, each shot weighed by the crowd.</p>
 */
final class TeamDodge {

    /**
     * TMODE-29, on since TMODE-30 (ablation tmnoof turns it off): our own fire as PATH weighs it. The base ranking keeps
     * MATEFIRE's teammate-bullet risk, and the teammates' bullets crossed on each drive add to
     * the risk at {@link TeamRisk#PATH_K} rather than to the median-scaled damage.
     */
    static final boolean OWN_FIRE = true;
    /** Candidates driven through the waves: more than WAVES' 8, since the base ranking no longer sees bullets. */
    static final int RERANK = 12;
    /** Past this, px, beyond Hadur a wave is gone. */
    static final double GONE = 100;

    private final BattleField field;
    private final AimExperts experts = new AimExperts();
    /**
     * Each shot's profile, made the tick it was first seen; null for a shot meant for others.
     * In the order first seen (EnemyShot keeps identity equality), so the waves are summed in
     * the same order every run (CORE-2).
     */
    private final Map<EnemyShot, MinimumRiskMovement.Wave> profiles = new LinkedHashMap<>();
    /** TMODE-46: each shooter's latest shot seen this round. */
    private final Map<String, EnemyShot> latest = new java.util.HashMap<>();

    TeamDodge(BattleField field) {
        this.field = field;
    }

    AimExperts experts() {
        return experts;
    }

    void newRound() {
        profiles.clear();
        latest.clear();
    }

    /**
     * TMODE-46: the tick {@code shooter}'s gun is next cool, from its latest shot seen this
     * round (heat 1 + power/5 cooling 0.1 a tick); a shooter not seen firing is cool now.
     */
    long readyAt(String shooter) {
        EnemyShot s = latest.get(shooter);
        if (s == null) return Long.MIN_VALUE;
        return s.fireTime + (long) Math.ceil(10 * (1 + s.power / 5));
    }

    /**
     * Profiles the shots not seen before and drops those gone past Hadur: {@code mates} where
     * the teammates stand, {@code own} for the nearest rule, {@code only} the one aim a team
     * whose code is read takes (or null).
     */
    void update(List<EnemyShot> shots, RobotStateLog path, Point2D.Double me, long now,
                List<Point2D.Double> mates, TeamDanger danger, boolean own, VirtualBullet.Aim only) {
        update(shots, me, now, s -> {
            MinimumRiskMovement.Wave w = profile(s, path, me, mates, danger, own, only);
            // TMODE-46: where Hadur stood when the shot was fired, for the going-back term.
            RobotState at = w == null ? null : path.getState(s.fireTime);
            if (at != null) w.target = at.location;
            return w;
        });
    }

    /**
     * MMOVE-30, off a team: profiles the shots not seen before, each weighed by the melee
     * surfer's {@link MinimumRiskMovement#crowdWeight} where Hadur stood when it was fired, and
     * drops those gone past Hadur.
     */
    void updateMelee(List<EnemyShot> shots, RobotStateLog path, Point2D.Double me, long now,
                     List<EnemyInfo> enemies, TeamDanger danger) {
        update(shots, me, now, s -> {
            RobotState at = at(path, s);
            Point2D.Double target = at == null ? me : at.location;
            return profile(s, at, target, MinimumRiskMovement.crowdWeight(s, target, enemies), path, danger, null);
        });
    }

    private void update(List<EnemyShot> shots, Point2D.Double me, long now,
                        Function<EnemyShot, MinimumRiskMovement.Wave> maker) {
        IdentityHashMap<EnemyShot, Boolean> live = new IdentityHashMap<>();
        for (EnemyShot s : shots) {
            live.put(s, Boolean.TRUE);
            EnemyShot last = latest.get(s.shooter);
            if (last == null || s.fireTime > last.fireTime) latest.put(s.shooter, s);
            if (profiles.containsKey(s)) continue;
            profiles.put(s, maker.apply(s));
        }
        for (Iterator<Map.Entry<EnemyShot, MinimumRiskMovement.Wave>> it = profiles.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<EnemyShot, MinimumRiskMovement.Wave> e = it.next();
            EnemyShot s = e.getKey();
            if (!live.containsKey(s)
                    || Math.max(0, now - (s.fireTime + s.window)) * s.speed() > s.source.distance(me) + GONE) {
                it.remove();
            }
        }
    }

    private static RobotState at(RobotStateLog path, EnemyShot s) {
        RobotState at = path.getState(s.fireTime);
        return at == null ? path.getState(s.fireTime + 1) : at;
    }

    /** The waves in flight that may still reach Hadur. */
    List<MinimumRiskMovement.Wave> waves() {
        List<MinimumRiskMovement.Wave> out = new ArrayList<>(profiles.size());
        for (MinimumRiskMovement.Wave w : profiles.values()) if (w != null) out.add(w);
        return out;
    }

    MinimumRiskMovement.Wave profile(EnemyShot s, RobotStateLog path, Point2D.Double me,
                                     List<Point2D.Double> mates, TeamDanger danger,
                                     boolean own, VirtualBullet.Aim only) {
        RobotState at = at(path, s);
        Point2D.Double target = at == null ? me : at.location;
        double aimed = own ? (TeamDanger.aimedAtMe(s, target, mates) ? 1.0 : 0.0)
            : TeamRisk.softWeight(s, target, mates);
        return profile(s, at, target, aimed, path, danger, only);
    }

    /** The profile of {@code s}, aimed at Hadur in state {@code at} (or null) by the share {@code aimed}; null under the floor. */
    MinimumRiskMovement.Wave profile(EnemyShot s, RobotState at, Point2D.Double target, double aimed,
                                     RobotStateLog path, TeamDanger danger, VirtualBullet.Aim only) {
        if (aimed < MinimumRiskMovement.SOFT_FLOOR) return null;
        double hot = DiaUtils.absoluteBearing(s.source, target);
        if (at == null) return new MinimumRiskMovement.Wave(s, aimed, new double[] {hot}, new double[] {1.0}, hot);
        double[] h = AimExperts.headings(s, at, path, field);
        if (only != null) {
            double one = only == VirtualBullet.Aim.HEAD_ON ? h[AimExperts.Expert.HEAD_ON.ordinal()]
                : h[AimExperts.Expert.LINEAR.ordinal()];
            return new MinimumRiskMovement.Wave(s, aimed, new double[] {one}, new double[] {1.0}, hot);
        }
        List<TeamDanger.Aim> learned = danger.aims(s, at);
        boolean[] available = new boolean[AimExperts.COUNT];
        for (int e = 0; e < AimExperts.COUNT; e++) available[e] = !Double.isNaN(h[e]);
        int li = AimExperts.Expert.LEARNED.ordinal();
        available[li] = learned != null && !learned.isEmpty();
        double[] w = experts.weights(s.shooter, available);
        int n = 0;
        for (int e = 0; e < AimExperts.COUNT; e++) if (e != li && available[e]) n++;
        int size = n + (available[li] ? learned.size() : 0);
        double[] headings = new double[size];
        double[] shares = new double[size];
        int k = 0;
        for (int e = 0; e < AimExperts.COUNT; e++) {
            if (e == li || !available[e]) continue;
            headings[k] = h[e];
            shares[k++] = w[e];
        }
        if (available[li]) {
            double total = 0;
            for (TeamDanger.Aim a : learned) total += a.weight;
            for (TeamDanger.Aim a : learned) {
                headings[k] = a.heading;
                shares[k++] = w[li] * (total > 0 ? a.weight / total : 1.0 / learned.size());
            }
        }
        return new MinimumRiskMovement.Wave(s, aimed, headings, shares, hot);
    }
}
