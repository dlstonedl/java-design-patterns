package com.dlstone.patterns.singleton;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LazyLoadSingletonTest {

    @Test
    public void should_return_true_when_get_singleton_instance_is_equal() {
        LazyLoadSingleton instance1 = LazyLoadSingleton.getInstance();
        LazyLoadSingleton instance2 = LazyLoadSingleton.getInstance();

        assertThat(instance1).isEqualTo(instance2);
    }
}
