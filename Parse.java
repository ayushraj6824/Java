public class Parse {
    public static void main(String[] args){
        String str = "45";
        String str1 = "true";
        int a = Integer.parseInt(str);
        double d = Double.parseDouble(str);
        boolean b1 = Boolean.parseBoolean(str1);
        boolean b2 = Boolean.parseBoolean(str);  
        System.out.print(a+" "+d+" "+b1+" "+b2);


        Integer i = 100;
		  Double dou = 67.23;
		  Boolean b = true;
		  String str2 = i.toString();
		  System.out.println(str2);
		  str = dou.toString();
		  System.out.println(str2);
		  str = b.toString();
		  System.out.print(str2);

        
    }
}
