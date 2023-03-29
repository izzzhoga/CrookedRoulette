Implementation of the crooked roulette. Each of the cells has its own probability.

Methods:

- ```addCell(int number, int data)``` - The overloaded method adds a cell with a certain number and the probability of this cell falling out. If a cell with such a number exists, then the probability of falling out will be redefined for it.
- ```addCell(int data)``` - The overloaded method adds a cell with the number following the last roulette number and with the probability of this cell falling out. If a cell with such a number exists, then the probability of falling out will be redefined for it.
- ```removeCell()``` - Deletes the last roulette cell.
- ```clearRoulette()``` - Clears the roulette from all cells.
- ```printRoulette()``` - Outputs the values of cells and their probabilities to the terminal.
- ```startGame(int inputNumber)``` - Starts a Roulette game, an integer value must be passed to the input method, that is, to bet on the number falling out.
- ```getResult()``` - The method returns an integer value obtained as a result of the roulette operation.
- ```createDiapasones()``` - Sets a list of the sum of the probabilities of each roulette cell falling out.
- ```setEqualProbabilities()``` - Sets an equal value of the probability of falling out for all roulette cells.
