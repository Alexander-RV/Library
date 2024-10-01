
package library;

public class Teacher extends Person {
    private static final int MAX_LOANS = 3;

    public Teacher(String id, String firstName, String lastName) {
        super(id, firstName, lastName);
     }

    @Override
    public int getMaxLoans() {
        return MAX_LOANS;
    }

    @Override
    public boolean canLoan() {
        return getCurrentLoans() < MAX_LOANS;
    }
}
