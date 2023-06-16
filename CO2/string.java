class string
{
public static void main(String args[])
{
String s1="java";
String s2="DBMS";
String s3=new String("networking lab");
String s4="hello";
String s5=" mello";
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s1.length());
System.out.println(s1.toUpperCase());
System.out.println(s2.toLowerCase());
System.out.println(s1 + " " + s2);
System.out.println(s1.concat(s2));
System.out.println(s4.compareTo(s5));
System.out.println(s1.equals(s2));
System.out.println(s1.replace('v','m'));
System.out.println(s1.charAt(2));
System.out.println(s3.substring(2));
System.out.println(s3.substring(2,5));
System.out.println(s5.trim());
}
}
