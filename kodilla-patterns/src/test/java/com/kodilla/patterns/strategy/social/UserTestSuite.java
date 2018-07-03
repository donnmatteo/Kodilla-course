package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User young = new Millenials("Homie");
        User middle = new YGeneration("Older");
        User old = new ZGeneration("Oldest");

        //When
        String youngPost = young.sharePost();
        System.out.println(youngPost);
        String middlePost = middle.sharePost();
        System.out.println(middlePost);
        String oldPost = old.sharePost();
        System.out.println(oldPost);

        //Then
        Assert.assertEquals("Snapchat", youngPost);
        Assert.assertEquals("Facebook", middlePost);
        Assert.assertEquals("Twitter", oldPost);

    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User young = new Millenials("Homie");

        //When
        String youngPost = young.sharePost();
        System.out.println(youngPost);
        young.setSharedPostLocation(new TwitterPublisher());
        youngPost = young.sharePost();
        System.out.println(youngPost);

        //Then
        Assert.assertEquals("Twitter", youngPost);


    }
}
