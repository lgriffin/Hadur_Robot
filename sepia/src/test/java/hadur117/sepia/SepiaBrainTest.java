package hadur117.sepia;

import static hadur117.sepia.Fixtures.p;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.RobotState;
import hadur117.core.physics.Angles;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.MovementPredictor;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SepiaBrainTest {

    /** What a scripted duel produced: orders fired and records written. */
    static final class Run {
        int inks, punches, ticksWithShot;
        final List<String> records = new ArrayList<>();
    }

    /**
     * A still enemy at (400, 520) fires power 2 every 20 ticks from tick 30; Sepia starts at (400, 100) and moves by
     * the engine's rules as its orders say.
     */
    static Run duel(SepiaBrain.Fire fire, int ticks) {
        SepiaBrain brain = new SepiaBrain(Gait.Kind.JET, fire, 800, 600, "enemy");
        brain.newRound(0);
        MovementPredictor mp = new MovementPredictor(new BattleField(800, 600));
        RobotState me = Fixtures.state(400, 100, Math.PI / 2, 0, 0);
        double gun = 0, heat = 3.0, energy = 100, enemyEnergy = 100;
        Run run = new Run();
        for (long t = 0; t < ticks; t++) {
            if (t >= 30 && (t - 30) % 20 == 1) enemyEnergy -= 2.0;  // fired on the tick before
            brain.scan(400, 520, 0, 0, enemyEnergy);
            SepiaBrain.Orders o = brain.tick(t, me.location.x, me.location.y, me.heading, me.velocity, energy, gun, heat, 0);
            run.records.addAll(brain.drainRecords());
            heat = Math.max(0, Math.round((heat - 0.1) * 1e9) / 1e9);
            if (o.firePower > 0) {
                if (o.firePower <= 0.1 + 1e-9) run.inks++;
                else run.punches++;
                heat = 1 + o.firePower / 5 - 0.1;
                energy -= o.firePower;
            }
            double turn = Math.max(-Math.toRadians(20), Math.min(Math.toRadians(20), o.gunTurn));
            gun = Angles.normalAbsoluteAngle(gun + turn);
            me = mp.predict(me, o.ahead, o.turn, o.maxVelocity, 1, false);
        }
        return run;
    }

    @Test
    @Tag("SEPIA-2")
    @Tag("INK-6")
    @DisplayName("the silent build with ink fires only ink, and writes one INK record per wave")
    void inkOnly() {
        Run r = duel(SepiaBrain.Fire.INK_ONLY, 400);
        assertTrue(r.inks > 3, "inks " + r.inks);
        assertEquals(0, r.punches);
        assertTrue(r.records.size() >= 15, "records " + r.records.size());
        String rec = r.records.get(0);
        for (String field : new String[] {"width=", "shaded=", "inks=", "met=", "hit=", "option="}) {
            assertTrue(rec.contains(field), rec);
        }
        assertTrue(r.records.stream().anyMatch(s -> !s.contains("inks=0")), "some wave was inked");
    }

    @Test
    @Tag("SEPIA-2")
    @DisplayName("the build with the ink off never fires; the full build punches")
    void arms() {
        Run none = duel(SepiaBrain.Fire.NONE, 300);
        assertEquals(0, none.inks + none.punches);
        Run full = duel(SepiaBrain.Fire.FULL, 300);
        assertTrue(full.punches > 0, "punches " + full.punches);
    }

    @Test
    @Tag("STRIKE-1")
    @Tag("STRIKE-3")
    @DisplayName("ink against a punch per tick of reload; with nothing in the air, or a spent enemy, a punch")
    void inkOrPunch() {
        SepiaBrain b = new SepiaBrain(Gait.Kind.JET, SepiaBrain.Fire.FULL, 800, 600, "enemy");
        b.newRound(0);
        InkPlanner.Shot big = new InkPlanner.Shot(0, 0.5, 6.0, new double[] {0.5});
        InkPlanner.Shot small = new InkPlanner.Shot(0, 0.02, 0.2, new double[] {0.02});
        assertFalse(b.inkWorthMore(big, 1.95, 100), "no wave in the air");
        b.waves().add(Fixtures.land(Fixtures.wave(p(400, 500), p(400, 100), 0, 2.0), p(520, 100)));
        assertTrue(b.inkWorthMore(big, 1.95, 100));
        // At the prior's 12% hit rate a power-1.95 punch is under break-even, so even a small ink wins...
        assertTrue(b.inkWorthMore(small, 1.95, 100));
        // ...and once the punch is landing, the small ink loses to it and the big one still wins.
        for (int i = 0; i < 4; i++) b.bulletHit(0, 1.95);
        assertFalse(b.inkWorthMore(small, 1.95, 100));
        assertTrue(b.inkWorthMore(big, 1.95, 100));
        b.scan(400, 500, 0, 0, 0.3);
        b.smallestShot = 0.5;
        assertFalse(b.inkWorthMore(big, 1.95, 100), "the enemy cannot fire again and Sepia leads");
    }
}
