package org.example.ch04;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class FootballTeamTest {
    private static final int THREE_GAMES_WON = 3;
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 3, 10})
    void constructorShouldSetGamesWon(int nbOfGamesWon) {
        FootballTeam team = new FootballTeam(nbOfGamesWon);

        assertThat(team.getGamesWon())
                .as("number of games won")
                .isEqualTo(nbOfGamesWon);
    }

    @ParameterizedTest
    @ValueSource(ints = {-10, -1})
    void constructorShouldThrowExceptionForIllegalGamesNb(int illegalNbOfGames) {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {new FootballTeam(illegalNbOfGames);});
    }
}
