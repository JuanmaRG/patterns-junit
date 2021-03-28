package com.patterns.behavioral;

import com.patterns.behavioral.mediator.AbstractUser;
import com.patterns.behavioral.mediator.ChatMediator;
import com.patterns.behavioral.mediator.Telegram;
import com.patterns.behavioral.mediator.User;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AbstractUserTest {

    @Captor
    ArgumentCaptor<String> messageCaptor;

    @Mock
    ChatMediator chat = new Telegram();

    @InjectMocks
    AbstractUser user1 = new User(chat, "Juan");

    AbstractUser user2 = new User(chat, "Alberto");


    @Test
    @DisplayName("comprobando user notNull")
    void test1() {
        assertNotNull(user1);
    }

    @Test
    @DisplayName("comprobando user1 notEqual user2 ")
    void test2() {
        assertNotEquals(user1, user2);
    }

    @Test
    @DisplayName("comprobando user1 instanceof AbstractUser ")
    void test3() {
        assertTrue(user1 instanceof AbstractUser);
    }

    @Test
    @DisplayName("comprobando chat instanceof ChatMediator ")
    void test4() {
        assertTrue(chat instanceof ChatMediator);
    }
/*
    @Test
    @DisplayName("comprobando recibe el mensaje ")
    @Disabled("FIX - mediator tests")
    void test5() {
        chat.addUser(user1);
        chat.addUser(user2);

        String hola = "Hola buenas!";

        user1.send(hola);

        Mockito.verify(chat).sendMessage(messageCaptor.capture(),user1);

        assertEquals(messageCaptor.getValue(),hola);
    }*/

}