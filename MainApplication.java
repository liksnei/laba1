package Java.Laba1;
public class MainApplication {
    public static void main(String[] args) throws Exception {

        Food[] breakfast = new Food[20];

        Tea tea = new Tea (null);
        Cheese cheese = new Cheese();
        Apple apple = new Apple(null);

        int itemsSoFar = 0;
        for (String arg: args) {
            String[] parts = arg.split("/");

            if (parts[0].equals("Tea")) {
                breakfast[itemsSoFar] = new Tea(parts[1]);
            } else
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else
            if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }
            itemsSoFar++;
        }

        for (Food item: breakfast)
            if (item!=null)
            {
                if (item.equals(tea)) Tea.Count++;
                if (item.equals(cheese)) Cheese.Count++;
                if (item.equals(apple)) Apple.Count++;
                item.consume();
            }
            else
                break;
        System.out.println("Съедено сыра: " + Cheese.Count);
        System.out.println("Съедено яблок: " + Apple.Count);
        System.out.println("Выпито чая: " + Tea.Count);
        System.out.println("Всего хорошего!");
    }
}
