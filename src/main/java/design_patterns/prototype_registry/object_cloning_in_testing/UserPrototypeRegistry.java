package main.java.design_patterns.prototype_registry.object_cloning_in_testing;

public interface UserPrototypeRegistry {

    void addPrototype(User user);

    User getPrototype(UserType type);

    User clone(UserType type);
}
