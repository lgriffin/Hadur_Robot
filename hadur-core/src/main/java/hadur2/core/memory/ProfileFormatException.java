package hadur2.core.memory;

/**
 * Bytes that are not a valid profile: wrong magic or version, truncated, bad checksum or bad values.
 *
 * <p>This is the only exception {@link ProfileCodec#decode} lets out, whatever the input
 * (it wraps any other {@code RuntimeException} in one). {@link ProfileLibrary} catches it
 * and treats the opponent as a stranger, counting a load failure (MEM-4).</p>
 */
public final class ProfileFormatException extends RuntimeException {

    /**
     * A decoding failure.
     *
     * @param message what was wrong and, where known, at which byte or field
     */
    public ProfileFormatException(String message) {
        super(message);
    }
}
