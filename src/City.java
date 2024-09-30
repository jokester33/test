public class City {
    private  String name;
    private int carAcidents;
    private  int motorbikeAccidents;

    public  City(String name) {
        this.name = name;
    }
    public String getName(){

        return name;
    }
    public int getCarAcidents(){
        return carAcidents;
    }

    public int getMotorbikeAccidents() {
        return motorbikeAccidents;
    }

    public void setCarAcidents(int carAcidents) {
        this.carAcidents = carAcidents{
            this.carAcidents = carAcidents;

        }
        public void setMotorBikeAccidents(int motorbikeaccidents){
            this.motorbikeAccidents = motorbikeaccidents;
        }
        public int getTotalAccidents(){
            return carAcidents + motorbikeaccidents;
        }
    }
}
