import java.util.Scanner;

class Character {
    String name, gender, characterClass;
    int hp, mp, agility;

    public void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Class: " + characterClass);
        System.out.println("HP: " + hp);
        System.out.println("MP: " + mp);
        System.out.println("Agility: " + agility);
    }
}

class Warrior extends Character {
    Warrior() {
        this.characterClass = "Warrior";
        this.hp = 125;
        this.mp = 40;
        this.agility = 30;
    }
}

class Mage extends Character {
    Mage() {
        this.characterClass = "Mage";
        this.hp = 85;
        this.mp = 70;
        this.agility = 25;
    }
}

class Thief extends Character {
    Thief() {
        this.characterClass = "Thief";
        this.hp = 90;
        this.mp = 50;
        this.agility = 35;
    }
}

class Tank extends Character {
    Tank() {
        this.characterClass = "Tank";
        this.hp = 150;
        this.mp = 30;
        this.agility = 20;
    }
}

public class CharacterCreation {
    public static void Creation() {
        Scanner myObj = new Scanner(System.in);
        Character charOne = null;

        System.out.println("Character Customization");
        System.out.println("\nClasses:");
        System.out.println("1) Warrior\n2) Mage\n3) Thief\n4) Tank");
        System.out.print("Choose character class (1-4): ");
        int class_choice = myObj.nextInt();

        switch(class_choice) {
            case 1:
                charOne = new Warrior();
                break;
            case 2:
                charOne = new Mage();
                break;
            case 3:
                charOne = new Thief();
                break;
            case 4:
                charOne = new Tank();       
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        
        System.out.print("Enter character name: ");
        charOne.name = myObj.next();

        System.out.print("Enter character gender: ");
        charOne.gender = myObj.next();

        System.out.println();
        charOne.displayStats();
    }

    public static void Settings() {
        System.out.println("Everything is in default.");
        System.out.println();
    }

    public static void Menu() {
        Scanner myObj = new Scanner(System.in);
        int choice;

        do {
                System.out.println("Character Customization");
                System.out.println("1) Start Creation\n2) Settings\n3) Exit");
                System.out.print("\nEnter option (1-3): ");
                choice = myObj.nextInt();

                switch (choice) {
                    case 1:
                        Creation();
                        System.out.print("\nPress ENTER to continue.");
                        myObj.nextLine();
                        myObj.nextLine();
                        break;
                    case 2:
                        Settings();
                        System.out.print("\nPress ENTER to continue.");
                        myObj.nextLine();
                        myObj.nextLine();
                        break;
                    case 3:
                        System.out.println("\n\nExiting Program...");
                        break;
                    default:
                        System.out.println("Invalid choice. \n\nExiting Program...");
                }
            } while (choice != 3);
    }

    public static void main(String[] args) {
        Menu();
    }
}