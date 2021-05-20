package com.learning.ReturnValue;

public class TaskResult<S, R> {

    private final S taskId;
    private final R sum;

    public TaskResult(S taskId, R sum) {
        this.taskId = taskId;
        this.sum = sum;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "~~~~~~~~" + taskId + " ->" + sum + "~~~~~~~~~~~~~";
    }

}
