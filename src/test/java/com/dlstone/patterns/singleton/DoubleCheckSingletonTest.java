package com.dlstone.patterns.singleton;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DoubleCheckSingletonTest {

    @Test
    public void should_return_true_when_get_singleton_instance_is_equal() {
        DoubleCheckSingleton instance1 = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton instance2 = DoubleCheckSingleton.getInstance();

        assertThat(instance1).isEqualTo(instance2);
    }
}
