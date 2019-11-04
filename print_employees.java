import java.io.*;
class print_employees{
public static void main (String args[]) throws IOException {

String b;
String[] fields;
String patternStr = ",";
FileReader fin = new FileReader("data_employees.txt");
BufferedReader bin = new BufferedReader (fin);
while ((b =  bin.readLine()) != null) {
fields = b.split(patternStr);

System.out.println("EmployeesId : " + fields[0]);
System.out.println("EmployeesName : " + fields[1]);
System.out.println("EmployeesAdders : " + fields[2]);
System.out.println("EmployeesPhone : " + fields[3]);

}
fin.close();
}
}