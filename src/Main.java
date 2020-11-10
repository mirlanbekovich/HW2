public class Main {

    public static void main(String[] args) {
        createObject("1").print();
        createObject("2").print();
        createObject("3").print();

    }

    public static Printable createObject(String classNAme){
        Printable print = null;
        switch (classNAme){
            case "1":
                print= new Daughter1("ДАша", 10, "Бег");
                break;

            case "2":
                print = new Daughter2("Аня", 16, "Хоккей");
                break;

            case "3":
                print = new Daughter3("Саша", 23, "бЕГ");
                break;
        }
        return print;


    }

}
