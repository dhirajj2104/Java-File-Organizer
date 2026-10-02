package java_file_organizer;

public class FileClassifier {
	public static String getCategory(String extension) {

		extension = extension.toLowerCase();

		if (extension.equals("jpg") || extension.equals("jped") || extension.equals("png") || extension.equals("gif")) {

			return "Images";
		}

		if (extension.equals("docx") || extension.equals("pdf") || extension.equals("txt")) {

			return "Documents";
		}

		if (extension.equals("mp3") || extension.equals("wav") || extension.equals("flac")) {

			return "Music";
		}

		if (extension.equals("mp4") || extension.equals("mkv") || extension.equals("avi")) {

			return "Videos";
		}
		
		if (extension.equals("java") || extension.equals("py") || extension.equals("js") || extension.equals("cpp")) {

			return "Code";
		}
		
		if (extension.equals("exe") || extension.equals("msi") || extension.equals("apk") || extension.equals("app")) {

			return "Apps";
		}
		
		if (extension.equals("csv") || extension.equals("xlsx") || extension.equals("json")) {

			return "Data";
		}

		return "Others";
	}
}
