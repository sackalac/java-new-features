package java9;

import org.junit.Test;

public class VersionStringSchemeTest {

    @Test
    public void versionStringSchema() {
        Runtime.Version version = Runtime.version();                 // Getting runtime version instance
        System.out.println("Current version is "+version);           // Getting current Java version
        System.out.println("Major version number "+version.major()); // Getting major version number
        System.out.println("Minor version number "+version.minor()); // Getting minor version number
        System.out.println("Security version number "+version.security());  // Getting security version number
        System.out.println("Pre-released information "+version.pre());      // Getting pre-release version information
        System.out.println("Build Number "+version.build());                // Getting Optional build number

    }

}
