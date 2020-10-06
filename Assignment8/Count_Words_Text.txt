package assignment;

import java.io.BufferedReader;  
import java.io.FileReader;  
   
public class Count_Words_Text   
{  
    public static void main(String[] args) throws Exception {  
        String line;  
        int count = 0;  
          
        
        FileReader file = new FileReader("D://CDAC//Java_Assignment//TextSol//Sample.txt");  
        BufferedReader br = new BufferedReader(file);  
              
          
        while((line = br.readLine()) != null) {  
             
            String words[] = line.split(" ");  
             
            count = count + words.length;  
        }  
          
        System.out.println("Number of words present in given file: " + count);  
        br.close();  
    }  
} 