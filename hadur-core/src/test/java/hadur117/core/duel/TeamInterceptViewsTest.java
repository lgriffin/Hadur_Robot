package hadur117.core.duel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** TMODE-53: the intercept views' team-only switch reaches team members alone. */
class TeamInterceptViewsTest {

    @Test
    @Tag("TMODE-53")
    @DisplayName("TMODE-53: off a team only MOVE-52's switch decides; on a team the team switch also turns the intercept views on")
    void teamOnly() {
        assertEquals(MoveDesign.INTERCEPT_VIEWS, DuelController.interceptViews(false), "1v1 and melee read MOVE-52's switch alone");
        assertEquals(MoveDesign.INTERCEPT_VIEWS || MoveDesign.TEAM_INTERCEPT_VIEWS, DuelController.interceptViews(true));
    }
}
