package s3.sensor_factory.implementare;

public class GPSSensor implements IDroneSensor
{
    private boolean isActive;
    private String tip;

    GPSSensor(boolean isActive, String tip) {
        this.isActive = isActive;
        this.tip = tip;
    }

    @Override
    public void start() {
        this.isActive=true;
    }

    @Override
    public void stop() {
        this.isActive=false;
    }

    @Override
    public String getSensorType() {
        return this.tip;
    }
}
