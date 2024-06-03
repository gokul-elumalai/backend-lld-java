package main.java.design_patterns.strategy.video_streaming;

public class LowVideoQualityAdjustmentStrategy implements QualityAdjustmentStrategy {
    @Override
    public VideoQuality supportsType() {
        return VideoQuality.LOW;
    }

    @Override
    public Video streamVideo(Video video) {
        video.setCodec(VideoCodec.H264);
        video.setBitrate(500);
        return video;
    }
}
