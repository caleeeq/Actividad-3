import java.util.Scanner;

public class VisitorInfoApp {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables para la información del visitante

        // byte: Edad del visitante (valor pequeño)
        byte age;

        // short: Número de departamento que visita
        short apartmentNumber;

        // int: Número de documento de identidad
        int idNumber;

        // long: Teléfono de contacto
        long phoneNumber;

        // float: Tiempo estimado de visita en horas
        float estimatedVisitTime;

        // double: Temperatura registrada del visitante
        double bodyTemperature;

        // char: Inicial del género del visitante ('M', 'F', 'O', etc.)
        char gender;

        // boolean: Confirmación de si el visitante tiene una cita previa
        boolean hasAppointment;

        // String: Nombre completo del visitante
        String fullName;

        // Recolección de datos del visitante
        System.out.println("Ingrese la información del visitante:");

        System.out.print("Nombre completo: ");
        fullName = scanner.nextLine();

        System.out.print("Edad: ");
        age = scanner.nextByte();

        System.out.print("Número de departamento: ");
        apartmentNumber = scanner.nextShort();

        System.out.print("Número de documento de identidad: ");
        idNumber = scanner.nextInt();

        System.out.print("Teléfono de contacto: ");
        phoneNumber = scanner.nextLong();

        System.out.print("Tiempo estimado de visita (en horas): ");
        estimatedVisitTime = scanner.nextFloat();

        System.out.print("Temperatura corporal registrada: ");
        bodyTemperature = scanner.nextDouble();

        System.out.print("Inicial del género (M/F/O): ");
        gender = scanner.next().charAt(0);

        System.out.print("¿Tiene cita previa? (true/false): ");
        hasAppointment = scanner.nextBoolean();

        // Mostrar los datos del visitante
        System.out.println("\nInformación del visitante registrada:");
        System.out.println("Nombre completo: " + fullName);
        System.out.println("Edad: " + age);
        System.out.println("Número de departamento: " + apartmentNumber);
        System.out.println("Número de documento de identidad: " + idNumber);
        System.out.println("Teléfono de contacto: " + phoneNumber);
        System.out.println("Tiempo estimado de visita: " + estimatedVisitTime + " horas");
        System.out.println("Temperatura corporal: " + bodyTemperature + " °C");
        System.out.println("Género: " + gender);
        System.out.println("Tiene cita previa: " + hasAppointment);

        // Cerrar el Scanner
        scanner.close();
    }
}
