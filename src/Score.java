import java.util.Scanner;

public class Score {
    public static void show() {
        String election = "";
        do {
            System.out.println("¿Iniciar? y/n");
            Scanner aScanner = new Scanner(System.in);
            election = aScanner.nextLine();

            int howManySubjects = 0;


            System.out.println("Sistema de calificaciones.");
            System.out.println("¿Cuántas materias hay?");

            Scanner theScanner = new Scanner(System.in);
            howManySubjects = theScanner.nextInt();

            for (int i = 1; i <= howManySubjects; i++) {
                int count = 0;
                int howManyStudents = 0;
                int doit = 0;
                int dont = 0;
                int DE = 0;
                int AU = 0;
                String subject1;
                float sum = 0;
                float subject;
                float average;

                System.out.println(i + ".- Ingresa el nombre de la materia ");
                Scanner theScannerSubject = new Scanner(System.in);
                subject1 = theScannerSubject.nextLine();

                System.out.println("¿Cuántos alumnos están inscritos en " + subject1 + "?");
                Scanner theScannerHow = new Scanner(System.in);
                howManyStudents = theScannerHow.nextInt();
                for (int it = 1; it <= howManyStudents; it++) {

                    System.out.println("Ingresa la calificación del alumno no. " + it + ".");
                    System.out.println("Si el alumno no está inscrito en esta asignatura o no se presento al examen ingrese -1");
                    subject = theScannerHow.nextInt();

                    if (subject != -1) {
                        count += 1;
                        sum = sum + subject;
                    }

                    if (subject <= 8 && subject >= 1) {
                        dont += 1;
                    }

                    if (subject >= 8) {
                        doit += 1;
                    }

                    if (subject == 9 || subject == 9.9) {
                        DE += 1;
                    }

                    if (subject == 10) {
                        AU += 1;
                    }
                }

                average = sum / count;

                System.out.println("Hay " + count + " alumnos en " + subject1);
                System.out.println("El promedio de " + subject1 + " es de " + average);
                System.out.println("Alumnos reprobados: " + dont);
                System.out.println("Alumnos aprobados: " + doit);
                System.out.println("Cantidad de DE's: " + DE);
                System.out.println("Cantidad de Au's: " + AU);
            }
        } while (election.equals("y"));
    }
}