public class App {
    public static void main(String[] args) throws Exception {

        String arq="lastNumber.txt"; //set last number archive name. path must be on src directory

        System.out.println("Using tradittional singleton");
        
        NumberGeneratorTraditional generator = NumberGeneratorTraditional.getInstance(arq);
        System.out.println("next number: "+generator.getNextNumber(arq));


    }
}
