package main.java.design_patterns.adapter.social_media_aggregator.external;

import java.util.List;

import static main.java.design_patterns.adapter.social_media_aggregator.external.ApiUtils.logFacebookGetPosts;
import static main.java.design_patterns.adapter.social_media_aggregator.external.ApiUtils.logFacebookPostStatus;

public class FacebookApi {

    public List<FacebookPost> fetchFacebookPosts(Long userId, Long timestamp) {
        // Implementation to fetch Facebook posts
        logFacebookGetPosts();
        return List.of(new FacebookPost("1", "Hello World", 1L, 123456789L));
    }

    public void postFacebookStatus(Long user, String status) {
        // Implementation to post a status on Facebook
        logFacebookPostStatus();
    }
}