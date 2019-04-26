package gateways;

import domain.TextFile;

public interface TextFilesService {

    TextFile download(String fileName);
}
