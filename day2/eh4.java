import java.io.*;
import java.util.Scanner;

class eh4 {
    
    public void ReadData() throws FileNotFoundException {
        try {
            System.out.println("Enter File Name:");
            Scanner scan = new Scanner(System.in);
            String filename = scan.next();
            FileReader fr = new FileReader(filename);

            int ch;

            while((ch=fr.read())!=-1)
            {
                System.out.print((char) ch);
            }

            fr.close();
        }
        catch(Exception ex)
        {
            throw new FileNotFoundException("file not present");
        }
    }

    public void SaveData() throws IOException, FileNotFoundException {
        System.out.println("Enter File Name:");
        Scanner scan = new Scanner(System.in);
        String filename = scan.next();
        System.out.println("Enter Content:");
        Scanner scan1 = new Scanner(System.in);
        String data = scan1.nextLine();
        FileWriter fw = new FileWriter(filename);
        for(int i=0; i<data.length(); i++)
        {
            fw.write(data.charAt(i));
        }
        fw.close();
    }

    

    public static void main(String [] args) throws IOException, FileNotFoundException{
        eh4 obj = new eh4();
        obj.ReadData();
        obj.SaveData();
        obj.ReadData();        
    }
}