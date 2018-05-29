package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args){

        Forum forum = new Forum();
        Map<Integer, ForumUser> theForumUserMap = forum.getList().stream()
                .filter(ForumUser -> ForumUser.getSex() == 'M')
                .filter(ForumUser -> Period.between(ForumUser.getDateOfBirth(), LocalDate.now()).getYears() >= 20)
                .filter(ForumUser -> ForumUser.getPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, ForumUser -> ForumUser));

        theForumUserMap.entrySet().stream()
                .map(entry -> "User ID: " + entry.getKey() + "- " + entry.getValue())
                .forEach(System.out::println);





    }
}
