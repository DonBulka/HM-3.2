public class Main {
    public static void main(String[] args) {
        int account = 200;
        int payment = 1100;

        int bonus = 0;
        if (payment > 1000) {
            bonus = payment / 100;
        }
        System.out.println("Сумма начислена на счёт: " + payment);
        System.out.println("Бонусов начислено: " + bonus);
        System.out.println("Итоговая сумма на ачисления на счет: " + (account + payment + bonus));

    }
}