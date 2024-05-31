package main.java.design_patterns.factory.abstract_factory.audio_player;

import main.java.design_patterns.factory.abstract_factory.audio_player.decoder.AudioDecoder;
import main.java.design_patterns.factory.abstract_factory.audio_player.player.AudioPlayer;
import main.java.design_patterns.factory.abstract_factory.audio_player.processor.AudioProcessor;

public abstract class AudioFactory {
    public abstract MediaFormat supportsFormat();

    public abstract AudioDecoder createAudioDecoder(byte[] audioData);
    public abstract AudioPlayer createAudioPlayer(int volume, double playbackRate);
    public abstract AudioProcessor createAudioProcessor(byte[] audioData);
}
