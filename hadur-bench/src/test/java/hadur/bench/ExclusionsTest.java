package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-63 to BENCH-67: opponents that fail their battles are named in the report, the console and conditions.json. */
class ExclusionsTest {

    private static Exclusions.Counter counter() {
        Exclusions.Counter c = new Exclusions.Counter();
        for (int i = 0; i < 4; i++) c.add("zen.Ronin 3.1", false, "bench error: Could not load\nsecond line");
        c.add("abc.Fine 1.0", true, "");
        c.add("abc.Fine 1.0", true, "");
        c.add("abc.Half 1.0", false, "");
        c.add("abc.Half 1.0", true, "");
        c.add("abc.Mostly 1.0", false, "boom");
        c.add("abc.Mostly 1.0", true, "");
        c.add("abc.Mostly 1.0", true, "");
        return c;
    }

    @Test
    @Tag("BENCH-63")
    @DisplayName("an opponent that failed all or half of its battles is listed with its counts and first reason")
    void listsOpponentsThatFailedHalfOrMore() {
        String block = Exclusions.block(counter().tallies());
        assertTrue(block.startsWith("## Excluded or failing opponents"));
        assertTrue(block.contains("| zen.Ronin 3.1 | 4 of 4 (all) | bench error: Could not load |"), block);
        assertTrue(block.contains("| abc.Half 1.0 | 1 of 2 | no result |"), block);
        assertFalse(block.contains("abc.Fine"));
        assertFalse(block.contains("abc.Mostly"), "one failure in three is under half");
    }

    @Test
    @Tag("BENCH-63")
    @DisplayName("no block when every opponent fought")
    void noBlockWhenAllFought() {
        Exclusions.Counter c = new Exclusions.Counter();
        c.add("a", true, "");
        c.add("a", false, "x");
        c.add("a", true, "");
        assertEquals("", Exclusions.block(c.tallies()));
        assertEquals("", Exclusions.summary(c.tallies()));
    }

    @Test
    @Tag("BENCH-64")
    @DisplayName("the block goes after the title and the report is otherwise unchanged")
    void blockGoesAfterTheTitle() {
        String report = "# Bench: hadur2.Hadur 3.8.5 (cold)\n\n35 rounds.\n\n| table |\n";
        String block = "## Excluded or failing opponents\n\nrows\n\n";
        String out = Exclusions.insertAfterTitle(report, block);
        assertEquals("# Bench: hadur2.Hadur 3.8.5 (cold)\n\n" + block + "35 rounds.\n\n| table |\n", out);
        assertEquals(report, Exclusions.insertAfterTitle(report, ""));
        assertEquals(report, out.replace(block, ""));
    }

    @Test
    @Tag("BENCH-65")
    @DisplayName("the console line names each excluded opponent with failed over fought")
    void summaryNamesThem() {
        assertEquals("2 opponents failed at least half of their battles: zen.Ronin 3.1 (4/4), abc.Half 1.0 (1/2)",
            Exclusions.summary(counter().tallies()));
    }

    @Test
    @Tag("BENCH-66")
    @DisplayName("conditions.json gets the excluded opponents as plain maps")
    void conditionsGetTheExcluded() {
        List<Map<String, Object>> m = Exclusions.toMaps(counter().tallies());
        assertEquals(2, m.size());
        assertEquals("zen.Ronin 3.1", m.get(0).get("opponent"));
        assertEquals(4, m.get(0).get("failed"));
        assertEquals(4, m.get(0).get("battles"));
        assertEquals("bench error: Could not load", m.get(0).get("firstFailure"));
        assertTrue(Conditions.json(Map.of("excluded", m)).contains("\"firstFailure\": \"bench error: Could not load\""));
    }

    @Test
    @Tag("BENCH-67")
    @DisplayName("a reason is the first line, cut to 160 characters, or 'no result'")
    void reasonIsTheFirstLineCut() {
        assertEquals("a", Exclusions.reason("a\nb"));
        assertEquals("no result", Exclusions.reason(null));
        assertEquals("no result", Exclusions.reason("  \n "));
        String cut = Exclusions.reason("x".repeat(300));
        assertEquals(160, cut.length());
        assertTrue(cut.endsWith("..."));
    }
}
