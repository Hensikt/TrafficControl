public class TrafficLight {

    private int id;
    private int numberOfLights;
    private int standartColor;

    public TrafficLight() {
        id = 0;
        numberOfLights = 3;
        standartColor = 1;
    }

/** Counts all the lights **/
    public TrafficLight(int id, int numberOfLights) {
        this.id = id;
        this.numberOfLights = numberOfLights;
    }

/** shows the color that is selected **/
    public String showColor(int light) {

        String result;
        switch (light) {
            case 1:
                System.out.println("Red");
                result = "Red";
                break;
            case 2:
                System.out.println("Orange");
                result = "Orange";
                break;
            case 3:
                System.out.println("Green");
                result = "Green";
                break;
            default:
                System.out.println("Red");
                result = "red";
                break;
        }
        return result;
    }

/** shows the Id that is  **/
    public int showId() {
       return id;
    }

/** shows the color and Id in a string **/
    public void showColorAndId(int light) {
        String result;
        result = showColor(light);

        System.out.println("My color is "
                + result
                + " and my id is: "
                + showId()
        );
    }

/** checks if the number is positive or not **/
    public boolean isPositiveNumber(int number) {
        return number >= 0;
    }

    public int getNumberOfLights() {
        return numberOfLights;
    }

    public void setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
    }

    public int getStandartColor() {
        return standartColor;
    }

    public void setStandartColor(int standartColor) {
        this.standartColor = standartColor;
    }
}
