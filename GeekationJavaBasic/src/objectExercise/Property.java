package objectExercise;

public class Property {
    
    protected String Name;    // 物件名
    protected String Owner;   // 物件所有者名
    protected String Type;    // 物件種別
    protected int Price;      // 物件価格
    protected String Layout;  // 間取り
    protected double Area;    // 広さ

    Property(String name, String owner, String type, int price, String layout, double area) {
        this.Name = name;
        this.Owner = owner;
        this.Type = type;
        this.Price = price;
        this.Layout = layout;
        this.Area = area;
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

    public String getType() {
        return this.Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public int getPrice() {
        return this.Price;
    }

    public void setPrice(int price) {
        this.Price = price;
    }

    public String getLayout() {
        return this.Layout;
    }

    public void setLayout(String layout) {
        this.Layout = layout;
    }

    public double getArea() {
        return this.Area;
    }

    public void setArea(double area) {
        this.Area = area;
    }
}





















