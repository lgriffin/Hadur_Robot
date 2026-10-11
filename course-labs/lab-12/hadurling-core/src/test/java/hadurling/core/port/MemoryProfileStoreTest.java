package hadurling.core.port;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MemoryProfileStoreTest {

    @Test
    @DisplayName("what is written is read back, as a copy")
    void readWrite() {
        MemoryProfileStore store = new MemoryProfileStore(100);
        byte[] bytes = {1, 2, 3};
        store.write("a", bytes);
        bytes[0] = 99;
        byte[] read = store.read("a");
        assertArrayEquals(new byte[] {1, 2, 3}, read);
        read[1] = 99;
        assertArrayEquals(new byte[] {1, 2, 3}, store.read("a"));
        assertNull(store.read("missing"));
    }

    @Test
    @DisplayName("a write that would pass the quota fails and changes nothing")
    void quota() {
        MemoryProfileStore store = new MemoryProfileStore(5);
        store.write("a", new byte[] {1, 2, 3});
        assertThrows(IllegalStateException.class, () -> store.write("b", new byte[] {1, 2, 3}));
        assertEquals(List.of("a"), store.names());
        // Replacing an entry refunds its old size, as Robocode does.
        store.write("a", new byte[] {1, 2, 3, 4, 5});
        assertEquals(5, store.size("a"));
    }

    @Test
    @DisplayName("an armed crash keeps only a prefix of the chosen write, once")
    void crash() {
        MemoryProfileStore store = new MemoryProfileStore(100).crashOnWrite(2, 2);
        store.write("a", new byte[] {1, 2, 3});
        assertThrows(MemoryProfileStore.Crash.class, () -> store.write("b", new byte[] {4, 5, 6}));
        assertArrayEquals(new byte[] {4, 5}, store.read("b"));
        store.write("c", new byte[] {7, 8, 9});
        assertEquals(3, store.size("c"));
        assertEquals(3, store.writes());
    }

    @Test
    @DisplayName("later writes have later modification numbers; a missing entry has 0")
    void lastModified() {
        MemoryProfileStore store = new MemoryProfileStore(100);
        store.write("a", new byte[1]);
        store.write("b", new byte[1]);
        store.write("a", new byte[1]);
        assertTrue(store.lastModified("b") < store.lastModified("a"));
        assertEquals(0, store.lastModified("zzz"));
        store.delete("a");
        assertEquals(List.of("b"), store.names());
    }
}
