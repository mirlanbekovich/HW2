public class Daughter1 extends Parent implements Printable {

    private String marafon;

    public Daughter1(String name, int age, String marafon) {
        super(name, age);
        this.marafon = marafon;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString()+"Daughter1{" +
                "marafon='" + marafon + '\'' +
                '}';
    }
}
