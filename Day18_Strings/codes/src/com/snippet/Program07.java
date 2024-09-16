package com.snippet;

public class Program07 {
    public static void main(String[] args) {
        String s1 =  "null" + null + 1;
        System.out.println(s1);//nullnull1

//        String s2 = 1 + null + "null";
//        System.out.println(s2); // CE : Operator '+' can't be applied to 'int','null' if they are continuous before string

        String s3 ="sachin ramesh tendulkar";
        System.out.println(s3.indexOf('a') + s3.indexOf("dulkar"));//1+17 = 18

        String s4 = "sachinrameshtendulkar";
        System.out.println(s1.replace('a','A').indexOf('a'));//-1

        String s5 = "subraymanyam balaji jadhav";
        System.out.println(s5.indexOf('m',7));//11

//        String s6 = "subramanyambalajijadhav";
//        System.out.println(s6.charAt(s6.length()));//StringIndexOutOfBoundException

//        StringBuilder sb = new StringBuilder(-32);//NegativeSizeArrayException
//        sb.append("ABC");
//        System.out.println(sb);

//        StringBuilder sb = new StringBuilder("0123456789");
//        System.out.println(sb.delete(3,6).deleteCharAt(4).deleteCharAt(6));
        /*Exception : StringIndexOutOfBoundException :
            Reason : sb.delete(3,6) -> 0126789
                     sb.delete(4) -> 012689
                     sb.delete(6) -> 6 index is not present therefore StringIndexOutOfBoundException
        */
        String str1 = "123123123";
        System.out.println(str1.replaceFirst("123","321").replaceAll("12","21").substring(3,6));//213
        /*
          Explanation : str1.replaceFirst("123","321") -> 321123123
                        str1.replaceAll("12","21") -> 321213213
                        str1.subString(3,6) ->it means from index 3 to 5 -> 213 therefore output : 213
         */
        StringBuffer sb2 = new StringBuffer("11111");
        System.out.println(sb2.insert(3,false).insert(5,3.3).insert(7,"one"));

        String str2 = "Java J2EE Spring Hibernate SQL";
        String str3 = "Python Java Scala C C++";
        System.out.println(str2.contains("HTML")==str3.contains("HTML"));//false==false therefore output : true

        StringBuffer sb = new StringBuffer("One Two Three Four Five");
        System.out.println(sb.reverse().indexOf("Two"));//-1
    }
}
