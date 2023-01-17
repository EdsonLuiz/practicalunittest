package org.example.ch04;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class FootballTeamTest {
    @Test
    void constructorShouldSetGamesWon() {
        FootballTeam team = new FootballTeam(3);

        assertThat(team.getGamesWon())
                .as("number of games won")
                .isEqualTo(3);
    }
}
