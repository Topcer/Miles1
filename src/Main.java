public class Main {
    public static void main(String[] args) {
        int priceTicket = 2500;
        int amount = 20;
        
        int miles;

        if (amount >=20) {
            miles = priceTicket / amount;
        } else {
            miles = 0;
        }
        System.out.println("Количество начисленных миль: " + miles);
    }
}