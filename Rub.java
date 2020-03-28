public class Rub {
    public static void main(String[] args) {
        int currentAccount = 0, bonus = 0, replenishmentAmount = 2000;
        if (replenishmentAmount >= 1000) {
            bonus = replenishmentAmount / 100;
        }
        System.out.println("Ваш счет: " + (currentAccount + replenishmentAmount + bonus));
    }
}
