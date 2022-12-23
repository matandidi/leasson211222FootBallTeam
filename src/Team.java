public class Team {
    private String name;
    private Footballer[] squad;


    public Team (String name, Footballer [] squad) {
        this.name = name;
        this.squad = squad;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        String output= "";
        output += "Name: " + this.name + "\n";
        output += "Squad size " + this.squad.length + "\n";
        return output;

    }
}
