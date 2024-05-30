package main.java.design_patterns.factory.simple_factory.audio_player;


public abstract class AudioPlayer {

    public int volume;
    public double playBackRate;

    public abstract void play();
    public abstract void stop();
    public abstract void pause();

    public abstract MediaFormat supportsType();
}
