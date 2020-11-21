package com.pozharsky.dmitri.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class IntegerReader {
    private static final Logger logger = LogManager.getLogger(IntegerReader.class);
    private static final String REG_COMMA = ",";

    public int[] readIntegers(String file) {
        File f = new File(file);
        String line;
        int[] resultArray = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
            while ((line = reader.readLine()) != null) {
                int[] intermediateArray = parseIntArray(line);
                if (resultArray == null) {
                    resultArray = intermediateArray;
                } else {
                    resultArray = Stream.of(resultArray, intermediateArray)
                            .flatMapToInt(Arrays::stream)
                            .toArray();
                }
            }
        } catch (FileNotFoundException e) {
            logger.error("File is not found: " + e);
        } catch (IOException e) {
            logger.error("Error of file: " + e);
        }
        return resultArray;
    }

    private int[] parseIntArray(String line) {
        String[] arrayString = line.split(REG_COMMA);
        int[] arrayInteger = Arrays.stream(arrayString)
                .mapToInt(e -> Integer.parseInt(e.trim()))
                .toArray();
        return arrayInteger;
    }
}
