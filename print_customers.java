import java.io.*;
class print_customers{
public static void main (String args[]) throws IOException {

String b;
String[] fields;
String patternStr = ",";
FileReader fin = new FileReader("data_customers.txt");
BufferedReader bin = new BufferedReader (fin);
while ((b =  bin.readLine()) != null) {
fields = b.split(patternStr);

System.out.println("Id : " + fields[0]);
System.out.println("Name : " + fields[1]);
System.out.println("Adders : " + fields[2]);
System.out.println("Phone : " + fields[3]);

}
fin.close();
}
}