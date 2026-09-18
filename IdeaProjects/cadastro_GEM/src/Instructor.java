public class Instructor extends Student implements ExibeInfo {
    private int password = 67890;

    @Override
    public int getPassword() {
        return password;
    }
}
