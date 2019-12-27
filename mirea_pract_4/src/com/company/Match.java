package com.company;

public class Match {
    private int milanGoals;
    private int madridGoals;
    private String lastScorer;
    private String winner;

    public Match (int milanGoals, int madridGoals, String lastScorer, String winner){
        this.madridGoals = madridGoals;
        this.milanGoals = milanGoals;
        this.lastScorer = lastScorer;
        this.winner = winner;
    }
    public int getMilanGoals() {
        return milanGoals;
    }
    public int getMadridGoals() {
        return madridGoals;
    }
    public String getLastScorer() {
        return lastScorer;
    }
    public String getWinner() {
        return winner;
    }
    public void setMilanGoals(int goal) {
        this.milanGoals += goal;
        setLastScorer("AC Milan");
    }
    public void setMadridGoals(int goal) {
        this.madridGoals += goal;
        setLastScorer("Real Madrid");
    }
    public void setLastScorer(String lastScorer) {
        this.lastScorer = lastScorer;
    }
    public void setWinner(String winner) {
        this.winner = winner;
    }
}
