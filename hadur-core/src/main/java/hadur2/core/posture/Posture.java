package hadur2.core.posture;

/** The set of subsystems that drives the robot for a tick. The two are never mixed. */
public enum Posture {
    /** The 1v1 core: wave surfing, the duel gun, the lock radar, opponent memory. */
    DUEL,
    /** The melee subsystems: sweep radar, minimum-risk movement, the melee gun. */
    MELEE
}
