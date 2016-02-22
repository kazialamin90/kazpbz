package com.name.test;

public class Name {
 
	public static void main(String[] args) 
    {
       
        validateName("Pigush , ", "k.","Karmokar, ", "k.Karmokar, Pigush ");
        validateName("Pigush , ", "k.","Karmokar, ", "Karmokar, Pigush , k.");
        
    }
    
    
        public static void validateName(String strFirstName, String strMidName, String strLastName, String strActFullName)
        {
            
            String desireFormatFullName = (strLastName+strFirstName+ strMidName);
            System.out.println(desireFormatFullName);
            
                if(strActFullName.equalsIgnoreCase(desireFormatFullName))
                {
                    System.out.println("The Test passed");
                }
                else
                {
                    System.out.println("The Test is in that same method");
                }            
        }
}
