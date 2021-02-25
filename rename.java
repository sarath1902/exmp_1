import java.io.File; 
  
public class rename { 
    public static void main(String[] args) 
    { 
        File oldName = new File("C:\\Users\\sarat\\OneDrive\\Desktop\\java programs\\asd.txt"); 
        File newName = new File("C:\\Users\\sarat\\OneDrive\\Desktop\\java programs\\renamed.txt"); 
  
        if (oldName.renameTo(newName))  
            System.out.println("Renamed successfully");         
        else 
            System.out.println("Error");         
    } 
} 