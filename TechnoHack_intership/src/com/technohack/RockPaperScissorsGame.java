package com.technohack;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors Game!");

        while (true) {
            System.out.print("Enter your move (rock, paper, scissors) or 'exit' to end: ");
            String userMove = scanner.nextLine().toLowerCase();

            if (userMove.equals("exit")) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            }

            if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
                System.out.println("Invalid move. Please enter rock, paper, or scissors.");
                continue;
            }

            String computerMove = generateComputerMove();
            System.out.println("Computer's move: " + computerMove);

            String result = determineWinner(userMove, computerMove);
            System.out.println(result);
        }

        scanner.close();
    }

    private static String generateComputerMove() {
        String[] moves = {"rock", "paper", "scissors"};
        return moves[new Random().nextInt(moves.length)];
    }

    private static String determineWinner(String userMove, String computerMove) {
        if (userMove.equals(computerMove)) {
            return "It's a tie!";
        } else if ((userMove.equals("rock") && computerMove.equals("scissors")) ||
                   (userMove.equals("paper") && computerMove.equals("rock")) ||
                   (userMove.equals("scissors") && computerMove.equals("paper"))) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}
