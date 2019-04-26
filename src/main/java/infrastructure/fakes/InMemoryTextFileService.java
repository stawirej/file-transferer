package infrastructure.fakes;

import domain.TextFile;
import gateways.TextFilesService;

public final class InMemoryTextFileService implements TextFilesService {

    @Override
    public TextFile download(String fileName) {
        return null;
    }
}
