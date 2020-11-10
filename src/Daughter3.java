public class Daughter3 extends Parent implements Printable {

    private String sokker;


    public Daughter3(String name, int age, String sokker) {
        super(name, age);
        this.sokker = sokker;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() +"Daughter3{" +
                "sokker='" + sokker + '\'' +
                '}';
    }
}
