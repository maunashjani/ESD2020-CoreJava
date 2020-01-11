import java.io.*;

class eh3 {
    public static void main(String [] args) throws IOException, FileNotFoundException {
        //FileWriter fw = new FileWriter("a.txt");
        //String data = "This is sample data";

        //for(int i=0; i<data.length(); i++)
        //{
            //fw.write(data.charAt(i));
        //}

        //fw.write(data);

        //fw.close();  

        try{
            FileReader fr = new FileReader("b.txt");

            int ch;
            while((ch=fr.read())!=-1){
                System.out.print((char)ch);
            }     

            fr.close();
        }
        catch(Exception ex){
            //ex.printStackTrace();
            System.out.println("The file specified not found");
        }
        
    }
}