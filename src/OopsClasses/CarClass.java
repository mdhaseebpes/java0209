package OopsClasses;

public class CarClass {

    private int doors;
    private int wheels;
    private  String model;
    private String colour;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
       String validModel=  model.toLowerCase();
        if(model.equals("carrera") || model.equals("commodore")) {
            this.model = model;
        }else{
            this.model = "unknown";
        }
    }
}

