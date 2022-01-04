package com.kodilla.testing.forum.statistics;

public class CountStatistics {

    private int numbersOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageNumbersOfPostsOfUser;
    private double averageNumbersOfCommentsOfUser;
    private double averageNumbersOfCommentsOfPost;

    public int getNumbersOfUsers() {
        return numbersOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumbersOfPostsOfUser() {
        return averageNumbersOfPostsOfUser;
    }

    public double getAverageNumbersOfCommentsOfUser() {
        return averageNumbersOfCommentsOfUser;
    }

    public double getAverageNumbersOfCommentsOfPost() {
        return averageNumbersOfCommentsOfPost;
    }

    private double firstAverage() {
        if (numbersOfUsers > 0) {
            return numberOfPosts/numbersOfUsers;
        } else {
            return numbersOfUsers;
        }
    }

    private double secondAverage() {
        if (numbersOfUsers > 0) {
            return numberOfComments/numbersOfUsers;
        } else {
            return numbersOfUsers;
        }
    }

    private double thirdAverage() {
        if (numberOfPosts > 0) {
            return numberOfComments/numberOfPosts;
        } else {
            return numberOfPosts;
        }
    }

    void calculateAdvStatistics(Statistics statistics) {
        numbersOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        averageNumbersOfPostsOfUser = firstAverage();
        averageNumbersOfCommentsOfUser = secondAverage();
        averageNumbersOfCommentsOfPost = thirdAverage();
    }

    void showStatistics() {
        System.out.println("Liczba uzytkownikow" + numbersOfUsers);
        System.out.println("Liczba postow" + numberOfPosts);
        System.out.println("Liczba komentarzy" + numberOfPosts);
        System.out.println("Srednia liczba postow na uzytkownika" + averageNumbersOfPostsOfUser);
        System.out.println("Srednia liczba komentarzy na uzytkownika" + averageNumbersOfCommentsOfUser);
        System.out.println("Srednia liczba komentarzy na post" + averageNumbersOfCommentsOfPost);
    }
}
