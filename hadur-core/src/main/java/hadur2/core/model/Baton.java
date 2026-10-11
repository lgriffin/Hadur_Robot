package hadur2.core.model;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * What one role hands the next when it stops driving mid-round (A2, MMEM-2): the shots it
 * saw the robots left alive fire, each with how far it had flown when the baton was made, and
 * Hadur's own path while it drove. The Melee seam fills it from the melee brain and the Duel
 * reads it, so neither brain imports the other.
 *
 * <p>The path is the giving role's own log, not a copy: the baton is made and taken inside
 * one scan, before anything else can write to it.</p>
 */
public final class Baton {

    /** One shot the giving role saw fired. */
    public static final class Shot {
        /** The robot that fired it. */
        public final String shooter;
        /** Where it was fired from, in field px. */
        public final Point2D.Double source;
        /** The tick it was fired on. */
        public final long fireTime;
        /** Its power. */
        public final double power;
        /** How far it had flown, in px, on the tick the baton was made. */
        public final double travelled;

        public Shot(String shooter, Point2D.Double source, long fireTime, double power, double travelled) {
            this.shooter = shooter;
            this.source = source;
            this.fireTime = fireTime;
            this.power = power;
            this.travelled = travelled;
        }
    }

    /** A baton with nothing in it. */
    public static final Baton EMPTY = new Baton(Collections.emptyList(), null);

    private final List<Shot> shots;
    private final RobotStateLog path;

    /**
     * @param shots the shots seen, in the order the giving role keeps them
     * @param path Hadur's path while the giving role drove, or null for none
     */
    public Baton(List<Shot> shots, RobotStateLog path) {
        this.shots = Collections.unmodifiableList(new ArrayList<>(shots));
        this.path = path;
    }

    /** The shots seen, oldest first as the giver keeps them. */
    public List<Shot> shots() {
        return shots;
    }

    /** Hadur's path while the giving role drove; null for none. */
    public RobotStateLog path() {
        return path;
    }
}
