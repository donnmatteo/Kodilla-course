package com.kodilla.testing.forum.statistics;


import java.util.List;

public class AdvStatistics {

    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averagePostsCountPerUser;
    private double averageCommentsCountPerUser;
    private double averageCommentsCountPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        usersQuantity = statistics.userNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        averagePostsCountPerUser = statistics.postsCount() / statistics.userNames().size();
        averageCommentsCountPerUser = statistics.commentsCount() / statistics.userNames().size();
        averageCommentsCountPerPost = statistics.commentsCount() / statistics.postsCount();
    }

    public int getUsersQuantity(Statistics statistics) {
        return usersQuantity;
    }

    public int getPostsQuantity(Statistics statistics) {
        return postsQuantity;
    }

    public int getCommentsQuantity(Statistics statistics) {
        return commentsQuantity;
    }

    public double getAveragePostsCountPerUser(Statistics statistics) {
        return averagePostsCountPerUser;
    }

    public double getAverageCommentsCountPerUser(Statistics statistics) {
        return averageCommentsCountPerUser;
    }

    public double getAverageCommentsCountPerPost(Statistics statistics) {
        return averageCommentsCountPerPost;
    }

    public String showStatistcs() {
        System.out.println("Users quantity: " + usersQuantity);
        System.out.println("Posts quantity: " + postsQuantity);
        System.out.println("Comments quantity: " + commentsQuantity);
        System.out.println("Average posts count pes user: " + averagePostsCountPerUser);
        System.out.println("Average comments count pes user: " + averageCommentsCountPerUser);
        System.out.println("Average comments count per post" + averageCommentsCountPerPost);
        return null;
    }
}
