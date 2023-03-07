import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayOfWeek = sc.nextLine();
        DayOfWeek dayOfWeek1 = DayOfWeek.valueOf(dayOfWeek.toUpperCase());

        switch (dayOfWeek1) {
            case DYISHINBY -> System.out.println(DayOfWeek.DYISHINBY.DYISHINBY);
            case SHEYSHEMBI -> System.out.println(DayOfWeek.SHEYSHEMBI);
            case SHARSHEMBI -> System.out.println(DayOfWeek.SHARSHEMBI);
            case BEYSHEMBI -> System.out.println(DayOfWeek.BEYSHEMBI);
            case JUMA -> System.out.println(DayOfWeek.JUMA);
            case ISHEMBI -> System.out.println(DayOfWeek.ISHEMBI);
            case JEKSHEMBI -> System.out.println(DayOfWeek.JEKSHEMBI);

        }

    }
}