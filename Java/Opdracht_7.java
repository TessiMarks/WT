import java.util.Scanner;

class Opdracht7 {
    public static void main(String[] args) {
        System.out.println("OPDRACHT 7");
        System.out.println("Raad het woord: ");
        String hetWoord = "fiets";
        int lenWoord = hetWoord.length();
        String input = "";
        Scanner myScan = new Scanner(System.in);

        // EERST STREEPJES VOOR HET WOORD LATEN ZIEN
        for (int i = 0; i < lenWoord; i++){
            System.out.print("_ ");
        }
        System.out.println("");

        // HET WOORD WORDT GERADEN DOOR DE SPELER TOT ZE HET GOED HEBBEN
        while (input != hetWoord){
            input = myScan.nextLine();
            
            // ALS HET WOORD TE LANG IS MOET HET OPNIEUW VAN MIJ
            int lenInput = input.length();
            if (lenInput == lenWoord){ 
                // PER LETTER CHECKEN OF IE 1. IN HET WOORD VOORKOMT EN 2. OP DE GOEDE PLEK STAAT
                for (int j = 0; j < lenWoord; j++){
                    String letter = String.valueOf(input.charAt(j));
                    boolean inWoord = false;
                    if (hetWoord.contains(letter)){
                        inWoord = true;
                    }
                    if (hetWoord.charAt(j) == input.charAt(j)){
                        System.out.print("2 ");
                    }
                    if (inWoord == true && hetWoord.charAt(j) != input.charAt(j)){
                        System.out.print("1 ");
                    }
                    if (inWoord == false) {
                        System.out.print("0 ");
                    }
                    /*if (input == hetWoord){
                        System.out.println("Goed geraden!");
                        myScan.close();
                    }*/
                }
                System.out.println("");
            }
            else {
                System.out.println("Dit zijn te veel/weinig letters...");
            }
        }
    }
}