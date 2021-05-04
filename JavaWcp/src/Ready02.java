
public class Ready02 {
  public static void main(String[] args) {
      System.out.println("Hello World!");
      System.out.println("Hello Java!");
      
      String str1;  // String型の変数str1を宣言
      str1 = "阿比留";  // 変数str1を初期化
      System.out.println(str1);  // 変数str1を出力
      str1 = "温故知新"; // 変数str1に温故知新を再代入
      System.out.println(str1); // 変数str1を出力
      final int MY_BIRTHDAY = 116 ; // finalを用いてint型の定数MY_BIRTHDAYを宣言,同時に値を設定する
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
      
      int[] array1 = new int [5] ; // 要素数が5の配列を作成
      array1[0] = 10; // インデックス番号0の要素に10を代入
      array1[1] = 20; // インデックス番号1の要素に20を代入
      array1[2] = 30; // インデックス番号2の要素に30を代入
      array1[3] = 40; // インデックス番号3の要素に40を代入
      array1[4] = 50; // インデックス番号4の要素に50を代入
      int int2 = array1[3]; // インデックス番号3の要素の値をint2に代入
      System.out.println(int2); // int2に入れられたインデックス番号3の値を出力
      
      int[] array2 = new int[] {10,20,30,40,50}; // 上記の代わりにこの2文で良い
      System.out.println(array2[3]);
  }
}
