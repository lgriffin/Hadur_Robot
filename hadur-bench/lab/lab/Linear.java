package lab;

/** Iterative linear prediction: constant speed and heading, walls clipped. */
public class Linear extends LabBase {
    protected double aim() { return lead(0); }
}
