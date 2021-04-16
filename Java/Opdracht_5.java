class Monteur {
    public int Repareer(Auto jouwAuto){
        boolean autoArray[] = jouwAuto.myArray;
        int prijs = 0;
        for (int i = 0; i < autoArray.length; i++){
            if(autoArray[i] == false){
                autoArray[i] = true;
                prijs += 25;
            }
        }
        return prijs;
    }
}

class Auto {
    boolean motor;
    boolean deur;
    boolean voorruit;
    boolean uitlaat;
    boolean myArray[] = {motor, deur, voorruit, uitlaat};

    public Auto(boolean motorstatus, boolean deurstatus, boolean voorruitstatus, boolean uitlaatstatus){
        // Was de opdracht dat je zelf mocht meegeven of onderdelen kapot waren?
        // Anders hoeft de functie Auto geen argumenten te verwachten en kan hieronder staan
        // 'motor = false; deur = true;' etc.
        motor = motorstatus;
        deur = deurstatus;
        voorruit = voorruitstatus;
        uitlaat = uitlaatstatus;
    }

    public String toString(){
        String onderdelenString = "SAMENVATTING ONDERDELEN: ";
        if (myArray[0] == true){
            onderdelenString = onderdelenString+"\n"+"De motor is niet kapot";
        } else {
            onderdelenString = onderdelenString+"\n"+"De motor is kapot";
        }
        if (myArray[1] == true){
            onderdelenString = onderdelenString+"\n"+"De deur is niet kapot";
        } else {
            onderdelenString = onderdelenString+"\n"+"De deur is kapot";
        }
        if (myArray[2] == true){
            onderdelenString = onderdelenString+"\n"+"De voorruit is niet kapot";
        } else {
            onderdelenString = onderdelenString+"\n"+"De voorruit is kapot";
        }
        if (myArray[3] == true){
            onderdelenString = onderdelenString+"\n"+"De uitlaat is niet kapot";
        } else {
            onderdelenString = onderdelenString+"\n"+"De uitlaat is kapot";
        }
        return onderdelenString;
    }
}

class Opdracht5 {
    public static void main(String[] args) {
        System.out.println("OPDRACHT 5");
        Auto mijnAuto = new Auto(false, false, false, false);
        Monteur mijnMonteur = new Monteur();
        System.out.println(mijnAuto.toString());
        int prijs = mijnMonteur.Repareer(mijnAuto);
        System.out.println(" ");
        System.out.println("Dit kost je: "+prijs+" ek.");
    }
}