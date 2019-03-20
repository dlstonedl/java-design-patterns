package com.dlstone.patterns.singleton;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InnerClassSingletonTest {

    @Test
    public void should_return_true_when_get_singleton_instance_is_equal() {
        InnerClassSingleton instance1 = InnerClassSingleton.getInstance();
        InnerClassSingleton instance2 = InnerClassSingleton.getInstance();

        assertThat(instance1).isEqualTo(instance2);
    }
}
