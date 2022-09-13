import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {

    @Test
    void power() {
        double actual= Question1.Power(2.0,0);
        int expected= 0;
        assertEquals(actual,expected);
    }

}
