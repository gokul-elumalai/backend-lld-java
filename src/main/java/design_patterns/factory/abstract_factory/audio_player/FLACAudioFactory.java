package main.java.design_patterns.factory.abstract_factory.audio_player;

import main.java.design_patterns.factory.abstract_factory.audio_player.decoder.AudioDecoder;
import main.java.design_patterns.factory.abstract_factory.audio_player.decoder.FLACDecoder;
import main.java.design_patterns.factory.abstract_factory.audio_player.player.AudioPlayer;
import main.java.design_patterns.factory.abstract_factory.audio_player.player.FLACPlayer;
import main.java.design_patterns.factory.abstract_factory.audio_player.processor.AudioProcessor;
import main.java.design_patterns.factory.abstract_factory.audio_player.processor.FLACAudioProcessor;

public class FLACAudioFactory extends AudioFactory {
    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public AudioDecoder createAudioDecoder(byte[] audioData) {
        return new FLACDecoder(audioData);
    }

    @Override
    public AudioPlayer createAudioPlayer(int volume, double playbackRate) {
        return new FLACPlayer(volume, playbackRate);
    }

    @Override
    public AudioProcessor createAudioProcessor(byte[] audioData) {
        return new FLACAudioProcessor(audioData);
    }
}
