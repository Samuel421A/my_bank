import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Student implements ExibeInfo {
    private String name;
    private String instrument;
    private String instrumentInstructor;
    private int age;
    private int password = 12345;

    public Student() {}

    public Student(String name, int age, String instrument, String instrumentInstructor) {
        this.name = name;
        this.age = age;
        this.instrument = instrument;
        this.instrumentInstructor = instrumentInstructor;
    }

    public String getName() {
        return name;
    }

    public int getPassword() {
        return password;
    }

    @Override
    public void showTime() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter brazilPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = brazilPattern.format(today);

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter shortPattern = DateTimeFormatter.ofPattern("HH:mm");
        String formattedHour = shortPattern.format(currentTime);

        System.out.println(formattedDate + " " + formattedHour);
    }

}
