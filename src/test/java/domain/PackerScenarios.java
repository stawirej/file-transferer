package domain;

import static org.assertj.core.api.BDDAssertions.then;

import org.junit.jupiter.api.Test;

final class PackerScenarios {

    @Test
    void packTextFile() {
        // Given
        var textFile = new TextFile();
        var expectedCompressedFile = new CompressedFile();

        // When
        CompressedFile compressedFile = Packer.compress(textFile);

        // Then
        then(compressedFile).isEqualTo(expectedCompressedFile);
    }
}
