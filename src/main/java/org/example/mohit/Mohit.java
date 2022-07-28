package org.example.mohit;

import java.io.*;
import java.util.HashMap;

public class Mohit {
    public static void main(String[] args) throws IOException {
        HashMap<Student,Subject> hashMap=new HashMap<>();
        File file=new File("/Users/siva/Downloads/","file.docx");
        //FileReader fr=new FileReader()
        System.out.println("File: "+file.getName());
        System.out.println("File abs path: "+file.getAbsolutePath());
        System.out.println("File parent: "+file.getParent());
        System.out.println("File total space: "+file.getTotalSpace());
        System.out.println("File abs file: "+file.getAbsoluteFile());
        System.out.println("File toString: "+file.toString());
        System.out.println("File length: "+file.length());
        System.out.println("File can read: "+file.canRead());
        System.out.println("File last modifiled: "+file.lastModified());
        String dir="Users/siva/Downloads/";
        File fileDir=new File(dir);
        System.out.println(fileDir.getName()+" downloads dir name");
        System.out.println(fileDir.isDirectory()+" dowloads is directory");
        int size;
        try (FileInputStream fip=new FileInputStream("/Users/siva/Downloads/file.docx")){
            System.out.println("Total Available Bytes: " + (size = fip.available()));
            int n=size/40;
            for(int i=0;i<n;i++){
                System.out.print((char) fip.read());
            }
            System.out.println("\nStill Available: " + fip.available());
            System.out.println("Reading the next " + n +
                    " with one read(b[])");
            byte b[] = new byte[n];
            if (fip.read(b) != n) {
                System.err.println("couldn’t read " + n + " bytes.");
            }
            System.out.println(new String(b, 0, n));
            System.out.println("\nStill Available: " + (size = fip.available()));
        }
        String source = "Now is the time for all good men\n"
                + " to come to the aid of their country\n"
                + " and pay their due taxes.";
        byte buf[] = source.getBytes();
        System.out.println(source);
        System.out.println((char) buf[0]);
        FileOutputStream f0 = null;
        try {
            f0 = new FileOutputStream("/Users/siva/Downloads/FILE_OUTPUT.rtf");

            // write to first file
            for (int i=0; i < buf.length; i ++) f0.write(buf[i]);
            // write to second file
           
        } catch(IOException e) {
            System.out.println("An I/O Error Occurred");
        }
        FileReader fileReader=new FileReader("/Users/siva/Downloads/FILE_OUTPUT.rtf");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        int i;
        while((i=bufferedReader.read())!=-1){
            System.out.print((char)i);
        }
        bufferedReader.close();
        fileReader.close();

        FileInputStream fileInputStream=new FileInputStream("/Users/siva/Downloads/FILE_OUTPUT.rtf");
        System.out.println((char) fileInputStream.read());
        System.out.println("Total Available Bytes: " +
                (size = fileInputStream.available()));
        int n=size/3;
        for(int j=0;j<n;j++){
            System.out.print((char) fileInputStream.read());
        }
        byte b[] = new byte[n];
        if (fileInputStream.read(b) != n) {
            System.err.println("couldn’t read " + n + " bytes.");
        }
        System.out.println(new String(b, 0, n));
       // System.out.println(new String(f, 0, n));





        //System.out.println(fip.available());

    }

}
class Student {
    int studentId;
    String studentName;

}
class Subject{
    int id;
    String subName;
}
