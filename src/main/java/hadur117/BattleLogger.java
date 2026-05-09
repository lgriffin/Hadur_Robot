package hadur117;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Buffered file logger for battle diagnostics.
 *
 * <p>Accumulates log lines in an in-memory {@link StringBuilder} during ticks
 * (zero I/O cost) and flushes to the Robocode data directory at round boundaries.
 * Before {@link #init} is called, all logging methods are safe no-ops.</p>
 */
public class BattleLogger {

    private static BattleLogger instance;

    private final OutputStream stream;
    private final StringBuilder buffer = new StringBuilder(4096);

    private BattleLogger(OutputStream stream) {
        this.stream = stream;
    }

    public static void init(OutputStream stream) {
        init(stream, true);
    }

    public static void init(OutputStream stream, boolean enabled) {
        if (instance != null) {
            instance.flush();
            try { instance.stream.close(); } catch (IOException ignored) {}
        }
        instance = enabled ? new BattleLogger(stream) : null;
    }

    public static void destroy() {
        if (instance != null) {
            instance.flush();
            try { instance.stream.close(); } catch (IOException ignored) {}
            instance = null;
        }
    }

    public static void flush() {
        if (instance != null) instance.doFlush();
    }

    // ── Logging methods ────────────────────────────────────────────────

    public static void logRoundStart(int round, String mode, int opponents) {
        if (instance == null) return;
        instance.buffer.append("\n================================================================================\n");
        instance.buffer.append("  HADUR BATTLE LOG - Round ").append(round).append('\n');
        instance.buffer.append("  Mode: ").append(mode)
                .append(" | Opponents: ").append(opponents).append('\n');
        instance.buffer.append("================================================================================\n\n");
    }

    public static void logFire(long tick, String target, double power, String gunName) {
        if (instance == null) return;
        instance.buffer.append(String.format("[FIRE] tick=%d target=%s power=%.2f gun=%s%n",
                tick, target, power, gunName));
    }

    public static void logTargetSwitch(long tick, String oldTarget, String newTarget) {
        if (instance == null) return;
        instance.buffer.append(String.format("[TARGET] tick=%d %s -> %s%n",
                tick, oldTarget, newTarget));
    }

    public static void logModeTransition(long tick, String from, String to) {
        if (instance == null) return;
        instance.buffer.append(String.format("[MODE] tick=%d %s -> %s%n", tick, from, to));
    }

    public static void logOpponentProfile(String name, String movType, String gunType,
                                           double threat, double accuracy, double fpMult) {
        if (instance == null) return;
        instance.buffer.append("  ").append(name).append('\n');
        instance.buffer.append(String.format("    Movement: %s | Gun: %s | Threat: %.2f%n",
                movType, gunType, threat));
        instance.buffer.append(String.format("    Our Accuracy: %.1f%% | Fire Power Mult: %.2fx%n",
                accuracy * 100, fpMult));
    }

    public static void logGunSelection(String gunName, int fired, int hit, double accuracy) {
        if (instance == null) return;
        instance.buffer.append(String.format("%n--- Gun ---%n"));
        instance.buffer.append(String.format("  Active: %s | Shots: %d/%d (%.1f%%)%n",
                gunName, fired, hit, accuracy * 100));
    }

    public static void logWaveSurferStats(int roundHits, int totalHits, int totalWaves) {
        if (instance == null) return;
        instance.buffer.append(String.format("%n--- Wave Surfer ---%n"));
        instance.buffer.append(String.format("  Hits This Round: %d | Total Hits: %d | Total Waves: %d%n",
                roundHits, totalHits, totalWaves));
    }

    public static void logRoundEnd(int round, String result, double energy,
                                    double accuracy, double winRate,
                                    int won, int played) {
        if (instance == null) return;
        instance.buffer.append(String.format("%n--- Round %d: %s ---%n", round, result));
        instance.buffer.append(String.format("  Energy: %.1f | Accuracy: %.1f%%%n",
                energy, accuracy * 100));
        instance.buffer.append(String.format("  Win Rate: %.1f%% (%d/%d)%n", winRate, won, played));
        instance.buffer.append("================================================================================\n");
    }

    public static void logAggregate(int played, int won, double winRate,
                                     double accuracy, int wallHits, double wallDamage) {
        if (instance == null) return;
        instance.buffer.append("\n============================================\n");
        instance.buffer.append("  HADUR - BATTLE AGGREGATE\n");
        instance.buffer.append("============================================\n");
        instance.buffer.append(String.format("  Rounds: %d | Wins: %d | Win Rate: %.1f%%%n",
                played, won, winRate));
        instance.buffer.append(String.format("  Accuracy: %.1f%%%n", accuracy * 100));
        instance.buffer.append(String.format("  Wall Hits: %d (Damage: %.1f)%n", wallHits, wallDamage));
        instance.buffer.append("============================================\n");
    }

    // ── Internal ───────────────────────────────────────────────────────

    private void doFlush() {
        if (buffer.length() == 0) return;
        try {
            stream.write(buffer.toString().getBytes());
            stream.flush();
        } catch (IOException ignored) {
        }
        buffer.setLength(0);
    }
}
