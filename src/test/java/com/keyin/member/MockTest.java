package com.keyin.member;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockTest {
    @Mock
    Database databaseMock;

    @Test
    public void testQuery() {
        Assertions.assertNotNull(databaseMock);

    }
}
