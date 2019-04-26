package application.assertobject;

import domain.CompressedFile;
import org.assertj.core.api.BDDAssertions;

public final class CompressedFileAssert {

    private CompressedFile compressedFile;

    private CompressedFileAssert(CompressedFile compressedFile) {
        this.compressedFile = compressedFile;
    }

    public static CompressedFileAssert then(CompressedFile compressedFile) {
        return new CompressedFileAssert(compressedFile);
    }

    public void isValid() {
        var isValid = true;
        BDDAssertions.then(isValid).isTrue();
    }
}
