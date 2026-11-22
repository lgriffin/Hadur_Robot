package hybrid;

/**
 * Hybrid 1 (bench only): BeepBoop 2.0's movement (its surfing, and its bullet shield where its
 * strategy picks it) with Hadur's gun, power and radar. See hadur-bench/hybrid/README.md.
 */
public class BeepMoveHadurGun extends HybridBase {
    @Override
    protected boolean beepMoves() {
        return true;
    }
}
