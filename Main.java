public class Main {
    public static void main(String args[]) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("An output");

        // a comment
        System.out.println("hello world");
    }
}