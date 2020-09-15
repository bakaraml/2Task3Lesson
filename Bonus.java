public class Bonus {
    public static void main(String[] args) {
        double transfer = 100.00;
        int bonus;
        if (transfer > 1000) {
             bonus = 1;
        } else {
             bonus = 0;
        }
        long balance = 100;
        double total = (transfer * bonus / 100 + balance) + (transfer);
        double totalBonus = transfer * bonus / 100;
        System.out.println("Бонус клиента для начисления " + totalBonus);
        System.out.println("Баланс клиента равен " + total);
    }
}