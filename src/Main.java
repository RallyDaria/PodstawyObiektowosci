public class Main {
    public static void main(String[] args) {

        Rabbit rabbit1=new Rabbit(25, "Heniek",true);
        rabbit1.setName("Kiziol");
        rabbit1.getName();
        System.out.println(rabbit1.getName());
        rabbit1.setSoftness(false);
        System.out.println(rabbit1.isSoftness());
        rabbit1.setLenght(30);
        System.out.println(rabbit1.getLenght());

    }
}
