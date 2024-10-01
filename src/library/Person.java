
package library;

public abstract class Person {
    private String id;
    private String firstName;
    private String lastName;
    private int currentLoans; // Numero actual de prestamos
    private int renewals; // Numero de renovaciones

    public Person(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentLoans = 0; 
        this.renewals = 0;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCurrentLoans() {
        return currentLoans;
    }

    public int getRenewals() {
        return renewals;
    }

    public void addLoan() {
        currentLoans++;
    }

    public void returnLoan() {
        if (currentLoans > 0) {
            currentLoans--;
        }
    }

    public void renewLoan() {
        if (renewals < 3) {
            renewals++;
        }
    }

    public boolean canRenew() {
        return renewals < 3; // Verifica si puede renovar
    }

    public abstract boolean canLoan(); // Verifica si la persona puede hacer mas prestamos
    
    public abstract int getMaxLoans(); // Metodo para obtner el numero maximo de prestamos permitidos
}