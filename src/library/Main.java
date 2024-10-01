
package library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Agregar algunos materiales de ejemplo
        Material book1 = new Material("AU12468", "Construccion del Software I", "22/07/2024", 5);
        Material book2 = new Material("AU22469", "Data Science", "27/09/2024", 3);
        library.registerMaterial(book1);
        library.registerMaterial(book2);

        while (true) {
            // Salir del programa si el usuario lo desea
            System.out.println("Ingrese 'salir' para finalizar o cualquier otra tecla para continuar:");
            String salir = scanner.nextLine();
            if (salir.equalsIgnoreCase("salir")) {
                break;
            }

            // Seleccionar el tipo de usuario
            int userType = 0;
            try {
                System.out.println("Seleccione el tipo de usuario (1: Estudiante, 2: Docente, 3: Administrativo):");
                userType = scanner.nextInt();
                scanner.nextLine(); // Limpia el buffer
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.nextLine(); // Limpiar el buffer
                continue;
            }

            // Registrar la persona según el tipo seleccionado
            System.out.println("Ingrese su ID:");
            String personId = scanner.nextLine();
            System.out.println("Ingrese su nombre:");
            String firstName = scanner.nextLine();
            System.out.println("Ingrese su apellido:");
            String lastName = scanner.nextLine();

            Person person;
            switch (userType) {
                case 1:
                    person = new Student(personId, firstName, lastName);
                    break;
                case 2:
                    person = new Teacher(personId, firstName, lastName);
                    break;
                case 3:
                    person = new Administrative(personId, firstName, lastName);
                    break;
                default:
                    System.out.println("Tipo de usuario inválido.");
                    continue;
            }

            library.registerPerson(person);

            // Solicitar el número de libros a prestar
            try {
                System.out.println("Ingrese el número de libros que desea prestar:");
                int numBooks = scanner.nextInt();
                scanner.nextLine(); // Limpia el buffer
                if (person.canLoan()) {
                    for (int i = 0; i < numBooks; i++) {
                        System.out.println("Ingrese el ID del material a prestar:");
                        String materialId = scanner.nextLine();
                        library.loanMaterial(person.getId(), materialId);
                    }
                } else {
                    System.out.println("Has excedido el límite de préstamos permitidos.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
        scanner.close();
    }
}