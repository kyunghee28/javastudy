package DateFormat;


import java.text.DecimalFormat;

class DecimalFormatEx1 {
	public static void main(String[] args) {
      DecimalFormat df = new DecimalFormat("#,###.##");
      DecimalFormat df2 = new DecimalFormat("#,###E0");
      
      try {
		Number num = df.parse("1,234,567.89");
		System.out.print("1,234,567.89" + " -> ");
		
		double d = num.doubleValue();
		System.out.print(d + " -> ");
		
		System.out.print(df2.format(num));
      } catch (Exception e) {
			// TODO: handle exception
      }
    }
   
}

/* 실행결과
1,234,567.89 -> 1234567.89 -> 123.5E4
*/
