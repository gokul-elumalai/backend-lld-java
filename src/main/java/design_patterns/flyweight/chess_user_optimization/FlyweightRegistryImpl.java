package main.java.design_patterns.flyweight.chess_user_optimization;

import java.util.HashMap;
import java.util.Map;

public class FlyweightRegistryImpl implements FlyweightRegistry {

    private Map<String, UserIntrinsicState> registry = new HashMap<>();

    @Override
    public void addFlyweight(UserIntrinsicState flyweight) {
        registry.put(flyweight.getEmail(), flyweight);
    }

    @Override
    public UserIntrinsicState getFlyweight(String email) {
        return registry.get(email);
    }
}
