package hadur.bench;

import java.time.ZoneId;
import java.util.zip.ZipEntry;

/**
 * BENCH-83's reproduction, run by {@link JdkWarmupTest} in a child JVM with the security manager
 * allowed: a security manager that, like Robocode's, refuses a thread named "robot" any read of a
 * {@code META-INF} file on the class path, then a "robot" thread that needs the time-zone rules (a
 * time zone and a zip entry's time, as pez.frankie.Frankie's saved movie does). The JDK swallows
 * the refusal and carries on, but Robocode has already logged it and punished the robot (it drains
 * the robot's energy), so the attempt itself is the failure. Exit 0 when the robot thread made no
 * such read, 3 when it tried. With the argument {@code warm}, {@link JdkWarmup#run()} runs first.
 */
public final class WarmupProbe {

    private WarmupProbe() {}

    @SuppressWarnings("removal")
    public static void main(String[] args) throws Exception {
        boolean warm = args.length > 0 && args[0].equals("warm");
        if (warm) JdkWarmup.run();
        String[] attempt = new String[1];
        System.setSecurityManager(new SecurityManager() {
            @Override
            public void checkRead(String file) {
                if ("robot".equals(Thread.currentThread().getName()) && file.contains("META-INF")) {
                    attempt[0] = file;
                    throw new SecurityException("Preventing robot from access: " + file);
                }
            }

            @Override
            public void checkPermission(java.security.Permission perm) {
                if (perm instanceof java.io.FilePermission && "read".equals(perm.getActions())) {
                    checkRead(perm.getName());
                }
            }
        });
        Throwable[] failure = new Throwable[1];
        Thread robot = new Thread(() -> {
            try {
                ZoneId.of("Europe/Paris").getRules();
                new ZipEntry("movie").setTime(System.currentTimeMillis());
            } catch (Throwable t) {
                failure[0] = t;
            }
        }, "robot");
        robot.start();
        robot.join();
        if (attempt[0] != null || failure[0] != null) {
            System.out.println("denied: " + attempt[0] + " " + failure[0]);
            System.exit(3);
        }
        System.out.println("ok");
        System.exit(0);
    }
}
