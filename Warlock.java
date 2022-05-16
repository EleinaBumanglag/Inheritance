public class Warlock extends Character{
    Warlock(String name){
        super(name);
    }

     //First Damage Spell
     public void thunderClap(Character enemyCharacter){
        System.out.println("\n"+ super.characterName + "attacks " + enemyCharacter.characterName + " with Thunderclap (Damage - 30)\n");
        int damagePoints = 30;
        damageTarget(enemyCharacter, damagePoints);
    };
    //Second Damage Spell
    public void bladeOfDisaster(Character enemyCharacter){
        System.out.println("\n" +super.characterName + " attacks " + enemyCharacter.characterName + " with Blade of Disaster (Damage - 90)");
        int damagePoints = 90;
        damageTarget(enemyCharacter, damagePoints);
    };

    //Recover Spell
    public void healing(Character rCharacter){
        System.out.println("\n"+ super.characterName + " increase with Healing (HP and Mana Points - 50)");
        int recoverPoint = 50;
        recoverCharacter(rCharacter, recoverPoint);
    };

    //Details
    void details(){
        System.out.println("\n\nWARLOCK DETAILS");
        System.out.println("Name: " + super.characterName);
        System.out.println("HP: " + super.healthPoints);
        System.out.println("MP: " + super.manaPoints);
        System.out.println("Level: " + super.level);
    }
    
    
}