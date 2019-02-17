package zin.sami.demo3;

public class PersonClass {
    String name;
    int ID;

    PersonClass(String name1, int ID1) {
        name = name1;
        ID = ID1;
    }

    @Override
    public String toString() {
        return name + " "+ ID;
    }
}



