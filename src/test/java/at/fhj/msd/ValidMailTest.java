package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidMailTest {
    private ValidMail vm;

    @BeforeEach
    void setup(){
        vm=new ValidMail();
    }
    @Test
    void testEmailIsNotValid() {
        assertThrows(IllegalArgumentException.class, ()->vm.isValid("   "));
        assertThrows(IllegalArgumentException.class, ()->vm.isValid(null));
    }

    @Test
    void testValidEmail(){
        assertTrue(vm.isValid("mario.shenouda@edu.at"));
        assertTrue(vm.isValid("marrioasdasda@FhJoanneum-edu.at"));
    }
    @Test 
    void testInvalidEmail(){
        assertFalse(vm.isValid("@mario.shenouda.at"));
        assertFalse(vm.isValid("mario.shenouda.at@"));
        assertFalse(vm.isValid("mario.shenouda@edu.com"));
        assertFalse(vm.isValid("mario.shenouda@edu@fh-joanneum.at"));
    }
}
