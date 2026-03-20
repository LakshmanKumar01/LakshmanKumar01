package quiz;

import java.util.Scanner;

public class QuestionService {

	Question[] questions = new Question[5];
	String selection[] = new String[5];

	public QuestionService() {
		questions[0] = new Question(1, "What is the size of int in Java?", "2", "4", "8", "depends on system", "4");
		questions[1] = new Question(2, "Which of the following is not a Java data type?", "int", "float", "boolean",
				"real", "real");
		questions[2] = new Question(3, "Which keyword is used to define a class in Java?", "define", "class",
				"structure", "object", "class");
		questions[3] = new Question(4, "What is the default value of a boolean variable in Java?", "true", "false", "0",
				"null", "false");
		questions[4] = new Question(5, "Which method is the entry point of a Java program", "start()", "main()",
				"run()", "init()", "main()");
	}

	public void playQuiz() {
		int i = 0;
		for (Question q : questions) {

			System.out.println("Question no " + q.getId());
			System.out.println(q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());

			// Input from the user
			Scanner sc = new Scanner(System.in);
			selection[i] = sc.nextLine();
			i++;
		}
		for (String s : selection) {
			System.out.println(s);
		}
	}

	public void calculateScore() {
		int score = 0;
		for (int i = 0; i < questions.length; i++) {
			Question que = questions[i];
			String actualAnswer = que.getAnswer();
			String userAnswer = selection[i];
			if (actualAnswer.equals(userAnswer)) {
				score++;
			}
		}
		System.out.println("Your score is: " + score);
	}
}
