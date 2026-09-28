package hadur2.core.move;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import hadur2.core.model.BotOrders;
import hadur2.core.model.RobotState;
import hadur2.core.physics.BattleField;
import hadur2.core.physics.MovementPredictor;
import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** RAM-1: the no-wave orbit takes the other side while the rammer response is active. */
class RammerOrbitTest {

    static final BattleField FIELD = new BattleField(800, 600);

    @Test
    @Tag("RAM-1")
    @DisplayName("RAM-1: an active rammer response reverses the orbit's chosen side")
    void activeReversesTheOrbitSide() {
        MoveController moveCtrl = new MoveController(FIELD, new MovementPredictor(FIELD));
        RobotState me = RobotState.newBuilder()
            .setLocation(new Point2D.Double(400, 300)).setHeading(0).setTime(0).build();
        Point2D.Double enemy = new Point2D.Double(400, 150);

        SurfMover plain = new SurfMover(FIELD, new MovementPredictor(FIELD));
        BotOrders.Builder plainOrders = BotOrders.builder();
        plain.move(plainOrders, me, moveCtrl, enemy, 2);
        BotOrders normal = plainOrders.build();

        SurfMover ramming = new SurfMover(FIELD, new MovementPredictor(FIELD));
        ramming.setRammerActive(true);
        BotOrders.Builder ramOrders = BotOrders.builder();
        ramming.move(ramOrders, me, moveCtrl, enemy, 2);
        BotOrders reversed = ramOrders.build();

        assertNotEquals(normal.bodyTurn(), reversed.bodyTurn(), 1e-9,
            "the reversed side should steer a different way: " + normal + " vs " + reversed);
    }
}
