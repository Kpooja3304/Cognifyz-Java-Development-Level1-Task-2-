class palindrome
{
public static boolean isPalindrome(String str) 
{
String reversed = "";
for (int i = str.length() - 1; i >= 0; i--) 
{
reversed += str.charAt(i);
}
return str.equals(reversed);
}
public static void main(String[] args) 
{
String input = "madam";
boolean result = isPalindrome(input.toLowerCase());
System.out.println("Is '" + input + "' a palindrome? " + result);
}
}
