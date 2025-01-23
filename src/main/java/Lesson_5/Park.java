import java.util.ArrayList;

public class Park {
    private String name;
    private ArrayList<Attraction> attractions;


     */
    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    class Attraction {
        private String name;
        private String workingTime;
        private float cost;


        public Attraction(String name, String workingTime, float cost) {
            this.name = name;
            this.workingTime = workingTime;
            this.cost = cost;
        }


        public void displayInfo() {
            System.out.println("Attraction: " + name);
            System.out.println("Working Time: " + workingTime);
            System.out.println("Cost: " + cost);
        }
    }


    public void addAttraction(String name, String workingTime, float cost) {
        attractions.add(new Attraction(name, workingTime, cost));
    }

    public void displayAttractions() {
        for (Attraction attraction : attractions) {
            attraction.displayInfo();
            System.out.println("--------------------------------------");
        }
    }
}