package main.java.design_patterns.flyweight.chess_user_optimization;

import lombok.Getter;

@IntrinsicState
@Getter
public class UserIntrinsicState {
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;
    private Byte[] photo;
}
