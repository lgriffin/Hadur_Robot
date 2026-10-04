package hadurling.core.replay;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import hadurling.core.model.Event;
import hadurling.core.model.Input;
import hadurling.core.model.Orders;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LineCodecTest {

    @Test
    @DisplayName("a robot name with spaces and brackets survives")
    void realisticName() {
        Input in = new Input(3, 1, 2, 0, 0, 100, 0, 0, 0,
            List.of(new Event.Scan("sample.Crazy (1)", 0.5, 100, 90, 1, 8)));
        assertEquals(in, LineCodec.decodeInput(LineCodec.encode(in)));
    }

    @Test
    @DisplayName("the line looks as documented")
    void format() {
        Orders o = Orders.builder().ahead(100).fire(1).build();
        assertEquals("O,NaN,100.0,NaN,NaN,1.0", LineCodec.encode(o));
    }

    @Test
    @Tag("HL-8")
    @DisplayName("the tick time and skipped turn events are written as T and K and read back")
    void timingEvents() {
        Input in = new Input(9, 1, 2, 0, 0, 100, 0, 0, 0,
            List.of(new Event.TickTime(2_500_000L), new Event.SkippedTurn()));
        String line = LineCodec.encode(in);
        assertEquals("I,9,1.0,2.0,0.0,0.0,100.0,0.0,0.0,0.0,T:2500000;K", line);
        assertEquals(in, LineCodec.decodeInput(line));
    }

    @Test

    @Tag("HL-7")
    @DisplayName("malformed lines are rejected with IllegalArgumentException")
    void malformed() {
        for (String line : List.of("", "X,1", "I,1,2", "I,a,b,c,d,e,f,g,h,i,", "O,1,2,3", "O,a,b,c,d,e",
                "I,1,1,1,1,1,1,1,1,1,Q:1", "I,1,1,1,1,1,1,1,1,1,S:x:1")) {
            assertThrows(IllegalArgumentException.class, () -> LineCodec.decodeInput(line), line);
            assertThrows(IllegalArgumentException.class, () -> LineCodec.decodeOrders(line), line);
        }
    }
}
