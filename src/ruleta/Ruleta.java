
package ruleta;


import java.util.Scanner;
import java.util.Random;

public class Ruleta {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int usuario;
        int dinero;
        int mesa = 0, banco = 0;
        // int simbolos[] = new int[9];
        int salida;

        System.out.println("Ingresa el dinero");
        dinero = leer.nextInt();

        banco = banco + dinero;

        while (banco > 0) {
            System.out.println("¿Cuantos simbolos vas a seleccionar?");
            int num = leer.nextInt();
            int opciones[] = new int[num];
            System.out.println("Ingresa el simbolo"
                    + "\n 1.- Manzana"
                    + "\n 2.- Cereza"
                    + "\n 3.- Naranja"
                    + "\n 4.- Limon"
                    + "\n 5.- Campana"
                    + "\n 6.- Sandia"
                    + "\n 7.- Siete"
                    + "\n 8.- Herradura"
                    + "\n 9.- Bar");
            int cuantas[] = new int[num];
            for (int i = 0; i < cuantas.length; i++) {
                cuantas[i] = 1;
            }

            for (int i = 0; i < opciones.length; i++) {
                opciones[i] = (leer.nextInt());
                System.out.println("¿Desea seleccionarlo varias veces?"
                        + "\n 1.- Si"
                        + "\n 2.- No");
                int varias = leer.nextInt();
                if (varias == 1) {
                    System.out.println("¿Cuantas?");
                    cuantas[i] = leer.nextInt();
                    
                }
                if (cuantas[i] > 1) {
                    banco=banco-cuantas[i];
                } else{
                    banco--;
                }
                if (banco == 0) {
                    break;
                }
                
            }
            //System.out.println(apuesta);
            System.out.println("******************"
                    + "\n**Empieza Ruleta**"
                    + "\n******************");
            int ruleta = ((aleatorio.nextInt(10000) + 1));
            if (ruleta <= 2000) {
            ruleta = 1;

        } else {
            if (ruleta <= 4000) {
                ruleta = 2;
            } else{
                if (ruleta <= 5571) {
                    ruleta=3;
                } else{
                    if (ruleta <=7142 ) {
                        ruleta=4;
                    } else{
                        if (ruleta <= 7713) {
                            ruleta=5;
                        } else{
                            if (ruleta <= 8284) {
                                ruleta=6;
                                
                                        
                            } else{
                                if (ruleta <= 8998) {
                                    ruleta=7;
                                } else{
                                    if (ruleta <= 9712) {
                                        ruleta=8;
                                    } else{
                                        ruleta=9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
            

            for (int i = 0; i < opciones.length; i++) {
                switch (ruleta) {
                    case 1:
                        System.out.println("Ganador: Manzana (+ $5)");
                        if (opciones[i] == 1) {
                            banco = banco + 5 * cuantas[i];
                        }
                        break;
                    case 2:
                        System.out.println("Ganador: Cereza (+ $2)");
                        if (opciones[i] == 2) {
                            banco = banco + 2 * cuantas[i];
                        }
                        break;
                    case 3:
                        System.out.println("Ganador: Naranja (+ $10)");
                        if (opciones[i] == 3) {
                            banco = banco + 10 * cuantas[i];
                        }
                        break;
                    case 4:
                        System.out.println("Ganador: Limon (+ $15)");
                        if (opciones[i] == 4) {
                            banco = banco + 15 * cuantas[i];
                        }
                        break;
                    case 5:
                        System.out.println("Ganador: Campana (+ $20)");
                        if (opciones[i] == 5) {
                            banco = banco + 20 * cuantas[i];
                        }
                        break;
                    case 6:
                        System.out.println("Ganador: Sandia (+ $20)");
                        if (opciones[i] == 6) {
                            banco = banco + 20 * cuantas[i];
                        }
                        break;
                    case 7:
                        System.out.println("Ganador: Siete (+ $40)");
                        if (opciones[i] == 7) {
                            banco = +40 * cuantas[i];
                        }
                        break;
                    case 8:
                        System.out.println("Ganador: Herradura (+ $40)");
                        if (opciones[i] == 8) {
                            banco = banco + 40 * cuantas[i];
                        }
                        break;
                    case 9:
                        System.out.println("Ganador: Bar (+ $100)");
                        if (opciones[i] == 9) {
                            banco = banco + 100*cuantas[i];
                        }
                        break;
                    default:
                        System.out.println("**OCURRIO UN ERROR**");
                }
            }
           int cont1;
           cont1=0;
            for (int i = 0; i < opciones.length; i++) {
              if (ruleta == opciones[i]) {
                System.out.println("You Win \t Banco: " + banco);
                System.out.println("");
                System.out.println("¿Deseas doblar el dinero?"
                        + "\n 1.- Si"
                        + "\n 2.- No");
                int opc = leer.nextInt();

                if (opc == 1) {
                    if (mesa == 0) {
                        System.out.println("Cuando dinero deseas ingresar?    Mesa: " + mesa + "    Banco:" + banco);
                        int monto = leer.nextInt();
                        mesa = mesa + monto;
                        banco = banco - monto;
                    } else {
                        System.out.println("¿Deseas modificar tu dinero?  Mesa: " + mesa + "   Banco: " + banco
                                + "\n 1.- Mesa --> Banco"
                                + "\n 2.- Mesa <-- Banco"
                                + "\n 3.- NO");
                        int change = leer.nextInt();

                        switch (change) {
                            case 1:
                                System.out.println("¿Cuanto dinero deseas mover a banco?");
                                int mover = leer.nextInt();
                                banco = banco + mover;
                                mesa = mesa - mover;
                                break;
                            case 2:
                                System.out.println("¿Cuanto dinero deseas mover a mesa?");
                                mover = leer.nextInt();
                                mesa = mesa + mover;
                                banco = banco - mover;
                                break;
                            default:
                        }

                    }

                    salida = 1;

                    int cont = 1;
                    while (salida == 1) {

                        if (cont > 1) {
                            System.out.println("¿Deseas otro volado?"
                                    + "\n 1.- Si"
                                    + "\n 2.- No");
                            int seguir = leer.nextInt();
                            if (seguir == 1) {
                                System.out.println("¿Deseas modificar tu dinero?  Mesa: " + mesa + "   Banco: " + banco
                                        + "1.- Mesa --> Banco"
                                        + "2.- Mesa <-- Banco"
                                        + "3.- NO");
                                int change = leer.nextInt();

                                switch (change) {
                                    case 1:
                                        System.out.println("¿Cuanto dinero deseas mover a banco?");
                                        int mover = leer.nextInt();
                                        banco = banco + mover;
                                        mesa = mesa - mover;
                                        break;
                                    case 2:
                                        System.out.println("¿Cuanto dinero deseas mover a mesa?");
                                        mover = leer.nextInt();
                                        mesa = mesa + mover;
                                        banco = banco - mover;
                                        break;
                                    default:
                                }

                            } else {
                                break;
                            }
                        }

                        System.out.println("Ingresa por favor la opcion"
                                + "\n 1.- Izquierda"
                                + "\n 2.- Derecha");
                        int vol = leer.nextInt();

                        int volado = aleatorio.nextInt(2) + 1;
                        if (volado == vol) {
                            mesa = mesa * 2;
                            System.out.println("You Win");
                            System.out.println("En mesa: " + mesa + "\t" + "Banco: " + banco);
                            salida = 1;
                        } else {
                            System.out.println("You lose");
                            mesa = 0;
                            salida = 0;
                        }
                        cont++;
                    }
                }

            } else {
                cont1++;
            }  
                if (cont1 == opciones.length) {
                    System.out.println("You lose");
                }
  
            }
            

            System.out.println("Mesa: " + mesa + "Banco: " + banco);
            System.out.println("¿Quiere seguir jugando?"
                    + "1.- Si"
                    + "2.- No");
            int continuar = leer.nextInt();
            if (continuar == 1) {

            } else {
                System.out.println("Imagina que te entregamos tu dinero " + "$ " + (banco + mesa));
                banco = 0;
                System.out.println("Cantidad de veces jugadas = 25  Ganados: 2  Perdidos: 23");
            }
            //  System.out.println("Bye");
        }

    }

}
