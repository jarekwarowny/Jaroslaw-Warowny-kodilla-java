package com.kodilla.patterns2.observer.forum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForumTopicTestSuite {

    @Test
    public void testUpdate() {
        // Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar= new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.removeObserver(ivoneEscobar);
        javaHelpForum.removeObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);
        // When
        javaHelpForum.addPost("Hi everyoe! Could you help me with for loop?");
        javaHelpForum.addPost("Better try to use while loop in this case.");
        javaToolsForum.addPost("Help pls, my MySQL db doesn't want to work :(");
        javaHelpForum.addPost("Why while? Is it better?");
        javaToolsForum.addPost("When I try to log in I got 'bad credentials' message");
        // Then
        Assertions.assertEquals(3, johnSmith.getUpdateCount());
        Assertions.assertEquals(0, ivoneEscobar.getUpdateCount());
        Assertions.assertEquals(2, jessiePinkman.getUpdateCount());
    }
}
