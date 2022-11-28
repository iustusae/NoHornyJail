/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReadingAndWriting;

import java.io.BufferedReader;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author waougri
 */
public class FileIO {
    
    public static String readOneLine(File file) {
        StringBuilder temp = new StringBuilder();
        try {
            File myObj = new File(file.getPath());
            Scanner reader = new Scanner(myObj);
            while (reader.hasNextLine()) {
                temp.append(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("an error occured");
        }

        return temp.toString();
    }
    
    public static ArrayList<String> RainbowFileReader() throws FileNotFoundException, IOException{
        BufferedReader bufReader = new BufferedReader(new FileReader(new File(GLOBAL_VARS.GLOBALVARS.PATH_TO_COLOR_FILE)));
        ArrayList<String> listOfLines = new ArrayList();

        String line = bufReader.readLine();
        while (line != null) {
      listOfLines.add(line);
      line = bufReader.readLine();
        }

    bufReader.close();
        
        
    
        return listOfLines;
    
    }
    
    
    
    public static void WriteToFile(String path, String message) throws IOException {
        try {
            FileWriter myWriter = new FileWriter(path);
            myWriter.write(message);
            myWriter.close();
            System.out.println("Successfully wrote to the file. "  + message);
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
    
     public static String CreateTempFiles(String path) throws IOException{
        ArrayList<String> paths;
        paths = new ArrayList();
        File f = new File(path);

        System.out.println(f.getAbsolutePath());

        if (!f.getParentFile().exists()) {
            f.getParentFile().mkdirs();
            paths.add(f.getAbsolutePath());
            System.out.println("creating dirs"+ f.getName());
        }else {System.out.println("Already Exists" + f.getName());paths.add(f.getAbsolutePath());}
        if (!f.exists()) {
            f.createNewFile();
            System.out.println("Creating file"+ f.getName());
            paths.add(f.getAbsolutePath());
        }else {System.out.println("Already Exists" + f.getName());}


        return paths.get(0);
    }
     
     public static void CreateMainFiles() throws IOException{
     
         CreateTempFiles(GLOBAL_VARS.GLOBALVARS.PATH_TO_COLOR_FILE);
         CreateTempFiles(GLOBAL_VARS.GLOBALVARS.PATH_TO_DIR_FILE);
         CreateTempFiles(GLOBAL_VARS.GLOBALVARS.PATH_TO_STATUS_FILE);
         CreateTempFiles(GLOBAL_VARS.GLOBALVARS.PATH_TO_OSU_FILE);
     
     }

}
    

