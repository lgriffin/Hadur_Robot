package hadurling.core.memory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadurling.core.port.MemoryProfileStore;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * "The slide" in miniature. The problem was never one save being slow; it was a save whose
 * cost grew with the number of files in the data folder. These tests do not time anything,
 * because timings are noisy. They count the thing that grows: how often the library asks the
 * store to list itself.
 */
class ProfileLibraryScaleTest {

    private static Profile profile(String key) {
        return new Profile(key, 1, 4, 1, 8, 2, List.of(new float[] {0.1f, 0.2f, 0.3f}));
    }

    @Test
    @Tag("HL-40")
    @DisplayName("300 saves into a store that already holds 300 profiles list the store once")
    void oneListingForHundredsOfSaves() {
        MemoryProfileStore store = new MemoryProfileStore(10_000_000);
        for (int i = 0; i < 300; i++) {
            String key = "old.Bot" + i;
            store.write(ProfileLibrary.fileFor(key), ProfileCodec.encode(profile(key)));
        }
        ProfileLibrary library = new ProfileLibrary(store);
        for (int i = 0; i < 300; i++) assertTrue(library.save(profile("new.Bot" + i)));
        assertEquals(1, store.listings());
        assertEquals(600, store.names().size());
    }

    @Test
    @Tag("HL-40")
    @DisplayName("as the store grows to 800 profiles the number of listings does not grow with it")
    void listingsDoNotGrowWithTheStore() {
        MemoryProfileStore store = new MemoryProfileStore(10_000_000);
        ProfileLibrary library = new ProfileLibrary(store);
        int[] listingsAt = new int[4];
        for (int i = 1; i <= 800; i++) {
            library.save(profile("bot.Number" + i));
            if (i % 200 == 0) listingsAt[i / 200 - 1] = store.listings();
        }
        assertEquals(List.of(1, 1, 1, 1), List.of(listingsAt[0], listingsAt[1], listingsAt[2], listingsAt[3]));
    }

    @Test
    @Tag("HL-40")
    @DisplayName("loading never lists the store")
    void loadsDoNotList() {
        MemoryProfileStore store = new MemoryProfileStore(100_000);
        ProfileLibrary library = new ProfileLibrary(store);
        library.save(profile("bot.One"));
        int before = store.listings();
        for (int i = 0; i < 50; i++) library.load("bot.One");
        assertEquals(before, store.listings());
    }

    @Test
    @Tag("HL-40")
    @DisplayName("after a failed save the library no longer trusts its index and lists again")
    void failureDropsTheIndex() {
        MemoryProfileStore store = new MemoryProfileStore(100_000);
        ProfileLibrary library = new ProfileLibrary(store);
        library.save(profile("bot.One"));
        assertEquals(1, store.listings());
        store.crashOnWrite(1, 3);
        library.save(profile("bot.Two"));
        library.save(profile("bot.Three"));
        assertEquals(2, store.listings());
        assertEquals(profile("bot.Three"), library.load("bot.Three"));
    }

    @Test
    @Tag("HL-41")
    @DisplayName("when the store is full the oldest profile goes, found from the index")
    void evictsTheOldestWithoutListing() {
        int size = ProfileCodec.encode(profile("a.One")).length;
        MemoryProfileStore store = new MemoryProfileStore(3L * size + 8);
        ProfileLibrary library = new ProfileLibrary(store);
        library.save(profile("a.One"));
        library.save(profile("a.Two"));
        library.save(profile("a.Six"));
        assertEquals(Profile.stranger("a.One"), library.load("a.One"));
        assertEquals(profile("a.Two"), library.load("a.Two"));
        assertEquals(profile("a.Six"), library.load("a.Six"));
        assertEquals(1, store.listings());
    }
}
