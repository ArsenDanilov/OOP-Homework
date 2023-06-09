package org.example.HW3;

public interface Game {
    void start(Integer sizeOfWord, Integer attempts);
    void stop();
    void win();

    void setAttempts(int i);
    Integer getSizeOfWord();

    Answer inputValue(String value);
    GameStatus getGameStatus();
    Integer getAttempts();


}
