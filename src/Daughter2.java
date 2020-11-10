public class Daughter2 extends Parent implements Printable{

    private String hokkey;

    public Daughter2(String name, int age, String hokkey) {
        super(name, age);
        this.hokkey = hokkey;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString()+ "Daughter2{" +
                "hokkey='" + hokkey + '\'' +
                '}';
    }
}
