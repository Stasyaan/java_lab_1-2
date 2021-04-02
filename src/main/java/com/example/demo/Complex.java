package com.example.demo;

public class Complex {

    public double real;
    public double imaginary;
    public double magnitude;
    public double phase;

    public Complex(double _real, double _imaginary) {
        this.real = _real;
        this.imaginary = _imaginary;
    }

    public void calcPhase() {
        this.phase = Math.atan(real/imaginary);
    }

    public void calcMagnitude() {
        this.magnitude = Math.sqrt(real*real + imaginary*imaginary);
    }
    public boolean check() {
        return real < 100 && imaginary < 100;
    }
}