package day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class inp_outp {
    public static void main(String[] args)throws Exception {
        File file = new File(
                "C:\\Users\\Haralda pc\\IdeaProjects\\Bootcamp\\src\\main\\java\\day\\task1.java");
        String st;
        StringBuilder sum = new StringBuilder();

            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                while ((st = br.readLine()) != null) {
                    sum.append(st);
                }
            }catch (IOException e){
                System.out.println("eror");
            }
            byte[] b = sum.toString().getBytes();
            System.out.print(Arrays.toString(b));
//

    }
}