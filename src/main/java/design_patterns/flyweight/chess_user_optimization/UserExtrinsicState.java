package main.java.design_patterns.flyweight.chess_user_optimization;

import lombok.Getter;

@ExtrinsicState
@Getter
public class UserExtrinsicState {
    private Colour colour;
    private int currentGameStreak;
    private UserIntrinsicState user;
}
