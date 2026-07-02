package com.exercise;

public class MyService {
    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }
    
    public void pushData(String msg) {
        externalApi.sendData(msg);
    }
}
