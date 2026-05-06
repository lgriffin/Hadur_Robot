package hadur117.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OpponentData {
    public String name;
    public MovementType movementType = MovementType.UNKNOWN;
    public String gunType = "UNKNOWN";
    public double threatLevel = 0.5;

    public double x, y;
    public double heading, velocity;
    public double energy = 100;
    public long lastScanTick = -1;

    public double lastEnergy = -1;
    public int fireCount = 0;
    public double totalBulletPower = 0;
    public final List<Long> fireTicks = new ArrayList<>();

    public double damageDealt = 0;
    public double damageReceived = 0;
    public int hitsOnUs = 0;

    public final LinkedList<Snapshot> window = new LinkedList<>();

    public OpponentData(String name) {
        this.name = name;
    }
}
