import java.util.Scanner;

class Opdracht2 {
    public static void main(String[] args) {
        System.out.println("OPDRACHT 2");
        Scanner myScan = new Scanner(System.in);
        System.out.print("Typ hier tekst: ");
        String input = myScan.nextLine();

        int counter = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == 'e'){
                counter += 1;
            }
        }
        myScan.close();
        System.out.println("De e zit "+counter+" keer in deze string.");
    }
}