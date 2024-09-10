package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre;
        int edad;
        double salario;
        int numEmpleado;
        double aumentoSalario;


        System.out.print("Cuantos empleados agregara: ");
        numEmpleado = sc.nextInt();

        Empleado trabajador[] = new Empleado[numEmpleado];

        for (int i = 0; i < trabajador.length; i++) {
            sc.nextLine();
            System.out.println("----Ejercicio1.Main.Empleado " + (i + 1) + "-----");
            System.out.print("Ingrese Nombre:");
            nombre = sc.nextLine();
            System.out.print("Ingrese Edad:");
            edad = sc.nextInt();
            System.out.print("Ingrese Salario:");
            salario = sc.nextDouble();

            trabajador[i] = new Empleado(nombre, edad, salario);
        }

        aumentoSalario = indiceAumentoSalario(trabajador);

    }

    public static double indiceAumentoSalario(Empleado[] trabajador) {
        double salario;
        double newsalario;

        salario = trabajador[0].getSalario();
        for (int i = 0; i < trabajador.length; i++) {
            if (trabajador[i].getSalario() < 3000) {
                salario = (trabajador[i].getSalario() * 10) / 100;
                newsalario = trabajador[i].getSalario() + salario;
                System.out.println(trabajador[i].nombre + " ha recibido un aumento. Nuevo Salario es " + newsalario);
            } else {
                System.out.println(trabajador[i].nombre + " no califica para el aumento.");
            }
        }

        return salario;
    }
}
