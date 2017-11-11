public class JavaDefaultTypes {

    private boolean boo;
    private byte Byte;
    private short Short;
    private int IntMemb;
    private long longMemb;
    private char charMemb;
    private float floatMemb;
    private double doubleMemb;
    private Object refMemb;

     public JavaDefaultTypes(){

         System.out.println("Boolean = " + boo);
         System.out.println("Byte = " + Byte);
         System.out.println("Short = " + Short);
         System.out.println("Integer = " + IntMemb);
         System.out.println("Long = " + longMemb);
         System.out.println("Character = " + Character.codePointAt(new char[]{charMemb},0));
         System.out.println("Float = " + floatMemb);
         System.out.println("Double = " + doubleMemb);
         System.out.println("Reference Member = " + refMemb);


     }

   public static void main (String[] args) {

       final JavaDefaultTypes javaDefaultTypes = new JavaDefaultTypes();

   }

}
