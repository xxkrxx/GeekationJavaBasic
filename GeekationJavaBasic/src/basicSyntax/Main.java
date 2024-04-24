package basicSyntax;

public class Main {
    public static void main(String[] args) {
        int age = 21;
        double height = 172.0;
        GeekIntroduction.greeting(age, height);
        GeekIntroduction.specialSkill(5, 15);
    }
}


//public class Main {
//	public static void main(String[] args) {
//	System.out.println("こんにちは");
//	System.out.println("私の名前は");
//	System.out.println("Geek君です。");
//	
//	System.out.println("こんにちは" + "私の名前は" + "Geet君です。");
//	}
//}

//データ型
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(1);
//        System.out.println(-1);
//        System.out.println(5 + 1);
//
////        System.out.println("5 + 1");
//        System.out.println("5" + "1");
//        
//        System.out.println(0.25);
//        System.out.println(0.25);
//        System.out.println(5.0);
//        System.out.println(-5.0);
//        System.out.println(5.0 - 0.25);
//    }
//}

//真偽値: boolean
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(true);
//        System.out.println(false);
//    }
//}

//変数
//public class Main {
//public static void main(String[] args) {
//	String name;
//	int age;
//	
//	name = "Geek君";
//	age = 25;
//	
//	System.out.println(name);
//	System.out.println(age);
//	}
//}

//変数の更新
//public class Main {
//public static void main(String[] args){
//	String name = "Geek君";
//	int age = 25;
//	
//	name = "生まれ変わったGeek君";
//	age = 1;
//	
//	System.out.println(name);
//	System.out.println(age);
//	}
//}

//変数の命名規則
//public class Main {
//public static void main(String[] args){
//	String firstName ="イケイケ";
//	String middleName ="ギーク";
//	String lastName ="太朗";
//	int age = 25;
//	
//	System.out.println(firstName + middleName + lastName + "の年齢は" + age + "際です。");
//	
//	}
//}

//加算
//public class Main {
//public static void main(String[] args) {
//	int a = 5;
//	int b = 3;
//	int sum = a + b;
//	System.out.println(sum);
//	}
//}

//減算
//public class Main {
//public static void main(String[] args){
//	 int x = 10;
//	 int y = 4;
//	 int diffrence = x - y;
//	
//	System.out.println(diffrence);
//	}
//}

//乗算（掛け算）
//public class Main {
//public static void main(String[] args) {
//	 int p = 7;
//	 int q = 2;
//	 int product = p * q;
//	
//	System.out.println(product);
//	}
//}


//割り算
//public class Main{
//	public static void main(String[] args) {
//	int dividend = 20;
//	int divisor = 5;
//	int quotient = dividend / divisor;
//	
//	System.out.println(quotient);
//	}
//}


//剰余算
//public class Main {
//public static void main(String[] args) {
//	 int dividend = 17;
//	 int divisor = 5;
//	 int remainder = dividend % divisor;
//	
//	System.out.println(remainder);
//	}
//}


//自己代入
//public class Main {
//public static void main(String[] args) {
//	 int a = 5;
//	 int b = 20;
//	 int c = 5;
//	 int d = 20;
//	 int e = 10;
//	
//	 a = a + 5;
//	 b = b - 10;
//	 c = c * 2;
//	 d = d / 2;
//	 e = e % 3;
//	
//	 System.out.println(a);
//	 System.out.println(b);
//	 System.out.println(c);
//	 System.out.println(d);
//	 System.out.println(e);
//	}
//}

//自己代入（省略版）
//public class Main {
//public static void main(String[] args) {
//	int a = 5;
//	int b = 20;
//	int c = 5;
//	int d = 20;
//	int e = 10;
//	
//	a += 5;
//	b -= 10;
//	c *= 2;
//	d /= 2;
//	e %= 3;
//	
//	System.out.println(a);
//	System.out.println(b);
//	System.out.println(c);
//	System.out.println(d);
//	System.out.println(e);    
//	
//	}
//}

//対象変数から「1を足す」or「1を引く」場合
//public class Main {
//public static void main(String[] args){
//	 int a = 9;
//	 int b = 11;
//	
//	 a++;
//	 b--;
//	
//	 System.out.println(a);
//	 System.out.println(b);
//	}
//}

//小数を使った計算(double型を使った計算)
//public class Main {
//public static void main(String[] args) {
//	 double c = 2.5;
//	 double d = 1.6;
//	 double doubleSum = c + d;
//	
//	System.out.println(doubleSum);
//	}
//}

//public class Main {
//public static void main(String[] args){
//	double e = 3.1;
//	double f = 1.3;
//	double doubleDiffrence = e - f;
//	
//	System.out.println(doubleDiffrence);
//	}
//}

//データ型が異なる値同士の計算
//public class Main {
//public static void main(String[] args){
//	int intNumber = 3;
//	double doubleNumber = 1.5;
//	
//	System.out.println(intNumber * doubleNumber);
//	}
//}

//キャスト(拡大変換と縮小変換)
//public class Main {
//public static void main(String[] args) {
//	int x = 5;
//	int y = 10;
//	
//	System.out.println((double) x + y);
//	}
//}

//public class Main {
//public static void main(String[] args){
//	int x =5;
//	String y = "10";

//int intY = Integer.parseInt(y);

//System.out.println(x + intY);
//	}
//}


//比較演算
//等しいかどうか(==)
//public class Main {
//public static void main(String[] args){
//	 int x = 5;
//	 int y = 10;
//	 int z = 5;
//	
//	 boolean isEqualA = (x == y);
//	 boolean isEqualB = (x == z);
//	
//	 System.out.println(isEqualA);
//	 System.out.println(isEqualB);
//	}
//}

//等しくないかどうか(!=)
//public class Main {
//public static void main(String[] args){
//	int x = 5;
//	int y = 10;
//	int z = 5;
//	
//	boolean isNotEqualA = (x != y);
//	boolean isNotEqualB = (x != z);
//	
//	System.out.println(isNotEqualA);
//	System.out.println(isNotEqualB);
//	}
//}

//大なり(>)
//public class Main {
//public static void main(String[] args){
//	int x = 5;
//	int y = 10;
//	int z = 5;
//	
//	boolean isGreaterA = (x > y);
//	boolean isGreaterB = (y > x);
//	boolean isGreaterC = (x > z);
//	
//	System.out.println(isGreaterA);
//	System.out.println(isGreaterB);
//	System.out.println(isGreaterC);
//	}
//}

//小なり(<)
//public class Main {
//public static void main(String[] args){
//	  int x = 5;
//	  int y = 10;
//	  int z = 5;
//	
//	  boolean isLessA = (x < y);
//	  boolean isLessB = (y < x);
//	  boolean isLessC = (x < z);
//	
//	  System.out.println(isLessA);
//	  System.out.println(isLessB);
//	  System.out.println(isLessC);
//	}
//}

//大なりまたは等しい(>=)
//public class Main {
//public static void main(String[] args){
//	int x = 5;
//	int y = 10;
//	int z = 5;
//	
//	boolean isGreaterOrEqualA = (x >= y);
//	boolean isGreaterOrEqualB = (y >= x);
//	boolean isGreaterOrEqualC = (x >= z);
//	
//	System.out.println(isGreaterOrEqualA);
//	System.out.println(isGreaterOrEqualB);
//	System.out.println(isGreaterOrEqualC);
//	}
//}

//小なりまたは等しい(<=)
//public class Main {
//public static void main(String[] args){
//	int x = 5;
//	int y = 10;
//	int z = 5;
//	
//	boolean isLessOrEqualA = (x <= y);
//	boolean isLessOrEqualB = (y <= x);
//	boolean isLessOrEqualC = (x <= z);
//	
//	System.out.println(isLessOrEqualA);
//	System.out.println(isLessOrEqualB);
//	System.out.println(isLessOrEqualC);
//	}
//}


//論理演算子
//論理積(&&)
//public class Main {
//public static void main(String[] args){
//	int x = 5;
//	int y = 10;
//	
//	boolean andResultA = (x < 6 && y > 9);
//	boolean andResultB = (x < 6 && y < 10);
//	
//	System.out.println(andResultA);
//	System.out.println(andResultB);
//	}
//}

//論理和(||)
//public class Main {
//public static void main(String [] args){
//	int x = 5;
//	int y = 10;
//	
//	boolean orResultA = (x < 6 || y < 10);
//	boolean orResultB = (x < 5 || y < 10);
//	
//	System.out.println(orResultA);
//	System.out.println(orResultB);
//	}
//}

//論理否定(!)
//public class Main {
//public static void main(String [] args) {
//	int x = 5;
//	int y = 10;
//	
//	boolean notResult = !(x == y);
//	
//	System.out.println(notResult);
//	}
//}

//ifの使い方
//public class Main {
//public static void main(String[] args) {
//	int number = 20;
//	
//	System.out.println("更新前");
//	
//	if (number >= 15) {
//	  System.out.println("15以上です。");
//	}
//	  number = 14;
//	
//	  System.out.println("更新後");
//	
//	  if (number >= 15) {
//	    System.out.println("15以上です。");
//	  }
//	
//	System.out.println("完了");
//	}
//}


//elseの使い方
//public class Main {
//	public static void main(String[] args) {
//	int number = 14;
//	
//	if (number >= 15) {
//	  System.out.println("15以上です。");
//	} else {
//	  System.out.println("15未満です。");
//	}
//	System.out.println("完了");
//	}
//}

//else ifの使い方
//public class Main {
//	public static void main(String[] args) {
//	int number = 10;
//	
//	if (number >= 20) {
//	  System.out.println("20以上です。");
//	}else if (number >= 15) {
//	  System.out.println("15以上です。");
//	}else if (number >= 10) {
//	  System.out.println("10以上, 15未満です。");
//	}else {
//	  System.out.println("10未満です。");
//	}
//	System.out.println("完了");
//	}
//}


//switch文
//public class Main {
//public static void main(String[] args) {
//	int day0fWeek = 2;
//	
//	switch (day0fWeek) {
//	case 1:
//	System.out.println("月曜日");
//	break;
//	case 2:
//	System.out.println("火曜日");
//	break;
//	case 3:
//	System.out.println("水曜日");
//	break;
//	default:
//	System.out.println("その他の曜日");
//	break;
//	}
//	
//	System.out.println("完了");
//	}
//}

//breakとは？
//public class Main {
//public static void main(String[] args) {
//	int day0fWeek = 1;
//	
//	switch (day0fWeek) {
//	case 1:
//	System.out.println("月曜日");
//	case 2:
//	System.out.println("火曜日");
//	case 3:
//	System.out.println("水曜日");
//	break;
//	default:
//	System.out.println("その他の曜日");
//	break;
//	}
//	System.out.println("完了");
//	}
//}

//while文
//public class Main {
//public static void main(String[] args) {
//	int num = 1; //初期値を定義
//	
//	while(num <= 100){ //繰り返し条件を定義
//	System.out.println(num); //繰り返す処理を実行
//	
//	num++; //更新
//	}
//	}
//}


//for文
//public class Main {
//public static void main(String[] args){
//	for (int num = 1; num <= 100; num++) {
//	System.out.println(num);
//	}
//	}
//}

//public class Main {
//public static void main(String[] args){
//	int[] numbers = {10, 20, 30, 40, 50};
//	
//	System.out.println(numbers[0]); //最初の要素にアクセス = 10
//	System.out.println(numbers[2]); //3番目の要素にアクセス = 30
//	
//	String[] fruits = {"りんご","バナナ","オレンジ"};
//	System.out.println(fruits[1]); //2番目の要素にアクセス = "バナナ"
//	System.out.println(fruits[3]); //存在しない要素にアクセス = エラー
//	}
//}

//public class Main {
//public static void main(String[] args) {
//	String[] fruits = {"りんご","バナナ","オレンジ"};
//	
//	System.out.println(fruits[1]);  バナナ
//	
//	fruits[1] = "ぶどう";
//	
//	System.out.println(fruits[1]);  ぶどう
//	
//	fruits[3] = "グレープフルーツ"  エラー
//	
//	fruits[1] = 10;  エラー
//	}
//}  
//
//配列の長さ（要素の数）は、lengthプロパティを使用して取得
//public class Main {
//public static void main(String[] args) {
//	String[] fruits = {"りんご" , "バナナ" , "オレンジ"};
//	System.out.println(fruits.length);
//	}
//}

////拡張for文
//public class Main {
//	public static void main(String[] args) {
//		String[] fruits = {"りんご" ,"バナナ" ,"オレンジ"};
//	
//		for (int i = 0; i < fruits.length; i++) {
//		 System.out.println(fruits[i]);
//		}
//	}
//}

//for (データ型 変数名: 配列名) {
////繰り返す処理;
//}
//public class Main {
//  public static void main(String[] args) {
//    String[] fruits = {"りんご", "バナナ", "オレンジ"};
//
//    for (String fruit: fruits) {
//      System.out.println(fruit); // fruitには、fruitsの要素がindex順に入ります。
//    }
//  }
//}

//public class Main {
//	public static void main(String[] args) {
//		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//		for (int number: numbers) {
//		if (number % 3 == 0) {
//	  	System.out.println("アホになって" + number + "と言う");
//		}
//	
//		System.out.println("普通に" + number + "と言う");
//		}
//	}
//} 

//public class Main {
//	public static void main(String[] args) {
//		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//		for (int number: numbers) {
//		if (number % 3 == 0) {
//	  	System.out.println("アホになって" + number + "と言う");
//	  	break;
//		}
//		System.out.println("普通に" + number + "と言う");
//		}
//	}
//} 

//繰り返し処理の特定条件で処理を終了したり、スキップしたりする場合はbreakやcontinue
//public class Main {
//	public static void main(String[] args) {
//		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//	
//		for (int number: numbers) {
//		if (number % 3 == 0) {
//	 	 System.out.println("アホになって" + number + "と言う");
//	  	continue;
//		}
//	
//		System.out.println("普通に" + number + "と言う");
//		}
//	}
//} 

//メソッドの定義と呼び出される流れ
//public class Main {
//	public static void main(String [] args) {
//		hello();
//	}
//	
//	public static void hello(){
//		System.out.println("Hello Geekation");
//	}
// }

//メソッドの再利用
//public class Main {
//	public static void main(String[] args) {
//		hello();
//		hello();
//		hello();
//		hello();
//	}
//	
//	public static void hello() {
//		System.out.println("Hello Geekation");
//	}
//}

//引数
//public class Main {
//	public static void main(String[] args) {
//		String[] countryCodes = {"JP","US","UK"};
//		
//		for (String code: countryCodes) {
//			hello(code);
//		}
//	}
//	
//	public static void hello(String code) {
//		System.out.println("Hello" + code);
//	}
//}

//複数の引数を指定した例
//public class Main {
//	public static void main(String[] args) {
//		String[] countryCodes = {"JP","US","UK"};
//		
//		int num = 1;
//		for (String code: countryCodes) {
//			hello(code, num);
//			
//			num++;
//		}
//	}
//	
//	public static void hello(String code, int num) {
//		System.out.println("No." + num + ": Hello" + code);
//	}
//}


//戻り値
//public class Main {
//	public static void main(String[] args) {
//		int result = sumNumbers(3, 4);
//		
//		System.out.println(result);
//	}
//	public static int sumNumbers(int num1, int num2) {
//		int sum = num1 + num2;
//		
//		return sum;
//	}
//}

//if文の条件にbooleanの戻り値
//public class Main {
//	public static void main(String[] args) {
//		int targetNum = 2;
//isEvenメソッドは、引数の値が偶数かを調べ、偶数true、奇数false
//		if (isEven(targetNum)) {
//			System.out.println("偶数です");
//		}else {
//			System.out.println("奇数です");
//		}
//	}
//	public static boolean isEven(int num) {
//		return num % 2 == 0;
//	}
//}

//public class Main {
//	  public static void main(String[] args) {
//	    System.out.println(sumNumbers(1, 2));
//	    System.out.println(sumNumbers(1, 2, 3));
//	    System.out.println(sumNumbers(2.3, 4.3));
//	  }
//
//	  public static int sumNumbers(int num1, int num2){
//	    int sum = num1 + num2;
//
//	    return sum;
//	  }
//
//	  public static int sumNumbers(int num1, int num2, int num3){
//	    int sum = num1 + num2;
//
//	    return sum;
//	  }
//	  
//	  public static int sumNumbers(double num1, double num2){
//	    double sum = num1 + num2;
//
//	    return (int)sum;
//	  }
//
//	  public static String sumNumbers(int num1, int num2){
//	    double sum = num1 + num2;
//
//	    return String.valueOf(sum);
//	  }
//	}

//複数のクラスに分割
//public class Main {
//	public static void main(String[] args) {
//	int num1 = 10;
//	int num2 = 5;
//	
//	int addUpResult = Calculation1.addUp(num1, num2);
//	int subtractResult = Calculation1.subtract(num1, num2);
//	int multiplyResult = Calculation1.multiply(num1, num2);
//	int devideResult = Calculation1.divide(num1, num2);
//	
//	Calculation1.printResult("addUp", addUpResult);
//	Calculation1.printResult("subtract", subtractResult);
//	Calculation1.printResult("multiply", multiplyResult);
//	Calculation1.printResult("divide", devideResult);
//	}
//}

//パッケージのimportを記述するときのTips
//public class Main {
//	public static void main(String[] args) {
//		List<String> arrayList = new ArrayList<>();
//		
//		System.out.println(arrayList.size());
//	}
//}

//クラスからインスタンスを生成
//public class Main {
//	public static void main(String[] args) {
//		Geekdam geekdamTypeA = new Geekdam();
//		Geekdam geekdamTypeB = new Geekdam();
//		Geekdam geekdamTypeC = new Geekdam();
//	}
//}

//class Main {
//	public static void main(String[] args) {
//		Geekdam geekdam = new Geekdam();
//		//クラス型 変数名 = new クラス名();
//		
//		geekdam.name = "Geekdam太朗";
//		geekdam.color = "red";
//		geekdam.height = 175.2;
//		//変数名.インスタンスメソッド名;
//		
//		System.out.println(geekdam.name);
//		System.out.println(geekdam.color);
//		System.out.println(geekdam.height);
//	}
//}

//class Main {
//	public static void main(String[] args) {
//	Geekdam geekdam = new Geekdam()	;
//	geekdam.name = "Geekdam太朗";
//	
//	geekdam.greeting();
//	}
//}

//コンストラクタ
//public class Main {
//	public static void main(String[] args) {
//		Geekdam geekdamA = new Geekdam();
//		Geekdam geekdamB = new Geekdam();
//		Geekdam geekdamC= new Geekdam();
//	}
//}

//public class Main {
//	  public static void main(String[] args) {
//	    Geekdam geekdamA = new Geekdam("Geekdam一郎", 22);
//	    Geekdam geekdamB = new Geekdam("Geekdam二郎", 20, 175.2);
//
//	    System.out.println(geekdamA.name);
//	    System.out.println(geekdamA.age);
//	    System.out.println(geekdamA.height); 
//	    System.out.println(geekdamB.age);
//	    System.out.println(geekdamB.height);
//	  }
//	}

//public class Main {
//	public static void main(String[] args) {
//		Sample sample = new Sample("Geek", "太朗");
//		System.out.println(sample.getLastName());
//		System.out.println(sample.getFirstName());
//		
//		sample.setLastName("Geekation");
//		sample.setFirstName("二郎");
//		
//		System.out.println(sample.getLastName());
//		System.out.println(sample.getFirstName());
//	}
//}

//継承
//public class Main {
//	public static void main(String[] args) {
//		Dog dog = new Dog("しば太郎", "柴犬", 9.5, "セラピードッグ");
//		dog.greeting();
//		
//		Cat cat = new Cat("スコット", "スコティッシュ・フォールド", 3.8);
//		cat.greeting();
//		 // privateからprotectedになったフィールドにアクセすることができます。
//		System.out.println(dog.name);
//	}
//}

























