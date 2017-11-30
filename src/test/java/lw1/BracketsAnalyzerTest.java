package lw1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mozgotrash on 30.11.17.
 */
public class BracketsAnalyzerTest {

    @Test
    public void testAnalyze() throws Exception {
        Assert.assertEquals(false, BracketsAnalyzer.analyze("}"));
        Assert.assertEquals(true, BracketsAnalyzer.analyze("{}"));
        Assert.assertEquals(true, BracketsAnalyzer.analyze("{(){}[{()}]}"));
        Assert.assertEquals(false, BracketsAnalyzer.analyze("{}([]){"));
    }
}