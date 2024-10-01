
package library;
public class Student extends Person {
    private static final int MAX_LOANS = 5;

    public Student(String id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    @Override
    public boolean canLoan() {
        return getCurrentLoans() < MAX_LOANS; // Verifica si el estudiante puede pedir más préstamos
    }

    @Override
    public int getMaxLoans() {
        return MAX_LOANS;
    }
}