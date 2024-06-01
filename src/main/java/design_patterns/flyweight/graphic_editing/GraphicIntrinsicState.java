package main.java.design_patterns.flyweight.graphic_editing;

import lombok.Getter;

@IntrinsicState
@Getter
public class GraphicIntrinsicState {
    private GraphicType type; // "text" or "image"
    private Image image; // Text content or image file path
    private int width, height; // Dimensions
    private String color;
}
