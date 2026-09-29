package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/** BENCH-4: a client-conditions file is one bench pass per line, one line per condition. */
@Tag("BENCH-4")
class ClientConditionsTest {

    @Test
    void parsesEachKeyAndSkipsCommentsAndBlanks(@TempDir Path tmp) throws Exception {
        Path file = tmp.resolve("client.txt");
        Files.writeString(file, String.join("\n",
            "# comment",
            "",
            "default | ",
            "shared data | data=shared",
            "prefilled | data=prefill:/some/dir cpu=1000000",
            "loaded | load=4",
            "another engine | engine=1.9.4.4",
            "another jvm | java=/opt/jdk17"));

        List<ClientConditions.Condition> cs = ClientConditions.parse(file);
        assertEquals(6, cs.size());

        ClientConditions.Condition def = cs.get(0);
        assertEquals("default", def.label());
        assertNull(def.data());
        assertNull(def.cpuNanos());
        assertEquals(0, def.load());
        assertNull(def.engine());
        assertNull(def.javaHome());
        assertTrue(!def.neverWipe());

        ClientConditions.Condition shared = cs.get(1);
        assertEquals("shared", shared.data());
        assertTrue(shared.neverWipe());
        assertNull(shared.prefillDir());

        ClientConditions.Condition prefilled = cs.get(2);
        assertEquals("/some/dir", prefilled.prefillDir());
        assertTrue(prefilled.neverWipe());
        assertEquals(1_000_000L, prefilled.cpuNanos());

        assertEquals(4, cs.get(3).load());
        assertEquals("1.9.4.4", cs.get(4).engine());
        assertEquals("/opt/jdk17", cs.get(5).javaHome());
    }
}
