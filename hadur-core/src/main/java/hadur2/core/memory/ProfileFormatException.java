package hadur2.core.memory;

/** Bytes that are not a valid profile: wrong magic or version, truncated, bad checksum or bad values. */
public final class ProfileFormatException extends RuntimeException {

    public ProfileFormatException(String message) {
        super(message);
    }
}
