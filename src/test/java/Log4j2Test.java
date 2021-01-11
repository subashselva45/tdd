import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Log4j2Test {
    private static Log4j2 log;
    private static Logger logger = LogManager.getLogger(Log4j2Test.class);
    @Before
    public void setUp(){
        logger.info("running before");
    }
    @BeforeClass
    public static void setUp2(){
        log = new Log4j2();
        logger.info("running before class");
    }
    @Test
    public void sumTest(){
        Assert.assertEquals(4,log.sum(2,2));
    }
    @Test
    public void sumTest2(){
        Assert.assertEquals(4,log.sum(2,2));
    }
}
