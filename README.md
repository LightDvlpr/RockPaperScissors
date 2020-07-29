# RockPaperScissors
Play Rock, Paper, Scissors with your computer.


# Code Structure


This project is built with a Player Interface, in case you'd like to expand it to add more players. 

The general structure is a Computer player and a Human player.

MoveLogic is an enum class that defines the status of the Rock, Paper and Scissor objects. 

Userview handles communication with the player. 

Game runs the project and works with UserView to decide the round winner and game winner. 
As well as reset all variables for a new game. 

Once the game is over the User is able to decide to play another game or end the current game. 


# How to Run 

This is how you can set up a clean-room environment using Docker from your terminal:

`brew cask install docker`

It is not imperative that you install Docker. 

The only requirement is that you use Java 12.

```
# From your teminal
docker run --rm -it openjdk:12 bash

#From within the container
curl -LO https://github.com/LightDvlpr/RockPaperScissors/archive/master.tar.gz
tar xf master.tar.gz

cd RockPaperScissors-master/src/

# these two lines will run the program
javac Main.java
java Main
```
