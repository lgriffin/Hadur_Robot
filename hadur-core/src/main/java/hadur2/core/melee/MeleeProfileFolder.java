package hadur2.core.melee;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * One round's melee observations of each opponent, waiting to join its
 * {@link MeleeProfile} when the round ends (MMEM-1). The {@link MeleeController} feeds it
 * from the events it already handles: every shot the tracker infers from an energy drop
 * (MSENSE-2), with its power; every hit on Hadur, credited to the shooter and classed
 * head-on or leading when Hadur's path at the fire time is known; every scan within
 * {@link #CLOSE_RANGE}, and those within {@link #RAM_RANGE}, where a robot is about to ram;
 * and the order opponents die in.
 *
 * <p>At the round's end the orchestrator folds each opponent's round into its block.
 * Its finishing place counts the opponents only: with {@code n} opponents the first to die
 * places {@code n}, the next {@code n - 1}, and any still alive when the round ends for Hadur
 * place 1. The buffer is cleared at each round's start and holds at most
 * {@link #MAX_OPPONENTS} names (RES-2).</p>
 */
public final class MeleeProfileFolder {

    /** A scan this close counts toward {@link MeleeProfile#rams()}'s denominator. */
    public static final double CLOSE_RANGE = 200;
    /** A scan this close is a robot touching, or about to touch, Hadur: a ram. */
    public static final double RAM_RANGE = 60;
    static final int MAX_OPPONENTS = 64;

    /** One opponent's round so far. */
    static final class Tally {
        double shots, hits, headOnHits, linearHits, powerSum, powerShots, closeScans, ramScans;
        boolean scanned;
        /** The how-manyeth death of the round it was, from 0; -1 while alive. */
        int deathOrder = -1;
    }

    private final Map<String, Tally> round = new LinkedHashMap<>();
    private int deaths;

    public void newRound() {
        round.clear();
        deaths = 0;
    }

    private Tally tally(String name) {
        Tally t = round.get(name);
        if (t != null) return t;
        t = new Tally();
        if (round.size() < MAX_OPPONENTS) round.put(name, t);
        return t;
    }

    /** {@code name} was scanned {@code distance} from Hadur. */
    public void scanned(String name, double distance) {
        Tally t = tally(name);
        t.scanned = true;
        if (distance < CLOSE_RANGE) {
            t.closeScans++;
            if (distance < RAM_RANGE) t.ramScans++;
        }
    }

    /** The tracker inferred a shot of {@code power} from {@code shooter} (MSENSE-2). */
    public void shotInferred(String shooter, double power) {
        Tally t = tally(shooter);
        t.shots++;
        t.powerSum += power;
        t.powerShots++;
    }

    /** {@code shooter}'s bullet hit Hadur, aimed as {@code aim}, or null when unknown. */
    public void hitOnHadur(String shooter, MeleeProfile.AimClass aim) {
        Tally t = tally(shooter);
        t.hits++;
        if (aim == MeleeProfile.AimClass.HEAD_ON) t.headOnHits++;
        else if (aim == MeleeProfile.AimClass.LINEAR) t.linearHits++;
    }

    /**
     * {@code name} died. Only opponents scanned this round are placed, so a sentry, which
     * the melee never scans (GATE-5), takes no place from them.
     */
    public void died(String name) {
        Tally t = round.get(name);
        if (t != null && t.scanned && t.deathOrder < 0) t.deathOrder = deaths++;
    }

    /** Opponents scanned this round, in the order first seen: the ones with a round to fold. */
    public List<String> scannedNames() {
        List<String> names = new ArrayList<>();
        for (Map.Entry<String, Tally> e : round.entrySet()) {
            if (e.getValue().scanned) names.add(e.getKey());
        }
        return names;
    }

    /** {@code name}'s finishing place this round among {@code opponents}, or 0 if unknown. */
    public int rank(String name, int opponents) {
        Tally t = round.get(name);
        if (t == null || opponents < 1) return 0;
        if (t.deathOrder < 0) return 1;
        return Math.max(1, opponents - t.deathOrder);
    }

    /**
     * Adds {@code name}'s round to {@code into}, stamped {@code stamp}, where the battle has
     * {@code opponents} opponents. Does nothing for a name not seen this round.
     */
    public void foldInto(String name, MeleeProfile into, int opponents, long stamp) {
        Tally t = round.get(name);
        if (t == null) return;
        into.fold(stamp, t.shots, t.hits, t.headOnHits, t.linearHits, t.powerSum, t.powerShots,
            t.closeScans, t.ramScans, rank(name, opponents));
    }
}
