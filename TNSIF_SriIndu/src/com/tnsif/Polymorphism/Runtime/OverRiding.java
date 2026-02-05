package com.tnsif.Polymorphism.Runtime;

class Bank {
    float getRateOfInterest() {
        return 0;
    }
}
class SBI extends Bank {
    @Override
    float getRateOfInterest() {
        return 8.4f;
    }
}
class ICICI extends Bank {
    @Override
    float getRateOfInterest() {
        return 7.3f;
    }
}
class AXIS extends Bank {
    @Override
    float getRateOfInterest() {
        return 9.7f;
    }
}
