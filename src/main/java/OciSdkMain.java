import Implementation.JmsSdk;
import Interface.IJmsSdk;
import Interface.IMacsSdk;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.LogUtils;

public class OciSdkMain {

    private static IJmsSdk jmssdk;
    private static IMacsSdk macssdk;

    static {
        //initialise logging
        LogUtils.initialize();
    }

    private static final Logger LOG = LoggerFactory.getLogger(OciSdkMain.class);

    public static void main (String[] args) {

        jmssdk = new JmsSdk();

        LOG.warn(jmssdk.helloWorld());

    }
}
