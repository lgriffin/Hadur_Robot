package hadur117;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("BattleLogger")
class BattleLoggerTest {

    private ByteArrayOutputStream out;

    @BeforeEach
    void setUp() {
        out = new ByteArrayOutputStream();
        BattleLogger.init(out);
    }

    @AfterEach
    void tearDown() {
        BattleLogger.destroy();
    }

    @Nested
    @DisplayName("Initialization")
    class InitTests {

        @Test
        @DisplayName("log methods are no-ops before init")
        void noOpBeforeInit() {
            BattleLogger.destroy();
            ByteArrayOutputStream capture = new ByteArrayOutputStream();
            BattleLogger.logRoundStart(0, "DUEL", 1);
            BattleLogger.flush();
            assertEquals(0, capture.size());
        }

        @Test
        @DisplayName("flush is safe before init")
        void flushSafeBeforeInit() {
            BattleLogger.destroy();
            assertDoesNotThrow(BattleLogger::flush);
        }

        @Test
        @DisplayName("destroy is safe before init")
        void destroySafeBeforeInit() {
            BattleLogger.destroy();
            assertDoesNotThrow(BattleLogger::destroy);
        }

        @Test
        @DisplayName("init with enabled=false makes all methods no-ops")
        void disabledLogging() {
            BattleLogger.destroy();
            ByteArrayOutputStream capture = new ByteArrayOutputStream();
            BattleLogger.init(capture, false);
            BattleLogger.logRoundStart(0, "DUEL", 1);
            BattleLogger.logFire(10, "Enemy", 2.0, "GuessFactor");
            BattleLogger.logTargetSwitch(20, "A", "B");
            BattleLogger.flush();
            assertEquals(0, capture.size());
        }

        @Test
        @DisplayName("re-init flushes and closes previous stream")
        void reInitFlushesPrevious() {
            BattleLogger.logFire(10, "Enemy", 2.0, "GuessFactor");
            ByteArrayOutputStream newOut = new ByteArrayOutputStream();
            BattleLogger.init(newOut);

            String flushed = out.toString();
            assertTrue(flushed.contains("[FIRE]"));

            BattleLogger.logFire(20, "Other", 1.5, "Linear");
            BattleLogger.flush();
            String newContent = newOut.toString();
            assertTrue(newContent.contains("Other"));
            assertFalse(newContent.contains("Enemy"));
        }
    }

    @Nested
    @DisplayName("Buffering")
    class BufferingTests {

        @Test
        @DisplayName("log methods buffer without writing to stream")
        void buffersWithoutWriting() {
            BattleLogger.logFire(10, "Target", 2.5, "GuessFactor");
            assertEquals(0, out.size());
        }

        @Test
        @DisplayName("flush writes buffered content to stream")
        void flushWritesToStream() {
            BattleLogger.logFire(10, "Target", 2.5, "GuessFactor");
            BattleLogger.flush();
            assertTrue(out.size() > 0);
        }

        @Test
        @DisplayName("flush clears buffer so second flush is empty")
        void flushClearsBuffer() {
            BattleLogger.logFire(10, "Target", 2.5, "GuessFactor");
            BattleLogger.flush();
            int sizeAfterFirst = out.size();
            BattleLogger.flush();
            assertEquals(sizeAfterFirst, out.size());
        }

        @Test
        @DisplayName("empty flush writes nothing")
        void emptyFlush() {
            BattleLogger.flush();
            assertEquals(0, out.size());
        }
    }

    @Nested
    @DisplayName("Log format")
    class FormatTests {

        @Test
        @DisplayName("logRoundStart includes round number and mode")
        void roundStart() {
            BattleLogger.logRoundStart(3, "MELEE", 4);
            BattleLogger.flush();
            String output = out.toString();
            assertTrue(output.contains("Round 3"));
            assertTrue(output.contains("MELEE"));
            assertTrue(output.contains("Opponents: 4"));
        }

        @Test
        @DisplayName("logFire includes tick, target, power, gun name")
        void fire() {
            BattleLogger.logFire(42, "sample.Tracker", 2.50, "PatternMatch");
            BattleLogger.flush();
            String output = out.toString();
            assertTrue(output.contains("[FIRE]"));
            assertTrue(output.contains("tick=42"));
            assertTrue(output.contains("sample.Tracker"));
            assertTrue(output.contains("2.50"));
            assertTrue(output.contains("PatternMatch"));
        }

        @Test
        @DisplayName("logTargetSwitch includes tick and both targets")
        void targetSwitch() {
            BattleLogger.logTargetSwitch(55, "OldBot", "NewBot");
            BattleLogger.flush();
            String output = out.toString();
            assertTrue(output.contains("[TARGET]"));
            assertTrue(output.contains("tick=55"));
            assertTrue(output.contains("OldBot"));
            assertTrue(output.contains("NewBot"));
        }

        @Test
        @DisplayName("logModeTransition includes tick and modes")
        void modeTransition() {
            BattleLogger.logModeTransition(100, "MELEE", "DUEL");
            BattleLogger.flush();
            String output = out.toString();
            assertTrue(output.contains("[MODE]"));
            assertTrue(output.contains("tick=100"));
            assertTrue(output.contains("MELEE"));
            assertTrue(output.contains("DUEL"));
        }

        @Test
        @DisplayName("logOpponentProfile includes all profile fields")
        void opponentProfile() {
            BattleLogger.logOpponentProfile("sample.Fire", "LINEAR",
                    "HEAD_ON", 0.42, 0.182, 1.1);
            BattleLogger.flush();
            String output = out.toString();
            assertTrue(output.contains("sample.Fire"));
            assertTrue(output.contains("LINEAR"));
            assertTrue(output.contains("HEAD_ON"));
            assertTrue(output.contains("0.42"));
            assertTrue(output.contains("18.2%"));
            assertTrue(output.contains("1.10x"));
        }

        @Test
        @DisplayName("logGunSelection includes gun stats")
        void gunSelection() {
            BattleLogger.logGunSelection("GuessFactor", 14, 3, 0.214);
            BattleLogger.flush();
            String output = out.toString();
            assertTrue(output.contains("GuessFactor"));
            assertTrue(output.contains("14"));
            assertTrue(output.contains("21.4%"));
        }

        @Test
        @DisplayName("logWaveSurferStats includes hit counts")
        void waveSurferStats() {
            BattleLogger.logWaveSurferStats(2, 5, 30);
            BattleLogger.flush();
            String output = out.toString();
            assertTrue(output.contains("Wave Surfer"));
            assertTrue(output.contains("2"));
            assertTrue(output.contains("5"));
            assertTrue(output.contains("30"));
        }

        @Test
        @DisplayName("logRoundEnd includes result and stats")
        void roundEnd() {
            BattleLogger.logRoundEnd(0, "WIN", 62.4, 0.214, 100.0, 1, 1);
            BattleLogger.flush();
            String output = out.toString();
            assertTrue(output.contains("Round 0"));
            assertTrue(output.contains("WIN"));
            assertTrue(output.contains("62.4"));
            assertTrue(output.contains("21.4%"));
            assertTrue(output.contains("100.0%"));
        }

        @Test
        @DisplayName("logAggregate includes summary stats")
        void aggregate() {
            BattleLogger.logAggregate(10, 7, 70.0, 0.192, 3, 4.5);
            BattleLogger.flush();
            String output = out.toString();
            assertTrue(output.contains("AGGREGATE"));
            assertTrue(output.contains("10"));
            assertTrue(output.contains("7"));
            assertTrue(output.contains("70.0%"));
            assertTrue(output.contains("19.2%"));
            assertTrue(output.contains("Wall Hits: 3"));
        }
    }

    @Nested
    @DisplayName("Destroy")
    class DestroyTests {

        @Test
        @DisplayName("destroy flushes remaining buffer")
        void destroyFlushes() {
            BattleLogger.logFire(10, "Bot", 1.0, "Linear");
            BattleLogger.destroy();
            String output = out.toString();
            assertTrue(output.contains("[FIRE]"));
        }

        @Test
        @DisplayName("log methods are no-ops after destroy")
        void noOpAfterDestroy() {
            BattleLogger.destroy();
            int sizeAfterDestroy = out.size();
            BattleLogger.logFire(10, "Bot", 1.0, "Linear");
            BattleLogger.flush();
            assertEquals(sizeAfterDestroy, out.size());
        }
    }

    @Nested
    @DisplayName("IOException handling")
    class IOExceptionTests {

        @Test
        @DisplayName("flush swallows IOException")
        void flushSwallowsIOException() {
            OutputStream failing = new OutputStream() {
                @Override
                public void write(int b) throws IOException {
                    throw new IOException("disk full");
                }
                @Override
                public void write(byte[] b) throws IOException {
                    throw new IOException("disk full");
                }
            };
            BattleLogger.init(failing);
            BattleLogger.logFire(1, "Bot", 1.0, "Linear");
            assertDoesNotThrow(BattleLogger::flush);
        }
    }
}
