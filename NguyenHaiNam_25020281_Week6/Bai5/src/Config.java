import java.util.ArrayList;
import java.util.List;

public class Config implements Cloneable {
    private String appName, version;
    private List<String> dependencies;

    public Config(String appName, String version, List<String> dependencies) {
        this.appName = appName;
        this.version = version;
        this.dependencies = dependencies;
    }

    @Override
    public Config clone() {
        try {
            Config cloned = (Config) super.clone();
            cloned.dependencies = new ArrayList<>(this.dependencies);
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public List<String> getDependencies() {
        return this.dependencies;
    }

    @Override 
    public String toString() {
        return "Config [appName = %s, version = %s, dependencies = %s]".formatted(this.appName, this.version, this.dependencies);
    }
}
