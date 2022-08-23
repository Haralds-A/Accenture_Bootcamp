package day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class inp_outp {
    public static void main(String[] args)throws Exception {
        File file = new File(
                "C:\\Users\\Haralda pc\\IdeaProjects\\day2_AJB\\src\\day4\\text.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        String sum = "";
        while ((st = br.readLine()) != null){
            sum += st;
        }
        byte[] b = sum.getBytes();
        System.out.print(Arrays.toString(b));
    }
}