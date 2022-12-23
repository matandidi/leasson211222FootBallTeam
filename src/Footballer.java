public class Footballer {
    private String name;
    private Integer role;
    private int goals;
    private Integer birthYear;
    private Integer shirt;
    public static final int GOALKEEPER = 1;
    public static final int DEFENDER = 2;
    public static final int MIDFIELDER = 3;
    public static final int STRIKER = 4;
    public static final int UNKNOWN = 10;
    public static final int MIN_BIRTH_YEAR = 1990;
    public static final int MAX_BIRTH_YEAR = 2005;
    public static final int MIN_SHIRT_NUMBER = 1;
    public static final int MAX_SHIRT_NUMBER = 30;




    public Footballer(String name, Integer role, Integer birthYear, Integer shirt) {
        this.name = name;
        if (this.isValidRole(role)) {
            this.role = role;
        } else {
            this.role = UNKNOWN;
        }
        this.goals = 0;
        if (this.isValidBirthYear(birthYear)) {
            this.birthYear = birthYear;
        }
        if (this.isValidShirtNumber(shirt)) {
            this.shirt = shirt;
        }
    }

    private boolean isValidRole (Integer role){
        boolean valid = false;
        if (role == GOALKEEPER || role == DEFENDER || role == MIDFIELDER || role == STRIKER) {
            valid = true;
        }
        return valid;
    }

    private boolean isValidBirthYear (Integer birthYear){
        boolean valid = false;
        if (birthYear >= MIN_BIRTH_YEAR && birthYear <= MAX_BIRTH_YEAR) {
            valid = true;
        }
        return valid;
    }

    private boolean isValidShirtNumber (Integer shirt){
        boolean valid = false;
        if (shirt >= MIN_SHIRT_NUMBER && shirt <= MAX_SHIRT_NUMBER) {
            valid = true;
        }
        return valid;
    }

    public String toString() {
        String output = "";
        output += "Name: " + this.name;
        if (this.shirt != null) {
            output += " (" + this.shirt + ")";
        }
        output += "\n";
        output += "Role: " + this.getPrintableRole() + "\n";
        output += "Scored " + this.goals + " goals so far\n";
        if (this.birthYear != null){
            output += "Born in " + this.birthYear;
        }
        return output;
    }

    private String getPrintableRole() {
        String printableRole = "";
        if (this.role == GOALKEEPER) {
            printableRole = "Goalkeeper";
        } else if (this.role == DEFENDER) {
            printableRole = "Defender";
        } else if (this.role == MIDFIELDER) {
            printableRole = "Midfielder";
        } else if (this.role == STRIKER) {
            printableRole = "Striker";
        } else {
            printableRole = "Unknown";
        }
        return printableRole;
    }

}
