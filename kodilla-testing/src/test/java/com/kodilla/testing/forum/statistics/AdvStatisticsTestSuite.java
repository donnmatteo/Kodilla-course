package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AdvStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatisticsWithMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics = new AdvStatistics();

        //When
        int postsTest = advStatistics.getPostsQuantity(statisticsMock);

        //Then
        Assert.assertEquals(0, postsTest);
        }

    @Test
    public void testCalculateAdvStatisticsWithMock1(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCount1 = 1000;
        when(statisticsMock.postsCount()).thenReturn(postsCount1);

        AdvStatistics advStatistics = new AdvStatistics();

        //When
        int postsTest = advStatistics.getPostsQuantity(statisticsMock);

        //Then
        Assert.assertEquals(1000, postsTest);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock2(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics = new AdvStatistics();

        //When
        int commentsTest = advStatistics.getCommentsQuantity(statisticsMock);

        //Then
        Assert.assertEquals(0, commentsTest);
    }

}
