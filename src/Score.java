import java.util.Scanner;

public class Score {
    public static void show() {
        String election = "";

        do {
            Scanner theScanner = new Scanner(System.in);
            Scanner theScannerNames = new Scanner(System.in);

            System.out.println("Cuantos alumnos hay?");
            int howMuchStudents = theScanner.nextInt();

            System.out.println("¿Cuantas materias hay?");
            int howMuchSubjects = theScanner.nextInt();

            double averagesForAsignature[] = new double[howMuchSubjects];
            int howMuchIsNotPresent[] = new int[howMuchSubjects];
            String names[] = new String[howMuchStudents];
            float calf[][] = new float[howMuchStudents][howMuchSubjects];

            for (int i = 0; i < howMuchStudents; i++) {
                System.out.println("\n¿Como se llama el estudiante?");
                names[i] = theScannerNames.nextLine();

                for (int it = 0; it < howMuchSubjects; it++) {
                    System.out.println("¿Cuanto sacó " + names[i] + " en la materia numero " + (it + 1) + "?");
                    System.out.println("Si no pertenece a esta materia, o no se presentó, ingresa -1");
                    calf[i][it] = theScanner.nextFloat();

                }
            }


            for (int i = 0; i < howMuchSubjects; i++) {
                howMuchIsNotPresent[i] = 0;
                int howMuchPresent = 0;
                int sum = 0;
                int NA = 0;
                int SA = 0;
                int DE = 0;
                int AU = 0;

                for (int it = 0; it < howMuchStudents; it++) {
                    if (calf[it][i] == -1) {
                        howMuchIsNotPresent[i]++;
                    } else {
                        if (calf[it][i] < 8) {
                            NA++;
                        } else if (calf[it][i] == 8) {
                            SA++;
                        } else if (calf[it][i] == 9) {
                            DE++;
                        } else {
                            AU++;
                        }
                        sum += calf[it][i];
                    }
                }

                howMuchPresent = howMuchStudents - howMuchIsNotPresent[i];
                averagesForAsignature[i] = sum / (float) howMuchPresent;

                Tools.padding();
                System.out.println("En la materia numero " + i + ", asístieron " + howMuchPresent + " alumnos.");
                System.out.println("Promedio de la materia: " + averagesForAsignature[i]);
                System.out.println("NA's: " + NA);
                System.out.println("SA's: " + SA);
                System.out.println("DE's: " + DE);
                System.out.println("AU's: " + AU);
            }

            System.out.println("¿Iniciar de nuevo? y/n");
            election = theScanner.nextLine();
        } while (election.equals("y"));
    }
}