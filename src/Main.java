public class Main {
    public static void main(String[] args) {
        int price_ticket = 2500;
        int amount = 20;
        
        int miles;

        if (amount >=20) {
            miles = price_ticket / amount;
        } else miles = 0;

        System.out.println("Количество начисленных миль: " + miles);
    }
}