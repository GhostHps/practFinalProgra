import java.util.Scanner;

public class gera {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int respuesta;

        //OPCION 1
        int alumnos_materia = 0, suma = 0, au = 0, de = 0, aprovados = 0, na = 0, number_alumno = 0;
        float media = 0, calif_mat = 0;
        String name_alumno = "";
        name_alumno.trim();
        String name_mat = "";

        //OPCION 2
        int serie;

        //OPCION 3
        float operacion = 0, numero, res = 0;

        //OPCION 4 vinos
        float vino1, vino2, vino3, vino4, vino5, a�o, to = 0;
        float total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0, lim = 0;
        int yearv2 = 0, yearv3 = 0;
        float totalyear = 0;

        //	OPCION 5
        String r;
        int boletos, cantb = 0, zona, totalb = 0, total = 0;

        //OPCION 6

        //se ocupara tambien la variable de a�o del ejercicio 4

        do {
            System.out.println("--------------------------------------------");
            System.out.println("Seleccione la opcion que desee hacer");
            System.out.println("Opcion 1: Calificaciones.");
            System.out.println("Opcion 2: Serie.");
            System.out.println("Opcion 3: Perfectos.");
            System.out.println("Opcion 4: Vi�edo.");
            System.out.println("Opcion 5: Estadio.");
            System.out.println("Opcion 6: Vi�edo con objetos.");
            System.out.println("Opcion 7: Estadio con objetos.");
            System.out.println("Opcion 8: Centro de Servicio Automotriz.");
            System.out.println("Opcion 9: Exit.");
            System.out.println("--------------------------------------------");


            respuesta = sc.nextInt();
            switch (respuesta) {
                case 1:
                    System.out.println("�Cuantas materias deseas ingresas?");
                    int materia = sc.nextInt();

                    for (int i = 0; i < materia; i++) {
                        System.out.println("Inserta el nombre de la materia");
                        name_mat = sc.next();
                        System.out.println("�Cuantos alumnos hay en la materia de " + name_mat);
                        number_alumno = sc.nextInt();
                        for (int n = 0; n < number_alumno; n++) {
                            System.out.println("�Cual es el nombre del alumno?");
                            name_alumno = sc.next().trim();
                            System.out.println("Ingresar la calificacion del alumno."
                                    + " NOTA:"
                                    + " En el caso de que el alumno no se halla presentado al examen"
                                    + "o no este inscrito a esta materia, favor de poner un: " + "-1");
                            calif_mat = sc.nextFloat();
                            //saber la cantidad de los alumnos que presentaron la materia
                            if (calif_mat != -1) {
                                alumnos_materia++;

                                suma += calif_mat;
                            }
                            //numero de alumnos que no aprobaron
                            if (calif_mat < 8 && calif_mat > 0) {
                                na++;
                            }
                            //numero de alumnos aprovados
                            if (calif_mat > 7.9) {
                                aprovados++;
                            }
                            /*numero de alumnos con DESTACADO
                             * Destacado= > 8.9 && < 10 */
                            if (calif_mat > 8.9 && calif_mat < 10) {
                                de++;
                            }
                            /* numero de alumnos con AUTONOMO
                             * Autonomo = 10*/
                            if (calif_mat == 10) {
                                au++;
                            }

                        }
                        media = suma / alumnos_materia;
                        System.out.println("los alumnos que ingresaron a la materia " + name_mat + " son: " + alumnos_materia);
                        System.out.println("Los media de la materia " + name_mat + " es: " + media);
                        System.out.println("La cantidad de los alumnos REPROBADOS fue de:" + na);
                        System.out.println("La cantidad de los alumnos con DESTACADO es de: " + de);
                        System.out.println("La cantidad de los alumnos con AUTONOMO es de: " + au);

                        alumnos_materia = 0;
                        suma = 0;
                        au = 0;
                        de = 0;
                        aprovados = 0;
                        na = 0;
                        media = 0;
                    }

                    break;

                case 2:

                    int s = 2;
                    System.out.println("ingrese el numero el cual sera el tope de la serie. ");
                    serie = sc.nextInt();
                    for (int i = 1; i < serie; i++) {
                        if (i == serie) {
                            System.out.println("1/" + s);
                        }
                        if (i == 2) {

                            System.out.println("1/" + s);
                            s = +2;
                        }
                        if (i == 3) {
                            System.out.println("1/" + s);
                            s = +3;
                        }

                        if (s > serie) {
                            i = serie + 1;
                        }
                    }
                    break;

                case 3:
                    System.out.println("ingrese el numero que desse saber sobre sus numeros perfectos ");
                    numero = sc.nextFloat();

                    for (int i = 1; i < numero; i++) {
                        if (numero % i == 0) {
                            operacion += 1;
                        }

                        if (operacion == i) {
                            System.out.println(operacion);
                        }

                    }
                    break;
                case 4:

                    System.out.println("Cuantos a�os dessea sacar el reporte de lo a�ejo del vino");
                    a�o = sc.nextInt();

                    for (int i = 0; i < a�o;
                    i++){
                    System.out.println("cuantos litros se produjo en el a�o del vino 1? ");
                    vino1 = sc.nextInt();
                    System.out.println("cuantos litros se produjo en el a�o del vino 2? ");
                    vino2 = sc.nextInt();
                    System.out.println("cuantos litros se produjo en el a�o del vino 3? ");
                    vino3 = sc.nextInt();
                    System.out.println("cuantos litros se produjo en el a�o del vino 4? ");
                    vino4 = sc.nextInt();
                    System.out.println("cuantos litros se produjo en el a�o del vino 5? ");
                    vino5 = sc.nextInt();

                    total1 += vino1;
                    total2 += vino2;
                    total3 += vino3;
                    total4 += vino4;
                    total5 += vino5;

                    if (vino2 > lim) {
                        yearv2 = i;
                        lim = vino2;

                    }
                    if (vino3 > lim) {
                        yearv3 = i;

                    }
                    to = (total1 + total2 + total3 + total4 + total5);
                    totalyear = (float) (to / a�o);

                }
                System.out.println("El total de produccion de todos los vinos es de: " + to + " litros");
                System.out.println("El total de la produccion de vinos por a�o es de:  " + totalyear + " litros");
                System.out.println("En el a�o " + yearv2 + " se produjo la mejor cantidad del vino 2, que fue de: " + lim + " litros");

                if (yearv3 == 0) {
                    System.out.println("En el a�o " + yearv3 + " no hubo produccion para el vino 3");
                }
                break;
                case 5:

                    Estadio est = new Estadio();
                    System.out.println("Desea realizar una venta?");
                    r = sc.next();
                    if (r.equals("si")) {
                        est.Estadio();
                    }
                    break;
                case 6:
                    vi�edo vino = new vi�edo();
                    System.out.println("Cuantos a�os dessea sacar el reporte de lo a�ejo del vino");
                    a�o = sc.nextFloat();
                    for (int i = 0; i < a�o;
                    i++){
                    vino.vi�edo();
                }
                vino.imprimir();

                break;
                case 7:


                default:
                    respuesta = 9;


            }
        }
        while (respuesta != 9);


    }
}
