package com.razacodes.CoronavirusTrackerIndia.Service;

import com.razacodes.CoronavirusTrackerIndia.models.LocationStats;

import java.io.IOException;
import java.util.List;

public interface CoronavirusDataService {
    public void fetchData() throws IOException, InterruptedException;
    public List<LocationStats> getAllStats();
}
