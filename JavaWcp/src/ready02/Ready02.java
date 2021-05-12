
// パッケージ宣言(居場所)
package ready02;

// インポート文
import classMethod.Ready02.myfunction; //プロゲートでは基本的にライブラリを読み込むためにimportを用いている

public class Ready02 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Hello Java!");

		String str1; // String型の変数str1を宣言
		str1 = "阿比留"; // 変数str1を初期化
		System.out.println(str1); // 変数str1を出力
		str1 = "温故知新"; // 変数str1に温故知新を再代入
		System.out.println(str1); // 変数str1を出力
		final int MY_BIRTHDAY = 116; // finalを用いてint型の定数MY_BIRTHDAYを宣言,同時に値を設定する
		System.out.println(MY_BIRTHDAY); // 定数MY_BIRTHDAYを出力

		long long1 = 19970116L; // プリミティブ型のlongの変数を代入
		double double1 = 3.1415926535; // プリミティブ型のdoubleの変数を代入(全部出力される)
		boolean boolean1 = true; // プリミティブ型のbooleanの変数を代入
		System.out.println(long1); // プリミティブ型のlongの変数を出力
		System.out.println(double1); // プリミティブ型のdoubleの変数を出力
		System.out.println(boolean1); // プリミティブ型のbooleanの変数を出力
		Float float1 = 7.99132350116F; // ラッパークラスのFloatの変数に値を代入(doubleとは異なり0116までは出力されない)
		Integer integer1 = 77777777; // ラッパークラスのIntegerの変数に値を代入
		Character character1 = 'あ'; // ラッパークラスのCharacterの変数に値を代入
		System.out.println(float1); // ラッパークラスのFloatの変数に値を出力
		System.out.println(integer1); // ラッパークラスのIntegerの変数に値を出力
		System.out.println(character1); // ラッパークラスのCharacterの変数に値を出力

		int[] array1 = new int[5]; // 要素数が5の配列を作成
		array1[0] = 10; // インデックス番号0の要素に10を代入
		array1[1] = 20; // インデックス番号1の要素に20を代入
		array1[2] = 30; // インデックス番号2の要素に30を代入
		array1[3] = 40; // インデックス番号3の要素に40を代入
		array1[4] = 50; // インデックス番号4の要素に50を代入
		int int2 = array1[3]; // インデックス番号3の要素の値をint2に代入
		System.out.println(int2); // int2に入れられたインデックス番号3の値を出力

		int[] array2 = new int[] { 10, 20, 30, 40, 50 }; // 上記の代わりにこの2文で良い
		System.out.println(array2[3]);

		//6章
		int val;
		val = 2 + 5;
		System.out.println(val); //出力結果は7
		val++; //インクリメント処理
		System.out.println(val); //出力結果は8(この場合は後足しでも先足しでも変わらない)
		val *= 5;
		System.out.println(val); //変数valに5をかけて40が出力される
		boolean bool;
		bool = (val == 50);
		System.out.println(bool); //valは50と等しくない(valは40)ため、falseが出力される
		bool = (val < 50) && (val % 10 == 0);
		System.out.println(bool); //val(40)は50よりも小さく10で割り切れる数なのでtrueが出力される

		//7章 問題1 if文
		int distance;
		distance = 8;
		if (distance <= 5) {
			System.out.println("とても近いです"); // distanceの値が、5以下の時の処理
		} else if (distance <= 10) {
			System.out.println("近いです"); // distanceの値が、5より大きく10以下の時の処理
		} else if (distance <= 15) {
			System.out.println("遠いです"); // distanceの値が、10より大きく15以下の時の処理
		} else {
			System.out.println("とても遠いです"); // distanceの値が、15より大きい時の処理
		}
		
		// 7章 問題2 switch文
		String signal = "blue"; //変数signalを作り、blueを代入
		switch (signal) {
			case "red":
				System.out.println("赤信号です"); // signalがredの時の処理
				break;
			case "yellow":
				System.out.println("黄色信号です"); // signalがyellowの時の処理
				break;
			case "blue":
				System.out.println("青信号です"); // signalがblueの時の処理
				break;
			default:
				System.out.println("信号の色ではありません"); //どれにも当てはまらない時の処理(なくてもswitch文は成り立つ)
		}
		
		//8章
		int number = 1;
        while (number < 5) {
            int math = number * number;
            System.out.println("While01 = " + math);
            number++;
        }
        
        int num = 1;
        while (num < 5) {
            System.out.println(num * num); // 上記と出力結果は同じ
            num++;
        }
        
        String[] array3 = {"リンゴ","ゴリラ","ラッパ","ぱなき"}; // Stringの配列array3を作成
        for (String number2 : array3) {
        	System.out.println("While02 = " + number2); // Stringの要素を一つずつ取り出して出力
        }
        
        for (int i = 0; i < array3.length; i++) { // intと.lenghを用いて、array3の要素の数だけ一つずつ取り出して出力
            System.out.println(array3[i]);
        }
        
        int[] array4 = {0,1,2,3,4,5,6,7,8,9,10}; // intを用いて数字だけの配列arrray4を作成
        for (int number3 : array4) { // array4の要素をarray3として取り出す
        	if (number3%2==0) {  // arrray3のうち偶数はcontinueを用いて出力させない
        		continue;
        	}
        	System.out.println(number3); // arrray4のうち奇数の要素のみ出力
        }
        
        
        myfunction yamada = new myfunction();  //Human02クラスのインスタンスを生成
        System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。"); // 名前は山田で、年齢は20です。
        //上記の記述はインスタンスフィールドを用いている
        
        System.out.println("私の名前は、" + yamada.name + "です。"); // 私の名前は、山田です。
        String profile = yamada.getProfile(); // myfunctionで定義したgetProfile()を持ってくる
        System.out.println(profile + "です。"); // 私の名前は、山田です。年齢は20、職業はプログラマーです。

        yamada.greet("田辺"); // 田辺さん、こんにちは！
        yamada.greet(null); // 挨拶する友達がわかりません！
        
	}
}
