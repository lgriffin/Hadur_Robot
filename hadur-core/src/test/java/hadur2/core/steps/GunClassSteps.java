package hadur2.core.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hadur2.core.gun.GunClassWorld;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

/** Drives the D3 scenarios of the DrussGT route: GUN-5. */
public class GunClassSteps {

    private final GunClassWorld world = new GunClassWorld();

    private static boolean light(String shotClass) {
        return shotClass.equals("light");
    }

    @Given("the {word} gun has been rated best over {int} {word} shots, the others rating nothing")
    public void ratedBest(String gun, int shots, String shotClass) {
        for (String other : new String[] {"main", "anti-surfer", "sampled"}) {
            world.rate(other, other.equals(gun) ? 1.0 : 0.0, light(shotClass), shots);
        }
    }

    @Given("every gun has been rated alike over {int} {word} shots")
    public void ratedAlike(int shots, String shotClass) {
        for (String gun : new String[] {"main", "anti-surfer", "sampled"}) {
            world.rate(gun, 0.5, light(shotClass), shots);
        }
    }

    @Then("the gun fired for a {word} shot is the {word} gun")
    public void gunFired(String shotClass, String gun) {
        assertEquals(gun, world.verdict(light(shotClass)));
    }

    @Then("no gun is rated clearly highest for a {word} shot, so the main gun fires")
    public void noneRated(String shotClass) {
        assertEquals("none", world.verdict(light(shotClass)));
    }

    @Then("the gun fired for a {word} shot is not the sampled gun")
    public void notSampled(String shotClass) {
        String v = world.verdict(light(shotClass));
        if (v.equals("sampled")) throw new AssertionError("the sampled gun won the " + shotClass + " class");
    }
}
