import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NumberGeneratorTraditional {
    //static members
    private static NumberGeneratorTraditional instance;
    public synchronized static NumberGeneratorTraditional getInstance(String ArqName) {
        if (instance == null) {
            instance = new NumberGeneratorTraditional();
            instance.setCount(ArqName);
        }
        return instance;
    }
    //instance variables
    private int count;
    

    private void setCount(String ArqName) {
        String mydir= System.getProperty("user.dir");
        mydir=mydir+"\\src\\"+ArqName;

        try {
            FileReader arq = new FileReader(mydir);
            BufferedReader readArq = new BufferedReader(arq);
            String line = "";
    
            try {
                //read first line
                line = readArq.readLine();
                this.count =(Integer.parseInt(line));

    
                arq.close();
    
            } catch (IOException ex) {
                System.out.println("Error: Can't read arq");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: Arq not found");
        }
    }

    //instance constructor
    private NumberGeneratorTraditional(){}

    //instance methods
    public synchronized int getNextNumber(String ArqName){
        count++;
        Write(ArqName, count);
        return count;
    }

    //write
    private boolean Write(String ArqName,int num) {
        try {
            String mydir= System.getProperty("user.dir");
            mydir=mydir+"\\src\\"+ArqName;

            FileWriter arq = new FileWriter(mydir,false);
            arq.write(""+num);
            arq.close();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
