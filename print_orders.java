import java.io.*;
class print_orders{
public static void main (String args[]) throws IOException {

String b;
String[] fields;
String patternStr = ",";
FileReader fin = new FileReader("data_orders.txt");
BufferedReader bin = new BufferedReader (fin);
while ((b =  bin.readLine()) != null) {
fields = b.split(patternStr);

System.out.println("Id : " + fields[0]);
System.out.println("CustomerId : " + fields[1]);
System.out.println("EmployeesId : " + fields[2]);
System.out.println("date : " + fields[3]);

}
fin.close();
}
}