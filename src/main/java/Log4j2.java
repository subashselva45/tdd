import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2 {
    private Logger logger = LogManager.getLogger(Log4j2.class);
    public int sum(int a, int b){
        logger.debug("value of A={} abd B={}",a,b);
        logger.info("sum is {}",a+b);
        return a+b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            logger.warn("value of B can't be 0");
        }
        return a / b;
    }

}
