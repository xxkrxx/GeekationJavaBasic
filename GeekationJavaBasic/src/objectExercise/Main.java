// Main.java
package objectExercise;

public class Main {

    public static void main(String[] args) {
        // アパートメントのインスタンスを生成
        Apartment apartment = new Apartment("いい感じアパートメント", "山田 マンション太郎", 50000000, "3LDK");
        // 土地のインスタンスを生成
        Land land = new Land("いい感じの土地", "山田 土地太郎", 8000000, 105.2);

        // 各物件の情報を出力する
        printPropertyInfo(apartment);
        printPropertyInfo(land);
    }

    // 物件の情報を出力するメソッド// 物件種別を判定して出力
    public static void printPropertyInfo(Property property) {
        System.out.println("=============================");
        System.out.println("物件名：" + property.getName());
        System.out.println("物件所有者名：" + property.getOwner());
        System.out.println("物件種別：" + Type(property)); 
        System.out.println("物件価格：" + property.getPrice() + "円");

        // アパートメントの場合、間取りを出力
        if (property instanceof Apartment) {
            Apartment apartment = (Apartment) property;
            System.out.println("間取り: " + apartment.getLayout());
        }
        // 土地の場合、広さを出力
        else if (property instanceof Land) {
            Land land = (Land) property;
            System.out.println("広さ: " + land.getArea() + "㎡");
        }
        System.out.println("=============================");
    }

    // 物件種別を判定するメソッド
    private static String Type(Property property) {
        // アパートメントの場合は "マンション"、それ以外は "土地" を返す
        if (property instanceof Apartment) {
            return "マンション";
        } else {
            return "土地";
        }
    }
}
