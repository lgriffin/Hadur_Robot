package hadur2.core.melee;

import hadur2.core.world.EnemyInfo;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * T7, the team's mode table (TMODE-1): which team movement modes HadurTeam plays against
 * each opposing team, as the 1v1 mode table picks a mode per opponent.
 *
 * <p>The table is keyed by an opposing member's class ({@link #key}): a team's members
 * share their team's entry, and a team of two classes has an entry for each. A team the
 * table does not name plays every mode forced on ({@code FORCE_...}, all off in the shipped
 * build), so an ablation build plays a mode against the whole field and one bench of it
 * scores that mode against every team. The modes act only while Hadur has a living teammate:
 * off a team, or as the last member alive, the controller never asks.</p>
 */
public final class TeamModes {

    /** A team movement mode. */
    public enum Mode {
        /** TMODE-2: a shot's virtual bullets weigh less for each teammate nearer its shooter. */
        SOFT,
        /** TMODE-3: a member near two or more enemies is drawn to a teammate; a free one to a ganged teammate. */
        GANG,
        /** TMODE-4: against the last enemy, with energy to spare, close in. */
        FINISH,
        /** MMOVE-10 as a mode: dodge the team's learned aims. */
        LEARN
    }

    /** Ablation switches: the mode for every team the table does not name. */
    public static final boolean FORCE_SOFT = false;
    public static final boolean FORCE_GANG = false;
    public static final boolean FORCE_FINISH = false;
    public static final boolean FORCE_LEARN = false;

    /** No modes: today's team movement. */
    public static final Set<Mode> NONE = Collections.unmodifiableSet(EnumSet.noneOf(Mode.class));

    /** The modes for teams the table does not name. */
    static final Set<Mode> DEFAULT = forced(FORCE_SOFT, FORCE_GANG, FORCE_FINISH, FORCE_LEARN);

    /** Opposing member class to its team's modes; filled from the per-team screens. */
    static final Map<String, Set<Mode>> TABLE = table();

    private TeamModes() {
    }

    static Set<Mode> forced(boolean soft, boolean gang, boolean finish, boolean learn) {
        EnumSet<Mode> s = EnumSet.noneOf(Mode.class);
        if (soft) s.add(Mode.SOFT);
        if (gang) s.add(Mode.GANG);
        if (finish) s.add(Mode.FINISH);
        if (learn) s.add(Mode.LEARN);
        return Collections.unmodifiableSet(s);
    }

    private static Map<String, Set<Mode>> table() {
        Map<String, Set<Mode>> t = new HashMap<>();
        return Collections.unmodifiableMap(t);
    }

    /**
     * A member's class: its name without the engine's trailing " (n)" duplicate markers or
     * the version after the first space, as {@code "cz.libors.Ogi 1.0 (2)"} to
     * {@code "cz.libors.Ogi"}.
     */
    static String key(String name) {
        String s = name.trim();
        while (s.endsWith(")")) {
            int open = s.lastIndexOf(" (");
            if (open < 0 || open + 2 >= s.length() - 1) break;
            boolean digits = true;
            for (int i = open + 2; i < s.length() - 1; i++) digits &= Character.isDigit(s.charAt(i));
            if (!digits) break;
            s = s.substring(0, open).trim();
        }
        int space = s.indexOf(' ');
        return space < 0 ? s : s.substring(0, space);
    }

    /** The modes against {@code enemies}: the first one the table names, else the default. */
    public static Set<Mode> against(List<EnemyInfo> enemies) {
        return against(enemies, TABLE, DEFAULT);
    }

    static Set<Mode> against(List<EnemyInfo> enemies, Map<String, Set<Mode>> table, Set<Mode> fallback) {
        for (EnemyInfo e : enemies) {
            Set<Mode> m = table.get(key(e.name));
            if (m != null) return m;
        }
        return fallback;
    }
}
