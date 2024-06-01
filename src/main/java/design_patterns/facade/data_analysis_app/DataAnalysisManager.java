package main.java.design_patterns.facade.data_analysis_app;

import main.java.design_patterns.facade.data_analysis_app.models.*;
import main.java.design_patterns.facade.data_analysis_app.services.AnalysisAlgorithmService;
import main.java.design_patterns.facade.data_analysis_app.services.DataCollectionService;
import main.java.design_patterns.facade.data_analysis_app.services.DataPreprocessingService;
import main.java.design_patterns.facade.data_analysis_app.services.VisualizationService;

public class DataAnalysisManager {

    private DataAnalysisProcessor dataAnalysisProcessor;

    public DataAnalysisManager(DataCollectionService dataCollectionService,
                               DataPreprocessingService dataPreprocessingService,
                               AnalysisAlgorithmService analysisAlgorithmService,
                               VisualizationService visualizationService) {
        this.dataAnalysisProcessor = new DataAnalysisProcessor(dataCollectionService, dataPreprocessingService, analysisAlgorithmService, visualizationService);
    }

    public AnalysisResult performFullAnalysis(DataCollectionParams collectionParams,
                                              PreprocessingOptions preprocessingOptions,
                                              AnalysisAlgorithmConfig algorithmConfig) {
        return dataAnalysisProcessor.process(collectionParams, preprocessingOptions, algorithmConfig);
    }

}
