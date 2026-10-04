package hadurling.core.policy;

/**
 * What this battle has shown about the opponent we are fighting: how often our shots found
 * it and how often its shots found us, as two {@link HitWindow}s. It belongs to the battle,
 * not the round, so the robot keeps one across rounds; and it forgets everything when the
 * opponent changes. Live evidence starts from nothing each battle on purpose: a profile is a
 * guess about the last time, and what happens now overrules it.
 */
public final class Evidence {

    private final HitWindow ours = new HitWindow();
    private final HitWindow theirs = new HitWindow();
    private String opponent = "";

    /**
     * Declares who we are fighting; clears both windows if it is not who they were about.
     *
     * @param key the opponent's lineage key
     */
    public void against(String key) {
        if (!key.equals(opponent)) {
            ours.clear();
            theirs.clear();
            opponent = key;
        }
    }

    /** @return our shots at the opponent */
    public HitWindow ours() { return ours; }

    /** @return the opponent's shots at us */
    public HitWindow theirs() { return theirs; }
}
