public class Main {
    public static void main(String[] args) {

        int balance = 300;
        int refill = 1300;
        int bonus = 1;

        if (refill >= 1000) {
            System.out.println("Ваш баланс: " + (balance + refill + (refill / 100 * bonus)) + " руб.");
        } else {
            System.out.println("Ваш баланс: " + (balance + refill) + " руб.");
        }
    }
}