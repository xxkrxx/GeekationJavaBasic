package objectExercise;

public class Main {

    public static void main(String[] args) {
        // Propertyクラスのインスタンスを生成
        Property property1 = new Property("いい感じアパートメント", "山田 マンション太郎", "マンション", 50000000, "3LDK", 0.0);
        Property property2 = new Property("いい感じの土地", "山田 土地太郎", "土地", 8000000, "", 105.2);

        // 各物件の情報を出力する
        printPropertyInfo(property1);
        printPropertyInfo(property2);
    }

    public static void printPropertyInfo(Property property) {
        System.out.println("===============================");
        System.out.println("物件名：" + property.getName());
        System.out.println("物件所有者名：" + property.getOwner());
        System.out.println("物件種別：" + property.getType());
        System.out.println("物件価格：" + property.getPrice() + "円");

        // 物件の種別によって広さまたは間取りを出力する
        if (property.getType().equals("マンション")) {
            System.out.println("間取り: " + property.getLayout());
        } else if (property.getType().equals("土地")) {
            System.out.println("広さ: " + property.getArea() + "㎡");
        }
        System.out.println("===============================");
    }
}
