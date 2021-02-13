package com.inflearn.javatest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void create() {
        App app = new App();
        assertThat(app).isNotNull();
    }
}