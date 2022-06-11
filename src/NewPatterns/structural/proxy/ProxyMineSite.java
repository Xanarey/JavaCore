package NewPatterns.structural.proxy;

public class ProxyMineSite implements Website{
    private final String url;
    private MineWebsite mineWebsite;

    public ProxyMineSite(String url) {
        this.url = url;
    }

    @Override
    public void load() {
        if (mineWebsite == null){
            mineWebsite = new MineWebsite(url);
        }
        mineWebsite.load();
    }
}
