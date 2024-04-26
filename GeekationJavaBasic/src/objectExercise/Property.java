package objectExercise;

public class Property {
    
    protected String Name;    // 物件名
    protected String Owner;   // 物件所有者名
    protected int Price;      // 物件価格
   


    Property(String name, String owner, int price) {
        this.Name = name;
        this.Owner = owner;
        this.Price = price;
    }
    
    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getOwner() {
        return this.Owner;
    }

    public void setOwner(String owner) {
        this.Owner = owner;
    }

    public int getPrice() {
        return this.Price;
    }

    public void setPrice(int price) {
        this.Price = price;
    }
}