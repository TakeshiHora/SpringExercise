package jp.ac.aiit.pbl.disaster.ashfall;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WarningCodeTest {
    @Test
    public void canGetWarningCode1(){
        assertThat(WarningCode.SmallAshFall,is(WarningCode.getById(1)));
    }
    @Test
    public void canGetWarningCode4(){
        assertThat(WarningCode.SmallMeteoriteFall,is(WarningCode.getById(4)));
    }
    @Test
    public void canGetWarningCode7(){
        assertThat(WarningCode.Others,is(WarningCode.getById(7)));
    }
}