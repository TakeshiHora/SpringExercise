package jp.ac.aiit.pbl;

import jp.ac.aiit.pbl.disaster.DisasterParser;
import jp.ac.aiit.pbl.disaster.DisasterParserFactory;
import jp.ac.aiit.pbl.disaster.ashfall.AshFallParser;
import jp.ac.aiit.pbl.disaster.flood.FloodParser;
import org.junit.Test;
;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class DisasterParserFactoryTest {

    @Test
    public void caseOfAshFall(){
        DisasterParserFactory factory = new DisasterParserFactory();
        DisasterParser parser =  factory.create("1001101010101101010010111111110010101110100000000000011111001010001001000011111111110100110001101010011110000000110001100011010100111100000000000000000000000000000000000000000000000000000000000000000000000000000000000001001101110101011110111100000111000000");
        assertThat(parser, is(instanceOf(AshFallParser.class)));
    }
    @Test
    public void caseOfFlood(){
        DisasterParserFactory factory = new DisasterParserFactory();
        DisasterParser parser =  factory.create("1100011010101101010110111111000001101111000000000000000100001000001001100101011101100100111100100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000011010110000111100101010111000000");
        assertThat(parser, is(instanceOf(FloodParser.class)));
    }

}
