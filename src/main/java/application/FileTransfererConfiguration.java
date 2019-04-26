package application;

import gateways.CompressedFilesService;
import gateways.TextFilesService;

public final class FileTransfererConfiguration {

    public static FileTransferer fileTransferer(TextFilesService inputService, CompressedFilesService outputService) {
        return FileTransferer.newInstance(inputService, outputService);
    }
}
