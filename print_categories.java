import java.io.*;
class print_categories{
public static void main (String args[]) throws IOException {

String b;
String[] fields;
String patternStr = ",";
FileReader fin = new FileReader("data_categories.txt");
BufferedReader bin = new BufferedReader (fin);
while ((b =  bin.readLine()) != null) {
fields = b.split(patternStr);

System.out.println("CategoriesId : " + fields[0]);
System.out.println("CategoriesName : " + fields[1]);
System.out.println("Description  : " + fields[2]);


}
fin.close();
}
}