package hadur117.steps;

import io.cucumber.java.Before;

/**
 * Shared mutable state accessible from all step definition classes.
 *
 * <p>Cucumber creates separate instances of each step definition class per scenario,
 * so state cannot be shared through instance fields. This class provides static fields
 * that act as a cross-class communication channel, reset before each scenario.</p>
 */
public class SharedState {

    static double enemyEnergy;
    static double myEnergy;

    @Before
    public void resetSharedState() {
        enemyEnergy = 100.0;
        myEnergy = 100.0;
    }
}
