public class Processor {
    private double ClockSpeed;
    private double temperature;

    public Processor(double clockSpeed,double temperature) {
        ClockSpeed = clockSpeed;
        this.temperature = temperature;
    }

    public double getClockSpeed() {
        return ClockSpeed;
    }

    public void setClockSpeed(double clockSpeed) {
        ClockSpeed = clockSpeed;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    @Override
    public void addClockSpeed() {
        if (getClockSpeed()+setClockSpeed())
            return getTemperature(this) = getTemperature() + getTemperature() * 0.1;
    }else{
        return getTemperature(this);
    }
}
