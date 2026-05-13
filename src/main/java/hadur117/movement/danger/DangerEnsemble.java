package hadur117.movement.danger;

import hadur117.movement.EnemyWave;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DangerEnsemble {
    private final List<DangerModel> models;

    public DangerEnsemble(List<DangerModel> models) {
        this.models = models;
    }

    public double blendedDanger(EnemyWave wave, int bin) {
        double totalWeight = 0;
        double totalDanger = 0;
        for (DangerModel m : models) {
            double w = m.getWeight();
            totalDanger += m.danger(wave, bin) * w;
            totalWeight += w;
        }
        return totalWeight > 0 ? totalDanger / totalWeight : 0;
    }

    public void logHitAll(EnemyWave wave, int bin) {
        for (DangerModel m : models) {
            m.logHit(wave, bin);
        }
    }

    public void decayAll(EnemyWave wave) {
        for (DangerModel m : models) {
            m.decay(wave);
        }
    }

    public Map<String, Double> getWeights() {
        Map<String, Double> weights = new LinkedHashMap<>();
        for (DangerModel m : models) {
            weights.put(m.name(), m.getWeight());
        }
        return weights;
    }

    public List<DangerModel> getModels() {
        return models;
    }
}
