package phase1project;


		// TODO Auto-generated method stub

		import java.io.*; 
		public class filehandling { 
		public static void main(String[] args) { 
		String fileName = "New.txt"; 
		String contentToWrite = "This is a new line."; 
		String contentToAppend = "File content after appending."; 
		try (FileWriter writer = new FileWriter(fileName)) { 
		writer.write("This is the first line.\n"); 
		writer.write(contentToWrite); 
		writer.close(); 
		System.out.println("Successfully read from the file."); 
		} catch (IOException e) { 
		System.out.println("An error occurred while writing to the file."); 
		e.printStackTrace(); 
		} 
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) { String line; 
		while ((line = reader.readLine()) != null) { 
		System.out.println(line); 
		} 
		reader.close(); 
		} catch (IOException e) { 
		System.out.println("An error occurred while reading from the file.");
		e.printStackTrace(); 
		} 
		try (FileWriter writer = new FileWriter(fileName, true)) { 
		writer.write("\n" + contentToAppend); 
		writer.close(); 
		System.out.println("Successfully appended to the file."); 
		} catch (IOException e) { 
		System.out.println("An error occurred while appending to the file."); e.printStackTrace(); 
		} 
		} 

	}

