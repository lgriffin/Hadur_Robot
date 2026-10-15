package lab;

/** Iterative circular prediction: constant speed and turn rate (last tick's), walls clipped. */
public class Circular extends LabBase {
    protected double aim() { return lead(eTurn); }
}
