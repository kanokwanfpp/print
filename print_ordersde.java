import java.io.*;
class print_orders_de{
public static void main (String args[]) throws IOException {

String b;
String[] fields;
String patternStr = ",";
FileReader fin = new FileReader("data_orders_de.txt");
BufferedReader bin = new BufferedReader (fin);
while ((b =  bin.readLine()) != null) {
fields = b.split(patternStr);

System.out.println("OrderId : " + fields[0]);
System.out.println("ProductsId : " + fields[1]);
System.out.println("Unitprice : " + fields[2]);
System.out.println("Quantity : " + fields[3]);
System.out.println("Discount : " + fields[4]);

}
fin.close();
}
}