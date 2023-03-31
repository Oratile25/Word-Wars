
package question2;

import java.util.Scanner;


 //@author 19002756
 
public class Question2
{

   //Declarations
   private static String alphabetList = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
   private static String vowels = "aeiou";
   private static String enteredWord = "";
   private static String playersInput= " ";
   private static String usedLetters = " ";
   private static String userInput;
   private static String currentPlayer, playerOneName,  playerTwoName;
   private static int playerNumber;
   private static int playerOneScore = 0,playerTwoScore = 0;
   private static boolean playersAgree=true;
  
   //Scanner object. 
   public static Scanner scan = new Scanner(System.in);
   
    public static void main(String[] args)
    {
      //Initializing the player number to one.
      playerNumber = 1;
      //Calling of method to start the application.
      GameMenu();
    }

    private static void GameMenu()
    {
        System.out.print("Welcome to the Word WAR Game"+
                         "\nPress (1) to Start The game"+
                         "\nPress any other key to exit the game"+
                         "\nEnter your selection: ");
        
        //if statement to check whether the user wants to play the game or not
        if(new Scanner(System.in).next().equals("1"))
        {
           //Getting player 1 name
           System.out.print("***************************"+
                          "\nEnter Player 1 Name : ");
                            playerOneName = scan.next();
           //Getting player 2 name                 
           System.out.print("\nEnter Player 2 Name : ");
                         playerTwoName=scan.next();
           System.out.print("\n LETS PLAY WORD WARS!!!");
           StartGame();              
        }
        else
        {
            System.exit(0);
        }
    }

    private static void StartGame()
    {
        
        while(!enteredWord.equals("???"))
        {
           changeCurrentPlayer();
         System.out.print("\nAlphabet Letters Left : "+updateAlphabetList()+"\n");
                     System.out.print(currentPlayer+" Enter Your Word : ");
                     enteredWord=scan.next();
           
          
           //Calling a method to validate played word.
           inputConfigure();
          
        }
        confirmScore();
        DisplayScore();  
    }

    private static String updateAlphabetList()
    {
        
        if(playersAgree == true)
        {
            for(int a = 0;a<alphabetList.toCharArray().length;a++)
            {
                if(enteredWord.contains((alphabetList.toCharArray()[a]+"")))
                {
                    usedLetters += (alphabetList.toCharArray()[a]+"");
                    alphabetList = alphabetList.replace((alphabetList.toCharArray()[a]+""), " ");
                }
            }
        }
        else
        {
            System.out.print("THE PLAYED WORD CONTAINS A USED LETTER OR IT IS INVALID");
            playersAgree=true;
            
        }
    
        
        return alphabetList;
    }

    //Method to keep the vowels in the alphabet list 
    private static void vowelsMethod()
    {
        
        for(int i =0;i<enteredWord.toCharArray().length;i++)
        {
           if(vowels.contains((enteredWord.toCharArray()[i])+""))
           {
               enteredWord=enteredWord.replace((enteredWord.toCharArray()[i]+""),"");
           }
           
        }
        
    }

    //Method to check and confirm that both players agree on the word entered by the current player.
    private static void inputConfigure()
    {
        
        System.out.print("\n Enter (y) if both players agree on the word or Enter any key if they disagree : ");
        
        
        if(new Scanner(System.in).next().equalsIgnoreCase("y"))
        {
            
            validateEnteredWord();
            //Calling a method to trim vowels.
            vowelsMethod();
            confirmScore();
        }
        else
        {
            enteredWord="";
        }
       
    }

    //Method to switch between the first player and the second player.
    private static void changeCurrentPlayer()
    {
        
        if(playerNumber==1)
        {
            currentPlayer=playerOneName;
            playerNumber+=1;
        }
        else
        {
          currentPlayer=playerTwoName;
          playerNumber-=1;  
        }
        
    }

    //Method to display the score of both players in the game.
    private static void DisplayScore()
    {
        if(playerOneScore>playerTwoScore)
        {
            System.out.println("\nWINNER OF THE GAME IS : "+playerOneName+" with a score of: "+playerOneScore+
                               "\nYOUR NAME HAS BEEN SAVED TO THE HALL OF FAME!!!"); 
        }
        else if(playerTwoScore>playerOneScore)
        {
            System.out.println("\nWINNER OF THE GAME IS : "+playerTwoName+" with a score of: "+playerTwoScore+
                               "\nYOUR NAME HAS BEEN SAVED TO THE HALL OF FAME!!!");
        }
        else
        {
                System.out.println("THE GAME HAS ENDED WITH A TIE"+"\n"+playerOneName+" Score : "+playerOneScore+
                                   "\n"+playerTwoName+" Score : "+playerTwoScore);
        }
        System.out.println("THE GAME IS NOW OVER. THANK YOU FOR PLAYING WORD WARS!!!");
         
         //Checking whether the user wants to play the game again.
         System.out.println("Enter (1) if you would like to play again");
         if(new Scanner(System.in).next().equals("1"))
         {
             GameMenu();
         }
         else
         {
             System.exit(0);
         }
         
    }

    //Method to check the word entered is valid or not.
    private static void validateEnteredWord()
    {
         //looping through used lettes
         for(int i=0;i<usedLetters.toCharArray().length;i++)
         {
             if(enteredWord.contains(usedLetters.toCharArray()[i]+""))
             {
                playersAgree=false;
             }  
         } 
        
    }

    //Method to confirm the score accumulated by players
    private static void confirmScore() {
        
        if(currentPlayer.equals(playerOneName)&& !enteredWord.equals("???"))
        {
        playerOneScore+=1;
        }
        if(currentPlayer.equals(playerTwoName)&& !enteredWord.equals("???"))
        {
        playerTwoScore+=1;
        }
        
    }
    
    //
    private static void usedLetterSearch()
    {
       
        for(int i = 0;i<usedLetters.toCharArray().length;i++)
        {
            if(enteredWord.contains((usedLetters.toCharArray()[i]+"")))
            {
                playersAgree = false;
            }
        }
    
    }
    
}
