package Collections.Collection;

public class Room {

    String name;
    String suite;
    int number;

    public Room(String name, String suite, int number) {
        this.name = name;
        this.suite = suite;
        this.number = number;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
