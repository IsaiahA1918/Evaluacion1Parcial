package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String marca;
        String modelo;
        double precio;
        int numVehiculo;
        int indiceBarato;

        System.out.print("Ingrese la cantidad de vehiculo a registrar: ");
        numVehiculo = sc.nextInt();

        Vehiculo autos[] = new Vehiculo[numVehiculo];
        for (int i = 0; i < autos.length; i++) {
            sc.nextLine();
            System.out.println("----Auto " + (i + 1) + "----");
            System.out.print("Ingrese Marca:");
            marca = sc.nextLine();
            System.out.print("Ingrese Modelo:");
            modelo = sc.nextLine();
            System.out.print("Ingrese Precio:");
            precio = sc.nextDouble();

            autos[i] = new Vehiculo(marca, modelo, precio);
        }


        indiceBarato = indiceCocheBarato(autos);
        System.out.println("El auto entre el rango 2500 y 4000 $ es: ");
        System.out.println(autos[indiceBarato].mostrarDatos());

    }
    public static int indiceCocheBarato(Vehiculo[] autos){
        double precio;
        int indice = 0;

        precio = autos[0].getPrecio();
        for(int i = 0; i < autos.length; i++){
            if ((autos[i].getPrecio()<2500)&&(autos[i].getPrecio()<4000)){
                precio = autos[i].getPrecio();
                indice=i;
            }else{
                System.out.println("No existe un auto entre ese rango");
            }
        }
        return indice;
    }

}
