package Chap18;

public class PkgTest {
    public static void main(String[] args) {
        Package[] pkgs;

        pkgs = Package.getPackages();

        for (Package pkg : pkgs)
            System.out.println(
                    pkg.getName() + " "
                            + pkg.getImplementationTitle() + " "
                            + pkg.getImplementationVendor() + " "
                            + pkg.getImplementationVersion()
            );
    }
}
