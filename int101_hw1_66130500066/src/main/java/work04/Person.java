package work04;
public class Person {
    private int id;

    // Constructor
    public Person(int id){ this.id = id;}

    // Getter Setter
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

//    Override
    @Override
    public String toString() {
        return "Person(" + id +")";
    }
}
