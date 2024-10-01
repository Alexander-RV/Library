
package library;


public class Material {
    private String id;
    private String title;
    private String registrationDate;
    private int totalQuantity;
    private int currentQuantity;

    public Material(String id, String title, String registrationDate, int totalQuantity) {
        this.id = id;
        this.title = title;
        this.registrationDate = registrationDate;
        this.totalQuantity = totalQuantity;
        this.currentQuantity = totalQuantity;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void decreaseQuantity() {
        if (currentQuantity > 0) {
            currentQuantity--;
        }
    }

    public void increaseQuantity(int amount) {
        currentQuantity += amount;
    }
}