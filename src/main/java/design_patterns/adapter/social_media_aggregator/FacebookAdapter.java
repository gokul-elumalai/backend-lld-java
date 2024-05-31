package main.java.design_patterns.adapter.social_media_aggregator;

import main.java.design_patterns.adapter.social_media_aggregator.external.FacebookApi;
import main.java.design_patterns.adapter.social_media_aggregator.external.FacebookPost;

import java.util.ArrayList;
import java.util.List;

public class FacebookAdapter implements SocialMediaAdapter {
    private FacebookApi facebookApi = new FacebookApi();
    public List<SocialMediaPost> getPosts(Long userId, Long timestamp) {
        List<FacebookPost> posts = facebookApi.fetchFacebookPosts(userId, timestamp);
        return convertToSocialMediaPost(posts);
    }

    public void postMessages(Long user, String message) {
        facebookApi.postFacebookStatus(user, message);
    }

    private List<SocialMediaPost> convertToSocialMediaPost(List<FacebookPost> posts) {
        List<SocialMediaPost> socialMediaPosts = new ArrayList<>();
        for (FacebookPost post : posts) {
            SocialMediaPost fbpost = new SocialMediaPost(post.getId(), post.getUserId(), post.getStatus(), post.getTimestamp());
            socialMediaPosts.add(fbpost);
        }
        return socialMediaPosts;
    }
}
