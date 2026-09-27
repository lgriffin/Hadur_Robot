package hadur2.core.melee;

/**
 * Bytes that are not a valid melee profile block: wrong magic or version, truncated, bad
 * checksum or bad values (MMEM-1). The only exception {@link MeleeProfileCodec#decode} throws.
 */
public final class MeleeProfileFormatException extends RuntimeException {

    public MeleeProfileFormatException(String message) {
        super(message);
    }
}
