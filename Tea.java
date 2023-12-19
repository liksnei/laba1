package Java.Laba1;

public class Tea extends Food {
    private String color;

    static int Count = 0;
    public Tea(String color) {
        super("Чай");
        this.color = color;
    }
    public void consume() {
        System.out.println(this + " выпит");
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return super.toString() + " цвета '" + color.toUpperCase() + "'";
    }

    /*public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Tea)) return false; // Шаг 2
            return color.equals(((Tea)arg0).color); // Шаг 3
        } else
            return false;
    }*/
}
