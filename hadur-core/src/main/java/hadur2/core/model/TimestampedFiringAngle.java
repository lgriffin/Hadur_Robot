package hadur2.core.model;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

import java.awt.geom.Point2D;

public class TimestampedFiringAngle extends Timestamped {
    public final double guessFactor;
    public final Point2D.Double displacementVector;

    public TimestampedFiringAngle(int round, long time, double guessFactor,
                                  Point2D.Double displacementVector) {
        super(round, time);
        this.guessFactor = guessFactor;
        this.displacementVector = displacementVector;
    }
}
