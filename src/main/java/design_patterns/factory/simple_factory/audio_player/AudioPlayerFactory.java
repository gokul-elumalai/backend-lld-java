package main.java.design_patterns.factory.simple_factory.audio_player;

public class AudioPlayerFactory {

    public static AudioPlayer getAudioPlayer(MediaFormat mediaFormat, int volume, double playBackRate) {
        switch(mediaFormat) {
            case FLAC: return new FLACPlayer(volume, playBackRate);
            case WAV: return new WAVPlayer(volume, playBackRate);
            case MP3: return new MP3Player(volume, playBackRate);
        }
        return null;
    }
}
