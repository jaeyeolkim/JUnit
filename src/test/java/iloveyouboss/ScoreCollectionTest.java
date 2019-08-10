package test.java.iloveyouboss;

import main.java.iloveyouboss.ScoreCollection;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ScoreCollectionTest {

    @Test
    public void answersArithmeticMeanOfTwoNumbers(){
        //준비(Arrange)
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        //실행(Act)
        int actualResult = collection.arithmeticMean();

        //단언(Assert)
        assertThat(actualResult, equalTo(6));
    }

}