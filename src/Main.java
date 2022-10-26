public class Main {
    public static void main(String[] args) {

        Rabbit rabbit1=new Rabbit(25, "Heniek",true);
        rabbit1.changeName("Kiziol");
        rabbit1.viewName();
        System.out.println(rabbit1.viewName());
    }
}
