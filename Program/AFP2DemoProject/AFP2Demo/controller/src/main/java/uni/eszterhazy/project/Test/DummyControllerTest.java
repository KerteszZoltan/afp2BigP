package uni.eszterhazy.project.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DummyControllerTest {

    DummyController dummyController;

    @BeforeEach
    void setUp() {
        dummyController = new DummyController();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void hello(){
        String result = dummyController.hello();
        assertEquals(result,"hello.jsp");
    }
}