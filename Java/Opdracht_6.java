import java.util.Scanner;

class Opdracht6 {
    public static void main(String[] args) {
        System.out.println("OPDRACHT 6");
        Scanner myScan = new Scanner(System.in);
        System.out.print("Typ hier een tekst: ");
        String input = myScan.nextLine();
        myScan.close();
        char charArray[] = input.toCharArray();
        
        // CHARACTER ARRAY SORTEREN
        char temp;
        boolean klaar = false;
        while (klaar == false){
            klaar = true;
            for (int j = 0; j < charArray.length-1; j++){
                if (charArray[j] > charArray[j+1]){
                    temp = charArray[j];
                    charArray[j] = charArray[j+1];
                    charArray[j+1] = temp;
                    klaar = false;
                }
            }
        }

        // CHARACTER ARRAY NAAR STRING
        String deString = "";
        for (int j = 0; j < charArray.length; j++){
            deString = deString + charArray[j];
        }
        System.out.println(deString);

    }
}