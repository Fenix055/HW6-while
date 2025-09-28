public class Main {
    public static void main(String[] args) {
        /// Task 1
        int bank = 0;
        short month = 0;

        while (bank < 2_459_000) {
            bank += 15_000;
            month++;
        }

        System.out.println("Месяц " + month + ", сумма накоплений равна " + bank + " рублей");

        /// Task 2
        byte i = 0;

        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        /// Task 3
        int year = 0;
        int human = 12_000_000;
        float death = 0.008f;
        float born = 0.017f;

        while (year < 10) {
            human *= (1 + born - death);
            year++;
        }
        System.out.println("Год " + year + ", численность населения составляет " + human);

        /// Task 4
        bank = 15_000;
        month = 0;

        while (bank < 12_000_000) {
            bank *= 1.07;
            month++;
            System.out.println("Месяц " + month + " сумма " + bank);
        }

        /// Task 5
        bank = 15_000;
        month = 0;

        while (bank < 12_000_000) {
            bank *= 1.07;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма " + bank);
            }
        }

        /// Task 6
        bank = 15_000;
        month = 0;

        while (month < 108) {
            bank *= 1.07;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма " + bank);
            }
        }

        /// Task 7
        int day = 1;

        do {
            if (day % 7 == 1) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
            day++;
        } while (day < 31);

        /// Task 8
        year = 0;
        short minYear = 200;
        byte maxYear = 100;
        short curYear = 2025;

        while (year <= curYear + maxYear) {
            if (year >= curYear - minYear && year <= curYear + maxYear) {
                System.out.println(year);
            }
            year += 79;
        }
    }
}