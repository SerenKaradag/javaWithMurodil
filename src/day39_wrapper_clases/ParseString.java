package day39_wrapper_clases;

public class ParseString {
    public static void main(String[] args) {
        String total ="345";
        int count = Integer.parseInt(total);
        // STRING TO INTEGER OBJECT TO INT PRIMITIVE
        System.out.println("count = "+ count);

        String strPrice = "123.5";
        double price = Double.parseDouble(strPrice);
        if(price > 100){
            System.out.println("expensive");
        }

        String sentence = "I wrote 100 lines of code";
        //split by space, parse index 2 to int
      //  int linesOfCode =

        String[]words = sentence.split(" ");
        int linesOfCode = Integer.parseInt(words[2]);
        System.out.println("linesOfCode = " + linesOfCode);

    }
}