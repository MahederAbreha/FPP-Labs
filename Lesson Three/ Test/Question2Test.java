import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2Test {

    @Test
    void minchar() {
        Question2 Q2= new Question2();
        String actual= String.valueOf(Q2.minchar("blue", 0));
        String expected= "b";
        assertEquals(actual, expected);

    }
    @Test
    void minChartest(){

    }
}