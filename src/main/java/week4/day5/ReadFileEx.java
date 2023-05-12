package week4.day5;

import week4.day4.ReadFile;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx implements Reader{
    Reader lineReader;
    Charset charset;

    public ReadFileEx(Charset charset) {
        this.charset = charset;
    }

    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        BufferedReader br = new BufferedReader(new FileReader(fileName, charset));

        // BufferedReader에서 loop으로 한줄씩 불러오기
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }

    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        System.out.println(Arrays.toString(splitted));
        Address address = new Address("", "");
        Hospital hospital = new Hospital("", "", address);
        return hospital;
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx(Charset.forName("UTF-8"));
        List<String> result = rfe.getLines("hospital_info_0920_utf8.csv");
        for (int i = 0; i < 10; i++) {
            rfe.parse(result.get(i));
        }
    }
}

