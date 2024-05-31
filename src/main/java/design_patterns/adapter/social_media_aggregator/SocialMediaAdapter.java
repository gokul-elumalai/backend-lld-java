package main.java.design_patterns.adapter.social_media_aggregator;

import java.util.List;

public interface SocialMediaAdapter {
    List<SocialMediaPost> getPosts(Long user, Long timestamp);
    void postMessages(Long user, String message);
}
