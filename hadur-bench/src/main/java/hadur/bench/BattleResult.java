package hadur.bench;

import robocode.BattleResults;

/** One battle's outcome from Hadur's point of view, as a CSV row. */
public final class BattleResult {

    public static final String HEADER = "ok,rounds,score,theirScore,firsts,survival,theirSurvival,"
        + "bulletDamage,theirBulletDamage,skippedTurns,turns,turnP50Ms,turnP95Ms,turnMaxMs,"
        + "roundRecords,faults,faultRecords,ourHitRate,theirHitRate,"
        + "phantomWaves,enemyShots,unseenShots,inferredWaves,matchedWaves,radarReacquired,hiddenShots,"
        + "profileFound,memoryFailures,seedsEvicted,bulletsIntercepted,jitteredShots,shotsFired,"
        + "tiers,openingGun,gunSeed,surfSeed,seedDecays,"
        + "openingDistance,meanDistance,targetDistance,roundTicks,finishTicks,ramTicks,fullPowerShots,"
        + "maxLevel,slowTicks,shadowedWaves,interceptsShadowed,flavourChanges,flavourStep,errors,"
        + "duressTicks,engineDisables,securityErrors,rShortfall,finalRMissing";

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
    /** Aggressive (S5): opening distance, mean fighting distance, last target, mean round length, endgame ticks, full-power shots. */
    public String openingDistance = "-";
    public double meanDistance = Double.NaN, targetDistance = Double.NaN, roundTicks = Double.NaN;
    public int finishTicks, ramTicks, fullPowerShots;
    /** Unhittable (S6): highest computation level, slow ticks, shadowed waves, intercepts in a shadow, flavour changes and step. */
    public int maxLevel, slowTicks, shadowedWaves, interceptsShadowed, flavourChanges, flavourStep;
    public double score, theirScore, survival, theirSurvival, bulletDamage, theirBulletDamage;
    public double turnP50Ms, turnP95Ms, turnMaxMs;
    public String errors = "";
    /**
     * Trust signals (issue #117, G2). {@code duressTicks} is -1 on a row written before the
     * column existed, meaning unknown. {@code rShortfall} is rounds with no R record and
     * {@code finalRMissing} is 1 when the last round's record is the one that never arrived (G14).
     */
    public int duressTicks = -1, engineDisables, securityErrors, rShortfall, finalRMissing;

    /** Default ceiling on engine-announced skipped turns per round for a battle to count as trusted. */
    static final double DEFAULT_SKIPS_PER_ROUND = 2.0;

    /** The skips-per-round ceiling: {@code -Dhadur.bench.trust.skips=<n>} overrides {@link #DEFAULT_SKIPS_PER_ROUND}. */
    static double skipsPerRoundLimit() {
        String v = System.getProperty("hadur.bench.trust.skips");
        if (v == null) return DEFAULT_SKIPS_PER_ROUND;
        try {
            return Double.parseDouble(v);
        } catch (NumberFormatException e) {
            return DEFAULT_SKIPS_PER_ROUND;
        }
    }

    /**
     * A battle whose numbers measure the robot rather than the host: it finished, ran no
     * ticks in duress (unknown counts as none), skipped at most {@code skipsPerRound} turns a
     * round on average, and delivered an R record for every round.
     */
    boolean trusted(double skipsPerRound) {
        return ok && duressTicks <= 0 && roundRecords == rounds
            && skippedTurns <= skipsPerRound * rounds;
    }

    boolean trusted() { return trusted(skipsPerRoundLimit()); }

    /** The reasons {@link #trusted()} fails, as short words (empty when trusted). */
    java.util.List<String> untrustedReasons(double skipsPerRound) {
        java.util.List<String> why = new java.util.ArrayList<>();
        if (!ok) why.add("failed");
        if (duressTicks > 0) why.add("duress");
        if (roundRecords != rounds) why.add("R records");
        if (skippedTurns > skipsPerRound * rounds) why.add("skips");
        return why;
    }

    /** How many security-manager denials an engine error text holds (each reads "Preventing X from access"). */
    static int securityErrorCount(String errors) {
        int n = 0;
        for (int i = errors.indexOf("Preventing "); i >= 0; i = errors.indexOf("Preventing ", i + 1)) n++;
        return n;
    }

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
        r.openingDistance = h.openingDistance();
        r.meanDistance = h.meanDistance();
        r.targetDistance = h.targetDistance();
        r.roundTicks = h.roundTicks();
        r.finishTicks = h.finishTicks();
        r.ramTicks = h.ramTicks();
        r.fullPowerShots = h.fullPowerShots();
        r.maxLevel = h.maxLevel();
        r.slowTicks = h.slowTicks();
        r.shadowedWaves = h.shadowedWaves();
        r.interceptsShadowed = h.interceptsShadowed();
        r.flavourChanges = h.flavourChanges();
        r.flavourStep = h.flavourStep();
        r.errors = errors.trim();
        r.duressTicks = h.duressTicks();
        r.engineDisables = h.engineDisables();
        r.securityErrors = securityErrorCount(r.errors);
        r.rShortfall = Math.max(0, rounds - r.roundRecords);
        r.finalRMissing = h.finalRecordMissing(rounds) ? 1 : 0;
        return r;
    }

    static String failed(String why) {
        return "false,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,NaN,NaN,0,0,0,0,0,0,0,0,0,0,0,0,0,-,-,0,0,0,-,NaN,NaN,NaN,0,0,0,0,0,0,0,0,0," + sanitize(why) + ",0,0,0,0,0";
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
            sanitize(openingDistance), num(meanDistance), num(targetDistance), num(roundTicks),
            String.valueOf(finishTicks), String.valueOf(ramTicks), String.valueOf(fullPowerShots),
            String.valueOf(maxLevel), String.valueOf(slowTicks), String.valueOf(shadowedWaves),
            String.valueOf(interceptsShadowed), String.valueOf(flavourChanges),
            String.valueOf(flavourStep), sanitize(errors), String.valueOf(duressTicks),
            String.valueOf(engineDisables), String.valueOf(securityErrors),
            String.valueOf(rShortfall), String.valueOf(finalRMissing));
    }

    static BattleResult parse(String line) {
        String[] f = line.split(",", -1);
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
        r.openingDistance = f[37];
        r.meanDistance = Double.parseDouble(f[38]);
        r.targetDistance = Double.parseDouble(f[39]);
        r.roundTicks = Double.parseDouble(f[40]);
        r.finishTicks = Integer.parseInt(f[41]);
        r.ramTicks = Integer.parseInt(f[42]);
        r.fullPowerShots = Integer.parseInt(f[43]);
        r.maxLevel = Integer.parseInt(f[44]);
        r.slowTicks = Integer.parseInt(f[45]);
        r.shadowedWaves = Integer.parseInt(f[46]);
        r.interceptsShadowed = Integer.parseInt(f[47]);
        r.flavourChanges = Integer.parseInt(f[48]);
        r.flavourStep = Integer.parseInt(f[49]);
        r.errors = f.length > 50 ? f[50] : "";
        if (f.length >= 56) {
            r.duressTicks = Integer.parseInt(f[51]);
            r.engineDisables = Integer.parseInt(f[52]);
            r.securityErrors = Integer.parseInt(f[53]);
            r.rShortfall = Integer.parseInt(f[54]);
            r.finalRMissing = Integer.parseInt(f[55]);
        }
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
