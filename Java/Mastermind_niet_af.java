import java.util.Scanner;

public class Mastermind {
    public static void main(String[] args) {
        System.out.println("MASTERMIND");
        System.out.println("Raad de code: ");
        System.out.println("_ _ _ _");
        
        int geheimeCode[] = {4, 6, 2, 1}; // random generaten?
        String deCode = "";
        for (int i = 0; i < 3; i++) {
            char j;
            if (i == 0) {
                j = 'a';
            }
            if (i == 1) {
                j = 'b';
            }
            if (i == 2) {
                j = 'c';
            }
            if (i == 3) {
                j = 'd';
            }
            if (i == 4) {
                j = 'e';
            }
            if (i == 5) {
                j = 'f';
            }
            deCode.append(j);
        }

        String input = "";
        Scanner myScan = new Scanner(System.in);

        // DE CODE WORDT GERADEN DOOR DE SPELER TOT ZE HET GOED HEBBEN
        while (input != deCode){
            input = myScan.nextLine();
            
            // ALS HET WOORD TE LANG IS MOET HET OPNIEUW VAN MIJ
            int lenInput = input.length();
            if (lenInput == 4){ 
                // PER LETTER CHECKEN OF IE IN DE CODE VOORKOMT
                for (int k = 0; k < 4; k++){
                    String letter = String.valueOf(input.charAt(k));
                    int inCodeTeller = 0;
                    int opGoedePlekTeller = 0;
                    if (deCode.contains(letter)){
                        inCodeTeller += 1;
                    }
                    if (deCode.charAt(k) == input.charAt(k)){
                        opGoedePlekTeller += 1;
                }
                System.out.println(input.toString);
            }
            else {
                System.out.println("Dit zijn te veel/weinig letters...");
            }
        }
    }
}

public String toString() {
    String codeString = "";
    codeString = (inCodeTeller + " letters zitten in de code...\n"
    + opGoedePlekTeller + " letters staan op de goede plek...\n");
    return codeString;
}