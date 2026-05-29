public class ReaderFile {

    protected FileStrategy  strategy;


    public void setStrategy(FileStrategy strategy) {
        this.strategy = strategy;
    }

    public void  parse(String path){
        strategy.Parse(path);
    }
}
