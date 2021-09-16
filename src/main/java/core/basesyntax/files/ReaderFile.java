package core.basesyntax.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class ReaderFile implements Reader {
    private String readFilePath;

    public ReaderFile(String readFilePath) {
        this.readFilePath = readFilePath;
    }

    @Override
    public List<String> read() {
        try {
            return Files.lines(Path.of(readFilePath))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("Can't read from " + readFilePath);
        }
    }
}