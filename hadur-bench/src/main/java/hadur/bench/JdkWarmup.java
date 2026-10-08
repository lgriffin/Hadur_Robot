package hadur.bench;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.time.ZoneId;
import java.time.zone.ZoneRulesProvider;
import java.util.Date;
import java.util.Locale;
import java.util.zip.ZipEntry;

/**
 * BENCH-83: loads the JDK's lazily initialised providers in a battle child's own thread, before
 * any robot runs (issue #151).
 *
 * <p>The JDK finds some providers through {@link java.util.ServiceLoader} the first time they are
 * needed: the time-zone rules ({@link ZoneRulesProvider}, reached by {@link ZoneId} and by
 * {@link ZipEntry#setTime}) and the locale-sensitive formats. The lookup reads
 * {@code META-INF/services/...} from every class-path entry, and a directory entry is read as a
 * file. The bench's child class path starts with {@code hadur-bench/target/classes}, a directory,
 * so a robot that is the first to need one of these providers is denied the read by Robocode's
 * security manager ("You may only read files in your own root package directory"), and the
 * robot's thread dies. On the owner's Windows PC that crippled 11 opponents in every bench run
 * since 2026-10-06 (Frankie, VertiLeach, Princess, Chimera, XanderCat and others: 989 battles),
 * scoring them 15 to 28 points easier than they play live. A RoboRumble client never shows it:
 * its class path is jars only, and the client formats dates in its own thread first.</p>
 *
 * <p>Doing the same work here, in the runner's thread, makes each provider a loaded class
 * before the engine starts, so no robot ever triggers the lookup.</p>
 */
final class JdkWarmup {

    private JdkWarmup() {}

    /** Loads the providers; safe to call more than once. */
    static void run() {
        ZoneId.systemDefault().getRules();
        ZoneRulesProvider.getAvailableZoneIds();
        ZoneId.of("Europe/London").getRules();
        new ZipEntry("warmup").setTime(System.currentTimeMillis());
        DateFormat.getDateTimeInstance().format(new Date());
        new DecimalFormat("0.00").format(1.5);
        String.format(Locale.getDefault(), "%.2f %s", 1.5, new Date());
    }
}
