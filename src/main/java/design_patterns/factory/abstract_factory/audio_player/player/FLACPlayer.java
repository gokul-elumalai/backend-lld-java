package main.java.design_patterns.factory.abstract_factory.audio_player.player;

import main.java.design_patterns.factory.abstract_factory.audio_player.MediaFormat;

public class FLACPlayer extends AudioPlayer {

    public FLACPlayer(int volume, double playBackRate) {
        super(volume, playBackRate);
    }

    @Override
    public void play() {
        // Simulate playing audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Playing FLAC audio");
    }

    @Override
    public void pause() {
        // Simulate pausing audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Pausing FLAC audio");
    }

    @Override
    public void stop() {
        // Simulate stopping audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Stopping FLAC audio");
    }

    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }
}