public class JustJava {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(System.getProperty("java.version"));
        Thread.sleep(3000);
        System.out.println("Hello, Java!");
        for (char c = 'A'; c <= 'z'; c++) {
            System.out.print(c);
        }
        System.out.println("Counting 2 by 2 in a for loop: ");
        int counter = 0;
        int limit = 1000;
        while (counter <= limit) {
           System.out.println(counter);
           counter += 2;
           Thread.sleep(500);
        }
        
    }
}
