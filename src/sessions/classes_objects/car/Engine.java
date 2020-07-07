package sessions.classes_objects.car;

public class Engine {
    private double engineHorsPower;
    private int engineCylinder;
    private String engineType;

    public Engine(double engineHorsPower, int engineCylinder, String engineType) {
        this.engineHorsPower = engineHorsPower;
        this.engineCylinder = engineCylinder;
        this.engineType = engineType;
    }

    public double getEngineHorsPower() {
        return engineHorsPower;
    }

    public void setEngineHorsPower(double engineHorsPower) {
        this.engineHorsPower = engineHorsPower;
    }

    public int getEngineCylinder() {
        return engineCylinder;
    }

    public void setEngineCylinder(int engineCylinder) {
        this.engineCylinder = engineCylinder;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}


