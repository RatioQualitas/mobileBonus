public class Main {
    public static void main(String[] args) {
        int startAmount = 200;
        int replanishmentAmount = 2567;


        int bonusAmount;
        if (replanishmentAmount > 1000) {
            bonusAmount = (replanishmentAmount / 100);
        } else {
            bonusAmount = 0;
        }
        System.out.println("Сумма бонусных рублей:" + bonusAmount);
    }
}
