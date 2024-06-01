package main.java.design_patterns.facade.img_editing.services;

import main.java.design_patterns.facade.img_editing.models.Image;

public class ImageLoader {
    public Image loadImage(String imagePath) {
        return new Image();
    }
}
