package hadurling.core.memory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * What Hadurling knows about one opponent, kept between battles. Immutable.
 *
 * <ul>
 * <li>{@code rounds}: rounds fought against it;</li>
 * <li>{@code theirShots}, {@code theirHits}: its bullets whose waves have passed us, and how
 *     many hit (its hit rate on us);</li>
 * <li>{@code ourShots}, {@code ourHits}: our shots' waves that have reached it, and how many
 *     we had aimed at (our virtual hit rate on it). <em>Added in format version 2.</em></li>
 * <li>{@code seed}: up to {@link #MAX_SEED} learned samples for the gun, each
 *     {@link #SEED_WIDTH} floats: sideways speed, distance, guess factor. <em>Version 2.</em></li>
 * </ul>
 *
 * <p>Nothing here is checked against the codec's limits except what a value needs to make
 * sense: counts are not negative, hits do not exceed shots, the seed is bounded and finite.</p>
 */
public final class Profile {

    /** The floats in one seed sample. */
    public static final int SEED_WIDTH = 3;
    /** The most seed samples kept. */
    public static final int MAX_SEED = 100;

    private final String key;
    private final int rounds;
    private final int theirShots;
    private final int theirHits;
    private final int ourShots;
    private final int ourHits;
    private final List<float[]> seed;

    /**
     * A profile.
     *
     * @param key the lineage key, 1 to {@link LineageKey#MAX_LENGTH} characters
     * @param rounds rounds fought
     * @param theirShots their shots resolved
     * @param theirHits of which hit us
     * @param ourShots our shots resolved
     * @param ourHits of which we had aimed at
     * @param seed the gun's samples, at most {@link #MAX_SEED}, each of {@link #SEED_WIDTH}
     *     finite floats; copied
     * @throws IllegalArgumentException if any of that is not so
     */
    public Profile(String key, int rounds, int theirShots, int theirHits, int ourShots,
            int ourHits, List<float[]> seed) {
        if (key.isEmpty() || key.length() > LineageKey.MAX_LENGTH) throw new IllegalArgumentException("key length " + key.length());
        if (rounds < 0 || theirShots < 0 || ourShots < 0) throw new IllegalArgumentException("negative count");
        if (theirHits < 0 || theirHits > theirShots || ourHits < 0 || ourHits > ourShots) {
            throw new IllegalArgumentException("hits out of range");
        }
        if (seed.size() > MAX_SEED) throw new IllegalArgumentException("seed of " + seed.size());
        List<float[]> copy = new ArrayList<>();
        for (float[] s : seed) {
            if (s.length != SEED_WIDTH) throw new IllegalArgumentException("sample width " + s.length);
            for (float f : s) {
                if (Float.isNaN(f) || Float.isInfinite(f)) throw new IllegalArgumentException("sample value " + f);
            }
            copy.add(s.clone());
        }
        this.key = key;
        this.rounds = rounds;
        this.theirShots = theirShots;
        this.theirHits = theirHits;
        this.ourShots = ourShots;
        this.ourHits = ourHits;
        this.seed = copy;
    }

    /**
     * A profile of an opponent we have never met.
     *
     * @param key the lineage key
     * @return a profile with nothing in it
     */
    public static Profile stranger(String key) {
        return new Profile(key, 0, 0, 0, 0, 0, List.of());
    }

    /**
     * This profile after one more round.
     *
     * @param theirShots their shots resolved this round
     * @param theirHits of which hit us
     * @param ourShots our shots resolved this round
     * @param ourHits of which we had aimed at
     * @param newSeed the gun's samples now; replaces the old seed, and is cut to the
     *     {@link #MAX_SEED} most recent
     * @return the new profile
     */
    public Profile afterRound(int theirShots, int theirHits, int ourShots, int ourHits, List<float[]> newSeed) {
        List<float[]> recent = newSeed.size() > MAX_SEED
            ? newSeed.subList(newSeed.size() - MAX_SEED, newSeed.size()) : newSeed;
        return new Profile(key, rounds + 1, this.theirShots + theirShots, this.theirHits + theirHits,
            this.ourShots + ourShots, this.ourHits + ourHits, recent);
    }

    /** @return the lineage key */
    public String key() { return key; }
    /** @return rounds fought */
    public int rounds() { return rounds; }
    /** @return their shots resolved */
    public int theirShots() { return theirShots; }
    /** @return of which hit us */
    public int theirHits() { return theirHits; }
    /** @return our shots resolved (format version 2) */
    public int ourShots() { return ourShots; }
    /** @return of which we had aimed at (format version 2) */
    public int ourHits() { return ourHits; }

    /** @return a copy of the gun's samples (format version 2) */
    public List<float[]> seed() {
        List<float[]> out = new ArrayList<>();
        for (float[] s : seed) out.add(s.clone());
        return out;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Profile)) return false;
        Profile p = (Profile) o;
        if (!key.equals(p.key) || rounds != p.rounds || theirShots != p.theirShots || theirHits != p.theirHits
                || ourShots != p.ourShots || ourHits != p.ourHits || seed.size() != p.seed.size()) {
            return false;
        }
        for (int i = 0; i < seed.size(); i++) {
            if (!Arrays.equals(seed.get(i), p.seed.get(i))) return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int h = Objects.hash(key, rounds, theirShots, theirHits, ourShots, ourHits);
        for (float[] s : seed) h = 31 * h + Arrays.hashCode(s);
        return h;
    }

    @Override
    public String toString() {
        return "Profile[" + key + ", rounds=" + rounds + ", their " + theirHits + "/" + theirShots
            + ", our " + ourHits + "/" + ourShots + ", seed=" + seed.size() + "]";
    }
}
