package program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        String path = "C:\\Windows\\System32\\drivers\\etc\\hosts";
        File file = new File(path);
        Scanner scanner = null;
        try {
            if(file.exists()){
                scanner = new Scanner(file);
            }else{
                System.out.println("Arquivo não encontrado");
            }
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }finally {
            scanner.close();
        }

    }
}