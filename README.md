# TheRandomAPI
TheRandomAPI is an API that is responsible for generating random responses to different queries.

Flip Coin

    /flipCoin

        Respond with a heads or tails.

    @Get
        Does not require parameters.
        return string = "Heads" or "Tails".


Dices

    /dices

        Roll one or more 6-sided dice.
    
    @Get
        Does not require parameters.
        return an integer between 1 and 6.

    @Post
        Require one integer
        returns n integers representative of a 6-sided dice.

RockPaperScissorsAction

    /RockPaperScissors

    @Get
        Does not require parameters.
        returns a string that can be "Rock", "Paper" or "Scissors".

Or

    /or

    @Post
        Requires an array of objects.
        Example:
        [
            {
                "Username" : "RandomUser"
            },
            {
                "Number" : 2
            }
        ]

        Return one of those objects.

Range

    /range

    @Get
        Does not require parameters.
        Returns an integer from 1 to 100
    
    @Post
        Requires an array[2] of Integers.
        Example: 
        [-10000,10000]
        Returns an integer between the two preloaded.