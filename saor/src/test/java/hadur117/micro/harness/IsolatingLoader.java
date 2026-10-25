package hadur117.micro.harness;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * Loads {@code hadur117.micro} classes afresh from the given class path, so each robot under
 * test starts with its own statics, as it would in a new battle; everything else (the
 * engine's API, the JDK) comes from the parent.
 */
public final class IsolatingLoader extends URLClassLoader {

    /**
     * A loader over these jars or class directories.
     *
     * @param urls where the robot's classes are
     */
    public IsolatingLoader(URL... urls) {
        super(urls, IsolatingLoader.class.getClassLoader());
    }

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        synchronized (getClassLoadingLock(name)) {
            if (!name.startsWith("hadur117.micro.") || name.startsWith("hadur117.micro.harness.")) {
                return super.loadClass(name, resolve);
            }
            Class<?> c = findLoadedClass(name);
            if (c == null) c = findClass(name);
            if (resolve) resolveClass(c);
            return c;
        }
    }
}
