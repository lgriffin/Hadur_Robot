package hadur2.core.shield;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.constraints.Size;

/** SHIELD-3 and SHIELD-4's inputs hold for every history of scans and bullet fates. */
class ShieldOpenerProperties {

    @Property
    @Tag("SHIELD-3")
    void aStillInterceptAlwaysLatches(@ForAll @Size(max = 60) List<@IntRange(min = 0, max = 2) Integer> before) {
        ShieldDetector d = new ShieldDetector();
        for (int fate : before) {
            if (fate == 0) d.bulletHit();
            else if (fate == 1) d.bulletMissed();
            else d.bulletIntercepted(false);
        }
        d.bulletIntercepted(true);
        assertTrue(d.shielded());
    }

    @Property
    @Tag("SHIELD-3")
    void withoutAStillInterceptOnlyShieldOneLatches(@ForAll @Size(max = 60) List<@IntRange(min = 0, max = 2) Integer> fates) {
        ShieldDetector withFlag = new ShieldDetector();
        ShieldDetector plain = new ShieldDetector();
        for (int fate : fates) {
            if (fate == 0) {
                withFlag.bulletHit();
                plain.bulletHit();
            } else if (fate == 1) {
                withFlag.bulletMissed();
                plain.bulletMissed();
            } else {
                withFlag.bulletIntercepted(false);
                plain.bulletIntercepted();
            }
        }
        assertEquals(plain.shielded(), withFlag.shielded(), "a moving enemy changes nothing against SHIELD-1");
    }

    @Property
    @Tag("SHIELD-3")
    void anEnemyThatNeverMovesHasNotMoved(@ForAll @IntRange(min = 0, max = 800) int x,
                                           @ForAll @IntRange(min = 0, max = 600) int y,
                                           @ForAll @IntRange(min = 1, max = 300) int scans) {
        EnemyStillness s = new EnemyStillness();
        s.newRound();
        for (int t = 1; t <= scans; t++) s.scanned(t, x, y, 0);
        assertFalse(s.movedThisRound());
    }

    @Property
    @Tag("SHIELD-4")
    void stillnessNeedsTenTicksSinceTheLastStep(@ForAll @IntRange(min = 1, max = 500) int stepAt,
                                                @ForAll @IntRange(min = 0, max = 40) int after) {
        EnemyStillness s = new EnemyStillness();
        s.newRound();
        s.scanned(stepAt, 100, 100, 4);
        long now = stepAt;
        for (int i = 1; i <= after; i++) {
            now = stepAt + i;
            s.scanned(now, 100, 100, 0);
        }
        assertEquals(after >= EnemyStillness.STILL_TICKS, s.stillForTenTicks(now));
    }
}
