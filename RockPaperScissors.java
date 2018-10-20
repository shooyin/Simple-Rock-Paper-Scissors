import java.util.*;


public class RockPaperScissors
{
   static int playerWins;
   static int computerWins;
   static int result;

	public static void main(String args[])
	{
      try
      {   
       while(playerWins <= 2 && computerWins <=2)
       {
          game();
      
          if(result == playerWins)
          {
             System.out.println("Player has won! GAME OVER");
             break;
          }
          else if (result == computerWins)
          {
             System.out.println("Computer has won! GAME OVER");
             break;
          }
          else
          {
            game();
          }
       }
      }
      catch(IllegalArgumentException e)
      {
         System.out.println("Invalid Choice");
      }  
    }//end of main  

   public static int game()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Scissor(0),Rock(1),Paper(2):");
      Random random    = new Random();
      int computer     = random.nextInt(3);
      int player       = keyboard.nextInt();
   
      if(playerWins < 2 && computerWins < 2)
      {
         if(player == 0 && computer == 0)
         {
            System.out.println("The computer is scissor. You are scissor too. It is a draw.");
            result = 0;
         }  
         else if(player == 0 && computer == 1)
         {
            System.out.println("The computer is scissor. You are rock. You won!");
            result = playerWins + 1;
         }  
         else if(player == 0 && computer == 2)
         {
            System.out.println("The computer is scissor. You are paper. Computer won!");
            result = computerWins + 1;
         }   
         else if(player == 1 && computer == 0)
         {
            System.out.println("The computer is scissor. You are rock. You won!");
            result = playerWins + 1;
         }   
         else if(player == 1 && computer == 1)
         {
            System.out.println("The computer is rock. You are rock too. It is a draw.");
            result = 0;
         }  
         else if(player == 1 && computer == 2)
         {
            System.out.println("The computer is paper. You are rock. Computer won!");
            result = computerWins + 1;
         }   
         else if(player == 2 && computer == 0)
         {
            System.out.println("The computer is scissor. You are paper. Computer won!");
            result = computerWins + 1;
         }   
         else if(player == 2 && computer == 1)
         {
            System.out.println("The computer is rock. You are paper. You won!");
            result = playerWins + 1;
         }   
         else if(player == 2 && computer == 2)
         {
            System.out.println("The computer is paper. You are paper. It is a draw.");
            result = 0;
         }   
        else
         {
            System.out.println("Invalid choice.");
         }
 
      } 
      return result;  
   }
}//end of Lab1