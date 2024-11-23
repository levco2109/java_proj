public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(10, 25, 2023);
        
        System.out.print("Date 1: ");
        date1.displayDate();

        date1.setMonth(12);
        date1.setDay(31);
        date1.setYear(2024);

        System.out.print("Updated Date 1: ");
        date1.displayDate();

        Date date2 = new Date(1, 1, 2023);
        
        System.out.print("Date 2: ");
        date2.displayDate();
    }
}
