package main.java.design_patterns.facade.data_analysis_app.services;

import main.java.design_patterns.facade.data_analysis_app.models.PreprocessedData;
import main.java.design_patterns.facade.data_analysis_app.models.PreprocessingOptions;

import java.util.List;

public class DataPreprocessingService {

    public PreprocessedData preprocessData(List<Object> rawData, PreprocessingOptions preprocessingOptions) {
        // Simulate data preprocessing process
        return new PreprocessedData();
    }
}
