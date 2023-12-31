package config;
import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:browserstack.properties",
})
public interface BrowserStackConfig extends Config{

    @Key("username")
    String getUserName();

    @Key("accessKey")
    String getPassword();

    @Key("appUrl")
    String getAppUrl();

    @Key("device")
    String getDevice();

    @Key("os_version")
    String getVersion();


}
