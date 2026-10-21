package hadur.bench;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * BENCH-93, {@code --pin true}: binds each battle JVM to its worker's own logical processors,
 * so no two battles share a core and the OS cannot move a battle onto a busy one
 * (docs/plan-top5.md section 6.1). Worker {@code w} (1..N) gets {@code perWorker} processors
 * starting at {@code offset + (w - 1) * perWorker}; with two per worker that is one physical
 * core's two hardware threads on Windows, which numbers a core's threads next to each other.
 * {@code --pin-offset} (default 2) leaves the first core to the runner and the OS.
 *
 * <p>The binding is made just after the JVM starts, from its process id: on Windows through
 * PowerShell's {@code ProcessorAffinity}, elsewhere through {@code taskset -a -p}, which binds
 * every thread. It is best effort: a binding that fails is written to the battle's
 * {@code pin.txt} and the battle runs unpinned.</p>
 */
final class Affinity {

    private Affinity() {}

    /** Worker {@code worker}'s processor mask; refused when it would need more than 64 processors. */
    static long mask(int worker, int perWorker, int offset) {
        if (worker < 1 || perWorker < 1 || offset < 0) {
            throw new IllegalArgumentException("worker, processors per worker and offset must be positive");
        }
        int first = offset + (worker - 1) * perWorker;
        if (first + perWorker > 64) {
            throw new IllegalArgumentException("worker " + worker + " would need processor " + (first + perWorker - 1)
                + "; a mask holds 64");
        }
        return (perWorker == 64 ? -1L : (1L << perWorker) - 1) << first;
    }

    /** The command that binds process {@code pid} to {@code mask}, for {@code osName}. */
    static List<String> command(String osName, long pid, long mask) {
        if (osName.toLowerCase(Locale.ROOT).contains("win")) {
            return List.of("powershell", "-NoProfile", "-NonInteractive", "-Command",
                "(Get-Process -Id " + pid + ").ProcessorAffinity = " + mask);
        }
        return List.of("taskset", "-a", "-p", Long.toHexString(mask), String.valueOf(pid));
    }

    /** The highest worker count {@code processors} logical processors can pin. */
    static int maxWorkers(int processors, int perWorker, int offset) {
        return Math.max(0, (Math.min(processors, 64) - offset) / perWorker);
    }

    /**
     * Binds {@code process} to {@code mask} and writes what happened to {@code dir/pin.txt}.
     * Returns whether the binding command exited 0.
     */
    static boolean apply(Process process, long mask, Path dir) {
        List<String> cmd = command(System.getProperty("os.name", ""), process.pid(), mask);
        String outcome;
        boolean ok = false;
        try {
            Process p = new ProcessBuilder(cmd).redirectErrorStream(true).start();
            String text = new String(p.getInputStream().readAllBytes(), StandardCharsets.UTF_8).trim();
            if (!p.waitFor(30, TimeUnit.SECONDS)) {
                p.destroyForcibly();
                outcome = "timed out";
            } else {
                ok = p.exitValue() == 0;
                outcome = "exit " + p.exitValue() + (text.isEmpty() ? "" : ": " + text);
            }
        } catch (IOException e) {
            outcome = "failed: " + e;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            outcome = "interrupted";
        }
        try {
            Files.writeString(dir.resolve("pin.txt"), "mask 0x" + Long.toHexString(mask) + " " + outcome + "\n");
        } catch (IOException ignored) {
            // The battle still runs; only the note is lost.
        }
        return ok;
    }
}
