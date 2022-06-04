package MyPatterns.creational.Builder;

public class InterpriseWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Banking");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(12500);
    }
}
