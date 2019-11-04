import java.io.*;
class print_products{
public static void main (String args[]) throws IOException {

String b;
String[] fields;
String patternStr = ",";
FileReader fin = new FileReader("data_products.txt");
BufferedReader bin = new BufferedReader (fin);
while ((b =  bin.readLine()) != null) {
fields = b.split(patternStr);

System.out.println("ProductsId : " + fields[0]);
System.out.println("ProductsName : " + fields[1]);
System.out.println("SuppliersId : " + fields[2]);
System.out.println("CategoriesId : " + fields[3]);
System.out.println("QuantityPerUnit: " + fields[4]);
System.out.println("UnitPrice : " + fields[5]);

}
fin.close();
}
}