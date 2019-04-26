package application;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import application.assertobject.CompressedFileAssert;
import domain.exceptions.TransferFailed;
import gateways.CompressedFilesService;
import gateways.TextFilesService;
import infrastructure.fakes.InMemoryCompressedFilesService;
import infrastructure.fakes.InMemoryTextFileService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileTransfererScenarios {

    protected FileTransferer fileTransferer;
    protected TextFilesService textFilesService;
    protected CompressedFilesService compressedFilesService;

    @BeforeEach
    void beforeEach() {
        textFilesService = new InMemoryTextFileService();
        compressedFilesService = new InMemoryCompressedFilesService();
        fileTransferer = FileTransfererConfiguration.fileTransferer(textFilesService, compressedFilesService);
    }

    @Test
    void transferFile() {
        // When
        fileTransferer.transfer("textFileName.txt", "compressedFileName.zip");

        // Then
        var storedFile = compressedFilesService.download("compressedFileName.zip");
        CompressedFileAssert.then(storedFile).isValid();
    }

    @Test
    void reportErrorOnTransferFailure() {
        assertThatThrownBy(() -> fileTransferer.transfer("textFileName.txt", "transferFailed.zip"))
            .isInstanceOf(TransferFailed.class);
    }
}
