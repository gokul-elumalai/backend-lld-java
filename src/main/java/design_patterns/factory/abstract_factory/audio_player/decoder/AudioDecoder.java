package main.java.design_patterns.factory.abstract_factory.audio_player.decoder;

import main.java.design_patterns.factory.abstract_factory.audio_player.MediaFormat;

public abstract class AudioDecoder {

    private final byte[] audioData;

    public AudioDecoder(byte[] audioData) {
        this.audioData = audioData;
    }

    public byte[] getAudioData() {
        return audioData;
    }

    public abstract MediaFormat supportsFormat();

    public abstract byte[] decode();
}
