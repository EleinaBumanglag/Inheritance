public class Wizard extends Character{
    Wizard(String name){
        super(name);
    }

    //First Damage Spell
    public void poisonSpray(Character enemyCharacter){
        System.out.println("\n"+super.characterName + " attacks " + enemyCharacter.characterName + " with Poison Spray (Damage - 20)");
        int damagePoints = 20;
        damageTarget(enemyCharacter, damagePoints);
    };

    //Second Damage Spell
    public void meteorSwarm(Character enemyCharacter){
        System.out.println("\n"+super.characterName + " attacks " + enemyCharacter.characterName + " with Meteor Swarm (Damage - 80)");
        int damagePoints = 80;
        damageTarget(enemyCharacter, damagePoints);
    };
    //Recover Spell
    public void healing(Character rCharacter){
        System.out.println(super.characterName + " increase with Healing (HP and Mana Points - 50)");
        int recoverPoint = 50;
        recoverCharacter(rCharacter, recoverPoint);
    };

    void details(){
        System.out.println("\n\nWIZARD DETAILS");
        System.out.println("Name: " + super.characterName);
        System.out.println("HP: " + super.healthPoints);
        System.out.println("MP: " + super.manaPoints);
        System.out.println("Level: " + super.level);
    }
}