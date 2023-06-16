package curriculum_A;

public class Qes1_13 {
	
	 public static void main(String[] args) {
		 
	    //Q1 下記9個をローカル変数として宣言のみしてください			
		 
	    //バイト型
		byte by;
		//短整数型
		short s;
		//整数型
		int i;
		//長整数型
		long l;
	    //単精度浮動小数点数型
		float f;
		//倍精度浮動小数点数型
		double d;
	    //文字型
		char c;
		//文字列型
	    String str;
	    //ブーリアン型
		boolean b;
		
		//Q2 それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください			
		
		by = 0;
		s = 0;
		i = 0;
		l = 0L;
		f = 0.0f;
		d = 0.0d;
		c  = '\u0000';
		str = null;
		b = false;
		 
		//Q3 初期化をしたそれぞれの変数に下記の値を代入してください
		
		// ・バイト型 
		by = 10;
	    // ・短整数型                 100
		s = 100;
	    // ・整数型                	 1000
		i = 1000;
	    // ・長整数型                 10000
		l = 10000;
	    // ・単精度浮動小数点数型   	 9.5
		f = 9.5f;
	    // ・倍精度浮動小数点数型		 10.5
		d = 10.5;
	    // ・文字型                   a
		c ='a';
	    // ・文字列型              	 ハロー
		str = "ハロー";
	    // ・ブーリアン型          	 true
		b = true;
		 
		//Q4 下記の通りにコンソール出力されるようにしてください			
		//上記で作成した変数を必ず使用すること	
		
		// 11110
		System.out.println( by + s + i + l );
		// 20.0
	    System.out.println( f + d );
	    // a ハロー true
		System.out.println ( c + " " + str + " " + b );
		// 11130.0                    数字を全て足す
		System.out.println( by + s + i + l + f + d );
		// 10000000000                小数点以外の数字を全てかける
		System.out.println( by * s * i * l );
	    // 0.105                      10.5割る100をする
	    System.out.println( d / s );
		// -90                        10引く100をする
		System.out.println( by - s );
		// 改行
		System.out.println();	
		
		//Q5 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。			
		//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
				 
		int num = 20;  //intに変更
		int num1 = 23;
		System.out.println( "ハローJAVA" + ( num + num1 ) );
		
		// 改行
		System.out.println();	
		
		//Q6 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください			
	    //ローカル変数に代入し○○に入れてください			
	    //『山田太郎 18歳 170.5cm 62.2kg 寿司』	
		
		//↓↓format↓↓	
		//「初めまして○○です」	
		String name = "山田太郎";
		System.out.println( "初めまして" + name + "です" );
		//「年齢は○○歳です」
		int age = 18;
		System.out.println( "年齢は" + age + "歳です");
		//「身長は○○cmです」
		double height = 170.5;
		System.out.println( "身長は" + height + "cmです");
		//「体重は○○kgです」
		double weight = 62.2;
		System.out.println( "体重は" + weight + "kgです");
		//「好きな食べ物は○○です」
		String eat = "寿司";
		System.out.println( "好きな食べ物は" + eat + "です");
		
		//Q7 6で作成した自己紹介に続いてBMIが出力されるようにしてください					
		//ただし計算は数値を直書きせず、全て変数を使ってすること	
		//「BMIは○○です」	
		double bmi = weight / ((height / 100) * (height / 100));
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です\n");

		//Q8 6で宣言した変数に再代入し下記の通りコンソールに出力してください			
					
		//初めまして鈴木一郎です			
		name = "鈴木一郎";
		System.out.println( "初めまして" + name + "です" );
		//年齢は24歳です		
		age = 24;
		System.out.println( "年齢は" + age + "歳です");
		//身長168.5cmです	
		height = 168.5;
		System.out.println( "身長は" + height + "cmです");
		//体重は64.2kgです	
		weight = 64.2;
		System.out.println( "体重は" + weight + "kgです");
		//好きな食べ物はオムライスです	
		eat = "オムライス";
		System.out.println( "好きな食べ物は" + eat + "です");
		//BMIは22.6です
		bmi = weight / ((height / 100) * (height / 100));
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です\n");
		
		//Q9 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください					
						
		//初めまして鈴木一郎です	
		System.out.println( "初めまして" + name + "です" );
		//年齢は48歳です
		age += 24;
		System.out.println( "年齢は" + age + "歳です");
		//身長337.0cmです	
		height += 168.5;
		System.out.println( "身長は" +  height  + "cmです");
		//体重は128.4kgです
		weight += 64.2;
		System.out.println( "体重は" + weight + "kgです");
		//好きな食べ物はオムライスです
		System.out.println( "好きな食べ物は" + eat + "です");
		//BMIは11.31です		
		bmi = weight / ((height / 100) * (height / 100));
		System.out.println("BMIは" + String.format("%.2f", bmi) + "です\n");
		
		//Q10 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません		
		
		boolean age1;
		age1 = ( age < 25 );
		System.out.println( age1 );
		
		// 改行
		System.out.println();	
		
		//Q11 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください	
		
		//年齢
		age = 24;
		String valueOf1 = String.valueOf(age);
		System.out.println(valueOf1);
		//身長
		height = 168.5;
		String valueOf2 = Double.valueOf(height).toString();
		System.out.println(valueOf2);
		//体重
		weight = 64.2;
		String valueOf3 = Double.valueOf(weight).toString();
		System.out.println(valueOf3);
	    //繋げて出力
		System.out.println(valueOf1 + valueOf2 + valueOf3);	
		
		//改行
		System.out.println();
		//Q12 11で変換した【年齢・身長】を整数型に変換して出力してください	
		
		//年齢
		Integer age2 = Integer.valueOf(valueOf1);
		System.out.println(age2);
		//身長
		double height2 = Double.parseDouble(valueOf2);
		int height3 = (int)height2;
		System.out.println(height3);
		
		//改行
		System.out.println();
		
		//Q13 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください			
		//ただしif文は使わないでください	
		
		boolean age_height;
		age_height = ( age2 >= 25 || height2 >= 160 );
		System.out.println( age_height );	 	 
			 	 
	 }

}
