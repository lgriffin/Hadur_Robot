package hadur117.movement.danger;

import hadur117.movement.EnemyWave;

public interface DangerModel {
    double danger(EnemyWave wave, int bin);
    void logHit(EnemyWave wave, int bin);
    void decay(EnemyWave wave);
    double getWeight();
    String name();
}
