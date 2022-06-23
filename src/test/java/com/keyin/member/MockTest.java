package com.keyin.member;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockTest {
    @Mock
    MemberDatabase databaseMock;

    @Test
    public void mockTest() {
        Assertions.assertNotNull(databaseMock);

    }
}
