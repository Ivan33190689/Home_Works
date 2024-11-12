public class Main {
    public static void main(String[] args) {
        int cofeeAmountGramm = 1;
        int milkAmount = 3210;
       int skimmedMilkAmount = 1;

       boolean isBloked = true;

        int cappucinoMilkRequired = 60;
        int cappucinoCofeeRequired = 15;

        boolean milkIsEnough = skimmedMilkAmount >= cappucinoMilkRequired || milkAmount >= cappucinoMilkRequired;
        boolean cofeeIsEnough = cofeeAmountGramm >= cappucinoCofeeRequired;

        boolean hasErrors = false;

        if (isBloked) {
            System.out.println("Кофемашина заблокирована");
            hasErrors = true;
        }

        if (!cofeeIsEnough) {
            System.out.println("Недостаточно кофе");
            hasErrors = true;
        }

        if (!milkIsEnough) {
            System.out.println("Недостаточно молока");
            hasErrors = true;
        }

        if (!hasErrors) {
            System.out.println("Готовим кофе");
        }
    }
}
