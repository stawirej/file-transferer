package integration;

import application.FileTransfererConfiguration;
import infrastructure.production.ProductionCompressedFilesService;
import infrastructure.production.ProductionTextFilesService;
import org.junit.jupiter.api.BeforeEach;

final class FileTransfererScenarios extends application.FileTransfererScenarios {

    @BeforeEach
    void beforeEach() {
        textFilesService = new ProductionTextFilesService();
        compressedFilesService = new ProductionCompressedFilesService();
        fileTransferer = FileTransfererConfiguration.fileTransferer(textFilesService, compressedFilesService);
    }
}
