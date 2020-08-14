package jp.ac.aiit.pbl.disaster.hypocenter;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * This Class is SeismicEpicenter parser test.
 * To test that the parameter values ​​are properly parsed or not, according to the definition.
 */

public class SeismicEpicenterTest {
    
    @Test
    public void canGetHokkaidoRegion() {
        assertThat(SeismicEpicenter.HokkaidoRegion, is(SeismicEpicenter.getRegionName(11)));
    }
    @Test
    public void canGetTohokuRegion() {
        assertThat(SeismicEpicenter.TohokuRegion, is(SeismicEpicenter.getRegionName(12)));
    }
    @Test
    public void canGetHokurikuRegion() {
        assertThat(SeismicEpicenter.HokurikuRegion, is(SeismicEpicenter.getRegionName(13)));
    }
    @Test
    public void canGetKantoKoshinRegion() {
        assertThat(SeismicEpicenter.KantoKoshinRegion, is(SeismicEpicenter.getRegionName(14)));
    }
    @Test
    public void canGetOgasawaraRegion() {
        assertThat(SeismicEpicenter.OgasawaraRegion, is(SeismicEpicenter.getRegionName(15)));
    }
    @Test
    public void canGetTokaiRegion() {
        assertThat(SeismicEpicenter.TokaiRegion, is(SeismicEpicenter.getRegionName(16)));
    }
    @Test
    public void canGetKinkiRegion() {
        assertThat(SeismicEpicenter.KinkiRegion, is(SeismicEpicenter.getRegionName(17)));
    }
    @Test
    public void canGetChugokuRegion() {
        assertThat(SeismicEpicenter.ChugokuRegion, is(SeismicEpicenter.getRegionName(18)));
    }
    @Test
    public void canGetShikokuRegion() {
        assertThat(SeismicEpicenter.ShikokuRegion, is(SeismicEpicenter.getRegionName(19)));
    }
    @Test
    public void canGetKyushuRegion() {
        assertThat(SeismicEpicenter.KyushuRegion, is(SeismicEpicenter.getRegionName(20)));
    }
    @Test
    public void canGetOkinawaRegion() {
        assertThat(SeismicEpicenter.OkinawaRegion, is(SeismicEpicenter.getRegionName(21)));
    }
    
}