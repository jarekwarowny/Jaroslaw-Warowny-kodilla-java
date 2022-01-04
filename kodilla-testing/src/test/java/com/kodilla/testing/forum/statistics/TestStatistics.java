package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestStatistics {

    private Statistics statisticsMock;
    private CountStatistics countStatistics;

    void theNumberOfPosts() {
        statisticsMock = mock(Statistics.class);
        List<String> theUserList = new ArrayList<>();
        for (int n = 0; n < 10; n++) {
            theUserList.add("aaa");
            System.out.println(theUserList);
        }
        when(statisticsMock.usersNames()).thenReturn(theUserList);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(40);
        countStatistics = new CountStatistics();
    }

    @Test
    void zeroPosts() {
        when(statisticsMock.postsCount()).thenReturn(0);
        countStatistics.calculateAdvStatistics(statisticsMock);
        Assertions.assertEquals(0, countStatistics.getNumberOfPosts());
        Assertions.assertEquals(0, countStatistics.getAverageNumbersOfPostsOfUser(), 0.01);
        Assertions.assertEquals(0, countStatistics.getAverageNumbersOfCommentsOfPost(), 0.01);
    }

    @Test
    void thousandPosts() {
        when(statisticsMock.postsCount()).thenReturn(1000);
        countStatistics.calculateAdvStatistics(statisticsMock);
        Assertions.assertEquals(1000, countStatistics.getNumberOfPosts());
        Assertions.assertEquals(10, countStatistics.getAverageNumbersOfPostsOfUser());
        Assertions.assertEquals(0.1, countStatistics.getAverageNumbersOfCommentsOfPost());
    }
}
