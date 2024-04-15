/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5_quiz2;

/**
 *
 * @author Naveen Raj. K
 */
import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class FileFilter 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the folder path: ");
        String folderPath = scanner.nextLine();

        System.out.print("Enter the file extension (e.g., txt): ");
        String fileExtension = scanner.nextLine();

        File folder = new File(folderPath);
        File[] filteredFiles = getFilesWithExtension(folder, fileExtension);

        System.out.println("Files with extension " + fileExtension + " in folder " + folderPath + ":");
        for (File file : filteredFiles) {
            System.out.println(file.getName());
        }

        scanner.close();
    }

    private static File[] getFilesWithExtension(File folder, final String extension) 
    {
        FilenameFilter filter = new FilenameFilter() 
        {
            @Override
            public boolean accept(File dir, String name) 
            {
                return name.endsWith("." + extension);
            }
        };

        File[] files = folder.listFiles(filter);

        return files;
    }
}
