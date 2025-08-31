package naukridsa.oops;

public class Encapsulation {
    public static void main(String[] args) {
        Encapsule e = new Encapsule();
        e.setName("Surya");
        e.setId(100330);

        System.out.println("Name is: "+e.getName()+"\nId is: "+ e.getId());
    }
}

class Encapsule {
    private String name;
    private int id;

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setId(int newId) {
        id = newId;
    }
}
