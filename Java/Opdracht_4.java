class Opdracht4 {
    public static void main(String[] args) {
        System.out.println("OPDRACHT 4");
        int myArray[] = {4, 2, 13, 79, 122, 9, 8, 24, 90, 54};
        System.out.println("Array in volgorde van generering: ");
        for (int i = 0; i < myArray.length; i++){
            System.out.println((int)myArray[i]);
        }

        System.out.println("Array in gesorteerde volgorde: ");
        int temp;
        boolean klaar = false;
        while (klaar == false){
            klaar = true;
            for (int j = 0; j < myArray.length-1; j++){
                if (myArray[j] > myArray[j+1]){
                    temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                    klaar = false;
                }
            }
        }
        for (int j = 0; j < myArray.length; j++){
            System.out.println((int)myArray[j]);
        }
    }
}