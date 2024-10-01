
package library;

public class Movement {
    private String materialId;
    private String movementType;
    private String personId;

    public Movement(String materialId, String movementType, String personId) {
        this.materialId = materialId;
        this.movementType = movementType;
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "Material ID: " + materialId + ", Movimiento: " + movementType + ", Persona ID: " + personId;
    }
}
