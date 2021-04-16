class Opdracht8 {
    public static void main(String[] args) {
        System.out.println("OPDRACHT 8");

        Kapitein mijnKapitein = new Kapitein();
        Boot mijnBoot = new Boot();
        SpeedBoot mijnSpeedboot = new SpeedBoot();
        
        //mijnKapitein.varen(mijnBoot);
        //mijnKapitein.varen(mijnSpeedboot);
    }
}

class Boot {
    void starten() {
    }
}

class SpeedBoot extends Boot {
    void starten() {
        System.out.println("Ik zet even mijn pet af!");
    }
}

class Kapitein {
    void varen(Boot eenBoot) {
        System.out.println("Ik ga varen...");
        eenBoot.starten();
    }
}