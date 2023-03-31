"# Word-Wars"
"## Word Wars Java Console Game"

This is a simple console-based word game implemented in Java. The objective of the game is for players to take turns entering a word and gaining points based on the length of the word entered. The game also involves keeping track of the letters used in previous words to avoid repetition, and removing vowels from the entered word. Below is a brief guide on how to play the game.

"## How to Play"

Run the program in a Java console.
You will be presented with a Game Menu. Enter "1" to start the game, or any other key to exit.
Enter the name of Player 1 when prompted, followed by the name of Player 2.
The game starts with Player 1 entering a word.
Each word entered by a player must contain only the letters that remain in the alphabet list.
When a player enters a word, the program will prompt both players to confirm if the word is valid. If both players agree, the player scores points based on the length of the word and the next player takes a turn.
If a player enters a word containing a letter that has already been used, or an invalid word, the game prompts players to disagree, and the entered word is discarded.
The game continues until a player enters the word "???".
Once the game ends, the scores are displayed, and the option to play again is presented.
Game Components

"## The game is made up of the following components:"

alphabetList: A string containing all the letters of the alphabet.
vowels: A string containing all the vowels.
enteredWord: A string to hold the word entered by the current player.
playersInput: A string to hold the player's input.
usedLetters: A string to hold all the letters used in previous words.
userInput: A string to hold the user's input.
currentPlayer: A string representing the current player.
playerOneName: A string representing the name of Player 1.
playerTwoName: A string representing the name of Player 2.
playerNumber: An integer representing the current player number.
playerOneScore: An integer representing the score of Player 1.
playerTwoScore: An integer representing the score of Player 2.
playersAgree: A boolean value to indicate if both players agree on a word.
scan: A Scanner object to receive input from the user.

"## How the Game Works"

The GameMenu method displays the game menu and prompts the user to select an option to start or exit the game.
The StartGame method is called when the user selects "1" to start the game. The game continues until a player enters the word "???".
The updateAlphabetList method removes any letter used in the entered word from the alphabet list and adds it to the list of used letters.
The vowelsMethod method removes all vowels from the entered word.
The inputConfigure method prompts players to agree or disagree on the entered word. If they agree, the validateEnteredWord method is called to check if the word contains any used letters. If the word is valid, points are awarded to the current player and the next player takes a turn. Otherwise, the entered word is discarded.
The changeCurrentPlayer method switches between Player 1 and Player 2 after each turn.
The confirmScore method adds points to the current player's score if the entered word is valid.
The DisplayScore method displays the scores and prompts the user
