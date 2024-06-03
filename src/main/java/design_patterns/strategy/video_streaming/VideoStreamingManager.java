package main.java.design_patterns.strategy.video_streaming;

public class VideoStreamingManager {
    private Video video;
    private QualityAdjustmentStrategy qualityAdjustmentStrategy;

    public VideoStreamingManager(Video video, QualityAdjustmentStrategy qualityAdjustmentStrategy) {
        this.video = video;
        this.qualityAdjustmentStrategy = qualityAdjustmentStrategy;
    }

    public Video streamVideo() {
        return qualityAdjustmentStrategy.streamVideo(video);
    }
}
