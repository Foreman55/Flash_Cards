import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is Flashcards. Options: 1. list stacks 2. Create new stack 3. Erase stack 4. open stack");
        ListOfStacks lof = new ListOfStacks();
        while (true){
            String userSelection = scanner.nextLine();
            if(userSelection.equals("1")){
                System.out.println(lof.getFileList());
            }if(userSelection.equals("2")){
                System.out.println("name of Stack");
                String stackName = scanner.nextLine();
                Stack stack = new Stack(stackName);
                while(true){
                    System.out.println("Options: 1. New card 2. Erase card 3. list cards");
                    String userChoiceCard = scanner.nextLine();
                    if (userChoiceCard.equals("1")){
                        System.out.println("card frontside");
                        String frontSide = scanner.nextLine();
                        System.out.println("card backside");
                        String backSide = scanner.nextLine();
                        Card card = new Card(frontSide , backSide);
                        break;
                    } if (userChoiceCard.equals("2")){

                    }if (userChoiceCard.equals("3")){

                    }
                }
            }if(userSelection.equals("3")){

            }if(userSelection.equals("4")){

            }


        }
    }
}

