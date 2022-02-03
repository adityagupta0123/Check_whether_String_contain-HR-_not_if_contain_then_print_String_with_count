import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        String str[] = new String[n];
        String str1[] = new String[n];
        for(int i =0; i<n; i++){
            str[i] = sc.nextLine();
        }
        for(int j=0; j<n; j++){
            if(str[j].contains("HR") == true){
                str1[count]=str[j];
                count++;
            }
            
        }
         if(count > 0)
                  System.out.println(count);
            else
                  System.out.println("-1");
            for (int i = 0; i < n; i++) {
                  if(str[i].contains("HR"))
                        System.out.println(str[i].toUpperCase());
            }
      
    }
}
