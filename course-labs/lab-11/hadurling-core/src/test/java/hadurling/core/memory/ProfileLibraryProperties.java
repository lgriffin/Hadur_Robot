package hadurling.core.memory;

import static org.junit.jupiter.api.Assertions.assertTrue;

import hadurling.core.port.MemoryProfileStore;
import java.util.List;
import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.Combinators;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
import net.jqwik.api.Tag;

/**
 * Fault injection: the robot can be killed at any moment, so kill it at every moment. A save
 * is two writes (the copy, then the profile). The property arms the in-memory store to cut
 * either write at any byte, then starts a fresh library on the same store, as the next battle
 * would, and demands a profile that is either the old one or the new one. Never a mixture,
 * never garbage, never an exception.
 */
@Tag("HL-20")
class ProfileLibraryProperties {

    @Provide
    Arbitrary<Profile> profiles() {
        Arbitrary<List<float[]>> seed = Arbitraries.floats().between(-1f, 1f).list().ofSize(3)
            .map(l -> new float[] {l.get(0), l.get(1), l.get(2)}).list().ofMaxSize(20);
        return Combinators.combine(Arbitraries.integers().between(0, 500), Arbitraries.integers().between(0, 500), seed)
            .as((rounds, shots, s) -> new Profile("a.Foe", rounds, shots, shots / 4, shots, shots / 2, s));
    }

    @Property
    void aSaveKilledAnywhereLeavesTheOldOrTheNewProfile(@ForAll("profiles") Profile before,
            @ForAll("profiles") Profile after, @ForAll("whichWrite") int nth,
            @ForAll("cutAt") double fraction) {
        MemoryProfileStore store = new MemoryProfileStore(1_000_000);
        assertTrue(new ProfileLibrary(store).save(before));

        int newSize = ProfileCodec.encode(after).length;
        store.crashOnWrite(nth, (int) (fraction * newSize));
        new ProfileLibrary(store).save(after); // may be cut short: it reports false and does not throw

        Profile loaded = new ProfileLibrary(store).load("a.Foe");
        assertTrue(loaded.equals(before) || loaded.equals(after),
            "loaded " + loaded + " after a save killed in write " + nth + " at " + fraction);
    }

    @Property
    void aSaveKilledBeforeAnyProfileExistedLeavesAStrangerOrTheNewProfile(
            @ForAll("profiles") Profile after, @ForAll("whichWrite") int nth, @ForAll("cutAt") double fraction) {
        MemoryProfileStore store = new MemoryProfileStore(1_000_000);
        store.crashOnWrite(nth, (int) (fraction * ProfileCodec.encode(after).length));
        new ProfileLibrary(store).save(after);
        Profile loaded = new ProfileLibrary(store).load("a.Foe");
        assertTrue(loaded.equals(after) || loaded.equals(Profile.stranger("a.Foe")), "loaded " + loaded);
    }

    /** Write 1 is the temporary copy, write 2 the profile itself. */
    @Provide
    Arbitrary<Integer> whichWrite() {
        return Arbitraries.of(1, 2);
    }

    @Provide
    Arbitrary<Double> cutAt() {
        return Arbitraries.doubles().between(0, 1);
    }
}
