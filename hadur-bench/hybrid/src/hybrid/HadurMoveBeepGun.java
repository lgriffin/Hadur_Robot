package hybrid;

/**
 * Hybrid 2 (bench only): Hadur's movement (its surfing, shield and per-opponent lines) and radar
 * with BeepBoop 2.0's gun and bullet power. See hadur-bench/hybrid/README.md.
 */
public class HadurMoveBeepGun extends HybridBase {
    @Override
    protected boolean beepMoves() {
        return false;
    }
}
