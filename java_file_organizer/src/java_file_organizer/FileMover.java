package java_file_organizer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMover {
	public static void moveFiles(File file, File destinationFolder) {

	    Path source = file.toPath();

	    File destinationFile =
	            new File(destinationFolder, file.getName());

	    int counter = 1;

	    while (destinationFile.exists()) {

	        String fileName = file.getName();
	        int dotIndex = fileName.lastIndexOf(".");

	        String name;
	        String extension;

	        if (dotIndex != -1) {
	            name = fileName.substring(0, dotIndex);
	            extension = fileName.substring(dotIndex);
	        } else {
	            name = fileName;
	            extension = "";
	        }

	        String newName =
	                name + " (" + counter + ")" + extension;

	        destinationFile =
	                new File(destinationFolder, newName);

	        counter++;
	    }

	    Path destination = destinationFile.toPath();

	    try {

	        Files.move(source, destination);

	        System.out.println(
	            "Moved: " + file.getName() +
	            " → " + destinationFile.getName()
	        );

	    } catch (IOException e) {

	        System.out.println(
	            "Could not move: " + file.getName()
	        );
	    }
	}
}
