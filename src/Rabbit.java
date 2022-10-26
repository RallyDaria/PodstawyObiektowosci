public class Rabbit {

    private int lenght;
    private String name;
    private boolean softness;

    public Rabbit(int lenght, String name, boolean softness) {
        this.lenght = lenght;
        this.name = name;
        this.softness = softness;
    }

    public int getLenght() {
        return lenght;
    }

    public String getName() {
        return name;
    }

    public boolean isSoftness() {
        return softness;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSoftness(boolean softness) {
        this.softness = softness;
    }

}
