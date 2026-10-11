package hadur2.core.gun;

import hadur2.core.physics.BattleField;

/**
 * Test support for the GUN-5 Cucumber steps (package {@code hadur2.core.steps}): a public
 * door onto {@link GunController}'s package-private rating seams, so a scenario can say which
 * guns rated best in which power class and ask which gun the controller would fire.
 */
public final class GunClassWorld {

    private static final String BOT = "abc.Shadow 3.83c";

    private final GunController gun = new GunController(new BattleField(800, 600), 1);

    /** {@code shots} virtual shots of {@code gun} scoring {@code score} each, in one class. */
    public void rate(String gunName, double score, boolean light, int shots) {
        GunController.Opening which = GunController.Opening.valueOf(gunName.toUpperCase().replace('-', '_'));
        for (int i = 0; i < shots; i++) gun.recordVirtualShotForTest(BOT, which, score, light);
    }

    /** The gun the ratings name for the class, lower case with hyphens; "none" while none is clear. */
    public String verdict(boolean light) {
        GunController.Opening v = gun.liveVerdict(BOT, light);
        return v == null ? "none" : v.name().toLowerCase().replace('_', '-');
    }
}
