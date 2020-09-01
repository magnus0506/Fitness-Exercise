public class Person {

    private String name;
    private String cpr;

    public String getName() {
        return name;
    }

    public String getCpr() {
        return cpr;
    }

    public String toString(){
        return name + "" + cpr;
    }

    public Person (String name, String cpr){
        this.cpr = cpr;
        this.name = name;
    }
}


