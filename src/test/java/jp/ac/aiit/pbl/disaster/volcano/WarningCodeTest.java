package jp.ac.aiit.pbl.disaster.volcano;
import jp.ac.aiit.pbl.disaster.volcano.WarningCode;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WarningCodeTest {
    @Test
    public void canGetWarningCode1(){
        assertThat(WarningCode.EruptionWarning,is(WarningCode.getById(1)));
    }
    @Test
    public void canGetWarningCode11(){

        assertThat(WarningCode.Level1,is(WarningCode.getById(11)));
    }
    @Test
    public void canGetWarningCode21(){
        assertThat(WarningCode.ActiveVolcano,is(WarningCode.getById(21)));
    }
    @Test
    public void canGetWarningCode31(){
        assertThat(WarningCode.OceanWarningEruption,is(WarningCode.getById(31)));
    }
    @Test
    public void canGetWarningCode43(){
        assertThat(WarningCode.CraterWarningEntryRestriction,is(WarningCode.getById(43)));
    }
    @Test
    public void canGetWarningMax(){
        assertThat(WarningCode.OthersDisasterInformation,is(WarningCode.getById(127)));
    }
    @Test
    public void canGetWarningCodeMoreThanMax(){

        assertThat(null,is(WarningCode.getById(128)));
    }
    @Test
    public void canGetWarningCodeLessThanMin(){
        assertThat(null,is(WarningCode.getById(0)));
    }

}
