package hadur2.core.role;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.Combinators;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
import net.jqwik.api.Tag;

/**
 * ROLE-2 and ROLE-4 as properties: over any round of ticks (counts that only fall, sentries
 * scanned or dying, a melee fault at any tick), the resolver always answers, never moves up
 * the ladder within the round, and changes role at most twice.
 */
class RoleResolverProperties {

    /** One tick's facts: enemies, sentries alive, a sentry scanned, a melee fault. */
    record Tick(int enemies, int sentries, boolean sentryScanned, boolean fault) {}

    @Provide
    Arbitrary<List<Tick>> rounds() {
        Arbitrary<Tick> tick = Combinators.combine(Arbitraries.integers().between(0, 9),
                Arbitraries.integers().between(0, 2), Arbitraries.of(false, false, false, true),
                Arbitraries.of(false, false, false, false, true))
            .as(Tick::new);
        return tick.list().ofMinSize(1).ofMaxSize(60);
    }

    @Property
    @Tag("ROLE-2")
    @Tag("ROLE-4")
    void alwaysAnswersNeverMovesUpAtMostTwoChanges(@ForAll("rounds") List<Tick> ticks,
                                                    @ForAll Charter charter) {
        RoleResolver r = new RoleResolver(charter);
        r.newRound();
        RoleId previous = null;
        int changes = 0;
        int enemies = Integer.MAX_VALUE;
        int sentries = Integer.MAX_VALUE;
        for (Tick t : ticks) {
            // Robots only die within a round.
            enemies = Math.min(enemies, t.enemies());
            sentries = Math.min(sentries, t.sentries());
            if (t.sentryScanned()) r.sentryScanned("s");
            RoleId role = r.resolve(enemies, 0, sentries);
            assertNotNull(role);
            assertTrue(charter.has(role), "a role outside the charter: " + role);
            if (t.fault() && role == RoleId.MELEE) {
                // GATE-4: the Duel takes the tick.
                r.meleeFailed();
                role = RoleId.DUEL;
            }
            if (previous != null) {
                assertTrue(!role.above(previous), previous + " then " + role);
                if (role != previous) changes++;
            }
            r.drove(role);
            previous = role;
        }
        assertTrue(changes <= 2, "changes " + changes);
    }

    @Property
    @Tag("ROLE-2")
    void theFunctionIsPure(@ForAll Charter charter, @ForAll("counts") int enemies,
                           @ForAll("counts") int sentries, @ForAll Veto veto) {
        for (RoleId driven : new RoleId[] {null, RoleId.MELEE, RoleId.DUEL}) {
            RoleId a = RoleResolver.resolve(charter, enemies, 0, sentries, veto, false, driven);
            RoleId b = RoleResolver.resolve(charter, enemies, 0, sentries, veto, false, driven);
            assertTrue(a == b);
            if (driven != null) assertTrue(!a.above(driven));
        }
    }

    @Provide
    Arbitrary<Integer> counts() {
        return Arbitraries.integers().between(0, 10);
    }
}
