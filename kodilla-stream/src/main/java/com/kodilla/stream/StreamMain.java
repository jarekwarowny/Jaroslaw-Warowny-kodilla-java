package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum theForum = new Forum();
        Map<Integer, ForumUser> theMap = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getDate(), LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getPeselId, ForumUser -> ForumUser));

        System.out.println("# elements: " + theMap.size());
        theMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}

