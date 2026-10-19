package lab;

/**
 * Symbolic pattern matcher on (velocity, heading change). Each tick's symbol is the enemy's
 * velocity rounded to a whole number and its heading change in 0.02 rad steps. The longest match of
 * the recent past in the history (a round break stops a match) picks the point from which the
 * recorded moves are replayed, bullet-flight tick by tick, to find where the enemy will be.
 */
public class PatternMatch extends LabBase {
    static final int MAX_MATCH = 40, MIN_MATCH = 2, CAP = 60000;
    static final int[] SYM = new int[CAP];
    static final double[] VEL = new double[CAP], TURN = new double[CAP];
    static int n;

    protected void roundStart() {
        if (n < CAP) SYM[n++] = -1;
    }

    protected void observe() {
        if (n >= CAP) return;
        int v = (int) Math.round(eVelocity) + 8;
        int t = (int) Math.round(Math.max(-0.2, Math.min(0.2, eTurn)) / 0.02) + 10;
        SYM[n] = v * 32 + t;
        VEL[n] = eVelocity;
        TURN[n] = eTurn;
        n++;
    }

    protected double aim() {
        int bestLen = 0, bestEnd = -1;
        int last = n - 1;
        for (int end = last - 1; end >= 0; end--) {
            if (SYM[end] != SYM[last]) continue;
            int len = 1;
            while (len < MAX_MATCH && end - len >= 0 && SYM[end - len] == SYM[last - len] && SYM[end - len] >= 0) len++;
            if (len > bestLen) { bestLen = len; bestEnd = end; }
            if (bestLen == MAX_MATCH) break;
        }
        if (bestLen < MIN_MATCH) return lead(eTurn);
        double x = eX, y = eY, h = eHeading;
        for (int k = 1; k <= 200; k++) {
            int i = bestEnd + k;
            if (i >= n || SYM[i] < 0) return Math.atan2(x - myX, y - myY);
            h += TURN[i];
            x = clipX(x + Math.sin(h) * VEL[i]);
            y = clipY(y + Math.cos(h) * VEL[i]);
            if (Math.hypot(x - myX, y - myY) <= k * SPEED) return Math.atan2(x - myX, y - myY);
        }
        return absBearing;
    }
}
