package hadur117.mini.ref;

import hadur117.mini.ReplayBody;
import robocode.Bullet;
import robocode.Condition;

/** The readable JayLexi on a Replay body. */
public class ReplayBot extends JayLexi {
    final ReplayBody b;

    public ReplayBot(ReplayBody b) {
        this.b = b;
    }

    @Override public double getX() { return b.x; }
    @Override public double getY() { return b.y; }
    @Override public double getHeadingRadians() { return b.heading; }
    @Override public double getVelocity() { return b.velocity; }
    @Override public double getGunHeadingRadians() { return b.gunHeading; }
    @Override public double getEnergy() { return b.energy; }
    @Override public double getGunTurnRemaining() { return b.gunTurnRemaining; }
    @Override public double getRadarHeadingRadians() { return b.radarHeading; }
    @Override public void setTurnRightRadians(double v) { b.turn(v); }
    @Override public void setAhead(double v) { b.ahead(v); }
    @Override public void setTurnGunRightRadians(double v) { b.gun(v); }
    @Override public void setTurnRadarRightRadians(double v) { b.radar(v); }
    @Override public Bullet setFireBullet(double p) { return b.fire(p); }
    @Override public void addCustomEvent(Condition c) { b.add(c); }
    @Override public void removeCustomEvent(Condition c) { b.remove(c); }

    /** The readable JayLexi with the second wave at a third, to show the replay sees a play change. */
    public static class Third extends ReplayBot {
        public Third(ReplayBody b) {
            super(b);
        }

        @Override
        double both(double dir) {
            double r = danger(waves.get(0), dir);
            try {
                r += danger(waves.get(1), dir) / 3;
            } catch (Exception ex) {
            }
            return r;
        }
    }

    /** The readable JayLexi with 0.9's four surf distance bands, to show the 1.0 rule plays. */
    public static class Bands extends ReplayBot {
        public Bands(ReplayBody b) {
            super(b);
            bands = true;
        }
    }

    /** The readable JayLexi with 0.8's prediction counted from tick 3, to show the 0.9 rule plays. */
    public static class Lead3 extends ReplayBot {
        public Lead3(ReplayBody b) {
            super(b);
            lead = 3;
        }
    }

    /** The readable JayLexi with 1.0's flat 3 degree fire gate, to show the 1.1 gate plays. */
    public static class Gate3 extends ReplayBot {
        public Gate3(ReplayBody b) {
            super(b);
            flatGate = true;
        }
    }

    /** The readable JayLexi with 1.1's power against every robot, to show the 1.2 power rows play. */
    public static class Power2 extends ReplayBot {
        public Power2(ReplayBody b) {
            super(b);
            noFar = true;
        }
    }

    /** The readable JayLexi with 1.2's hit logging, which lost the hits on a just-dropped wave. */
    public static class Log12 extends ReplayBot {
        public Log12(ReplayBody b) {
            super(b);
            noGone = true;
        }
    }
}
