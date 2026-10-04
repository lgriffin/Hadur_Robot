package hadurling.core.replay;

import hadurling.core.Core;
import hadurling.core.Guard;
import hadurling.core.model.Event;
import hadurling.core.model.Input;
import hadurling.core.model.Orders;
import hadurling.core.physics.Angles;
import hadurling.core.port.Telemetry;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Makes the committed transcript {@code replay/scripted-duel.txt}. The inputs are a script, not
 * a real battle: two rounds of a made-up duel in which the enemy circles, vanishes for a
 * while and we bump a wall. The orders are what the core said when the file was made.
 *
 * <p>Run it only when the core's behaviour is meant to change:
 * {@code java -cp hadurling-core/target/classes:hadurling-core/target/test-classes
 * hadurling.core.replay.ScriptedBattle hadurling-core/src/test/resources/replay/scripted-duel.txt}</p>
 */
public final class ScriptedBattle {

    private ScriptedBattle() {}

    /** @return the scripted ticks of one round */
    static List<Input> round(int round) {
        List<Input> ticks = new ArrayList<>();
        for (int t = 0; t < 50; t++) {
            List<Event> events = new ArrayList<>();
            boolean visible = t >= 3 && !(t >= 25 && t < 32);
            double heading = (t / 25.0) % 6;
            double bearing = 0.4 * Math.sin((t + round) / 6.0);
            if (visible) {
                events.add(new Event.Scan("sample.Crazy (1)", bearing, 300 - 2 * t, 100 - round,
                    (t / 8.0) % 6, 6));
            }
            // The gun points near the enemy on most ticks, so the core sometimes fires.
            double gunHeading = Angles.normalAbsoluteAngle(heading + bearing + (t % 3 == 0 ? 0.5 : 0.02));
            if (t == 20 + round) events.add(new Event.HitWall(0.0));
            if (t == 40) events.add(new Event.HitByBullet("sample.Crazy (1)", 1.5));
            ticks.add(new Input(t, 200 + 5 * t, 150 + round * 40, heading, 5, 100,
                t % 5 == 0 ? 0 : 0.2, gunHeading, (t / 9.0) % 6, events));
        }
        return ticks;
    }

    /**
     * Writes the transcript.
     *
     * @param args the file to write
     * @throws IOException if the file cannot be written
     */
    public static void main(String[] args) throws IOException {
        List<String> lines = new ArrayList<>();
        lines.add("# A scripted two-round duel. Made by ScriptedBattle; do not edit by hand.");
        for (int round = 0; round < 2; round++) {
            lines.add("R," + round);
            Guard guard = new Guard(new Core()::tick, Telemetry.NONE);
            guard.newRound();
            for (Input in : round(round)) {
                Orders orders = guard.tick(in);
                lines.add(LineCodec.encode(in));
                lines.add(LineCodec.encode(orders));
            }
        }
        Files.write(Path.of(args[0]), lines);
    }
}
