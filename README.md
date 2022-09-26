# Tennis Kata

A Zoom coding TDD coding exercise based on the [Tennis Kata](https://codingdojo.org/kata/Tennis/).
I will be using a Git commit style of:
* RED after adding tests for new function
* GREEN after changing code to pass those (and all previous) tests
* BLUE if successfully refactor the GREEN code without breaking the tests.
  * I mark it as BLUE rather than REFACTOR as 
    * there is limited space for commit titles
    * the three stage process used a blue color for the refactor stage

To see the wood for the trees:
* [The Brief](#the-brief)
* [The Plan](#the-plan)
* [The Result](#the-result)

## The Brief
This Kata is about implementing a simple tennis game. 
I came up with it while thinking about Wii tennis, 
where they have simplified tennis, so each set is one game.

### The scoring system is rather simple:

* Each player can have either of these points in one game “love” “15” “30” “40”
* If you have 40 and you win the point you win the game, however there are special rules.
* If both have 40 the players are “deuce”.
* If the game is in deuce, the winner of a point will have advantage
* If the player with advantage wins the ball he wins the game
* If the player without advantage wins they are back at deuce.

Alternate description of the rules per Wikipedia (http://en.wikipedia.org/wiki/Tennis#Scoring ):

A game is won by the first player to have won at least four points in total and at least two points more than the opponent.
The running score of each game is described in a manner peculiar to tennis: 
scores from zero to three points are described as “love”, “15”, “30”, and “40” respectively.
If at least three points have been scored by each player, and the scores are equal, the score is “deuce”.
If at least three points have been scored by each side and a player has one more point than his opponent, 
the score of the game is “advantage” for the player in the lead.

### Example solutions

Example solution in Java from Trondheim Coding Dojo
Example solution in Java from lcristianiim
Example solution in .NET
Example solution in .NET with state transition tree
Simple one file example in C# .NET Core

## The Plan
Before I start I only know that it is called Tennis,
so I will rename the Main class as Tennis
and create a simple failing and then fixed test
to seed the TDD process and check all is working with Git, etc.

* Tennis will hold the state of the game
* score(String name) return the score - assume name won the point

## The Result
