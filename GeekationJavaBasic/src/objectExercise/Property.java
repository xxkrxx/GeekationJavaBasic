package objectExercise;

public class Property {
    
    protected String name;    // 物件名
    protected String owner;   // 物件所有者名
    protected int price;      // 物件価格
   


    Property(String name, String owner, int price) {
        this.name = name;
        this.owner = owner;
        this.price = price;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}