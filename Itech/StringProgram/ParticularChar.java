package Itech.StringProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParticularChar {

    public static void main(String[] args) throws IOException {

       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your String..");
       String value =   bufferedReader.readLine();

        System.out.println("Enter your character..");
      //  int x = System.in.read();
        char ch = (char) System.in.read();

        int numOfTimesChWasFound = 0;

        for (int i=0; i<value.length(); i++){
           char c =  value.charAt(i);

           if(c==ch){
               numOfTimesChWasFound++;
           }
        }

        System.out.println(numOfTimesChWasFound);
    }
}
