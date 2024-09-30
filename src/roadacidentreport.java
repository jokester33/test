import java.util.Scanner;

public class roadacidentreport {

    private City[] cities;

    public roadacidentreport(City[] cities){
        this.cities = cities;
        }
        public void inputAccidentData(){
        Scanner scanner = new Scanner(System.in);
        for(City city: cities) {
            System.out.println("Enter accident data for : " + city.getName());

            System.out.println("Number of car accidents: ");
            int carAccidents = scanner.nextInt();
            city.setCarAcidents(carAccidents);
            System.out.println("Number of motorbike accidents: ");
            int motorBikeAccidents = scanner.nextInt();
            city.setMotorbikeAccidents(motorBikeAccidents);
        }
        }
        public void displayAccidentReort(){
        int maxAccident = 0;
        String cityWithMostAccidets = "";

        for (City city : cities){
            int totalAccidents = city.getTotalAccidents();
            System.out.printf("",city.getName(), city.getCarAcidents(), city.getMotorbikeAccidents(), totalAccidents;
            if(totalAccidents > maxAccident){
                maxAccident = totalAccidents;
                cityWithMostAccidets = city.getName();

            }
        }
            System.out.println("");
    }
}
