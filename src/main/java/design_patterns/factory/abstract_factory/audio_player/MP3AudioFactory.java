package main.java.design_patterns.factory.abstract_factory.audio_player;

import main.java.design_patterns.factory.abstract_factory.audio_player.decoder.AudioDecoder;
import main.java.design_patterns.factory.abstract_factory.audio_player.decoder.MP3Decoder;
import main.java.design_patterns.factory.abstract_factory.audio_player.player.AudioPlayer;
import main.java.design_patterns.factory.abstract_factory.audio_player.player.MP3Player;
import main.java.design_patterns.factory.abstract_factory.audio_player.processor.AudioProcessor;
import main.java.design_patterns.factory.abstract_factory.audio_player.processor.MP3AudioProcessor;

public class MP3AudioFactory extends AudioFactory {

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }

    @Override
    public AudioDecoder createAudioDecoder(byte[] audioData) {
        return new MP3Decoder(audioData);
    }

    @Override
    public AudioPlayer createAudioPlayer(int volume, double playbackRate) {
        return new MP3Player(volume, playbackRate);
    }

    @Override
    public AudioProcessor createAudioProcessor(byte[] audioData) {
        return new MP3AudioProcessor(audioData);
    }
}
