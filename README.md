# Magical Arena Game
	Magical Arena is a fast-paced two-player game. 
    Each turn, players roll a die, with one attacking and the other defending. 
    The attacker deals damage based on their attack value and die roll, while the defender blocks using their defense strength and roll. 
    Players switch roles each round, battling to defeat their opponent!

## Requirements
	- Java Development Kit (JDK)
	- IDE Intellij/Eclipse
	- JUnit 4

## Features

	- Players input their character’s name, health, attack, and defense stats.
    - The player with the lower initial power starts as the attacker.
    - Damage is determined by rolling dice for both attack and defense.
    - The game continues until one player's health drops to zero, declaring the other as the winner.

## Project Structure
	- src/com/game/magicalarena/main/client (Main.java and MagicalArena): Entry point of the game present in this class Main.java
    - src/com/game/magicalarena/main/constants (ApplicationConstant.java) : Here all the constant used in the App stored	
    - src/com/game/magicalarena/main/exceptions : Custom exceptions    
    - src/com/game/magicalarena/main/helpers : Helping classes and methods 
	- src/com/game/magicalarena/main/model : Models
    - src/com/game/magicalarena/test : Contains the test source code files 

## How to Build and Run
	=> To import the project into Eclipse:
		1. Open Intellij IDE.
		2. Select "File" -> "Import" -> "Existing Maven Projects".
		3. Browse to the project directory and select it.
		4. Click "Finish".

## How to Run
	To run the game, follow these steps:
		-Run the 'Main.java'(src/com/game/magicalarena/main/client) file as a Java application to start the game.
		-Right click on Main.java class => Run Main.main()

## How to Play
	1. At the start of the game, players are prompted to input values for name, health, strength, and attack in a single line, separated by spaces.
	2. After accepting the values for two players game start.
    3. Player with the lower power is in attacking mode initially.
	4. Players roll a 6-sided die for both attack and defense.
    5. Damage is calculated using the dice rolls along with each player's attributes.
    6. The game ends when a player's health drops to zero.

## Unit Tests
	JUnit 4.13.1 is used to run unit tests, ensuring the code functions correctly and meets all requirements.

## Steps to take Unit Testing:
	Right click on Testing class Name => Run MagicalArenaTest