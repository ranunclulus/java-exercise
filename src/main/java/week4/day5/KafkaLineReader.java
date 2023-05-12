package week4.day5;

import java.util.List;

public class KafkaLineReader implements Reader{
    private String kafkaUrl;

    public KafkaLineReader(String kafkaUrl) {
        this.kafkaUrl = kafkaUrl;
    }

    @Override
    public List<String> getLines(String fileName) {
        return null;
    }
}
