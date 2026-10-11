package hadur.bench;

import java.lang.management.ManagementFactory;

/**
 * BENCH-60 and BENCH-61: the battle JVM heap cap and the memory check before a run. Uncapped
 * children each grew to several gigabytes and filled the host; a cap and a refusal to start
 * when the plan cannot fit keep a long run from being killed by the operating system.
 */
final class Memory {

    /** The heap cap a battle JVM gets unless {@code --child-heap} says otherwise. */
    static final String DEFAULT_CHILD_HEAP = "2G";
    /** What a child costs beyond its heap: metaspace, thread stacks, the engine's own buffers. */
    static final long OVERHEAD_MB = 300;
    /** What an uncapped child was seen to reach (96 GB over 13 JVMs). */
    static final long UNCAPPED_MB = 7500;
    /** The share of free memory a run may plan to use. */
    static final double SHARE = 0.70;

    private Memory() {}

    /** True when {@code heap} asks for no cap ({@code none}, {@code off} or {@code 0}). */
    static boolean uncapped(String heap) {
        return heap == null || heap.equalsIgnoreCase("none") || heap.equalsIgnoreCase("off") || heap.equals("0");
    }

    /** A heap size such as {@code 512M} or {@code 2G} in megabytes; -1 when uncapped. */
    static long heapMb(String heap) {
        if (uncapped(heap)) return -1;
        String s = heap.trim().toUpperCase();
        char unit = s.charAt(s.length() - 1);
        long n = Long.parseLong(Character.isDigit(unit) ? s : s.substring(0, s.length() - 1));
        return switch (unit) {
            case 'G' -> n * 1024;
            case 'K' -> n / 1024;
            case 'M' -> n;
            default -> n / (1024 * 1024);
        };
    }

    /** What one battle JVM is planned to use, in megabytes. */
    static long perChildMb(String heap) {
        long mb = heapMb(heap);
        return mb < 0 ? UNCAPPED_MB : mb + OVERHEAD_MB;
    }

    /** The planned footprint of {@code parallel} battle JVMs at once, in megabytes. */
    static long estimateMb(int parallel, String heap) {
        return (long) Math.max(1, parallel) * perChildMb(heap);
    }

    /** The widest {@code --parallel} that fits {@code freeMb}, at least 1. */
    static int fittingParallel(long freeMb, String heap) {
        return (int) Math.max(1, (long) (freeMb * SHARE) / perChildMb(heap));
    }

    record Check(boolean ok, long estimateMb, long freeMb, int suggestedParallel, String message) {}

    /** Judges a plan against {@code freeMb} of free physical memory; unknown free memory (negative) passes. */
    static Check check(long freeMb, int parallel, String heap) {
        long need = estimateMb(parallel, heap);
        String heapText = uncapped(heap) ? "uncapped (planned at " + UNCAPPED_MB + " MB each)" : heap;
        String plan = parallel + " battle JVMs with heap " + heapText + " need about " + need + " MB";
        if (freeMb < 0) {
            return new Check(true, need, freeMb, parallel, plan + "; free memory is unknown, so it was not checked");
        }
        int fit = fittingParallel(freeMb, heap);
        boolean ok = need <= freeMb * SHARE;
        String message = ok
            ? plan + " of " + freeMb + " MB free"
            : plan + " but only " + freeMb + " MB is free and a run may plan to use "
                + (int) (SHARE * 100) + "% of it. Try --parallel " + fit + ", a smaller --child-heap, or --force-memory true to go anyway";
        return new Check(ok, need, freeMb, fit, message);
    }

    /** BENCH-62: the heap cap and the planned footprint as conditions.json records them. */
    static java.util.Map<String, Object> conditions(int parallel, String heap) {
        java.util.Map<String, Object> m = new java.util.LinkedHashMap<>();
        m.put("childHeap", uncapped(heap) ? "none" : heap);
        m.put("memoryEstimateMb", estimateMb(parallel, heap));
        return m;
    }

    /** Free physical memory in megabytes, or -1 when the platform will not say. */
    static long freeMb() {
        if (ManagementFactory.getOperatingSystemMXBean() instanceof com.sun.management.OperatingSystemMXBean os) {
            return os.getFreeMemorySize() / (1024 * 1024);
        }
        return -1;
    }
}
