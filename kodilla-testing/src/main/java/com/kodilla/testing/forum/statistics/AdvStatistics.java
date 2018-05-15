package com.kodilla.testing.forum.statistics;


public class AdvStatistics {
    private Statistics statistics;
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averagePostsCountPerUser;
    private double averageCommentsCountPerUser;
    private double averageCommentsCountPerPost;

    public AdvStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(){
        usersQuantity = statistics.userNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        if(statistics.userNames().size() == 0){
            averagePostsCountPerUser = 0;
            averageCommentsCountPerUser = 0;
        }else {
            averagePostsCountPerUser = statistics.postsCount() / statistics.userNames().size();
            averageCommentsCountPerUser = statistics.commentsCount() / statistics.userNames().size();
        }
        if(statistics.postsCount() == 0){
            averageCommentsCountPerPost = 0;
        }else {
            averageCommentsCountPerPost = (double) statistics.commentsCount() / statistics.postsCount();
        }
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostsCountPerUser() {
        return averagePostsCountPerUser;
    }

    public double getAverageCommentsCountPerUser() {
        return averageCommentsCountPerUser;
    }

    public double getAverageCommentsCountPerPost() {
        return averageCommentsCountPerPost;
    }

    public void showStatistcs() {
        System.out.println("Users quantity: " + usersQuantity);
        System.out.println("Posts quantity: " + postsQuantity);
        System.out.println("Comments quantity: " + commentsQuantity);
        System.out.println("Average posts count pes user: " + averagePostsCountPerUser);
        System.out.println("Average comments count pes user: " + averageCommentsCountPerUser);
        System.out.println("Average comments count per post" + averageCommentsCountPerPost);


    }
}
