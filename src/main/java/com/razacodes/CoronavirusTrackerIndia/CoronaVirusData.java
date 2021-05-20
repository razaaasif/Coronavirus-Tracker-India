package com.razacodes.CoronavirusTrackerIndia;

import com.razacodes.CoronavirusTrackerIndia.Service.CoronavirusDataService;
import com.razacodes.CoronavirusTrackerIndia.models.LocationStats;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Service
public class CoronaVirusData implements CoronavirusDataService {
    private static String CSV_DATA_URL ="https://api.covid19india.org/csv/latest/state_wise.csv";
    private List<LocationStats> allStats = new ArrayList<>();
    @Override
    @PostConstruct
    public void fetchData() throws IOException, InterruptedException {
        List<LocationStats> newStats = new ArrayList<>();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(CSV_DATA_URL))
                .build();

        HttpResponse<String> response =client.send(request, HttpResponse.BodyHandlers.ofString());


        //reading from csv file
        StringReader csvReader = new StringReader(response.body());
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvReader);
        for (CSVRecord record : records) {
            LocationStats locationStats = new LocationStats();
            locationStats.setState(record.get("State"));
            locationStats.setConfirmed(record.get("Confirmed"));
            locationStats.setRecovered(record.get("Recovered"));
            locationStats.setDeaths(record.get("Deaths"));
            locationStats.setActive(record.get("Active"));
            locationStats.setState_code(record.get("State_code"));
            newStats.add(locationStats);
        }
        this.allStats = newStats;
    }
    @Override
    public List<LocationStats> getAllStats() {
        return this.allStats;
    }
}
