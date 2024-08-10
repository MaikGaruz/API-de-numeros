package prueba.API.de.numeros;

import java.util.Scanner;

public class Principal {
    Scanner teclado = new Scanner(System.in);
    ConsumoAPI consumoAPI = new ConsumoAPI();
    private final String URL = "http://numbersapi.com/";
    private int numero;
    int salir = 0;


    public void menu(){
        do {

            System.out.println("""
                    MENU
                    1. Ingresa el numero
                    2. Numero aleatorio
                                    
                    3. Salir
                    """);

            System.out.println("ELIGE UNA OPCION");
            int opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion){
                case 1:
                    busquedaManual();
                    break;
                case 2:
                    busquedaAutomatica();
                    break;
                default:
                    System.out.println("SALIENDO");
                    salir = 1;
                    break;
            }

        }while (salir == 0);
    }

    public void busquedaManual(){
        System.out.println("INGRESA EL NUMERO QUE QUIERAS! ");
        numero = Integer.parseInt(teclado.nextLine());

        var resultado = consumoAPI.obtenerDatos(URL + numero);
        System.out.println(resultado);
    }

    public void busquedaAutomatica(){
        System.out.println("GENERANDO EL NUMERO! ");
        int numeroAleatorio = (int) Math.floor(Math.random() * 1000);

        var resultado = consumoAPI.obtenerDatos(URL + numeroAleatorio);
        System.out.println(resultado);
    }
}
