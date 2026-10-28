package hadur117.micro.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import net.jqwik.api.Example;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.IntRange;
import robocode.Rules;
import robocode.util.Utils;

class TargetingTest {

    static char[][] emptyTable() {
        return new char[Targeting.STATES][Targeting.ROW + 1];
    }

    /** Where a target that keeps its state's speed and turn is when a bullet reaches it, as a bin. */
    static int circularBin(int state, double x, double y, double bearing, double distance, double heading, double power) {
        double px = x + Math.sin(bearing) * distance;
        double py = y + Math.cos(bearing) * distance;
        double v = ((state >> 2) & 31) - 8;
        double turn = ((state >> 7) - 2) * Rules.getTurnRateRadians(v) / 2;
        double h = heading;
        int ticks = 1;
        do {
            h += turn;
            px += Math.sin(h) * v;
            py += Math.cos(h) * v;
        } while (++ticks * Rules.getBulletSpeed(power) < Math.hypot(px - x, py - y));
        return (int) (Math.atan2(px - x, py - y) * (Targeting.BINS / 2 / Math.PI)) & (Targeting.BINS - 1);
    }

    @Property
    void normalRelativeAngleIsTheEnginesToTheBit(@ForAll double angle) {
        assertEquals(Double.doubleToLongBits(Utils.normalRelativeAngle(angle)),
            Double.doubleToLongBits(Targeting.normalRelativeAngle(angle)), "at " + angle);
    }

    @Example
    void normalRelativeAngleAgreesAtTheSeams() {
        for (double a : new double[] {Math.PI, -Math.PI, 2 * Math.PI, -2 * Math.PI, 3 * Math.PI, 0.0, -0.0}) {
            assertEquals(Utils.normalRelativeAngle(a), Targeting.normalRelativeAngle(a), "at " + a);
        }
    }

    @Property
    void turnRateIsTheEngines(@ForAll @DoubleRange(min = -8, max = 8) double v) {
        assertEquals(Rules.getTurnRateRadians(v), Targeting.turnRate(v));
    }

    @Property
    @Tag("SAOR-7")
    void everyLegalScanPacksIntoTheTable(@ForAll @DoubleRange(min = -8, max = 8) double lastV,
            @ForAll @DoubleRange(min = -2, max = 1) double dv, @ForAll @DoubleRange(min = -1, max = 1) double turn,
            @ForAll @DoubleRange(min = -10, max = 10) double heading) {
        double v = Math.max(-8, Math.min(8, lastV + dv));
        double rate = Rules.getTurnRateRadians(lastV) * turn * 0.999;
        int s = Targeting.state(v, lastV, heading, heading + rate);
        assertTrue(s >= 0 && s < Targeting.STATES, "state " + s);
        assertEquals((int) (8.5 + v), (s >> 2) & 31, "speed index");
        assertTrue((s >> 7) <= 4, "turn index");
    }

    @Property
    @Tag("SAOR-6")
    void anEmptyRowAimsByCircularProjection(@ForAll @IntRange(min = 0, max = 16) int speed,
            @ForAll @IntRange(min = 0, max = 4) int turn,
            @ForAll @DoubleRange(min = 0, max = 6.28) double bearing, @ForAll @DoubleRange(min = 100, max = 700) double distance,
            @ForAll @DoubleRange(min = 0, max = 6.28) double heading, @ForAll @DoubleRange(min = 0.1, max = 3) double power) {
        int state = 1 + (speed << 2) + (turn << 7);
        // No sample in the state's row: the state is held.
        char[][] table = emptyTable();
        int bin = Targeting.aim(table, state, 500, 500, bearing, distance, heading, speed - 8, power);
        assertEquals(circularBin(state, 500, 500, bearing, distance, heading, power), bin);
    }

    @Property
    @Tag("SAOR-7")
    void aRowWithASampleIsPlayedOut(@ForAll @IntRange(min = 1, max = 126) int samples,
            @ForAll @DoubleRange(min = 0, max = 6.28) double bearing, @ForAll @DoubleRange(min = 150, max = 600) double distance,
            @ForAll @DoubleRange(min = 0, max = 6.28) double heading, @ForAll @DoubleRange(min = 0.1, max = 3) double power) {
        int moving = 1 + (16 << 2) + (2 << 7);     // full speed, straight
        int stopped = 1 + (8 << 2) + (2 << 7);     // speed 0
        char[][] table = emptyTable();
        // The target is moving now but every recorded successor is a stop.
        Arrays.fill(table[moving], 0, samples, (char) stopped);
        table[moving][Targeting.ROW] = (char) samples;
        int bin = Targeting.aim(table, moving, 500, 500, bearing, distance, heading, 8, power);
        // One step at the stopped state's speed 0: the target stays where it was scanned.
        assertEquals(circularBin(stopped, 500, 500, bearing, distance, heading, power), bin);
    }

    @Example
    @Tag("SAOR-7")
    void aThinRowVotesLessThanAWarmOne() {
        int moving = 1 + (16 << 2) + (2 << 7);     // full speed, straight
        int stopped = 1 + (8 << 2) + (2 << 7);     // speed 0
        int thin = 0 + (16 << 2) + (2 << 7);       // full speed, decelerating flag: its own row
        char[][] table = emptyTable();
        // Two of three successors lead to a stop through a row of one sample; one keeps moving
        // through a warm row. Unweighted, the stop would win most aims.
        for (int i = 0; i < 126; i++) table[moving][i] = (char) (i % 3 == 0 ? thin : stopped);
        table[moving][Targeting.ROW] = 126;
        table[stopped][0] = (char) stopped;
        table[stopped][Targeting.ROW] = 1;
        Arrays.fill(table[thin], 0, 8, (char) thin);
        table[thin][Targeting.ROW] = 8;
        double bearing = 0;
        double heading = Math.PI / 2;
        int stopBin = circularBin(stopped, 500, 500, bearing, 300, heading, 2);
        int stopVotes = 0;
        for (int trial = 0; trial < 20; trial++) {
            int bin = Targeting.aim(table, moving, 500, 500, bearing, 300, heading, 8, 2);
            if (Math.abs(bin - stopBin) <= 4) stopVotes++;
        }
        // A one-sample row votes 17 against the warm row's 100, so the moving target wins.
        assertTrue(stopVotes <= 1, "the thin stop won " + stopVotes + " of 20 aims");
        assertEquals(17, 1 * Targeting.TRUST + Targeting.HELD_WEIGHT);
        assertEquals(89, 7 * Targeting.TRUST + Targeting.HELD_WEIGHT);
    }

    @Example
    @Tag("SAOR-7")
    void aFullRowTakesFigmentsQuirk() {
        char[] row = new char[Targeting.ROW + 1];
        for (int i = 0; i < Targeting.ROW; i++) Targeting.record(row, 7);
        assertEquals(Targeting.ROW, row[Targeting.ROW]);
        // The 127th sample lands on the count itself, as in Figment: the count becomes that state.
        Targeting.record(row, 300);
        assertEquals(300, row[Targeting.ROW]);
        // A count past the row then throws, and the adapter's catch absorbs it; the count runs on.
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Targeting.record(row, 9));
        assertEquals(301, row[Targeting.ROW]);
        for (int i = 0; i < Targeting.ROW; i++) assertEquals(7, row[i]);
    }

    @Example
    @Tag("SAOR-7")
    void opponentsShareATableOnlyWhenTheirHashesMatchInNineBits() {
        char[][][] tables = new char[Targeting.OPPONENTS][1][1];
        assertTrue(Targeting.table(tables, "m.Mike 1.0".hashCode()) != Targeting.table(tables, ("m.Mike 1.0".hashCode() & 255)));
        assertTrue(Targeting.table(tables, 3) == Targeting.table(tables, 3 + 512));
    }

    @Property
    void theAngleOfABinIsItsHeading(@ForAll @IntRange(min = 0, max = 1023) int bin) {
        assertEquals(bin * 2 * Math.PI / Targeting.BINS, Targeting.angle(bin), 1e-12);
    }
}
