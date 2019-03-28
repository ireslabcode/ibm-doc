package cclms.aap.csv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
/**
 * CsvFileWriter creates a comma separated value format �CSV� file from a set of user data 
 * and save it in your home directory. Firstly, it writes the CSV file header, and then it 
 * writes the user data using FileWriter class.
 * 
 * 
 * 
 * @author Santosh Mahto
 * 
 */
public class CsvFileWriter {
     
    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
     
    //CSV file header
    private static final String FILE_HEADER = "id,userName,password";
 
    public static void writeCsvFile(String fileName) {
         
        //Create new user objects and implement security layer.
    	PasswordSecret td =null ;
    	
    	try {
			td= new PasswordSecret();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
    	
    	
        UserModel userModel = new UserModel(1,"testuser",td.encrypt("testpass") );
        
         
        //Create a new list of user objects
        List<UserModel> users = new ArrayList();
        users.add(userModel);
      
         
        FileWriter fileWriter = null;
                 
        try {
            fileWriter = new FileWriter(fileName);
 
            //Write the CSV file header
            fileWriter.append(FILE_HEADER.toString());
             
            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);
             
            //Write a new student object list to the CSV file
            for (UserModel user : users) {
                fileWriter.append(String.valueOf(user.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(user.getUserName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(user.getPassword());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
 
             
             
            System.out.println("CSV file was created successfully !!!");
             
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
             
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
             
        }
    }
}