package jp.ac.aiit.pbl.disaster.tsunami;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * This Class is TsunamiForecastRegion parser test.
 * To test that the parameter values ​​are properly parsed or not, according to the definition.
 */

public class TsunamiForecastRegionTest {
    
    /**
     * code100(regionName:HokkaidoPacificCoastEast)
     */
    @Test
    public void inCaseOfValueIs100CanGetHokkaidoPacificCoastEast(){
        assertThat(TsunamiForecastRegion.HokkaidoPacificCoastEast, is(TsunamiForecastRegion.getRegionName(100)));
    }
    
    /**
     * code101(regionName:HokkaidoPacificCoastCentral)
     */
    @Test
    public void inCaseOfValueIs101CanGetHokkaidoPacificCoastCentral(){
        assertThat(TsunamiForecastRegion.HokkaidoPacificCoastCentral, is(TsunamiForecastRegion.getRegionName(101)));
    }
    
    /**
     * code102(regionName:HokkaidoPacificCoastWest)
     */
    @Test
    public void inCaseOfValueIs102CanGetHokkaidoPacificCoastWest(){
        assertThat(TsunamiForecastRegion.HokkaidoPacificCoastWest, is(TsunamiForecastRegion.getRegionName(102)));
    }
    
    /**
     * code110(regionName:HokkaidoJapanCoastNorth)
     */
    @Test
    public void inCaseOfValueIs110CanGetHokkaidoJapanCoastNorth(){
        assertThat(TsunamiForecastRegion.HokkaidoJapanCoastNorth, is(TsunamiForecastRegion.getRegionName(110)));
    }
    
    /**
     * code111(regionName:HokkaidoJapanCoastSouth)
     */
    @Test
    public void inCaseOfValueIs111CanGetHokkaidoJapanCoastSouth(){
        assertThat(TsunamiForecastRegion.HokkaidoJapanCoastSouth, is(TsunamiForecastRegion.getRegionName(111)));
    }
    
    /**
     * code120(regionName:OkhotskCoast)
     */
    @Test
    public void inCaseOfValueIs120CanGetOkhotskCoast(){
        assertThat(TsunamiForecastRegion.OkhotskCoast, is(TsunamiForecastRegion.getRegionName(120)));
    }
    
    /**
     * code191(regionName:HokkaidoPacificCoast)
     */
    @Test
    public void inCaseOfValueIs191CanGetHokkaidoPacificCoast(){
        assertThat(TsunamiForecastRegion.HokkaidoPacificCoast, is(TsunamiForecastRegion.getRegionName(191)));
    }
    
    /**
     * code192(regionName:HokkaidoJapanCoast)
     */
    @Test
    public void inCaseOfValueIs192CanGetHokkaidoJapanCoast(){
        assertThat(TsunamiForecastRegion.HokkaidoJapanCoast, is(TsunamiForecastRegion.getRegionName(192)));
    }
    
    /**
     * code193(regionName:OkhotskCoast)
     */
    @Test
    public void inCaseOfValueIs193CanGetOkhotskCoast2(){
        assertThat(TsunamiForecastRegion.OkhotskCoast2, is(TsunamiForecastRegion.getRegionName(193)));
    }
    
    /**
     * code200(regionName:AomoriJapanCoast)
     */
    @Test
    public void inCaseOfValueIs200CanGetAomoriJapanCoast(){
        assertThat(TsunamiForecastRegion.AomoriJapanCoast, is(TsunamiForecastRegion.getRegionName(200)));
    }
    
    /**
     * code201(regionName:AomoriPacificCoast)
     */
    @Test
    public void inCaseOfValueIs201CanGetAomoriPacificCoast(){
        assertThat(TsunamiForecastRegion.AomoriPacificCoast, is(TsunamiForecastRegion.getRegionName(201)));
    }

}