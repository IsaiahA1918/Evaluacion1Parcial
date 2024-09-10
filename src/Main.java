import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre;
        int edad;
        double salario;
        int numEmpleado;
        dou


        System.out.println("Cuantos empleados agregara");
        numEmpleado = sc.nextInt();

        Empleado trabajador[] = new Empleado[numEmpleado];

        for (int i = 0; i < trabajador.length; i++) {
            sc.nextLine();
            System.out.println("Ingrese Nombre:");
            nombre = sc.nextLine();
            System.out.println("Ingrese Edad:");
            edad = sc.nextInt();
            System.out.println("Ingrese Salario:");
            salario = sc.nextDouble();

            trabajador[i] = new Empleado(nombre, edad, salario);
        }

    }

    public static void aumentoSalario(Empleado[] trabajador) {
        double salario;

        salario = trabajador[0].getSalario();
        for (int i = 0; i < trabajador.length; i++) {
            if (trabajador[i].getSalario() < 3000) {
                salario = (trabajador[i].getSalario() * 10)/100;
                System.out.println(trabajador[i].nombre + " ha recibido un aumento. Nuevo Salario es " + salario);
            }else{
                System.out.println(trabajador[i].nombre + " no califica para el aumento.");
            }
        }

    }
}