public class Main {
    public static void main(String[] args) {
        int price_ticket = 10000;
        int amount = 20;

        int miles = price_ticket / amount;

        System.out.printf("Количество начисленных миль: " + miles);

    }
}