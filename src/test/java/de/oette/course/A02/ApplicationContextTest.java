package de.oette.course.A02;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericApplicationContext;

class ApplicationContextTest {

    @Test
    void testInitSpring() {

        GenericApplicationContext context = new GenericApplicationContext();
        context.refresh();
        context.registerBean(TestContext.class);

        TestContext bean = context.getBean(TestContext.class);
        System.out.println(bean);
        System.out.println(new TestContext());
        System.out.println(new TestContext());
    }
    private static class TestContext {

    }
}
