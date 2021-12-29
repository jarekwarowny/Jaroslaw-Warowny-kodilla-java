package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theForumList = new ArrayList<>();

    public Forum() {
        theForumList.add(new ForumUser(1, "aa", 'M', LocalDate.of(1999, 01,22), 6));
        theForumList.add(new ForumUser(2, "bb", 'M', LocalDate.of(1989, 02,24), 9));
        theForumList.add(new ForumUser(3, "cc", 'M', LocalDate.of(2009, 03,23), 1));
        theForumList.add(new ForumUser(4, "dd", 'F', LocalDate.of(1889, 04,12), 3));
        theForumList.add(new ForumUser(5, "ee", 'M', LocalDate.of(2010, 05,21), 12));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumList);
    }
}
