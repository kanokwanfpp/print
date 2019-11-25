import java.io.*;
import java.lang.*;
import java.util.regex.*;
class updtxt {
  public static void main(String args[]) throws IOException {
    String waitopt;
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));    
    String buf; 
    waitopt  = "Menu [0, 1, 2, 3, 4, 5, 6, 7, 8,9,10,11,12,13,14] : ";
    displaymenu();
    System.out.print(waitopt);
    buf = stdin.readLine();
    while (!buf.equals("0")) {
      if (buf.equals("0") || buf.equals("bye")) {
        System.out.println("Bye Bye");  
        break;
      } else if (buf.equals("1")) {
        addstu();
        buf = " ";
      } else if (buf.equals("2")) {
        addsubj();
        buf = " ";
      } else if (buf.equals("3")) {
        addregis();
        buf = " ";
      } else if (buf.equals("4")) {
        deletestu();
        buf = " ";
      } else if (buf.equals("5")) {
        deletesubj();
        buf = " ";
      } else if (buf.equals("6")) {
        deleteregis();
        buf = " ";
      } else if (buf.equals("7")) {
        editstu();
        buf = " ";
      } else if (buf.equals("8")) {
       	editsub();
       	buf = " ";
     	} else if (buf.equals("9")) {
       	editregis();
       	buf = " ";
     	} else if (buf.equals("10")) {
        list("stu.txt");
        buf = " ";
      } else if (buf.equals("11")) {
        list("subj.txt");
        buf = " ";
      } else if (buf.equals("12")) {
        list("regi.txt");
        buf = " ";
      } else if (buf.equals("13")) {
        search();
        buf = " ";
      } else if (buf.equals("13")) {
        list("myprofile.txt");
        buf = " ";
      } else {
        System.out.print(waitopt);
        buf = stdin.readLine();
        
      }
    }
  }
// ======================================================
  static void displaymenu () {
    System.out.println("0 : Bye bye");
    System.out.println("1 : Addstu");
    System.out.println("2 : Addsubj");
    System.out.println("3 : Addregi");
    System.out.println("4 : Deletestu");
    System.out.println("5 : Deletesubj");
    System.out.println("6 : Deleteregi");
    System.out.println("7 : Editstu");
    System.out.println("8 : Editsubj");
    System.out.println("9 : Editregi");
    System.out.println("10 : list stu");
    System.out.println("11 : list subj");
    System.out.println("12 : list regi");
    System.out.println("13 : Search");
    System.out.println("14 : My Profile");
    System.out.println("");  
  }
// ======================================================
  public static void addstu () throws IOException {
   BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid,bufname,bufsex;
    System.out.print("Student Id : ");
    bufid = stdin.readLine();
    System.out.print("Student Name : ");
    bufname = stdin.readLine();
    System.out.print("Student Sex : ");
    bufsex = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("stu.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    int mok = i;
    FileOutputStream fout = new FileOutputStream("stu.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < mok) {      
      pout.println(ar[i]);     
      i = i + 1;
    }
    pout.println(bufid + "," + bufname + "," + bufsex);
    System.out.println("Add : completely");
    pout.close();
  }
  // ======================================================
  public static void addsubj () throws IOException {
   BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid,bufname;
    System.out.print("Subjects Id : ");
    bufid = stdin.readLine();
    System.out.print("subject Name : ");
    bufname = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("subj.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    int mok = i;
    FileOutputStream fout = new FileOutputStream("subj.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < mok) {      
      pout.println(ar[i]);     
      i = i + 1;
    }
    pout.println(bufid + "," + bufname);
    System.out.println("Add : completely");
    pout.close();
  }
 // ======================================================
  public static void addregis () throws IOException {
   BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufstdid,bufsubid,bufgrade,bufsec;
    System.out.print("Enter stuent Id : ");
    bufstdid = stdin.readLine();
    System.out.print("Enter subject Id : ");
    bufsubid = stdin.readLine();
    System.out.print("Enter grade : ");
    bufgrade = stdin.readLine();
    System.out.print("Enter sec: ");
    bufsec = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("regi.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    int mok = i;
    FileOutputStream fout = new FileOutputStream("regi.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < mok) {      
      pout.println(ar[i]);     
      i = i + 1;
    }
    pout.println(bufstdid + "," + bufsubid+ "," + bufgrade+ "," + bufsec);
    System.out.println("Add : completely");
    pout.close();
  }

// ======================================================
  public static void deletestu () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid;
    System.out.print("Student id : ");
    bufid = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("stu.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int mok = i;
    FileOutputStream fout = new FileOutputStream("stu.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < mok) {      
      if (bufid.equals(ar[i].substring(0,3))) {
        System.out.println("Delete stuent : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
// ======================================================
  public static void deletesubj () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid;
    System.out.print("Subjects id : ");
    bufid = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("subj.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int mok = i;
    FileOutputStream fout = new FileOutputStream("subj.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < mok) {      
      if (bufid.equals(ar[i].substring(0,3))) {
        System.out.println("Delete subject : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
  // ======================================================
  public static void deleteregis () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid;
    System.out.print("Register id : ");
    bufid = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("regi.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int mok = i;
    FileOutputStream fout = new FileOutputStream("regi.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < mok) {      
      if (bufid.equals(ar[i].substring(0,3))) {
        System.out.println("Delete register : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
  // ======================================================
  public static void editstu () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String studentid,studentname,sex;
    System.out.print("Enter Student ID : ");
    studentid = stdin.readLine();
    System.out.print("Enter Name : ");
    studentname = stdin.readLine();
    System.out.print("Enter Sex : ");
    sex = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("stu.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("stu.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (studentid.equals(ar[i].substring(0,3))) {
        pout.println(studentid + "," + studentname + "," + sex);
        System.out.println("Edit stuent : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
// ==========================
  public static void editsub () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String subjectid,subjectname;
    System.out.print("Enter  Subjects ID : ");
    subjectid = stdin.readLine();
    System.out.print("Enter  Subjects Name : ");
    subjectname = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("subj.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("subj.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (subjectid.equals(ar[i].substring(0,3))) {
        pout.println(subjectid + "," + subjectname );
        System.out.println("Edit subject : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
// ==========================
  public static void editregis () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String registerid,subjectid,grade,sec;
    System.out.print("Enter stuent id : ");
    registerid = stdin.readLine();
    System.out.print("Enter subject id : ");
    subjectid = stdin.readLine();
    System.out.print("Enter grade : ");
    grade = stdin.readLine();
    System.out.print("Enter sec: ");
    sec = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("regi.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("regi.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (registerid.equals(ar[i].substring(0,3))) {
        pout.println(registerid + "," + subjectid + "," + grade + "," + sec);
        System.out.println("Edit : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
// ==========================
  // ======================================================
  public static void list (String f) throws IOException {
    int n = 0;
    byte b[] = new byte[128];
    FileInputStream fin = new FileInputStream(f);
    while ((n = fin.read(b)) != -1) {
      for(int i=0;i<n;i++) {
        System.out.print((char)b[i]);
      }
    }
    fin.close();
  }
    
// =======================
public static void search() throws IOException{
  int found =0;
  char buf;
  String b,g = "";
  String[] fields;
  System.out.println("=================================");
  System.out.print("Enter Student ID : ");
  buf =(char)System.in.read();
  System.out.println("=================================");
  while (buf != 'f'){
    g = g+buf;
    buf = (char)System.in.read();

  }
  FileReader fin = new FileReader("regi.txt");
  BufferedReader bin = new BufferedReader(fin);
  while((b=bin.readLine()) != null){
    fields = b.split(",");
    if(fields[0].equals(g)){
      System.out.println("== register Data ==" + "\n" +
        "Student ID : " + fields[0] + "\n" +
        "Subject ID : " + fields[1] + "\n" +
        "Grade ID : " + fields[2] + "\n" +
        "Sec : " + fields[3]);
      System.out.println("=================================");
      found=1;
    }
  }
  if (found == 0)System.out.println("Not Found");
  fin.close();
}
  // =======================
public static void prof (String f) throws IOException {
    int n = 0;
    byte b[] = new byte[128];
    FileInputStream fin = new FileInputStream(f);
    while ((n = fin.read(b)) != -1) {
      for(int i=0;i<n;i++) {
        System.out.print((char)b[i]);
      }
    }
    fin.close();
  }
}

