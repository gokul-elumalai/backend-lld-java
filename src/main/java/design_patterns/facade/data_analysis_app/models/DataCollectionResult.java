package main.java.design_patterns.facade.data_analysis_app.models;

import java.util.ArrayList;
import java.util.List;

public class DataCollectionResult {
    private List<Object> data = new ArrayList<>();
    public List<Object> getData() {
        return data;
    }
}