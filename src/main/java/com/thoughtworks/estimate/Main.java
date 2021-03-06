package com.thoughtworks.estimate;


import com.thoughtworks.estimate.dto.Trainee;
import com.thoughtworks.estimate.utils.FileUtils;
import com.thoughtworks.estimate.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

  public static void main(String[] args) {
    final Trainee[] trainees = JsonUtils
        .read(FileUtils.readFile("src/main/resources/trainees.json"), Trainee[].class);
    Estimater estimater = new Estimater();
    System.out.println(JsonUtils.toJson(estimater.batchEstimate(trainees)));
  }
}
