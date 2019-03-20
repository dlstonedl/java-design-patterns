package com.dlstone.patterns.singleton;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HungrySingletonTest {

    @Test
    public void should_return_true_when_get_singleton_instance_is_equal() {
        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();

        assertThat(instance1).isEqualTo(instance2);
    }

}
