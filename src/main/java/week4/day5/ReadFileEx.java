package week4.day5;

import week4.day4.ReadFile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx implements Reader{
    public List<String> getLines(String fileName) {
        List<String> lines = new LinkedList<>();

        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(fileName), StandardCharsets.UTF_8)) {

            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx();
        List<String> result = rfe.getLines("hospital_info_0920_utf8.csv");
        System.out.println(result.get(0));
    }
}

