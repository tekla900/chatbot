import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] questions = {
                "Which Study Programmes are offered?",
                "What is the Language of Instruction?",
                "What advising and support services are available?",
                "Does BTU provide services if I have a disability?"
        };

        String[] answers = {
                """
                    Business Administration – Management
                    Business Administration – Finances
                    Information Technologies
                    Digital Marketing
                """,
                "The Language of Instruction is Georgian",
                "BTU offers a variety of academic and administrative resources to provide support for any student and staff member",
                "Yes, BTU provides a special service for students with disabilities."
        };

        // chatbot running
        System.out.println("BTU FAQ");
        System.out.println("You can terminate the process by pressing 0");
        System.out.println("Questions you can ask: ");
        for (String i : questions) {
            System.out.println(i);
        }


        System.out.println("Enter your question: ");

        Scanner myObj = new Scanner(System.in);
        String userQuestion = myObj.nextLine();

        while (!userQuestion.equals("0")) {
            //find index of the question
            int index = -1;

            for (int i = 0; i < questions.length; i++) {
                if (questions[i].toLowerCase().equals(userQuestion.toLowerCase())) {
                    index = i;
                    break;
                }
            }
            //find and print the answer for the index
            if (index > -1) {
                System.out.println(answers[index] + "\n");
            } else if (index == -1) {
                System.out.println("Sorry, I don't know the answer to this...");
            }
            userQuestion = myObj.nextLine();
        }
        System.out.println("It was fun talking to you! Bye!");
    }
}