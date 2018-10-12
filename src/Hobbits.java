public class Hobbits {
    String name;
    public static void main(String [] args) {
        Hobbits [] h = new Hobbits[3];
        h[1] = new Hobbits();
        h[2] = new Hobbits();
        h[0] = new Hobbits();
        int z = 0;
        while (z < 4) {
            z = z + 1;
            h[z].name = "bilbo";
            if (z == 1)
                h[z].name = "Frodo";
            if (z == 2) {
                h[z].name = "am";
            }
            System.out.print(h[z].name + "\tis a");
            System.out.println("good Hobbit name");
        }
    }
}