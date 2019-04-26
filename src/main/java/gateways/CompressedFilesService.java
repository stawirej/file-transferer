package gateways;

import domain.CompressedFile;

public interface CompressedFilesService {

    void upload(CompressedFile compressedFile);

    CompressedFile download(String fileName);
}
