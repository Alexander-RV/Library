
package library;


public class Administrative extends Person {
    private static final int MAX_LOANS = 2;

    public Administrative(String id, String firstName, String lastName) {
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
