package org.example.pattern.behavioral;

import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemplateMethodTest
        extends UserTest
        implements BehavioralTest{

    private TemplateMethod.SubTemplate subTemplate;
    private TemplateMethod.Sub2Template sub2Template;

    @Test
    @Override
    public void test() {
        assertDoesNotThrow(() -> subTemplate = new TemplateMethod.SubTemplate(user));
        assertDoesNotThrow(() -> sub2Template = new TemplateMethod.Sub2Template(user2));
        subTemplate.printCV();
        sub2Template.printCV();
    }
}