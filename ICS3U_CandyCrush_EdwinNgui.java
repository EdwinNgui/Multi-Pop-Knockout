    /* Edwin Ngui
    * ICS3U1
    * Start Date: Tuesday, April 26th, 2022
    * Due Date: Monday, May 3rd, 2022
    * Description: This program consists of two primary sections: 1) a Level Builder (user inputs, computer solves) for an unlimited number of unique symbols and length, 2) A main game (limited version with a greater emphasis on the boxing storyline and interactiveness with the user.
    */
   
    import java.util.*; //Imports most neeeded imports
   
    public class CandyCrushGame {
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in); // Creating a variable to call to access the scanner ability
            Random rand = new Random(); //Creates a variable for the randomized features in this game.
            int random = rand.nextInt(4) + 1; //Options; 1/2/3/4
            
            //All the variables used for the numerous sections
            String next, mainMenu, userString, secretAsk, weightClass, gameString, direction, leavingReport;
            gameString = "";
            boolean invalidInput, exit, victory;
            invalidInput = exit = victory = false;
            int maxRounds, swapLocation, featherWeightWin, lightWeightWin, middleWeightWin, heavyWeightWin;
            maxRounds = swapLocation =1;
            featherWeightWin = lightWeightWin = middleWeightWin = heavyWeightWin = 0;
            
    
            // Introductions with clear instructions
            System.out.print("\n<DING DING DING> Automated Voice: Player approaching... <enter anything to continue> ");
            next = input.nextLine();
            System.out.println("\n<Tyson> Hello friend! My name is Tyson and I'll be your guide to tonight's tournament.\n\tWelcome to...");
            System.out.println("\t\t*********************************************");
            System.out.println("\t\t\t\tMulti-Pop");
            System.out.println("\t\t\t\t\tKnockout 2");
            System.out.println("\n\t\t\t*********************************************");
            System.out.println("<Tyson> Make sure to adjust your console to about half to a quarter of the screen!");
            System.out.print("Note: When you see \"<continue>\", enter anything to continue.\nAnd enter \"exit\" to exit the code when at the menu. <continue> ");
            next = input.nextLine();
    
            // Main Menu - Let's them choose what section of the code they want to interact with
            do {
                next = ""; //Resets next
                mainMenu = "";
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\t\tMenu");
                System.out.println("\t********************");
                System.out.println("➤ (1) Play Game");
                System.out.println("➤ (2) Level Builder");
                System.out.println("➤ (3) Tutorial");
                System.out.println("➤ (4) Career Stats");
                System.out.println("➤ (5) Secret Options\n");
                if (invalidInput) { //If they misinput and must try again, they will be told it
                    System.out.println("Your previous input was invalid.");
                }
                System.out.print("Input Here (Type the corresponding number): ");
                mainMenu = input.nextLine(); // Coded as a string to avoid issues of errors (when string tries to go into int
                if (mainMenu.equals("1")) { // Path 1: Main Game; Computer generated string, they take out the combos
                    invalidInput = false;
                    //Declares difficulty of the game
                      do {
                  		victory = false;
                      	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n<Tyson> So, I hear you're trying to make some moves. What's your weight class (decides difficulty of game)? ");
                  		System.out.println("➤ (1) Featherweight");
                          System.out.println("➤ (2) Lightweight");
                          System.out.println("➤ (3) Middleweight");
                          System.out.println("➤ (4) Heavyweight");
                          System.out.print("Input Here");
                          if (invalidInput) { //If previous input was invalid, tell them
                          	System.out.print(" (Previous input was invalid)");
                          }
                          System.out.print(": ");
                          weightClass = input.nextLine();
                          
                          //If it's not a valid choice, set the "previous" as an invalid response
                          if (weightClass.equalsIgnoreCase("featherweight") == false && weightClass.equals("1") == false && weightClass.equalsIgnoreCase("lightweight") == false && weightClass.equals("2") == false && weightClass.equalsIgnoreCase("middleweight") == false && weightClass.equals("3") == false && weightClass.equalsIgnoreCase("heavyweight") == false && weightClass.equals("4") == false){
                          	invalidInput = true;
                          }
                          
                  		}while (weightClass.equalsIgnoreCase("featherweight") == false && weightClass.equals("1") == false && weightClass.equalsIgnoreCase("lightweight") == false && weightClass.equals("2") == false && weightClass.equalsIgnoreCase("middleweight") == false && weightClass.equals("3") == false && weightClass.equalsIgnoreCase("heavyweight") == false && weightClass.equals("4") == false);
                  		
                  		invalidInput = false;
                  		//Where each game occurs (difficulty), they all use the same code functions, just different strings to work with
                  		//Ans is right next to each game string declaration, T# declares what turn to call what moves
                  		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); //Clears up the console as if it were a new loading screen
                  		if (weightClass.equalsIgnoreCase("featherweight") || weightClass.equals("1")){
                  			System.out.println("\t\tFeatherweight Chosen");
                              System.out.println("\t  *********************************");
                              System.out.print("Goal: Complete knockout in 1 round <continue>");
                              next = input.nextLine();
                              maxRounds = 1;
                              gameString = " ★★♥★♥♥"; //Ans: T1 - 3Right
                              /* AABABB
                               * T1 - AAA BBB
                               */
                  		}else if (weightClass.equalsIgnoreCase("lightweight") || weightClass.equals("2")){
                  			System.out.println("\t\tLightweight Chosen");
                              System.out.println("\t  *********************************");
                              System.out.print("Goal: Complete knockout in 2 rounds <continue>");
                              next = input.nextLine();
                              maxRounds = 2;
                              gameString = " ⚑⚑⚉⚑⚑⚉⚑⚑⚉"; //Ans: T1 - 4Left, T2 - 3Left
                              /* CCDCCDCCD
                               * T1 - CCC DCDCCD
                               * T2 - DDC CC D
                               * DDD
                               */
                  		}else if (weightClass.equalsIgnoreCase("middleweight") || weightClass.equals("3")){
                  			System.out.println("\t\tMiddleweight Chosen");
                              System.out.println("\t  *********************************");
                              System.out.print("Goal: Complete knockout in 3 rounds <continue>");
                              next = input.nextLine();
                              maxRounds = 3;
                              gameString = " ⚉⚑♥♥★★♥♥★⚉⚉⚑⚑"; //Ans: T1 - 9Left, T2 - 8Left, T3 - 1Right
                              /* DCBBAABBADDCC
                               * T1 - DCBBAABABDDCC
                               * T2 - DCBB AAA BBDDCC
                               * DC BBBB DDCC
                               * T3 - C DDD CC
                               */
                  		}else if (weightClass.equalsIgnoreCase("heavyweight") || weightClass.equals("4")){
                  			System.out.println("\t\tHeavyweight Chosen");
                              System.out.println("\t  *********************************");
                              System.out.print("Goal: Complete knockout in 4 rounds <continue>");
                              next = input.nextLine();
                              
                              maxRounds = 4;
                              gameString = " ♥★♥♥⚑⚉⚉⚑⚑★⚉★"; //Ans: T1 - 1Right, T2 - 2Right, T3 - 3Right, T4 - 5Left
                              /* BABBCDDCCADA
                               * T1 - A BBB CDDCCADA
                               * T2 - ADCDCCADA
                               * T3 - ADD CCC ADA
                               * T4 - A DDD AA
                               * AAA
                               */
                  		}
                  		
                  		System.out.println("\n\tYour opponent...");
                  		while (maxRounds != 0) {
                  			System.out.println("\n\t\t " + gameString + " \n");
                      		
                      		//Checks for location to start at
                      		do {
                      			System.out.print("Input your the location you wish to swap (E.g. 3)");
                      			//Checks if it needs to give an invalid comment
                      			if ((int)swapLocation < 0 || (int)swapLocation > gameString.length()) {
                      				System.out.print(" [Previous input invalid]: ");
                      			}else {
                      				System.out.print(": ");
                      			}
                      			swapLocation = input.nextInt();
                      		}while ((int)swapLocation < 0 || (int)swapLocation > gameString.length());
                      		
                      		next = input.nextLine();
                      		
                      		//Checks for direction to swap towards
                      		do {
                      			invalidInput = false;
                      			System.out.println("\nDo you want it to swap left or right? ");
                      			System.out.println("➤ (1) Left");
                                  System.out.println("➤ (2) Right");
                      			System.out.print("Input here: ");
                      			direction = input.nextLine();
                      			//Makes sure it's not going out of bounds
                      			if (direction.equalsIgnoreCase("left") == false && direction.equalsIgnoreCase("right") == false && direction.equalsIgnoreCase("1") == false && direction.equalsIgnoreCase("2")  == false && direction.equalsIgnoreCase("exit")  == false){
                          			System.out.println("Previous input invalid.");
                      			}else if (((direction.equalsIgnoreCase("left") || direction.equalsIgnoreCase("1")) && swapLocation == 1)) {
                      				invalidInput = true;
                      				System.out.println("This number cannot swap in that direction.");
                      			}else if (((direction.equalsIgnoreCase("right") || direction.equalsIgnoreCase("2")) && swapLocation == gameString.length())) {
                      				invalidInput = true;
                      				System.out.println("This number cannot swap in that direction.");
                      			}
                      		}while ((direction.equalsIgnoreCase("left") == false && direction.equalsIgnoreCase("right") == false && direction.equalsIgnoreCase("1") == false && direction.equalsIgnoreCase("2")  == false && direction.equalsIgnoreCase("exit")  == false) || invalidInput);
                      		
                      		//To quickly redetermine the direction
                      		if (direction.equalsIgnoreCase("left") || direction.equalsIgnoreCase("1")){
                      			direction = "l";
                      		}else {
                      			direction = "r";
                      		}
                      		
                      		//Swaps the letters in the intended direction and replaces the string function
                      		if (direction.equals("r")){
                          		gameString = gameString.substring(0, swapLocation) + gameString.charAt(swapLocation + 1) + gameString.charAt(swapLocation)+ gameString.substring(swapLocation + 2);
                      		}else if (direction.equals("l")){
                          		gameString = gameString.substring(0, swapLocation-1) + gameString.charAt(swapLocation) + gameString.charAt(swapLocation-1) + gameString.substring(swapLocation + 1);
                      		}
                      		
                      		if (gameString.length() >= 3) { //If 3 or more, meaning something we can actually check

                              	int anchor = 0; //Start of unique symbol combo
                          		int combo = 1; //Counts the combos
                          		int previous = 0; //Holds the length of the previous
                          		
                          		//Outer loop -> making sure string length is change (if changes -> continue, if does not change 0 > do not continue)
                          		//Inner loop -> taking out the combos
                          		
                          		gameString = gameString + " "; //Buffer to let it end
                          		while (previous != gameString.length() ) { //Checks if previous length is the same as the new one. If it is, nothing got cleared, it's free of combos
                          			previous = gameString.length();
                          			anchor = 0;
                          			combo = 1;
                          			for (int i = 0; i < gameString.length()-1; i++) { //Searches through each section
                          				if (gameString.charAt(i) == gameString.charAt(i+1)) {
                          					combo ++;
                          				} else if (gameString.charAt(i) != gameString.charAt(i+1)) { //If next letter is different
                          					//System.out.println("Found groupings: " + userString.substring(anchor, i + 1)); //Used to check the groupings
                          					if (combo >= 3 ) { //check if a combo exists
                          						gameString = gameString.substring(0, anchor) + gameString.substring(i + 1, gameString.length()); //Removes the stuff
                          					}
                          					anchor = i + 1;
                          					combo = 1;
                          					
                          				}
                          			}
                          			//System.out.println("Updated string: " + userString); //Was used to check the updated string
                          		}
                          		gameString = gameString.trim();
                          		gameString = " " + gameString; //Adds the space needed for the swapping again
                          		maxRounds --; //Round used
                          		
                          		//If they win, the text will replace to a win condition
                          		if (gameString.equalsIgnoreCase(" ")) {
                          			gameString = "CHAMPION";
                          		//Checks what category of win
                          			if (weightClass.equalsIgnoreCase("featherWeight") || weightClass.equalsIgnoreCase("1")) {
                          				featherWeightWin++;
                          			}else if (weightClass.equalsIgnoreCase("lightWeight") || weightClass.equalsIgnoreCase("2")) {
                          				lightWeightWin++;
                          			}else if (weightClass.equalsIgnoreCase("middleWeight") || weightClass.equalsIgnoreCase("3")) {
                          				middleWeightWin++;
                          			}else if (weightClass.equalsIgnoreCase("heavyWeight") || weightClass.equalsIgnoreCase("4")) {
                          				heavyWeightWin++;
                          			}
                          		}
                      		}	
                          		//If they won
                          		if (gameString.equalsIgnoreCase("CHAMPION")) {

                              		System.out.println("\n\t\t*** " + gameString + " ***");
                              		random = rand.nextInt(4) + 1; //Options; 1/2/3/4
                              		if (random == 1) {
                              			System.out.print("\n<Tyson> LET'S GO! Another win, another day. Looking forward to seeing another spectacular match of yours! <continue>");
                              		}else if (random == 2) {
                              			System.out.println("\n<Tyson> AMAZING WORK OUT THERE! Keep this up and you'll be famous worldwide. <continue>");
                              		}else if (random == 3) {
                              			System.out.println("\n<Tyson> NEVER SEEN ANYONE AS GOOD YOU! Those moves were crazy. <continue>");
                              		}else if (random == 4) {
                              			System.out.println("\n<Tyson> WHOAA!!! SO SMART ON THAT MOVE AND WOWW! Spectacular performance. <continue>");
                              		}
                          			next = input.nextLine();
                          			
                          		}else if (maxRounds == 0) {
                          			System.out.println("\nThe string ended as: " + gameString);
                          			random = rand.nextInt(4) + 1; //Options; 1/2/3/4
                          			if (random == 1) {
                              			System.out.print("\n<Tyson> Looks like we didn't take the win in tonight's tournament. Keep your head up high champ. <continue> ");
                              		}else if (random == 2) {
                              			System.out.println("\n<Tyson> You know what, that match didn't count in my eyes. <continue>");
                              		}else if (random == 3) {
                              			System.out.println("\n<Tyson> I'll pretend I didn't see that match. <continue>");
                              		}else if (random == 4) { //It's definitely mean. Could've been more positive haha
                              			System.out.println("\n<Tyson> This isn't meant to be mean, but maybe we should take it a weightclass lower next time. Yeah? <continue>");
                              		}
                          			next = input.nextLine();
                          		} 		
                  		}
                } else if (mainMenu.equals("2")) { // Path 2: Level Builder - They input a string, we take out the combos
                    invalidInput = false;
                    
                    do { //Takes a valid string input of at least 1 character (that solves itself)
                    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nEnter your string of characters and we'll eliminate identical consecutive characters of 3 or more (enter \"tutorial\" for a tutorial): ");
                    userString = input.nextLine();
                    
                    if (userString.equals("")) { //If nothing, it will tell them to try again
                        System.out.println("Invalid input, please try again");
                    }else if(userString.equalsIgnoreCase("tutorial")){ //Tutorial for level builder
                        System.out.println("\n\n\n\n\n\nFor this, give the computer a string and it will eliminate the identical consecutive symbols.");
                        System.out.println("*************************");
                        System.out.println("Enter your string of characters: CAABBBBAD");
                        System.out.println("Output: CD <continue>");
                        next = input.nextLine();
                    }
                    }while (userString.equals("") || userString.equalsIgnoreCase("tutorial"));
                    
                    if (userString.length() >= 3) { //If 3 or more, meaning something we can actually check

                    	int anchor = 0; //Start of unique symbol combo
                		int combo = 1; //Counts the combos
                		int previous = 0; //Holds the length of the previous
                		
                		//Outer loop -> making sure string length is change (if changes -> continue, if does not change 0 > do not continue)
                		//Inner loop -> taking out the combos
                		
                		userString = userString + " "; //Buffer to let it end
                		
                		while (previous != userString.length() ) { //Checks if previous length is the same as the new one. If it is, nothing got cleared, it's free of combos
                			previous = userString.length();
                			anchor = 0;
                			combo = 1;
                			
                			for (int i = 0; i < userString.length()-1; i++) { //Searches through each section
                				if (userString.charAt(i) == userString.charAt(i+1)) {
                					combo ++;
                				} else if (userString.charAt(i) != userString.charAt(i+1)) { //If next letter is different
                					//System.out.println("Found groupings: " + userString.substring(anchor, i + 1)); //Used to check the groupings
                					if (combo >= 3 ) { //check if a combo exists
                						userString = userString.substring(0, anchor) + userString.substring(i + 1, userString.length()); //Removes the stuff
                					}
                					anchor = i + 1;
                					combo = 1;
                					
                				}
                			}
                			//System.out.println("Updated string: " + userString); //Was used to check the updated string
                		}
                		
                		userString = userString.trim();
                		if (userString.equalsIgnoreCase("")) {
                			System.out.print("\n<Tyson> Looks like everything in your string got popped. Must've been quite the pops. A pretty good run if I say so myself. <continue>");
                		}else {
                			System.out.println("\nAfter clearing, your string is now: " + userString);
                			System.out.print("<Tyson> Well, it went pretty well. We got to search right through all of it and glad to say it works and is free of consecutive identical symbols. <continue>");
                		}
                        next = input.nextLine();
                    }else { //Cases of 1 or 2 characters, computer does no work
                        System.out.println("\n<Tyson> Your message is too short to work with, but we can assure you the areas with three or more identical consecutive characters are gone... ");
                        System.out.println("<Tyson> ★Ta-da★ <continue> ");
                        System.out.println("\t\t\t\t\t********************");
                        System.out.println("\t\t\t\t\t\t" + userString);
                        System.out.print("\t\t\t\t\t********************");
                        next = input.nextLine();
                        
                    }
                    
                } else if (mainMenu.equals("3")) { // Path 3: Tutorial
                    invalidInput = false;
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t      Tutorial");
                    System.out.println("\t\t\t\t\t\t\t********************");
                    System.out.print("This game was heavily influenced and inspired by Candy Crush Saga by the developer and publisher, King.\nAs such, this game's concept follows similarly.");
                    System.out.print(" All you, the player has to do is\ncontrol the pieces to match identical characters consecutively to a repetition of 3 or more. <continue> ");
                    next = input.nextLine();
                    System.out.println("\nIn the main game (<Play Game>), you will be given a string and will have to move pieces around in order to match them. ");
                    System.out.println("For example...");
                    System.out.println("\t********************");
                    System.out.println("BAABBCB");
                    System.out.print("1234567 (Example of location) <continue>");
                    next = input.nextLine();
                    System.out.println("\n\t********************");
                    System.out.print("Choose your location to swap: 7       (the 7th symbol, read as normal/non-programming) <continue>");
                    next = input.nextLine();
                    System.out.print("\nLeft or Right: Left <continue>");
                    next = input.nextLine();
                    System.out.println("\nIt swaps symbols at the 6th and 7th spot: BAABBBC");
                    System.out.println("\t\t\t\t\t     ---"); //Lines up wit the triple B, and shows to the user clearly what the boundaries are (on full screen)
                    System.out.println("Then pops the identical consecutive letters.");
                    System.out.print("The new string becomes: BAAC <continue>");
                    next = input.nextLine();
                    System.out.println("\nRemember combos can exist!");
                    System.out.println("Like...");
                    System.out.println("BAABBBAB -> BAAAB -> BB\t<continue to return to menu>");
                    next = input.nextLine();
                    
                } else if (mainMenu.equals("5")) { // Path 5: Secret Options; returns back to code
                    invalidInput = false;
                    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nThis is a secret...shoo! <continue> ");
                    next = input.nextLine();
                    do { //Asks if they want the secret function
                    	invalidInput = false;
                    	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n<Tyson> Oh wait, it's you, did you actually want to know the secret?");
                        System.out.println("➤ (1) Yes");
                        System.out.println("➤ (2) No");
                        System.out.print("Input Here: ");
                        secretAsk = input.nextLine();
                        if (secretAsk.equalsIgnoreCase("yes") || secretAsk.equals("1")) { //If program should tell user secret or not
                        	System.out.println("\n<____ Tyson> The creator named me after a famous boxer... the name is...");
                        	System.out.print("<Mike Tyson> Mike Tyson. <continue>");
                        	next = input.nextLine();
                        }else if (secretAsk.equalsIgnoreCase("no") || secretAsk.equals("2")) {
                        	System.out.println("<Tyson> Suit yourself champ. <continue>");
                        	next = input.nextLine();
                        }else {
                        	invalidInput = true;
                        	System.out.println("Invalid input, please try again.\n");
                        }
                    }while ((secretAsk.equalsIgnoreCase("yes") == false && secretAsk.equals("1") == false && secretAsk.equalsIgnoreCase("no") == false && secretAsk.equals("2") == false && secretAsk.equalsIgnoreCase("exit")) || invalidInput); //Checks whether or not to stay in the loop
          
                } else if (mainMenu.equalsIgnoreCase("exit")) { // Path 5: Exit case
                    invalidInput = false;
                    exit = true;
                    
                    // Note to self: code this later
                }else if (mainMenu.equalsIgnoreCase("4")) { //Path 6: Career Stats
                	System.out.println("\n\n\n\n\n\n\n\n\n\n\t\t     Contender");
                	System.out.println("\t*********************************");
                	System.out.println("Featherweight Wins: " + featherWeightWin);
                	System.out.println("Lightweight Wins: " + lightWeightWin);
                	System.out.println("Middleweight Wins: " + middleWeightWin);
                	System.out.println("Heavyweight Wins: " + heavyWeightWin);
                	random = rand.nextInt(4) + 1; //Options; 1/2/3/4
                	//Randomized comments
                	if (random == 1) {
                		System.out.print("\n<Tyson> Always strive for more! <continue>");
                	}else if (random == 2) {
                		System.out.print("\n<Tyson> When an opprutunity presents itself, go for it! <continue>");
                	}else if (random == 3) {
                		System.out.print("\n<Tyson> One more try and you'll reach for another star. <continue>");
                	}else if (random == 4) {
                		System.out.print("\n<Tyson> You're better than that. Let's go for more practice some day. <continue>");
                	}
                	
                	next = input.nextLine();
                	
                } else if (mainMenu.equals("1") == false && mainMenu.equals("2") == false && mainMenu.equals("3") == false && mainMenu.equals("4") == false && mainMenu.equals("5") == false && mainMenu.equals("exit") == false){ // Invalid input (skips if user is coming back from secret options)
                    invalidInput = true;
                }
            } while (exit == false);
            
            System.out.println("\n\n\n\n\n\n\n\n<Tyson> You're leaving? It's been a great time with you...");
            invalidInput = false;
            do { //Ensures a valid input
            
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n<Tyson> Wait. Do you want your career stats first?");
            System.out.println("➤ (1) Yes");
            System.out.println("➤ (2) No");
            if (invalidInput) { //If previous input was invalid, tell them
            	System.out.println("Previous input was invalid.");
            }
            System.out.print("Input Here: ");
            leavingReport = input.nextLine();
            //To show report before leaving or not
            if (leavingReport.equalsIgnoreCase("yes") || leavingReport.equalsIgnoreCase("1")) {
            	System.out.println("\n<Tyson> Let me grab it. <continue>");
            	next = input.nextLine();
            	
            	System.out.println("\n\n\n\n\n\n\n\n\n\n\t\tContender");
            	System.out.println("\t*********************************");
            	System.out.println("Featherweight Wins: " + featherWeightWin);
            	System.out.println("Lightweight Wins: " + lightWeightWin);
            	System.out.println("Middleweight Wins: " + middleWeightWin);
            	System.out.println("Heavyweight Wins: " + heavyWeightWin);
            	random = rand.nextInt(4) + 1; //Options; 1/2/3/4
            	//Randomized comments
            	if (random == 1) {
            		System.out.print("\n<Tyson> Always strive for more! <continue>");
            	}else if (random == 2) {
            		System.out.print("\n<Tyson> When an opprutunity presents itself, go for it! <continue>");
            	}else if (random == 3) {
            		System.out.print("\n<Tyson> One more try and you'll reach for another star. <continue>");
            	}else if (random == 4) {
            		System.out.print("\n<Tyson> You're better than that. Let's go for more practice some day. <continue>");
            	}
            	next = input.nextLine();
            	
            }else if (leavingReport.equalsIgnoreCase("no") || leavingReport.equalsIgnoreCase("2")) {
            	System.out.println("\n<Tyson> That's fine.");
            }else {
            	invalidInput = true;
            }
            
            }while (leavingReport.equalsIgnoreCase("yes") == false && leavingReport.equalsIgnoreCase("1") == false && leavingReport.equalsIgnoreCase("no") == false && leavingReport.equalsIgnoreCase("2") == false);
           
            //Randomized ending message
            random = rand.nextInt(4) + 1; //Options; 1/2/3/4
        	if (random == 1) {
                System.out.println("<Tyson> Have a great day friend!");
        	}else if (random == 2) {
        		System.out.print("<Tyson> I hope to see you in the ring again some day.");
        	}else if (random == 3) {
        		System.out.print("<Tyson> See you again soon!");
        	}else if (random == 4) {
        		System.out.print("<Tyson> Great work today! Take a break, you deserve it.");
        	}
    
        }
    
    }
    