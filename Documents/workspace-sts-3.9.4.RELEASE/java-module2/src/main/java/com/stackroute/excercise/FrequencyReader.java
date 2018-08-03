package com.stackroute.excercise;

import java.util.Scanner;
import java.io.*;

public class FrequencyReader {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the file name you want to read");
        String str = sc.nextLine();
        str = "/home/user/" + str;
        FrequencyReader reader = new FrequencyReader();
        String[] output =reader.readFile(str);
        for (String string : output) {
            System.out.println(string);
        }
    }

    public String[] readFile(String strr) {
        BufferedReader br = null;
        String str="";
       StringBuffer content=new StringBuffer();
       try {
           br = new BufferedReader( new FileReader(strr));
           while((str=br.readLine()) != null){
               content.append(str);
           }
           br.close();
       }
       catch (FileNotFoundException e) {
           System.err.println("Unable to find the file: fileName");
       }
       catch (IOException e) {
           System.err.println("Unable to read the file: fileName");
       }
       String output[]= this.freCounter(content.toString().toUpperCase());
       return output;    }
    
    private String[] freCounter(String reader) {

        String[] splitstr=reader.split("[ |.|,]");
        String output="";
        String str=null;
        for(int i=0;i<splitstr.length;i++) {
            int count=0;
            str=splitstr[i];
            for(int j=0;j<splitstr.length;j++) {
                if(str.equals(splitstr[j])) {
                    count++;
                    splitstr[j]=" ";
                }
            }
            if(!str.contains(" ") && !str.contains("\n") && !str.contains("\r")) {
                output += str+"-"+count+" ";
            }
        }
        String result[]=output.trim().split(" ");
        return result;
}
}