package hadur2.core.role;

/** How a round ended, as a role is told it (A2). */
public final class RoundResult {

    private final long tick;
    private final String result;

    /**
     * @param tick the tick the round ended on
     * @param result {@code win}, {@code loss} or {@code draw}
     */
    public RoundResult(long tick, String result) {
        this.tick = tick;
        this.result = result;
    }

    public long tick() {
        return tick;
    }

    /** {@code win}, {@code loss} or {@code draw}. */
    public String result() {
        return result;
    }

    /** Whether Hadur won the round. */
    public boolean won() {
        return "win".equals(result);
    }
}
