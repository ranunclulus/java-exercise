package week4.day5;

import week4.day4.ReadFile;

import javax.sql.rowset.JoinRowSet;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
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

    // 한 줄만
    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);
        return hospital;
    }

    // 전체 데이터에 대해 돌리기
    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines) {
            hospitals.add(parse(line));
        }
        return hospitals;
    }

    public void printHospital(List<Hospital> hospitals) {
        for (Hospital hospital : hospitals){
            System.out.printf("%s %s %s\n", hospital.getName(), hospital.getWebsiteAdress(), hospital.getAddress());
        }
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx(Charset.forName("UTF-8"));
        List<String> strLines = rfe.getLines("hospital_info_0920_utf8.csv");
        List<Hospital> parseHospital = rfe.getHospitals(strLines);
        rfe.printHospital(parseHospital);

    }
}

