public class Ram extends Processor{
    private int operationMemory;

    public Ram(int clockSpeed, int temperature, int operationMemory) {
        super(clockSpeed, temperature);
        this.operationMemory = operationMemory;
    }

    public int getOperationMemory() {
        return operationMemory;
    }

    public void setOperationMemory(int operationMemory) {
        this.operationMemory = operationMemory;
    }
    @Override
    public void addClockSpeed() {
        if (getClockSpeed()+setClockSpeed())
            return getTemperature(this) = getTemperature() + getTemperature() * 0.1;
    }else{
        return getTemperature(this);
    }
}

