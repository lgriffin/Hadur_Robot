package hadur2.core.port;

import java.util.List;
import java.util.function.Predicate;

/**
 * A {@link ProfileStore} with a gate on writes and deletes (A4): a write or delete the gate
 * refuses never reaches the store, and is counted. Reads are never gated. The conductor's
 * Archive asks {@link #mayWrite} before it lets a shelf save, so a gated save is never
 * attempted; a delete a library makes on its own, such as an eviction, is refused quietly
 * and counted (SHELF-1, SHELF-3, and from A5 SHELF-2).
 */
public final class GatedProfileStore implements ProfileStore {

    private final ProfileStore store;
    private final Predicate<String> gate;
    private int gated;

    /**
     * @param store the store behind the gate
     * @param gate whether an entry of this name may be written or deleted
     */
    public GatedProfileStore(ProfileStore store, Predicate<String> gate) {
        this.store = store;
        this.gate = gate;
    }

    /** Whether {@code name} may be written or deleted. */
    public boolean mayWrite(String name) {
        return gate.test(name);
    }

    /** Writes and deletes refused so far. */
    public int gated() {
        return gated;
    }

    @Override
    public byte[] read(String name) {
        return store.read(name);
    }

    @Override
    public void write(String name, byte[] bytes) {
        if (!gate.test(name)) {
            gated++;
            return;
        }
        store.write(name, bytes);
    }

    @Override
    public void delete(String name) {
        if (!gate.test(name)) {
            gated++;
            return;
        }
        store.delete(name);
    }

    @Override
    public List<String> names() {
        return store.names();
    }

    @Override
    public long bytesUsed() {
        return store.bytesUsed();
    }

    @Override
    public long quota() {
        return store.quota();
    }

    @Override
    public long size(String name) {
        return store.size(name);
    }

    @Override
    public long lastModified(String name) {
        return store.lastModified(name);
    }
}
