package week4.day5;

import java.io.IOException;
import java.util.List;

public interface Reader {
    public List<String> getLines(String fileName) throws IOException;
}
