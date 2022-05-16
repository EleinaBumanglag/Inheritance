public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks");
 
        Wizard Merlin = new Wizard("Merlin");
        Warlock Saruman = new Warlock("Saruman");
        Character c = new Character();
        
        //Damaging the Opposing Character
        Merlin.poisonSpray(Saruman);
        //Both Characters will Damage each other
        Merlin.poisonSpray(Saruman);
        Saruman.bladeOfDisaster(Merlin);
        //Recover that adds HP and MP
        Saruman.healing(Saruman); 
        //Defeated at the end of the sequence
        Saruman.thunderClap(Merlin);
        //Level Up
        
        //Details of each character
        Saruman.details();
        Merlin.details();
        
        
    }
}