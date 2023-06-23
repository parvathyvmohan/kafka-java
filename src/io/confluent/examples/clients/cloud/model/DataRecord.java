package io.confluent.examples.clients.cloud.model;

import com.google.gson.Gson;

public class DataRecord {
    Long count;

    public DataRecord() {
    }

    public DataRecord(Long count) {
        this.count = count;
    }

    public Long getCount() {
        return count;
    }

    public String toString() {
        return new Gson().toJson(this);
    }

}
