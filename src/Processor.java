public class Processor{
    private String brand;
    private String series;
    private int generation;
    private int cores;
    private int threads;
    private String cacheMemory;
    private String frequency;
    private String minFrequency;
    private String maxFrequency;

    public Processor(){
        this.brand = "Intel";
        this.series = "11000u";
        this.generation = 11;
        this.cores = 4;
        this.threads = 4;
        this.cacheMemory = "5MB";
        this.frequency = "2.5GHz";
        this.minFrequency = "2.4GHz";
        this.maxFrequency = "3.1GHz";
    }

    public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory, String frequency,String minFrequency, String maxFrequency){
        this.brand = brand;
        this.series = series;
        this.generation = generation;
        this.cores = cores;
        this.threads = threads;
        this.cacheMemory = cacheMemory;
        this.frequency = frequency;
        this.minFrequency = minFrequency;
        this.maxFrequency = maxFrequency;
    }
}