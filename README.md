# Assignment 5: Making a Game

## Objectives

Using a game to explore ideas of inheritance, abstract classes,
dynamic dispatch, and final methods.

## Running the Code

To run the code, run `java Game`

To run the demo game, in the demoClasses directory, run `java -cp 
Game.jar Game`

## Design Decisions

We modified the Game to improve it from its original design.  Below, I
defend the design decisions.

### Making GamePiece Abstract
The reason it is better to make GamePiece Abstract is because their are multiple child classes calling on it using the basic methods and parameters. Thus, by having it be abstract it allows it to be a base for the rest of the classes so they can override the base method.

### Calling an Abstract Method
The reason the child classes can call move and it uses the right move method, is because it is overiding the abstract class method. By using @override it cause the child class method to be invoked instead of the abstract class.

### Choices of Final Methods
All the methods that were made final were made this way because there is no need for these accessor methods or draw method to be modified by child classes. Doing so may cause the program to reach an error so by making them final other programmers can not cause in error by trying to override these methods.
### Adding a New Goblin
<ol>
<li>Begin by creating a new class for the new goblin.</li>
<li>Create your steps that will determine the pixels moved per step.</li>
<li>Called the gif you will want to use for the second Goblin.</li>
<li>Next create a move class folowing the abstract gamepieces making sure to overide by adding @override before the method.</li>
<li>Get human movements by doing Human Professor = game.gethuman().</li>
<li>Next using multiple if statements find the x and y postion of the professor in correlation to the second goblin.</li>
<li>The first if statement should look if the Goblin x postion is greater than the professor. If so move the goblin left by 3. However, create under if statement that goes as follows, if the goblin is more than 10 units away instanly teleport the Goblin to the left by five.</li>
<li>The second if statment should look if the Goblin x position is less than the professor. If so move the goblin right by 3. However, create under if statement that goes as follows, if the goblin is more than 10 units away instanly teleport the Goblin to the right by five.</li>
<li>The third if statment should look if the Goblin y position is less than the professor. If so move the goblin up by 3. However, create under if statement that goes as follows, if the goblin is more than 10 units away instanly teleport the Goblin to the up by five.</li>
<li>The fourth if statment should look if the Goblin y position is more than the professor. If so move the goblin down by 3. However, create under if statement that goes as follows,if the goblin is more than 10 units away instanly teleport the Goblin to the down by five.</li>
<li>Finally Override the clone method and use goblin as the clone.</li>
<li>Run the game.</li>
</ol

