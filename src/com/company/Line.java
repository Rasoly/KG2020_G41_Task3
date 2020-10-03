package com.company;

public class Line {
    private final RealPoint p1, p2;

    public Line(RealPoint p1, RealPoint p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public RealPoint getP1() {
        return p1;
    }

    public RealPoint getP2() {
        return p2;
    }
}
