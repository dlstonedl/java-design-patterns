package com.dlstone.patterns.singleton;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EnumSingletonTest {

    @Test
    public void should_return_true_when_get_singleton_instance_is_equal() {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;

        assertThat(instance1).isEqualTo(instance2);
    }
}
