class Opdracht3 {
    public static void main(String[] args) {
        System.out.println("OPDRACHT 3");
        int myArray[] = {1, 2, 3, 4, 5};
        int counter = 0;
        for(int i = 0; i < myArray.length; i++){
            counter = counter + (int)myArray[i];
        }
        System.out.println("De som is: "+counter);
    }
}