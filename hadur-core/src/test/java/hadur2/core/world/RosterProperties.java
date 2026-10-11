package hadur2.core.world;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.IntRange;

/**
 * WORLD-8 as a property: whatever the World has heard and been told, its count of enemies
 * alive is never below the truth, so a doubt can delay the step down to the Duel but never
 * cause it.
 */
class RosterProperties {

    @Property(tries = 2000)
    @Tag("WORLD-8")
    void neverBelowTheTruth(@ForAll @IntRange(min = 1, max = 9) int enemies,
                            @ForAll @IntRange(min = 0, max = 4) int mates,
                            @ForAll @IntRange(min = 0, max = 9) int enemiesDead,
                            @ForAll @IntRange(min = 0, max = 4) int matesDead,
                            @ForAll @IntRange(min = 0, max = 9) int deathsKnown,
                            @ForAll @IntRange(min = 0, max = 4) int heard) {
        enemiesDead = Math.min(enemiesDead, enemies);
        matesDead = Math.min(matesDead, mates);
        List<String> roster = new ArrayList<>();
        for (int i = 0; i < mates; i++) roster.add("mate" + i);
        Roster r = new Roster(roster, enemies);
        r.newRound();
        r.beginTick(10);
        // A death can be missed (a skipped turn wipes it), never invented.
        for (int i = 0; i < Math.min(deathsKnown, enemiesDead); i++) r.died("enemy" + i, 5, false);
        // Only a living teammate can be heard from.
        for (int i = 0; i < Math.min(heard, mates - matesDead); i++) r.reported("mate" + i, 9, 0, 0, 0, 0, 0);
        int others = (enemies - enemiesDead) + (mates - matesDead);
        int truth = enemies - enemiesDead;
        assertTrue(r.enemiesAlive(others) >= truth, r.enemiesAlive(others) + " < " + truth);
    }
}
