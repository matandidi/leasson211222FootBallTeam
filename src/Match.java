public class Match {
    private Team homeTeam;
    private Team awayTeam;
    private int homeGoals;
    private int awayGoals;
    private int status;

    public static final int NOT_STARTED = 10;
    public static final int RUNNING = 20;
    public static final int DONE = 30;

    public Match (Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeGoals = 0;
        this.awayGoals = 0;
        this.status = NOT_STARTED;
    }

    public boolean startGame () {
        boolean success = false;
        if (this.status == NOT_STARTED) {
            this.status = RUNNING;
            success = true;
        }
        return success;
    }

    public boolean endGame() {
        boolean success = false;
        if (this.status == RUNNING) {
            this.status = DONE;
            success = true;
        }
        return success;
    }

    public String toString () {
        String output = "";
        output += "Home team: " + this.homeTeam.getName() + " " + this.homeGoals;
        output += "Away team: " + this.awayTeam.getName() + " " + this.awayGoals;
        output += " (" + this.getPrintableStatus() + ") ";

        return output;
    }

    private String getPrintableStatus() {
        String output = "";
        switch (this.status) {
            case NOT_STARTED -> output = "Not started";
            case RUNNING -> output = "Running";
            case DONE -> output = "Done";
        }
        return output;

    }

}
