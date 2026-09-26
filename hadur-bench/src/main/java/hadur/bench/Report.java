package hadur.bench;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/** Renders bench results as Markdown. */
final class Report {

    private Report() {}

    static String render(Map<Opponent, List<BattleResult>> results, String robot, boolean warm,
                         int rounds, int runs, int width, int height, String cpuConstant) {
        StringBuilder b = new StringBuilder();
        b.append("# Bench: ").append(robot).append(warm ? " (warm)" : " (cold)").append("\n\n");
        b.append(String.format(Locale.ROOT,
            "%d rounds x %d %s per opponent on %dx%d. Engine Robocode 1.9.5.6, security manager on. "
            + "Java %s, %d cores. %s.%n%n",
            rounds, runs, warm ? "consecutive battles (data kept)" : "seeds (data wiped)",
            width, height, System.getProperty("java.version"),
            Runtime.getRuntime().availableProcessors(), cpuConstant));
        b.append("Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.\n\n");
        b.append("| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Skipped turns | Turn p95 / max (ms) |\n");
        b.append("|---|---|---|---|---|---|---|---|\n");
        for (Map.Entry<Opponent, List<BattleResult>> e : results.entrySet()) {
            List<Double> score = new ArrayList<>(), surv = new ArrayList<>(), dmg = new ArrayList<>();
            int won = 0, played = 0, skipped = 0, failed = 0;
            double p95 = 0, max = 0;
            for (BattleResult r : e.getValue()) {
                if (!r.ok) {
                    failed++;
                    continue;
                }
                score.add(r.scoreShare());
                surv.add(r.survivalShare());
                dmg.add(r.bulletDamageShare());
                won += r.firsts;
                played += r.rounds;
                skipped += r.skippedTurns;
                p95 = Math.max(p95, r.turnP95Ms);
                max = Math.max(max, r.turnMaxMs);
            }
            b.append(String.format(Locale.ROOT, "| %s | %s | %s | %s | %s | %d / %d | %d | %.2f / %.1f |%s%n",
                e.getKey().name, e.getKey().role, Stats.of(score).percent(),
                Stats.of(surv).percent(), Stats.of(dmg).percent(), won, played, skipped, p95, max,
                failed > 0 ? " " + failed + " battle(s) failed" : ""));
        }
        if (warm) {
            b.append("\n## Learning curve (score share by battle)\n\n| Opponent |");
            for (int i = 1; i <= runs; i++) b.append(" ").append(i).append(" |");
            b.append("\n|---|");
            for (int i = 1; i <= runs; i++) b.append("---|");
            b.append('\n');
            for (Map.Entry<Opponent, List<BattleResult>> e : results.entrySet()) {
                b.append("| ").append(e.getKey().name).append(" |");
                for (BattleResult r : e.getValue()) {
                    b.append(String.format(Locale.ROOT, " %.1f%% |", r.scoreShare() * 100));
                }
                b.append('\n');
            }
        }
        b.append("\nTurn times are wall-clock per engine turn (both robots plus the engine), "
            + "measured by the harness. Skipped turns are counted from Hadur's console output.\n");
        return b.toString();
    }
}
