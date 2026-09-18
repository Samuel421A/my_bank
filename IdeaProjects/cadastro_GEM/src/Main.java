import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int studentsPassword = 0;
        int instructorsPassword = 0;
        int counter = 0;

        Student student = new Student();

        student.showTime();
        System.out.println("--------------------------------------");
        System.out.println("DIGITE '1-2' PARA INDICAR A SUA FUNÇÃO");
        System.out.println("[1] ALUNO");
        System.out.println("[2] INSTRUTOR");
        System.out.println("--------------------------------------");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                Student alumno = new Student();
                System.out.println("BEM-VINDO SR. ALUNO");
                System.out.println("---------------------------------");
                do {
                    counter++;
                    System.out.println("DIGITE A SUA SENHA PARA ENTRAR");
                    studentsPassword = scanner.nextInt();

                    if (studentsPassword != student.getPassword()) {
                        System.out.println("SENHA INCORRETA!!");
                    }
                } while (studentsPassword != student.getPassword() && counter < 3);

                if (studentsPassword != student.getPassword()) {
                    System.out.println("CONTA BLOQUEADA!!");
                } else {
                    System.out.println("---------------------------");
                    System.out.println("BEM-VINDO (A) AO APP DO GEM");
                    student.showTime();
                    System.out.println("---------------------------");
                }
                break;

            case 2:
                Instructor instructor = new Instructor();
                System.out.println("-----------------------");
                System.out.println("BEM-VINDO SR. INSTRUTOR");
                System.out.println("-----------------------");

                do {
                    counter++;
                    System.out.println("DIGITE A SUA SENHA PARA ENTRAR: ");
                    instructorsPassword = scanner.nextInt();

                    if (instructorsPassword != instructor.getPassword()) {
                        System.out.println("SENHA INCORRETA!!");
                    }
                } while (instructorsPassword != instructor.getPassword() && counter < 3);

                if (instructorsPassword != instructor.getPassword()) {
                    System.out.println("CONTA BLOQUEADA!!");
                } else {
                    System.out.println("---------------------------");
                    System.out.println("BEM-VINDO (A) AO APP DO GEM");
                    instructor.showTime();
                    System.out.println("---------------------------");
                    System.out.println();
                }
                break;

            default:
                System.out.println("VALOR INVÁLIDO!");
        }
    }
}