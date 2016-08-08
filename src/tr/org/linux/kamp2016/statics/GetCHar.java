package tr.org.linux.kamp2016.statics;



public class GetCHar{
   public static void main(String args[]){
      String Str1 = new String("Welcome to Tutorialspoint.com");
      char[] Str2 = new char[10];

      try{
         Str1.getChars(2, 6, Str2, 0); //getChars(int srcBegin, int srcEnd, char[] dst,  int dstBegin)
         System.out.print("Copied Value = " );
         System.out.println(Str2 );
         System.out.println(Str2[2]);

      }catch( Exception ex){
         System.out.println("Raised exception...");
      }
   }
}