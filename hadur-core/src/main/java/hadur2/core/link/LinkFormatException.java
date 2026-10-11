package hadur2.core.link;

/** A message that is not a report this build can read: refused whole (LINK-2). */
public final class LinkFormatException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /** @param message what was wrong with the bytes */
    public LinkFormatException(String message) {
        super(message);
    }
}
