package hadur2.core;

import hadur2.core.memory.ProfileLibrary;
import hadur2.core.port.GatedProfileStore;
import hadur2.core.port.ProfileStore;
import hadur2.core.role.Charter;
import hadur2.core.role.RoleId;

/**
 * The conductor's facade over memory (A4): it hands each brain its shelf, or none, by
 * charter, behind one gate on the store's writes and deletes.
 *
 * <ul>
 * <li>A shelf belongs to one strand: the {@code .hp} profiles and the battle clock to the
 *     Duel, the {@code .hm} blocks to Melee and the {@code .ht} blocks to Team. Anything else,
 *     the health record, is the conductor's.</li>
 * <li>SHELF-3: a shelf is written only in its own charter's battle, so a melee writes no
 *     {@code .hp} file and a team battle neither {@code .hp} nor {@code .hm}. Any shelf may be
 *     read in any charter: the melee hand-off reads the survivor's {@code .hp} profile.</li>
 * <li>SHELF-1: a shelf is written only on behalf of its own strand's role, which the gate
 *     enforces by file name whoever asks.</li>
 * <li>SHELF-2: in a team battle only the leader, the team's scribe fixed at tick 0, writes
 *     or deletes anything, the health record included: five members share one data
 *     directory, and each counts its own quota.</li>
 * </ul>
 */
final class Archive {

    private final Charter charter;
    private final GatedProfileStore store;
    /** SHELF-2: whether this member may write at all; always off a team. */
    private final boolean scribe;

    /**
     * @param store the adapter's store, or null for none
     * @param charter the battle's charter
     */
    Archive(ProfileStore store, Charter charter) {
        this(store, charter, true);
    }

    /**
     * @param store the adapter's store, or null for none
     * @param charter the battle's charter
     * @param scribe whether this member writes for its team: in a team battle only the leader
     */
    Archive(ProfileStore store, Charter charter, boolean scribe) {
        this.charter = charter;
        this.scribe = charter != Charter.TEAM || scribe;
        boolean writer = this.scribe;
        this.store = store == null ? null : new GatedProfileStore(store, name -> writer && mayWrite(charter, name));
    }

    /** The strand whose shelf holds {@code file}; null for the conductor's own files. */
    static RoleId shelfOf(String file) {
        String name = file.endsWith(".tmp") ? file.substring(0, file.length() - 4) : file;
        if (name.endsWith(ProfileLibrary.PROFILE_SUFFIX) || name.equals(ProfileLibrary.CLOCK)) return RoleId.DUEL;
        if (name.endsWith(MeleeMemory.SUFFIX)) return RoleId.MELEE;
        if (name.endsWith(".ht")) return RoleId.TEAM;
        return null;
    }

    /** SHELF-3: whether a {@code charter} battle may write or delete {@code file}. */
    static boolean mayWrite(Charter charter, String file) {
        RoleId shelf = shelfOf(file);
        return shelf == null || shelf == ownShelf(charter);
    }

    /** The one shelf a charter's battle writes. */
    static RoleId ownShelf(Charter charter) {
        switch (charter) {
            case DUEL: return RoleId.DUEL;
            case MELEE: return RoleId.MELEE;
            default: return RoleId.TEAM;
        }
    }

    /** Whether this battle writes {@code shelf}: the question asked before any save. */
    boolean writes(RoleId shelf) {
        return store != null && scribe && shelf == ownShelf(charter);
    }

    /** SHELF-2: whether this member writes the conductor's own files, the health record. */
    boolean scribe() {
        return store != null && scribe;
    }

    /** The store behind the gate, or null for none. */
    ProfileStore store() {
        return store;
    }

    /** The Duel's {@code .hp} library: only in a Duel charter, as today. */
    ProfileLibrary duelShelf() {
        return store != null && charter == Charter.DUEL ? new ProfileLibrary(store) : null;
    }

    /** The melee blocks, in every charter with the Melee role; written only in a melee. */
    MeleeMemory meleeShelf() {
        return store != null && charter.has(RoleId.MELEE) ? new MeleeMemory(store) : null;
    }

    /** The survivors' 1v1 profiles, read and never written, in every charter with Melee. */
    ProfileLibrary survivorShelf() {
        return store != null && charter.has(RoleId.MELEE) ? new ProfileLibrary(store) : null;
    }

    /** Writes and deletes the gate refused this battle. */
    int gated() {
        return store == null ? 0 : store.gated();
    }
}
