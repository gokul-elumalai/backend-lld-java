package main.java.design_patterns.facade.img_editing;

import main.java.design_patterns.facade.img_editing.services.*;

public class ImageEditingManager {

    private ImageEditingProcessor imageEditingProcessor;

    public ImageEditingManager(ImageLoader imageLoader,
                               FilterService filterService,
                               ImageModifier imageModifier,
                               ImageWriter imageWriter,
                               AnalyticsService analyticsService) {
        this.imageEditingProcessor = new ImageEditingProcessor(imageLoader, filterService, imageModifier, imageWriter, analyticsService);
    }

    public void editImage(String imagePath, String filterType, int brightness) {
        imageEditingProcessor.process(imagePath, filterType, brightness);
    }

}
