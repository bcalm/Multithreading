package com.learning.ReturnValue;

public class SumObserver implements ResultNotifier<Integer> {

    private String taskId;

    public SumObserver(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public void notifyResult(Integer result) {
        System.out.println("Result for task id" + taskId + " = " + result);
    }
}
