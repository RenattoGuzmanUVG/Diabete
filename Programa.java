import java.util.Scanner;


public class Programa{
    public static void main(String[] args){
        

        Scanner ingresar = new Scanner(System.in);
        Datos dato = new Datos();

        String alimento = "";
        Double azucar = 0.0;
        dato.registroAlimento(alimento,azucar);
        
        alimento = "Salsa";
        azucar = 1.0;
        dato.registroAlimento(alimento,azucar);

        alimento = "Leche";
        azucar = 12.5;
        dato.registroAlimento(alimento,azucar);

        alimento = "Huevo";
        azucar = 0.3;
        dato.registroAlimento(alimento,azucar);

        alimento = "Tortilla de maiz";
        azucar = 0.0;
        dato.registroAlimento(alimento,azucar);

        alimento = "Queso Fresco";
        azucar = 0.1;
        dato.registroAlimento(alimento,azucar);

        alimento = "Jugo de piña";
        azucar = 42.0;
        dato.registroAlimento(alimento,azucar);

        alimento = "Pan francés";
        azucar = 43.0;
        dato.registroAlimento(alimento,azucar);

        alimento = "yogurd";
        azucar = 0.0;
        dato.registroAlimento(alimento,azucar);

        alimento = "sandia";
        azucar = 9.4;
        dato.registroAlimento(alimento,azucar);

        alimento = "banano";
        azucar = 14.4;
        dato.registroAlimento(alimento,azucar);

        alimento = "pollo asado";
        azucar = 0.0;
        dato.registroAlimento(alimento,azucar);

        alimento = "arros";
        azucar = 0.0;
        dato.registroAlimento(alimento,azucar);

        alimento = "miel";
        azucar = 17.2;
        dato.registroAlimento(alimento,azucar);

        alimento = "nuezes";
        azucar = 2.6;
        dato.registroAlimento(alimento,azucar);

        alimento = "mani";
        azucar = 3.9;
        dato.registroAlimento(alimento,azucar);

        int salir = 0;
        Double azucarTotal = 0.0;

        while (salir == 1);

            System.out.println("Eliga una opcion");
            System.out.println("1.Azucares diarias");
            System.out.println("2.Ejercicio diario");
            System.out.println("3.Registrar usuario");
            System.out.println("4.Ejercicio diario completado");
            System.out.println("5.Salir");

            //asignmos el valor ingresado a la variable OP
            int OP = ingresar.nextInt();


            if(OP == 1){

                for (Alimentos A : dato.alimento){

                    System.out.println("Usted a comido " + A.getAlimentos() +" en el dia?");
                    System.out.println("1 = si  o   2 = no");
                    int respuesta = ingresar.nextInt();

                    if(respuesta == 1){
                        azucarTotal = azucarTotal + A.getAzucar();
                    }

                }

                System.out.println("El azucar total de su dia es: " + azucarTotal);

            }

            if(OP == 2){

            }

            if(OP == 3){

            }

            if(OP == 5){
                salir = 0;
            }




    }

}