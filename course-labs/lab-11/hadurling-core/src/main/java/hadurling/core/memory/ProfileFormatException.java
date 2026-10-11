package hadurling.core.memory;

/**
 * Stored bytes are not a profile this version can read. A <em>checked</em> exception: every
 * caller of {@link ProfileCodec#decode} must decide what a damaged file means, and the
 * compiler makes sure none forgets.
 */
public final class ProfileFormatException extends Exception {
    private static final long serialVersionUID = 1L;

    /**
     * @param message what is wrong with the bytes
     */
    public ProfileFormatException(String message) {
        super(message);
    }
}
