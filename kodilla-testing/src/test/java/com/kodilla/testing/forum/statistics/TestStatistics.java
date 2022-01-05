package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
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

    @BeforeEach
    void theNumberOfPosts() {
        statisticsMock = mock(Statistics.class);
        List<String> theUserList = new ArrayList<>();
        for (int n = 0; n < 10; n++) {
            theUserList.add("aaa");
            System.out.println(theUserList);
        }
        when(statisticsMock.usersNames()).thenReturn(theUserList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(10);
        countStatistics = new CountStatistics();
    }

    @Test
    void zeroPosts() {
        CountStatistics countStatistics = new CountStatistics();
        when(statisticsMock.postsCount()).thenReturn(0);
        countStatistics.calculateAdvStatistics(statisticsMock);
        Assertions.assertEquals(0, countStatistics.getNumberOfPosts());
        Assertions.assertEquals(0, countStatistics.getAverageNumbersOfPostsOfUser());
        Assertions.assertEquals(0, countStatistics.getAverageNumbersOfCommentsOfPost());
    }

    @Test
    void thousandPosts() {
        CountStatistics countStatistics = new CountStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        countStatistics.calculateAdvStatistics(statisticsMock);
        Assertions.assertEquals(1000, countStatistics.getNumberOfPosts());
        Assertions.assertEquals(100, countStatistics.getAverageNumbersOfPostsOfUser());
        Assertions.assertEquals(0.01, countStatistics.getAverageNumbersOfCommentsOfPost());
    }

    @Test
    void zeroComments() {
        CountStatistics countStatistics = new CountStatistics();
        when(statisticsMock.commentsCount()).thenReturn(0);
        countStatistics.calculateAdvStatistics(statisticsMock);
        Assertions.assertEquals(0, countStatistics.getNumberOfComments());
        Assertions.assertEquals(0, countStatistics.getAverageNumbersOfCommentsOfUser());
        Assertions.assertEquals(0, countStatistics.getAverageNumbersOfCommentsOfPost());
    }

    @Test
    void morePostsThenComments() {
        CountStatistics countStatistics = new CountStatistics();
        when(statisticsMock.commentsCount()).thenReturn(1);
        when(statisticsMock.postsCount()).thenReturn(2);
        countStatistics.calculateAdvStatistics(statisticsMock);
        Assertions.assertEquals(1, countStatistics.getNumberOfComments());
        Assertions.assertEquals(2, countStatistics.getNumberOfPosts());
        Assertions.assertEquals(0.2, countStatistics.getAverageNumbersOfPostsOfUser());
        Assertions.assertEquals(0.1, countStatistics.getAverageNumbersOfCommentsOfUser());
    }

    @Test
    void moreCommentsThenPosts() {
        CountStatistics countStatistics = new CountStatistics();
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.postsCount()).thenReturn(1);
        countStatistics.calculateAdvStatistics(statisticsMock);
        Assertions.assertEquals(2, countStatistics.getNumberOfComments());
        Assertions.assertEquals(1, countStatistics.getNumberOfPosts());
        Assertions.assertEquals(0.1, countStatistics.getAverageNumbersOfPostsOfUser());
        Assertions.assertEquals(0.2, countStatistics.getAverageNumbersOfCommentsOfUser());
    }

    @Test
    void zeroUsers() {
        CountStatistics countStatistics = new CountStatistics();
        ArrayList<String> theZeroUsersList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(theZeroUsersList);
        countStatistics.calculateAdvStatistics(statisticsMock);
        Assertions.assertEquals(0, countStatistics.getNumbersOfUsers());
        Assertions.assertEquals(0, countStatistics.getAverageNumbersOfCommentsOfUser());
        Assertions.assertEquals(0, countStatistics.getAverageNumbersOfPostsOfUser());
    }

    @Test
    void hundredUsers() {
        CountStatistics countStatistics = new CountStatistics();
        ArrayList<String> theHundredUsersList = new ArrayList<>();
        for (int n = 0; n < 100; n++) {
            theHundredUsersList.add("aaa");
            System.out.println(theHundredUsersList.get(n));
        }
        when(statisticsMock.usersNames()).thenReturn(theHundredUsersList);
        countStatistics.calculateAdvStatistics(statisticsMock);
        Assertions.assertEquals(100, countStatistics.getNumbersOfUsers());
        Assertions.assertEquals(0.1, countStatistics.getAverageNumbersOfCommentsOfUser());
        Assertions.assertEquals(0.1, countStatistics.getAverageNumbersOfPostsOfUser());
    }
}
