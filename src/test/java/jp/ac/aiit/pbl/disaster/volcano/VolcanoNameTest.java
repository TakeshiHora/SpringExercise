package jp.ac.aiit.pbl.disaster.volcano;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class VolcanoNameTest {
    @Test
    public void canGetVolcanoName101(){
        assertThat(VolcanoName.Shiretokoiozan,is(VolcanoName.getById(101)));
    }
    @Test
    public void canGetVolcanoName110(){
        assertThat(VolcanoName.Eniwadake,is(VolcanoName.getById(110)));
    }
    @Test
    public void canGetVolcanoName309(){
        assertThat(VolcanoName.Midagahara,is(VolcanoName.getById(309)));
    }
    @Test
    public void canGetVolcanoNameMax(){
        assertThat(VolcanoName.Others,is(VolcanoName.getById(4000)));
    }
    @Test
    public void canGetVolcanoNameMoreThanMax(){
        assertThat(null,is(VolcanoName.getById(4001)));
    }
    @Test
    public void canGetVolcanoNameLessThanMin(){
        assertThat(null,is(VolcanoName.getById(100)));
    }
}
