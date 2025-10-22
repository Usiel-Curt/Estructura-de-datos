public class App {
    public static void main(String[] args) throws Exception {
        ArrayQueue<Character> m = new ArrayQueue<>();

        m.offer('A');
        m.offer('B');
        m.poll();
        System.out.println("-----------------");
        m.print();
        m.offer('C');
        m.offer('D');
        m.offer('E');
        m.offer('F');
        System.out.println("-----------------");
        m.print();

    }
}
