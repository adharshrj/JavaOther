import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {

            FileProcess fc = new FileProcess();
            Scanner sc = new Scanner(System.in);

            // String file1Name = "C:/Users/subee/IdeaProjects/ZipFiles/file1.txt";
            // String file2Name = "C:/Users/subee/IdeaProjects/ZipFiles/file2.txt";
            // String file3Name = "C:/Users/subee/IdeaProjects/ZipFiles/file3.txt";

            ArrayList<String> files = new ArrayList<String>();
            System.out.println("Enter the no.of files: ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println( " Enter the file path of " + (i +1)+":");
                
                String str = sc.next();
                files.add(str);
            }

            // for(String a:files){
            // System.out.println(a.toString());
            // }
            int k = 0;
            String[] fls = new String[files.size()];

            for (String a : files) {
                fls[k++] = a;
            }

            System.out.println("Checking!!!...");
            for (int j = 0; j < fls.length; j++) {
                fc.addToZipFile(fls[j]);
            }

            System.out.println("Do you want to create a zipfile and write the files to it? (Y/N)");
            String ch = sc.next();

            if (ch.equalsIgnoreCase("y")) {
                for (int j = 0; j < fls.length; j++) {
                    fc.writeToZip(fls[j]);
                }
            } else {
                System.out.println("Thank You");
            }

            sc.close();

        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println("Error: " + e);
            System.out.println("Cannot create Zip File!");
            System.out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
