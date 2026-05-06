package hadur117.model;

/**
 * Classification of an opponent's observed movement pattern.
 *
 * <p>Determined by {@link hadur117.intel.Brain#update Brain.update()} using heading-change
 * variance, velocity reversal rate, and wave-surfer correlation analysis.</p>
 */
public enum MovementType {
    STOPPED, LINEAR, CIRCULAR, OSCILLATING, RANDOM, WAVE_SURFER, UNKNOWN
}
