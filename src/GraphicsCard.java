

public class GraphicsCard{

    private String brand;
    private int series;
    private String memory;

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getSeries(){
        return series;
    }

    public void setSeries(int series){
        this.series = series;
    }

    public String getMemory(){
        return memory;
    }

    public void setMemory(String memory){
        this.memory = memory;
    }

    public GraphicsCard(){
        this.brand = "Nvidia";
        this.series = 3100;
        this.memory = "6GB";
    }

    public GraphicsCard(String brand, int series, String memory){
        this.brand = brand;
        this.series = series;
        this.memory = memory;
    }
}