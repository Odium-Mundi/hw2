public class rub {
    public static void main(String[]args) {
        int current_account = 0, bonus = 0, replenishment_amount = 2000 ;
        if ( replenishment_amount >= 1000 ) {
            bonus = replenishment_amount / 100;
        }
        System.out.println("Ваш счет: " + (current_account + replenishment_amount + bonus));
    }
}
