package java_file_organizer;

import java.io.File;

public class FileOrganizer {
	public static void main(String args[]) {
		
		File folder = new File("TextFiles");
		
		System.out.println("Java File Organizer");
		System.out.println("\nScanning Folder...\n");
		
		if(!folder.exists()) {
			System.out.println("Folder not found..!");
			return;
		}
		
		if(!folder.isDirectory()) {
			System.out.println("The path is not folder.");
			return;
		}
		
		File[] files = folder.listFiles();
		
		if(files == null) {
			System.out.println("Could not read the folder.");
			return;
		}
		
		createCategoryFolders(folder);
		
		int count = 0;
		
		for(File file : files) {
			
			if(file.isFile()) {
				
				String fileName = file.getName();
				
				int dotIndex = fileName.lastIndexOf(".");
				
				String category;
				
				if(dotIndex != -1) {
					String extension = fileName.substring(dotIndex + 1);
					
					category = FileClassifier.getCategory(extension);
					
					System.out.println(fileName + " -> " + extension + " -> " + category);
				}	
				else {
					category = "Others";
				}
				
				File destinationFolder = new File(folder, category);
				
				FileMover.moveFiles(file, destinationFolder);
				
				count++;
			}
		}
		
		System.out.println("\nTotal files found: "+count);
		
	}
	public static void createCategoryFolders(File folder) {
		
		String[] categories = {
				"Images",
				"Documents",
				"Music",
				"Videos",
				"Code",
				"Apps",
				"Data",
				"Other"
		};
		
		for(String category : categories) {
			
			File categoryFolder = new File(folder, category);
			
			if(!categoryFolder.exists()) {
				categoryFolder.mkdir();
				System.out.println("Created: " + category);
			}
		}
	}
}
