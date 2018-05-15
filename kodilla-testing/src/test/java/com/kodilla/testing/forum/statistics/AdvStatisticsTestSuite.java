package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AdvStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics0Posts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        List<String> users = new ArrayList<>();
        users.add("User 1");
        users.add("User 2");
        when(statisticsMock.userNames()).thenReturn(users);

        //When
        advStatistics.calculateAdvStatistics();

        //Then
        assertEquals(0, advStatistics.getPostsQuantity());
        assertEquals(2, advStatistics.getUsersQuantity());
        assertEquals(0, advStatistics.getCommentsQuantity());
        assertEquals(0, advStatistics.getAveragePostsCountPerUser(), 0.0001);
        assertEquals(0, advStatistics.getAverageCommentsCountPerUser(), 0.0001);
        assertEquals(0, advStatistics.getAverageCommentsCountPerPost(), 0.0001);

    }

    @Test
    public void testCalculateAdvStatistics1000Posts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        List<String> users = new ArrayList<>();
        users.add("User 1");
        users.add("User 2");
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(3000);

        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);

        //When
        advStatistics.calculateAdvStatistics();


        //Then
        assertEquals(1000, advStatistics.getPostsQuantity());
        assertEquals(2, advStatistics.getUsersQuantity());
        assertEquals(3000, advStatistics.getCommentsQuantity());
        assertEquals(500, advStatistics.getAveragePostsCountPerUser(), 0.0001);
        assertEquals(1500, advStatistics.getAverageCommentsCountPerUser(), 0.0001);
        assertEquals(3, advStatistics.getAverageCommentsCountPerPost(), 0.0001);
    }

    @Test
    public void testCalculateAdvStatistics0Comments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(1000);
        List<String> users = new ArrayList<>();
        users.add("User 1");
        users.add("Users 2");
        when(statisticsMock.userNames()).thenReturn(users);

        //When
        advStatistics.calculateAdvStatistics();

        //Then
        assertEquals(1000, advStatistics.getPostsQuantity());
        assertEquals(2, advStatistics.getUsersQuantity());
        assertEquals(0, advStatistics.getCommentsQuantity());
        assertEquals(500, advStatistics.getAveragePostsCountPerUser(), 0.0001);
        assertEquals(0, advStatistics.getAverageCommentsCountPerUser(), 0.0001);
        assertEquals(0, advStatistics.getAverageCommentsCountPerPost(), 0.0001);
    }
    @Test
    public void testCalculateAdvStatisticsBiggerAmountOfPostsThanComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
        List<String> users = new ArrayList<>();
        users.add("User 1");
        users.add("Users 2");
        when(statisticsMock.userNames()).thenReturn(users);

        //When
        advStatistics.calculateAdvStatistics();

        //Then
        assertEquals(1000, advStatistics.getPostsQuantity());
        assertEquals(2, advStatistics.getUsersQuantity());
        assertEquals(500, advStatistics.getCommentsQuantity());
        assertEquals(500, advStatistics.getAveragePostsCountPerUser(), 0.0001);
        assertEquals(250, advStatistics.getAverageCommentsCountPerUser(), 0.0001);
        assertEquals(0.5, advStatistics.getAverageCommentsCountPerPost(), 0.0001);


    }
    @Test
    public void testCalculateAdvStatisticsBiggerAmountOfCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        List<String> users = new ArrayList<>();
        users.add("User 1");
        users.add("Users 2");
        when(statisticsMock.userNames()).thenReturn(users);

        //When
        advStatistics.calculateAdvStatistics();

        //Then
        assertEquals(500, advStatistics.getPostsQuantity());
        assertEquals(2, advStatistics.getUsersQuantity());
        assertEquals(1000, advStatistics.getCommentsQuantity());
        assertEquals(250, advStatistics.getAveragePostsCountPerUser(), 0.0001);
        assertEquals(500, advStatistics.getAverageCommentsCountPerUser(), 0.0001);
        assertEquals(2, advStatistics.getAverageCommentsCountPerPost(), 0.0001);
    }
    @Test
    public void testCalculateAdvStatistics0Users(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);

        //When
        advStatistics.calculateAdvStatistics();
        int usersTest = advStatistics.getUsersQuantity();

        //Then
        assertEquals(0, usersTest);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock6(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        for(int n = 0; n < 100; n++){
        users.add("User " + n);
        }
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);

        //When
        advStatistics.calculateAdvStatistics();

        //Then
        assertEquals(1000, advStatistics.getPostsQuantity());
        assertEquals(100, advStatistics.getUsersQuantity());
        assertEquals(1000, advStatistics.getCommentsQuantity());
        assertEquals(10, advStatistics.getAveragePostsCountPerUser(), 0.0001);
        assertEquals(10, advStatistics.getAverageCommentsCountPerUser(), 0.0001);
        assertEquals(1, advStatistics.getAverageCommentsCountPerPost(), 0.0001);
    }
}
