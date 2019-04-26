package application;

import gateways.CompressedFilesService;
import gateways.TextFilesService;

final class FileTransferer {

    private final TextFilesService textFilesService;
    private final CompressedFilesService compressedFilesService;

    private FileTransferer(TextFilesService textFilesService, CompressedFilesService compressedFilesService) {
        this.textFilesService = textFilesService;
        this.compressedFilesService = compressedFilesService;
    }

    public static FileTransferer newInstance(TextFilesService textFilesService, CompressedFilesService compressedFilesService) {
        return new FileTransferer(textFilesService, compressedFilesService);
    }

    void transfer(String textFileName, String compressedFileName) {
    }
}
