package rustyFingers;


class rustyFingers{	
	public static void main(String[] args) throws java.io.IOException{
		java.io.File file = new java.io.File("File.txt");
		String[] content = {"red", "blue", "green"};
		
		try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.PrintWriter(file))){
			
			for (String s : content) 
				writer.append(s).append("\n");
			
		} catch (java.io.IOException e) {
			System.out.println(e.getMessage());
		}
		
//		java.io.File file = new java.io.File("File.txt");
//		
//		try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(file))) {
//			
//			if (file.exists()) {
//				System.exit(1);
//			}
//			
//			String line;
//			while ((line = reader.readLine()) != null) {
//				System.out.println(line);
//			}
//			
//		} catch (java.io.FileNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
	    
	/*
	 * input.next(); gets is whatever is seperated with a space character
	 */
		


		
		
	}
}