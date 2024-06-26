

public class Laptop{
    private float screen;
    private Processor processor;
    private String ram;
    private String hardDrive;
    private GraphicsCard graphicsCard;
    private String opticalDrive;
    private String keyboard;

    public Laptop(){
        this.screen = 15.6f;
        this.processor = new Processor();
        this.ram = "16GB";
        this.hardDrive = "2TB";
        this.graphicsCard = new GraphicsCard();
        this.opticalDrive = "Multi layer";
        this.keyboard = "Backlit";
    }

    public Laptop(float screen, Processor processor,String ram, String hardDrive, GraphicsCard graphicsCard, String opticalDrive, String keyboard){
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.graphicsCard = graphicsCard;
        this.opticalDrive = opticalDrive;
        this.keyboard = keyboard;
    }

    public float getScreen(){
        return screen;
    }

    public void setScreen(float screen){
        this.screen = screen;
    }

    public Processor getProcessor(){
        return processor;
    }

    public void setProcessor(Processor processor){
        this.processor = processor;
    }

    public String getRam(){
        return ram;
    }

    public void setRam(String ram){
        this.ram = ram;
    }

    public String getHardDrive(){
        return hardDrive;
    }

    public void setHardDrive(String hardDrive){
        this.hardDrive = hardDrive;
    }

    public GraphicsCard graphicsCard(){
        return graphicsCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard){
        this.graphicsCard = graphicsCard;
    }

    public String getopticalDrive(){
        return opticalDrive;
    }

    public void setOptivalDrive(String opticalDrive){
        this.opticalDrive = opticalDrive;
    }

    public String getKeyboard(){
        return keyboard;
    }

    public void setKeyboard(){
        this.keyboard = keyboard;
    }

    public String toString(){
        return "Laptop {" +
            "screen = " + screen +
            ", processor = " + processor +
            ", ram = " + ram + "\'" +
            ", hardDrive = " + hardDrive + "\'" +
            ", graphicsCard = " + graphicsCard + "\'" +
            ", opticalDrive = " + opticalDrive + "\'" +
            ", keyboard = " + keyboard  + "\'" +
            "}";
    }
}