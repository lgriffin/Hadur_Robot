/**
 * Opponent memory (stage S3): one {@link hadur2.core.memory.OpponentProfile} per opponent
 * lineage, folded from each round's observations (MEM-2), encoded in a small checksummed
 * binary format ({@link hadur2.core.memory.ProfileCodec}) and kept in a
 * {@link hadur2.core.port.ProfileStore} by the {@link hadur2.core.memory.ProfileLibrary}
 * (MEM-1, MEM-3 to MEM-5, RES-3).
 *
 * <p>S3 records and persists; nothing here changes how Hadur fights yet. S4 reads the
 * profile's tiers and seeds to set the opening book.</p>
 */
package hadur2.core.memory;
