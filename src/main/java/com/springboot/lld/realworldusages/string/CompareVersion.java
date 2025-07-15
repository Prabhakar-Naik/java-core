package com.springboot.lld.realworldusages.string;

/**
 * @author prabhakar, @Date 09-07-2025
 */

public class CompareVersion {

    private static final String EXTRACT_VERSION_REGEX = ".*?((?<!\\w)\\d+([.-]\\d+)*).*";

    /**
     * Compares two version strings.
     * Credits: https://stackoverflow.com/a/6702000/6645088 and https://stackoverflow.com/a/44592696/6645088
     *
     * @param version1 the first version string to compare
     * @param version2 the second version string to compare
     * @return the value {@code 0} if the two strings represent same versions;
     * a value less than {@code 0} if {@code v1} is greater than {@code v2}; and
     * a value greater than {@code 0} if {@code v2} is greater than {@code v1}
     */

    public static int compareVersion(String version1, String version2) {
        var components1 = getVersionComponents(version1);
        var components2 = getVersionComponents(version2);

        int length = Math.min(components1.length, components2.length);
        for (int i = 0; i < length; i++) {
            Integer c1 = i < components1.length ? Integer.parseInt(components1[i]) : 0;
            Integer c2 = i < components2.length ? Integer.parseInt(components2[i]) : 0;
            int result = c1.compareTo(c2);
            if (result != 0) return result;
        }
        return 0;
    }

    private static String[] getVersionComponents(String version) {
        return version.replaceAll(EXTRACT_VERSION_REGEX, "$1").split("\\.");
    }


    /*
     * Tests for {@link CompareVersionSnippet#compareVersion(String, String)}.
     */

    /*
    public void testCompareVersion() {
        assertEquals(0, CompareVersion.compareVersion("awesome-app-2.3.4-SNAPSHOT", "2.3.4"));
        assertEquals(0, CompareVersion.compareVersion("2.3.4-SNAPSHOT", "2.3.4"));
        assertEquals(1, CompareVersion.compareVersion("2.3.4.1-SNAPSHOT", "2.3.4"));
        assertEquals(0, CompareVersion.compareVersion("2.03.4", "2.3.4"));
        assertEquals(-1, CompareVersion.compareVersion("2.03.4", "2.3.4.1"));
        assertEquals(-1, CompareVersion.compareVersion("2.3.4", "2.30.4"));
        assertEquals(0, CompareVersion.compareVersion("2.3.0", "2.3"));
        assertEquals(1, CompareVersion.compareVersion("2.3.3", "2.3"));

        // Test for sorting versions
        List<String> versions = Arrays.asList(
                "2.3.4.1",
                "2.3.5-beta2",
                "2.3.4.RELEASE",
                "awesome-app-2.2",
                "2.3.2-SNAPSHOT",
                "2.2.1"
        );

        List<String> expectedSortedVersion = Arrays.asList(
                "awesome-app-2.2",
                "2.2.1",
                "2.3.2-SNAPSHOT",
                "2.3.4.RELEASE",
                "2.3.4.1",
                "2.3.5-beta2"
        );

        String oldestVersion = versions.stream().min(CompareVersion::compareVersion).get();
        assertEquals("awesome-app-2.2", oldestVersion);

        String newestVersion = versions.stream().max(CompareVersion::compareVersion).get();
        assertEquals("2.3.5-beta2", newestVersion);

        assertArrayEquals(expectedSortedVersion.toArray(),
                versions.stream().sorted(CompareVersion::compareVersion).toArray());
    }
    */
}
