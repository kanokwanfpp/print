import java.io.*;
class print_suppliers{
public static void main (String args[]) throws IOException {

String b;
String[] fields;
String patternStr = ",";
FileReader fin = new FileReader("data_suppliers.txt");
BufferedReader bin = new BufferedReader (fin);
while ((b =  bin.readLine()) != null) {
fields = b.split(patternStr);

System.out.println("SuppliersId : " + fields[0]);
System.out.println("CompanyName : " + fields[1]);
System.out.println("SuppliersAdders : " + fields[2]);
System.out.println("SuppliersPhone : " + fields[3]);

}
fin.close();
}
}