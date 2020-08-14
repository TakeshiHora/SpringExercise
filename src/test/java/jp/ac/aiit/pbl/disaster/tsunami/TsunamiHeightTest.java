package jp.ac.aiit.pbl.disaster.tsunami;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * This Class is TsunamiHeight parser test.
 * To test that the parameter values ​​are properly parsed or not, according to the definition.
 */

public class TsunamiHeightTest {
    
    /**
     * code1(tsunamiHeight:0.2m 未満)
     */
    @Test
    public void inCaseOfValueIs1CanGetHeightLessThan2m(){
        assertThat(TsunamiHeight.HeightLessThan2m, is(TsunamiHeight.getTsunamiHeight(1)));
    }
    /**
     * code2(tsunamiHeight:1m)
     */
    @Test
    public void inCaseOfValueIs2CanGetHeight1m(){
        assertThat(TsunamiHeight.Height1m, is(TsunamiHeight.getTsunamiHeight(2)));
    }
    /**
     * code3(tsunamiHeight:3m)
     */
    @Test
    public void inCaseOfValueIs3CanGetHeight3m(){
        assertThat(TsunamiHeight.Height3m, is(TsunamiHeight.getTsunamiHeight(3)));
    }
    /**
     * code4(tsunamiHeight:5m)
     */
    @Test
    public void inCaseOfValueIs4CanGetHeight5m(){
        assertThat(TsunamiHeight.Height5m, is(TsunamiHeight.getTsunamiHeight(4)));
    }
    /**
     * code5(tsunamiHeight:10m)
     */
    @Test
    public void inCaseOfValueIs5CanGetHeight10m(){
        assertThat(TsunamiHeight.Height10m, is(TsunamiHeight.getTsunamiHeight(5)));
    }
    /**
     * code6(tsunamiHeight:Over10m)
     */
    @Test
    public void inCaseOfValueIs6CanGetHeightOver10m(){
        assertThat(TsunamiHeight.HeightOver10m, is(TsunamiHeight.getTsunamiHeight(6)));
    }
    /**
     * code14(tsunamiHeight:Unknown)
     */
    @Test
    public void inCaseOfValueIs14CanGetHeightUnknown(){
        assertThat(TsunamiHeight.HeightUnknown, is(TsunamiHeight.getTsunamiHeight(14)));
    }
    /**
     * code15(tsunamiHeight:OtherTsunamiHeights)
     */
    @Test
    public void inCaseOfValueIs15CanGetOtherTsunamiHeights(){
        assertThat(TsunamiHeight.OtherTsunamiHeights, is(TsunamiHeight.getTsunamiHeight(15)));
    }
    
}