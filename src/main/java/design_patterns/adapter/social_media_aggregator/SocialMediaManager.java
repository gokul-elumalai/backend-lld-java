package main.java.design_patterns.adapter.social_media_aggregator;

import main.java.design_patterns.adapter.social_media_aggregator.external.FacebookApi;
import main.java.design_patterns.adapter.social_media_aggregator.external.FacebookPost;
import main.java.design_patterns.adapter.social_media_aggregator.external.TwitterApi;
import main.java.design_patterns.adapter.social_media_aggregator.external.TwitterTweet;

import java.util.List;


public class SocialMediaManager {
    private FacebookApi facebookApi = new FacebookApi();
    private TwitterApi twitterApi = new TwitterApi();

    public void getMessages(Long userId, Long timestamp, String platform) {
        if (platform.equals("facebook")) {
            List<FacebookPost> posts = facebookApi.fetchFacebookPosts(userId, timestamp);
        } else if (platform.equals("twitter")) {
            List<TwitterTweet> tweets = twitterApi.getTweets(userId);
        }

        // Convert the posts/tweets to a common format
    }
}