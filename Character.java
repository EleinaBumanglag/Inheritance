public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    Character(String name) {
        characterName = name;
    }

    Character(){}
    //Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
    Character(String name, int charLevel, int charHealthPoints, int charManaPoints){
        characterName = name;
        level = charLevel;
        healthPoints = charHealthPoints;
        manaPoints = charManaPoints;
    }

    //Create a Method that displays the Name of the Character 
    public void characterName()
    { 
        System.out.println("Character Initialized : Merlin");
        System.out.println("Character Initialized : Saruman");
    }

    // Create a method to Damage Target Character
    public void damageTarget(Character enemyCharacter,int damagePoints) {
        
        //Deduct health points from enemy character    
        enemyCharacter.healthPoints -= damagePoints;
        enemyCharacter.manaPoints -= damagePoints;
        System.out.println(enemyCharacter.characterName + " HP Left = " + enemyCharacter.healthPoints);

        //Prompt Character is defeated if HP falls below 0
        if(enemyCharacter.healthPoints <=  0)
        {
            System.out.println("Character "+enemyCharacter.characterName + " defeated.");
        }
}
    //Recover Points
    void recoverCharacter(Character rCharacter,int recoverPoint) {     
        rCharacter.healthPoints += recoverPoint;
        rCharacter.manaPoints += recoverPoint;
        System.out.println("Character updated HP = " + rCharacter.healthPoints);
        System.out.println("Character updated MP = " + rCharacter.manaPoints);
    }  

    int levelUp(int hp1, int hp2)
    {
        level = 10;
        return level;
    }

}