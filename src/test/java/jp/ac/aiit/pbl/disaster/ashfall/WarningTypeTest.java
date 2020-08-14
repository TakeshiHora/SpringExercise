package jp.ac.aiit.pbl.disaster.ashfall;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WarningTypeTest {
    @Test
    public void canGetWarningType1(){
        assertThat(WarningType.AshFallForecastPreliminary,is(WarningType.getById(1)));
    }

    @Test
    public void canGetWarningType2(){
        assertThat(WarningType.AshFallForecastDetailed,is(WarningType.getById(2)));
    }
}
