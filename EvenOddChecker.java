public class EvenOddChecker {
    public void checker(int number) {
        System.out.println((number % 2 == 0 ? "Even" : "Odd"));
    }

    public static void main(String args[]) {
        EvenOddChecker check = new EvenOddChecker();
        check.checker(7);
    }
}