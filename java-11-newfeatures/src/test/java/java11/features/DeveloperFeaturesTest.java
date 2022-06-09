package java11.features;

import lombok.NonNull;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;


public class DeveloperFeaturesTest {
    String tempDir = "D:/Project/java-11-newfeatures/src/main/resources";

    // Example 1
    // New String Methods
    @Test
    public void newStringMethod() {
        String multilineString = "QUAN helps \n \n developers \n explore Java.";
        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());
        System.out.println(lines.contains("QUAN helps"));
    }

    // Example 2
    // New File Methods
    @Test
    public void newFileMethods() throws IOException {

        Path filePath = Files.writeString(Files.createTempFile(Path.of(tempDir), "demo", ".txt"), "Sample text");
        String fileContent = Files.readString(filePath);
        System.out.println(fileContent.equals("Sample text"));
    }

    // Example 3
    // Collection to an Array
    @Test
    public void collectionToAnArray() {
        List sampleList = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = (String[]) sampleList.toArray(String[]::new);
        assertThat(sampleArray).containsExactly("Java", "Kotlin");
    }

    // Example 4
    // Local-Variable Syntax for Lambda
    @Test
    public void givenSampleList_whenConvertingToUppercaseString_thenUppercaseIsReturned() {
        List<String> sampleList = Arrays.asList("Java", "Kotlin");
        String resultString = sampleList.stream()
                .map((@NonNull var x) -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        assertThat(resultString).isEqualTo("JAVA, KOTLIN");
    }

    // Example 5
    // The Not Predicate Method
    @Test
    public void givenSampleList_whenExtractingNonBlankValues_thenOnlyNonBlanksAreReturned() {
        List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
        List<String> withoutBlanks = sampleList.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());
        assertThat(withoutBlanks).containsExactly("Java", "Kotlin");
    }
}
