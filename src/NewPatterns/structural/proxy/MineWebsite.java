package NewPatterns.structural.proxy;

public class MineWebsite implements Website{
    private String url;

    public MineWebsite(String url) {
        this.url = url;
        createMineSite();
    }

    private void createMineSite(){
        System.out.println("Create Mine site");
    }

    @Override
    public void load() {
        System.out.println("Load mine site");
    }
}
