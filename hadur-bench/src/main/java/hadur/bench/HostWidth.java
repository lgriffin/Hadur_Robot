package hadur.bench;

import java.util.List;
import java.util.Map;

/**
 * BENCH-105: {@code --parallel auto}, {@code --cpu-constant auto} and {@code --shard K/N}. The
 * widths come from the queue runner, which sizes the bench to the machine (hostprofile.py) and
 * hands every step {@code HADUR_BENCH_WORKERS_DUEL}, {@code _TEAM}, {@code _MELEE} and
 * {@code HADUR_BENCH_CPU_CONSTANT}; run by hand with none of those set, auto falls back to a quarter
 * of the logical processors (12 on the PC, the old bench-top20 default) and to the engine's own
 * calibration. Detection itself lives in one place, hostprofile.py.
 */
final class HostWidth {

    private HostWidth() {}

    /** The kind of battle the options ask for, as the queue runner's variables name it. */
    static String kind(Map<String, String> opts) {
        return opts.containsKey("melee") ? "melee" : opts.containsKey("team") ? "team" : "duel";
    }

    /**
     * Replaces {@code parallel=auto} by a width and {@code cpu-constant=auto} by a constant (or
     * drops it, so the bench calibrates), and records where each came from under
     * {@code parallel-source} and {@code cpu-constant-source}. Other values are left alone.
     */
    static void resolve(Map<String, String> opts, Map<String, String> env, int logical) {
        if ("auto".equalsIgnoreCase(opts.getOrDefault("parallel", "").trim())) {
            String key = "HADUR_BENCH_WORKERS_" + kind(opts).toUpperCase(java.util.Locale.ROOT);
            String width = blankToNull(env.get(key));
            String source = key;
            if (width == null) {
                width = blankToNull(env.get("HADUR_BENCH_WORKERS"));
                source = "HADUR_BENCH_WORKERS";
            }
            if (width == null) {
                width = String.valueOf(Math.max(1, logical / 4));
                source = "a quarter of " + logical + " logical processors (no host profile)";
            }
            opts.put("parallel", width.trim());
            opts.put("parallel-source", "auto: " + source);
        }
        if ("auto".equalsIgnoreCase(opts.getOrDefault("cpu-constant", "").trim())) {
            String cc = blankToNull(env.get("HADUR_BENCH_CPU_CONSTANT"));
            if (cc == null) {
                opts.remove("cpu-constant");
                opts.put("cpu-constant-source", "auto: none known, the engine calibrates");
            } else {
                opts.put("cpu-constant", cc.trim());
                opts.put("cpu-constant-source", "auto: HADUR_BENCH_CPU_CONSTANT");
            }
        }
    }

    /** {@code K/N} as {K, N} with 1 &lt;= K &lt;= N; anything else is refused with the form it wants. */
    static int[] parseShard(String shard) {
        String[] f = shard.trim().split("/");
        try {
            if (f.length != 2) throw new NumberFormatException(shard);
            int k = Integer.parseInt(f[0].trim()), n = Integer.parseInt(f[1].trim());
            if (n < 1 || k < 1 || k > n) throw new NumberFormatException(shard);
            return new int[] {k, n};
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("--shard must be K/N with 1 <= K <= N, e.g. 2/2, not " + shard);
        }
    }

    /**
     * The opponents shard {@code K} of {@code N} fights: every N-th of the set, starting at the K-th,
     * so two machines given 1/2 and 2/2 split one set between them with no opponent fought twice
     * and each half spread across the set's bands.
     */
    static <T> List<T> shard(List<T> opponents, int k, int n) {
        List<T> mine = new java.util.ArrayList<>();
        for (int i = 0; i < opponents.size(); i++) if (i % n == k - 1) mine.add(opponents.get(i));
        return mine;
    }

    private static String blankToNull(String s) {
        return s == null || s.isBlank() ? null : s;
    }
}
