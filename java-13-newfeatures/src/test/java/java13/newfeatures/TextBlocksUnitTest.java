package java13.newfeatures;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TextBlocksUnitTest {

    private static final String JSON_STRING = "{\r\n" + "\"name\" : \"QUANPRO\",\r\n" + "\"website\" : \"https://www.%s.com/\"\r\n" + "}";

    @SuppressWarnings("preview")
//    private static final String TEXT_BLOCK_JSON = """
//              <html>
//                  <body>
//                      <p>Hello, world</p>
//                  </body>
//              </html>
//              """;

    @Test
    public void whenTextBlocks_thenStringOperationsWork() {
//
//        assertThat(TEXT_BLOCK_JSON.contains("QUAN")).isTrue();
//        assertThat(TEXT_BLOCK_JSON.indexOf("www")).isGreaterThan(0);
//        assertThat(TEXT_BLOCK_JSON.length()).isGreaterThan(0);

    }

    @SuppressWarnings("removal")
    @Test
    public void whenTextBlocks_thenFormattedWorksAsFormat() {
//        assertThat(TEXT_BLOCK_JSON.formatted("quanpro")
//                .contains("www.quanpro.com")).isTrue();
//
//        assertThat(String.format(JSON_STRING, "quanpro")
//                .contains("www.quanpro.com")).isTrue();

    }
}
