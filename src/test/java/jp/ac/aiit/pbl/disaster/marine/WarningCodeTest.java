package jp.ac.aiit.pbl.disaster.marine;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WarningCodeTest {
    @Test
    public void cangetWarningCode0() {
        assertThat(WarningCode.SeaAlertReleased, is(WarningCode.getById(0)));
    }
    @Test
    public void cangetWarningCode11() {
        assertThat(WarningCode.SeaDenceFog, is(WarningCode.getById(11)));
    }
    @Test
    public void cangetWarningCode31() {
        assertThat(WarningCode.OtherSeeAlert, is(WarningCode.getById(31)));
    }
    @Test
    public void cangetWarningCodeMoreThanMax() {
        assertThat(null, is(WarningCode.getById(32)));
    }
    @Test
    public void cangetWarningCodeLessThanMin() {
        assertThat(null, is(WarningCode.getById(-1)));
    }
}
