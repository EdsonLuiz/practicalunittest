package org.example.ch04;

public class FootballTeam implements Comparable<FootballTeam> {
    private int gamesWon;
    public FootballTeam(int gamesWon) {
        if(gamesWon < 0)
            throw new IllegalArgumentException("Not possible to have less than 0 games won! (was " + gamesWon + ")");
        this.gamesWon = gamesWon;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    @Override
    public int compareTo(FootballTeam otherTeam) {
        if (gamesWon > otherTeam.getGamesWon())
            return 1;
        else if(gamesWon < otherTeam.getGamesWon())
            return -1;

        return 0;
    }
}
