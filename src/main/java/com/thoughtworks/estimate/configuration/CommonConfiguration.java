package com.thoughtworks.estimate.configuration;

public class CommonConfiguration {

  public static final String PROJECT_SOURCE_PATH = "src";
  public static final String SRC_MAIN_RESOURCES_PATH = "src/main/resources/";
  private static final String WORK_DIRECTORY = "auto_estimate";

  private CommonConfiguration() {
  }

  public static String getWorkDirectory() {
    return WORK_DIRECTORY;
  }

  public static String getProjectSourcePath() {
    return PROJECT_SOURCE_PATH;
  }

  public static String getSrcMainResourcesPath() {
    return SRC_MAIN_RESOURCES_PATH;
  }
}
