import java.util.Scanner;

class fizzbuzz {
    public static void main(String arg[]){

        int userInput = getNumber();

            for(int I = 1; I <= userInput; I++){
                if((I % 3 == 0) && (I % 5 == 0)){
                    System.out.println("fizzbuzz");
                } else if(I % 3 == 0){
                    System.out.println("fizz");
                } else if(I % 5 == 0){
                    System.out.println("buzz");
                } else {
                    System.out.println(I);
                }
            }

    }

    public static int getNumber() {

		Scanner input = new Scanner(System.in);

		System.out.print("Mata in ett tal: ");
		int number = input.nextInt();
		
		input.close();

		return number;
	}

}