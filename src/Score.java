//import java.util.Scanner;
//
//public class Score {
////    Realice un programa utilizando el paradigma estructurado donde permita leer
////    por teclado las notas de N alumnos que están matriculados en M asignaturas,
////    si un alumno no está matriculado de una asignatura o no se presenta al examen
////    se debe introducir como nota -1. El programa debe calcular y escribir el número
////    de alumnos presentados a cada asignatura, la nota media, el número de no
////    acreditados, el número de aprobados, el número de destacados
////    y el número de autónomos.
//
//
//    Scanner theScanner = new Scanner(System.in);
//
//    int alumnos_materia = 0, suma = 0, au = 0, de = 0, aprovados = 0, na = 0, number_alumno = 0;
//    float media = 0, calif_mat = 0;
//    String name_alumno = "";
//        name_alumno.trim();
//    String name_mat = "";
//
//
//    public void score() {
//        System.out.println("¿Cuántas materias hay?");
//        int howmanySubjects = theScanner.nextInt();
//
//        System.out.println("¿Cuántos alumnos hay?");
//        int howManyStudents = theScanner.nextInt();
//
//
//        for (int i = 0; i < howmanySubjects; i++) {
//            System.out.println("Inserta el nombre de la materia");
//            Scanner theScannerSubject = new Scanner(System.in);
//            String subjectName = theScannerSubject.nextLine();
//
//            System.out.println("¿Cuántos alumnos hay en " + subjectName + "?");
//            int howManyStudentsPerSubject = theScanner.nextInt();
//            for (int n = 0; n < howManyStudentsPerSubject; n++) {
//                System.out.println("¿Cómo se llama el alumno " + (i+1) + "?");
//                name_alumno = sc.next().trim();
//                System.out.println("Ingresar la calificacion del alumno."
//                        + " NOTA:"
//                        + " En el caso de que el alumno no se halla presentado al examen"
//                        + "o no este inscrito a esta materia, favor de poner un: " + "-1");
//                calif_mat = sc.nextFloat();
//                //saber la cantidad de los alumnos que presentaron la materia
//                if (calif_mat != -1) {
//                    alumnos_materia++;
//
//                    suma += calif_mat;
//                }
//                //numero de alumnos que no aprobaron
//                if (calif_mat < 8 && calif_mat > 0) {
//                    na++;
//                }
//                //numero de alumnos aprovados
//                if (calif_mat > 7.9) {
//                    aprovados++;
//                }
//                /*numero de alumnos con DESTACADO
//                 * Destacado= > 8.9 && < 10 */
//                if (calif_mat > 8.9 && calif_mat < 10) {
//                    de++;
//                }
//                /* numero de alumnos con AUTONOMO
//                 * Autonomo = 10*/
//                if (calif_mat == 10) {
//                    au++;
//                }
//
//            }
//            media = suma / alumnos_materia;
//            System.out.println("los alumnos que ingresaron a la materia " + name_mat + " son: " + alumnos_materia);
//            System.out.println("Los media de la materia " + name_mat + " es: " + media);
//            System.out.println("La cantidad de los alumnos REPROBADOS fue de:" + na);
//            System.out.println("La cantidad de los alumnos con DESTACADO es de: " + de);
//            System.out.println("La cantidad de los alumnos con AUTONOMO es de: " + au);
//
//            alumnos_materia = 0;
//            suma = 0;
//            au = 0;
//            de = 0;
//            aprovados = 0;
//            na = 0;
//            media = 0;
//        }
//
//    }
//}
