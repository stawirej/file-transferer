package infrastructure.fakes;

import domain.CompressedFile;
import gateways.CompressedFilesService;

public final class InMemoryCompressedFilesService implements CompressedFilesService {

    @Override
    public void upload(CompressedFile compressedFile) {
    }

    @Override
    public CompressedFile download(String fileName) {
        return null;
    }
}
