package main.java.design_patterns.factory.abstract_factory.audio_player.processor;

import main.java.design_patterns.factory.abstract_factory.audio_player.MediaFormat;

public abstract class AudioProcessor {

    private final byte[] audioData;

    public AudioProcessor(byte[] audioData) {
        this.audioData = audioData;
    }

    public byte[] getAudioData() {
        return audioData;
    }

    public abstract MediaFormat supportsFormat();

    public abstract byte[] process();
}
