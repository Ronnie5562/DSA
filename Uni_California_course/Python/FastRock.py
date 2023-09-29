def fastrock(tupl):
    if tupl[0] % 2 == 0 and tupl[1] % 2 == 0:
        return False
    else:
        return True

Game = (1, 2)
Player1Wins = fastrock(Game)

print("Player 1 Wins" if Player1Wins else "Player 2 Wins")