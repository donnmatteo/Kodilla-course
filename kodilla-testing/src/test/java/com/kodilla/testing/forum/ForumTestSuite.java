package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;



public class ForumTestSuite {
    @Test
    public void testCaseUsername(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        //When
        String result = simpleUser.getUsername();
        //Then
        Assert.assertEquals("theForumUser", result);

    }
}
