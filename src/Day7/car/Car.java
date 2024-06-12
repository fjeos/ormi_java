package Day7.car;

public class Car {
    protected String company = "weniv";
    private int speed;
    private int gear;

    private String wheel;
    private int cc;
    private String logo;
    private String engine;
    private boolean stop;

    /*public Car(int gear) {
        this.gear = gear;
    }*/

    public boolean isStop() {
        return stop;
    }

    public String getCompany() {
        return company;
    }

    public int getGear() {
        return gear;
    }

    public String getWheel() {
        return wheel;
    }

    public int getCc() {
        return cc;
    }

    public String getLogo() {
        return logo;
    }

    public String getEngine() {
        return engine;
    }

    public double getSpeed(){
        return this.speed * 1.6;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setSpeed(int speed) {
        this.speed = speed < 0 ? 0 : speed;

        if (speed <= 30) {
            this.gear = 1;
        } else if (speed <= 70) {
            this.gear = 2;
        } else {
            this.gear = 3;
        }
    }

    public void checkSpeed() {
        System.out.println(this.speed);
    }

    public void checkGear() {
        System.out.println(this.gear + "단");
    }


}
