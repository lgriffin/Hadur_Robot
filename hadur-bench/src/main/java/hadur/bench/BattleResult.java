package hadur.bench;

import robocode.BattleResults;

/** One battle's outcome from Hadur's point of view, as a CSV row. */
public final class BattleResult {

    public static final String HEADER = "ok,rounds,score,theirScore,firsts,survival,theirSurvival,"
        + "bulletDamage,theirBulletDamage,skippedTurns,turns,turnP50Ms,turnP95Ms,turnMaxMs,"
        + "roundRecords,faults,faultRecords,ourHitRate,theirHitRate,"
        + "phantomWaves,enemyShots,unseenShots,inferredWaves,matchedWaves,radarReacquired,hiddenShots,"
        + "profileFound,memoryFailures,seedsEvicted,bulletsIntercepted,jitteredShots,shotsFired,"
        + "tiers,openingGun,gunSeed,surfSeed,seedDecays,errors";

    public boolean ok;
    public int rounds, firsts, skippedTurns, turns;
    /** From Hadur's own telemetry (RES-5). Hit rates are NaN when no R record was seen. */
    public int roundRecords, faults, faultRecords;
    public double ourHitRate = Double.NaN, theirHitRate = Double.NaN;
    /** Wave fidelity (S2): ledger phantoms, real enemy shots a scan could reveal, unseen shots, inferred waves, and matches. */
    public int phantomWaves, enemyShots, unseenShots, inferredWaves, matchedWaves;
    /** Radar reacquire ticks (RADAR-1) and hidden shots (WAVE-1), from Hadur's R records. */
    public int radarReacquired, hiddenShots;
    /** Opponent memory (S3): profile found at the first scan (0/1), MEM failure records, seed evictions. */
    public int profileFound, memoryFailures, seedsEvicted;
    /** Our bullets shot down, shots fired with the anti-shield offset, and all our shots (SHIELD-1, SHIELD-2). */
    public int bulletsIntercepted, jitteredShots, shotsFired;
    /** Recognise and adapt (S4): tiers and seed sizes at the first scan, the opening gun, seed decays. */
    public String tiers = "-", openingGun = "-";
    public int gunSeed, surfSeed, seedDecays;
    public double score, theirScore, survival, theirSurvival, bulletDamage, theirBulletDamage;
    public double turnP50Ms, turnP95Ms, turnMaxMs;
    public String errors = "";

    static BattleResult of(BattleResults us, BattleResults them, int rounds,
                           LogHarvester h, String errors) {
        BattleResult r = new BattleResult();
        r.ok = true;
        r.rounds = rounds;
        r.score = us.getScore();
        r.theirScore = them.getScore();
        r.firsts = us.getFirsts();
        r.survival = us.getSurvival();
        r.theirSurvival = them.getSurvival();
        r.bulletDamage = us.getBulletDamage();
        r.theirBulletDamage = them.getBulletDamage();
        r.skippedTurns = h.skippedTurns();
        r.turns = h.turns();
        r.turnP50Ms = h.turnMillisPercentile(0.50);
        r.turnP95Ms = h.turnMillisPercentile(0.95);
        r.turnMaxMs = h.turnMillisPercentile(1.0);
        r.roundRecords = h.roundRecords();
        r.faults = h.faults();
        r.faultRecords = h.faultRecords();
        r.ourHitRate = h.ourHitRate();
        r.theirHitRate = h.theirHitRate();
        r.phantomWaves = h.phantomWaves();
        r.enemyShots = h.enemyShots();
        r.unseenShots = h.unseenShots();
        r.inferredWaves = h.inferredWaves();
        r.matchedWaves = h.matchedWaves();
        r.radarReacquired = h.radarReacquired();
        r.hiddenShots = h.hiddenShots();
        r.profileFound = h.profileFound();
        r.memoryFailures = h.memoryFailures();
        r.seedsEvicted = h.seedsEvicted();
        r.bulletsIntercepted = h.bulletsIntercepted();
        r.jitteredShots = h.jitteredShots();
        r.shotsFired = h.shotsFired();
        r.tiers = h.tiers();
        r.openingGun = h.openingGun();
        r.gunSeed = h.gunSeed();
        r.surfSeed = h.surfSeed();
        r.seedDecays = h.seedDecays();
        r.errors = errors.trim();
        return r;
    }

    static String failed(String why) {
        return "false,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,NaN,NaN,0,0,0,0,0,0,0,0,0,0,0,0,0,-,-,0,0,0," + sanitize(why);
    }

    String toCsv() {
        return String.join(",", String.valueOf(ok), String.valueOf(rounds), num(score),
            num(theirScore), String.valueOf(firsts), num(survival), num(theirSurvival),
            num(bulletDamage), num(theirBulletDamage), String.valueOf(skippedTurns),
            String.valueOf(turns), num(turnP50Ms), num(turnP95Ms), num(turnMaxMs),
            String.valueOf(roundRecords), String.valueOf(faults), String.valueOf(faultRecords),
            num(ourHitRate), num(theirHitRate), String.valueOf(phantomWaves),
            String.valueOf(enemyShots), String.valueOf(unseenShots),
            String.valueOf(inferredWaves),
            String.valueOf(matchedWaves), String.valueOf(radarReacquired),
            String.valueOf(hiddenShots), String.valueOf(profileFound),
            String.valueOf(memoryFailures), String.valueOf(seedsEvicted),
            String.valueOf(bulletsIntercepted), String.valueOf(jitteredShots),
            String.valueOf(shotsFired), sanitize(tiers), sanitize(openingGun),
            String.valueOf(gunSeed), String.valueOf(surfSeed), String.valueOf(seedDecays),
            sanitize(errors));
    }

    static BattleResult parse(String line) {
        String[] f = line.split(",", 38);
        BattleResult r = new BattleResult();
        r.ok = Boolean.parseBoolean(f[0]);
        r.rounds = Integer.parseInt(f[1]);
        r.score = Double.parseDouble(f[2]);
        r.theirScore = Double.parseDouble(f[3]);
        r.firsts = Integer.parseInt(f[4]);
        r.survival = Double.parseDouble(f[5]);
        r.theirSurvival = Double.parseDouble(f[6]);
        r.bulletDamage = Double.parseDouble(f[7]);
        r.theirBulletDamage = Double.parseDouble(f[8]);
        r.skippedTurns = Integer.parseInt(f[9]);
        r.turns = Integer.parseInt(f[10]);
        r.turnP50Ms = Double.parseDouble(f[11]);
        r.turnP95Ms = Double.parseDouble(f[12]);
        r.turnMaxMs = Double.parseDouble(f[13]);
        r.roundRecords = Integer.parseInt(f[14]);
        r.faults = Integer.parseInt(f[15]);
        r.faultRecords = Integer.parseInt(f[16]);
        r.ourHitRate = Double.parseDouble(f[17]);
        r.theirHitRate = Double.parseDouble(f[18]);
        r.phantomWaves = Integer.parseInt(f[19]);
        r.enemyShots = Integer.parseInt(f[20]);
        r.unseenShots = Integer.parseInt(f[21]);
        r.inferredWaves = Integer.parseInt(f[22]);
        r.matchedWaves = Integer.parseInt(f[23]);
        r.radarReacquired = Integer.parseInt(f[24]);
        r.hiddenShots = Integer.parseInt(f[25]);
        r.profileFound = Integer.parseInt(f[26]);
        r.memoryFailures = Integer.parseInt(f[27]);
        r.seedsEvicted = Integer.parseInt(f[28]);
        r.bulletsIntercepted = Integer.parseInt(f[29]);
        r.jitteredShots = Integer.parseInt(f[30]);
        r.shotsFired = Integer.parseInt(f[31]);
        r.tiers = f[32];
        r.openingGun = f[33];
        r.gunSeed = Integer.parseInt(f[34]);
        r.surfSeed = Integer.parseInt(f[35]);
        r.seedDecays = Integer.parseInt(f[36]);
        r.errors = f.length > 37 ? f[37] : "";
        return r;
    }

    double scoreShare() { return share(score, theirScore); }
    double survivalShare() { return share(survival, theirSurvival); }
    double bulletDamageShare() { return share(bulletDamage, theirBulletDamage); }

    private static double share(double a, double b) {
        return a + b == 0 ? 0.5 : a / (a + b);
    }

    private static String num(double d) {
        return String.format(java.util.Locale.ROOT, "%.3f", d);
    }

    private static String sanitize(String s) {
        return s.replace(',', ';').replace('\n', ' ');
    }
}
