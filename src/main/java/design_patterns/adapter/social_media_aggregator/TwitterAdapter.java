package main.java.design_patterns.adapter.social_media_aggregator;

import main.java.design_patterns.adapter.social_media_aggregator.external.TwitterApi;
import main.java.design_patterns.adapter.social_media_aggregator.external.TwitterTweet;

import java.util.ArrayList;
import java.util.List;

public class TwitterAdapter implements SocialMediaAdapter {
    private TwitterApi twitterApi = new TwitterApi();
    public List<SocialMediaPost> getPosts(Long userId, Long timestamp) {
        List<TwitterTweet> posts = twitterApi.getTweets(userId);
        return convertToSocialMediaPost(posts);
    }

    public void postMessages(Long user, String message) {
        twitterApi.tweet(user, message);
    }

    private List<SocialMediaPost> convertToSocialMediaPost(List<TwitterTweet> posts) {
        List<SocialMediaPost> socialMediaPosts = new ArrayList<>();
        for (TwitterTweet post : posts) {
            SocialMediaPost tweetpost = new SocialMediaPost(post.getId(), post.getUserId(), post.getTweet(), System.currentTimeMillis());
            socialMediaPosts.add(tweetpost);
        }
        return socialMediaPosts;
    }
}
