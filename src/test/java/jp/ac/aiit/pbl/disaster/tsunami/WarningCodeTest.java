package jp.ac.aiit.pbl.disaster.tsunami;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * This Class is WarningCode parser test of Tsunami.
 * To test that the parameter values ​​are properly parsed or not, according to the definition.
 */

public class WarningCodeTest {
    
    /**
     * code1(alarmType:NoTsunami)
     */
    @Test
    public void inCaseOfValueIs1CanGetNoTsunami(){
        assertThat(WarningCode.NoTsunami, is(WarningCode.getTsunamiAlarmType(1)));
    }
    /**
     * code2(alarmType:AlarmRelease)
     */
    @Test
    public void inCaseOfValueIs2CanGetAlarmRelease(){
        assertThat(WarningCode.AlarmRelease, is(WarningCode.getTsunamiAlarmType(2)));
    }
    /**
     * code3(alarmType:TsunamiWarning)
     */
    @Test
    public void inCaseOfValueIs3CanGetTsunamiWarning(){
        assertThat(WarningCode.TsunamiWarning, is(WarningCode.getTsunamiAlarmType(3)));
    }
    /**
     * code4(alarmType:BigTsunamiWarning)
     */
    @Test
    public void inCaseOfValueIs4CanGetBigTsunamiWarning(){
        assertThat(WarningCode.BigTsunamiWarning, is(WarningCode.getTsunamiAlarmType(4)));
    }
    /**
     * code5 (alarmType:BigTsunamiWarningAnnouncement)
     */
    @Test
    public void inCaseOfValueIs5CanGetBigTsunamiWarningAnnouncement(){
        assertThat(WarningCode.BigTsunamiWarningAnnouncement, is(WarningCode.getTsunamiAlarmType(5)));
    }
    /**
     * code15 (alarmType:OtherAlarms)
     */
    @Test
    public void inCaseOfValueIs15canGetOtherAlarms(){
        assertThat(WarningCode.OtherAlarms, is(WarningCode.getTsunamiAlarmType(15)));
    }
}