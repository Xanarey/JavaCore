package MyPatterns.creational.Builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("VisitCard");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESKO);
    }

    @Override
    void buildPrice() {
        website.setPrice(5000);
    }
}
