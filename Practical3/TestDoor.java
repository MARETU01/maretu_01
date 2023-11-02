import java.util.Scanner;

public class TestDoor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DoorWithCodeLock door = new DoorWithCodeLock();
        int option = 0;

        while (option != 5){
            System.out.println("1:Open door\n2:Close door\n3:Lock Door\n4:Unlock Door\n5:Exit");
            option = input.nextInt();

            switch (option){
                case 1:
                    door.openDoor();
                    break;
                case 2:
                    door.closeDoor();
                    break;
                case 3:
                    door.lockDoor();
                    break;
                case 4:
                    door.unlockDoor();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }
}

class Door{
    protected static boolean isOpen = false;

    public static void openDoor(){
        if (isOpen == false){
            System.out.println("Door opened");
            isOpen = true;
        }
        else{
            System.out.println("Door already opened!");
        }
    }

    public static void closeDoor(){
        if (isOpen == false){
            System.out.println("Door already closed!");
        }
        else{
            System.out.println("Door closed");
            isOpen = false;
        }
    }
}

class DoorWithLock extends Door{
    static boolean isLock = false;

    public static void openDoor(){
        if (isOpen == false){
            if (isLock == true){
                System.out.println("“Door is locked and cannot be opened!");
            }
            else{
                System.out.println("Door opened");
                isOpen = true;
            }
        }
        else{
            System.out.println("Door already opened!");
        }
    }

    public static void lockDoor(){
        if (isOpen == true){
            System.out.println("Open door cannot be locked!");
        }
        else{
            if (isLock == true){
                System.out.println("Door already locked!");
            }
            else{
                System.out.println("Door locked");
                isLock = true;
            }
        }
    }

    public static void unlockDoor(){
        if (isLock == false){
            System.out.println("Door is not locked!");
        }
        else{
            System.out.println("Door unlocked");
            isLock = false;
        }
    }
}

class DoorWithCodeLock extends DoorWithLock{
    static int code = 0;
    static Scanner input = new Scanner(System.in);

    public static void lockDoor(){
        if (isOpen == true){
            System.out.println("Open door cannot be locked!");
        }
        else{
            if (isLock == true){
                System.out.println("Door already locked!");
            }
            else{
                System.out.print("Enter code:");
                code = input.nextInt();
                System.out.println("Door locked");
                isLock = true;
            }
        }
    }

    public static void unlockDoor(){
        if (isLock == false){
            System.out.println("Door is not locked!");
        }
        else{
            System.out.print("Enter code:");
            int inputcode = input.nextInt();
            if (inputcode == code){
                System.out.println("Door unlocked");
                isLock = false;
            }
            else{
                System.out.println("Invalid code!");
            }
        }
    }
}