package hadur117.core.melee;

import hadur117.core.world.EnemyInfo;
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
 * table does not name plays every mode forced on ({@code FORCE_...}; MATEFIRE and HUNT in the
 * shipped build), so an ablation build plays a mode against the whole field and one bench of it
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
        LEARN,
        /** TMODE-5: hunt as a pack: every member closes on the same enemy from its own side (NightmareTeam's pincer). */
        PACK,
        /** TMODE-6: teammates count with enemies as robots nearer an enemy than Hadur would be. */
        SCREEN,
        /** TMODE-7: MMOVE-10's learned aims from one log per enemy class, fed by all its copies. */
        POOL,
        /** TMODE-8: a member is drawn to a disabled enemy nearby, to finish it (CombatTeam). */
        DISABLED,
        /** TMODE-9: the teammates' bullets in flight count as danger, as an enemy's do (CombatTeam). */
        MATEFIRE,
        /** TMODE-10: the leader, whose death costs every teammate energy, keeps further from enemies. */
        REAR,
        /** TMODE-11: the safest candidates are re-ranked by the shots their drive would cross (Ogi's waves). */
        WAVES,
        /** TMODE-13: packs of two or three assigned per enemy, each member at a fixed 350 px round its prey (NightmareTeam). */
        HUNT,
        /** TMODE-15: a member keeps out of the cone behind each teammate's likely target, where that teammate's misses fly. */
        LINES,
        /**
         * TMODE-16: TMODE-15 with wider, heavier cones ({@code LINES_WIDE_K}, {@code LINES_WIDE_HALF}),
         * as ablation tmlinesw benched them. Only through the table: no FORCE switch.
         */
        LINESW,
        /** TMODE-17: WEAVE-10 for this team: a nearer teammate's predicted track holds the shot. Only through the table. */
        LANEP,
        /** TMODE-18: WEAVE-11 for this team: a teammate beyond the target holds the shot. Only through the table. */
        LANEB,
        /**
         * TMODE-19: members state their gun's heading and heat; a member keeps out of the line
         * ahead of each teammate's gun while that gun is about to fire.
         */
        GUNLINE,
        /**
         * TMODE-20: shot ownership, for a team whose code shoots its closest enemy: a shot makes
         * virtual bullets only for the member it was aimed at (MMOVE-9's nearest rule). Only
         * through the table.
         */
        OWN,
        /** TMODE-21: the team aims only head-on: one head-on virtual bullet per shot. Only through the table. */
        HEADON,
        /** TMODE-22: the team aims only linear: one linear virtual bullet per shot. Only through the table. */
        LINEAR,
        /** TMODE-23: the team's power falls with distance: hunt at 500 px, not 350. Only through the table. */
        FAR,
        /** TMODE-24: as FAR, at 650 px. Only through the table. */
        FARTHER,
        /** TMODE-25: each candidate's drive is checked tick by tick against the teammates' bullets in flight (Firestarter). */
        PATH,
        /** TMODE-26: the team only lands its shots up close: hunt at 250 px, not 350. Only through the table. */
        NEAR
    }

    /**
     * Ablation switches: the mode for every team the table does not name. MATEFIRE is on in
     * the shipped build since team step C (TMODE-12): with WEAVE-9's narrow lane, teammates'
     * bullets fly near more often, and the pair benched +2.9 share points against 3.16.
     */
    public static final boolean FORCE_SOFT = false;
    public static final boolean FORCE_GANG = false;
    public static final boolean FORCE_FINISH = false;
    public static final boolean FORCE_LEARN = false;
    public static final boolean FORCE_PACK = false;
    public static final boolean FORCE_SCREEN = false;
    public static final boolean FORCE_POOL = false;
    public static final boolean FORCE_DISABLED = false;
    public static final boolean FORCE_MATEFIRE = true;
    public static final boolean FORCE_REAR = false;
    public static final boolean FORCE_WAVES = false;
    public static final boolean FORCE_HUNT = true;
    public static final boolean FORCE_LINES = false;
    public static final boolean FORCE_GUNLINE = false;
    public static final boolean FORCE_PATH = false;

    /** No modes: today's team movement. */
    public static final Set<Mode> NONE = Collections.unmodifiableSet(EnumSet.noneOf(Mode.class));

    /** The modes for teams the table does not name. */
    static final Set<Mode> DEFAULT = of(
        FORCE_SOFT ? Mode.SOFT : null, FORCE_GANG ? Mode.GANG : null, FORCE_FINISH ? Mode.FINISH : null,
        FORCE_LEARN ? Mode.LEARN : null, FORCE_PACK ? Mode.PACK : null, FORCE_SCREEN ? Mode.SCREEN : null,
        FORCE_POOL ? Mode.POOL : null, FORCE_DISABLED ? Mode.DISABLED : null,
        FORCE_MATEFIRE ? Mode.MATEFIRE : null, FORCE_REAR ? Mode.REAR : null,
        FORCE_WAVES ? Mode.WAVES : null, FORCE_HUNT ? Mode.HUNT : null, FORCE_LINES ? Mode.LINES : null,
        FORCE_GUNLINE ? Mode.GUNLINE : null, FORCE_PATH ? Mode.PATH : null);

    /** Opposing member class to its team's modes; filled from the per-team screens. */
    static final Map<String, Set<Mode>> TABLE = table();

    private TeamModes() {
    }

    /** The set of {@code modes}, nulls left out; the table's entries are written with it. */
    static Set<Mode> of(Mode... modes) {
        EnumSet<Mode> s = EnumSet.noneOf(Mode.class);
        for (Mode m : modes) {
            if (m != null) s.add(m);
        }
        return Collections.unmodifiableSet(s);
    }

    private static Map<String, Set<Mode>> table() {
        Map<String, Set<Mode>> t = new HashMap<>();
        // pc-team-counters (PR #370), 16 fresh seeds: TroodonPack +4.7 ± 3.8, GrofGroup +2.5 ± 3.0.
        t.put("gh.nano.GrofGroupMember", of(Mode.MATEFIRE, Mode.HUNT, Mode.OWN, Mode.LINEAR));
        t.put("myl.micro.Troodon", of(Mode.MATEFIRE, Mode.HUNT, Mode.OWN, Mode.HEADON));
        t.put("myl.micro.TroodonDroid", of(Mode.MATEFIRE, Mode.HUNT, Mode.OWN, Mode.HEADON));
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

    /** TMODE-20: whether a shot counts only for the member it was aimed at (MMOVE-9's nearest rule). */
    static boolean owns(Set<Mode> modes) {
        return modes.contains(Mode.OWN);
    }

    /** TMODE-21, TMODE-22: the one aim the team's shots make a virtual bullet on, or null for both. */
    static VirtualBullet.Aim onlyAim(Set<Mode> modes) {
        if (modes.contains(Mode.HEADON)) return VirtualBullet.Aim.HEAD_ON;
        if (modes.contains(Mode.LINEAR)) return VirtualBullet.Aim.LINEAR;
        return null;
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
