import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestTimeShowing {
    static void main() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = dateFormatter.format(today);

        LocalTime hour = LocalTime.now();
        DateTimeFormatter hourFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedHour = hourFormatter.format(hour);

        System.out.println(formattedDate + " " + formattedHour);


    }
}
