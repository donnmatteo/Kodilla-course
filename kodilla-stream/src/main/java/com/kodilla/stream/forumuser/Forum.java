package com.kodilla.stream.forumuser;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    public final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum(){
        forumUsersList.add(new ForumUser(123, "Rex", 'M', LocalDate.of(1992, 10,
                    23), 3));
        forumUsersList.add(new ForumUser(432, "Mat", 'F', LocalDate.of(1999, 11,
                1), 18));
        forumUsersList.add(new ForumUser(232, "Don", 'F', LocalDate.of(1987, 5,
                19), 5));
        forumUsersList.add(new ForumUser(765, "Killer", 'M', LocalDate.of(1991, 7,
                12), 21));
        forumUsersList.add(new ForumUser(889, "War Machine", 'M', LocalDate.of(2002, 9,
                15), 10));
    }

    public List<ForumUser> getList(){
        return new ArrayList<>(forumUsersList);
    }

}
