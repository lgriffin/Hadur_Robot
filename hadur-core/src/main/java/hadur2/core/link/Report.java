package hadur2.core.link;

import java.util.List;
import java.util.Objects;

/**
 * One member's report for one tick (LINK-4): its own state, what its radar saw fresh, the
 * deaths it knows of this round and the bullets it fired. A report states the tick it was
 * built on; the engine delivers it on the next. Positions are px, angles radians (0 = north,
 * clockwise), as everywhere in the core.
 */
public final class Report {

    /** Where a robot stood when one of us scanned it, and when. */
    public static final class Sighting {
        public final String name;
        public final long tick;
        public final double x;
        public final double y;
        public final double heading;
        public final double velocity;
        public final double energy;

        public Sighting(String name, long tick, double x, double y, double heading, double velocity,
                        double energy) {
            this.name = Objects.requireNonNull(name);
            this.tick = tick;
            this.x = x;
            this.y = y;
            this.heading = heading;
            this.velocity = velocity;
            this.energy = energy;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Sighting)) return false;
            Sighting s = (Sighting) o;
            return name.equals(s.name) && tick == s.tick && Double.compare(x, s.x) == 0
                && Double.compare(y, s.y) == 0 && Double.compare(heading, s.heading) == 0
                && Double.compare(velocity, s.velocity) == 0 && Double.compare(energy, s.energy) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, tick, x, y, heading, velocity, energy);
        }

        @Override
        public String toString() {
            return "Sighting[" + name + "@" + tick + " " + x + "," + y + "]";
        }
    }

    /** A bullet the member fired: from where, on which heading, at what power and when. */
    public static final class Shot {
        public final long tick;
        public final double x;
        public final double y;
        public final double heading;
        public final double power;

        public Shot(long tick, double x, double y, double heading, double power) {
            this.tick = tick;
            this.x = x;
            this.y = y;
            this.heading = heading;
            this.power = power;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Shot)) return false;
            Shot s = (Shot) o;
            return tick == s.tick && Double.compare(x, s.x) == 0 && Double.compare(y, s.y) == 0
                && Double.compare(heading, s.heading) == 0 && Double.compare(power, s.power) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(tick, x, y, heading, power);
        }

        @Override
        public String toString() {
            return "Shot[" + tick + " " + power + "]";
        }
    }

    private final int round;
    private final long tick;
    private final double x;
    private final double y;
    private final double heading;
    private final double velocity;
    private final double energy;
    private final List<Sighting> sightings;
    private final List<String> deaths;
    private final List<Shot> shots;

    /**
     * @param round the round, from 0
     * @param tick the tick the report was built on
     * @param x the member's x
     * @param y the member's y
     * @param heading the member's body heading
     * @param velocity the member's velocity
     * @param energy the member's energy
     * @param sightings robots it scanned fresh
     * @param deaths every robot it knows died this round
     * @param shots the bullets it fired on that tick
     */
    public Report(int round, long tick, double x, double y, double heading, double velocity, double energy,
                  List<Sighting> sightings, List<String> deaths, List<Shot> shots) {
        this.round = round;
        this.tick = tick;
        this.x = x;
        this.y = y;
        this.heading = heading;
        this.velocity = velocity;
        this.energy = energy;
        this.sightings = List.copyOf(sightings);
        this.deaths = List.copyOf(deaths);
        this.shots = List.copyOf(shots);
    }

    public int round() {
        return round;
    }

    public long tick() {
        return tick;
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public double heading() {
        return heading;
    }

    public double velocity() {
        return velocity;
    }

    public double energy() {
        return energy;
    }

    public List<Sighting> sightings() {
        return sightings;
    }

    public List<String> deaths() {
        return deaths;
    }

    public List<Shot> shots() {
        return shots;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Report)) return false;
        Report r = (Report) o;
        return round == r.round && tick == r.tick && Double.compare(x, r.x) == 0
            && Double.compare(y, r.y) == 0 && Double.compare(heading, r.heading) == 0
            && Double.compare(velocity, r.velocity) == 0 && Double.compare(energy, r.energy) == 0
            && sightings.equals(r.sightings) && deaths.equals(r.deaths) && shots.equals(r.shots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(round, tick, x, y, heading, velocity, energy, sightings, deaths, shots);
    }

    @Override
    public String toString() {
        return "Report[round=" + round + ", tick=" + tick + ", sightings=" + sightings.size()
            + ", deaths=" + deaths + ", shots=" + shots.size() + "]";
    }
}
