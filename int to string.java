public class Main{
    public static void main(String[] args){
        
int integerNum = 42;

// Using Integer.toString()
String stringNum1 = Integer.toString(integerNum);

// Using concatenation with an empty string
String stringNum2 = "" + integerNum;
System.out.println(stringNum2.charAt(0));

//string to integer
String stringNum = "42";
int integerNum1 = Integer.parseInt(stringNum);
System.out.println(integerNum1);
    }
}