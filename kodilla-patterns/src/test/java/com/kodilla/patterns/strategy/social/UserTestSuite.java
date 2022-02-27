package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        User user1 = new Millenials("aaa");
        User user2 = new YGeneration("bbb");
        User user3 = new ZGeneration("ccc");

        String facebook = user1.sharePost();
        System.out.println("User1:" + facebook);
        String snapchat = user2.sharePost();
        System.out.println("User2:" + snapchat);
        String twitter = user3.sharePost();
        System.out.println("User3:" + twitter);

        Assertions.assertEquals("Facebook", facebook);
        Assertions.assertEquals("Snapchat", snapchat);
        Assertions.assertEquals("Twitter", twitter);
    }

    @Test
    void testIndividualSharingStrategy() {

        User user = new Millenials("asas");

        String facebook = user.sharePost();
        System.out.println("User:" + facebook);
        user.setSocialPublisher(new SnapchatPublisher());
        facebook = user.sharePost();
        System.out.println("User now:" + facebook);

        Assertions.assertEquals("Snapchat", facebook);
    }
}
