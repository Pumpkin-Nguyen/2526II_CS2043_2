public class AppConfig {
    private volatile static AppConfig instance;
    private String appName, version, logLevel;

    private AppConfig() {
        this.appName = "BigBidApp";
        this.version = "1.0.0";
        this.logLevel = "INFO";
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            synchronized (AppConfig.class) {
                if (instance == null) {
                    instance = new AppConfig();
                } 
            }
        }
        return instance;
    }

}
