package IMC;

public class IMC {

    private double height;
    private double weight;

    public  IMC(){
    }

    /*
    *public int IMCweightInopunds(){
        return Math.divideExact(Math.multiplyExact(getWeight(), 703), (int) Math.pow(getHeight(), 2));
    }
     */

    public double IMCweightInKilograms(){
        return getWeight() / Math.pow(getHeight(), 2.0f);
    }

    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return  height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String BMIvalues(){

        String values;
        if (/*(IMCweightInopunds() < 18.5f) ||*/(IMCweightInKilograms() < 18.5f))
            values = "Underweight";
        else if ((/*(IMCweightInopunds() >= 18.5f) || */ (IMCweightInKilograms() >= 18.5f)) && (/*(IMCweightInopunds() < 24.9f) || */(IMCweightInKilograms() <= 24.9f)))
            values = "Normal";
        else if ((/*(IMCweightInopunds() >= 25.0f) || */(IMCweightInKilograms() >= 25.0f)) && (/*(IMCweightInopunds() < 29.9f) ||*/ (IMCweightInKilograms() <= 29.9f)))
            values = "Overweight";
        else
            values = "Obese";

        return values;
    }
}
